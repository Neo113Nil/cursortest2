package xsna;

import com.vk.push.common.HostInfoProvider;
import com.vk.push.common.clientid.ClientId;
import com.vk.push.core.network.http.HttpClient;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.w.f$a;
import ru.rustore.sdk.pushclient.w.f$b;
import ru.rustore.sdk.pushclient.w.f$c;
import ru.rustore.sdk.pushclient.w.f$d;

/* loaded from: classes9.dex */
public final class pvy0 {
    public final HttpClient a;
    public final String b;
    public final HostInfoProvider c;

    public pvy0(HttpClient httpClient, String str, HostInfoProvider hostInfoProvider) {
        this.a = httpClient;
        this.b = str;
        this.c = hostInfoProvider;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ClientId clientId, ContinuationImpl continuationImpl) {
        f$c f_c;
        int i;
        if (continuationImpl instanceof f$c) {
            f_c = (f$c) continuationImpl;
            int i2 = f_c.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f_c.c = i2 - Integer.MIN_VALUE;
                Object obj = f_c.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = f_c.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    bdn bdnVar = bdn.a;
                    wgl wglVar = wgl.c;
                    f$d f_d = new f$d(str, clientId, this, null);
                    f_c.c = 1;
                    obj = myc0.k(wglVar, f_d, f_c);
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
        f_c = new f$c(this, continuationImpl);
        Object obj2 = f_c.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = f_c.c;
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
        f$a f_a;
        int i;
        if (continuationImpl instanceof f$a) {
            f_a = (f$a) continuationImpl;
            int i2 = f_a.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f_a.c = i2 - Integer.MIN_VALUE;
                Object obj = f_a.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = f_a.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    bdn bdnVar = bdn.a;
                    wgl wglVar = wgl.c;
                    f$b f_b = new f$b(str, this, null);
                    f_a.c = 1;
                    obj = myc0.k(wglVar, f_b, f_a);
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
        f_a = new f$a(this, continuationImpl);
        Object obj2 = f_a.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = f_a.c;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
