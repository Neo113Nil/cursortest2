package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: ProductFilterSliderHolder.kt */
/* loaded from: classes18.dex */
public final class rod0 extends vfz<t0k0> {
    public final izs<vcr<?>, s3q0> l;
    public final ComposeView m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rod0(ViewGroup viewGroup, g22 g22Var) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        vq.b(-1, -2, composeView);
        this.l = g22Var;
        this.m = (ComposeView) this.itemView;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(t0k0 t0k0Var) {
        this.m.setContent(new jai(-178073923, new x2(8, t0k0Var, this), true));
    }
}
