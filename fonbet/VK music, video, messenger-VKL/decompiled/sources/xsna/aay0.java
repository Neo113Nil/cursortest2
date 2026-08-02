package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.hostinfo.MasterElections;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.masterhost.MasterHost;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.rustore.sdk.pushclient.j.a$d;
import xsna.aay0;
import xsna.s3q0;
import xsna.zr;

/* loaded from: classes9.dex */
public final class aay0 extends BaseIPCClient<MasterElections> {
    public static final /* synthetic */ int n = 0;
    public final String m;

    public aay0(Context context, List<AppInfo> list, Logger logger) {
        super(context, list, 0L, null, null, logger, 12, null);
        this.m = "ArbiterIPCClient";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        ru.rustore.sdk.pushclient.j.a$a a_a;
        int i;
        if (continuationImpl instanceof ru.rustore.sdk.pushclient.j.a$a) {
            a_a = (ru.rustore.sdk.pushclient.j.a$a) continuationImpl;
            int i2 = a_a.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a_a.c = i2 - Integer.MIN_VALUE;
                ru.rustore.sdk.pushclient.j.a$a a_a2 = a_a;
                Object obj = a_a2.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = a_a2.c;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ru.rustore.sdk.pushclient.j.a$b a_b = new wzs<MasterElections, AsyncCallback, s3q0>() { // from class: ru.rustore.sdk.pushclient.j.a$b
                        @Override // xsna.wzs
                        public final s3q0 invoke(MasterElections masterElections, AsyncCallback asyncCallback) {
                            masterElections.getMaster(asyncCallback);
                            return s3q0.a;
                        }
                    };
                    ru.rustore.sdk.pushclient.j.a$c a_c = new wzs<AidlResult<?>, AppInfo, Result<? extends String>>() { // from class: ru.rustore.sdk.pushclient.j.a$c
                        @Override // xsna.wzs
                        public final Result<? extends String> invoke(AidlResult<?> aidlResult, AppInfo appInfo) {
                            return new Result<>(((MasterHost) aidlResult.getData()).getMaster());
                        }
                    };
                    a$d a_d = new izs<Exception, Result<? extends String>>() { // from class: ru.rustore.sdk.pushclient.j.a$d
                        @Override // xsna.izs
                        public final Result<? extends String> invoke(Exception exc) {
                            return new Result<>(new Result.Failure(exc));
                        }
                    };
                    izs<String, ComponentName> izsVar = new izs<String, ComponentName>() { // from class: ru.rustore.sdk.pushclient.j.a$e
                        {
                            super(1);
                        }

                        @Override // xsna.izs
                        public final ComponentName invoke(String str) {
                            String str2 = str;
                            aay0 aay0Var = aay0.this;
                            int i3 = aay0.n;
                            aay0Var.getClass();
                            Intent intent = new Intent("com.vk.push.MASTER_SERVICE");
                            intent.setPackage(str2);
                            ResolveInfo resolveService = aay0Var.getContext().getPackageManager().resolveService(intent, 128);
                            if (resolveService != null) {
                                return new ComponentName(str2, resolveService.serviceInfo.name);
                            }
                            Logger.DefaultImpls.error$default(aay0Var.getLogger(), zr.a("Unable to resolve service in ", str2, " by action com.vk.push.MASTER_SERVICE"), null, 2, null);
                            return null;
                        }
                    };
                    a_a2.c = 1;
                    obj = BaseIPCClient.makeAsyncRequest$default(this, a_b, "getMaster", a_c, a_d, izsVar, 0L, a_a2, 32, null);
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
        a_a = new ru.rustore.sdk.pushclient.j.a$a(this, continuationImpl);
        ru.rustore.sdk.pushclient.j.a$a a_a22 = a_a;
        Object obj2 = a_a22.a;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = a_a22.c;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final MasterElections createInterface(IBinder iBinder) {
        return MasterElections.Stub.asInterface(iBinder);
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return this.m;
    }
}
