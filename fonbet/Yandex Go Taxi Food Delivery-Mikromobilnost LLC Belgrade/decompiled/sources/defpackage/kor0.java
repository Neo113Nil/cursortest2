package defpackage;

import com.yandex.go.payments.shared.SharedPaymentAnalytics$Button;
import com.yandex.go.payments.shared.data.model.Account;
import com.yandex.go.payments.shared.v;

/* loaded from: classes13.dex */
public final class kor0 extends ad5 {
    public final vor0 A;
    public final il B;
    public final nbr0 C;
    public final oor0 D;
    public final v x;
    public final zor0 y;
    public final q6c0 z;

    public kor0(jor0 jor0Var, v vVar, zor0 zor0Var, q6c0 q6c0Var) {
        super(ior0.class);
        this.x = vVar;
        this.y = zor0Var;
        this.z = q6c0Var;
        this.A = jor0Var.a;
        this.B = jor0Var.b;
        nbr0 nbr0Var = jor0Var.c;
        this.C = nbr0Var;
        this.D = new oor0(nbr0Var);
    }

    public static final void Kg(kor0 kor0Var, Account account) {
        kor0Var.B.a = account;
        oor0 oor0Var = kor0Var.D;
        oor0Var.d = kor0Var.C.i;
        oor0Var.e = false;
        oor0Var.c = false;
        oor0Var.g = "";
        kor0Var.Lg();
    }

    public final void Lg() {
        ((ior0) Dg()).e2(this.D);
    }

    public final void onDismiss() {
        this.z.M(this.B.b, this.D, SharedPaymentAnalytics$Button.BACK);
        this.A.a.d();
    }
}
