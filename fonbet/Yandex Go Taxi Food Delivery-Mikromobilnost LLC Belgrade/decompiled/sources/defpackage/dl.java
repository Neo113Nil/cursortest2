package defpackage;

import com.yandex.go.payments.paymentlist.ui.IconType;
import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.y;
import com.yandex.go.sharedpayments.api.analytics.SharedPaymentsOpenReason;
import ru.yandex.taxi.gopayments.dto.SharedAccountType;

/* loaded from: classes13.dex */
public final class dl extends ad5 {
    public final ycq0 A;
    public final v B;
    public boolean C;
    public final bl x;
    public final zuj0 y;
    public final zor0 z;

    public dl(bl blVar, zuj0 zuj0Var, zor0 zor0Var, ycq0 ycq0Var, v vVar) {
        super(al.class);
        this.x = blVar;
        this.y = zuj0Var;
        this.z = zor0Var;
        this.A = ycq0Var;
        this.B = vVar;
    }

    public static final void Kg(dl dlVar) {
        v vVar = dlVar.B;
        bl blVar = dlVar.x;
        tmr0 tmr0Var = blVar.a;
        snr0 j = vVar.j(tmr0Var);
        y yVar = (y) blVar.b.b;
        if (j == null) {
            yVar.k(tmr0Var, SharedPaymentsOpenReason.MENU);
        } else {
            yVar.c.a().d(new bl(j, tmr0Var, new pgk0(28, yVar)));
        }
    }

    public final gl Lg() {
        bl blVar = this.x;
        String str = blVar.c;
        tmr0 tmr0Var = blVar.a;
        String h = ((avj0) this.y).h(this.B.k(str) ? kyh0.family_account_exists_dialog_close : kyh0.family_account_exists_dialog_choose_for_payment);
        qmr0 qmr0Var = SharedAccountType.Companion;
        String str2 = tmr0Var.a;
        qmr0Var.getClass();
        SharedAccountType a = qmr0.a(str2);
        k0a0 k0a0Var = cl.a[a.ordinal()] == 1 ? new k0a0(IconType.SHARED_BUSINESS) : oe91.e(a);
        String str3 = blVar.d;
        String str4 = tmr0Var.i;
        boolean z = this.C;
        gl glVar = new gl();
        glVar.b = str3;
        glVar.c = str4;
        glVar.w = h;
        glVar.a = z;
        glVar.x = k0a0Var;
        return glVar;
    }
}
