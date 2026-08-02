package com.yandex.mapkit.maps.core.utils.extensions;

import defpackage.g8e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.b;
import kotlin.collections.a;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lvpr;", "", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$slidingWindowNaive$1", f = "FlowExtensions.kt", l = {49}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$slidingWindowNaive$1 extends SuspendLambda implements wls {
    final /* synthetic */ int $size;
    final /* synthetic */ tpr $this_slidingWindowNaive;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$slidingWindowNaive$1(tpr tprVar, int i, Continuation<? super FlowExtensionsKt$slidingWindowNaive$1> continuation) {
        super(2, continuation);
        this.$this_slidingWindowNaive = tprVar;
        this.$size = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        FlowExtensionsKt$slidingWindowNaive$1 flowExtensionsKt$slidingWindowNaive$1 = new FlowExtensionsKt$slidingWindowNaive$1(this.$this_slidingWindowNaive, this.$size, continuation);
        flowExtensionsKt$slidingWindowNaive$1.L$0 = obj;
        return flowExtensionsKt$slidingWindowNaive$1;
    }

    @Override // defpackage.wls
    public final Object invoke(vpr vprVar, Continuation<? super zy11> continuation) {
        return ((FlowExtensionsKt$slidingWindowNaive$1) create(vprVar, continuation)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            final ArrayList t = g8e.t(obj);
            tpr tprVar = this.$this_slidingWindowNaive;
            final int i2 = this.$size;
            vpr vprVar2 = new vpr() { // from class: com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$slidingWindowNaive$1.1
                @Override // defpackage.vpr
                public final Object emit(T t2, Continuation<? super zy11> continuation) {
                    t.add(t2);
                    int size = t.size();
                    int i3 = i2;
                    zy11 zy11Var = zy11.a;
                    if (size == i3) {
                        Object emit = vprVar.emit(a.J0(t), continuation);
                        return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var;
                    }
                    if (size == i3 + 1) {
                        t.remove(0);
                        Object emit2 = vprVar.emit(a.J0(t), continuation);
                        if (emit2 == CoroutineSingletons.COROUTINE_SUSPENDED) {
                            return emit2;
                        }
                    }
                    return zy11Var;
                }
            };
            this.L$0 = null;
            this.L$1 = null;
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
