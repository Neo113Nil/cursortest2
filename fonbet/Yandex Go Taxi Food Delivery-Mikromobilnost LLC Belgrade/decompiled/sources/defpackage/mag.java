package defpackage;

import android.content.Context;
import com.yandex.go.mainscreen.superapp.orders.domain.h;
import com.yandex.go.mainscreen.superapp.orders.presentation.ui.SuperAppMainScreenOrdersView;
import com.yandex.go.superapp.orders.card.experiments.y;

/* loaded from: classes.dex */
public final class mag implements i4w0 {
    public final i6r a;
    public final va90 b;
    public final lag c;
    public final u5g d;
    public final n3w e;
    public final xvf0 f;
    public final lag g;
    public final xvf0 h;

    public mag(i6r i6rVar, va90 va90Var) {
        this.a = i6rVar;
        this.b = va90Var;
        u5g u5gVar = new u5g(i6rVar, 27);
        lag lagVar = new lag(i6rVar, 11);
        int i = 7;
        lag lagVar2 = new lag(i6rVar, i);
        this.c = lagVar2;
        lag lagVar3 = new lag(i6rVar, 10);
        lag lagVar4 = new lag(i6rVar, 14);
        lag lagVar5 = new lag(i6rVar, 3);
        u5g u5gVar2 = new u5g(i6rVar, 28);
        this.d = u5gVar2;
        rxm0 rxm0Var = new rxm0(u5gVar2, new lag(i6rVar, 15), new lag(i6rVar, 16), new lag(i6rVar, 9), 22);
        int i2 = 12;
        int i3 = 2;
        this.e = n3w.a(new ehw0(new dhw0(rxm0Var, u5gVar, lagVar, lagVar2, lagVar3, lagVar4, lagVar5, new lag(i6rVar, i2), new lag(i6rVar, i3))));
        this.f = i5m.b(new e6v0(this.c, i2));
        this.g = new lag(i6rVar, 1);
        lag lagVar6 = new lag(i6rVar, 0);
        lag lagVar7 = new lag(i6rVar, 5);
        int i4 = 8;
        this.h = i5m.b(new uwn0(lagVar6, new xsi((xvf0) lagVar7, (xvf0) new qsn(new lag(i6rVar, 4), i), (xvf0) new g3p(lagVar7, new u5g(i6rVar, 29), i3), i4), new lag(i6rVar, 6), new lag(i6rVar, 13), lagVar7, new lag(i6rVar, i4), this.d, 5));
    }

    public final SuperAppMainScreenOrdersView a() {
        c0g c0gVar = (c0g) this.a;
        Context e2 = c0gVar.e2();
        q5z.h(e2);
        ney y2 = c0gVar.y2();
        q5z.h(y2);
        tt2 Z1 = c0gVar.Z1();
        q5z.h(Z1);
        kmr kmrVar = (kmr) c0gVar.A.a.W2.get();
        q5z.h(kmrVar);
        geu0 geu0Var = (geu0) c0gVar.iq.get();
        q5z.h(geu0Var);
        tt2 Z12 = c0gVar.Z1();
        q5z.h(Z12);
        r551 r551Var = (r551) c0gVar.Lm.get();
        q5z.h(r551Var);
        r2w0 r2w0Var = new r2w0(y2, Z1, this.b, kmrVar, geu0Var, new h(Z12, r551Var, d441.a((wcg) c0gVar.Jm.get()), c0gVar.Y2()), (ehw0) this.e.a, (v9s0) this.f.get());
        pav w2 = c0gVar.w2();
        q5z.h(w2);
        jyw0 jyw0Var = new jyw0(w2, this.g);
        y yVar = (y) c0gVar.z.O3.get();
        q5z.h(yVar);
        return new SuperAppMainScreenOrdersView(e2, r2w0Var, jyw0Var, yVar);
    }
}
