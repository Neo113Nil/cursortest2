package defpackage;

import com.yandex.messaging.experiments.ExperimentName;
import kotlinx.serialization.json.c;

/* loaded from: classes15.dex */
public final class aro extends y2o {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aro(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.y2o
    public final void a(ull0 ull0Var, Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                nqo nqoVar = (nqo) obj;
                ull0Var.b(1, nqoVar.a);
                mqo mqoVar = ((bro) obj2).c;
                ExperimentName experimentName = nqoVar.b;
                mqoVar.getClass();
                String uaasId = experimentName != null ? experimentName.getUaasId() : null;
                if (uaasId == null) {
                    ull0Var.p(2);
                } else {
                    ull0Var.g1(2, uaasId);
                }
                c cVar = nqoVar.c;
                mqoVar.getClass();
                String cVar2 = cVar != null ? cVar.toString() : null;
                if (cVar2 != null) {
                    ull0Var.g1(3, cVar2);
                    break;
                } else {
                    ull0Var.p(3);
                    break;
                }
            case 1:
                k4r k4rVar = (k4r) obj;
                ull0Var.g1(1, k4rVar.a);
                i3y i3yVar = ((g4r) obj2).c;
                String d = ((j6w) i3yVar.getValue()).d(k4rVar.b);
                if (d == null) {
                    ull0Var.p(2);
                } else {
                    ull0Var.g1(2, d);
                }
                String d2 = ((j6w) i3yVar.getValue()).d(k4rVar.c);
                if (d2 != null) {
                    ull0Var.g1(3, d2);
                    break;
                } else {
                    ull0Var.p(3);
                    break;
                }
            default:
                st21 st21Var = (st21) obj;
                ull0Var.b(1, st21Var.a);
                ull0Var.g1(2, st21Var.b);
                ull0Var.b(3, st21Var.c);
                ull0Var.b(4, st21Var.d);
                ull0Var.b(5, st21Var.e);
                ull0Var.b(6, st21Var.f);
                String str = st21Var.g;
                if (str == null) {
                    ull0Var.p(7);
                } else {
                    ull0Var.g1(7, str);
                }
                String str2 = st21Var.h;
                if (str2 == null) {
                    ull0Var.p(8);
                } else {
                    ull0Var.g1(8, str2);
                }
                String str3 = st21Var.i;
                if (str3 == null) {
                    ull0Var.p(9);
                } else {
                    ull0Var.g1(9, str3);
                }
                String d3 = ((fuu0) ((ot21) obj2).c.getValue()).d(st21Var.j);
                if (d3 != null) {
                    ull0Var.g1(10, d3);
                    break;
                } else {
                    ull0Var.p(10);
                    break;
                }
        }
    }

    @Override // defpackage.y2o
    public final String b() {
        switch (this.a) {
            case 0:
                return "INSERT OR REPLACE INTO `experiments` (`experiment_id`,`name`,`data`) VALUES (nullif(?, 0),?,?)";
            case 1:
                return "INSERT OR REPLACE INTO `filters` (`filter_id`,`chat_types`,`namespaces`) VALUES (?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `statuses` (`id`,`guid`,`timestamp`,`availability`,`notificationMode`,`duration`,`custom_text`,`custom_emoji`,`custom_icon`,`locales`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?)";
        }
    }
}
