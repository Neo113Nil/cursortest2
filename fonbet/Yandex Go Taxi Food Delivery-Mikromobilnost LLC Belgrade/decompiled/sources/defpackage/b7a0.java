package defpackage;

import com.yandex.plus.core.data.pay.PlusSelectPaymentMethodState;

/* loaded from: classes2.dex */
public abstract class b7a0 {
    public static final PlusSelectPaymentMethodState.Terminal a(a7a0 a7a0Var, String str) {
        if (a7a0Var instanceof z6a0) {
            return new PlusSelectPaymentMethodState.Success(str, ((z6a0) a7a0Var).a);
        }
        if (a7a0Var instanceof y6a0) {
            y6a0 y6a0Var = (y6a0) a7a0Var;
            return new PlusSelectPaymentMethodState.Error(y6a0Var.a, y6a0Var.b, y6a0Var.c, y6a0Var.d, y6a0Var.e);
        }
        if (a7a0Var instanceof x6a0) {
            return PlusSelectPaymentMethodState.Cancel.INSTANCE;
        }
        w511.b();
        return null;
    }
}
