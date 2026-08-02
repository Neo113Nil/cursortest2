package defpackage;

import android.view.View;
import com.yandex.div.core.state.b;
import com.yandex.div.core.view2.Div2View;
import com.yandex.go.feed.global.div.custom.payment_icon.PaymentIconViewHolder;

/* loaded from: classes.dex */
public final class c1a0 implements plk {
    public final z0a0 b;
    public final a2a0 c;
    public final h3y d;
    public final tse e;

    public c1a0(z0a0 z0a0Var, a2a0 a2a0Var, h3y h3yVar, tse tseVar) {
        this.b = z0a0Var;
        this.c = a2a0Var;
        this.d = h3yVar;
        this.e = tseVar;
    }

    @Override // defpackage.plk
    public final void bindView(View view, clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
    }

    @Override // defpackage.plk
    public final View createView(clk clkVar, Div2View div2View, rvo rvoVar, b bVar) {
        PaymentIconViewHolder paymentIconViewHolder = new PaymentIconViewHolder(this.e, div2View, this.b, this.c, this.d);
        paymentIconViewHolder.init(clkVar);
        return paymentIconViewHolder;
    }

    @Override // defpackage.plk
    public final boolean isCustomTypeSupported(String str) {
        return jl40.l(str, "payment_icon");
    }

    @Override // defpackage.plk
    public final void release(View view, clk clkVar) {
        PaymentIconViewHolder paymentIconViewHolder = view instanceof PaymentIconViewHolder ? (PaymentIconViewHolder) view : null;
        if (paymentIconViewHolder != null) {
            paymentIconViewHolder.release();
        }
    }
}
