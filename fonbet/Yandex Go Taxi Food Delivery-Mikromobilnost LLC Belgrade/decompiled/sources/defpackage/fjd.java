package defpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.yandex.go.address.search.common.presenter.a;
import com.yandex.go.address.search.common.presenter.d;
import com.yandex.go.address.search.perf.b;
import com.yandex.go.route.interactor.c;
import ru.yandex.taxi.address.design.SourceDestinationComponentV2;
import ru.yandex.taxi.address.experiment.q;
import ru.yandex.taxi.address.repository.f;
import ru.yandex.taxi.experiments.mainscreen.MainScreenBehavior;
import ru.yandex.taxi.search.address.view.CompositeAddressSearchView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.search.g;
import ru.yandex.taxi.search.view.BaseAddressSearchView;

/* loaded from: classes12.dex */
public final class fjd extends zw4 {
    public final a l;
    public final g m;
    public i61 n;
    public yfa o;
    public PointType p;
    public Uri q;
    public boolean r;
    public boolean s;
    public b t;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public fjd(xy4 xy4Var) {
        super(r1, r2, new bw0(r0, r4, r5), r9.e(), r9.b(), r9.I0(), r9.c(), r9.L());
        apf apfVar = (apf) xy4Var;
        Activity N = apfVar.N();
        ney d = apfVar.d();
        c0g c0gVar = (c0g) ((i6r) apfVar.b);
        Context H1 = c0gVar.H1();
        q5z.h(H1);
        hbm hbmVar = new hbm(H1);
        tk51 t1 = c0gVar.t1();
        q5z.h(t1);
        f m6 = c0gVar.m6();
        q5z.h(m6);
        p1b p1bVar = (p1b) apfVar.c;
        d a = ((sjt0) p1bVar.a).a();
        q5z.i(a);
        com.yandex.go.address.search.common.presenter.b a2 = ((f0j) p1bVar.b).a();
        q5z.i(a2);
        tit0 tit0Var = (tit0) c0gVar.ci.get();
        q5z.h(tit0Var);
        ru.yandex.taxi.styling.f T5 = c0gVar.T5();
        caq0 caq0Var = new caq0();
        pho T1 = c0gVar.T1();
        q5z.h(T1);
        o61 o61Var = new o61(T1);
        j800 i1 = c0gVar.i1();
        q5z.h(i1);
        vbb vbbVar = new vbb(o61Var, i1);
        Context H12 = c0gVar.H1();
        q5z.h(H12);
        tt2 k = c0gVar.k();
        q5z.h(k);
        ru.yandex.taxi.search.a aVar = new ru.yandex.taxi.search.a(H12, k, c0gVar.d6());
        zzf zzfVar = c0gVar.z;
        c A1 = zzfVar.A1();
        po21 C6 = c0gVar.C6();
        q5z.h(C6);
        atd0 V5 = c0gVar.V5();
        q5z.h(V5);
        tt2 k2 = c0gVar.k();
        q5z.h(k2);
        com.yandex.go.address.search.common.deeplink.a aVar2 = new com.yandex.go.address.search.common.deeplink.a(A1, C6, V5, k2);
        q I5 = c0gVar.I5();
        q5z.h(I5);
        wiq0 c6 = c0gVar.c6();
        q5z.h(c6);
        com.yandex.go.navigation.screen.c S = c0gVar.S();
        q5z.h(S);
        ru.yandex.taxi.search.c cVar = new ru.yandex.taxi.search.c(I5, c6, S);
        rqo l1 = c0gVar.l1();
        q5z.h(l1);
        ul5 ul5Var = new ul5(l1, 1);
        cwh o6 = c0gVar.o6();
        zuj0 c = c0gVar.c();
        q5z.h(c);
        zxs0 zxs0Var = new zxs0(o6, c);
        cwh o62 = c0gVar.o6();
        zuj0 c2 = c0gVar.c();
        q5z.h(c2);
        mrj mrjVar = new mrj(o62, c2, (hgf) ((xvf0) apfVar.x).get());
        com.yandex.go.zone.interactors.b n = zzfVar.n();
        MainScreenBehavior mainScreenBehavior = MainScreenBehavior.SHORTCUTS;
        q5z.i(mainScreenBehavior);
        w4l0 w4l0Var = (w4l0) apfVar.w;
        kvh s1 = c0gVar.s1();
        kvh s12 = c0gVar.s1();
        com.yandex.go.address.search.perf.c p6 = c0gVar.p6();
        q5z.h(p6);
        pwy0 w6 = c0gVar.w6();
        q5z.h(w6);
        this.l = new a(a, a2, tit0Var, T5, caq0Var, vbbVar, aVar, aVar2, cVar, ul5Var, zxs0Var, mrjVar, n, mainScreenBehavior, w4l0Var, s1, s12, p6, w6);
        Context H13 = c0gVar.H1();
        q5z.h(H13);
        pav e = c0gVar.e();
        q5z.h(e);
        SourceDestinationComponentV2 sourceDestinationComponentV2 = new SourceDestinationComponentV2(H13, e);
        zuj0 c3 = c0gVar.c();
        q5z.h(c3);
        this.m = new g(sourceDestinationComponentV2, c3);
        this.n = (i61) ((zxf0) pwf0.c(i61.class));
        this.p = PointType.SOURCE;
        this.r = true;
    }

    @Override // defpackage.zw4
    public final BaseAddressSearchView a() {
        return new CompositeAddressSearchView(this, null);
    }

    public final void d() {
        this.r = false;
    }

    public final void e(PointType pointType) {
        this.p = pointType;
    }

    public final void f(m61 m61Var) {
        this.n = m61Var;
    }
}
