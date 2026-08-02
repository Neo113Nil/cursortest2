package defpackage;

import com.yandex.payment.sdk.core.data.PaymentMethod;
import com.yandex.payment.sdk.ui.payment.newbind.NewBindFragment;

/* loaded from: classes2.dex */
public final class j560 implements vga0 {
    public final /* synthetic */ k560 a;

    public j560(k560 k560Var) {
        this.a = k560Var;
    }

    @Override // defpackage.vga0
    public final void a(o560 o560Var) {
        uv90 onCreate$lambda$1;
        k560 k560Var = this.a;
        onCreate$lambda$1 = NewBindFragment.onCreate$lambda$1(k560Var.b.b);
        ((wga0) onCreate$lambda$1).f(PaymentMethod.NewCard.INSTANCE, k560Var.w, o560Var);
    }
}
