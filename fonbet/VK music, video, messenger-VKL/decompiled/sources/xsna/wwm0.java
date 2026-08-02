package xsna;

import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* compiled from: Share.kt */
/* loaded from: classes11.dex */
public final class wwm0<T> implements lsr<T> {
    public final lsr<T> b;
    public final SuspendLambda c;

    /* JADX WARN: Multi-variable type inference failed */
    public wwm0(lsr<? super T> lsrVar, wzs<? super lsr<? super T>, ? super spj<? super s3q0>, ? extends Object> wzsVar) {
        this.b = lsrVar;
        this.c = (SuspendLambda) wzsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0074, code lost:
    
        if (((xsna.wwm0) r7).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.coroutines.jvm.internal.ContinuationImpl] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v4, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.wzs] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        vwm0 vwm0Var;
        ?? r2;
        SafeCollector safeCollector;
        wwm0<T> wwm0Var;
        try {
            if (continuationImpl instanceof vwm0) {
                vwm0Var = (vwm0) continuationImpl;
                int i = vwm0Var.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    vwm0Var.label = i - Integer.MIN_VALUE;
                    Object obj = vwm0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r2 = vwm0Var.label;
                    if (r2 != 0) {
                        kotlin.a.a(obj);
                        safeCollector = new SafeCollector(this.b, vwm0Var.getContext());
                        ?? r7 = this.c;
                        vwm0Var.L$0 = this;
                        vwm0Var.L$1 = safeCollector;
                        vwm0Var.label = 1;
                        if (r7.invoke(safeCollector, vwm0Var) != coroutineSingletons) {
                            wwm0Var = this;
                        }
                        return coroutineSingletons;
                    }
                    if (r2 != 1) {
                        if (r2 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return s3q0.a;
                    }
                    safeCollector = (SafeCollector) vwm0Var.L$1;
                    wwm0Var = (wwm0) vwm0Var.L$0;
                    kotlin.a.a(obj);
                    safeCollector.releaseIntercepted();
                    lsr<T> lsrVar = wwm0Var.b;
                    r2 = lsrVar instanceof wwm0;
                    if (r2 != 0) {
                        return s3q0.a;
                    }
                    vwm0Var.L$0 = null;
                    vwm0Var.L$1 = null;
                    vwm0Var.label = 2;
                }
            }
            if (r2 != 0) {
            }
            safeCollector.releaseIntercepted();
            lsr<T> lsrVar2 = wwm0Var.b;
            r2 = lsrVar2 instanceof wwm0;
            if (r2 != 0) {
            }
        } catch (Throwable th) {
            r2.releaseIntercepted();
            throw th;
        }
        vwm0Var = new vwm0(this, continuationImpl);
        Object obj2 = vwm0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = vwm0Var.label;
    }

    @Override // xsna.lsr
    public final Object emit(T t, spj<? super s3q0> spjVar) {
        return this.b.emit(t, spjVar);
    }
}
