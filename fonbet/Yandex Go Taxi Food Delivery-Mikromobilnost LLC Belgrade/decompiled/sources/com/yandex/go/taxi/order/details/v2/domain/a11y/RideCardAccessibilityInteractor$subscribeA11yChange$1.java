package com.yandex.go.taxi.order.details.v2.domain.a11y;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval;
import com.yandex.go.taxi.order.models.api.response.RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Single;
import com.yandex.go.taxi.order.models.api.response.z3;
import com.yandex.messaging.core.net.entities.BackendConfig;
import defpackage.evu0;
import defpackage.h8k0;
import defpackage.hjk0;
import defpackage.k8k0;
import defpackage.l8k0;
import defpackage.l8x;
import defpackage.m8k0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o8k0;
import defpackage.pz40;
import defpackage.tcc;
import defpackage.v4r0;
import defpackage.w511;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", BackendConfig.Restrictions.ENABLED, "Lcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto;", "presentationsDto", "Lzy11;", "<anonymous>", "(ZLcom/yandex/go/taxi/order/models/api/response/RideCardInfoResponse$PresentationsDto;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.domain.a11y.RideCardAccessibilityInteractor$subscribeA11yChange$1", f = "RideCardAccessibilityInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardAccessibilityInteractor$subscribeA11yChange$1 extends SuspendLambda implements zls {
    final /* synthetic */ RideCardPresentationType $presentationType;
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardAccessibilityInteractor$subscribeA11yChange$1(b bVar, RideCardPresentationType rideCardPresentationType, Continuation continuation) {
        super(3, continuation);
        this.$presentationType = rideCardPresentationType;
        this.this$0 = bVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        RideCardPresentationType rideCardPresentationType = this.$presentationType;
        RideCardAccessibilityInteractor$subscribeA11yChange$1 rideCardAccessibilityInteractor$subscribeA11yChange$1 = new RideCardAccessibilityInteractor$subscribeA11yChange$1(this.this$0, rideCardPresentationType, (Continuation) obj3);
        rideCardAccessibilityInteractor$subscribeA11yChange$1.Z$0 = booleanValue;
        rideCardAccessibilityInteractor$subscribeA11yChange$1.L$0 = (RideCardInfoResponse.PresentationsDto) obj2;
        zy11 zy11Var = zy11.a;
        rideCardAccessibilityInteractor$subscribeA11yChange$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        r0 r0Var;
        Object value;
        l8x l8xVar;
        Set keySet;
        Object putIfAbsent;
        Object putIfAbsent2;
        m8k0 k8k0Var;
        boolean z = this.Z$0;
        RideCardInfoResponse.PresentationsDto presentationsDto = (RideCardInfoResponse.PresentationsDto) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (z) {
            int i = hjk0.a[this.$presentationType.ordinal()];
            List<z3> list = i != 1 ? i != 2 ? null : presentationsDto.b.e : presentationsDto.a.c;
            e eVar = this.this$0.c;
            RideCardPresentationType rideCardPresentationType = this.$presentationType;
            ConcurrentHashMap concurrentHashMap = eVar.e;
            ConcurrentHashMap concurrentHashMap2 = eVar.f;
            if (list != null) {
                h8k0 h8k0Var = eVar.c;
                ArrayList arrayList = new ArrayList();
                for (z3 z3Var : list) {
                    h8k0Var.getClass();
                    if (z3Var instanceof RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Single) {
                        String str = ((RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Single) z3Var).a;
                        if (str != null) {
                            if (evu0.J(str)) {
                                str = null;
                            }
                            if (str != null) {
                                k8k0Var = new l8k0(str);
                            }
                        }
                        k8k0Var = null;
                    } else {
                        if (!(z3Var instanceof RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval)) {
                            w511.b();
                            return null;
                        }
                        RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval rideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval = (RideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval) z3Var;
                        String str2 = rideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval.a;
                        String str3 = rideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval.b;
                        Long l = rideCardInfoResponse$PresentationsDto$AccessibilityAnnouncementItemDto$Interval.c;
                        if (str2 != null && str3 != null && l != null) {
                            k8k0Var = new k8k0(str2, str3, l.longValue());
                        }
                        k8k0Var = null;
                    }
                    if (k8k0Var != null) {
                        arrayList.add(k8k0Var);
                    }
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    m8k0 m8k0Var = (m8k0) it.next();
                    if (m8k0Var instanceof l8k0) {
                        Object obj2 = concurrentHashMap.get(rideCardPresentationType);
                        if (obj2 == null && (putIfAbsent2 = concurrentHashMap.putIfAbsent(rideCardPresentationType, (obj2 = new CopyOnWriteArraySet()))) != null) {
                            obj2 = putIfAbsent2;
                        }
                        String str4 = ((l8k0) m8k0Var).a;
                        if (!((CopyOnWriteArraySet) obj2).contains(str4)) {
                            arrayList2.add(str4);
                            arrayList3.add(m8k0Var);
                        }
                    } else {
                        if (!(m8k0Var instanceof k8k0)) {
                            w511.b();
                            return null;
                        }
                        k8k0 k8k0Var2 = (k8k0) m8k0Var;
                        String str5 = k8k0Var2.b;
                        linkedHashSet.add(str5);
                        o8k0 o8k0Var = new o8k0(0, arrayList3, k8k0Var2);
                        ConcurrentHashMap concurrentHashMap3 = (ConcurrentHashMap) concurrentHashMap2.get(rideCardPresentationType);
                        if (concurrentHashMap3 != null) {
                        }
                    }
                }
                CopyOnWriteArraySet copyOnWriteArraySet = (CopyOnWriteArraySet) concurrentHashMap.get(rideCardPresentationType);
                if (copyOnWriteArraySet != null) {
                    copyOnWriteArraySet.clear();
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    Object next = it2.next();
                    if (next instanceof l8k0) {
                        arrayList4.add(next);
                    }
                }
                ArrayList arrayList5 = new ArrayList(tcc.n(arrayList4, 10));
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    arrayList5.add(((l8k0) it3.next()).a);
                }
                Object obj3 = concurrentHashMap.get(rideCardPresentationType);
                if (obj3 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(rideCardPresentationType, (obj3 = new CopyOnWriteArraySet()))) != null) {
                    obj3 = putIfAbsent;
                }
                ((CopyOnWriteArraySet) obj3).addAll(arrayList5);
                ConcurrentHashMap concurrentHashMap4 = (ConcurrentHashMap) concurrentHashMap2.get(rideCardPresentationType);
                Set<String> g = (concurrentHashMap4 == null || (keySet = concurrentHashMap4.keySet()) == null) ? null : v4r0.g(keySet, linkedHashSet);
                if (g != null) {
                    for (String str6 : g) {
                        ConcurrentHashMap concurrentHashMap5 = (ConcurrentHashMap) concurrentHashMap2.get(rideCardPresentationType);
                        if (concurrentHashMap5 != null && (l8xVar = (l8x) concurrentHashMap5.get(str6)) != null) {
                            l8xVar.a(null);
                        }
                        ConcurrentHashMap concurrentHashMap6 = (ConcurrentHashMap) concurrentHashMap2.get(rideCardPresentationType);
                        if (concurrentHashMap6 != null) {
                        }
                    }
                }
                pz40 pz40Var = (pz40) eVar.a.a.get(rideCardPresentationType);
                if (pz40Var != null) {
                    do {
                        r0Var = (r0) pz40Var;
                        value = r0Var.getValue();
                    } while (!r0Var.k(value, arrayList3));
                }
            }
        }
        return zy11.a;
    }
}
