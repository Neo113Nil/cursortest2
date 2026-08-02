package com.yandex.go.superapp.discovery.map.impl.domain.interactors;

import com.yandex.mapkit.Animation;
import com.yandex.mapkit.geometry.BoundingBox;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.cwa1;
import defpackage.gh00;
import defpackage.hfc0;
import defpackage.hxx;
import defpackage.itv0;
import defpackage.izv0;
import defpackage.jgc0;
import defpackage.jl40;
import defpackage.k0b0;
import defpackage.ktv0;
import defpackage.lzu0;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.ouv0;
import defpackage.pep0;
import defpackage.po21;
import defpackage.pv0;
import defpackage.qvv;
import defpackage.r3v;
import defpackage.s0w0;
import defpackage.sls;
import defpackage.tpr;
import defpackage.uva;
import defpackage.yvf0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes14.dex */
public final class c {
    public final ktv0 a;
    public final ah00 b;
    public final po21 c;
    public final k0b0 d;
    public final yvf0 e;
    public final izv0 f;
    public final oep0 g;
    public final com.yandex.go.superapp.discovery.map.impl.domain.interactors.settlement.d h;
    public final ru.yandex.taxi.search.suggest.i i;
    public final qvv j;
    public final atd0 k;
    public final r3v l;
    public final hfc0 m;

    public c(ktv0 ktv0Var, ah00 ah00Var, po21 po21Var, k0b0 k0b0Var, yvf0 yvf0Var, izv0 izv0Var, oep0 oep0Var, com.yandex.go.superapp.discovery.map.impl.domain.interactors.settlement.d dVar, ru.yandex.taxi.search.suggest.i iVar, qvv qvvVar, atd0 atd0Var, r3v r3vVar, hfc0 hfc0Var) {
        this.a = ktv0Var;
        this.b = ah00Var;
        this.c = po21Var;
        this.d = k0b0Var;
        this.e = yvf0Var;
        this.f = izv0Var;
        this.g = oep0Var;
        this.h = dVar;
        this.i = iVar;
        this.j = qvvVar;
        this.k = atd0Var;
        this.l = r3vVar;
        this.m = hfc0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r14 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1 superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1;
        Object obj;
        int i;
        zzs zzsVar;
        Point point;
        BoundingBox a;
        if (continuationImpl instanceof SuperAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1) {
            superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1 = (SuperAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1) continuationImpl;
            int i2 = superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1.label;
                int i3 = 1;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1.label = 1;
                    obj2 = f(superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        point = (Point) superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1.L$1;
                        kotlin.b.b(obj2);
                        Point point2 = this.m.a;
                        a = point2 != null ? ru.yandex.taxi.map_common.map.k.a(new lzu0(7, point, point2)) : null;
                        if (a == null) {
                            ((gh00) this.b).A(a, new ouv0(this, 0));
                        } else {
                            this.f.getClass();
                            ((gh00) this.b).g.k(new CameraPosition(point, 17.0f, 0.0f, 0.0f), 500.0f, Animation.Type.SMOOTH, new ouv0(this, i3));
                        }
                        return zy11.a;
                    }
                    kotlin.b.b(obj2);
                }
                zzsVar = (zzs) obj2;
                Point d = cwa1.d(zzsVar);
                jgc0 jgc0Var = (jgc0) this.l;
                jgc0Var.I = true;
                jgc0Var.Ng(zzsVar.a, zzsVar.b, zzsVar.c);
                jgc0Var.t0();
                superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1.L$0 = null;
                superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1.L$1 = d;
                superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1.label = 2;
                if (g(zzsVar, superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1) != obj) {
                    point = d;
                    Point point22 = this.m.a;
                    if (point22 != null) {
                    }
                    if (a == null) {
                    }
                    return zy11.a;
                }
                return obj;
            }
        }
        superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1 = new SuperAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1(this, continuationImpl);
        Object obj22 = superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1.label;
        int i32 = 1;
        if (i != 0) {
        }
        zzsVar = (zzs) obj22;
        Point d2 = cwa1.d(zzsVar);
        jgc0 jgc0Var2 = (jgc0) this.l;
        jgc0Var2.I = true;
        jgc0Var2.Ng(zzsVar.a, zzsVar.b, zzsVar.c);
        jgc0Var2.t0();
        superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1.L$0 = null;
        superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1.L$1 = d2;
        superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1.label = 2;
        if (g(zzsVar, superAppDiscoveryMapFocusInteractor$focusCurrentPositionAnimated$1) != obj) {
        }
        return obj;
    }

    public final void b(zzs zzsVar) {
        Point d = (!jl40.l(zzsVar, zzs.f) ? zzsVar : null) != null ? cwa1.d(zzsVar) : null;
        if (d == null) {
            return;
        }
        ((gh00) this.b).D(d, Math.max(((gh00) this.b).e.c.getZoom(), this.a.b()), 400.0f, new ouv0(this, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0068, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0046, code lost:
    
        if (r7 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1 superAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1;
        int i;
        zzs zzsVar;
        if (continuationImpl instanceof SuperAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1) {
            superAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1 = (SuperAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1) continuationImpl;
            int i2 = superAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr j = this.i.j(RoutePointType.POINT_A, true);
                    superAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1.label = 1;
                    obj = kotlinx.coroutines.flow.e.y(j, superAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        zzsVar = ((mo21) obj).a();
                        b(zzsVar);
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                zzs B = ((pv0) obj).a.B();
                zzsVar = jl40.l(B, zzs.f) ? null : B;
                if (zzsVar == null) {
                    superAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1.label = 2;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.c).h(superAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1);
                }
                b(zzsVar);
                return zy11.a;
            }
        }
        superAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1 = new SuperAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1(this, continuationImpl);
        Object obj2 = superAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapFocusInteractor$focusOnUserLocationKeepingZoom$1.label;
        if (i != 0) {
        }
        zzs B2 = ((pv0) obj2).a.B();
        if (jl40.l(B2, zzs.f)) {
        }
        if (zzsVar == null) {
        }
        b(zzsVar);
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x004c, code lost:
    
        if (r12 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1 superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1;
        Object obj;
        CoroutineSingletons coroutineSingletons;
        int i;
        Point point;
        BoundingBox boundingBox;
        if (continuationImpl instanceof SuperAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1) {
            superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1 = (SuperAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1) continuationImpl;
            int i2 = superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.label = i2 - Integer.MIN_VALUE;
                obj = superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.label;
                ktv0 ktv0Var = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.c).h(superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        point = (Point) superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.L$1;
                        kotlin.b.b(obj);
                        boundingBox = (BoundingBox) obj;
                        ah00 ah00Var = this.b;
                        if (boundingBox != null) {
                            ((gh00) ah00Var).D(point, ktv0Var.b(), 400.0f, null);
                        } else {
                            ((gh00) ah00Var).A(boundingBox, null);
                        }
                        return zy11.a;
                    }
                    kotlin.b.b(obj);
                }
                mo21 mo21Var = (mo21) obj;
                Point point2 = new Point(mo21Var.a, mo21Var.b);
                itv0 itv0Var = !(ktv0Var instanceof itv0) ? (itv0) ktv0Var : null;
                long j = itv0Var == null ? itv0Var.h : 0L;
                superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.L$0 = null;
                superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.L$1 = point2;
                superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.J$0 = j;
                superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.label = 2;
                obj = this.h.a(point2, j, superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1);
                if (obj != coroutineSingletons) {
                    point = point2;
                    boundingBox = (BoundingBox) obj;
                    ah00 ah00Var2 = this.b;
                    if (boundingBox != null) {
                    }
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1 = new SuperAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1(this, continuationImpl);
        obj = superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.label;
        ktv0 ktv0Var2 = this.a;
        if (i != 0) {
        }
        mo21 mo21Var2 = (mo21) obj;
        Point point22 = new Point(mo21Var2.a, mo21Var2.b);
        if (!(ktv0Var2 instanceof itv0)) {
        }
        if (itv0Var == null) {
        }
        superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.L$0 = null;
        superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.L$1 = point22;
        superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.J$0 = j;
        superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1.label = 2;
        obj = this.h.a(point22, j, superAppDiscoveryMapFocusInteractor$focusOnUserSettlementOrDefault$1);
        if (obj != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    public final Object e(sls slsVar, sls slsVar2, SuspendLambda suspendLambda) {
        if (this.d.b()) {
            return a(suspendLambda);
        }
        slsVar.invoke();
        uva uvaVar = new uva(12, (s0w0) this.e.get(), slsVar2);
        oep0 oep0Var = this.g;
        zy11 zy11Var = zy11.a;
        ((pep0) oep0Var).f(uvaVar, zy11Var, hxx.a);
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapFocusInteractor$getCurrentGetPoint$1 superAppDiscoveryMapFocusInteractor$getCurrentGetPoint$1;
        int i;
        if (continuationImpl instanceof SuperAppDiscoveryMapFocusInteractor$getCurrentGetPoint$1) {
            superAppDiscoveryMapFocusInteractor$getCurrentGetPoint$1 = (SuperAppDiscoveryMapFocusInteractor$getCurrentGetPoint$1) continuationImpl;
            int i2 = superAppDiscoveryMapFocusInteractor$getCurrentGetPoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapFocusInteractor$getCurrentGetPoint$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapFocusInteractor$getCurrentGetPoint$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapFocusInteractor$getCurrentGetPoint$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppDiscoveryMapFocusInteractor$getCurrentGetPoint$1.label = 1;
                    obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.c).h(superAppDiscoveryMapFocusInteractor$getCurrentGetPoint$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((mo21) obj).a();
            }
        }
        superAppDiscoveryMapFocusInteractor$getCurrentGetPoint$1 = new SuperAppDiscoveryMapFocusInteractor$getCurrentGetPoint$1(this, continuationImpl);
        Object obj2 = superAppDiscoveryMapFocusInteractor$getCurrentGetPoint$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapFocusInteractor$getCurrentGetPoint$1.label;
        if (i != 0) {
        }
        return ((mo21) obj2).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(zzs zzsVar, ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1 superAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1;
        int i;
        if (continuationImpl instanceof SuperAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1) {
            superAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1 = (SuperAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1) continuationImpl;
            int i2 = superAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr q = ((ru.yandex.taxi.search.suggest.i) this.k).q(false, zzsVar, RoutePointType.POINT_A, true, true, "geo", null, PositionInitAction.GEO);
                    superAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1.L$0 = null;
                    superAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1.label = 1;
                    if (kotlinx.coroutines.flow.e.y(q, superAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1) == coroutineSingletons) {
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
        superAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1 = new SuperAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1(this, continuationImpl);
        Object obj2 = superAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapFocusInteractor$updateSourceAddressToGps$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
