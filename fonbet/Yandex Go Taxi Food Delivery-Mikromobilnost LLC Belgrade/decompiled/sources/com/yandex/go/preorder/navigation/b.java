package com.yandex.go.preorder.navigation;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.zone.model.Zone;
import defpackage.dz21;
import defpackage.ez21;
import defpackage.fz21;
import defpackage.gz21;
import defpackage.h55;
import defpackage.hxx;
import defpackage.hz21;
import defpackage.k7d0;
import defpackage.l8x;
import defpackage.mf4;
import defpackage.mo30;
import defpackage.ny61;
import defpackage.t0j;
import defpackage.tje;
import defpackage.tpe0;
import defpackage.uoe0;
import defpackage.vld0;
import defpackage.vre0;
import defpackage.w511;
import defpackage.yvf0;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b extends h55 {
    public final yvf0 D;
    public final mf4 E;
    public final com.yandex.go.zone.interactors.e F;
    public final com.yandex.go.preorder.tariffs.a G;
    public final com.yandex.go.preorder.address.f H;
    public final vre0 I;
    public final com.yandex.go.taxi.tariffs.interactor.b J;
    public com.yandex.go.preload.b K;

    public b(yvf0 yvf0Var, mf4 mf4Var, com.yandex.go.zone.interactors.e eVar, com.yandex.go.preorder.tariffs.a aVar, com.yandex.go.preorder.address.f fVar, vre0 vre0Var, com.yandex.go.taxi.tariffs.interactor.b bVar) {
        super(null);
        this.D = yvf0Var;
        this.E = mf4Var;
        this.F = eVar;
        this.G = aVar;
        this.H = fVar;
        this.I = vre0Var;
        this.J = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (r9 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object P(b bVar, Zone zone, tpe0 tpe0Var, ContinuationImpl continuationImpl) {
        PreorderAddressValidationRouter$onZoneFetched$1 preorderAddressValidationRouter$onZoneFetched$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        l8x N;
        t0j t0jVar;
        com.yandex.go.preload.b bVar2;
        bVar.getClass();
        if (continuationImpl instanceof PreorderAddressValidationRouter$onZoneFetched$1) {
            preorderAddressValidationRouter$onZoneFetched$1 = (PreorderAddressValidationRouter$onZoneFetched$1) continuationImpl;
            int i2 = preorderAddressValidationRouter$onZoneFetched$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                preorderAddressValidationRouter$onZoneFetched$1.label = i2 - Integer.MIN_VALUE;
                Object obj = preorderAddressValidationRouter$onZoneFetched$1.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = preorderAddressValidationRouter$onZoneFetched$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bVar.I.a = zone;
                    N = tje.N(bVar.o(), null, null, new PreorderAddressValidationRouter$onZoneFetched$actualizePreorderInfoJob$1(bVar, zone, null), 3);
                    com.yandex.go.preorder.address.f fVar = bVar.H;
                    boolean z = tpe0Var.a;
                    preorderAddressValidationRouter$onZoneFetched$1.L$0 = null;
                    preorderAddressValidationRouter$onZoneFetched$1.L$1 = null;
                    preorderAddressValidationRouter$onZoneFetched$1.L$2 = N;
                    preorderAddressValidationRouter$onZoneFetched$1.label = 1;
                    obj = fVar.a(z, preorderAddressValidationRouter$onZoneFetched$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        t0jVar = (t0j) preorderAddressValidationRouter$onZoneFetched$1.L$3;
                        kotlin.b.b(obj);
                        k7d0 k7d0Var = new k7d0(18, t0jVar);
                        bVar2 = bVar.K;
                        if (bVar2 != null) {
                            bVar2.i();
                        }
                        bVar.r(k7d0Var);
                        return zy11.a;
                    }
                    N = (l8x) preorderAddressValidationRouter$onZoneFetched$1.L$2;
                    kotlin.b.b(obj);
                }
                t0j t0jVar2 = (t0j) obj;
                preorderAddressValidationRouter$onZoneFetched$1.L$0 = null;
                preorderAddressValidationRouter$onZoneFetched$1.L$1 = null;
                preorderAddressValidationRouter$onZoneFetched$1.L$2 = null;
                preorderAddressValidationRouter$onZoneFetched$1.L$3 = t0jVar2;
                preorderAddressValidationRouter$onZoneFetched$1.label = 2;
                if (N.u0(preorderAddressValidationRouter$onZoneFetched$1) != coroutineSingletons) {
                    t0jVar = t0jVar2;
                    k7d0 k7d0Var2 = new k7d0(18, t0jVar);
                    bVar2 = bVar.K;
                    if (bVar2 != null) {
                    }
                    bVar.r(k7d0Var2);
                    return zy11.a;
                }
                return coroutineSingletons;
            }
        }
        preorderAddressValidationRouter$onZoneFetched$1 = new PreorderAddressValidationRouter$onZoneFetched$1(bVar, continuationImpl);
        Object obj2 = preorderAddressValidationRouter$onZoneFetched$1.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = preorderAddressValidationRouter$onZoneFetched$1.label;
        if (i != 0) {
        }
        t0j t0jVar22 = (t0j) obj2;
        preorderAddressValidationRouter$onZoneFetched$1.L$0 = null;
        preorderAddressValidationRouter$onZoneFetched$1.L$1 = null;
        preorderAddressValidationRouter$onZoneFetched$1.L$2 = null;
        preorderAddressValidationRouter$onZoneFetched$1.L$3 = t0jVar22;
        preorderAddressValidationRouter$onZoneFetched$1.label = 2;
        if (N.u0(preorderAddressValidationRouter$onZoneFetched$1) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    @Override // defpackage.h55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void J(Object obj) {
        hz21 hz21Var;
        com.yandex.go.preload.b bVar;
        tpe0 tpe0Var = (tpe0) obj;
        ZoneAddress zoneAddress = this.F.b.c().a;
        if (zoneAddress != null) {
            Address address = zoneAddress.a;
            if (!address.X1()) {
                Zone zone = zoneAddress.b;
                hz21Var = (zone == null || !zone.h()) ? new ez21(address) : new fz21(zone);
                if (!(hz21Var instanceof dz21) || (hz21Var instanceof gz21)) {
                    vld0 vld0Var = new vld0(15);
                    bVar = this.K;
                    if (bVar != null) {
                        bVar.i();
                    }
                    r(vld0Var);
                }
                if (hz21Var instanceof ez21) {
                    Q();
                    com.yandex.go.coroutines.b.g(o(), null, null, new PreorderAddressValidationRouter$onLaunch$2(this, hz21Var, tpe0Var, null), 3);
                    return;
                } else if (!(hz21Var instanceof fz21)) {
                    w511.b();
                    return;
                } else {
                    Q();
                    com.yandex.go.coroutines.b.g(o(), null, null, new PreorderAddressValidationRouter$onLaunch$3(this, hz21Var, tpe0Var, null), 3);
                    return;
                }
            }
        }
        hz21Var = dz21.a;
        if (hz21Var instanceof dz21) {
        }
        vld0 vld0Var2 = new vld0(15);
        bVar = this.K;
        if (bVar != null) {
        }
        r(vld0Var2);
    }

    public final void Q() {
        com.yandex.go.preload.b bVar = (com.yandex.go.preload.b) this.D.get();
        this.K = bVar;
        E(bVar, new uoe0(null, false), new mo30(17, this), hxx.a);
    }
}
