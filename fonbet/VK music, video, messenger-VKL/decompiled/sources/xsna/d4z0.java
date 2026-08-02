package xsna;

import com.vk.push.common.Logger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class d4z0 {
    public final iay0 a;
    public final s9y0 b;
    public final Logger c;

    public d4z0(iay0 iay0Var, s9y0 s9y0Var, Logger logger) {
        this.a = iay0Var;
        this.b = s9y0Var;
        this.c = logger.createLogger("SendPushTokenToClientIfNeedUseCase");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0085, code lost:
    
        if (r9.c(r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0078, code lost:
    
        if (r2.b(r10, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.s.l$a l_a;
        int i;
        Object obj;
        String str2;
        d4z0 d4z0Var;
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.s.l$a) {
            l_a = (ru.rustore.sdk.pushclient.s.l$a) continuationImpl;
            int i2 = l_a.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l_a.e = i2 - Integer.MIN_VALUE;
                Object obj2 = l_a.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = l_a.e;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    l_a.a = this;
                    l_a.b = str;
                    l_a.e = 1;
                    Object e = this.b.e(l_a);
                    if (e != coroutineSingletons) {
                        obj = e;
                        str2 = str;
                        d4z0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    String str3 = l_a.b;
                    d4z0 d4z0Var2 = l_a.a;
                    kotlin.a.a(obj2);
                    str2 = str3;
                    d4z0Var = d4z0Var2;
                    obj = obj2;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj2);
                        return s3q0.a;
                    }
                    d4z0Var = l_a.a;
                    kotlin.a.a(obj2);
                    s9y0 s9y0Var = d4z0Var.b;
                    l_a.a = null;
                    l_a.e = 3;
                }
                if (!((Boolean) obj).booleanValue()) {
                    return s3q0.a;
                }
                Logger.DefaultImpls.info$default(d4z0Var.c, "Sending new push token to the client app", null, 2, null);
                iay0 iay0Var = d4z0Var.a;
                l_a.a = d4z0Var;
                l_a.b = null;
                l_a.e = 2;
            }
        }
        l_a = new ru.rustore.sdk.pushclient.s.l$a(this, continuationImpl);
        Object obj22 = l_a.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = l_a.e;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
