package com.yandex.go.payments.addmethod.navigation;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.uh0;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.addmethod.navigation.AddFastshiftAccountBaseRouter$withSpinner$1", f = "AddFastshiftAccountBaseRouter.kt", l = {287, 288, 289, 292}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class AddFastshiftAccountBaseRouter$withSpinner$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $action;
    final /* synthetic */ uh0 $prerequisiteScreen;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddFastshiftAccountBaseRouter$withSpinner$1(c cVar, uh0 uh0Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$prerequisiteScreen = uh0Var;
        this.$action = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddFastshiftAccountBaseRouter$withSpinner$1(this.this$0, this.$prerequisiteScreen, this.$action, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddFastshiftAccountBaseRouter$withSpinner$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
    
        if (com.yandex.go.payments.addmethod.navigation.c.Q(r3, r1, r11, r10) == r0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0094, code lost:
    
        if (r5.invoke(r10) != r0) goto L42;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        c cVar;
        uh0 uh0Var;
        tls tlsVar;
        tls tlsVar2;
        c cVar2;
        Throwable th;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i != 0) {
                if (i == 1) {
                    uh0Var = (uh0) this.L$2;
                    c cVar3 = (c) this.L$1;
                    tlsVar = (tls) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        cVar = cVar3;
                    } catch (Throwable th2) {
                        th = th2;
                        cVar2 = cVar3;
                    }
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            uh0Var = (uh0) this.L$1;
                            cVar2 = (c) this.L$0;
                            try {
                                kotlin.b.b(obj);
                            } catch (Throwable th3) {
                                th = th3;
                            }
                        } else {
                            if (i != 4) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                        }
                        return zy11.a;
                    }
                    uh0Var = (uh0) this.L$2;
                    c cVar4 = (c) this.L$1;
                    tlsVar2 = (tls) this.L$0;
                    try {
                        kotlin.b.b(obj);
                        cVar = cVar4;
                        this.L$0 = cVar;
                        this.L$1 = uh0Var;
                        this.L$2 = null;
                        this.label = 3;
                    } catch (Throwable th4) {
                        th = th4;
                        cVar2 = cVar4;
                    }
                }
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 4;
            } else {
                kotlin.b.b(obj);
                cVar = this.this$0;
                uh0Var = this.$prerequisiteScreen;
                tlsVar = this.$action;
                try {
                    this.L$0 = tlsVar;
                    this.L$1 = cVar;
                    this.L$2 = uh0Var;
                    this.label = 1;
                } catch (Throwable th5) {
                    cVar2 = cVar;
                    th = th5;
                }
                if (c.R(cVar, uh0Var, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            }
            tlsVar2 = tlsVar;
            this.L$0 = tlsVar2;
            this.L$1 = cVar;
            this.L$2 = uh0Var;
            this.label = 2;
            if (kotlinx.coroutines.a.i(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            this.L$0 = cVar;
            this.L$1 = uh0Var;
            this.L$2 = null;
            this.label = 3;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
