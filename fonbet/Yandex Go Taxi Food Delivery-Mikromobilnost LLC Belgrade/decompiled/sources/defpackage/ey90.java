package defpackage;

import com.google.common.collect.ImmutableSet;
import com.yandex.go.payments.badges.a;
import com.yandex.go.payments.data.c;
import com.yandex.go.payments.domain.l0;
import com.yandex.go.payments.googlepay.domain.e;
import com.yandex.go.payments.lpm.navigation.d;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes8.dex */
public final class ey90 implements by90 {
    public final hbp0 a;
    public final e5g b;
    public final AtomicBoolean c = new AtomicBoolean(false);

    public ey90(hbp0 hbp0Var, e5g e5gVar, tt2 tt2Var) {
        this.a = hbp0Var;
        this.b = e5gVar;
    }

    @Override // defpackage.by90
    public final d a() {
        e5g e5gVar = this.b;
        c0g c0gVar = (c0g) ((i6r) e5gVar.a);
        a x1 = c0gVar.x1();
        String str = (String) e5gVar.b;
        c cVar = (c) c0gVar.z.Ro.get();
        q5z.h(cVar);
        return new d(x1, str, cVar, c0gVar, (uba0) e5gVar.c, (eyz) ((n3w) e5gVar.e).a, (wyz) ((n3w) e5gVar.f).a);
    }

    @Override // defpackage.by90
    public final l0 b() {
        e5g e5gVar = this.b;
        nfa0 nfa0Var = (nfa0) ((xvf0) e5gVar.j).get();
        c0g c0gVar = (c0g) ((i6r) e5gVar.a);
        e eVar = (e) c0gVar.z.Z8.get();
        q5z.h(eVar);
        com.yandex.go.payments.superapp.payment.a aVar = new com.yandex.go.payments.superapp.payment.a(c0gVar.w, eVar);
        tt2 k = c0gVar.k();
        q5z.h(k);
        fqh fqhVar = new fqh();
        aiq0 aiq0Var = (aiq0) ((xvf0) e5gVar.k).get();
        return new l0(nfa0Var, aVar, k, fqhVar, aiq0Var);
    }

    @Override // defpackage.by90
    public final bia0 c() {
        return new qy90(this.b.a());
    }

    @Override // defpackage.by90
    public final z0a0 d() {
        e5g e5gVar = this.b;
        c0g c0gVar = (c0g) ((i6r) e5gVar.a);
        zuj0 c = c0gVar.c();
        q5z.h(c);
        uma0 a = e5gVar.a();
        pav e = c0gVar.e();
        q5z.h(e);
        k7x0 s6 = c0gVar.s6();
        q5z.h(s6);
        return new g1a0(c, a, e, s6, c0gVar.z.b1());
    }

    @Override // defpackage.by90
    public final void dispose() {
        this.a.b();
        Iterator<E> it = ImmutableSet.q((com.yandex.go.payments.superapp.a) ((xvf0) this.b.n).get()).iterator();
        while (it.hasNext()) {
            ((com.yandex.go.payments.superapp.a) it.next()).getClass();
        }
    }
}
