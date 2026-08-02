package com.yandex.go.external_service.delegates;

import defpackage.dvx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "Lvpr;", "it", "Lzy11;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.external_service.delegates.MainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$flatMapLatest$1", f = "MainDelegate.kt", l = {189}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
public final class MainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$flatMapLatest$1 extends SuspendLambda implements zls {
    final /* synthetic */ tls $callback$inlined;
    final /* synthetic */ boolean $forceUpdateCookie$inlined;
    final /* synthetic */ Ref$ObjectRef $previousInfo$inlined;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$flatMapLatest$1(tls tlsVar, c cVar, Continuation continuation, Ref$ObjectRef ref$ObjectRef, boolean z) {
        super(3, continuation);
        this.$previousInfo$inlined = ref$ObjectRef;
        this.this$0 = cVar;
        this.$forceUpdateCookie$inlined = z;
        this.$callback$inlined = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Ref$ObjectRef ref$ObjectRef = this.$previousInfo$inlined;
        c cVar = this.this$0;
        boolean z = this.$forceUpdateCookie$inlined;
        MainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$flatMapLatest$1 mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$flatMapLatest$1 = new MainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$flatMapLatest$1(this.$callback$inlined, cVar, (Continuation) obj3, ref$ObjectRef, z);
        mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$flatMapLatest$1.L$0 = (vpr) obj;
        mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$flatMapLatest$1.L$1 = obj2;
        return mainDelegate$requestAuthData$1$1$invokeSuspend$$inlined$flatMapLatest$1.invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, dvx] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        Object obj2 = this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ?? r1 = (dvx) obj2;
            this.$previousInfo$inlined.element = r1;
            o oVar = new o(this.this$0.d.c(r1, this.$forceUpdateCookie$inlined, this.$callback$inlined), new MainDelegate$requestAuthData$1$1$2$1(this.$callback$inlined, null));
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (e.u(oVar, vprVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
