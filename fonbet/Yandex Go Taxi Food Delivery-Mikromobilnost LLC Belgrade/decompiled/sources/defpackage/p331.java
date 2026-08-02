package defpackage;

import com.yandex.go.navigation.api.router.BaseRootNavigationRouter;
import com.yandex.go.vault.di.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes14.dex */
public final class p331 extends BaseRootNavigationRouter {
    public final i6r D;
    public final BaseRootNavigationRouter.a E = new BaseRootNavigationRouter.a(null, BaseRootNavigationRouter.Background.NONE, null, 13);

    public p331(i6r i6rVar) {
        this.D = i6rVar;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        q331 q331Var = (q331) obj;
        tse o = o();
        i6r i6rVar = this.D;
        i6rVar.getClass();
        q331Var.getClass();
        jcg jcgVar = new jcg(i6rVar, 10);
        jcg jcgVar2 = new jcg(i6rVar, 5);
        int i = 9;
        xvf0 b = i5m.b(new tw11(new jcg(i6rVar, 3), i));
        sag sagVar = new sag(i6rVar, 29);
        jcg jcgVar3 = new jcg(i6rVar, 0);
        xvf0 b2 = i5m.b(new mg11(new tw11(jcgVar3, 7), jcgVar3, 17));
        vm80 vm80Var = new vm80(b, b2, 20);
        jcg jcgVar4 = new jcg(i6rVar, 16);
        int i2 = 8;
        jcg jcgVar5 = new jcg(i6rVar, i2);
        int i3 = 11;
        xvf0 b3 = i5m.b(new tw11(sagVar, i3));
        ph70 ph70Var = new ph70(sagVar, jcgVar, vm80Var, jcgVar4, jcgVar5, b3);
        jcg jcgVar6 = new jcg(i6rVar, i3);
        jcg jcgVar7 = new jcg(i6rVar, 21);
        jcg jcgVar8 = new jcg(i6rVar, 15);
        int i4 = 6;
        sk21 sk21Var = new sk21(new tw11(new jcg(i6rVar, i4), i2), new jcg(i6rVar, 19), jcgVar7, i4);
        jcg jcgVar9 = new jcg(i6rVar, 13);
        jcg jcgVar10 = new jcg(i6rVar, i);
        eqh eqhVar = new eqh();
        jcg jcgVar11 = new jcg(i6rVar, 7);
        qx5 qx5Var = new qx5(n3w.a(new q431(new c1x0(new h0l0(sagVar, b, jcgVar5, sk21Var, b2, jcgVar9, jcgVar10, b3, eqhVar, jcgVar11)))), n431.a, 27);
        n3w a = n3w.a(o);
        qx5 qx5Var2 = new qx5(b, a, 26);
        t770 t770Var = new t770(qx5Var2, 0);
        t770 t770Var2 = new t770(qx5Var2, 3);
        t770 t770Var3 = new t770(qx5Var2, 2);
        t770 t770Var4 = new t770(qx5Var2, 1);
        n3w n3wVar = y2r0.c;
        ArrayList arrayList = new ArrayList(4);
        List list = Collections.EMPTY_LIST;
        arrayList.add(t770Var);
        arrayList.add(t770Var2);
        arrayList.add(t770Var3);
        arrayList.add(t770Var4);
        y2r0 y2r0Var = new y2r0(arrayList, list);
        mg11 mg11Var = new mg11(jcgVar11, b3, 21);
        ArrayList arrayList2 = new ArrayList(1);
        List list2 = Collections.EMPTY_LIST;
        arrayList2.add(mg11Var);
        sk21 sk21Var2 = new sk21(qx5Var, y2r0Var, new y2r0(arrayList2, list2), 4);
        z6x0 z6x0Var = new z6x0(jcgVar, sagVar, b3, new jcg(i6rVar, 12), 25);
        int i5 = 1;
        xvf0 b4 = i5m.b(new tw11(new jcg(i6rVar, i5), 10));
        int i6 = 20;
        xvf0 b5 = i5m.b(new mg11(new jcg(i6rVar, 4), b4, i6));
        n3w a2 = n3w.a(q331Var);
        nqq nqqVar = new nqq(b, eqhVar, i5);
        xvf0 b6 = i5m.b(new c(sk21Var2, z6x0Var, b4, b5, b, a2, nqqVar, b2, a));
        int i7 = 19;
        int i8 = 18;
        eqh.a(eqhVar, new mg11(jcgVar7, i5m.b(new sk21(jcgVar8, i5m.b(new mg11(b6, new jcg(i6rVar, 2), i7)), b3, 5)), i8));
        sag sagVar2 = new sag(i6rVar, 26);
        xvf0 b7 = i5m.b(new mg11(jcgVar4, jcgVar5, 22));
        d441 d441Var = new d441(dhs0.a(new d441(new jcg(i6rVar, i6), 15)), 6);
        jcg jcgVar12 = new jcg(i6rVar, 14);
        jcg jcgVar13 = new jcg(i6rVar, i8);
        sag sagVar3 = new sag(i6rVar, 27);
        int i9 = 17;
        A((com.yandex.go.vault.router.c) i5m.b(new xv8(jcgVar, jcgVar2, b, ph70Var, jcgVar6, b2, b3, eqhVar, i5m.b(new h0l0(sagVar2, jcgVar, b7, d441Var, jcgVar12, jcgVar13, sagVar3, n3w.a(new v331(new a201(i9, sagVar3, jcgVar11))), b2, new jcg(i6rVar, i9))), new sag(i6rVar, 28), b5, nqqVar, b6)).get(), q331Var, new p4g0(this, i7));
    }

    @Override // com.yandex.go.navigation.api.router.BaseRootNavigationRouter
    public final BaseRootNavigationRouter.a P() {
        return this.E;
    }
}
