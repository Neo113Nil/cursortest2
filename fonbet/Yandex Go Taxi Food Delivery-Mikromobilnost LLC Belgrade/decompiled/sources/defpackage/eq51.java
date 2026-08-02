package defpackage;

import com.yandex.go.yb.api.domain.model.YbSdkPaymentMethodInfo$ProductType;
import com.yandex.go.yb.data.u;

/* loaded from: classes8.dex */
public final class eq51 {
    public final u a;
    public final oz01 b;

    public eq51(u uVar, oz01 oz01Var) {
        this.a = uVar;
        this.b = oz01Var;
    }

    public final uv51 a(yy51 yy51Var) {
        uv51 W = this.a.c().B.W(yy51Var.getId(), yy51Var.g());
        return W == null ? new uv51(yy51Var.getId(), this.b.a(kyh0.yandex_pay_card_title_fallback), YbSdkPaymentMethodInfo$ProductType.WALLET) : W;
    }
}
