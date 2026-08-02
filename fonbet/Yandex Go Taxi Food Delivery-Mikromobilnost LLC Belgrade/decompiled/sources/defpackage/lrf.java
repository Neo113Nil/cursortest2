package defpackage;

import com.yandex.payment.sdk.core.data.PaymentMethod;

/* loaded from: classes2.dex */
public final class lrf implements vga0 {
    public final /* synthetic */ uv90 a;

    public lrf(uv90 uv90Var) {
        this.a = uv90Var;
    }

    @Override // defpackage.vga0
    public final void a(o560 o560Var) {
        ((wga0) this.a).f(PaymentMethod.NewCard.INSTANCE, null, o560Var);
    }
}
