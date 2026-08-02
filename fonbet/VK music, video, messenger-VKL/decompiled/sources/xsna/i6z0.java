package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.s.n$a;

/* loaded from: classes9.dex */
public final class i6z0 {
    public final c4z0 a;

    public i6z0(c4z0 c4z0Var) {
        this.a = c4z0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        n$a n_a;
        int i;
        if (continuationImpl instanceof n$a) {
            n_a = (n$a) continuationImpl;
            int i2 = n_a.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                n_a.c = i2 - Integer.MIN_VALUE;
                Object obj = n_a.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = n_a.c;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                n_a.c = 1;
                Object a = this.a.a(str, n_a);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        n_a = new n$a(this, continuationImpl);
        Object obj2 = n_a.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = n_a.c;
        if (i == 0) {
        }
    }
}
