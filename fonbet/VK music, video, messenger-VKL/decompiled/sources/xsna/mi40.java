package xsna;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.music.Playlist;
import com.vkontakte.android.R;
import java.util.ArrayList;

/* compiled from: MusicDownloadsAdapter.kt */
/* loaded from: classes16.dex */
public final class mi40 extends zoj0<Playlist, vg40> {
    public final lq40 e;
    public final oc40 f;

    public mi40(lq40 lq40Var, oc40 oc40Var) {
        this.e = lq40Var;
        this.f = oc40Var;
    }

    @Override // xsna.zoj0, androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return ((ArrayList) y0()).size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((vg40) e0Var).V5((Playlist) ((ArrayList) y0()).get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        View I = bwt0.I(R.layout.catalog_music_download_item_banner, viewGroup, false);
        lq40 lq40Var = this.e;
        return new vg40(I, lq40Var, this.f, new kco(lq40Var));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onViewRecycled(RecyclerView.e0 e0Var) {
        vg40 vg40Var = (vg40) e0Var;
        ValueAnimator valueAnimator = vg40Var.s;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        io.reactivex.rxjava3.disposables.c cVar = vg40Var.t;
        if (cVar != null) {
            cVar.dispose();
        }
        vg40Var.t = null;
        super.onViewRecycled(vg40Var);
    }
}
