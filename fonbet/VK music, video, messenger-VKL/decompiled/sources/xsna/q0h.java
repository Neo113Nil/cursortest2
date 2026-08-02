package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: CommunityCuratorPageItem.kt */
/* loaded from: classes5.dex */
public final class q0h extends we6 {
    public final o0h g;
    public final mu1 h;
    public final int i = -240;

    /* compiled from: CommunityCuratorPageItem.kt */
    public static final class a extends vif0<q0h> {
        public final wh50<q0h> n;

        public a(ComposeView composeView) {
            super(composeView);
            this.n = androidx.compose.runtime.k.b(null);
            composeView.setContent(new jai(-265412092, new p0h(this, 0), true));
        }

        @Override // xsna.vif0
        public final void i6(q0h q0hVar) {
            ((zak0) this.n).setValue(q0hVar);
        }
    }

    public q0h(o0h o0hVar, mu1 mu1Var) {
        this.g = o0hVar;
        this.h = mu1Var;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return new a(composeView);
    }

    @Override // xsna.we6
    public final int h() {
        return this.i;
    }
}
