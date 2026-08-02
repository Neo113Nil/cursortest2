package xsna;

import android.content.Context;
import android.os.IBinder;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.push.PushProvider;
import com.vk.push.core.push.RegisterForPushesResult;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.y.b$a;
import ru.rustore.sdk.pushclient.y.b$c;
import ru.rustore.sdk.pushclient.y.b$d;
import ru.rustore.sdk.pushclient.y.b$e;
import xsna.nay0;
import xsna.s3q0;

/* loaded from: classes9.dex */
public final class lfy0 extends BaseIPCClient<PushProvider> implements lay0 {
    public static final /* synthetic */ int o = 0;
    public final String m;
    public final String n;

    public lfy0(String str, Context context, List list, Logger logger, ru.rustore.sdk.pushclient.p.c cVar) {
        super(context, list, 0L, null, cVar, logger, 12, null);
        this.m = str;
        this.n = "PushIPCClient";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // xsna.lay0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(final String str, ContinuationImpl continuationImpl) {
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
                    wzs<PushProvider, AsyncCallback, s3q0> wzsVar = new wzs<PushProvider, AsyncCallback, s3q0>() { // from class: ru.rustore.sdk.pushclient.y.b$b
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(2);
                        }

                        @Override // xsna.wzs
                        public final s3q0 invoke(PushProvider pushProvider, AsyncCallback asyncCallback) {
                            pushProvider.registerForPushes(str, this.m, asyncCallback);
                            return s3q0.a;
                        }
                    };
                    b$c b_c = new wzs<AidlResult<?>, AppInfo, Result<? extends nay0>>() { // from class: ru.rustore.sdk.pushclient.y.b$c
                        @Override // xsna.wzs
                        public final Result<? extends nay0> invoke(AidlResult<?> aidlResult, AppInfo appInfo) {
                            return new Result<>(new nay0((RegisterForPushesResult) aidlResult.getData(), appInfo));
                        }
                    };
                    b$d b_d = new izs<Exception, Result<? extends nay0>>() { // from class: ru.rustore.sdk.pushclient.y.b$d
                        @Override // xsna.izs
                        public final Result<? extends nay0> invoke(Exception exc) {
                            return new Result<>(new Result.Failure(exc));
                        }
                    };
                    b$e b_e = new b$e(1, this, lfy0.class, "findPushService", "findPushService(Ljava/lang/String;)Landroid/content/ComponentName;", 0);
                    b_a2.c = 1;
                    obj = BaseIPCClient.makeAsyncRequest$default(this, wzsVar, "registerForPushes", b_c, b_d, b_e, 0L, b_a2, 32, null);
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
    public final PushProvider createInterface(IBinder iBinder) {
        return PushProvider.Stub.asInterface(iBinder);
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return this.n;
    }
}
