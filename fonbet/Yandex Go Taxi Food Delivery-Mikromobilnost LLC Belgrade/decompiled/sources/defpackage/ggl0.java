package defpackage;

import com.yandex.go.payments.sbp.data.SbpTokenApi;
import com.yandex.go.safety.center.SafetyCenterApi;
import com.yandex.go.safety.center.experiment.p;
import com.yandex.go.safety.center.safetycenter_web.ui.error.a;
import com.yandex.go.shortcuts.impl.factory.f;
import com.yandex.go.taxi.order.recenter.n;
import ru.yandex.taxi.map_common.map.r;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes.dex */
public final class ggl0 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;

    public /* synthetic */ ggl0(xvf0 xvf0Var, int i) {
        this.a = i;
        this.b = xvf0Var;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        int i2 = 0;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new fgl0((zuj0) xvf0Var.get());
            case 1:
                return new kgl0((pho) xvf0Var.get());
            case 2:
                return new eil0((x22) xvf0Var.get());
            case 3:
                return new v4c(10, (bll0) xvf0Var.get());
            case 4:
                return new fll0((rqo) xvf0Var.get(), 0);
            case 5:
                return new t61((pho) xvf0Var.get());
            case 6:
                return new epl0((pho) xvf0Var.get());
            case 7:
                return new ppl0((pho) xvf0Var.get());
            case 8:
                SafetyCenterApi a = qpl0.a((on2) xvf0Var.get());
                q5z.i(a);
                return a;
            case 9:
                return new p((rqo) xvf0Var.get());
            case 10:
                return new eo5((rqo) xvf0Var.get(), 4);
            case 11:
                return new a((e) xvf0Var.get());
            case 12:
                return new com.yandex.go.beginners.safety.name.domain.a((ru.yandex.taxi.profile.a) xvf0Var.get());
            case 13:
                return new ndl0(6, (epl0) xvf0Var.get());
            case 14:
                return new n((pzl0) xvf0Var.get());
            case 15:
                return new x770((pho) xvf0Var.get());
            case 16:
                return new jjl(xvf0Var);
            case 17:
                return new f((ru.yandex.taxi.favorites.data.repo.a) xvf0Var.get());
            case 18:
                return new com.yandex.go.payments.sbp.data.f((SbpTokenApi) xvf0Var.get());
            case 19:
                return new ajm0((i6r) xvf0Var.get());
            case 20:
                return new jpm0((rxn0) xvf0Var.get(), i2);
            case 21:
                return new jpm0((rxn0) xvf0Var.get(), 1);
            case 22:
                return new upm0((r) xvf0Var.get());
            case 23:
                return new ywm0((tse) xvf0Var.get());
            case 24:
                return new co40((pho) xvf0Var.get());
            case 25:
                return new qxm0((pho) xvf0Var.get());
            case 26:
                return new sxm0(xvf0Var);
            case 27:
                return new qc20((qwo0) xvf0Var.get());
            case 28:
                return new vxm0((qmp) xvf0Var.get());
            default:
                return new wxm0((tse) xvf0Var.get());
        }
    }
}
