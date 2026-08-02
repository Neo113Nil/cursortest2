package com.yandex.go.permission.location_with_agreement.ui;

import com.yandex.go.permission.location_with_agreement.analytics.LocationPermissionPrimingAnalytics$ButtonName;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.oaz;
import defpackage.pho;
import defpackage.pj;
import defpackage.saz;
import defpackage.vaz;
import defpackage.w511;
import defpackage.xaz;
import defpackage.xur;
import defpackage.yaz;
import defpackage.zaz;
import defpackage.zy11;
import defpackage.zzv0;
import java.util.HashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.preorder.source.domain.h;

/* loaded from: classes13.dex */
public final class a {
    public final ru.yandex.taxi.systemrequeirements.location.c a;
    public final h b;
    public final zzv0 c;
    public final b d;
    public final saz e;
    public final pj f;

    public a(ru.yandex.taxi.systemrequeirements.location.c cVar, h hVar, zzv0 zzv0Var, b bVar, saz sazVar, pj pjVar) {
        this.a = cVar;
        this.b = hVar;
        this.c = zzv0Var;
        this.d = bVar;
        this.e = sazVar;
        this.f = pjVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x004e, code lost:
    
        if (r12 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(oaz oazVar, ContinuationImpl continuationImpl) {
        LocationPermissionV2UiActionInteractor$finalize$1 locationPermissionV2UiActionInteractor$finalize$1;
        int i;
        long longValue;
        Object value;
        if (continuationImpl instanceof LocationPermissionV2UiActionInteractor$finalize$1) {
            locationPermissionV2UiActionInteractor$finalize$1 = (LocationPermissionV2UiActionInteractor$finalize$1) continuationImpl;
            int i2 = locationPermissionV2UiActionInteractor$finalize$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationPermissionV2UiActionInteractor$finalize$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationPermissionV2UiActionInteractor$finalize$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationPermissionV2UiActionInteractor$finalize$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationPermissionV2UiActionInteractor$finalize$1.L$0 = oazVar;
                    locationPermissionV2UiActionInteractor$finalize$1.label = 1;
                    obj = this.d.b(locationPermissionV2UiActionInteractor$finalize$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return obj;
                    }
                    oazVar = (oaz) locationPermissionV2UiActionInteractor$finalize$1.L$0;
                    kotlin.b.b(obj);
                }
                longValue = ((Number) obj).longValue();
                if (longValue != 0) {
                    ((vaz) oazVar).a();
                    return zy11.a;
                }
                r0 r0Var = this.e.a;
                do {
                    value = r0Var.getValue();
                    ((Boolean) value).getClass();
                } while (!r0Var.k(value, Boolean.TRUE));
                o oVar = new o(e.T(e.X(com.yandex.go.coroutines.b.k(h.a(this.b), longValue, null), new LocationPermissionV2UiActionInteractor$finalize$$inlined$flatMapLatest$1(null, this)), 1), new LocationPermissionV2UiActionInteractor$finalize$$inlined$safeCollect$1(null, oazVar));
                xur xurVar = new xur(10, this, oazVar);
                locationPermissionV2UiActionInteractor$finalize$1.L$0 = null;
                locationPermissionV2UiActionInteractor$finalize$1.L$1 = null;
                locationPermissionV2UiActionInteractor$finalize$1.J$0 = longValue;
                locationPermissionV2UiActionInteractor$finalize$1.label = 2;
                Object collect = oVar.collect(xurVar, locationPermissionV2UiActionInteractor$finalize$1);
                return collect == coroutineSingletons ? coroutineSingletons : collect;
            }
        }
        locationPermissionV2UiActionInteractor$finalize$1 = new LocationPermissionV2UiActionInteractor$finalize$1(this, continuationImpl);
        Object obj2 = locationPermissionV2UiActionInteractor$finalize$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationPermissionV2UiActionInteractor$finalize$1.label;
        if (i != 0) {
        }
        longValue = ((Number) obj2).longValue();
        if (longValue != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(5:5|6|7|(1:(1:(4:11|12|13|14)(2:16|17))(2:18|19))(2:23|(3:25|13|14)(2:26|(3:28|29|(2:31|22))(2:32|33)))|20))|35|6|7|(0)(0)|20) */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
    
        if (a(r10, r1) != r2) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b1, code lost:
    
        ((defpackage.vaz) r10).a();
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(zaz zazVar, oaz oazVar, ContinuationImpl continuationImpl) {
        LocationPermissionV2UiActionInteractor$handleAction$1 locationPermissionV2UiActionInteractor$handleAction$1;
        int i;
        pho phoVar = this.f.a;
        if (continuationImpl instanceof LocationPermissionV2UiActionInteractor$handleAction$1) {
            locationPermissionV2UiActionInteractor$handleAction$1 = (LocationPermissionV2UiActionInteractor$handleAction$1) continuationImpl;
            int i2 = locationPermissionV2UiActionInteractor$handleAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationPermissionV2UiActionInteractor$handleAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationPermissionV2UiActionInteractor$handleAction$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationPermissionV2UiActionInteractor$handleAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (jl40.l(zazVar, yaz.a)) {
                        LocationPermissionPrimingAnalytics$ButtonName locationPermissionPrimingAnalytics$ButtonName = LocationPermissionPrimingAnalytics$ButtonName.Skip;
                        HashMap hashMap = new HashMap();
                        hashMap.put("button_name", locationPermissionPrimingAnalytics$ButtonName.getEventValue());
                        phoVar.a("LocationPermissionPriming.Screen.Tapped", hashMap, 1, new HashMap());
                        ((vaz) oazVar).a();
                        return zy11.a;
                    }
                    if (!jl40.l(zazVar, xaz.a)) {
                        w511.b();
                        return null;
                    }
                    LocationPermissionPrimingAnalytics$ButtonName locationPermissionPrimingAnalytics$ButtonName2 = LocationPermissionPrimingAnalytics$ButtonName.Share;
                    HashMap hashMap2 = new HashMap();
                    hashMap2.put("button_name", locationPermissionPrimingAnalytics$ButtonName2.getEventValue());
                    phoVar.a("LocationPermissionPriming.Screen.Tapped", hashMap2, 1, new HashMap());
                    ru.yandex.taxi.systemrequeirements.location.c cVar = this.a;
                    locationPermissionV2UiActionInteractor$handleAction$1.L$0 = null;
                    locationPermissionV2UiActionInteractor$handleAction$1.L$1 = oazVar;
                    locationPermissionV2UiActionInteractor$handleAction$1.label = 1;
                    if (cVar.a(locationPermissionV2UiActionInteractor$handleAction$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return zy11.a;
                    }
                    oazVar = (oaz) locationPermissionV2UiActionInteractor$handleAction$1.L$1;
                    kotlin.b.b(obj);
                }
                locationPermissionV2UiActionInteractor$handleAction$1.L$0 = null;
                locationPermissionV2UiActionInteractor$handleAction$1.L$1 = oazVar;
                locationPermissionV2UiActionInteractor$handleAction$1.label = 2;
            }
        }
        locationPermissionV2UiActionInteractor$handleAction$1 = new LocationPermissionV2UiActionInteractor$handleAction$1(this, continuationImpl);
        Object obj3 = locationPermissionV2UiActionInteractor$handleAction$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationPermissionV2UiActionInteractor$handleAction$1.label;
        if (i != 0) {
        }
        locationPermissionV2UiActionInteractor$handleAction$1.L$0 = null;
        locationPermissionV2UiActionInteractor$handleAction$1.L$1 = oazVar;
        locationPermissionV2UiActionInteractor$handleAction$1.label = 2;
    }
}
