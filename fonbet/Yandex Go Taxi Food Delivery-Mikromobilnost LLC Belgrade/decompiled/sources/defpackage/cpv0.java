package defpackage;

import com.yandex.go.taxi.tariffs.internal.repository.k;
import java.util.List;
import kotlin.Pair;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.repository.f;
import ru.yandex.taxi.design.sourcedestination.DestinationTrailMode;
import ru.yandex.taxi.hints.interactors.c;
import ru.yandex.taxi.preorder.summary.solid.sourcedestination.b;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class cpv0 {
    public b A;
    public final r0 B;
    public final r0 C;
    public final amp0 a;
    public final com.yandex.go.route.interactor.b b;
    public final s0c0 c;
    public final ck31 d;
    public final tt2 e;
    public final y5s0 f;
    public final c g;
    public final w810 h;
    public final wiq0 i;
    public final ekz j;
    public final wae0 k;
    public final dqe0 l;
    public final com.yandex.go.route.interactor.c m;
    public final f n;
    public final yjt0 o;
    public final p0j p;
    public final e q;
    public final com.yandex.go.taxi.summary.shared.sourcedestination.c r;
    public final pwy0 s;
    public final ixb t;
    public final sue0 u;
    public final hbp0 v = vms.h(3, null);
    public final hbp0 w = vms.h(3, null);
    public Pair x;
    public lct0 y;
    public final r0 z;

    public cpv0(amp0 amp0Var, com.yandex.go.route.interactor.b bVar, s0c0 s0c0Var, ck31 ck31Var, tt2 tt2Var, y5s0 y5s0Var, c cVar, w810 w810Var, wiq0 wiq0Var, ekz ekzVar, wae0 wae0Var, dqe0 dqe0Var, com.yandex.go.route.interactor.c cVar2, f fVar, yjt0 yjt0Var, p0j p0jVar, e eVar, com.yandex.go.taxi.summary.shared.sourcedestination.c cVar3, pwy0 pwy0Var, ixb ixbVar, sue0 sue0Var) {
        this.a = amp0Var;
        this.b = bVar;
        this.c = s0c0Var;
        this.d = ck31Var;
        this.e = tt2Var;
        this.f = y5s0Var;
        this.g = cVar;
        this.h = w810Var;
        this.i = wiq0Var;
        this.j = ekzVar;
        this.k = wae0Var;
        this.l = dqe0Var;
        this.m = cVar2;
        this.n = fVar;
        this.o = yjt0Var;
        this.p = p0jVar;
        this.q = eVar;
        this.r = cVar3;
        this.s = pwy0Var;
        this.t = ixbVar;
        this.u = sue0Var;
        mct0 mct0Var = mct0.m;
        this.y = new lct0();
        this.z = bvf0.c(mct0.m);
        this.B = bvf0.c(new zov0(null, ""));
        this.C = bvf0.c(null);
    }

    public final void a() {
        b();
        d();
        pex0 m = ((k) this.i).m();
        if (m == null) {
            return;
        }
        this.f.a(m);
    }

    public final void b() {
        d();
        pex0 m = ((k) this.i).m();
        this.y.a = this.o.b(m != null ? m.B0.a : false);
        mct0 a = this.y.a();
        r0 r0Var = this.z;
        r0Var.getClass();
        r0Var.m(null, a);
        c();
    }

    public final void c() {
        String a = ((jxb) this.t).a();
        r0 r0Var = this.z;
        if (a != null) {
            lct0 lct0Var = this.y;
            lct0Var.f = DestinationTrailMode.NONE;
            lct0Var.b(a);
            mct0 a2 = this.y.a();
            r0Var.getClass();
            r0Var.m(null, a2);
            return;
        }
        List list = this.m.c().b;
        pex0 m = ((k) this.i).m();
        boolean z = m != null ? m.B0.a : false;
        boolean isEmpty = list.isEmpty();
        lct0 lct0Var2 = this.y;
        if (isEmpty) {
            lct0Var2.f = DestinationTrailMode.NONE;
            lct0Var2.b("");
            mct0 a3 = this.y.a();
            r0Var.getClass();
            r0Var.m(null, a3);
            return;
        }
        lct0Var2.f = list.size() < this.h.a() ? DestinationTrailMode.ADD_DESTINATION : DestinationTrailMode.NONE;
        int size = list.size();
        lct0 lct0Var3 = this.y;
        p0j p0jVar = this.p;
        if (size == 1) {
            lct0Var3.b(p0jVar.c(z));
        } else {
            String c = p0jVar.c(z);
            int size2 = list.size();
            lct0Var3.d = c;
            lct0Var3.l = size2;
        }
        mct0 a4 = this.y.a();
        r0Var.getClass();
        r0Var.m(null, a4);
    }

    public final void d() {
        pex0 m = ((k) this.i).m();
        boolean z = m != null ? m.B0.a : false;
        this.y.b = this.o.a(z);
        String a = ((jxb) this.t).a();
        lct0 lct0Var = this.y;
        if (a != null) {
            lct0Var.e = null;
        } else {
            lct0Var.e = this.p.b(z);
        }
    }
}
