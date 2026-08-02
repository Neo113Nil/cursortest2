package com.yandex.go.taxi.summary.mobilityhub.deeplink;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import defpackage.d0l0;
import defpackage.dd61;
import defpackage.iv20;
import defpackage.jl40;
import defpackage.mo21;
import defpackage.ny61;
import defpackage.po21;
import defpackage.pv0;
import defpackage.vv20;
import defpackage.x1v;
import defpackage.zzs;
import java.util.Collections;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.deeplinks.e;

/* loaded from: classes14.dex */
public final class b {
    public final com.yandex.go.route.interactor.b a;
    public final po21 b;
    public final e c;
    public final x1v d;

    public b(com.yandex.go.route.interactor.b bVar, po21 po21Var, e eVar, x1v x1vVar) {
        this.a = bVar;
        this.b = po21Var;
        this.c = eVar;
        this.d = x1vVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0098, code lost:
    
        if (r12 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(iv20 iv20Var, ContinuationImpl continuationImpl) {
        MobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1 mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1;
        Object obj;
        int i;
        Address address;
        Object b;
        dd61 dd61Var;
        if (continuationImpl instanceof MobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1) {
            mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1 = (MobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1) continuationImpl;
            int i2 = mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.label;
                com.yandex.go.route.interactor.b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    this.d.c = iv20Var.c;
                    ZoneAddress zoneAddress = bVar.c().a;
                    zzs B = (zoneAddress == null || (address = zoneAddress.a) == null) ? null : address.B();
                    if (iv20Var.a == null && iv20Var.b == null && B != null) {
                        Address address2 = (Address) kotlin.collections.a.b0(bVar.c().b);
                        iv20Var = new iv20(B, address2 != null ? address2.B() : null, iv20Var.c, false);
                    }
                    mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.L$0 = null;
                    mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.L$1 = iv20Var;
                    mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.label = 1;
                    obj2 = b(iv20Var, mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        dd61Var = (dd61) mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.L$2;
                        kotlin.b.b(obj2);
                        pv0 pv0Var = (pv0) obj2;
                        d0l0 c = bVar.c();
                        bVar.m(dd61Var.a(), null);
                        List singletonList = pv0Var == null ? Collections.singletonList(pv0Var.a) : EmptyList.a;
                        bVar.p(singletonList);
                        return new vv20(dd61Var, jl40.l(c.a, dd61Var.a()) || !jl40.l(c.b, singletonList));
                    }
                    iv20Var = (iv20) mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.L$1;
                    kotlin.b.b(obj2);
                }
                dd61 dd61Var2 = (dd61) obj2;
                mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.L$0 = null;
                mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.L$1 = null;
                mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.L$2 = dd61Var2;
                mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.label = 2;
                zzs zzsVar = iv20Var.b;
                b = zzsVar != null ? null : e.b(this.c, zzsVar, mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1, 26);
                if (b != obj) {
                    obj2 = b;
                    dd61Var = dd61Var2;
                    pv0 pv0Var2 = (pv0) obj2;
                    d0l0 c2 = bVar.c();
                    bVar.m(dd61Var.a(), null);
                    if (pv0Var2 == null) {
                    }
                    bVar.p(singletonList);
                    return new vv20(dd61Var, jl40.l(c2.a, dd61Var.a()) || !jl40.l(c2.b, singletonList));
                }
                return obj;
            }
        }
        mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1 = new MobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1(this, continuationImpl);
        Object obj22 = mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.label;
        com.yandex.go.route.interactor.b bVar2 = this.a;
        if (i != 0) {
        }
        dd61 dd61Var22 = (dd61) obj22;
        mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.L$0 = null;
        mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.L$1 = null;
        mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.L$2 = dd61Var22;
        mobilityHubIntentDataInteractorImpl$handleDeeplinkMobilityHubData$1.label = 2;
        zzs zzsVar2 = iv20Var.b;
        if (zzsVar2 != null) {
        }
        if (b != obj) {
        }
        return obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006a, code lost:
    
        if (r9 == r0) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0086 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(iv20 iv20Var, ContinuationImpl continuationImpl) {
        MobilityHubIntentDataInteractorImpl$resolveSourcePoint$1 mobilityHubIntentDataInteractorImpl$resolveSourcePoint$1;
        CoroutineSingletons coroutineSingletons;
        int i;
        zzs zzsVar;
        if (continuationImpl instanceof MobilityHubIntentDataInteractorImpl$resolveSourcePoint$1) {
            mobilityHubIntentDataInteractorImpl$resolveSourcePoint$1 = (MobilityHubIntentDataInteractorImpl$resolveSourcePoint$1) continuationImpl;
            int i2 = mobilityHubIntentDataInteractorImpl$resolveSourcePoint$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mobilityHubIntentDataInteractorImpl$resolveSourcePoint$1.label = i2 - Integer.MIN_VALUE;
                MobilityHubIntentDataInteractorImpl$resolveSourcePoint$1 mobilityHubIntentDataInteractorImpl$resolveSourcePoint$12 = mobilityHubIntentDataInteractorImpl$resolveSourcePoint$1;
                Object obj = mobilityHubIntentDataInteractorImpl$resolveSourcePoint$12.result;
                coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = mobilityHubIntentDataInteractorImpl$resolveSourcePoint$12.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    zzsVar = iv20Var.a;
                    if (zzsVar == null) {
                        Address h = this.a.c().h();
                        zzsVar = h != null ? h.B() : null;
                        if (zzsVar == null) {
                            mobilityHubIntentDataInteractorImpl$resolveSourcePoint$12.L$0 = null;
                            mobilityHubIntentDataInteractorImpl$resolveSourcePoint$12.label = 1;
                            obj = ((ru.yandex.taxi.preorder.source.userposition.e) this.b).g(mobilityHubIntentDataInteractorImpl$resolveSourcePoint$12);
                        }
                    }
                    mobilityHubIntentDataInteractorImpl$resolveSourcePoint$12.L$0 = null;
                    mobilityHubIntentDataInteractorImpl$resolveSourcePoint$12.L$1 = null;
                    mobilityHubIntentDataInteractorImpl$resolveSourcePoint$12.label = 2;
                    Object e = this.c.e(zzsVar, null, false, false, mobilityHubIntentDataInteractorImpl$resolveSourcePoint$12);
                    return e == coroutineSingletons ? coroutineSingletons : e;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                    return obj;
                }
                kotlin.b.b(obj);
                zzsVar = ((mo21) obj).a();
                mobilityHubIntentDataInteractorImpl$resolveSourcePoint$12.L$0 = null;
                mobilityHubIntentDataInteractorImpl$resolveSourcePoint$12.L$1 = null;
                mobilityHubIntentDataInteractorImpl$resolveSourcePoint$12.label = 2;
                Object e2 = this.c.e(zzsVar, null, false, false, mobilityHubIntentDataInteractorImpl$resolveSourcePoint$12);
                if (e2 == coroutineSingletons) {
                }
            }
        }
        mobilityHubIntentDataInteractorImpl$resolveSourcePoint$1 = new MobilityHubIntentDataInteractorImpl$resolveSourcePoint$1(this, continuationImpl);
        MobilityHubIntentDataInteractorImpl$resolveSourcePoint$1 mobilityHubIntentDataInteractorImpl$resolveSourcePoint$122 = mobilityHubIntentDataInteractorImpl$resolveSourcePoint$1;
        Object obj2 = mobilityHubIntentDataInteractorImpl$resolveSourcePoint$122.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = mobilityHubIntentDataInteractorImpl$resolveSourcePoint$122.label;
        if (i != 0) {
        }
        zzsVar = ((mo21) obj2).a();
        mobilityHubIntentDataInteractorImpl$resolveSourcePoint$122.L$0 = null;
        mobilityHubIntentDataInteractorImpl$resolveSourcePoint$122.L$1 = null;
        mobilityHubIntentDataInteractorImpl$resolveSourcePoint$122.label = 2;
        Object e22 = this.c.e(zzsVar, null, false, false, mobilityHubIntentDataInteractorImpl$resolveSourcePoint$122);
        if (e22 == coroutineSingletons) {
        }
    }
}
