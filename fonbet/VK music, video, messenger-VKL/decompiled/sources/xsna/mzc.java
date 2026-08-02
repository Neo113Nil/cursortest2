package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;

/* compiled from: ClipFooterEmptyViewProvider.kt */
/* loaded from: classes17.dex */
public final class mzc extends ie {
    public final int c;
    public final boolean e;
    public View f;
    public final int b = R.string.my_clips_empty_stub_title;
    public final int d = R.drawable.vk_icon_logo_clips_outline_56;

    /* compiled from: ClipFooterEmptyViewProvider.kt */
    public static final class a extends RecyclerView.e0 {
    }

    public mzc(int i, boolean z) {
        this.c = i;
        this.e = z;
    }

    @Override // xsna.h6s
    public final View a(Context context, ViewGroup viewGroup) {
        if (this.e) {
            dhr0.a.getClass();
            context = new l7s(context, dhr0.u().c);
        }
        View inflate = LayoutInflater.from(context).inflate(R.layout.clips_feed_holder_pagination_empty, viewGroup, false);
        this.f = inflate;
        ((ImageView) inflate.findViewById(R.id.clip_empty_img)).setImageResource(this.d);
        ((VkText) inflate.findViewById(R.id.clip_empty_title)).setText(this.b);
        ((VkText) inflate.findViewById(R.id.clip_empty_subtitle)).setText(this.c);
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.create_clip);
        bwt0.p0(vkButton, false);
        bwt0.i0(vkButton, new x4(this, 13));
        return inflate;
    }

    @Override // xsna.h6s
    public final RecyclerView.e0 b(Context context, ViewGroup viewGroup) {
        return new a(a(context, viewGroup));
    }
}
