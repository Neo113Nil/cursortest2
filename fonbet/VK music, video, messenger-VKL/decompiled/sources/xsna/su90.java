package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.ProgressView;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: PostingHolders.kt */
/* loaded from: classes4.dex */
public final class su90 extends cun implements zu90 {
    public final av90 M;

    public su90(ViewGroup viewGroup, vou vouVar) {
        super(viewGroup);
        av90 av90Var = new av90((FrameLayout) this.itemView.findViewById(R.id.common_holder_frame_layout));
        av90Var.c(true);
        VKImageView vKImageView = av90Var.b;
        ((FrameLayout.LayoutParams) vKImageView.getLayoutParams()).gravity = 8388627;
        ProgressView progressView = av90Var.a;
        ((FrameLayout.LayoutParams) progressView.getLayoutParams()).gravity = 8388627;
        vKImageView.setOnClickListener(new b6u(1, av90Var, new mmb(5, this, vouVar)));
        progressView.setOnClickListener(new te5(6, this, vouVar));
        this.M = av90Var;
    }

    @Override // xsna.zu90
    public final int S() {
        T t = this.C;
        ju90 ju90Var = t instanceof ju90 ? (ju90) t : null;
        if (ju90Var != null) {
            return ju90Var.S();
        }
        return 0;
    }

    @Override // xsna.zu90
    public final void Y2(boolean z) {
        this.M.c(false);
    }

    @Override // xsna.zu90
    public final void f3(int i, int i2) {
        this.M.b(i, i2);
    }

    @Override // xsna.zu90
    public final void i4(boolean z) {
        this.M.a(true);
    }

    @Override // xsna.qi6, me.grishka.appkit.views.UsableRecyclerView.e
    public final void onClick() {
    }
}
