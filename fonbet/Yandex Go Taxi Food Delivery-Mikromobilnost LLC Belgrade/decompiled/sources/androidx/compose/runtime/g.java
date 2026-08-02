package androidx.compose.runtime;

import defpackage.dvw;
import defpackage.fse;
import defpackage.j18;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.sls;
import defpackage.tls;
import defpackage.w6f0;
import defpackage.wv51;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class g implements w6f0, oz40 {
    public final /* synthetic */ oz40 a;
    public final fse b;

    public g(oz40 oz40Var, fse fseVar) {
        this.a = oz40Var;
        this.b = fseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* JADX WARN: Type inference failed for: r5v4, types: [sls] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CoroutineSingletons a(wv51 wv51Var, ContinuationImpl continuationImpl) {
        ProduceStateScopeImpl$awaitDispose$1 produceStateScopeImpl$awaitDispose$1;
        int i;
        try {
            if (continuationImpl instanceof ProduceStateScopeImpl$awaitDispose$1) {
                produceStateScopeImpl$awaitDispose$1 = (ProduceStateScopeImpl$awaitDispose$1) continuationImpl;
                int i2 = produceStateScopeImpl$awaitDispose$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    produceStateScopeImpl$awaitDispose$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = produceStateScopeImpl$awaitDispose$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = produceStateScopeImpl$awaitDispose$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        produceStateScopeImpl$awaitDispose$1.L$0 = wv51Var;
                        produceStateScopeImpl$awaitDispose$1.label = 1;
                        j18 j18Var = new j18(1, dvw.b(produceStateScopeImpl$awaitDispose$1));
                        j18Var.u();
                        wv51Var = wv51Var;
                        if (j18Var.s() == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r5 = (sls) produceStateScopeImpl$awaitDispose$1.L$0;
                        kotlin.b.b(obj);
                        wv51Var = r5;
                    }
                    throw new KotlinNothingValueException();
                }
            }
            if (i != 0) {
            }
            throw new KotlinNothingValueException();
        } catch (Throwable th) {
            wv51Var.invoke();
            throw th;
        }
        produceStateScopeImpl$awaitDispose$1 = new ProduceStateScopeImpl$awaitDispose$1(this, continuationImpl);
        Object obj2 = produceStateScopeImpl$awaitDispose$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = produceStateScopeImpl$awaitDispose$1.label;
    }

    @Override // defpackage.oz40
    public final Object component1() {
        return this.a.component1();
    }

    @Override // defpackage.oz40
    public final tls component2() {
        return this.a.component2();
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return this.b;
    }

    @Override // defpackage.m3u0
    public final Object getValue() {
        return this.a.getValue();
    }

    @Override // defpackage.oz40
    public final void setValue(Object obj) {
        this.a.setValue(obj);
    }
}
