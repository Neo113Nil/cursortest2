package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import com.yandex.go.delivery.tracking.map_overlay.r;
import com.yandex.go.delivery.tracking.shortcuts.a;
import com.yandex.go.route.interactor.c;
import ru.yandex.taxi.delivery.b;
import ru.yandex.taxi.delivery.impl.paid_insurance.d;

/* loaded from: classes.dex */
public final class lyh implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;

    public /* synthetic */ lyh(xvf0 xvf0Var, xvf0 xvf0Var2, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        boolean z = false;
        xvf0 xvf0Var = this.c;
        xvf0 xvf0Var2 = this.b;
        switch (i) {
            case 0:
                return new kyh(xvf0Var2, (zxh) xvf0Var.get());
            case 1:
                return new nzh((Context) xvf0Var2.get(), (exu0) xvf0Var.get());
            case 2:
                return new k3i((wiq0) xvf0Var2.get(), (o3i) xvf0Var.get());
            case 3:
                return new d4i((c8r) xvf0Var2.get(), (mjx0) xvf0Var.get());
            case 4:
                return new w5i((c) xvf0Var2.get(), (ah00) xvf0Var.get());
            case 5:
                return new r7i((fw7) xvf0Var2.get(), (kej) xvf0Var.get());
            case 6:
                return new ici((rqo) xvf0Var2.get(), (lci) xvf0Var.get());
            case 7:
                return new sei(xvf0Var2, (oep0) xvf0Var.get());
            case 8:
                return new wfi((ile0) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 9:
                return new yfi((fx60) xvf0Var2.get(), i5m.a(xvf0Var));
            case 10:
                return new j0g((chi) xvf0Var2.get(), (d) xvf0Var.get());
            case 11:
                return new j0g((czi0) xvf0Var2.get(), (yli) xvf0Var.get());
            case 12:
                return new r((tt2) xvf0Var2.get(), (sdi) xvf0Var.get());
            case 13:
                return new a((on2) xvf0Var2.get(), (jtq0) xvf0Var.get());
            case 14:
                return new b((zuj0) xvf0Var.get(), (jtq0) xvf0Var2.get());
            case 15:
                return new dui(xvf0Var2, (oep0) xvf0Var.get());
            case 16:
                return new ru.yandex.taxi.diagnostic.b((qcj) xvf0Var2.get(), (ViewGroup) xvf0Var.get());
            case 17:
                return new pej((Context) xvf0Var2.get(), (i130) xvf0Var.get());
            case 18:
                return new kqj((zuj0) xvf0Var2.get(), (k7x0) xvf0Var.get());
            case 19:
                return new com.yandex.go.places.experiments.tabbar.b((rqo) xvf0Var2.get(), (k7x0) xvf0Var.get());
            case 20:
                return new ywj((qwc) xvf0Var2.get(), (po21) xvf0Var.get());
            case 21:
                return new j0g((ysg) xvf0Var2.get(), (p2y0) xvf0Var.get());
            case 22:
                return new xjg((Context) xvf0Var2.get(), (lx4) xvf0Var.get(), z, 24);
            case 23:
                return new fdm((fx60) xvf0Var.get(), xvf0Var2);
            case 24:
                return new afm(xvf0Var2, (rcm) xvf0Var.get());
            case 25:
                return new xhm((nim) xvf0Var2.get(), (jgv) xvf0Var.get());
            case 26:
                return new plm((f6c) xvf0Var2.get(), (tt2) xvf0Var.get());
            case 27:
                return new axm((dqe0) xvf0Var2.get(), (jtq0) xvf0Var.get());
            case 28:
                return new xjg((dqe0) xvf0Var2.get(), (bte0) xvf0Var.get(), z, 29);
            default:
                return new com.yandex.go.splash.dynamic.a((com.yandex.go.splash.dynamic.c) xvf0Var2.get(), (tt2) xvf0Var.get());
        }
    }
}
