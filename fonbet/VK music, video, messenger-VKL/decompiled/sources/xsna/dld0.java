package xsna;

import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.compose.ui.platform.ComposeView;

/* compiled from: ProductCardGalleryViewHolder.kt */
/* loaded from: classes18.dex */
public final class dld0 extends vif0<eld0> {
    public final izs<ejd0, s3q0> n;
    public final ComposeView o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dld0(ViewGroup viewGroup, frg frgVar) {
        super(r0);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 6);
        composeView.setTag("product_card_gallery_compose_view");
        composeView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        f4m.t(iah0.a(-16), composeView);
        this.n = frgVar;
        this.o = (ComposeView) this.itemView;
    }

    @Override // xsna.vif0
    public final void i6(eld0 eld0Var) {
        this.o.setContent(new jai(-81779152, new r85(9, eld0Var, this), true));
    }
}
