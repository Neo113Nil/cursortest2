package defpackage;

import android.content.Context;
import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.walking.navigation.impl.guidance.e;
import com.yandex.go.walking.navigation.impl.guidance.interactor.k;
import com.yandex.go.walking.navigation.impl.guidance.interactor.n;
import com.yandex.go.walking.navigation.impl.guidance.interactor.x;
import com.yandex.go.walking.navigation.impl.navigation_core.guidance.a;
import com.yandex.go.walking.navigation.impl.navigation_core.guidance.b;
import ru.yandex.taxi.am.g;

/* loaded from: classes14.dex */
public final class p241 extends BaseRootNavigationRouter {
    public final n141 D;
    public final i6r E;
    public final BaseRootNavigationRouter.a F = new BaseRootNavigationRouter.a(Screen.UNSUPPORTED, BaseRootNavigationRouter.Background.MAP, null, 12);

    public p241(n141 n141Var, i6r i6rVar) {
        this.D = n141Var;
        this.E = i6rVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.D.b();
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        m141 a = this.D.a();
        i6r i6rVar = this.E;
        i6rVar.getClass();
        jcg jcgVar = new jcg(i6rVar, 23);
        pcg pcgVar = new pcg(i6rVar, 3);
        pcg pcgVar2 = new pcg(i6rVar, 6);
        pcg pcgVar3 = new pcg(i6rVar, 10);
        ocg ocgVar = new ocg(a, 13);
        pcg pcgVar4 = new pcg(i6rVar, 2);
        i5m.b(o441.a);
        pcg pcgVar5 = new pcg(i6rVar, 12);
        d441 d441Var = new d441(new ocg(a, 1), 3);
        xvf0 b = i5m.b(x041.a);
        pcg pcgVar6 = new pcg(i6rVar, 1);
        ocg ocgVar2 = new ocg(a, 12);
        pcg pcgVar7 = new pcg(i6rVar, 9);
        xvf0 b2 = i5m.b(h241.a);
        t4v0 t4v0Var = new t4v0(pcgVar6, ocgVar2, pcgVar7, b2, 21);
        jcg jcgVar2 = new jcg(i6rVar, 26);
        pcg pcgVar8 = new pcg(i6rVar, 4);
        ocg ocgVar3 = new ocg(a, 8);
        ocg ocgVar4 = new ocg(a, 5);
        ubq0 ubq0Var = new ubq0(jcgVar, new kdv0(pcgVar6, jcgVar2, pcgVar2, pcgVar3, pcgVar8, ocgVar3, ocgVar4, ocgVar, pcgVar5, new jcg(i6rVar, 28), b2), new pcg(i6rVar, 5), pcgVar3, pcgVar4, new pcg(i6rVar, 8), new pcg(i6rVar, 11), 24);
        pcg pcgVar9 = new pcg(i6rVar, 0);
        xvf0 b3 = i5m.b(new qd21(ocgVar3, ocgVar2, pcgVar4, pcgVar9, jcgVar2, 3));
        f241 f241Var = new f241(new jcg(i6rVar, 24), t4v0Var, n3w.a(new c241(new s421(pcgVar4, b3, n3w.a(new j311(k311.a)), n3w.a(new i441(new aj31(5, new ocg(a, 3)))), 7))), ubq0Var);
        qd21 qd21Var = new qd21(jcgVar, pcgVar, new ibz0(d441Var, b, 26), d441Var, b, 4);
        ocg ocgVar5 = new ocg(a, 11);
        f241 f241Var2 = new f241(new mg11(ocgVar5, new ocg(a, 10), 29), new mg11(ocgVar5, new ocg(a, 9), 28), jcgVar, pcgVar, 2);
        j141 j141Var = i141.a;
        g141 g141Var = f141.a;
        Context context = (Context) jcgVar.get();
        w030 w030Var = (w030) pcgVar.get();
        b bVar = (b) ((c0g) i6rVar).z.ue.get();
        q5z.h(bVar);
        n341 n341Var = new n341(bVar, (k) b3.get(), (b741) d441Var.get(), (w041) b.get());
        Context context2 = (Context) jcgVar.get();
        zuj0 zuj0Var = (zuj0) pcgVar2.get();
        zzi O1 = ((c0g) i6rVar).O1();
        pwy0 pwy0Var = (pwy0) pcgVar3.get();
        a640 a640Var = new a640((zuj0) pcgVar2.get(), ((c0g) i6rVar).z.a);
        g gVar = (g) ((c0g) i6rVar).z.W0.get();
        q5z.h(gVar);
        vmn0 vmn0Var = new vmn0(context2, zuj0Var, O1, pwy0Var, a640Var, gVar);
        a341 a341Var = (a341) ocgVar3.get();
        j241 j241Var = (j241) ocgVar4.get();
        ah00 ah00Var = (ah00) pcgVar4.get();
        k kVar = (k) b3.get();
        a640 a640Var2 = new a640((zuj0) pcgVar2.get(), ((c0g) i6rVar).z.a);
        n241 n241Var = (n241) ((ncg) a).o.get();
        q5z.h(n241Var);
        q541 q541Var = (q541) ((ncg) a).q.get();
        q5z.h(q541Var);
        x xVar = new x(vmn0Var, a341Var, j241Var, ah00Var, kVar, a640Var2, n241Var, q541Var, (g241) b2.get(), new a3l0((rqo) ((c0g) i6rVar).z.C.get()));
        x241 x241Var = (x241) ((ncg) a).n.get();
        q5z.h(x241Var);
        a aVar = (a) ((ncg) a).p.get();
        q5z.h(aVar);
        a3v a3vVar = (a3v) pcgVar9.get();
        b741 b741Var = (b741) d441Var.get();
        w041 w041Var = (w041) b.get();
        n nVar = (n) ((ncg) a).r.get();
        q5z.h(nVar);
        z(new e(context, w030Var, n341Var, xVar, f241Var, qd21Var, f241Var2, x241Var, aVar, a3vVar, b741Var, w041Var, nVar), new h331(this, 1));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.F;
    }
}
