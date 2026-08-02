package androidx.datastore.core;

import defpackage.fyc;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.gwk0;
import defpackage.ny61;
import defpackage.zy11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public abstract class k {
    public final kotlinx.coroutines.sync.a a = gtq0.a();
    public final fyc b = gwk0.b();

    public abstract Object a(ContinuationImpl continuationImpl);

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0058, code lost:
    
        if (r10.a(r0) == r1) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0065 A[Catch: all -> 0x0078, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0078, blocks: (B:25:0x005b, B:29:0x0065), top: B:24:0x005b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /* JADX WARN: Type inference failed for: r2v4, types: [g050] */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.datastore.core.k] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        RunOnce$runIfNeeded$1 runOnce$runIfNeeded$1;
        int i;
        fyc fycVar;
        kotlinx.coroutines.sync.a aVar;
        Throwable th;
        g050 g050Var;
        try {
            if (continuationImpl instanceof RunOnce$runIfNeeded$1) {
                runOnce$runIfNeeded$1 = (RunOnce$runIfNeeded$1) continuationImpl;
                int i2 = runOnce$runIfNeeded$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    runOnce$runIfNeeded$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = runOnce$runIfNeeded$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = runOnce$runIfNeeded$1.label;
                    zy11 zy11Var = zy11.a;
                    fycVar = this.b;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (fycVar.k0()) {
                            return zy11Var;
                        }
                        aVar = this.a;
                        runOnce$runIfNeeded$1.L$0 = aVar;
                        runOnce$runIfNeeded$1.label = 1;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            g050Var = (g050) runOnce$runIfNeeded$1.L$0;
                            try {
                                kotlin.b.b(obj);
                                fycVar.T(zy11Var);
                                g050Var.d(null);
                                return zy11Var;
                            } catch (Throwable th2) {
                                th = th2;
                                g050Var.d(null);
                                throw th;
                            }
                        }
                        ?? r2 = (g050) runOnce$runIfNeeded$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r2;
                    }
                    if (!fycVar.k0()) {
                        aVar.d(null);
                        return zy11Var;
                    }
                    runOnce$runIfNeeded$1.L$0 = aVar;
                    runOnce$runIfNeeded$1.label = 2;
                    if (a(runOnce$runIfNeeded$1) != coroutineSingletons) {
                        g050Var = aVar;
                        fycVar.T(zy11Var);
                        g050Var.d(null);
                        return zy11Var;
                    }
                    return coroutineSingletons;
                }
            }
            if (!fycVar.k0()) {
            }
        } catch (Throwable th3) {
            kotlinx.coroutines.sync.a aVar2 = aVar;
            th = th3;
            g050Var = aVar2;
            g050Var.d(null);
            throw th;
        }
        runOnce$runIfNeeded$1 = new RunOnce$runIfNeeded$1(this, continuationImpl);
        Object obj2 = runOnce$runIfNeeded$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = runOnce$runIfNeeded$1.label;
        zy11 zy11Var2 = zy11.a;
        fycVar = this.b;
        if (i != 0) {
        }
    }
}
