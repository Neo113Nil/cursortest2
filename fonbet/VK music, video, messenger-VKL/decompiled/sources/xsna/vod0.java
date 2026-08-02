package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: ProductFilterSpinnerHolder.kt */
/* loaded from: classes18.dex */
public final class vod0 extends vfz<fsd0> {
    public final izs<vcr<?>, s3q0> l;
    public final ComposeView m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public vod0(ViewGroup viewGroup, g22 g22Var) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        vq.b(-1, -2, composeView);
        this.l = g22Var;
        this.m = (ComposeView) this.itemView;
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void i6(fsd0 fsd0Var) {
        this.m.setContent(new jai(1279331418, new a73(5, fsd0Var, this), true));
    }
}
