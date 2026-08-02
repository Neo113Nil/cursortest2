package com.yandex.messaging.internal.authorized.chat.refresher;

import defpackage.bvf0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r9;
import defpackage.s9;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.chat.refresher.AbstractReducedLoadScheduler$startCollectingIfNeeded$2", f = "AbstractReducedLoadScheduler.kt", l = {30, 32, 32}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class AbstractReducedLoadScheduler$startCollectingIfNeeded$2 extends SuspendLambda implements wls {
    final /* synthetic */ vpr $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ s9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractReducedLoadScheduler$startCollectingIfNeeded$2(s9 s9Var, vpr vprVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = s9Var;
        this.$collector = vprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        AbstractReducedLoadScheduler$startCollectingIfNeeded$2 abstractReducedLoadScheduler$startCollectingIfNeeded$2 = new AbstractReducedLoadScheduler$startCollectingIfNeeded$2(this.this$0, this.$collector, continuation);
        abstractReducedLoadScheduler$startCollectingIfNeeded$2.L$0 = obj;
        return abstractReducedLoadScheduler$startCollectingIfNeeded$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AbstractReducedLoadScheduler$startCollectingIfNeeded$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0052, code lost:
    
        if (defpackage.wpb1.h(r5, r8) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0067, code lost:
    
        if (r9 == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x007c, code lost:
    
        if (((defpackage.tpr) r9).collect(r5, r8) == r0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
    
        return r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x007c -> B:7:0x0036). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tse tseVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tseVar = (tse) this.L$0;
        } else {
            if (i == 1) {
                tseVar = (tse) this.L$0;
                kotlin.b.b(obj);
                if (this.this$0.b()) {
                    s9 s9Var = this.this$0;
                    this.L$0 = tseVar;
                    this.label = 2;
                    obj = s9Var.c();
                }
                return zy11.a;
            }
            if (i == 2) {
                tseVar = (tse) this.L$0;
                kotlin.b.b(obj);
                r9 r9Var = new r9(this.$collector, 0);
                this.L$0 = tseVar;
                this.label = 3;
            } else {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tseVar = (tse) this.L$0;
                kotlin.b.b(obj);
            }
        }
        if (bvf0.D(tseVar) && this.this$0.b()) {
            long a = this.this$0.a();
            this.L$0 = tseVar;
            this.label = 1;
        }
        return zy11.a;
    }
}
