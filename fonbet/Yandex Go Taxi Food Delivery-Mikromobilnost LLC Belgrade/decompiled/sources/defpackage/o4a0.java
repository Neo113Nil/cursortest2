package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import com.yandex.go.payments.paymentlist.ui.PaymentMethodChooserView;

/* loaded from: classes8.dex */
public final class o4a0 extends RecyclerView.g {
    public final /* synthetic */ PaymentMethodChooserView a;

    public o4a0(PaymentMethodChooserView paymentMethodChooserView) {
        this.a = paymentMethodChooserView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        this.a.updateScrollIndicatorVisibility();
    }
}
