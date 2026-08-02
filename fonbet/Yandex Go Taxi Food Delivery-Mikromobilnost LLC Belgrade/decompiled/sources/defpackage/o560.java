package defpackage;

import com.yandex.payment.sdk.core.data.PaymentKitError;

/* loaded from: classes2.dex */
public final class o560 implements ryj0, ol41 {
    public final /* synthetic */ p560 a;

    public /* synthetic */ o560(p560 p560Var) {
        this.a = p560Var;
    }

    @Override // defpackage.ol41
    public void c(nl41 nl41Var) {
        this.a.m.l(nl41Var);
    }

    @Override // defpackage.ryj0
    public void i(Object obj) {
        this.a.c((PaymentKitError) obj);
    }

    @Override // defpackage.ryj0
    public void onSuccess(Object obj) {
        p560 p560Var = this.a;
        ol41 ol41Var = p560Var.e;
        if (ol41Var != null) {
            ol41Var.c(kl41.a);
        }
        on8 on8Var = p560Var.f;
        if (on8Var != null) {
            on8Var.b(new mn8());
        }
    }
}
