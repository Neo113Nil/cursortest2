package com.yandex.mapkit.maps.core.utils.extensions;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lvpr;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$emitFirstThenRepeatWithInterval$1$1", f = "FlowExtensions.kt", l = {109, 111, 112}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$emitFirstThenRepeatWithInterval$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $intervalMillis;
    final /* synthetic */ T $value;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$emitFirstThenRepeatWithInterval$1$1(T t, long j, Continuation<? super FlowExtensionsKt$emitFirstThenRepeatWithInterval$1$1> continuation) {
        super(2, continuation);
        this.$value = t;
        this.$intervalMillis = j;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<zy11> create(Object obj, Continuation<?> continuation) {
        FlowExtensionsKt$emitFirstThenRepeatWithInterval$1$1 flowExtensionsKt$emitFirstThenRepeatWithInterval$1$1 = new FlowExtensionsKt$emitFirstThenRepeatWithInterval$1$1(this.$value, this.$intervalMillis, continuation);
        flowExtensionsKt$emitFirstThenRepeatWithInterval$1$1.L$0 = obj;
        return flowExtensionsKt$emitFirstThenRepeatWithInterval$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(vpr vprVar, Continuation<? super zy11> continuation) {
        return ((FlowExtensionsKt$emitFirstThenRepeatWithInterval$1$1) create(vprVar, continuation)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        if (kotlinx.coroutines.a.i(r5, r7) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0056, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0030, code lost:
    
        if (r0.emit(r8, r7) == r1) goto L22;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0054 -> B:12:0x0033). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    Object obj2 = this.$value;
                    this.L$0 = vprVar;
                    this.label = 3;
                } else if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            }
            b.b(obj);
        } else {
            b.b(obj);
            Object obj3 = this.$value;
            this.L$0 = vprVar;
            this.label = 1;
        }
        if (!a.p(get_context())) {
            return zy11.a;
        }
        long j = this.$intervalMillis;
        this.L$0 = vprVar;
        this.label = 2;
    }
}
