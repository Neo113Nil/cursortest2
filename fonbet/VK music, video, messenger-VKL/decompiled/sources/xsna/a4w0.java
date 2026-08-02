package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: VkpnsAuthInteractor.kt */
/* loaded from: classes5.dex */
public final class a4w0 implements p55 {
    public final q15 a;

    public a4w0(q15 q15Var) {
        this.a = q15Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // xsna.p55
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, String str4, ContinuationImpl continuationImpl) {
        z3w0 z3w0Var;
        int i;
        if (continuationImpl instanceof z3w0) {
            z3w0Var = (z3w0) continuationImpl;
            int i2 = z3w0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                z3w0Var.label = i2 - Integer.MIN_VALUE;
                z3w0 z3w0Var2 = z3w0Var;
                Object obj = z3w0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = z3w0Var2.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                z3w0Var2.label = 1;
                Object a = this.a.a(str, str2, str3, str4, z3w0Var2);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        z3w0Var = new z3w0(this, continuationImpl);
        z3w0 z3w0Var22 = z3w0Var;
        Object obj2 = z3w0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = z3w0Var22.label;
        if (i == 0) {
        }
    }
}
