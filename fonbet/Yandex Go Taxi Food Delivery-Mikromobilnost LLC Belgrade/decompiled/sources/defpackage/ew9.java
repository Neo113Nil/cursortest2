package defpackage;

import com.yandex.go.chargers.dvizh_subscription.api.ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint;
import com.yandex.go.chargers.e;
import com.yandex.go.chargers.qr.api.ChargersQrOpenReason;

/* loaded from: classes12.dex */
public final /* synthetic */ class ew9 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ ew9(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        boolean z = false;
        int i2 = 7;
        int i3 = 1;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                break;
            case 1:
                apa apaVar = (apa) obj;
                apaVar.a.a0(apaVar.b, cua.a);
                break;
            case 2:
                apa apaVar2 = (apa) obj;
                e eVar = apaVar2.a;
                eVar.S(new yoa(eVar, apaVar2.b, 2));
                break;
            case 3:
                apa apaVar3 = (apa) obj;
                e eVar2 = apaVar3.a;
                eVar2.b0(new yoa(eVar2, apaVar3.b, 1));
                break;
            case 4:
                apa apaVar4 = (apa) obj;
                apaVar4.a.W(ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint.DISCOVERY, apaVar4.b, null);
                break;
            case 5:
                apa apaVar5 = (apa) obj;
                e.P(apaVar5.a, apaVar5.b);
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                Integer M = s8o.M((Throwable) obj);
                if (M != null && M.intValue() == 498) {
                    z = true;
                }
                break;
            case 10:
                Integer M2 = s8o.M((Throwable) obj);
                if (M2 != null && M2.intValue() / 100 == 5) {
                    z = true;
                }
                break;
            case 11:
                ((ky9) obj).k();
                break;
            case 12:
                ((ky9) obj).i();
                break;
            case 13:
                ((ky9) obj).c();
                break;
            case 14:
                ((ky9) obj).getClass();
                break;
            case 15:
                break;
            case 16:
                kz9 kz9Var = (kz9) obj;
                y4c0 y4c0Var = kz9Var.a;
                y4c0Var.A((m950) ((gw7) y4c0Var.G).get(), new rx9(ChargersDvizhSubscriptionPayload$DvizhSubscriptionEntryPoint.FEEDBACK, null, 6), new cb0(6, y4c0Var, kz9Var.b));
                break;
            case 17:
                t4a t4aVar = (t4a) obj;
                zsa zsaVar = t4aVar.a;
                zsaVar.A((m950) ((yvf0) zsaVar.E).get(), new noa(ChargersQrOpenReason.ACTIVE_ORDER_CARD), new cp9(zsaVar, t4aVar.b, i3));
                break;
            case 18:
                ((t4a) obj).a.r(new ew9(19));
                break;
            case 19:
                ((lda) obj).a.r(new ew9(23));
                break;
            case 20:
                c9a c9aVar = (c9a) obj;
                f9a f9aVar = c9aVar.a;
                f9aVar.C((m950) ((kj7) f9aVar.I).get(), new cb0(i2, f9aVar, c9aVar.b));
                break;
            case 21:
                c9a c9aVar2 = (c9a) obj;
                f9a f9aVar2 = c9aVar2.a;
                f9aVar2.C((m950) ((kj7) f9aVar2.I).get(), new cb0(i2, f9aVar2, c9aVar2.b));
                break;
            case 22:
                pda pdaVar = (pda) obj;
                pdaVar.a.S(pdaVar.b);
                break;
            case 23:
                ((zca) obj).K0();
                break;
            case 24:
                ((zca) obj).R();
                break;
            case 25:
                ((zca) obj).e1();
                break;
            case 26:
                ((zca) obj).K0();
                break;
            case 27:
                ((zca) obj).M();
                break;
            case 28:
                ((zca) obj).i();
                break;
            default:
                break;
        }
        return zy11Var;
    }
}
