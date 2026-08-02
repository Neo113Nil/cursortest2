package com.yandex.go.taxi.order.bubble.interactor;

import android.animation.PropertyValuesHolder;
import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.caret.CaretView;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.re2;
import defpackage.ro00;
import defpackage.tls;
import defpackage.zy11;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.map_common.map.intersection.Participant;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.bubble.interactor.OrderAnimatedBubbleIntersectionInteractor$checkIntersections$1", f = "OrderAnimatedBubbleIntersectionInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class OrderAnimatedBubbleIntersectionInteractor$checkIntersections$1 extends SuspendLambda implements tls {
    final /* synthetic */ Map<re2, com.yandex.go.taxi.order.bubble.a> $bubbles;
    final /* synthetic */ Runnable $onResolve;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderAnimatedBubbleIntersectionInteractor$checkIntersections$1(a aVar, Map map, Runnable runnable, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$bubbles = map;
        this.$onResolve = runnable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new OrderAnimatedBubbleIntersectionInteractor$checkIntersections$1(this.this$0, this.$bubbles, this.$onResolve, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        OrderAnimatedBubbleIntersectionInteractor$checkIntersections$1 orderAnimatedBubbleIntersectionInteractor$checkIntersections$1 = (OrderAnimatedBubbleIntersectionInteractor$checkIntersections$1) create((Continuation) obj);
        zy11 zy11Var = zy11.a;
        orderAnimatedBubbleIntersectionInteractor$checkIntersections$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        a aVar = this.this$0;
        Map<re2, com.yandex.go.taxi.order.bubble.a> map = this.$bubbles;
        Runnable runnable = this.$onResolve;
        aVar.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator<Map.Entry<re2, com.yandex.go.taxi.order.bubble.a>> it = map.entrySet().iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<re2, com.yandex.go.taxi.order.bubble.a> next = it.next();
            if (!linkedHashSet2.contains(next.getKey().d)) {
                linkedHashSet2.add(next.getKey().d);
                for (ro00 ro00Var : ((ru.yandex.taxi.map_common.map.intersection.a) aVar.a).g(next.getKey().d, Participant.COMPANIONS_IN_SEARCH_COLLECTION)) {
                    if (linkedHashSet2.add(ro00Var.a)) {
                        linkedHashSet.add(ro00Var.a);
                        i++;
                    }
                }
                if (i > 0) {
                    com.yandex.go.taxi.order.bubble.a value = next.getValue();
                    Integer valueOf = Integer.valueOf(i + 1);
                    if (!jl40.l(value.K, valueOf)) {
                        value.J = true;
                    }
                    value.K = valueOf;
                } else {
                    com.yandex.go.taxi.order.bubble.a value2 = next.getValue();
                    if (!jl40.l(value2.K, null)) {
                        value2.J = true;
                    }
                    value2.K = null;
                }
                linkedHashMap.put(next.getKey(), next.getValue());
            }
        }
        Iterator it2 = linkedHashMap.entrySet().iterator();
        while (it2.hasNext()) {
            ((com.yandex.go.taxi.order.bubble.a) ((Map.Entry) it2.next()).getValue()).f();
        }
        for (String str : linkedHashSet) {
            Iterator<T> it3 = map.entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry entry = (Map.Entry) it3.next();
                re2 re2Var = (re2) entry.getKey();
                com.yandex.go.taxi.order.bubble.a aVar2 = (com.yandex.go.taxi.order.bubble.a) entry.getValue();
                if (jl40.l(re2Var.d, str)) {
                    if (aVar2.y.j != 0.0f) {
                        aVar2.H = false;
                        aVar2.e(PropertyValuesHolder.ofFloat(CaretView.ALPHA_PROPERTY, 1.0f, 0.0f));
                    }
                    aVar2.J = false;
                    aVar2.H = false;
                    aVar2.K = null;
                }
            }
        }
        runnable.run();
        return zy11.a;
    }
}
