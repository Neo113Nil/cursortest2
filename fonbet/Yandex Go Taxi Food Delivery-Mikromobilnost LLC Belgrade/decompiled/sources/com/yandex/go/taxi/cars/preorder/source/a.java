package com.yandex.go.taxi.cars.preorder.source;

import com.yandex.go.address.models.Address;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import defpackage.ah00;
import defpackage.c09;
import defpackage.f4c0;
import defpackage.gh00;
import defpackage.hr7;
import defpackage.hst;
import defpackage.j4h0;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.jst;
import defpackage.m7x0;
import defpackage.mzz;
import defpackage.n58;
import defpackage.o58;
import defpackage.p58;
import defpackage.pb30;
import defpackage.pzt0;
import defpackage.qxy;
import defpackage.r8;
import defpackage.rol0;
import defpackage.rxy;
import defpackage.tje;
import defpackage.u3c0;
import defpackage.v4r0;
import defpackage.xm00;
import defpackage.xz8;
import defpackage.zg21;
import defpackage.zzs;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.o;

/* loaded from: classes14.dex */
public final class a extends r8 implements hr7, xz8 {
    public xm00 A;
    public final c09 c;
    public final p58 w;
    public final xm00 x;
    public boolean y;
    public boolean z;

    public a(ah00 ah00Var, c09 c09Var, p58 p58Var, xm00 xm00Var) {
        super(5, ah00Var);
        this.c = c09Var;
        this.w = p58Var;
        this.x = xm00Var;
    }

    public final void Hg() {
        c09 c09Var = this.c;
        c09Var.Bg(this);
        tje.N(c09Var.Jg(), null, null, new CarsOnMapPresenter$attachView$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(new jqr(new o(kotlinx.coroutines.flow.e.M(c09Var.x.b.b, null, 3), new CarsOnMapPresenter$attachView$1(3, null)), new CarsOnMapPresenter$attachView$2(c09Var, null), 3), c09Var.z), null), 3);
    }

    public final void Ig() {
        ((gh00) ((ah00) this.b)).u(this);
        pzt0 pzt0Var = this.w.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.c.pause();
    }

    public final void Jg() {
        this.c.resume();
        ((gh00) ((ah00) this.b)).e(this);
        p58 p58Var = this.w;
        p58Var.h = tje.N(p58Var.a, null, null, new CarMapObjectAdapter$resume$$inlined$safeCollectIn$1(p58Var.c.d(), null, p58Var), 3);
    }

    @Override // defpackage.xz8
    public final zzs ad() {
        return ((gh00) ((ah00) this.b)).e.b();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0121  */
    @Override // defpackage.xz8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void gc(Map map) {
        Iterator it;
        a aVar = this;
        xm00 xm00Var = aVar.A;
        if (xm00Var == null) {
            xm00Var = aVar.x.p();
            xm00Var.i(aVar.y);
            aVar.A = xm00Var;
        }
        float j = ((gh00) ((ah00) aVar.b)).j();
        p58 p58Var = aVar.w;
        HashMap hashMap = p58Var.g;
        rxy rxyVar = p58Var.f;
        LinkedHashSet h = v4r0.h(hashMap.keySet(), map.keySet());
        Iterator it2 = map.values().iterator();
        while (it2.hasNext()) {
            p58Var.e.b(((pb30) it2.next()).a, false);
        }
        Iterator it3 = h.iterator();
        while (it3.hasNext()) {
            String str = (String) it3.next();
            pb30 pb30Var = (pb30) map.get(str);
            n58 n58Var = (n58) hashMap.get(str);
            if (pb30Var == null) {
                if (n58Var != null) {
                    n58Var.b();
                }
                hashMap.remove(str);
            } else if (pb30Var.b) {
                if (n58Var == null && pb30Var.c) {
                    Point point = pb30Var.x;
                    if (point == null) {
                        hst hstVar = jst.e;
                        new IllegalStateException("Missed car point");
                        hstVar.getClass();
                        it = it3;
                    } else {
                        String str2 = pb30Var.a;
                        mzz mzzVar = p58Var.i;
                        qxy qxyVar = (qxy) mzzVar.c(str2);
                        if (qxyVar != null) {
                            it = it3;
                        } else {
                            ru.yandex.taxi.preorder.source.cars.a aVar2 = p58Var.c;
                            aVar2.getClass();
                            String a = ((m7x0) aVar2.c).a(String.format(Locale.US, "class_%s_poi", Arrays.copyOf(new Object[]{str2}, 1)));
                            it = it3;
                            zg21 zg21Var = new zg21(rxyVar.a, a, new o58(0, p58Var, str2));
                            String b = aVar2.b(str2);
                            if (!jl40.l(b, a)) {
                                zg21Var = new zg21(rxyVar.a, b, zg21Var);
                            }
                            qxyVar = new u3c0(rxyVar.b, zg21Var, j4h0.empty_dot);
                            mzzVar.d(str2, qxyVar);
                        }
                        if (qxyVar.a()) {
                            f4c0 r = xm00Var.r(point);
                            p58Var.b.a();
                            n58Var = new n58(r, p58Var.d, pb30Var, xm00Var);
                            if (n58Var != null) {
                                hashMap.put(str, n58Var);
                            }
                        }
                    }
                    n58Var = null;
                    if (n58Var != null) {
                    }
                } else {
                    it = it3;
                }
                if (n58Var != null) {
                    n58Var.c(j);
                    n58Var.a(pb30Var);
                }
                aVar = this;
                it3 = it;
            } else {
                if (n58Var != null && n58Var.d.b) {
                    aVar.c.x.b(str);
                }
                if (n58Var != null) {
                    n58Var.c(j);
                    n58Var.a(pb30Var);
                }
            }
        }
    }

    @Override // defpackage.hr7
    public final void h(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        zzs ad;
        if (z) {
            c09 c09Var = this.c;
            n0 n0Var = c09Var.A;
            j jVar = (j) c09Var;
            Address g = jVar.F.g();
            if (g == null || (ad = g.B()) == null) {
                ad = ((xz8) jVar.Dg()).ad();
            }
            n0Var.g(ad);
        }
    }

    @Override // defpackage.xz8
    public final void startAnimation() {
        c09 c09Var = this.c;
        pzt0 pzt0Var = c09Var.C;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        c09Var.C = tje.N(c09Var.Jg(), null, null, new CarsOnMapPresenter$startAnimation$$inlined$safeCollectIn$1(new c(new rol0(new CarsOnMapPresenter$startAnimation$1(2, null)), c09Var), null, c09Var), 3);
    }

    @Override // defpackage.xz8
    public final void stopAnimation() {
        pzt0 pzt0Var = this.c.C;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
    }
}
