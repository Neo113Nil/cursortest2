package xsna;

import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.internal.functions.a;

/* compiled from: VideoCommentsThreadPaginator.kt */
/* loaded from: classes4.dex */
public final class mcs0 extends td90 {
    public final com.vk.lists.c i;
    public final ics0 j;
    public int k;
    public boolean l;
    public final s170 m;

    public mcs0(com.vk.lists.c cVar, ics0 ics0Var) {
        this.i = cVar;
        this.j = ics0Var;
        s170 s170Var = new s170();
        s170Var.g();
        this.m = s170Var;
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> d() {
        if (this.f == 1) {
            return p0();
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 s = s(this.i.i(), 50, null);
        dh40 dh40Var = new dh40(new hfm0(this, 12), 23);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return s.E(dh40Var, lVar, kVar, kVar);
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> e() {
        this.f = 0;
        com.vk.lists.c cVar = this.i;
        cVar.r(true);
        cVar.q(0);
        return d();
    }

    @Override // xsna.td90, xsna.sd90
    public final void g() {
        com.vk.lists.c cVar = this.i;
        String j = cVar.j();
        if (j == null || j.length() == 0 || !cVar.z) {
            return;
        }
        cVar.q(cVar.i() - 1);
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.internal.operators.observable.b0 h(int i) {
        io.reactivex.rxjava3.internal.operators.observable.j1 s = s(-50, 100, Integer.valueOf(i));
        pmu pmuVar = new pmu(new mdm0(this, 15), 29);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return s.E(pmuVar, lVar, kVar, kVar);
    }

    @Override // xsna.td90, xsna.sd90
    public final void i() {
        com.vk.lists.c cVar = this.i;
        if (cVar.z) {
            cVar.q(cVar.i() + 1);
        }
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> l() {
        this.f = 1;
        this.m.e(0);
        this.i.r(false);
        return p0();
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q n(io.reactivex.rxjava3.core.q qVar) {
        return this.i.g(qVar, true, false);
    }

    @Override // xsna.td90, xsna.sd90
    public final void o(int i) {
        this.k = i;
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> p0() {
        if (this.l) {
            return io.reactivex.rxjava3.internal.operators.observable.g0.b;
        }
        this.l = true;
        int a = this.m.a();
        boolean z = a == 0;
        io.reactivex.rxjava3.internal.operators.observable.j1 s = s(a, 50, null);
        cdd cddVar = new cdd(this, 3);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.observable.c0(s.E(lVar, lVar, kVar, cddVar), lVar, new hgb(this, 4)).E(new k5j0(new sd1(z, this, 5), 15), lVar, kVar, kVar).F(new onm0(new ksg0(this, 18), 4));
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 s(int i, int i2, Integer num) {
        int i3 = this.b;
        UserId userId = this.a;
        String str = this.c;
        int i4 = this.k;
        int i5 = this.f;
        return this.j.c(new owt(i3, userId, str, num, Integer.valueOf(i4), i5 == 1, true, i2, Integer.valueOf(i), i5 == 0 ? VideoGetCommentsExtendedSortDto.OLDEST_COMMENT_FIRST : VideoGetCommentsExtendedSortDto.NEWEST_COMMENT_FIRST, this.g));
    }
}
