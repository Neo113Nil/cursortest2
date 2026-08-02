package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.auth.Auth;
import com.vk.push.core.auth.AuthTokenResult;
import com.vk.push.core.auth.AuthorizedResult;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.ipc.BaseIPCClient;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.h.b$a;
import ru.rustore.sdk.pushclient.h.b$b;
import ru.rustore.sdk.pushclient.h.b$c;
import ru.rustore.sdk.pushclient.h.b$d;
import ru.rustore.sdk.pushclient.h.b$e;
import ru.rustore.sdk.pushclient.h.b$f;
import ru.rustore.sdk.pushclient.h.b$g;
import ru.rustore.sdk.pushclient.h.b$h;
import ru.rustore.sdk.pushclient.h.b$i;
import ru.rustore.sdk.pushclient.h.b$j;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class hfy0 extends BaseIPCClient<Auth> implements z9y0 {
    public final String m;

    public hfy0(Context context, List<AppInfo> list, Logger logger, gzs<s3q0> gzsVar) {
        super(context, list, 0L, null, gzsVar, logger, 12, null);
        this.m = "AuthIPCClient";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // xsna.z9y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        b$f b_f;
        int i;
        if (continuationImpl instanceof b$f) {
            b_f = (b$f) continuationImpl;
            int i2 = b_f.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b_f.c = i2 - Integer.MIN_VALUE;
                b$f b_f2 = b_f;
                Object obj = b_f2.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = b_f2.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    b$g b_g = new wzs<Auth, AsyncCallback, s3q0>() { // from class: ru.rustore.sdk.pushclient.h.b$g
                        @Override // xsna.wzs
                        public final s3q0 invoke(Auth auth, AsyncCallback asyncCallback) {
                            auth.isUserAuthorized(asyncCallback);
                            return s3q0.a;
                        }
                    };
                    b$h b_h = new wzs<AidlResult<?>, AppInfo, Result<? extends Boolean>>() { // from class: ru.rustore.sdk.pushclient.h.b$h
                        @Override // xsna.wzs
                        public final Result<? extends Boolean> invoke(AidlResult<?> aidlResult, AppInfo appInfo) {
                            return new Result<>(Boolean.valueOf(((AuthorizedResult) aidlResult.getData()).isAuthorized()));
                        }
                    };
                    b$i b_i = new izs<Exception, Result<? extends Boolean>>() { // from class: ru.rustore.sdk.pushclient.h.b$i
                        @Override // xsna.izs
                        public final Result<? extends Boolean> invoke(Exception exc) {
                            return new Result<>(new Result.Failure(exc));
                        }
                    };
                    b$j b_j = new izs<String, ComponentName>() { // from class: ru.rustore.sdk.pushclient.h.b$j
                        @Override // xsna.izs
                        public final ComponentName invoke(String str) {
                            return new ComponentName(str, "com.vk.push.authsdk.ipc.AuthService");
                        }
                    };
                    b_f2.c = 1;
                    obj = BaseIPCClient.makeAsyncRequest$default(this, b_g, "isUserAuthorized", b_h, b_i, b_j, 0L, b_f2, 32, null);
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
        b_f = new b$f(this, continuationImpl);
        b$f b_f22 = b_f;
        Object obj2 = b_f22.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = b_f22.c;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // xsna.z9y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(ContinuationImpl continuationImpl) {
        b$a b_a;
        int i;
        if (continuationImpl instanceof b$a) {
            b_a = (b$a) continuationImpl;
            int i2 = b_a.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b_a.c = i2 - Integer.MIN_VALUE;
                b$a b_a2 = b_a;
                Object obj = b_a2.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = b_a2.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    b$b b_b = new wzs<Auth, AsyncCallback, s3q0>() { // from class: ru.rustore.sdk.pushclient.h.b$b
                        @Override // xsna.wzs
                        public final s3q0 invoke(Auth auth, AsyncCallback asyncCallback) {
                            auth.getIntermediateToken(asyncCallback);
                            return s3q0.a;
                        }
                    };
                    b$c b_c = new wzs<AidlResult<?>, AppInfo, Result<? extends String>>() { // from class: ru.rustore.sdk.pushclient.h.b$c
                        @Override // xsna.wzs
                        public final Result<? extends String> invoke(AidlResult<?> aidlResult, AppInfo appInfo) {
                            return new Result<>(((AuthTokenResult) aidlResult.getData()).getToken());
                        }
                    };
                    b$d b_d = new izs<Exception, Result<? extends String>>() { // from class: ru.rustore.sdk.pushclient.h.b$d
                        @Override // xsna.izs
                        public final Result<? extends String> invoke(Exception exc) {
                            return new Result<>(new Result.Failure(exc));
                        }
                    };
                    b$e b_e = new izs<String, ComponentName>() { // from class: ru.rustore.sdk.pushclient.h.b$e
                        @Override // xsna.izs
                        public final ComponentName invoke(String str) {
                            return new ComponentName(str, "com.vk.push.authsdk.ipc.AuthService");
                        }
                    };
                    b_a2.c = 1;
                    obj = BaseIPCClient.makeAsyncRequest$default(this, b_b, "getIntermediateToken", b_c, b_d, b_e, 0L, b_a2, 32, null);
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
        b_a = new b$a(this, continuationImpl);
        b$a b_a22 = b_a;
        Object obj2 = b_a22.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = b_a22.c;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final Auth createInterface(IBinder iBinder) {
        return Auth.Stub.asInterface(iBinder);
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return this.m;
    }
}
