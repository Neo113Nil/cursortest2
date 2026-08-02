package com.ybsdk.core.utils.coroutines;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.core.utils.coroutines.DebounceRequestRunner$submit$newJob$1", f = "DebounceRequestRunner.kt", l = {26, 30, 32}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class DebounceRequestRunner$submit$newJob$1 extends SuspendLambda implements wls {
    final /* synthetic */ long $debounce;
    final /* synthetic */ wls $onLatestResult;
    final /* synthetic */ tls $request;
    final /* synthetic */ long $requestId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DebounceRequestRunner$submit$newJob$1(long j, long j2, a aVar, tls tlsVar, wls wlsVar, Continuation continuation) {
        super(2, continuation);
        this.$debounce = j;
        this.$requestId = j2;
        this.this$0 = aVar;
        this.$request = tlsVar;
        this.$onLatestResult = wlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DebounceRequestRunner$submit$newJob$1(this.$debounce, this.$requestId, this.this$0, this.$request, this.$onLatestResult, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DebounceRequestRunner$submit$newJob$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (r10 == r0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x002f, code lost:
    
        if (kotlinx.coroutines.a.j(r6, r9) == r0) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.$debounce;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        kotlin.b.b(obj);
                        return zy11Var;
                    }
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (this.$requestId == this.this$0.d.get()) {
                    wls wlsVar = this.$onLatestResult;
                    this.label = 3;
                    if (wlsVar.invoke(obj, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                }
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        if (this.$requestId != this.this$0.d.get()) {
            return zy11Var;
        }
        tls tlsVar = this.$request;
        this.label = 2;
        obj = tlsVar.invoke(this);
    }
}
