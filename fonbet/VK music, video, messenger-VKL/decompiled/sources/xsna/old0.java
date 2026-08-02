package xsna;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: ProductCardMainInfoHolder.kt */
/* loaded from: classes18.dex */
public final class old0 extends vif0<qld0> {
    public final Object n;
    public final Object o;
    public final izs<ejd0, s3q0> p;
    public final ComposeView q;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public old0(ViewGroup viewGroup, Object obj, Object obj2, frg frgVar) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setTag("product_card_main_info_compose_view");
        composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.n = obj;
        this.o = obj2;
        this.p = frgVar;
        this.q = (ComposeView) this.itemView;
    }

    @Override // xsna.vif0
    public final void i6(qld0 qld0Var) {
        this.q.setContent(new jai(-1975628738, new lug(qld0Var, this), true));
    }
}
