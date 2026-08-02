package com.yandex.go.taxi.order.map.overlay;

import android.graphics.Bitmap;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.taxi.order.experiments.TaxiTravelerMovementExperiment;
import com.yandex.go.taxi.order.experiments.TaxiTravelerMovementExperiment$TurboMode$Strategy$Fixed;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.RouteInfo;
import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceAnalytics;
import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceOverlay;
import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceOverride;
import com.yandex.go.taxi.order.models.api.promotions.ObjectAppearanceScale;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment;
import com.yandex.go.taxi.order.net.tracker.TaxiTrackProducerProxy$startTracking$$inlined$flatMapLatest$1;
import com.yandex.go.taxi.order.report_driver_position.experiment.ReportDriverPositionExperiment;
import com.yandex.mapkit.geometry.Geo;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import com.yandex.mapkit.geometry.PolylinePosition;
import com.yandex.mapkit.geometry.Segment;
import com.yandex.mapkit.geometry.Subpolyline;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.transport.masstransit.Route;
import com.yandex.mapkit.transport.masstransit.Session;
import defpackage.a2j0;
import defpackage.a3y0;
import defpackage.aet0;
import defpackage.ah00;
import defpackage.ajm;
import defpackage.ak00;
import defpackage.an91;
import defpackage.aye0;
import defpackage.b7l0;
import defpackage.bmp0;
import defpackage.c06;
import defpackage.c641;
import defpackage.cgi0;
import defpackage.ci70;
import defpackage.cjw0;
import defpackage.dei0;
import defpackage.dgi0;
import defpackage.dot0;
import defpackage.evu0;
import defpackage.f8k0;
import defpackage.ffx;
import defpackage.ft00;
import defpackage.g18;
import defpackage.g201;
import defpackage.g8k0;
import defpackage.gh00;
import defpackage.gj6;
import defpackage.h001;
import defpackage.h201;
import defpackage.h3y;
import defpackage.ha2;
import defpackage.hby0;
import defpackage.hrv;
import defpackage.hst;
import defpackage.i201;
import defpackage.iby0;
import defpackage.iei0;
import defpackage.irv;
import defpackage.ist;
import defpackage.iwa1;
import defpackage.j001;
import defpackage.jbh;
import defpackage.jby0;
import defpackage.jl40;
import defpackage.jo0;
import defpackage.jqr;
import defpackage.js00;
import defpackage.jst;
import defpackage.jtq0;
import defpackage.ke00;
import defpackage.kf00;
import defpackage.kl00;
import defpackage.kl3;
import defpackage.l1t;
import defpackage.l3l0;
import defpackage.lby0;
import defpackage.leh;
import defpackage.m1t;
import defpackage.mby0;
import defpackage.md6;
import defpackage.mdh;
import defpackage.mo21;
import defpackage.mo5;
import defpackage.mq5;
import defpackage.mth;
import defpackage.nby0;
import defpackage.noe;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o380;
import defpackage.o7r0;
import defpackage.o8g0;
import defpackage.oby0;
import defpackage.ool0;
import defpackage.p201;
import defpackage.pby0;
import defpackage.pfq0;
import defpackage.plm;
import defpackage.po21;
import defpackage.pp70;
import defpackage.pwy0;
import defpackage.pzt0;
import defpackage.q201;
import defpackage.q6c0;
import defpackage.qc5;
import defpackage.qn11;
import defpackage.qqo;
import defpackage.qwc;
import defpackage.qyy0;
import defpackage.rp70;
import defpackage.rqo;
import defpackage.s0c0;
import defpackage.scc;
import defpackage.sjh;
import defpackage.sk90;
import defpackage.srb1;
import defpackage.t78;
import defpackage.tal0;
import defpackage.tbl;
import defpackage.tcc;
import defpackage.tdj;
import defpackage.tje;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.ty1;
import defpackage.u080;
import defpackage.u1s;
import defpackage.ur70;
import defpackage.uyj;
import defpackage.v080;
import defpackage.v48;
import defpackage.v4r0;
import defpackage.vlp0;
import defpackage.vng;
import defpackage.vx0;
import defpackage.w080;
import defpackage.w4e0;
import defpackage.x080;
import defpackage.x1j0;
import defpackage.x980;
import defpackage.xwx0;
import defpackage.y50;
import defpackage.y541;
import defpackage.y980;
import defpackage.yay0;
import defpackage.yh70;
import defpackage.yk;
import defpackage.yz70;
import defpackage.zd80;
import defpackage.zfm;
import defpackage.zim;
import defpackage.zy11;
import defpackage.zzs;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.j0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.n0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.map.WalkRouteAnalytics$Context;
import ru.yandex.taxi.net.tracker.models.TrackPoint$Remote$Source;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class c0 extends qc5 {
    public final o2y0 A;
    public final ru.yandex.taxi.sdc.route.presentation.a A0;
    public final x980 B;
    public final qqo B0;
    public final n0 B1;
    public final yay0 C;
    public t78 C0;
    public float C1;
    public final jtq0 D;
    public String D0;
    public final com.yandex.go.taxi.order.provider.l E;
    public pzt0 E0;
    public final po21 F;
    public String F0;
    public final qwc G;
    public ObjectAppearanceOverride G0;
    public final zfm H;
    public float H0;
    public boolean H1;
    public final com.yandex.go.taxi.order.repositories.c I;
    public zzs I0;
    public final y980 J;
    public Double J0;
    public final ah00 K;
    public List K0;
    public final ru.yandex.taxi.map.a L;
    public float L0;
    public final ci70 M;
    public js00 M0;
    public final h3y N;
    public boolean N0;
    public boolean N1;
    public final com.yandex.go.taxi.order.provider.w O;
    public CameraPosition O0;
    public final com.yandex.go.zone.repository.o P;
    public pzt0 P0;
    public final leh Q;
    public pzt0 Q0;
    public final ru.yandex.taxi.styling.c R;
    public pzt0 R0;
    public final tt2 S;
    public pzt0 S0;
    public final c641 T;
    public pzt0 T0;
    public final y541 U;
    public final ft00 V;
    public final cgi0 W;
    public final dgi0 Z;
    public final l1t a0;
    public final pwy0 b0;
    public final ty1 c0;
    public final s0c0 d0;
    public final h3y e0;
    public final kl00 f0;
    public final com.yandex.go.taxi.order.change.source.interactor.x g0;
    public final aet0 h0;
    public final o380 i0;
    public final com.yandex.go.taxi.order.change.source.interactor.a0 j0;
    public final com.yandex.go.taxi.order.change.source.interactor.k k0;
    public final com.yandex.go.taxi.order.map.n l0;
    public final kf00 m0;
    public final q6c0 n0;
    public final com.yandex.go.taxi.order.domain.interactors.h o0;
    public final mo5 p0;
    public pzt0 p1;
    public final xwx0 q0;
    public final c06 r0;
    public final cjw0 s0;
    public final noe t0;
    public final com.yandex.go.taxi.order.map.passenger_detection.a u0;
    public final y50 v0;
    public pzt0 v1;
    public final md6 w0;
    public final zd80 x0;
    public g18 x1;
    public final a3y0 y0;
    public final n0 y1;
    public final tbl z0;

    public c0(Lifecycle lifecycle, o2y0 o2y0Var, x980 x980Var, yay0 yay0Var, jtq0 jtq0Var, com.yandex.go.taxi.order.provider.l lVar, po21 po21Var, qwc qwcVar, zfm zfmVar, com.yandex.go.taxi.order.repositories.c cVar, y980 y980Var, rqo rqoVar, ah00 ah00Var, ru.yandex.taxi.map.a aVar, ci70 ci70Var, h3y h3yVar, com.yandex.go.taxi.order.provider.w wVar, com.yandex.go.zone.repository.o oVar, leh lehVar, ru.yandex.taxi.styling.c cVar2, tt2 tt2Var, c641 c641Var, y541 y541Var, ft00 ft00Var, cgi0 cgi0Var, dgi0 dgi0Var, l1t l1tVar, vlp0 vlp0Var, pwy0 pwy0Var, ty1 ty1Var, s0c0 s0c0Var, h3y h3yVar2, kl00 kl00Var, com.yandex.go.taxi.order.change.source.interactor.x xVar, aet0 aet0Var, o380 o380Var, com.yandex.go.taxi.order.change.source.interactor.a0 a0Var, com.yandex.go.taxi.order.change.source.interactor.k kVar, com.yandex.go.taxi.order.map.n nVar, kf00 kf00Var, q6c0 q6c0Var, com.yandex.go.taxi.order.domain.interactors.h hVar, mo5 mo5Var, xwx0 xwx0Var, c06 c06Var, cjw0 cjw0Var, noe noeVar, com.yandex.go.taxi.order.map.passenger_detection.a aVar2, y50 y50Var, md6 md6Var, zd80 zd80Var) {
        super(u080.class, lifecycle);
        this.A = o2y0Var;
        this.B = x980Var;
        this.C = yay0Var;
        this.D = jtq0Var;
        this.E = lVar;
        this.F = po21Var;
        this.G = qwcVar;
        this.H = zfmVar;
        this.I = cVar;
        this.J = y980Var;
        this.K = ah00Var;
        this.L = aVar;
        this.M = ci70Var;
        this.N = h3yVar;
        this.O = wVar;
        this.P = oVar;
        this.Q = lehVar;
        this.R = cVar2;
        this.S = tt2Var;
        this.T = c641Var;
        this.U = y541Var;
        this.V = ft00Var;
        this.W = cgi0Var;
        this.Z = dgi0Var;
        this.a0 = l1tVar;
        this.b0 = pwy0Var;
        this.c0 = ty1Var;
        this.d0 = s0c0Var;
        this.e0 = h3yVar2;
        this.f0 = kl00Var;
        this.g0 = xVar;
        this.h0 = aet0Var;
        this.i0 = o380Var;
        this.j0 = a0Var;
        this.k0 = kVar;
        this.l0 = nVar;
        this.m0 = kf00Var;
        this.n0 = q6c0Var;
        this.o0 = hVar;
        this.p0 = mo5Var;
        this.q0 = xwx0Var;
        this.r0 = c06Var;
        this.s0 = cjw0Var;
        this.t0 = noeVar;
        this.u0 = aVar2;
        this.v0 = y50Var;
        this.w0 = md6Var;
        this.x0 = zd80Var;
        this.y0 = new a3y0(TaxiOrderLogGroup.MAP.getTag(), "OrderMapOverlayPresenter");
        this.z0 = new tbl(2, this);
        vx0 vx0Var = vlp0Var.a.a;
        this.A0 = new ru.yandex.taxi.sdc.route.presentation.a(o2y0Var, (bmp0) vx0Var.a.get(), (ru.yandex.taxi.sdc.route.repository.a) vx0Var.b.get(), (tt2) vx0Var.c.get());
        dot0.Companion.getClass();
        this.B0 = ((jbh) rqoVar).c(dot0.k);
        this.C0 = new t78(new v48(null, "", null), null);
        this.H0 = 1.0f;
        this.x1 = g18.u1;
        BufferOverflow bufferOverflow = BufferOverflow.DROP_OLDEST;
        this.y1 = ffx.b(0, 1, bufferOverflow);
        this.B1 = ffx.b(0, 1, bufferOverflow);
        this.C1 = 15.0f;
    }

    public static final void Mg(c0 c0Var, ObjectAppearanceOverride objectAppearanceOverride, Bitmap bitmap) {
        ObjectAppearanceOverlay objectAppearanceOverlay;
        String str = objectAppearanceOverride != null ? objectAppearanceOverride.a : null;
        boolean l = jl40.l(str, c0Var.F0);
        if (!l) {
            c0Var.F0 = str;
            pzt0 pzt0Var = c0Var.E0;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
        }
        if (bitmap == null) {
            if (c0Var.D0 == null) {
                if ((objectAppearanceOverride != null ? objectAppearanceOverride.b : null) == null || l) {
                    return;
                }
                c0Var.Zg(300L);
                return;
            }
            c0Var.D0 = null;
            c0Var.G0 = null;
            ((u080) c0Var.Dg()).t9();
            pzt0 pzt0Var2 = c0Var.E0;
            if (pzt0Var2 != null) {
                pzt0Var2.a(null);
                return;
            }
            return;
        }
        String str2 = (objectAppearanceOverride == null || (objectAppearanceOverlay = objectAppearanceOverride.c) == null) ? null : objectAppearanceOverlay.a;
        boolean l2 = jl40.l(str2, c0Var.D0);
        boolean z = c0Var.D0 != null;
        if (!l2) {
            c0Var.D0 = str2;
        }
        if (l && l2) {
            return;
        }
        long j = (objectAppearanceOverride != null ? objectAppearanceOverride.b : null) != null ? 300L : 0L;
        if (l2) {
            c0Var.Zg(j + 150);
            return;
        }
        long j2 = z ? 300L : 150L;
        if (j <= 0) {
            ((u080) c0Var.Dg()).E7(bitmap);
            c0Var.Zg(j2);
        } else {
            pzt0 pzt0Var3 = c0Var.E0;
            if (pzt0Var3 != null) {
                pzt0Var3.a(null);
            }
            c0Var.E0 = tje.N(c0Var.Kg(), null, null, new OrderMapOverlayPresenter$showBrandingOverlay$1(j, c0Var, bitmap, j2, null), 3);
        }
    }

    public static final void Ng(c0 c0Var, t78 t78Var, boolean z) {
        if (!z) {
            if (!c0Var.C.a(c0Var.A).b9()) {
                return;
            }
            if (jl40.l(t78Var.a, c0Var.C0.a) && jl40.l(Yg(t78Var.b), Yg(c0Var.C0.b))) {
                return;
            }
        }
        c0Var.C0 = t78Var;
        pzt0 pzt0Var = c0Var.T0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        c0Var.T0 = tje.N(c0Var.Kg(), null, null, new OrderMapOverlayPresenter$applyCarRenderState$1(c0Var, t78Var, null), 3);
    }

    public static final void Og(c0 c0Var, List list) {
        h3y h3yVar = c0Var.N;
        o2y0 o2y0Var = c0Var.A;
        DriveState c = o2y0Var.c();
        if (c == DriveState.DRIVING || c == DriveState.TRANSPORTING || c0Var.Ug()) {
            if (c == DriveState.TRANSPORTING && o2y0Var.b().t().b.isEmpty() && ((com.yandex.go.taxi.order.map.route.a) h3yVar.get()).A) {
                c0Var.ch();
                return;
            } else if (((com.yandex.go.taxi.order.map.route.a) h3yVar.get()).A) {
                ((com.yandex.go.taxi.order.map.route.a) h3yVar.get()).b(list, c0Var.C.a(o2y0Var).I(), false);
            } else {
                c0Var.bh(c);
            }
        }
        com.yandex.go.coroutines.b.g(c0Var.Kg(), null, null, new OrderMapOverlayPresenter$newRawRouteReceived$1(c0Var, null), 3);
        c0Var.y1.g(new w080(1));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Pg(c0 c0Var, yz70 yz70Var, Continuation continuation) {
        OrderMapOverlayPresenter$processMapObjects$1 orderMapOverlayPresenter$processMapObjects$1;
        int i;
        dgi0 dgi0Var = c0Var.Z;
        if (continuation instanceof OrderMapOverlayPresenter$processMapObjects$1) {
            orderMapOverlayPresenter$processMapObjects$1 = (OrderMapOverlayPresenter$processMapObjects$1) continuation;
            int i2 = orderMapOverlayPresenter$processMapObjects$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderMapOverlayPresenter$processMapObjects$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderMapOverlayPresenter$processMapObjects$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderMapOverlayPresenter$processMapObjects$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    dgi0Var.a = yz70Var;
                    if (c0Var.Eg()) {
                        zzs zzsVar = yz70Var.a;
                        if (zzsVar != null) {
                            boolean z = yz70Var.c;
                            if (yz70Var.b || z) {
                                u080 u080Var = (u080) c0Var.Dg();
                                Polyline polyline = ru.yandex.taxi.map.utils.a.b;
                                u080Var.O4(new Point(zzsVar.a, zzsVar.b));
                                ((u080) c0Var.Dg()).Lb(z);
                            } else {
                                ((u080) c0Var.Dg()).P3();
                            }
                        }
                        zzs zzsVar2 = yz70Var.h;
                        if (zzsVar2 != null) {
                            ((u080) c0Var.Dg()).U5(zzsVar2);
                        } else {
                            ((u080) c0Var.Dg()).E3();
                        }
                        zzs zzsVar3 = yz70Var.d;
                        if (zzsVar3 == null || !yz70Var.e) {
                            ((u080) c0Var.Dg()).B1();
                        } else {
                            u080 u080Var2 = (u080) c0Var.Dg();
                            Polyline polyline2 = ru.yandex.taxi.map.utils.a.b;
                            u080Var2.Id(new Point(zzsVar3.a, zzsVar3.b));
                        }
                        if (c0Var.J.b()) {
                            com.yandex.go.coroutines.b.g(c0Var.Kg(), null, null, new OrderMapOverlayPresenter$processDestination$1(c0Var, null), 3);
                        }
                        mo21 mo21Var = dgi0Var.b;
                        orderMapOverlayPresenter$processMapObjects$1.L$0 = null;
                        orderMapOverlayPresenter$processMapObjects$1.label = 1;
                        if (c0Var.Xg(mo21Var, orderMapOverlayPresenter$processMapObjects$1) == obj2) {
                            return obj2;
                        }
                    }
                    return zy11Var;
                }
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                c0Var.eh();
                c0Var.Qg();
                if (c0Var.Eg()) {
                    yz70 yz70Var2 = dgi0Var.a;
                    boolean z2 = yz70Var2.g;
                    List list = yz70Var2.i;
                    if (!z2) {
                        if (!yz70Var2.n) {
                            ((u080) c0Var.Dg()).Xe();
                            return zy11Var;
                        }
                        ArrayList H = ru.yandex.taxi.map.utils.a.H(list);
                        ((u080) c0Var.Dg()).Z1(ru.yandex.taxi.map.utils.a.H(yz70Var2.m), H);
                        return zy11Var;
                    }
                    ((u080) c0Var.Dg()).mf(ru.yandex.taxi.map.utils.a.H(list));
                    ArrayList H2 = ru.yandex.taxi.map.utils.a.H(yz70Var2.f);
                    if (yz70Var2.v) {
                        ((u080) c0Var.Dg()).S7(H2);
                        return zy11Var;
                    }
                    ((u080) c0Var.Dg()).f8(H2);
                    return zy11Var;
                }
                return zy11Var;
            }
        }
        orderMapOverlayPresenter$processMapObjects$1 = new OrderMapOverlayPresenter$processMapObjects$1(c0Var, continuation);
        Object obj3 = orderMapOverlayPresenter$processMapObjects$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderMapOverlayPresenter$processMapObjects$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        c0Var.eh();
        c0Var.Qg();
        if (c0Var.Eg()) {
        }
        return zy11Var2;
    }

    public static String Yg(ObjectAppearanceOverride objectAppearanceOverride) {
        if (objectAppearanceOverride == null) {
            return null;
        }
        String str = objectAppearanceOverride.a;
        ObjectAppearanceOverlay objectAppearanceOverlay = objectAppearanceOverride.c;
        String str2 = objectAppearanceOverlay != null ? objectAppearanceOverlay.a : null;
        ObjectAppearanceScale objectAppearanceScale = objectAppearanceOverride.b;
        return str + "|" + str2 + "|" + (objectAppearanceScale != null ? Double.valueOf(objectAppearanceScale.a) : null);
    }

    @Override // defpackage.qc5, defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        this.W.d();
        ((x1j0) this.n0.w).a.remove(this.A.b().a);
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Fg() {
        super.Fg();
        this.x1.cancel();
        ch();
        this.C.a(this.A).h();
        c641 c641Var = this.T;
        Session session = c641Var.b.b;
        if (session != null) {
            session.cancel();
        }
        pzt0 pzt0Var = c641Var.h;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        c641Var.h = null;
        this.W.onPause();
        ru.yandex.taxi.sdc.route.presentation.a aVar = this.A0;
        aVar.f.a(null);
        aVar.e.b();
        com.yandex.go.taxi.order.map.n nVar = this.l0;
        nVar.h.c.h(-1);
        nVar.g.b();
        nVar.j.b();
        this.C0 = new t78(this.C0.a, null);
        this.D0 = null;
        this.F0 = null;
        this.G0 = null;
        pzt0 pzt0Var2 = this.E0;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.E0 = null;
        this.H0 = 1.0f;
    }

    @Override // defpackage.qc5, defpackage.zc5
    public final void Gg() {
        super.Gg();
        if ((this.r0.q(null) && this.A.b().h.b == DriveState.DRIVING) || this.A.b().h.b == DriveState.WAITING || this.A.b().h.b == DriveState.TRANSPORTING) {
            ah();
        }
        if (this.C.a(this.A).b9()) {
            eh();
        }
        zzs zzsVar = this.I0;
        if (zzsVar != null && this.r0.q(null)) {
            Polyline polyline = ru.yandex.taxi.map.utils.a.b;
            if (Double.compare(zzsVar.a, 0.0d) != 0 || Double.compare(zzsVar.b, 0.0d) != 0) {
                Double d = this.J0;
                if (d != null) {
                    ((u080) Dg()).u7((float) d.doubleValue());
                }
                ((u080) Dg()).ra(zzsVar);
            }
        }
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.X(new f(Vg()), new OrderMapOverlayPresenter$onResume$$inlined$flatMapLatest$1(this, null)), null, this), 3);
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.X(new h(Vg()), new OrderMapOverlayPresenter$onResume$$inlined$flatMapLatest$2(this, null)), null, this), 3);
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$3(this.o0.a(this.A), null, this, this), 3);
        m0 a = this.o0.a(this.A);
        v080 v080Var = new v080(this, 0);
        yk ykVar = vng.c;
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$4(vng.l(a, v080Var, ykVar), null, this, this), 3);
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$5(kotlinx.coroutines.flow.e.X(new j(Vg()), new OrderMapOverlayPresenter$onResume$$inlined$flatMapLatest$3(this, null)), null, this, this), 3);
        l1t l1tVar = this.a0;
        this.x1 = ((m1t) l1tVar).a.h(new p(this));
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$6(new ru.yandex.taxi.layers.domain.w(((pfq0) this.x0).a.b), null, this), 3);
        gh00 gh00Var = (gh00) this.K;
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$7(new ru.yandex.taxi.map_common.map.g(gh00Var.a.f, gh00Var), null, this), 3);
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$8(this.J.a, null, this, this), 3);
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$9(kotlinx.coroutines.flow.e.X(new l(Vg()), new OrderMapOverlayPresenter$onResume$$inlined$flatMapLatest$4(this, null)), null, this, this), 3);
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$10(this.y1, null, this, this), 3);
        if (this.s0.p()) {
            tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$30(this, null), 3);
            tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$11(((ru.yandex.taxi.preorder.source.userposition.e) this.F).n(), null, this, this), 3);
            tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$12(this.G.a(), null, (u080) Dg(), this), 3);
        }
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$13(kotlinx.coroutines.flow.e.n(this.R.e(this.A), new com.yandex.go.taxi.order.domain.interactors.e(vng.l(this.o0.a(this.A), new ur70(8), ykVar)), this.b0.a(), new OrderMapOverlayPresenter$onResume$35(4, null)), null, this), 3);
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$14(((ru.yandex.taxi.altpins.order.e) this.c0).b(this.A), null, (u080) Dg()), 3);
        com.yandex.go.taxi.order.change.source.interactor.x xVar = this.g0;
        tpr t = kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.order.change.source.interactor.q(xVar.a.b(kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.order.change.source.interactor.o(this.A.a())), DriveState.DRIVING), xVar));
        this.S.getClass();
        sjh sjhVar = uyj.a;
        mdh mdhVar = mdh.b;
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$15(kotlinx.coroutines.flow.e.F(t, mdhVar), null, this.i0), 3);
        tpr b = this.g0.b(this.A);
        this.S.getClass();
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$16(kotlinx.coroutines.flow.e.F(b, mdhVar), null, this.i0), 3);
        tpr a2 = this.g0.a(this.A);
        this.S.getClass();
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$17(kotlinx.coroutines.flow.e.F(a2, mdhVar), null, this.i0), 3);
        ha2 a3 = this.j0.a();
        this.S.getClass();
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$18(kotlinx.coroutines.flow.e.F(a3, mdhVar), null, this), 3);
        com.yandex.go.taxi.order.map.n nVar = this.l0;
        mth mthVar = new mth(new j0(null, kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.n(kotlinx.coroutines.flow.e.t(new com.yandex.go.taxi.order.map.i(nVar.b.b, nVar)), kotlinx.coroutines.flow.e.t(this.B1), kotlinx.coroutines.flow.e.t(this.b0.a()), new OrderMapOverlayPresenter$onResume$42(this, null))), new OrderMapOverlayPresenter$onResume$$inlined$withPreviousEmit$1(3, null)), 6);
        this.S.getClass();
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$19(kotlinx.coroutines.flow.e.F(mthVar, mdhVar), null, this), 3);
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$20(kotlinx.coroutines.flow.e.X(new n(Vg()), new OrderMapOverlayPresenter$onResume$$inlined$flatMapLatest$5(this, null)), null, this), 3);
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$21(this.C.a(this.A).p6(), null, this), 3);
        tje.N(Kg(), null, null, new OrderMapOverlayPresenter$onResume$$inlined$safeCollectIn$22(kotlinx.coroutines.flow.e.t(this.C.a(this.A).Nb()), null, this), 3);
        this.W.onResume();
        this.A0.e.a();
        this.l0.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:186:0x01ba, code lost:
    
        if (defpackage.jl40.l(r15.y, (r10 == null || (r6 = r10.a) == null) ? null : r6.a) == false) goto L79;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0434 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0201 A[LOOP:0: B:41:0x01fb->B:43:0x0201, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x03ca  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Qg() {
        Double d;
        Double d2;
        zzs zzsVar;
        h201 h201Var;
        w4e0 w4e0Var;
        h001 h001Var;
        p201 Q2;
        g201 g201Var;
        String str;
        String str2;
        ReportDriverPositionExperiment reportDriverPositionExperiment;
        qn11 b;
        ReportDriverPositionExperiment reportDriverPositionExperiment2;
        Polyline polyline;
        List<Point> points;
        Iterator<T> it;
        Iterator it2;
        Object next;
        hrv hrvVar;
        w4e0 w4e0Var2;
        yay0 yay0Var = this.C;
        o2y0 o2y0Var = this.A;
        h201 a8 = yay0Var.a(o2y0Var).a8();
        h201 q4 = yay0Var.a(o2y0Var).q4();
        jtq0 jtq0Var = this.D;
        dgi0 dgi0Var = this.Z;
        if (a8 == null || q4 == null) {
            Double d3 = this.J0;
            a8 = (d3 != null || q4 == null || (d2 = q4.b) == null) ? ((q4 != null ? q4.b : null) != null || (d = dgi0Var.a.l) == null) ? Rg(d3, true) : Rg(d, true) : Rg(d2, q4.c);
        } else if (dgi0Var.a.p && jtq0Var.d() - q4.d >= 15000) {
            Double d4 = a8.b;
            if (d4 == null) {
                d4 = this.J0;
            }
            a8 = Rg(d4, a8.c);
        }
        h201 h201Var2 = a8;
        if (h201Var2 == null) {
            u080 u080Var = (u080) Dg();
            u080Var.jg();
            u080Var.U2();
            u080Var.z1();
            u080Var.Q8();
            ((u080) Dg()).O8();
            return;
        }
        zzs zzsVar2 = h201Var2.a;
        Double d5 = h201Var2.b;
        if (d5 == null) {
            d5 = this.J0;
        }
        Pair pair = new Pair(zzsVar2, d5);
        zzs zzsVar3 = (zzs) pair.getFirst();
        Double d6 = (Double) pair.getSecond();
        this.I0 = zzsVar3;
        boolean z = h201Var2.c;
        r0 r0Var = this.l0.i;
        if (z != ((Boolean) r0Var.getValue()).booleanValue()) {
            r0Var.m(null, Boolean.valueOf(z));
        }
        this.J0 = d6;
        com.yandex.go.taxi.order.map.route.a aVar = (com.yandex.go.taxi.order.map.route.a) this.N.get();
        h201 a = h201.a(h201Var2, zzsVar3, null, false, 0L, 30);
        q201 I = yay0Var.a(o2y0Var).I();
        List s5 = yay0Var.a(o2y0Var).s5();
        p201 Q22 = yay0Var.a(o2y0Var).Q2();
        Double d7 = Q22 != null ? Q22.j : null;
        r0 r0Var2 = aVar.o;
        a3y0 a3y0Var = aVar.j;
        if (qyy0.a()) {
            zzs zzsVar4 = a.a;
            if (s5 == null) {
                s5 = EmptyList.a;
            }
            aVar.w = s5;
            r0Var2.l(zzsVar4);
            aVar.r = a.b;
            ((plm) aVar.b).b(ru.yandex.taxi.map.utils.a.F(zzsVar4), d7);
            u1s u1sVar = aVar.g;
            o8g0 o8g0Var = aVar.s;
            if (o8g0Var != null && (zzsVar = (zzs) r0Var2.getValue()) != null && u1sVar.a) {
                h201Var = h201Var2;
                if (u1sVar.b <= (System.currentTimeMillis() - aVar.v) / 1000) {
                    Point b2 = iwa1.b(((ool0) o8g0Var.a).getGeometry(), (PolylinePosition) aVar.m.a);
                    if (b2 != null && srb1.c(b2.getLatitude(), b2.getLongitude(), zzsVar.a, zzsVar.b) <= u1sVar.c) {
                    }
                    a3y0Var.f(new b7l0(2), "rerouteIfNeed");
                    aVar.s = null;
                    aVar.b((List) this.z0.get(), I, true);
                }
                bmp0 bmp0Var = this.A0.b;
                w4e0Var = bmp0Var.d;
                if (w4e0Var != null && (polyline = (Polyline) w4e0Var.h) != null && (points = polyline.getPoints()) != null) {
                    List<Point> list = points;
                    ArrayList arrayList = new ArrayList(tcc.n(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(ru.yandex.taxi.map.utils.a.E((Point) it.next(), null));
                    }
                    irv irvVar = (irv) kotlin.collections.a.O0(kotlin.collections.a.J(arrayList, 1)).iterator();
                    it2 = irvVar.c;
                    if (it2.hasNext()) {
                        next = null;
                    } else {
                        next = irvVar.next();
                        if (it2.hasNext()) {
                            hrv hrvVar2 = (hrv) next;
                            float j = ru.yandex.taxi.map.utils.a.j(zzsVar3, (zzs) hrvVar2.b) + ru.yandex.taxi.map.utils.a.j(zzsVar3, (zzs) arrayList.get(hrvVar2.a));
                            do {
                                Object next2 = irvVar.next();
                                hrv hrvVar3 = (hrv) next2;
                                float j2 = ru.yandex.taxi.map.utils.a.j(zzsVar3, (zzs) hrvVar3.b) + ru.yandex.taxi.map.utils.a.j(zzsVar3, (zzs) arrayList.get(hrvVar3.a));
                                if (Float.compare(j, j2) > 0) {
                                    next = next2;
                                    j = j2;
                                }
                            } while (it2.hasNext());
                        }
                    }
                    hrvVar = (hrv) next;
                    if (hrvVar != null) {
                        int i = hrvVar.a;
                        zzs zzsVar5 = (zzs) hrvVar.b;
                        zzs zzsVar6 = (zzs) arrayList.get(i);
                        h001Var = null;
                        zzs E = ru.yandex.taxi.map.utils.a.E(Geo.closestPoint(ru.yandex.taxi.map.utils.a.F(zzsVar3), new Segment(ru.yandex.taxi.map.utils.a.F(zzsVar6), ru.yandex.taxi.map.utils.a.F(zzsVar5))), null);
                        PolylinePosition polylinePosition = ru.yandex.taxi.map.utils.a.j(zzsVar6, zzsVar5) == 0.0f ? null : new PolylinePosition(i, ru.yandex.taxi.map.utils.a.j(zzsVar6, E) / r8);
                        if (polylinePosition != null && (w4e0Var2 = bmp0Var.d) != null) {
                            w4e0Var2.r(Collections.singletonList(new Subpolyline(new PolylinePosition(), polylinePosition)));
                        }
                        if (d6 != null) {
                            ((u080) Dg()).u7((float) d6.doubleValue());
                        }
                        ((u080) Dg()).ra(zzsVar3);
                        Q2 = yay0Var.a(o2y0Var).Q2();
                        if (Q2 == null && this.W.b()) {
                            ((u080) Dg()).J5();
                            ((u080) Dg()).Oe(Q2.d);
                            String str3 = Q2.b;
                            String str4 = Q2.c;
                            if (str4 == null) {
                                str4 = "";
                            }
                            String str5 = Q2.e;
                            String str6 = str5 != null ? str5 : "";
                            if (evu0.J(str3)) {
                                ((u080) Dg()).Q8();
                            } else {
                                u080 u080Var2 = (u080) Dg();
                                if (evu0.J(str6)) {
                                    str6 = str3;
                                }
                                u080Var2.n8(str3, str4, str6);
                            }
                        } else {
                            u080 u080Var3 = (u080) Dg();
                            u080Var3.jg();
                            u080Var3.U2();
                            u080Var3.z1();
                            u080Var3.Q8();
                        }
                        g201Var = h201Var.e;
                        if (g201Var == null) {
                            return;
                        }
                        j001 j001Var = g201Var.b;
                        h001 h001Var2 = j001Var instanceof h001 ? (h001) j001Var : h001Var;
                        if (h001Var2 == null) {
                            return;
                        }
                        String str7 = g201Var.a;
                        long time = h001Var2.c.getTime();
                        zzs zzsVar7 = h001Var2.a;
                        double d8 = zzsVar7.a;
                        double d9 = zzsVar7.b;
                        Long l = h001Var2.d;
                        TrackPoint$Remote$Source trackPoint$Remote$Source = h001Var2.e;
                        int i2 = trackPoint$Remote$Source == null ? -1 : x080.b[trackPoint$Remote$Source.ordinal()];
                        if (i2 == 1) {
                            str = "taxiroute";
                        } else {
                            if (i2 != 2) {
                                str2 = h001Var;
                                TaxiOrder b3 = o2y0Var.b();
                                long d10 = jtq0Var.d();
                                q6c0 q6c0Var = this.n0;
                                ((a2j0) q6c0Var.b).getClass();
                                OrderStatusInfo V = b3.V();
                                ReportDriverPositionExperiment.Companion.getClass();
                                reportDriverPositionExperiment = ReportDriverPositionExperiment.d;
                                b = V.b(ReportDriverPositionExperiment.class);
                                if (b == null) {
                                    b = reportDriverPositionExperiment;
                                }
                                reportDriverPositionExperiment2 = (ReportDriverPositionExperiment) b;
                                if (reportDriverPositionExperiment2.b) {
                                    reportDriverPositionExperiment = reportDriverPositionExperiment2;
                                }
                                if (reportDriverPositionExperiment.b) {
                                    return;
                                }
                                zim zimVar = new zim(str7, time, d8, d9, l, str2);
                                ajm ajmVar = new ajm(d10, zimVar);
                                String str8 = b3.a;
                                int i3 = reportDriverPositionExperiment.c;
                                if (i3 < 1) {
                                    i3 = 1;
                                }
                                x1j0 x1j0Var = (x1j0) q6c0Var.w;
                                LinkedHashMap linkedHashMap = x1j0Var.a;
                                LinkedHashMap linkedHashMap2 = x1j0Var.a;
                                Set set = (Set) linkedHashMap.get(str8);
                                Set set2 = set;
                                if (set2 == null || set2.isEmpty()) {
                                    linkedHashMap2.put(str8, Collections.singleton(ajmVar));
                                    return;
                                }
                                Set<ajm> set3 = set;
                                if (!(set3 instanceof Collection) || !set3.isEmpty()) {
                                    for (ajm ajmVar2 : set3) {
                                        if (zimVar.equals(ajmVar2.b) || time < ajmVar2.b.b) {
                                            return;
                                        }
                                    }
                                }
                                if (set.size() != i3) {
                                    linkedHashMap2.put(str8, v4r0.i(set, ajmVar));
                                    return;
                                }
                                linkedHashMap2.put(str8, Collections.singleton(ajmVar));
                                g8k0 g8k0Var = (g8k0) ((aye0) q6c0Var.c).b;
                                double d11 = time;
                                double d12 = ajmVar.a;
                                Object valueOf = zimVar.e != null ? Double.valueOf(r6.longValue()) : h001Var;
                                Double valueOf2 = Double.valueOf(d12);
                                Double valueOf3 = Double.valueOf(zimVar.c);
                                Double valueOf4 = Double.valueOf(zimVar.d);
                                Double valueOf5 = Double.valueOf(d11);
                                f8k0 f8k0Var = g8k0Var.a;
                                f8k0Var.getClass();
                                HashMap hashMap = new HashMap();
                                hashMap.put("draw_timestamp", valueOf2);
                                hashMap.put("lat", valueOf3);
                                hashMap.put("lon", valueOf4);
                                if (valueOf != null) {
                                    hashMap.put("received_timestamp", valueOf);
                                }
                                String str9 = zimVar.f;
                                if (str9 != null) {
                                    hashMap.put("source", str9);
                                }
                                hashMap.put(ClidProvider.TIMESTAMP, valueOf5);
                                String str10 = zimVar.a;
                                if (str10 != null) {
                                    hashMap.put("x_yatraceid", str10);
                                }
                                f8k0Var.a.a("Ride.DriverPositionRendering", hashMap, 1, new HashMap());
                                return;
                            }
                            str = "websocket";
                        }
                        str2 = str;
                        TaxiOrder b32 = o2y0Var.b();
                        long d102 = jtq0Var.d();
                        q6c0 q6c0Var2 = this.n0;
                        ((a2j0) q6c0Var2.b).getClass();
                        OrderStatusInfo V2 = b32.V();
                        ReportDriverPositionExperiment.Companion.getClass();
                        reportDriverPositionExperiment = ReportDriverPositionExperiment.d;
                        b = V2.b(ReportDriverPositionExperiment.class);
                        if (b == null) {
                        }
                        reportDriverPositionExperiment2 = (ReportDriverPositionExperiment) b;
                        if (reportDriverPositionExperiment2.b) {
                        }
                        if (reportDriverPositionExperiment.b) {
                        }
                    }
                }
                h001Var = null;
                if (d6 != null) {
                }
                ((u080) Dg()).ra(zzsVar3);
                Q2 = yay0Var.a(o2y0Var).Q2();
                if (Q2 == null) {
                }
                u080 u080Var32 = (u080) Dg();
                u080Var32.jg();
                u080Var32.U2();
                u080Var32.z1();
                u080Var32.Q8();
                g201Var = h201Var.e;
                if (g201Var == null) {
                }
            }
        } else {
            String l2 = a3y0Var.l(new String[]{"ROUTE_PROGRESS:WRONG_THREAD_EXCEPTION"});
            hst hstVar = jst.e;
            String str11 = a3y0Var.a;
            hstVar.getClass();
            ist m = hstVar.m(l2);
            ke00 a2 = m.b.a();
            if (a2 != null && a2.b(15)) {
                a2.a(15, str11, null, "setCurrentCarPosition should be called from main thread", m.a);
            }
        }
        h201Var = h201Var2;
        bmp0 bmp0Var2 = this.A0.b;
        w4e0Var = bmp0Var2.d;
        if (w4e0Var != null) {
            List<Point> list2 = points;
            ArrayList arrayList2 = new ArrayList(tcc.n(list2, 10));
            it = list2.iterator();
            while (it.hasNext()) {
            }
            irv irvVar2 = (irv) kotlin.collections.a.O0(kotlin.collections.a.J(arrayList2, 1)).iterator();
            it2 = irvVar2.c;
            if (it2.hasNext()) {
            }
            hrvVar = (hrv) next;
            if (hrvVar != null) {
            }
        }
        h001Var = null;
        if (d6 != null) {
        }
        ((u080) Dg()).ra(zzsVar3);
        Q2 = yay0Var.a(o2y0Var).Q2();
        if (Q2 == null) {
        }
        u080 u080Var322 = (u080) Dg();
        u080Var322.jg();
        u080Var322.U2();
        u080Var322.z1();
        u080Var322.Q8();
        g201Var = h201Var.e;
        if (g201Var == null) {
        }
    }

    public final h201 Rg(Double d, boolean z) {
        zzs zzsVar = this.Z.a.k;
        if (zzsVar == null) {
            return null;
        }
        return new h201(zzsVar, d, z, 0L, null);
    }

    public final void Sg() {
        yay0 yay0Var = this.C;
        o2y0 o2y0Var = this.A;
        p201 Q2 = yay0Var.a(o2y0Var).Q2();
        if (Q2 != null) {
            String str = Q2.c;
            String str2 = Q2.b;
            if (!Q2.a || evu0.J(str2)) {
                return;
            }
            if (evu0.J(str == null ? "" : str)) {
                return;
            }
            if (str == null) {
                str = "";
            }
            String str3 = Q2.e;
            if (str3 == null) {
                str3 = "";
            }
            String str4 = Q2.f;
            String str5 = str4 != null ? str4 : "";
            if (evu0.J(str3)) {
                str3 = str2;
            }
            if (evu0.J(str5)) {
                str5 = str;
            }
            rp70 rp70Var = ((ru.yandex.taxi.order.f) this.B).C1;
            rp70Var.getClass();
            tdj tdjVar = new tdj(o2y0Var);
            tdjVar.b = str2;
            tdjVar.d = str3;
            tdjVar.c = str;
            tdjVar.e = str5;
            tdjVar.a(new ak00(29));
            rp70Var.c.n(tdjVar, new pp70(o2y0Var, "driverBadGps"));
            int i = Q2.d;
            yh70 yh70Var = this.M.f;
            String valueOf = String.valueOf(i);
            yh70Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("positionAccuracy", valueOf);
            yh70Var.a.a("TaxiOnTheWay.WeakGPS.Alert.Shown", hashMap, 1, new HashMap());
        }
    }

    public final List Tg(TaxiOrder taxiOrder, DriveState driveState) {
        RouteInfo routeInfo = taxiOrder.V().r;
        Collection c = routeInfo != null ? routeInfo.c() : EmptyList.a;
        ArrayList arrayList = new ArrayList();
        zzs zzsVar = this.I0;
        boolean z = zzsVar != null;
        if (zzsVar != null) {
            arrayList.add(zzsVar);
        }
        if (driveState == DriveState.TRANSPORTING || Ug()) {
            List d = taxiOrder.t().d(true, z);
            if (d.isEmpty()) {
                return d;
            }
            if (d.size() > 2) {
                arrayList.addAll(d);
                return arrayList;
            }
            arrayList.addAll(d);
            arrayList.addAll(1, c);
            return arrayList;
        }
        zzs zzsVar2 = taxiOrder.V().g.h;
        if (!z && zzsVar2 != null) {
            arrayList.add(zzsVar2);
        }
        arrayList.addAll(c);
        zzs v = taxiOrder.v();
        if (v != null) {
            arrayList.add(v);
        }
        return arrayList;
    }

    public final boolean Ug() {
        return this.A.b().o() != null;
    }

    public final com.yandex.go.taxi.order.map.b Vg() {
        c06 c06Var = this.r0;
        return new com.yandex.go.taxi.order.map.b(kotlinx.coroutines.flow.e.s(((o2y0) c06Var.a).a(), new mq5(9)), c06Var);
    }

    public final void Wg(Route route) {
        Polyline geometry;
        List<Point> points = (route == null || (geometry = route.getGeometry()) == null) ? null : geometry.getPoints();
        this.K0 = points;
        this.W.g(points);
        if (points == null || points.size() <= 1) {
            return;
        }
        WalkRouteAnalytics$Context walkRouteAnalytics$Context = WalkRouteAnalytics$Context.RIDE;
        y541 y541Var = this.U;
        y541Var.getClass();
        o2y0 o2y0Var = this.A;
        if (y541Var.b.add(scc.g("onRouteShown", o2y0Var.b().a, o2y0Var.c().toString(), walkRouteAnalytics$Context.getAnalyticsName()))) {
            o7r0 o7r0Var = y541Var.a;
            Boolean bool = Boolean.FALSE;
            String analyticsName = walkRouteAnalytics$Context.getAnalyticsName();
            o7r0Var.getClass();
            HashMap hashMap = new HashMap();
            hashMap.put("focusOnAltPin", bool);
            if (analyticsName != null) {
                hashMap.put("Mode", analyticsName);
            }
            o7r0Var.a.a("UserRoutes.Shown", hashMap, 1, new HashMap());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Xg(mo21 mo21Var, Continuation continuation) {
        OrderMapOverlayPresenter$processUserLocation$1 orderMapOverlayPresenter$processUserLocation$1;
        int i;
        if (continuation instanceof OrderMapOverlayPresenter$processUserLocation$1) {
            orderMapOverlayPresenter$processUserLocation$1 = (OrderMapOverlayPresenter$processUserLocation$1) continuation;
            int i2 = orderMapOverlayPresenter$processUserLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderMapOverlayPresenter$processUserLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderMapOverlayPresenter$processUserLocation$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderMapOverlayPresenter$processUserLocation$1.label;
                zy11 zy11Var = zy11.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!this.s0.p()) {
                        ((u080) Dg()).z3();
                        return zy11Var;
                    }
                    this.Z.b = mo21Var;
                    if (mo21Var == null) {
                        return zy11Var;
                    }
                    sk90 sk90Var = new sk90(mo21Var.a, mo21Var.b, mo21Var.c, mo21Var.f);
                    orderMapOverlayPresenter$processUserLocation$1.L$0 = mo21Var;
                    orderMapOverlayPresenter$processUserLocation$1.label = 1;
                    if (this.u0.c(sk90Var, orderMapOverlayPresenter$processUserLocation$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mo21Var = (mo21) orderMapOverlayPresenter$processUserLocation$1.L$0;
                    kotlin.b.b(obj);
                }
                ((u080) Dg()).updateUserLocation(mo21Var);
                if (this.W.f()) {
                    ((u080) Dg()).z3();
                } else {
                    ((u080) Dg()).u5();
                }
                this.y1.g(new w080(3));
                return zy11Var;
            }
        }
        orderMapOverlayPresenter$processUserLocation$1 = new OrderMapOverlayPresenter$processUserLocation$1(this, continuation);
        Object obj2 = orderMapOverlayPresenter$processUserLocation$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderMapOverlayPresenter$processUserLocation$1.label;
        zy11 zy11Var2 = zy11.a;
        if (i != 0) {
        }
        ((u080) Dg()).updateUserLocation(mo21Var);
        if (this.W.f()) {
        }
        this.y1.g(new w080(3));
        return zy11Var2;
    }

    public final void Zg(long j) {
        ObjectAppearanceOverride objectAppearanceOverride = this.C0.b;
        if (objectAppearanceOverride == null) {
            return;
        }
        this.G0 = objectAppearanceOverride;
        pzt0 pzt0Var = this.E0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.E0 = tje.N(Kg(), null, null, new OrderMapOverlayPresenter$scheduleOverlayShownAnalytics$1(j, this, null), 3);
    }

    public final void ah() {
        long j;
        kl3 jby0Var;
        TaxiTravelerMovementExperiment$TurboMode$Strategy$Fixed taxiTravelerMovementExperiment$TurboMode$Strategy$Fixed;
        Double d;
        Double d2;
        Integer num;
        pzt0 pzt0Var = this.Q0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        OrderStatusInfo V = this.q0.a.b().V();
        TaxiTravelerMovementExperiment.Companion.getClass();
        V.getClass();
        qn11 b = V.b(TaxiTravelerMovementExperiment.class);
        if (b == null) {
            b = TaxiTravelerMovementExperiment.f;
        }
        TaxiTravelerMovementExperiment taxiTravelerMovementExperiment = (TaxiTravelerMovementExperiment) b;
        Double d3 = taxiTravelerMovementExperiment.b;
        if (d3 != null) {
            j = (long) (d3.doubleValue() * 1000.0d);
        } else {
            oby0 oby0Var = oby0.e;
            j = 13000;
        }
        long j2 = j;
        TaxiTravelerMovementExperiment.TurboMode turboMode = taxiTravelerMovementExperiment.c;
        long intValue = (turboMode == null || (num = turboMode.b) == null) ? 80000L : num.intValue() * 1000;
        com.yandex.go.taxi.order.experiments.r rVar = turboMode != null ? turboMode.a : null;
        nby0 nby0Var = new nby0((!(rVar instanceof TaxiTravelerMovementExperiment$TurboMode$Strategy$Fixed) || (d = (taxiTravelerMovementExperiment$TurboMode$Strategy$Fixed = (TaxiTravelerMovementExperiment$TurboMode$Strategy$Fixed) rVar).b) == null || (d2 = taxiTravelerMovementExperiment$TurboMode$Strategy$Fixed.a) == null) ? rVar instanceof com.yandex.go.taxi.order.experiments.m ? mby0.a : mby0.a : new lby0((long) (d2.doubleValue() * 1000.0d), (long) (d.doubleValue() * 1000.0d)), intValue);
        TaxiTravelerMovementExperiment.Teleporting teleporting = taxiTravelerMovementExperiment.d;
        if (teleporting == null) {
            jby0Var = new iby0(false);
        } else {
            Double d4 = teleporting.a;
            jby0Var = new jby0(d4 != null ? Long.valueOf((long) (d4.doubleValue() * 1000.0d)) : null, teleporting.b, teleporting.c);
        }
        oby0 oby0Var2 = new oby0(j2, nby0Var, jby0Var, jl40.l(taxiTravelerMovementExperiment.e, pby0.INSTANCE) ? hby0.a : hby0.b);
        yay0 yay0Var = this.C;
        yay0Var.getClass();
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(new com.yandex.go.taxi.order.net.tracker.d(new com.yandex.go.taxi.order.net.tracker.b(kotlinx.coroutines.flow.e.t(this.A.a()), yay0Var)), new TaxiTrackProducerProxy$startTracking$$inlined$flatMapLatest$1(null, oby0Var2));
        yay0Var.a.getClass();
        int i = 3;
        this.Q0 = com.yandex.go.coroutines.b.h(Kg(), new kotlinx.coroutines.flow.o(new kotlinx.coroutines.flow.k(new kotlinx.coroutines.flow.n(kotlinx.coroutines.flow.e.M(new kotlinx.coroutines.flow.o(new jqr(new x(com.yandex.go.coroutines.b.j(new jqr(kotlinx.coroutines.flow.e.f(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.F(X, uyj.a)), 0, BufferOverflow.DROP_OLDEST, 1), new OrderMapOverlayPresenter$startCarPositionTracking$1(this, null), i), 500L)), new OrderMapOverlayPresenter$startCarPositionTracking$3(this, null), i), new OrderMapOverlayPresenter$startCarPositionTracking$4(this, null)), null, 3), new OrderMapOverlayPresenter$startCarPositionTracking$5(this, null)), new OrderMapOverlayPresenter$startCarPositionTracking$6(this, null)), new OrderMapOverlayPresenter$startCarPositionTracking$7(this, null)));
    }

    public final void bh(DriveState driveState) {
        c0 c0Var;
        h3y h3yVar = this.N;
        z zVar = new z(new m0(((com.yandex.go.taxi.order.map.route.a) h3yVar.get()).k, this.b0.a(), new OrderMapOverlayPresenter$startRouteProgressTracking$1(3, null)), this);
        this.S.getClass();
        this.R0 = tje.N(Kg(), null, null, new OrderMapOverlayPresenter$startRouteProgressTracking$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(zVar, uyj.a), null, this), 3);
        this.S0 = tje.N(Kg(), null, null, new OrderMapOverlayPresenter$startRouteProgressTracking$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.t(new b0(((com.yandex.go.taxi.order.map.route.a) h3yVar.get()).k)), null, this.f0), 3);
        o2y0 o2y0Var = this.A;
        TaxiOrder b = o2y0Var.b();
        List Tg = Tg(b, driveState);
        if (Tg.size() < 2) {
            List d = b.t().d(true, this.I0 != null);
            RouteInfo routeInfo = b.V().r;
            c0Var = this;
            a3y0.d(c0Var.y0, "ROUTE_PROGRESS:NOT_ENOUGH_ROUTE_POINT", null, new jo0(b, c0Var, routeInfo != null ? routeInfo.c() : EmptyList.a, d, 26), 2);
        } else {
            c0Var = this;
        }
        if (c0Var.Ug()) {
            com.yandex.go.taxi.order.map.route.a aVar = (com.yandex.go.taxi.order.map.route.a) h3yVar.get();
            zzs v = b.v();
            p201 Q2 = c0Var.C.a(o2y0Var).Q2();
            Double d2 = Q2 != null ? Q2.j : null;
            if (v != null) {
                ((plm) aVar.b).b(new Point(v.a, v.b), d2);
            } else {
                aVar.getClass();
            }
        }
        ((com.yandex.go.taxi.order.map.route.a) h3yVar.get()).c(Tg);
        c0Var.A0.b(Tg);
    }

    public final void ch() {
        pzt0 pzt0Var = this.R0;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        pzt0 pzt0Var2 = this.S0;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        com.yandex.go.taxi.order.map.route.a aVar = (com.yandex.go.taxi.order.map.route.a) this.N.get();
        aVar.A = false;
        aVar.n.b();
        r0 r0Var = ((plm) aVar.b).b;
        tal0 tal0Var = new tal0(null, null, null, null);
        r0Var.getClass();
        r0Var.m(null, tal0Var);
        aVar.x = i201.a;
        aVar.y = "";
        o2y0 o2y0Var = aVar.e;
        if (an91.g(o2y0Var.c())) {
            l3l0 l3l0Var = aVar.h;
            l3l0Var.a.remove(o2y0Var.b().a);
        }
        ru.yandex.taxi.sdc.route.presentation.a aVar2 = this.A0;
        aVar2.f.a(null);
        aVar2.b.a();
        ((u080) Dg()).e0();
    }

    public final void dh() {
        Map f;
        Map f2;
        ObjectAppearanceOverride objectAppearanceOverride = this.G0;
        if (objectAppearanceOverride != null && ((gh00) this.K).i().e(this.I0)) {
            this.G0 = null;
            md6 md6Var = this.w0;
            md6Var.getClass();
            String str = objectAppearanceOverride.a;
            ObjectAppearanceAnalytics objectAppearanceAnalytics = objectAppearanceOverride.e;
            if (str != null && ((gj6) md6Var.c).a.add(str)) {
                dei0 dei0Var = (dei0) md6Var.b;
                CreativeType creativeType = CreativeType.BrandingCar;
                if (objectAppearanceAnalytics == null || (f = objectAppearanceAnalytics.a) == null) {
                    f = kotlin.collections.b.f();
                }
                if (objectAppearanceAnalytics == null || (f2 = objectAppearanceAnalytics.b) == null) {
                    f2 = kotlin.collections.b.f();
                }
                ((com.yandex.go.analytics.realtime.a) dei0Var).d(new iei0(creativeType, str, f, f2, 2));
            }
        }
    }

    public final void eh() {
        yay0 yay0Var = this.C;
        o2y0 o2y0Var = this.A;
        if (!yay0Var.a(o2y0Var).Hc()) {
            ((u080) Dg()).U0();
            return;
        }
        ((u080) Dg()).o0(this.H0);
        boolean b9 = yay0Var.a(o2y0Var).b9();
        boolean B0 = yay0Var.a(o2y0Var).B0();
        if (b9) {
            ((u080) Dg()).qe(B0);
        } else {
            ((u080) Dg()).g2();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00da, code lost:
    
        if ((r3 == null ? com.yandex.go.taxi.order.models.api.response.typed_experiments.WalkRouteOrderExperiment.OrderStatusRule.PointType.NONE : r3.c) == r11) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0112, code lost:
    
        if (r0 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0114, code lost:
    
        r7.e = r9;
        r7.f = r10;
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x018f, code lost:
    
        if (r6 == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0191, code lost:
    
        r0 = new com.yandex.go.taxi.order.map.overlay.OrderMapOverlayPresenter$updateWalkRoute$1(1, r24, com.yandex.go.taxi.order.map.overlay.c0.class, "handleWalkingRoute", "handleWalkingRoute(Lcom/yandex/mapkit/transport/masstransit/Route;)V", 0);
        r1 = new defpackage.v080(r24, r8);
        r11 = r7.b;
        r12 = new defpackage.jx6(3, r0);
        r14 = new defpackage.x5s0(19, r1);
        r11.getClass();
        r15 = new defpackage.j641(r9.getLongitude(), r9.getLatitude(), r10.getLongitude(), r10.getLatitude());
        r0 = (com.yandex.mapkit.transport.masstransit.Route) r11.c.get(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01d2, code lost:
    
        if (r0 == null) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01d4, code lost:
    
        r12.accept(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01d7, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01d8, code lost:
    
        r11.a.b(new defpackage.at5(r9, r10, r11, r12, r15, r14, 15), true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01e6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x011b, code lost:
    
        r0 = r7.e;
        r1 = r7.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x011f, code lost:
    
        if (r0 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0121, code lost:
    
        if (r1 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0124, code lost:
    
        r0 = ru.yandex.taxi.map.utils.a.i(r9.getLatitude(), r9.getLongitude(), r0.getLatitude(), r0.getLongitude());
        r1 = ru.yandex.taxi.map.utils.a.i(r10.getLatitude(), r10.getLongitude(), r1.getLatitude(), r1.getLongitude());
        r3 = r7.a();
        r11 = r3.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0152, code lost:
    
        if (r11 == null) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0158, code lost:
    
        if (r11.intValue() >= 0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x015b, code lost:
    
        r3 = r3.f.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x017f, code lost:
    
        r3 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0182, code lost:
    
        if (r0 > r3) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0186, code lost:
    
        if (r1 <= r3) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0189, code lost:
    
        if (r6 == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x018b, code lost:
    
        r7.e = r9;
        r7.f = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0188, code lost:
    
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0162, code lost:
    
        defpackage.a3y0.d(r3.j, "minDistanceOffsetMeters", new java.lang.IllegalStateException("invalid routeInfoMinDurationSeconds: " + r11), null, 4);
        r3 = Integer.MAX_VALUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x010e, code lost:
    
        if (r1 > r3) goto L85;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void fh() {
        int i;
        int i2;
        List list;
        c641 c641Var = this.T;
        if (!c641Var.c()) {
            ((u080) Dg()).ia();
            return;
        }
        WalkRouteOrderExperiment.OrderStatusRule d = c641Var.d();
        WalkRouteOrderExperiment.OrderStatusRule.PointType pointType = d == null ? WalkRouteOrderExperiment.OrderStatusRule.PointType.NONE : d.b;
        cgi0 cgi0Var = this.W;
        Point a = cgi0Var.a(pointType);
        WalkRouteOrderExperiment.OrderStatusRule d2 = c641Var.d();
        Point a2 = cgi0Var.a(d2 == null ? WalkRouteOrderExperiment.OrderStatusRule.PointType.NONE : d2.c);
        if (a == null || a2 == null) {
            ((u080) Dg()).ia();
            return;
        }
        float i3 = ru.yandex.taxi.map.utils.a.i(a.getLatitude(), a.getLongitude(), a2.getLatitude(), a2.getLongitude());
        WalkRouteOrderExperiment a3 = c641Var.a();
        Integer num = a3.c;
        boolean z = false;
        if (num == null || num.intValue() < 0) {
            a3y0.d(a3.j, "maxDistanceMeters", new IllegalStateException("invalid maxDistanceMeters: " + num), null, 4);
            i = 0;
        } else {
            i = num.intValue();
        }
        if (i3 >= i) {
            ((u080) Dg()).ia();
            return;
        }
        int i4 = 1;
        ((u080) Dg()).r5((!c641Var.b(((gh00) this.K).j()) || (list = this.K0) == null || list.isEmpty()) ? false : true);
        boolean z2 = this.K0 != null;
        mo21 mo21Var = this.Z.b;
        float f = mo21Var != null ? mo21Var.c : Float.MAX_VALUE;
        WalkRouteOrderExperiment.OrderStatusRule d3 = c641Var.d();
        WalkRouteOrderExperiment.OrderStatusRule.PointType pointType2 = d3 == null ? WalkRouteOrderExperiment.OrderStatusRule.PointType.NONE : d3.b;
        WalkRouteOrderExperiment.OrderStatusRule.PointType pointType3 = WalkRouteOrderExperiment.OrderStatusRule.PointType.USER_LOCATION;
        if (pointType2 != pointType3) {
            WalkRouteOrderExperiment.OrderStatusRule d4 = c641Var.d();
        }
        WalkRouteOrderExperiment a4 = c641Var.a();
        Integer num2 = a4.g;
        if (num2 == null || num2.intValue() < 0) {
            a3y0.d(a4.j, "maxLocationAccuracyMeters", new IllegalStateException("invalid maxLocationAccuracyMeters: " + num2), null, 4);
            i2 = 0;
        } else {
            i2 = num2.intValue();
        }
    }
}
