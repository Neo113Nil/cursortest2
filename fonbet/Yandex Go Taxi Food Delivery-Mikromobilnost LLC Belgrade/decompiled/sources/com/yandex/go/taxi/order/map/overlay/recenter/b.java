package com.yandex.go.taxi.order.map.overlay.recenter;

import android.graphics.Rect;
import android.os.Handler;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment;
import com.yandex.go.taxi.order.recenter.e;
import com.yandex.go.taxi.order.recenter.g;
import com.yandex.go.taxi.order.recenter.i;
import com.yandex.go.taxi.order.recenter.k;
import com.yandex.go.taxi.order.recenter.m;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.a3y0;
import defpackage.ah00;
import defpackage.bgi0;
import defpackage.cgi0;
import defpackage.dgi0;
import defpackage.el00;
import defpackage.fi6;
import defpackage.ge61;
import defpackage.ggi0;
import defpackage.gh00;
import defpackage.gjm;
import defpackage.h0w;
import defpackage.he61;
import defpackage.hgi0;
import defpackage.i641;
import defpackage.igi0;
import defpackage.jdj;
import defpackage.kf00;
import defpackage.ljf;
import defpackage.mtg;
import defpackage.mvd0;
import defpackage.ny61;
import defpackage.nz2;
import defpackage.o2y0;
import defpackage.o8g0;
import defpackage.oyr;
import defpackage.p201;
import defpackage.pzt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vmz;
import defpackage.w511;
import defpackage.wt1;
import defpackage.xjg;
import defpackage.y980;
import defpackage.yay0;
import defpackage.yz70;
import defpackage.zch;
import defpackage.zy11;
import defpackage.zzs;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map.overlay.RecenterType;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class b implements cgi0 {
    public final tse a;
    public final ah00 b;
    public final o2y0 c;
    public final y980 d;
    public final wt1 e;
    public final i641 f;
    public final gjm g;
    public final he61 h;
    public final hgi0 i;
    public final dgi0 j;
    public final mvd0 k;
    public final zch l;
    public final igi0 m;
    public final nz2 n;
    public final h0w o;
    public final ljf p;
    public final xjg q;
    public final o8g0 r;
    public final el00 s;
    public final a3y0 t = new a3y0(TaxiOrderLogGroup.MAP.getTag(), "RecenterInteractor");
    public final mtg u = new mtg(this);
    public pzt0 v;
    public List w;
    public boolean x;

    public b(tse tseVar, ah00 ah00Var, o2y0 o2y0Var, y980 y980Var, wt1 wt1Var, i641 i641Var, gjm gjmVar, he61 he61Var, hgi0 hgi0Var, dgi0 dgi0Var, mvd0 mvd0Var, zch zchVar, igi0 igi0Var, nz2 nz2Var, h0w h0wVar, ljf ljfVar, xjg xjgVar, o8g0 o8g0Var, el00 el00Var) {
        this.a = tseVar;
        this.b = ah00Var;
        this.c = o2y0Var;
        this.d = y980Var;
        this.e = wt1Var;
        this.f = i641Var;
        this.g = gjmVar;
        this.h = he61Var;
        this.i = hgi0Var;
        this.j = dgi0Var;
        this.k = mvd0Var;
        this.l = zchVar;
        this.m = igi0Var;
        this.n = nz2Var;
        this.o = h0wVar;
        this.p = ljfVar;
        this.q = xjgVar;
        this.r = o8g0Var;
        this.s = el00Var;
    }

    @Override // defpackage.cgi0
    public final Point a(WalkRouteOrderExperiment.OrderStatusRule.PointType pointType) {
        return this.k.a(pointType);
    }

    @Override // defpackage.cgi0
    public final boolean b() {
        jdj jdjVar = this.n.f;
        p201 Q2 = ((yay0) jdjVar.c).a((o2y0) jdjVar.w).Q2();
        return Q2 != null && Q2.a;
    }

    @Override // defpackage.cgi0
    public final void c() {
        this.i.a();
    }

    @Override // defpackage.cgi0
    public final void d() {
        this.x = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        if (r7 != ru.yandex.taxi.map.overlay.RecenterType.SAVED_POSITION) goto L11;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    @Override // defpackage.cgi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(RecenterType recenterType, boolean z, Continuation continuation) {
        String str;
        switch (bgi0.a[recenterType.ordinal()]) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                ggi0 l = l(recenterType);
                fi6 fi6Var = new fi6();
                l.f(fi6Var, this.w);
                if (fi6Var.i()) {
                    break;
                }
                dgi0 dgi0Var = this.j;
                dgi0Var.c = recenterType;
                this.i.a();
                a3y0.a(this.t, new String[]{"triggerRecenter"}, null, 6);
                if (z) {
                    RecenterType recenterType2 = dgi0Var.c;
                    he61 he61Var = this.h;
                    kf00 kf00Var = he61Var.a;
                    int i = ge61.a[recenterType2.ordinal()];
                    if (i == 1) {
                        str = "all_route";
                    } else if (i == 2) {
                        str = "user_location";
                    } else if (i == 3) {
                        str = "destination";
                    } else if (i != 4) {
                        a3y0.m((a3y0) he61Var.b.getValue(), "mapRecenterTypeToAnalyticName", new IllegalStateException("Unknown recenterType"), null, 4);
                        str = recenterType2.name();
                    } else {
                        str = "custom_from_order";
                    }
                    HashMap A = oyr.A(kf00Var);
                    if (str != null) {
                        A.put("button_type", str);
                    }
                    kf00Var.a.a("Map.DidTapLocationButton", A, 1, new HashMap());
                }
                this.d.a(true);
                return i(true, true, continuation);
            case 1:
                recenterType = RecenterType.ALL_ROUTE;
                dgi0 dgi0Var2 = this.j;
                dgi0Var2.c = recenterType;
                this.i.a();
                a3y0.a(this.t, new String[]{"triggerRecenter"}, null, 6);
                if (z) {
                }
                this.d.a(true);
                return i(true, true, continuation);
            default:
                w511.b();
                return null;
        }
    }

    @Override // defpackage.cgi0
    public final boolean f() {
        return this.m.a();
    }

    @Override // defpackage.cgi0
    public final void g(List list) {
        this.w = list;
    }

    @Override // defpackage.cgi0
    public final Object h(Continuation continuation) {
        return (this.d.b() && this.x) ? i(false, true, continuation) : zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00fb, code lost:
    
        if (r0 < ((java.lang.Math.min(r11.width(), r11.height()) / 2) / 10)) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.cgi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(boolean z, boolean z2, Continuation continuation) {
        RecenterInteractor$recenter$2 recenterInteractor$recenter$2;
        int i;
        fi6 fi6Var;
        BoundingBox g;
        gh00 gh00Var;
        if (continuation instanceof RecenterInteractor$recenter$2) {
            recenterInteractor$recenter$2 = (RecenterInteractor$recenter$2) continuation;
            int i2 = recenterInteractor$recenter$2.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recenterInteractor$recenter$2.label = i2 - Integer.MIN_VALUE;
                Object obj = recenterInteractor$recenter$2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = recenterInteractor$recenter$2.label;
                ah00 ah00Var = this.b;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dgi0 dgi0Var = this.j;
                    yz70 yz70Var = dgi0Var.a;
                    zzs zzsVar = yz70Var.a;
                    if (!yz70Var.q) {
                        fi6 fi6Var2 = new fi6();
                        l(dgi0Var.c).f(fi6Var2, this.w);
                        if (!fi6Var2.i()) {
                            recenterInteractor$recenter$2.L$0 = null;
                            recenterInteractor$recenter$2.L$1 = null;
                            recenterInteractor$recenter$2.L$2 = fi6Var2;
                            recenterInteractor$recenter$2.Z$0 = z;
                            recenterInteractor$recenter$2.Z$1 = z2;
                            recenterInteractor$recenter$2.label = 1;
                            if (this.s.a(recenterInteractor$recenter$2) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                            fi6Var = fi6Var2;
                        }
                    } else if (zzsVar != null) {
                        Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                        Point point = new Point(zzsVar.a, zzsVar.b);
                        gh00 gh00Var2 = (gh00) ah00Var;
                        gh00Var2.getClass();
                        gh00Var2.q(new vmz(7, gh00Var2, point));
                        return zy11Var;
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                z2 = recenterInteractor$recenter$2.Z$1;
                z = recenterInteractor$recenter$2.Z$0;
                fi6Var = (fi6) recenterInteractor$recenter$2.L$2;
                kotlin.b.b(obj);
                g = fi6Var.g();
                Polyline polyline2 = ru.yandex.taxi.map.utils.a.b;
                boolean y = ru.yandex.taxi.map.utils.a.y(g.getNorthEast(), g.getSouthWest());
                if (!z && !y) {
                    gh00Var = (gh00) ((ah00) this.l.a);
                    if (gh00Var.m(g)) {
                        zzs E = ru.yandex.taxi.map.utils.a.E(ru.yandex.taxi.map.utils.a.h(g), null);
                        zzs b = gh00Var.e.b();
                        double f = gh00Var.f(new Point(E.a, E.b), new Point(b.a, b.b));
                        Rect b2 = gh00Var.a.b();
                    }
                }
                if (z2) {
                    ((gh00) ah00Var).F(g);
                    return zy11Var;
                }
                ((gh00) ah00Var).A(g, null);
                return zy11Var;
            }
        }
        recenterInteractor$recenter$2 = new RecenterInteractor$recenter$2(this, continuation);
        Object obj2 = recenterInteractor$recenter$2.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = recenterInteractor$recenter$2.label;
        ah00 ah00Var2 = this.b;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        g = fi6Var.g();
        Polyline polyline22 = ru.yandex.taxi.map.utils.a.b;
        boolean y2 = ru.yandex.taxi.map.utils.a.y(g.getNorthEast(), g.getSouthWest());
        if (!z) {
            gh00Var = (gh00) ((ah00) this.l.a);
            if (gh00Var.m(g)) {
            }
        }
        if (z2) {
        }
    }

    @Override // defpackage.cgi0
    public final void j() {
        this.x = true;
    }

    @Override // defpackage.cgi0
    public final Object k(SuspendLambda suspendLambda) {
        return i(true, true, suspendLambda);
    }

    public final ggi0 l(RecenterType recenterType) {
        switch (bgi0.a[recenterType.ordinal()]) {
            case 1:
                return this.c.c() == DriveState.TRANSPORTING ? this.g : this.f;
            case 2:
                return this.o;
            case 3:
                return this.p;
            case 4:
                return this.e;
            case 5:
                return this.r;
            case 6:
                return this.q;
            default:
                w511.b();
                return null;
        }
    }

    @Override // defpackage.cgi0
    public final void onPause() {
        pzt0 pzt0Var = this.v;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.v = null;
        mtg mtgVar = this.u;
        ((Handler) mtgVar.b).removeCallbacksAndMessages(null);
        ((gh00) this.b).u(mtgVar);
    }

    @Override // defpackage.cgi0
    public final void onResume() {
        pzt0 pzt0Var = this.v;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        hgi0 hgi0Var = this.i;
        this.v = tje.N(this.a, null, null, new RecenterInteractor$onResume$$inlined$safeCollectIn$1(new m(new k(new g(new e(new i(hgi0Var.b.b(hgi0Var.a)), hgi0Var)), hgi0Var), hgi0Var), null, this, this), 3);
        ((gh00) this.b).e(this.u);
    }
}
