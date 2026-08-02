package xsna;

import com.vk.push.common.Logger;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes9.dex */
public final class gay0 {
    public final g2z a;
    public final ru.rustore.sdk.pushclient.s.b b;
    public final Logger c;

    public gay0(g2z g2zVar, ru.rustore.sdk.pushclient.s.b bVar, Logger logger) {
        this.a = g2zVar;
        this.b = bVar;
        this.c = logger;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006e, code lost:
    
        if (r8.a(r2, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.q.a$a a_a;
        Object obj;
        int i;
        boolean z;
        gay0 gay0Var;
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.q.a$a) {
            a_a = (ru.rustore.sdk.pushclient.q.a$a) continuationImpl;
            int i2 = a_a.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a_a.e = i2 - Integer.MIN_VALUE;
                obj = a_a.c;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a_a.e;
                if (i != 0) {
                    kotlin.a.a(obj);
                    a_a.a = this;
                    z = false;
                    a_a.b = false;
                    a_a.e = 1;
                    obj = ((uty0) this.a.b).a.a(a_a);
                    if (obj != coroutineSingletons) {
                        gay0Var = this;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return s3q0.a;
                }
                z = a_a.b;
                gay0Var = a_a.a;
                kotlin.a.a(obj);
                if (((Boolean) obj).booleanValue()) {
                    return s3q0.a;
                }
                Logger.DefaultImpls.info$default(gay0Var.c, "client sdk mode changed", null, 2, null);
                ru.rustore.sdk.pushclient.s.b bVar = gay0Var.b;
                a_a.a = null;
                a_a.e = 2;
            }
        }
        a_a = new ru.rustore.sdk.pushclient.q.a$a(this, continuationImpl);
        obj = a_a.c;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a_a.e;
        if (i != 0) {
        }
        if (((Boolean) obj).booleanValue()) {
        }
    }
}
