package androidx.work.impl;

import android.content.Context;
import defpackage.euy;
import defpackage.fa51;
import defpackage.hgz;
import defpackage.kuy;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.t951;
import defpackage.tse;
import defpackage.u2s;
import defpackage.wls;
import defpackage.ya51;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Ljuy;", "kotlin.jvm.PlatformType", "<anonymous>", "(Ltse;)Ljuy;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", l = {300, 311}, m = "invokeSuspend")
/* loaded from: classes.dex */
final class WorkerWrapper$runWorker$result$1 extends SuspendLambda implements wls {
    final /* synthetic */ u2s $foregroundUpdater;
    final /* synthetic */ kuy $worker;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WorkerWrapper$runWorker$result$1(d dVar, kuy kuyVar, u2s u2sVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$worker = kuyVar;
        this.$foregroundUpdater = u2sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new WorkerWrapper$runWorker$result$1(this.this$0, this.$worker, this.$foregroundUpdater, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((WorkerWrapper$runWorker$result$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (androidx.work.impl.utils.a.a(r4, r5, r6, r7, r8, r9) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        WorkerWrapper$runWorker$result$1 workerWrapper$runWorker$result$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            Context context = dVar.b;
            fa51 fa51Var = dVar.a;
            kuy kuyVar = this.$worker;
            u2s u2sVar = this.$foregroundUpdater;
            t951 t951Var = dVar.e;
            this.label = 1;
            workerWrapper$runWorker$result$1 = this;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            workerWrapper$runWorker$result$1 = this;
        }
        String str = ya51.a;
        d dVar2 = workerWrapper$runWorker$result$1.this$0;
        hgz g = hgz.g();
        fa51 fa51Var2 = dVar2.a;
        g.getClass();
        euy startWork = workerWrapper$runWorker$result$1.$worker.startWork();
        kuy kuyVar2 = workerWrapper$runWorker$result$1.$worker;
        workerWrapper$runWorker$result$1.label = 2;
        Object a = ya51.a(startWork, kuyVar2, workerWrapper$runWorker$result$1);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
