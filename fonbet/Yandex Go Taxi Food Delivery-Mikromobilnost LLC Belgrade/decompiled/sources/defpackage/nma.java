package defpackage;

import android.content.Context;
import com.yandex.go.about.domain.g;
import com.yandex.go.places.complaint.impl.navigation.a;
import com.yandex.messaging.internal.i;
import ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.d;
import ru.yandex.taxi.am.early_authorization.h;
import ru.yandex.taxi.logistics.sdk.management.delivery_tasks.create.c;

/* loaded from: classes.dex */
public final class nma implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final v7p c;

    public /* synthetic */ nma(v7p v7pVar, xvf0 xvf0Var, int i) {
        this.a = i;
        this.c = v7pVar;
        this.b = xvf0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        boolean z = false;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        v7p v7pVar = this.c;
        xvf0 xvf0Var = this.b;
        switch (i) {
            case 0:
                return new mma(i5m.a(xvf0Var), i5m.a((of7) v7pVar));
            case 1:
                return new uva((int) (objArr == true ? 1 : 0), (Object) xvf0Var, v7pVar);
            case 2:
                return new qya((dy6) ((nl9) v7pVar).get(), (pw2) xvf0Var.get());
            case 3:
                return new h9p0(2, (n3h) ((if9) xvf0Var).get(), (qya) ((nma) v7pVar).get());
            case 4:
                return new zx6((kse) xvf0Var.get(), (i) ((mwq) v7pVar).get());
            case 5:
                return new pqc((Context) xvf0Var.get(), (ha1) ((o10) v7pVar).get());
            case 6:
                return new a((d3a) ((qzb) xvf0Var).get(), (st0) ((xj) v7pVar).get());
            case 7:
                return new com.yandex.messaging.internal.storage.contacts.a(i5m.a((edf0) v7pVar), (at2) xvf0Var.get());
            case 8:
                hjz hjzVar = (hjz) ((w8g) xvf0Var).get();
                i5m.a((m19) v7pVar);
                return hjzVar;
            case 9:
                return new c((jwh) xvf0Var.get(), (ru.yandex.taxi.logistics.sdk.management.storage.c) ((e4f) v7pVar).get());
            case 10:
                return new q0h((o3h) xvf0Var.get(), (qqc) ((mt2) v7pVar).get());
            case 11:
                return new zbh((v920) ((g3p) v7pVar).get(), (ofg) xvf0Var.get());
            case 12:
                return new oxh((yuf0) ((vve) v7pVar).get(), (z0j) xvf0Var.get());
            case 13:
                return new zc((w030) xvf0Var.get(), (qnh) ((gw7) v7pVar).get(), 4);
            case 14:
                return new lb7(25, i5m.a((zzg) xvf0Var), (qt70) ((tj70) v7pVar).get());
            case 15:
                return new k9i((qii) v7pVar, (ra00) xvf0Var.get());
            case 16:
                return new h1i(new hdi(objArr2 == true ? 1 : 0, (w030) xvf0Var.get()), (s14) ((pn2) v7pVar).get());
            case 17:
                return new odi((yth) ((zth) v7pVar).get(), (tt2) xvf0Var.get());
            case 18:
                return new ygi((wiq0) xvf0Var.get(), (gbh) ((z5i) v7pVar).get());
            case 19:
                return new ru.yandex.taxi.logistics.sdk.pay_on_delivery.a((vhi) ((if9) v7pVar).get(), (phi) xvf0Var.get());
            case 20:
                return new pji((pdi) xvf0Var.get(), (tji) ((if9) v7pVar).get());
            case 21:
                return new vki((d) xvf0Var.get(), (com.yandex.go.logistics.cargo_flow.experiment.c) ((z5i) v7pVar).get());
            case 22:
                return new qoi((n3a) ((z5i) v7pVar).get(), (wiq0) xvf0Var.get());
            case 23:
                return new xjg((vpj) ((ove) xvf0Var).get(), (o61) ((kgn) v7pVar).get(), z, 19);
            case 24:
                return new j0g((q501) ((upj) xvf0Var).get(), (b1) ((qii) v7pVar).get());
            case 25:
                return new mtk((pav) xvf0Var.get(), ((btl) ((gw7) v7pVar).get()).a);
            case 26:
                return new fjm((bu0) ((ci3) v7pVar).get(), (w030) xvf0Var.get());
            case 27:
                return new g((com.yandex.go.about.domain.c) ((x4) v7pVar).get(), (k3c) xvf0Var.get());
            case 28:
                return new h(i5m.a((pw) v7pVar), (gyn) xvf0Var.get());
            default:
                return new qnn((jj3) xvf0Var.get(), (le30) v7pVar);
        }
    }

    public /* synthetic */ nma(xvf0 xvf0Var, v7p v7pVar, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = v7pVar;
    }
}
