package xsna;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.Artist;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.lvx;
import xsna.tlo0;

/* compiled from: MusicArtistSelector.kt */
/* loaded from: classes3.dex */
public final class la40 implements lvx.a<Artist> {
    public final /* synthetic */ ka40 a;

    public la40(ka40 ka40Var) {
        this.a = ka40Var;
    }

    @Override // xsna.lvx.a
    public final void a(j0u0 j0u0Var, Artist artist, int i) {
        String string;
        Artist artist2 = artist;
        String str = artist2.c;
        VkCell vkCell = (VkCell) ((View) ((Iterator) j0u0Var.c).next());
        boolean Cb = artist2.Cb();
        ka40 ka40Var = this.a;
        if (Cb) {
            Context mo2getContext = ka40Var.mo2getContext();
            if (mo2getContext != null) {
                string = mo2getContext.getString(R.string.music_artist_action_to_artist_template, str);
            }
            string = null;
        } else {
            Context mo2getContext2 = ka40Var.mo2getContext();
            if (mo2getContext2 != null) {
                string = mo2getContext2.getString(R.string.music_artist_action_search_artist_template, str);
            }
            string = null;
        }
        if (string == null) {
            string = "";
        }
        vkCell.setLeft(new VkCell.Left.b(new VkCell.Left.Main.c(R.drawable.vk_icon_music_mic_outline_28, VkCell.Left.Main.Size.Medium, (k1u0) null, oq.d(tlo0.Companion, string), 4), null));
        vkCell.setMiddle(new VkCell.Middle.b(new VkCell.Middle.e(new tlo0.h(string), 1, TextUtils.TruncateAt.END, (VkCell.Middle.e.b) null, (VkCell.Middle.e.b) null, 50), (VkCell.Middle.d) null, (VkCell.Middle.c) null, (VkCell.Middle.Size) null, 14));
        ArrayList<T> arrayList = ka40Var.y;
        if (i == (arrayList != 0 ? arrayList.size() : 1) - 1) {
            ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) vkCell.getLayoutParams())).topMargin = iah0.a(8);
            vkCell.requestLayout();
        } else if (i == 0) {
            ((ViewGroup.MarginLayoutParams) ((RecyclerView.p) vkCell.getLayoutParams())).bottomMargin = iah0.a(8);
            vkCell.requestLayout();
        }
    }
}
