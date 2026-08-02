package com.yandex.go.intentprocessor;

import android.content.Intent;
import android.net.Uri;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.domain.repositories.e0;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import defpackage.a7t0;
import defpackage.arv0;
import defpackage.c2l0;
import defpackage.gfj0;
import defpackage.h3y;
import defpackage.hz00;
import defpackage.j4l0;
import defpackage.jv20;
import defpackage.k40;
import defpackage.n7z;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.o7z;
import defpackage.oep0;
import defpackage.p2y0;
import defpackage.p7z;
import defpackage.ptw;
import defpackage.pzt0;
import defpackage.q4l0;
import defpackage.q7z;
import defpackage.r7z;
import defpackage.s7z;
import defpackage.s811;
import defpackage.s8o;
import defpackage.t61;
import defpackage.t7z;
import defpackage.tje;
import defpackage.tls;
import defpackage.vzv0;
import defpackage.w511;
import defpackage.ykb1;
import defpackage.yqv0;
import defpackage.yvf0;
import defpackage.z0j;
import defpackage.z9z;
import defpackage.zy11;
import java.util.HashMap;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class i {
    public final arv0 a;
    public final com.yandex.go.blockeduser.data.c b;
    public final q4l0 c;
    public final k40 d;
    public final z0j e;
    public final p2y0 f;
    public final z9z g;
    public final yvf0 h;
    public final h3y i;
    public final oep0 j;
    public final com.yandex.go.taxi.order.multi.a k;
    public final com.yandex.go.navigation.screen.c l;
    public final ptw m = new ptw(21, this);

    public i(arv0 arv0Var, com.yandex.go.blockeduser.data.c cVar, q4l0 q4l0Var, k40 k40Var, z0j z0jVar, p2y0 p2y0Var, z9z z9zVar, yvf0 yvf0Var, h3y h3yVar, oep0 oep0Var, com.yandex.go.taxi.order.multi.a aVar, com.yandex.go.navigation.screen.c cVar2) {
        this.a = arv0Var;
        this.b = cVar;
        this.c = q4l0Var;
        this.d = k40Var;
        this.e = z0jVar;
        this.f = p2y0Var;
        this.g = z9zVar;
        this.h = yvf0Var;
        this.i = h3yVar;
        this.j = oep0Var;
        this.k = aVar;
        this.l = cVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0103, code lost:
    
        if (r10.b(r9, r6) == r0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0087, code lost:
    
        if (r11 == r0) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(i iVar, ContinuationImpl continuationImpl) {
        LocationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$1 locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$1;
        int i;
        o2y0 o2y0Var;
        Object a;
        o2y0 o2y0Var2;
        Object obj;
        iVar.getClass();
        if (continuationImpl instanceof LocationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$1) {
            locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$1 = (LocationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$1) continuationImpl;
            int i2 = locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                LocationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$1 locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12 = locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$1;
                Object obj2 = locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.result;
                Object obj3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    p2y0 p2y0Var = iVar.f;
                    locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.label = 1;
                    obj2 = ((e0) p2y0Var).k(locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                kotlin.b.b(obj2);
                                return Boolean.TRUE;
                            }
                            obj = locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.L$3;
                            kotlin.b.b(obj2);
                            a = obj;
                            if (Result.a(a) != null) {
                                return Boolean.FALSE;
                            }
                            return Boolean.TRUE;
                        }
                        o2y0Var2 = (o2y0) locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.L$1;
                        kotlin.b.b(obj2);
                        a = ((Result) obj2).getValue();
                        if (!(a instanceof Result.Failure)) {
                            locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.L$0 = null;
                            locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.L$1 = null;
                            locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.L$2 = null;
                            locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.L$3 = a;
                            locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.L$4 = null;
                            locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.label = 3;
                            if (iVar.b(o2y0Var2, locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12) != obj3) {
                                obj = a;
                                a = obj;
                            }
                            return obj3;
                        }
                        if (Result.a(a) != null) {
                        }
                        return Boolean.TRUE;
                    }
                    kotlin.b.b(obj2);
                }
                List list = (List) obj2;
                o2y0Var = (o2y0) kotlin.collections.a.b0(list);
                if (o2y0Var != null) {
                    return Boolean.FALSE;
                }
                TaxiOrder b = o2y0Var.b();
                if (!ykb1.b(b) || list.size() != 1 || b.l.getZ()) {
                    return Boolean.FALSE;
                }
                if (iVar.l.f()) {
                    locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.L$0 = null;
                    locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.L$1 = null;
                    locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.L$2 = null;
                    locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.label = 4;
                } else {
                    com.yandex.go.taxi.order.multi.a aVar = iVar.k;
                    DetailsOpenReason detailsOpenReason = DetailsOpenReason.AUTO;
                    TaxiCardNavigationAction taxiCardNavigationAction = TaxiCardNavigationAction.EMPTY;
                    locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.L$0 = null;
                    locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.L$1 = o2y0Var;
                    locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.L$2 = null;
                    locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12.label = 2;
                    a = aVar.a(b, false, detailsOpenReason, taxiCardNavigationAction, locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$12);
                    if (a != obj3) {
                        o2y0Var2 = o2y0Var;
                        if (!(a instanceof Result.Failure)) {
                        }
                        if (Result.a(a) != null) {
                        }
                        return Boolean.TRUE;
                    }
                }
                return obj3;
            }
        }
        locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$1 = new LocationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$1(iVar, continuationImpl);
        LocationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$1 locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$122 = locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$1;
        Object obj22 = locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$122.result;
        Object obj32 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationDependentIntentInteractorImpl$awaitCompleteScreenDismissedIfNeeded$122.label;
        if (i != 0) {
        }
        List list2 = (List) obj22;
        o2y0Var = (o2y0) kotlin.collections.a.b0(list2);
        if (o2y0Var != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(o2y0 o2y0Var, ContinuationImpl continuationImpl) {
        LocationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1 locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1;
        int i;
        if (continuationImpl instanceof LocationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1) {
            locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1 = (LocationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1) continuationImpl;
            int i2 = locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    kotlinx.coroutines.flow.internal.h K = kotlinx.coroutines.flow.e.K(new f(((e0) this.f).n(), o2y0Var), new h(o2y0Var.a()));
                    locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1.L$0 = null;
                    locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(K, locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1 = new LocationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1(this, continuationImpl);
        Object obj2 = locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationDependentIntentInteractorImpl$awaitOrderWithoutCompleteScreen$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final void c() {
        j4l0 j4l0Var = (j4l0) this.i.get();
        LocationDependentIntentInteractorImpl$handleRouteIntent$1 locationDependentIntentInteractorImpl$handleRouteIntent$1 = new LocationDependentIntentInteractorImpl$handleRouteIntent$1(this, null);
        pzt0 pzt0Var = j4l0Var.c;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        j4l0Var.c = tje.N(j4l0Var.a, null, null, new RouteIntentHandlerPauseDelegate$handle$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.T(new o(j4l0Var.b), 1), locationDependentIntentInteractorImpl$handleRouteIntent$1, null), 3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if (r0.a().b() != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d9, code lost:
    
        if (((java.lang.Boolean) r9.invoke(r8)).booleanValue() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00cd, code lost:
    
        if (r7 != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        if (r0.a().b() != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00bb, code lost:
    
        if (r0.a().b() != null) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(t7z t7zVar, tls tlsVar) {
        k40 k40Var = this.d;
        boolean b = k40Var.a.b();
        q4l0 q4l0Var = this.c;
        if (!b && !q4l0Var.b) {
            q4l0Var.b = true;
            k40Var.n(1);
            t61 t61Var = this.g.a;
            t61Var.getClass();
            t61Var.a.a("GeolocationCard.Shown", new HashMap(), 1, new HashMap());
            return false;
        }
        this.e.b();
        ((a7t0) this.a).b(new yqv0(SummaryUiState$Type.NORMAL, ""));
        boolean z = k40Var.a.b() || q4l0Var.b;
        boolean z2 = t7zVar instanceof n7z;
        if (z2) {
            return z && ((Boolean) tlsVar.invoke(t7zVar)).booleanValue();
        }
        if (t7zVar instanceof r7z) {
            r7z r7zVar = (r7z) t7zVar;
            if (r7zVar.a().a() != null) {
            }
        } else if (t7zVar instanceof p7z) {
            p7z p7zVar = (p7z) t7zVar;
            if (p7zVar.a().a() != null) {
            }
        } else if (t7zVar instanceof s7z) {
            s7z s7zVar = (s7z) t7zVar;
            if (s7zVar.a().a() != null) {
            }
        } else if (!(t7zVar instanceof q7z) && !(t7zVar instanceof o7z) && !z2) {
            w511.b();
            return false;
        }
    }

    public final boolean e(Intent intent, tls tlsVar) {
        t7z o7zVar;
        if (s8o.v(intent)) {
            o7zVar = new n7z(intent);
        } else {
            Uri data = intent.getData();
            if (data != null) {
                c2l0 g = hz00.E.g(data);
                if (g != null) {
                    o7zVar = new r7z(g);
                } else {
                    gfj0 f = hz00.D.f(data);
                    if (f != null) {
                        o7zVar = new q7z(f);
                    } else {
                        s811 e = vzv0.i.e(data);
                        if (e != null) {
                            o7zVar = new s7z(e);
                        } else {
                            jv20 e2 = hz00.l.e(data);
                            if (e2 != null) {
                                o7zVar = new p7z(e2);
                            } else {
                                Uri data2 = intent.getData();
                                if (data2 == null ? false : "geo".equalsIgnoreCase(data2.getScheme())) {
                                    o7zVar = new o7z(data);
                                }
                            }
                        }
                    }
                }
            }
            o7zVar = null;
        }
        if (o7zVar == null) {
            return false;
        }
        return d(o7zVar, tlsVar);
    }
}
