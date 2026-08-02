package defpackage;

import com.ybsdk.feature.change.payment.method.api.ChangePaymentMethodParameter;
import com.ybsdk.feature.change.payment.method.internal.repositories.a;
import com.ybsdk.feature.change.payment.method.internal.ui.c;

/* loaded from: classes3.dex */
public final class gd9 implements fd9 {
    public final boj0 a;

    public gd9(boj0 boj0Var) {
        this.a = boj0Var;
    }

    public final c a(ChangePaymentMethodParameter changePaymentMethodParameter) {
        boj0 boj0Var = this.a;
        return new c(changePaymentMethodParameter, (a) ((xvf0) boj0Var.b).get(), (com.ybsdk.feature.change.payment.method.internal.domain.a) ((wif) boj0Var.c).get(), (xc9) ((oxf) boj0Var.w).get(), (tfl0) ((oxf) boj0Var.x).get(), (r90) ((oxf) boj0Var.y).get(), (ld9) ((xvf0) boj0Var.z).get());
    }
}
