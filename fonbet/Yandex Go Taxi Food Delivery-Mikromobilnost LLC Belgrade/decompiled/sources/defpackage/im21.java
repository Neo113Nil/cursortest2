package defpackage;

import android.content.Context;
import android.os.PowerManager;
import com.yandex.delivery.utils.auth.impl.user.b;
import com.yandex.go.taxi.experiments.q;
import com.yandex.go.user_profile.fullscreen.models.l;
import com.ybsdk.common.repositiories.user.a;
import com.ybsdk.network.Api;
import ru.yandex.taxi.e;
import ru.yandex.taxi.experiments.u;
import ru.yandex.taxi.preorder.source.userposition.f;

/* loaded from: classes9.dex */
public final class im21 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ im21(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new hm21();
            case 1:
                return new u((rqo) xvf0Var.get());
            case 2:
                return new zm21((Context) xvf0Var.get());
            case 3:
                return new b((Context) xvf0Var.get());
            case 4:
                return new a((Api) xvf0Var.get());
            case 5:
                return new no21((e) xvf0Var.get());
            case 6:
                return new f((ru.yandex.taxi.preorder.source.userposition.e) xvf0Var.get());
            case 7:
                return new rq21((Context) xvf0Var.get());
            case 8:
                return new com.yandex.go.domain.a((on2) xvf0Var.get());
            case 9:
                return new cug((pho) xvf0Var.get());
            case 10:
                return new wq21((rqo) xvf0Var.get());
            case 11:
                return new fr21((dne0) xvf0Var.get());
            case 12:
                return new or21((com.yandex.go.navigation.b) xvf0Var.get());
            case 13:
                return new l((rqo) xvf0Var.get());
            case 14:
                return new ps21((pho) xvf0Var.get());
            case 15:
                return new vuz(false);
            case 16:
                return new xt21((x22) xvf0Var.get());
            case 17:
                return new pu21(i5m.a(xvf0Var));
            case 18:
                return new xjw0(1, i5m.a(xvf0Var));
            case 19:
                return new p331((i6r) xvf0Var.get());
            case 20:
                return new com.yandex.go.address.search.common.domain.interactor.a((atd0) xvf0Var.get());
            case 21:
                return new kb31((Context) xvf0Var.get());
            case 22:
                return new hf31((q) xvf0Var.get());
            case 23:
                return new yo40((krq0) xvf0Var.get());
            case 24:
                return new jzz();
            case 25:
                return new cug((pho) xvf0Var.get());
            case 26:
                return new c041((Context) xvf0Var.get());
            case 27:
                return new t041((PowerManager) xvf0Var.get());
            case 28:
                return new l141((rqo) xvf0Var.get());
            default:
                return new n141(i5m.a(xvf0Var));
        }
    }
}
