package com.yandex.mapkit.maps.core.utils.extensions;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pvn;
import defpackage.sls;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$flatMapLatestIf$$inlined$flatMapLatest$1", f = "FlowExtensions.kt", l = {189}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$flatMapLatestIf$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ sls $block$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$flatMapLatestIf$$inlined$flatMapLatest$1(Continuation continuation, sls slsVar) {
        super(3, continuation);
        this.$block$inlined = slsVar;
    }

    public final Object invoke(vpr vprVar, Boolean bool, Continuation<? super zy11> continuation) {
        FlowExtensionsKt$flatMapLatestIf$$inlined$flatMapLatest$1 flowExtensionsKt$flatMapLatestIf$$inlined$flatMapLatest$1 = new FlowExtensionsKt$flatMapLatestIf$$inlined$flatMapLatest$1(continuation, this.$block$inlined);
        flowExtensionsKt$flatMapLatestIf$$inlined$flatMapLatest$1.L$0 = vprVar;
        flowExtensionsKt$flatMapLatestIf$$inlined$flatMapLatest$1.L$1 = bool;
        return flowExtensionsKt$flatMapLatestIf$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vpr vprVar = (vpr) this.L$0;
            tpr tprVar = ((Boolean) this.L$1).booleanValue() ? (tpr) this.$block$inlined.invoke() : pvn.a;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(tprVar, vprVar, this) == coroutineSingletons) {
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

    public final Object invokeSuspend$$forInline(Object obj) {
        e.u(((Boolean) this.L$1).booleanValue() ? (tpr) this.$block$inlined.invoke() : pvn.a, (vpr) this.L$0, this);
        return zy11.a;
    }

    @Override // defpackage.zls
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((vpr) obj, (Boolean) obj2, (Continuation<? super zy11>) obj3);
    }
}
