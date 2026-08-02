package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.s.o$a;

/* loaded from: classes9.dex */
public final class r7z0 {
    public final c4z0 a;

    public r7z0(c4z0 c4z0Var) {
        this.a = c4z0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        o$a o_a;
        int i;
        if (continuationImpl instanceof o$a) {
            o_a = (o$a) continuationImpl;
            int i2 = o_a.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                o_a.c = i2 - Integer.MIN_VALUE;
                Object obj = o_a.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = o_a.c;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                o_a.c = 1;
                Object b = this.a.b(str, o_a);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        o_a = new o$a(this, continuationImpl);
        Object obj2 = o_a.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = o_a.c;
        if (i == 0) {
        }
    }
}
