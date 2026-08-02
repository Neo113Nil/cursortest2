package defpackage;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.feed.ui.TaxiOrderFlexView;
import flex.engine.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes14.dex */
public final class crq implements brq {
    public final mir a;
    public final i6r b;
    public final f0g c;
    public final i6r d;
    public final xu70 e;

    public crq(mir mirVar, i6r i6rVar, f0g f0gVar, i6r i6rVar2, xu70 xu70Var) {
        this.a = mirVar;
        this.b = i6rVar;
        this.c = f0gVar;
        this.d = i6rVar2;
        this.e = xu70Var;
    }

    @Override // defpackage.brq
    public final ylr a(l7s0 l7s0Var) {
        gym gymVar = new gym(l7s0Var);
        i6r i6rVar = this.b;
        i6rVar.getClass();
        f0g f0gVar = this.c;
        f0gVar.getClass();
        i6r i6rVar2 = this.d;
        i6rVar2.getClass();
        xu70 xu70Var = this.e;
        xu70Var.getClass();
        mir mirVar = this.a;
        mirVar.getClass();
        n3w a = n3w.a(mirVar);
        eqh eqhVar = new eqh();
        xvf0 b = i5m.b(iqq.a);
        nqq nqqVar = new nqq(eqhVar, b);
        n3w a2 = n3w.a(xu70Var);
        o4g o4gVar = new o4g(i6rVar, 7);
        o4g o4gVar2 = new o4g(i6rVar, 8);
        n3w n3wVar = y2r0.c;
        ArrayList arrayList = new ArrayList(2);
        List list = Collections.EMPTY_LIST;
        arrayList.add(zu70.a);
        arrayList.add(lrq.a);
        xvf0 b2 = i5m.b(new ys10(o4gVar2, new y2r0(arrayList, list), 25));
        xvf0 b3 = i5m.b(new fy30(a, nqqVar, a2, new ge50(o4gVar, a2, b2, new o4g(i6rVar, 9)), new o4g(i6rVar2, 15), new o4g(i6rVar, 14), new o4g(i6rVar, 13), i5m.b(new t160(b2, 23)), 2));
        eqh.a(eqhVar, i5m.b(new t160(b3, 25)));
        xvf0 b4 = i5m.b(new t160(b3, 26));
        ubq0 ubq0Var = new ubq0(new o4g(i6rVar2, 10), new o4g(i6rVar2, 11), new o4g(i6rVar2, 19), new o4g(i6rVar2, 20), new o4g(i6rVar, 18), new o4g(i6rVar, 12), i5m.b(new lq40(26, o4gVar)));
        xvf0 b5 = i5m.b(new ys10(new o4g(i6rVar, 16), a2, 26));
        xvf0 b6 = i5m.b(new lq40(25, new o4g(i6rVar, 17)));
        c0g c0gVar = (c0g) i6rVar;
        Context e2 = c0gVar.e2();
        q5z.h(e2);
        a aVar = (a) eqhVar.get();
        c0g c0gVar2 = (c0g) i6rVar2;
        Lifecycle lifecycle = (Lifecycle) c0gVar2.P.get();
        q5z.h(lifecycle);
        h3y a3 = i5m.a(b4);
        zzf zzfVar = c0gVar2.z;
        f0 f0Var = (f0) zzfVar.Nl.get();
        q5z.h(f0Var);
        w9w0 y1 = zzfVar.y1();
        Context e22 = c0gVar.e2();
        q5z.h(e22);
        h3y a4 = i5m.a(ubq0Var);
        tt2 Z1 = c0gVar.Z1();
        q5z.h(Z1);
        cp60 cp60Var = (cp60) c0gVar.z.s7.get();
        q5z.h(cp60Var);
        com.yandex.go.taxi.order.feed.data.a aVar2 = new com.yandex.go.taxi.order.feed.data.a(a3, xu70Var, f0Var, y1, e22, a4, Z1, cp60Var, (dv70) b5.get());
        hqq hqqVar = (hqq) b.get();
        gep0 gep0Var = (gep0) zzfVar.Wf.get();
        q5z.h(gep0Var);
        sei0 sei0Var = (sei0) b6.get();
        com.yandex.div.core.expression.variables.a aVar3 = (com.yandex.div.core.expression.variables.a) b2.get();
        grq grqVar = (grq) f0gVar.W5.get();
        q5z.h(grqVar);
        return new TaxiOrderFlexView(e2, aVar, lifecycle, aVar2, hqqVar, gymVar, gep0Var, sei0Var, aVar3, grqVar);
    }
}
