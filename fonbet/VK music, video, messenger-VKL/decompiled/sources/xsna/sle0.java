package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PushTokenRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class sle0 implements qle0 {
    public final ske0 a;
    public final rke0 b;

    public sle0(ske0 ske0Var, rke0 rke0Var) {
        this.a = ske0Var;
        this.b = rke0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.qle0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        rle0 rle0Var;
        int i;
        if (continuationImpl instanceof rle0) {
            rle0Var = (rle0) continuationImpl;
            int i2 = rle0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rle0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = rle0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rle0Var.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                rle0Var.label = 1;
                Object a = this.b.a(str, str2, rle0Var);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        rle0Var = new rle0(this, continuationImpl);
        Object obj2 = rle0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rle0Var.label;
        if (i == 0) {
        }
    }

    @Override // xsna.qle0
    public final Object b(String str, lji0 lji0Var) {
        return this.a.b(str, lji0Var);
    }

    @Override // xsna.qle0
    public final Object c(pke0 pke0Var, ContinuationImpl continuationImpl) {
        return this.a.c(pke0Var, continuationImpl);
    }

    @Override // xsna.qle0
    public final Object d(String str, s3x s3xVar) {
        return this.a.m(str, s3xVar);
    }

    @Override // xsna.qle0
    public final Object e(pke0 pke0Var, ContinuationImpl continuationImpl) {
        return this.a.e(pke0Var, continuationImpl);
    }
}
