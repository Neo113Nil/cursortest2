package com.yandex.go.mainscreen.superapp.impl.clarifyaddress.domain;

import defpackage.c34;
import defpackage.dxf0;
import defpackage.eyc;
import defpackage.fdz;
import defpackage.ftx;
import defpackage.fyc;
import defpackage.gmb0;
import defpackage.h3y;
import defpackage.j5e0;
import defpackage.jbh;
import defpackage.jqr;
import defpackage.jzb;
import defpackage.kr0;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pv0;
import defpackage.rqo;
import defpackage.sjh;
import defpackage.sl50;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u0w0;
import defpackage.uyj;
import defpackage.wb1;
import defpackage.wvv;
import defpackage.y2w0;
import defpackage.zy11;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.m0;
import ru.yandex.taxi.common_models.net.SimplePersistentBooleanExperiment;
import ru.yandex.taxi.common_models.net.map_object.Type;
import ru.yandex.taxi.common_models.net.map_object.v0;
import ru.yandex.taxi.common_models.net.map_object.z;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;

/* loaded from: classes.dex */
public final class v {
    public final ru.yandex.taxi.search.suggest.i a;
    public final com.yandex.go.route.interactor.b b;
    public final tt2 c;
    public final y2w0 d;
    public final com.yandex.go.zone.repository.o e;
    public final po21 f;
    public final ru.yandex.taxi.main.map.f g;
    public final wb1 h;
    public final wvv i;
    public final kr0 j;
    public final fdz k;
    public final sl50 l;
    public final h3y m;
    public final ru.yandex.taxi.main.map.d n;
    public final u0w0 o;
    public final ftx p;
    public final jzb q;
    public final ru.yandex.taxi.preorder.source.pickup.a r;
    public final boolean s;
    public final boolean t;

    public v(ru.yandex.taxi.search.suggest.i iVar, com.yandex.go.route.interactor.b bVar, tt2 tt2Var, y2w0 y2w0Var, com.yandex.go.zone.repository.o oVar, po21 po21Var, ru.yandex.taxi.main.map.f fVar, wb1 wb1Var, wvv wvvVar, kr0 kr0Var, fdz fdzVar, dxf0 dxf0Var, sl50 sl50Var, h3y h3yVar, ru.yandex.taxi.main.map.d dVar, u0w0 u0w0Var, ftx ftxVar, jzb jzbVar, ru.yandex.taxi.preorder.source.pickup.a aVar) {
        this.a = iVar;
        this.b = bVar;
        this.c = tt2Var;
        this.d = y2w0Var;
        this.e = oVar;
        this.f = po21Var;
        this.g = fVar;
        this.h = wb1Var;
        this.i = wvvVar;
        this.j = kr0Var;
        this.k = fdzVar;
        this.l = sl50Var;
        this.m = h3yVar;
        this.n = dVar;
        this.o = u0w0Var;
        this.p = ftxVar;
        this.q = jzbVar;
        this.r = aVar;
        this.s = sl50Var.a.get();
        this.t = ((Boolean) ((jbh) ((rqo) dxf0Var.a)).f(SimplePersistentBooleanExperiment.SKIP_CACHED_LOCATION_ON_START).c()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(v vVar, pv0 pv0Var, Continuation continuation) {
        SuperAppMainScreenAddressInteractorImpl$handlePointA$1 superAppMainScreenAddressInteractorImpl$handlePointA$1;
        int i;
        List immediateActions;
        Object obj;
        Object obj2;
        ru.yandex.taxi.preorder.source.pickup.a aVar = vVar.r;
        if (continuation instanceof SuperAppMainScreenAddressInteractorImpl$handlePointA$1) {
            superAppMainScreenAddressInteractorImpl$handlePointA$1 = (SuperAppMainScreenAddressInteractorImpl$handlePointA$1) continuation;
            int i2 = superAppMainScreenAddressInteractorImpl$handlePointA$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenAddressInteractorImpl$handlePointA$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = superAppMainScreenAddressInteractorImpl$handlePointA$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenAddressInteractorImpl$handlePointA$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    List list = pv0Var.e;
                    String str = pv0Var.f;
                    superAppMainScreenAddressInteractorImpl$handlePointA$1.L$0 = pv0Var;
                    superAppMainScreenAddressInteractorImpl$handlePointA$1.label = 1;
                    obj3 = aVar.e(str, list, superAppMainScreenAddressInteractorImpl$handlePointA$1);
                    if (obj3 == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pv0Var = (pv0) superAppMainScreenAddressInteractorImpl$handlePointA$1.L$0;
                    kotlin.b.b(obj3);
                }
                aVar.g((gmb0) obj3);
                y2w0 y2w0Var = vVar.d;
                y2w0Var.getClass();
                immediateActions = pv0Var.a.getImmediateActions();
                if (immediateActions == null) {
                    Iterator it = immediateActions.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        z zVar = (z) obj2;
                        if ((zVar != null ? zVar.a() : null) == Type.WHERE_YOU_ARE) {
                            break;
                        }
                    }
                    obj = (z) obj2;
                } else {
                    obj = null;
                }
                y2w0Var.a.a.set((obj instanceof v0 ? (v0) obj : null) == null);
                return zy11.a;
            }
        }
        superAppMainScreenAddressInteractorImpl$handlePointA$1 = new SuperAppMainScreenAddressInteractorImpl$handlePointA$1(vVar, continuation);
        Object obj32 = superAppMainScreenAddressInteractorImpl$handlePointA$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenAddressInteractorImpl$handlePointA$1.label;
        if (i != 0) {
        }
        aVar.g((gmb0) obj32);
        y2w0 y2w0Var2 = vVar.d;
        y2w0Var2.getClass();
        immediateActions = pv0Var.a.getImmediateActions();
        if (immediateActions == null) {
        }
        if (obj instanceof v0) {
        }
        y2w0Var2.a.a.set((obj instanceof v0 ? (v0) obj : null) == null);
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        SuperAppMainScreenAddressInteractorImpl$awaitSourceAddress$1 superAppMainScreenAddressInteractorImpl$awaitSourceAddress$1;
        int i;
        if (continuationImpl instanceof SuperAppMainScreenAddressInteractorImpl$awaitSourceAddress$1) {
            superAppMainScreenAddressInteractorImpl$awaitSourceAddress$1 = (SuperAppMainScreenAddressInteractorImpl$awaitSourceAddress$1) continuationImpl;
            int i2 = superAppMainScreenAddressInteractorImpl$awaitSourceAddress$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenAddressInteractorImpl$awaitSourceAddress$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenAddressInteractorImpl$awaitSourceAddress$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenAddressInteractorImpl$awaitSourceAddress$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    tpr k = this.b.k();
                    SuperAppMainScreenAddressInteractorImpl$awaitSourceAddress$2 superAppMainScreenAddressInteractorImpl$awaitSourceAddress$2 = new SuperAppMainScreenAddressInteractorImpl$awaitSourceAddress$2();
                    superAppMainScreenAddressInteractorImpl$awaitSourceAddress$1.label = 1;
                    if (kotlinx.coroutines.flow.e.x(k, superAppMainScreenAddressInteractorImpl$awaitSourceAddress$2, superAppMainScreenAddressInteractorImpl$awaitSourceAddress$1) == coroutineSingletons) {
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
        superAppMainScreenAddressInteractorImpl$awaitSourceAddress$1 = new SuperAppMainScreenAddressInteractorImpl$awaitSourceAddress$1(this, continuationImpl);
        Object obj2 = superAppMainScreenAddressInteractorImpl$awaitSourceAddress$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenAddressInteractorImpl$awaitSourceAddress$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final Object c(SuspendLambda suspendLambda) {
        int i = 3;
        jqr jqrVar = new jqr(kotlinx.coroutines.flow.e.t(new k(new jqr(new m0(kotlinx.coroutines.flow.e.t(new kotlinx.coroutines.flow.n(new kotlinx.coroutines.flow.o(new jqr(new m(new kotlinx.coroutines.flow.n(new o(this.a.k(RoutePointType.POINT_A, true), this), new SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$2(this, null)), this), new SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$4(2, this, v.class, "handlePointA", "handlePointA(Lcom/yandex/go/preorder/AddressInfo;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), i), new SuperAppMainScreenAddressInteractorImpl$listenToAddressChangePointAFlow$5(this, null)), new SuperAppMainScreenAddressInteractorImpl$listenToAddress$2(this, null))), new kotlinx.coroutines.flow.n(this.e.c(), new SuperAppMainScreenAddressInteractorImpl$listenToAddress$3(this, null)), new SuperAppMainScreenAddressInteractorImpl$listenToAddress$4(3, null)), new SuperAppMainScreenAddressInteractorImpl$listenToAddress$5(2, this, v.class, "onNewZoneAddress", "onNewZoneAddress(Lcom/yandex/go/address/models/ZoneAddress;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0), i))), new SuperAppMainScreenAddressInteractorImpl$listenToAddress$7(2, this.o, u0w0.class, "fetchNonCancelableZone", "fetchNonCancelableZone(Ljava/lang/String;)V", 4), i);
        this.c.getClass();
        sjh sjhVar = uyj.a;
        return kotlinx.coroutines.flow.e.j(kotlinx.coroutines.flow.e.F(jqrVar, mdh.b), suspendLambda);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00d0, code lost:
    
        if (r11 == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x008a, code lost:
    
        if (r11 == r2) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x006c, code lost:
    
        if (r11 == r2) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0188 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0189 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$1 superAppMainScreenAddressInteractorImpl$listenToUserLocation$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        pv0 pv0Var;
        zy11 zy11Var = zy11.a;
        if (continuationImpl instanceof SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$1) {
            superAppMainScreenAddressInteractorImpl$listenToUserLocation$1 = (SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$1) continuationImpl;
            int i2 = superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.label;
                int i3 = 3;
                if (i != 0) {
                    kotlin.b.b(obj);
                    ru.yandex.taxi.search.suggest.i iVar = this.a;
                    RoutePointType routePointType = RoutePointType.POINT_A;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.label = 1;
                    Object s = ((fyc) ((eyc) kotlin.collections.b.g(routePointType, iVar.e.k))).s(superAppMainScreenAddressInteractorImpl$listenToUserLocation$1);
                    if (s != coroutineSingletons) {
                        s = zy11Var;
                    }
                } else if (i == 1) {
                    kotlin.b.b(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return obj;
                        }
                        kotlin.b.b(obj);
                        if (!((Boolean) obj).booleanValue()) {
                            ((c34) this.m.get()).getClass();
                            return zy11Var;
                        }
                        this.i.a = false;
                        ((c34) this.m.get()).getClass();
                        boolean z = this.t;
                        po21 po21Var = this.f;
                        kotlinx.coroutines.flow.internal.g I = kotlinx.coroutines.flow.e.I(new jqr(new q(new jqr(new kotlinx.coroutines.flow.n(!z ? new s(((ru.yandex.taxi.preorder.source.userposition.e) po21Var).n()) : new kotlinx.coroutines.flow.n(new u(((ru.yandex.taxi.preorder.source.userposition.e) po21Var).n()), new SuperAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$3(this, null)), new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$3(this, null)), new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$4(this, null), i3), this), new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$6(this, null), i3), SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$7.a);
                        this.c.getClass();
                        sjh sjhVar = uyj.a;
                        tpr F = kotlinx.coroutines.flow.e.F(I, mdh.b);
                        ru.yandex.taxi.search.suggest.i iVar2 = this.a;
                        kotlinx.coroutines.flow.o oVar = new kotlinx.coroutines.flow.o(F, new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$safeCollect$1(this, null));
                        j5e0 j5e0Var = new j5e0(20, iVar2);
                        superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.L$0 = null;
                        superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.label = 4;
                        Object collect = oVar.collect(j5e0Var, superAppMainScreenAddressInteractorImpl$listenToUserLocation$1);
                        return collect != coroutineSingletons ? coroutineSingletons : collect;
                    }
                    kotlin.b.b(obj);
                    if (((Boolean) obj).booleanValue()) {
                        ((c34) this.m.get()).getClass();
                    } else if (!this.i.a && (pv0Var = (pv0) this.a.i().orElse(null)) != null && pv0Var.a.getGeoPointAcquisitionType() != GeoPointAcquisitionType.USER_LOCATION) {
                        superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.L$0 = null;
                        superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.label = 3;
                        obj = this.n.a(pv0Var.a.getRequestTime(), superAppMainScreenAddressInteractorImpl$listenToUserLocation$1);
                    }
                    this.i.a = false;
                    ((c34) this.m.get()).getClass();
                    boolean z2 = this.t;
                    po21 po21Var2 = this.f;
                    kotlinx.coroutines.flow.internal.g I2 = kotlinx.coroutines.flow.e.I(new jqr(new q(new jqr(new kotlinx.coroutines.flow.n(!z2 ? new s(((ru.yandex.taxi.preorder.source.userposition.e) po21Var2).n()) : new kotlinx.coroutines.flow.n(new u(((ru.yandex.taxi.preorder.source.userposition.e) po21Var2).n()), new SuperAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$3(this, null)), new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$3(this, null)), new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$4(this, null), i3), this), new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$6(this, null), i3), SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$7.a);
                    this.c.getClass();
                    sjh sjhVar2 = uyj.a;
                    tpr F2 = kotlinx.coroutines.flow.e.F(I2, mdh.b);
                    ru.yandex.taxi.search.suggest.i iVar22 = this.a;
                    kotlinx.coroutines.flow.o oVar2 = new kotlinx.coroutines.flow.o(F2, new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$safeCollect$1(this, null));
                    j5e0 j5e0Var2 = new j5e0(20, iVar22);
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.L$0 = null;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.label = 4;
                    Object collect2 = oVar2.collect(j5e0Var2, superAppMainScreenAddressInteractorImpl$listenToUserLocation$1);
                    if (collect2 != coroutineSingletons) {
                    }
                }
                if (!this.s || this.b.c().h() == null) {
                    this.l.a.set(false);
                    this.g.q = null;
                    ((c34) this.m.get()).getClass();
                    this.i.a = false;
                    ((c34) this.m.get()).getClass();
                    boolean z22 = this.t;
                    po21 po21Var22 = this.f;
                    kotlinx.coroutines.flow.internal.g I22 = kotlinx.coroutines.flow.e.I(new jqr(new q(new jqr(new kotlinx.coroutines.flow.n(!z22 ? new s(((ru.yandex.taxi.preorder.source.userposition.e) po21Var22).n()) : new kotlinx.coroutines.flow.n(new u(((ru.yandex.taxi.preorder.source.userposition.e) po21Var22).n()), new SuperAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$3(this, null)), new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$3(this, null)), new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$4(this, null), i3), this), new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$6(this, null), i3), SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$7.a);
                    this.c.getClass();
                    sjh sjhVar22 = uyj.a;
                    tpr F22 = kotlinx.coroutines.flow.e.F(I22, mdh.b);
                    ru.yandex.taxi.search.suggest.i iVar222 = this.a;
                    kotlinx.coroutines.flow.o oVar22 = new kotlinx.coroutines.flow.o(F22, new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$safeCollect$1(this, null));
                    j5e0 j5e0Var22 = new j5e0(20, iVar222);
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.L$0 = null;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.label = 4;
                    Object collect22 = oVar22.collect(j5e0Var22, superAppMainScreenAddressInteractorImpl$listenToUserLocation$1);
                    if (collect22 != coroutineSingletons) {
                    }
                } else {
                    kr0 kr0Var = this.j;
                    superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.label = 2;
                    obj = ((com.yandex.go.clarify_address.a) kr0Var).b(superAppMainScreenAddressInteractorImpl$listenToUserLocation$1);
                }
            }
        }
        superAppMainScreenAddressInteractorImpl$listenToUserLocation$1 = new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$1(this, continuationImpl);
        Object obj2 = superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.label;
        int i32 = 3;
        if (i != 0) {
        }
        if (this.s) {
        }
        this.l.a.set(false);
        this.g.q = null;
        ((c34) this.m.get()).getClass();
        this.i.a = false;
        ((c34) this.m.get()).getClass();
        boolean z222 = this.t;
        po21 po21Var222 = this.f;
        kotlinx.coroutines.flow.internal.g I222 = kotlinx.coroutines.flow.e.I(new jqr(new q(new jqr(new kotlinx.coroutines.flow.n(!z222 ? new s(((ru.yandex.taxi.preorder.source.userposition.e) po21Var222).n()) : new kotlinx.coroutines.flow.n(new u(((ru.yandex.taxi.preorder.source.userposition.e) po21Var222).n()), new SuperAppMainScreenAddressInteractorImpl$provideLocationUpdatesFlow$3(this, null)), new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$3(this, null)), new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$4(this, null), i32), this), new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$6(this, null), i32), SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$7.a);
        this.c.getClass();
        sjh sjhVar222 = uyj.a;
        tpr F222 = kotlinx.coroutines.flow.e.F(I222, mdh.b);
        ru.yandex.taxi.search.suggest.i iVar2222 = this.a;
        kotlinx.coroutines.flow.o oVar222 = new kotlinx.coroutines.flow.o(F222, new SuperAppMainScreenAddressInteractorImpl$listenToUserLocation$$inlined$safeCollect$1(this, null));
        j5e0 j5e0Var222 = new j5e0(20, iVar2222);
        superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.L$0 = null;
        superAppMainScreenAddressInteractorImpl$listenToUserLocation$1.label = 4;
        Object collect222 = oVar222.collect(j5e0Var222, superAppMainScreenAddressInteractorImpl$listenToUserLocation$1);
        if (collect222 != coroutineSingletons) {
        }
    }
}
