package xsna;

import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vkontakte.android.R;
import xsna.p2m0;

/* compiled from: StickerVH.kt */
/* loaded from: classes6.dex */
public final class a8l0 extends RecyclerView.e0 {
    public final p2m0.a l;
    public final int m;
    public final FrameLayout n;

    public a8l0(View view, tcm0 tcm0Var) {
        super(view);
        this.l = tcm0Var;
        this.m = view.getResources().getDimensionPixelSize(R.dimen.story_viewer_send_message_icon_size);
        this.n = (FrameLayout) this.itemView.findViewById(R.id.fl_container);
    }
}
