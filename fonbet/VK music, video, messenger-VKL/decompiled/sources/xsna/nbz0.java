package xsna;

import com.vk.push.common.HostInfoProvider;
import com.vk.push.core.network.http.HttpClient;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.l.r$a;
import ru.rustore.sdk.pushclient.l.r$b;
import ru.rustore.sdk.pushclient.l.r$c;
import ru.rustore.sdk.pushclient.l.r$d;

/* loaded from: classes9.dex */
public final class nbz0 {
    public final HttpClient a;
    public final HostInfoProvider b;
    public final wgl c;

    public nbz0(HttpClient httpClient, HostInfoProvider hostInfoProvider) {
        bdn bdnVar = bdn.a;
        wgl wglVar = wgl.c;
        this.a = httpClient;
        this.b = hostInfoProvider;
        this.c = wglVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, ContinuationImpl continuationImpl) {
        r$a r_a;
        int i;
        if (continuationImpl instanceof r$a) {
            r_a = (r$a) continuationImpl;
            int i2 = r_a.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r_a.c = i2 - Integer.MIN_VALUE;
                Object obj = r_a.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = r_a.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    r$b r_b = new r$b(str, str2, this, null);
                    r_a.c = 1;
                    obj = myc0.k(this.c, r_b, r_a);
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
        r_a = new r$a(this, continuationImpl);
        Object obj2 = r_a.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = r_a.c;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, String str2, ContinuationImpl continuationImpl) {
        r$c r_c;
        int i;
        if (continuationImpl instanceof r$c) {
            r_c = (r$c) continuationImpl;
            int i2 = r_c.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                r_c.c = i2 - Integer.MIN_VALUE;
                Object obj = r_c.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = r_c.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    r$d r_d = new r$d(str, str2, this, null);
                    r_c.c = 1;
                    obj = myc0.k(this.c, r_d, r_c);
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
        r_c = new r$c(this, continuationImpl);
        Object obj2 = r_c.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = r_c.c;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
