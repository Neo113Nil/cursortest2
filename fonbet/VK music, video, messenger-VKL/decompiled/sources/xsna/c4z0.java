package xsna;

import com.vk.push.common.Logger;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.k.l$b;
import ru.rustore.sdk.pushclient.k.l$c;
import ru.rustore.sdk.pushclient.k.l$d;

/* loaded from: classes9.dex */
public final class c4z0 {
    public final nbz0 a;
    public final s9y0 b;
    public final wgl c;
    public final Logger d;

    public c4z0(nbz0 nbz0Var, s9y0 s9y0Var, Logger logger) {
        bdn bdnVar = bdn.a;
        wgl wglVar = wgl.c;
        this.a = nbz0Var;
        this.b = s9y0Var;
        this.c = wglVar;
        this.d = logger.createLogger("TopicRepo");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.k.l$a l_a;
        int i;
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.k.l$a) {
            l_a = (ru.rustore.sdk.pushclient.k.l$a) continuationImpl;
            int i2 = l_a.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l_a.c = i2 - Integer.MIN_VALUE;
                Object obj = l_a.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = l_a.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    l$b l_b = new l$b(this, str, null);
                    l_a.c = 1;
                    obj = myc0.k(this.c, l_b, l_a);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        l_a = new ru.rustore.sdk.pushclient.k.l$a(this, continuationImpl);
        Object obj2 = l_a.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = l_a.c;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, ContinuationImpl continuationImpl) {
        l$c l_c;
        int i;
        if (continuationImpl instanceof l$c) {
            l_c = (l$c) continuationImpl;
            int i2 = l_c.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l_c.c = i2 - Integer.MIN_VALUE;
                Object obj = l_c.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = l_c.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    l$d l_d = new l$d(this, str, null);
                    l_c.c = 1;
                    obj = myc0.k(this.c, l_d, l_c);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        l_c = new l$c(this, continuationImpl);
        Object obj2 = l_c.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = l_c.c;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
