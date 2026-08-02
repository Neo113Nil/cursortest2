package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.k.i$a;

/* loaded from: classes9.dex */
public final class qzy0 {
    public final x8z0 a;

    public qzy0(x8z0 x8z0Var) {
        this.a = x8z0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        i$a i_a;
        int i;
        if (continuationImpl instanceof i$a) {
            i_a = (i$a) continuationImpl;
            int i2 = i_a.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                i_a.c = i2 - Integer.MIN_VALUE;
                Object obj = i_a.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = i_a.c;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                i_a.c = 1;
                Object a = this.a.a(str, i_a);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        i_a = new i$a(this, continuationImpl);
        Object obj2 = i_a.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = i_a.c;
        if (i == 0) {
        }
    }
}
