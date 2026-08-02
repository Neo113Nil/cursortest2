package xsna;

import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class x8z0 {
    public final ru.rustore.sdk.pushclient.m.n a;

    public x8z0(ru.rustore.sdk.pushclient.m.n nVar) {
        this.a = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004b, code lost:
    
        if (r7 == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.l.p$a p_a;
        int i;
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.l.p$a) {
            p_a = (ru.rustore.sdk.pushclient.l.p$a) continuationImpl;
            int i2 = p_a.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                p_a.d = i2 - Integer.MIN_VALUE;
                Object obj = p_a.b;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = p_a.d;
                if (i != 0) {
                    kotlin.a.a(obj);
                    p_a.a = str;
                    p_a.d = 1;
                    obj = this.a.invoke(p_a);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                        return ((Result) obj).d();
                    }
                    str = p_a.a;
                    kotlin.a.a(obj);
                }
                lay0 lay0Var = ((jfy0) obj).b;
                p_a.a = null;
                p_a.d = 2;
                Object b = lay0Var.b(str, p_a);
                return b != coroutineSingletons ? coroutineSingletons : b;
            }
        }
        p_a = new ru.rustore.sdk.pushclient.l.p$a(this, continuationImpl);
        Object obj2 = p_a.b;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = p_a.d;
        if (i != 0) {
        }
        lay0 lay0Var2 = ((jfy0) obj2).b;
        p_a.a = null;
        p_a.d = 2;
        Object b2 = lay0Var2.b(str, p_a);
        if (b2 != coroutineSingletons2) {
        }
    }
}
