package xsna;

import com.vk.api.generated.video.dto.VideoGetCommentsExtendedSortDto;
import com.vk.dto.common.id.UserId;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.List;

/* compiled from: ClipsCommentsThreadPaginator.kt */
/* loaded from: classes4.dex */
public final class und extends td90 implements ldp0 {
    public final com.vk.lists.c i;
    public final fae j;
    public int k;
    public boolean l;
    public final s170 m;

    public und(com.vk.lists.c cVar, fae faeVar) {
        this.i = cVar;
        this.j = faeVar;
        s170 s170Var = new s170();
        s170Var.g();
        this.m = s170Var;
    }

    public static /* synthetic */ io.reactivex.rxjava3.internal.operators.observable.j1 t(und undVar, int i, Integer num, int i2) {
        if ((i2 & 4) != 0) {
            num = null;
        }
        return undVar.s(i, 50, num);
    }

    @Override // xsna.sd90
    public final io.reactivex.rxjava3.core.q<vqt> d() {
        if (this.f == 1) {
            return p0();
        }
        io.reactivex.rxjava3.internal.operators.observable.j1 t = t(this, this.i.i(), null, 6);
        mp0 mp0Var = new mp0(new wl0(this, 17), 9);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return t.E(mp0Var, lVar, kVar, kVar);
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
        io.reactivex.rxjava3.internal.operators.observable.j1 s = s(Math.max(0, -50), 100, null);
        t00 t00Var = new t00(new t40(this, 20), 15);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return s.E(t00Var, lVar, kVar, kVar);
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
        io.reactivex.rxjava3.internal.operators.observable.j1 t = t(this, a, null, 6);
        sbb sbbVar = new sbb(this, 1);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return new io.reactivex.rxjava3.internal.operators.observable.c0(t.E(lVar, lVar, kVar, sbbVar), lVar, new ul0(this, 2)).E(new y00(new tnd(z, this, 0), 11), lVar, kVar, kVar).F(new vl0(new s6(this, 19), 10));
    }

    @Override // xsna.ldp0
    public final io.reactivex.rxjava3.internal.operators.observable.b0 q(int i) {
        this.f = 0;
        io.reactivex.rxjava3.internal.operators.observable.j1 t = t(this, 0, Integer.valueOf(i), 2);
        ga gaVar = new ga(new com.vk.movika.sdk.base.logic.interactor.d(this, 28), 16);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        return t.E(gaVar, lVar, kVar, kVar);
    }

    public final io.reactivex.rxjava3.internal.operators.observable.j1 s(int i, int i2, Integer num) {
        uft0 uft0Var = new uft0();
        int i3 = this.b;
        UserId userId = this.a;
        String str = this.c;
        int i4 = this.k;
        VideoGetCommentsExtendedSortDto videoGetCommentsExtendedSortDto = this.f == 0 ? VideoGetCommentsExtendedSortDto.OLDEST_COMMENT_FIRST : VideoGetCommentsExtendedSortDto.NEWEST_COMMENT_FIRST;
        List<String> list = eae.b;
        Boolean bool = Boolean.TRUE;
        dz2 x = yfb.x(tft0.C(uft0Var, i3, userId, str, bool, num, Integer.valueOf(i), Integer.valueOf(i2), videoGetCommentsExtendedSortDto, list, bool, Integer.valueOf(i4), null, 12544));
        ahn.D(x);
        return rsg0.y0(x, null, null, 3).U(new vx6(new pd(this, 26), 8));
    }
}
