package defpackage;

import com.yandex.go.payments.api.preorder.SuitabilityCheckType;
import com.yandex.go.payments.domain.k0;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import java.util.List;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;
import ru.yandex.taxi.tariffs.model.b;

/* loaded from: classes8.dex */
public final class icv0 {
    public final dqe0 a;
    public final g8a0 b;
    public final wiq0 c;
    public final drd d;
    public final k0 e;

    public icv0(dqe0 dqe0Var, g8a0 g8a0Var, wiq0 wiq0Var, drd drdVar, k0 k0Var) {
        this.a = dqe0Var;
        this.b = g8a0Var;
        this.c = wiq0Var;
        this.d = drdVar;
        this.e = k0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r6 != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00db, code lost:
    
        if (defpackage.jl40.l(r6.b, r9) == false) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00e0 A[LOOP:0: B:8:0x002c->B:33:0x00e0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00df A[EDGE_INSN: B:34:0x00df->B:58:0x00df BREAK  A[LOOP:0: B:8:0x002c->B:33:0x00e0], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(SuitabilityCheckType... suitabilityCheckTypeArr) {
        boolean z;
        xxc g;
        List list;
        if (this.b.a.c().a() == null) {
            return false;
        }
        lv90 c = this.a.a.c();
        lv90 e = this.a.a.e();
        if (!this.b.b(c)) {
            int length = suitabilityCheckTypeArr.length;
            int i = 0;
            while (true) {
                boolean z2 = true;
                if (i >= length) {
                    return true;
                }
                int i2 = hcv0.a[suitabilityCheckTypeArr[i].ordinal()];
                if (i2 == 1) {
                    Zone c2 = this.a.c();
                    k0 k0Var = this.e;
                    edi0 a = k0Var.a(c, c2);
                    if (a != null) {
                        bw90 bw90Var = a.b;
                        xw91 xw91Var = xw91.C;
                        if (jl40.l(bw90Var, xw91Var)) {
                            if (this.d.b.b()) {
                                if (e != null) {
                                    edi0 a2 = k0Var.a(e, c2);
                                    if (a2 != null) {
                                    }
                                }
                            }
                            if (z2) {
                            }
                        }
                    }
                    z2 = false;
                    if (z2) {
                    }
                } else if (i2 == 2) {
                    e4a0 a3 = c.a();
                    drd drdVar = this.d;
                    fnx0 n = ((k) this.c).n();
                    if (n != null) {
                        if (!drdVar.b.b() || drdVar.d.c(PaymentMethod$Type.PERSONAL_WALLET)) {
                            z2 = b.j(n.c, a3);
                        }
                        z2 = false;
                    }
                    if (z2) {
                    }
                } else {
                    if (i2 != 3) {
                        w511.b();
                        return false;
                    }
                    drd drdVar2 = this.d;
                    if (drdVar2.a()) {
                        if (drdVar2.b.b()) {
                            PaymentMethod$Type paymentMethod$Type = drdVar2.c.a.c().a;
                            z = !((paymentMethod$Type == null || (g = drdVar2.g()) == null || (list = g.a.d.c) == null) ? false : list.contains(paymentMethod$Type));
                        } else {
                            z = false;
                        }
                    }
                    if (z2) {
                        break;
                    }
                    i++;
                }
            }
        }
        return false;
    }
}
