package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: ProductCardBannerHolder.kt */
/* loaded from: classes18.dex */
public final class ljd0 extends vif0<mjd0> {
    public final ComposeView n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ljd0(ViewGroup viewGroup) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        vq.b(-1, -2, composeView);
        this.n = (ComposeView) this.itemView;
    }

    @Override // xsna.vif0
    public final void i6(mjd0 mjd0Var) {
        this.n.setContent(new jai(-1208405076, new yg7(mjd0Var, 12), true));
    }
}
