package xsna;

import com.vk.push.common.Logger;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.s.k$a;
import ru.rustore.sdk.pushclient.s.k$b;

/* loaded from: classes9.dex */
public final class p2z0 {
    public final qzy0 a;
    public final miy0 b;
    public final kvy0 c;
    public final Logger d;

    public p2z0(qzy0 qzy0Var, miy0 miy0Var, kvy0 kvy0Var, Logger logger) {
        this.a = qzy0Var;
        this.b = miy0Var;
        this.c = kvy0Var;
        this.d = logger.createLogger("RegisterPushTokenUseCase");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        k$a k_a;
        int i;
        if (continuationImpl instanceof k$a) {
            k_a = (k$a) continuationImpl;
            int i2 = k_a.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                k_a.c = i2 - Integer.MIN_VALUE;
                Object obj = k_a.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = k_a.c;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                k$b k_b = new k$b(this, str, null);
                k_a.c = 1;
                Object m110invokegIAlus = this.b.m110invokegIAlus(k_b, k_a);
                return m110invokegIAlus == coroutineSingletons ? coroutineSingletons : m110invokegIAlus;
            }
        }
        k_a = new k$a(this, continuationImpl);
        Object obj2 = k_a.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = k_a.c;
        if (i == 0) {
        }
    }
}
