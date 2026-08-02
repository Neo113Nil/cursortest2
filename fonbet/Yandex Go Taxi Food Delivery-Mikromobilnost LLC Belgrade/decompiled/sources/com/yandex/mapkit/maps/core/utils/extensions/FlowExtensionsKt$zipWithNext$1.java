package com.yandex.mapkit.maps.core.utils.extensions;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.qv10;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lvpr;", "Lkotlin/Pair;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$zipWithNext$1", f = "FlowExtensions.kt", l = {120}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$zipWithNext$1 extends SuspendLambda implements wls {
    final /* synthetic */ T $initial;
    final /* synthetic */ tpr $this_zipWithNext;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* renamed from: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$zipWithNext$1$1, reason: invalid class name */
    public static final class AnonymousClass1<T> implements vpr {
        final /* synthetic */ vpr $$this$flow;
        final /* synthetic */ Ref$ObjectRef<T> $prev;

        public AnonymousClass1(vpr vprVar, Ref$ObjectRef<T> ref$ObjectRef) {
            this.$$this$flow = vprVar;
            this.$prev = ref$ObjectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // defpackage.vpr
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t, Continuation<? super zy11> continuation) {
            FlowExtensionsKt$zipWithNext$1$1$emit$1 flowExtensionsKt$zipWithNext$1$1$emit$1;
            int i;
            if (continuation instanceof FlowExtensionsKt$zipWithNext$1$1$emit$1) {
                flowExtensionsKt$zipWithNext$1$1$emit$1 = (FlowExtensionsKt$zipWithNext$1$1$emit$1) continuation;
                int i2 = flowExtensionsKt$zipWithNext$1$1$emit$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    flowExtensionsKt$zipWithNext$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = flowExtensionsKt$zipWithNext$1$1$emit$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = flowExtensionsKt$zipWithNext$1$1$emit$1.label;
                    if (i != 0) {
                        b.b(obj);
                        vpr vprVar = this.$$this$flow;
                        Pair pair = new Pair(this.$prev.element, t);
                        flowExtensionsKt$zipWithNext$1$1$emit$1.L$0 = t;
                        flowExtensionsKt$zipWithNext$1$1$emit$1.label = 1;
                        if (vprVar.emit(pair, flowExtensionsKt$zipWithNext$1$1$emit$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        t = (T) flowExtensionsKt$zipWithNext$1$1$emit$1.L$0;
                        b.b(obj);
                    }
                    this.$prev.element = t;
                    return zy11.a;
                }
            }
            flowExtensionsKt$zipWithNext$1$1$emit$1 = new FlowExtensionsKt$zipWithNext$1$1$emit$1(this, continuation);
            Object obj2 = flowExtensionsKt$zipWithNext$1$1$emit$1.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = flowExtensionsKt$zipWithNext$1$1$emit$1.label;
            if (i != 0) {
            }
            this.$prev.element = t;
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$zipWithNext$1(T t, tpr tprVar, Continuation<? super FlowExtensionsKt$zipWithNext$1> continuation) {
        super(2, continuation);
        this.$initial = t;
        this.$this_zipWithNext = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        FlowExtensionsKt$zipWithNext$1 flowExtensionsKt$zipWithNext$1 = new FlowExtensionsKt$zipWithNext$1(this.$initial, this.$this_zipWithNext, continuation);
        flowExtensionsKt$zipWithNext$1.L$0 = obj;
        return flowExtensionsKt$zipWithNext$1;
    }

    @Override // defpackage.wls
    public final Object invoke(vpr vprVar, Continuation<? super zy11> continuation) {
        return ((FlowExtensionsKt$zipWithNext$1) create(vprVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            Ref$ObjectRef z = qv10.z(obj);
            z.element = this.$initial;
            tpr tprVar = this.$this_zipWithNext;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(vprVar, z);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (tprVar.collect(anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
