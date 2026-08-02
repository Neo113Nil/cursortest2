package defpackage;

import com.yandex.go.chargers.payments.navigation.a;
import com.yandex.go.payments.menu.navigation.b;
import com.yandex.go.payments.order.domain.e;
import com.yandex.go.payments.transport.navigation.c;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

/* loaded from: classes13.dex */
public final class ama implements zyz {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ama(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void n1() {
    }

    @Override // defpackage.sy60
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((a) obj).r(new qu(9));
                break;
            case 1:
                ((com.yandex.go.payments.drive.navigation.a) obj).r(new qu(9));
                break;
            case 2:
                ((zsa) obj).r(new qu(9));
                break;
            case 3:
                ((b) obj).r(new qu(9));
                break;
            case 4:
                ((c) obj).r(new qu(9));
                break;
            case 5:
                ((e) obj).r(new qu(9));
                break;
            case 6:
                com.yandex.go.overdraft.e eVar = (com.yandex.go.overdraft.e) obj;
                eVar.G.h("Close", eVar.T);
                eVar.r(new qu(9));
                break;
            case 7:
                break;
            case 8:
                ((com.yandex.go.scooters.payments.navigation.a) obj).r(new qu(9));
                break;
            default:
                ((com.yandex.go.payments.transport.navigation.e) obj).r(new qu(9));
                break;
        }
    }

    @Override // defpackage.zyz
    public final void j(hfa0 hfa0Var) {
        int i = this.a;
        char c = 1;
        Object obj = this.b;
        switch (i) {
            case 0:
                a aVar = (a) obj;
                aVar.r(new cs8(21, aVar, hfa0Var));
                break;
            case 1:
                com.yandex.go.payments.drive.navigation.a aVar2 = (com.yandex.go.payments.drive.navigation.a) obj;
                aVar2.getClass();
                lea0 b = hfa0Var.b();
                String id = b != null ? b.getId() : null;
                if (id == null) {
                    id = "";
                }
                shq0 shq0Var = hfa0Var.b;
                aVar2.r(new rx3(b, id, (shq0Var == null || shq0Var.b == null) ? false : true, 5));
                break;
            case 2:
                zsa zsaVar = (zsa) obj;
                zsaVar.r(new sxo(c == true ? 1 : 0, zsaVar, hfa0Var));
                break;
            case 3:
                ((b) obj).r(new qu(9));
                break;
            case 4:
                ((c) obj).r(new czz(hfa0Var, 2));
                break;
            case 5:
                ((e) obj).r(new qu(9));
                break;
            case 6:
                ((com.yandex.go.overdraft.e) obj).r(new qu(9));
                break;
            case 7:
                ((gv40) obj).invoke(hfa0Var);
                break;
            case 8:
                com.yandex.go.scooters.payments.navigation.a aVar3 = (com.yandex.go.scooters.payments.navigation.a) obj;
                aVar3.r(new vam0(25, aVar3, hfa0Var));
                break;
            default:
                com.yandex.go.payments.transport.navigation.e eVar = (com.yandex.go.payments.transport.navigation.e) obj;
                sj30 sj30Var = (sj30) eVar.M.getValue();
                m6a0 d = hfa0Var.d();
                sj30Var.getClass();
                i3y i3yVar = sj30Var.d;
                PaymentMethod$Type paymentMethod$Type = d != null ? d.a : null;
                PaymentMethod$Type paymentMethod$Type2 = PaymentMethod$Type.TRANSPORT_EXTERNAL;
                if (paymentMethod$Type == paymentMethod$Type2) {
                    kv90 kv90Var = lv90.Companion;
                    String str = d.b;
                    kv90Var.getClass();
                    ((by90) i3yVar.getValue()).b().e.a(kv90.b(str, paymentMethod$Type2), "transport_external");
                } else {
                    ((by90) i3yVar.getValue()).b().g(null, "transport_external");
                }
                eVar.r(new qu(9));
                break;
        }
    }
}
