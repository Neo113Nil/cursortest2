package com.yandex.mapkit.maps.core.utils.extensions;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"R", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$skipAll$$inlined$transform$1", f = "FlowExtensions.kt", l = {36}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$skipAll$$inlined$transform$1 extends SuspendLambda implements wls {
    final /* synthetic */ tpr $this_transform;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$skipAll$$inlined$transform$1(tpr tprVar, Continuation continuation) {
        super(2, continuation);
        this.$this_transform = tprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        FlowExtensionsKt$skipAll$$inlined$transform$1 flowExtensionsKt$skipAll$$inlined$transform$1 = new FlowExtensionsKt$skipAll$$inlined$transform$1(this.$this_transform, continuation);
        flowExtensionsKt$skipAll$$inlined$transform$1.L$0 = obj;
        return flowExtensionsKt$skipAll$$inlined$transform$1;
    }

    @Override // defpackage.wls
    public final Object invoke(vpr vprVar, Continuation<? super zy11> continuation) {
        return ((FlowExtensionsKt$skipAll$$inlined$transform$1) create(vprVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            final vpr vprVar = (vpr) this.L$0;
            tpr tprVar = this.$this_transform;
            vpr vprVar2 = new vpr() { // from class: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$skipAll$$inlined$transform$1.1
                @Override // defpackage.vpr
                public final Object emit(T t, Continuation<? super zy11> continuation) {
                    return zy11.a;
                }
            };
            this.L$0 = null;
            this.label = 1;
            if (tprVar.collect(vprVar2, this) == coroutineSingletons) {
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
