package xsna;

import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ProduceState.kt */
/* loaded from: classes11.dex */
public final class shd0<T> implements qhd0<T>, wh50<T> {
    public final /* synthetic */ wh50<T> b;
    public final kotlin.coroutines.d c;

    public shd0(wh50<T> wh50Var, kotlin.coroutines.d dVar) {
        this.b = wh50Var;
        this.c = dVar;
    }

    @Override // xsna.wh50
    public final izs<T, s3q0> K() {
        return this.b.K();
    }

    @Override // xsna.wh50
    public final T R() {
        return this.b.R();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v4, types: [xsna.gzs] */
    @Override // xsna.qhd0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons T(m3g m3gVar, ContinuationImpl continuationImpl) {
        rhd0 rhd0Var;
        int i;
        try {
            if (continuationImpl instanceof rhd0) {
                rhd0Var = (rhd0) continuationImpl;
                int i2 = rhd0Var.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    rhd0Var.label = i2 - Integer.MIN_VALUE;
                    Object obj = rhd0Var.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = rhd0Var.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        rhd0Var.L$0 = m3gVar;
                        rhd0Var.label = 1;
                        lq9 lq9Var = new lq9(1, s7s0.c(rhd0Var));
                        lq9Var.o();
                        m3gVar = m3gVar;
                        if (lq9Var.n() == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r5 = (gzs) rhd0Var.L$0;
                        kotlin.a.a(obj);
                        m3gVar = r5;
                    }
                    throw new KotlinNothingValueException();
                }
            }
            if (i != 0) {
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            m3gVar.invoke();
            throw th;
        }
        rhd0Var = new rhd0(this, continuationImpl);
        Object obj2 = rhd0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rhd0Var.label;
    }

    @Override // xsna.yvj
    public final kotlin.coroutines.d getCoroutineContext() {
        return this.c;
    }

    @Override // xsna.mtk0
    public final T getValue() {
        return this.b.getValue();
    }

    @Override // xsna.wh50
    public final void setValue(T t) {
        this.b.setValue(t);
    }
}
