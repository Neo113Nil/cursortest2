package defpackage;

import android.view.View;
import androidx.recyclerview.widget.x0;
import com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.ProductView;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes2.dex */
public final class m370 extends x0 {
    public static final /* synthetic */ kgx[] Q = {new PropertyReference1Impl("headlineTextView", 0, "getHeadlineTextView()Landroid/widget/TextView;", m370.class), b64.x(qoi0.a, m370.class, "productView", "getProductView()Lcom/yandex/plus/pay/ui/core/internal/tarifficator/ui/checkout/product/ProductView;", 0)};
    public jjb N;
    public final wv5 O;
    public final m9f0 P;

    public m370(qze qzeVar, View view) {
        super(view);
        this.O = new wv5(new a450(view, z9h0.onsale_headline, 8));
        int i = z9h0.onsale_product_view;
        kgx kgxVar = Q[1];
        try {
            View findViewById = view.findViewById(i);
            if (findViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.yandex.plus.pay.ui.core.internal.tarifficator.ui.checkout.product.ProductView");
            }
            this.P = new m9f0((ProductView) findViewById, qzeVar.b, (n4u0) qzeVar.c, new zl50(11, this, qzeVar));
        } catch (ClassCastException e) {
            dy31.f(kgxVar, e);
            throw null;
        }
    }
}
