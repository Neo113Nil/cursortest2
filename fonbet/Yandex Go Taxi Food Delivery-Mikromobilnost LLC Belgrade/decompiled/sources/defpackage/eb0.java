package defpackage;

import com.yandex.go.payments.paymentlist.data.c;
import com.yandex.go.payments.paymentlist.navigation.f;
import java.util.Calendar;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class eb0 implements fj8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eb0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void n1() {
    }

    private final void o1() {
    }

    private final void p1(Calendar calendar) {
    }

    @Override // defpackage.fj8
    public final void P0(Calendar calendar) {
        int i = this.a;
        c21 c21Var = sy60.Q2;
        Object obj = this.b;
        switch (i) {
            case 0:
                fb0 fb0Var = (fb0) obj;
                fb0Var.D((m950) fb0Var.K.get(), new eaa0(new h9a0(false, calendar, ((e5d0) fb0Var.I.get()).a(), false, null, null, 48)), new bb0(fb0Var, 0));
                fb0Var.r(new qu(9));
                break;
            case 1:
                s2p0 s2p0Var = (s2p0) obj;
                s2p0Var.A((m950) s2p0Var.F.get(), new asz0(calendar), new j2f(s2p0Var, 2));
                break;
            case 2:
                break;
            case 3:
                f fVar = (f) obj;
                fVar.A((m950) fVar.e0.get(), new asz0(calendar), c21Var);
                break;
            default:
                com.yandex.go.payments.summary.domain.f fVar2 = (com.yandex.go.payments.summary.domain.f) obj;
                fVar2.A((m950) fVar2.H.get(), new asz0(calendar), c21Var);
                break;
        }
    }

    @Override // defpackage.fj8
    public final void W0(wqw wqwVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                fb0 fb0Var = (fb0) obj;
                if (!((z80) wqwVar).b) {
                    fb0Var.r(new qu(9));
                    break;
                } else {
                    z80 z80Var = (z80) wqwVar;
                    PaymentMethod$Type a = z80Var.e().a();
                    if (a != null) {
                        kv90 kv90Var = lv90.Companion;
                        String c = z80Var.c();
                        kv90Var.getClass();
                        fb0Var.F.b(kv90.b(c, a));
                    }
                    if (!z80Var.a.c || !((jaa0) fb0Var.L.get()).a().contains(PaymentMethod$Type.CARD)) {
                        fb0Var.P(wqwVar);
                        break;
                    } else {
                        fb0Var.C((m950) fb0Var.D.get(), new cb0(0, fb0Var, wqwVar));
                        break;
                    }
                }
                break;
            case 1:
                ((z80) wqwVar).a();
                ((s2p0) obj).r(new qu(9));
                break;
            case 2:
                y4a0 y4a0Var = (y4a0) obj;
                ((c) ((z4a0) y4a0Var.c).I.j).p();
                ((z4a0) y4a0Var.c).r(new qu(9));
                break;
            case 3:
                nsd0 nsd0Var = ((f) obj).m0.c;
                if (nsd0Var != null) {
                    nsd0Var.d(wqwVar);
                    break;
                }
                break;
            default:
                if (wqwVar == null) {
                    wqwVar = null;
                }
                if (wqwVar != null) {
                    com.yandex.go.payments.summary.domain.f.P((com.yandex.go.payments.summary.domain.f) obj, wqwVar);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((fb0) obj).r(new qu(9));
                break;
            case 1:
                ((s2p0) obj).r(new qu(9));
                break;
            case 2:
            case 3:
                break;
            default:
                ((com.yandex.go.payments.summary.domain.f) obj).r(new qu(9));
                break;
        }
    }
}
