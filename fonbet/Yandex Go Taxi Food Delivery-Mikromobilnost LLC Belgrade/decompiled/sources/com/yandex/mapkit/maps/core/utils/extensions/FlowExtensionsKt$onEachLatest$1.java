package com.yandex.mapkit.maps.core.utils.extensions;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\n"}, d2 = {"T", "Lvpr;", "value", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.mapkit.maps.core.utils.extensions.FlowExtensionsKt$onEachLatest$1", f = "FlowExtensions.kt", l = {148, 149}, m = "invokeSuspend", v = 1)
/* loaded from: classes15.dex */
public final class FlowExtensionsKt$onEachLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ wls $action;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowExtensionsKt$onEachLatest$1(wls wlsVar, Continuation<? super FlowExtensionsKt$onEachLatest$1> continuation) {
        super(3, continuation);
        this.$action = wlsVar;
    }

    public final Object invoke(vpr vprVar, T t, Continuation<? super zy11> continuation) {
        FlowExtensionsKt$onEachLatest$1 flowExtensionsKt$onEachLatest$1 = new FlowExtensionsKt$onEachLatest$1(this.$action, continuation);
        flowExtensionsKt$onEachLatest$1.L$0 = vprVar;
        flowExtensionsKt$onEachLatest$1.L$1 = t;
        return flowExtensionsKt$onEachLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003d, code lost:
    
        if (r0.emit(r1, r7) == r2) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r8.invoke(r1, r7) == r2) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            wls wlsVar = this.$action;
            this.L$0 = vprVar;
            this.L$1 = obj2;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        this.L$0 = null;
        this.L$1 = null;
        this.label = 2;
    }

    @Override // defpackage.zls
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((vpr) obj, (vpr) obj2, (Continuation<? super zy11>) obj3);
    }
}
