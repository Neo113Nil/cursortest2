package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.IBinder;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.ComponentActions;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.push.PushClient;
import java.util.Collections;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PushIPCClientImpl.kt */
/* loaded from: classes5.dex */
public final class uie0 extends BaseIPCClient<PushClient> implements zhe0 {
    public final String m;

    public uie0(Context context, AppInfo appInfo, Logger logger) {
        super(context, Collections.singletonList(appInfo), 20000L, null, null, logger, 8, null);
        this.m = "PushIPCClient";
    }

    public static final ComponentName n(uie0 uie0Var, String str) {
        uie0Var.getClass();
        Intent intent = new Intent(ComponentActions.CLIENT_MESSAGING_SERVICE_ACTION);
        intent.setPackage(str);
        ResolveInfo resolveService = uie0Var.getContext().getPackageManager().resolveService(intent, 128);
        if (resolveService != null) {
            return new ComponentName(str, resolveService.serviceInfo.name);
        }
        Logger.DefaultImpls.error$default(uie0Var.getLogger(), xqm0.g("\n                Unable to resolve service in " + str + " by action ru.rustore.sdk.pushclient.MESSAGING_EVENT.\n                Does client app register an exported service in AndroidManifest.xml?\n            "), null, 2, null);
        return null;
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final PushClient createInterface(IBinder iBinder) {
        return PushClient.Stub.asInterface(iBinder);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // xsna.zhe0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        aie0 aie0Var;
        int i;
        if (continuationImpl instanceof aie0) {
            aie0Var = (aie0) continuationImpl;
            int i2 = aie0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aie0Var.label = i2 - Integer.MIN_VALUE;
                aie0 aie0Var2 = aie0Var;
                Object obj = aie0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aie0Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    bie0 bie0Var = new bie0(str);
                    eie0 eie0Var = new eie0(this);
                    aie0Var2.label = 1;
                    obj = BaseIPCClient.makeAsyncRequest$default(this, bie0Var, "isPushTokenExist", cie0.i, die0.i, eie0Var, 0L, aie0Var2, 32, null);
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
        aie0Var = new aie0(this, continuationImpl);
        aie0 aie0Var22 = aie0Var;
        Object obj2 = aie0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aie0Var22.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // xsna.zhe0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, ContinuationImpl continuationImpl) {
        pie0 pie0Var;
        int i;
        if (continuationImpl instanceof pie0) {
            pie0Var = (pie0) continuationImpl;
            int i2 = pie0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pie0Var.label = i2 - Integer.MIN_VALUE;
                pie0 pie0Var2 = pie0Var;
                Object obj = pie0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = pie0Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    qie0 qie0Var = new qie0(list);
                    tie0 tie0Var = new tie0(this);
                    pie0Var2.label = 1;
                    obj = BaseIPCClient.makeAsyncRequest$default(this, qie0Var, "sendMessages", rie0.i, sie0.i, tie0Var, 0L, pie0Var2, 32, null);
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
        pie0Var = new pie0(this, continuationImpl);
        pie0 pie0Var22 = pie0Var;
        Object obj2 = pie0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = pie0Var22.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // xsna.zhe0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(ContinuationImpl continuationImpl) {
        fie0 fie0Var;
        int i;
        if (continuationImpl instanceof fie0) {
            fie0Var = (fie0) continuationImpl;
            int i2 = fie0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fie0Var.label = i2 - Integer.MIN_VALUE;
                fie0 fie0Var2 = fie0Var;
                Object obj = fie0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fie0Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    iie0 iie0Var = iie0.j;
                    jie0 jie0Var = new jie0(this);
                    fie0Var2.label = 1;
                    obj = BaseIPCClient.makeAsyncRequest$default(this, gie0.i, "onDeleteMessages", hie0.i, iie0Var, jie0Var, 0L, fie0Var2, 32, null);
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
        fie0Var = new fie0(this, continuationImpl);
        fie0 fie0Var22 = fie0Var;
        Object obj2 = fie0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fie0Var22.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // xsna.zhe0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        kie0 kie0Var;
        int i;
        if (continuationImpl instanceof kie0) {
            kie0Var = (kie0) continuationImpl;
            int i2 = kie0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kie0Var.label = i2 - Integer.MIN_VALUE;
                kie0 kie0Var2 = kie0Var;
                Object obj = kie0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kie0Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    oie0 oie0Var = new oie0(this);
                    kie0Var2.label = 1;
                    obj = BaseIPCClient.makeAsyncRequest$default(this, lie0.i, "onTokenInvalidated", mie0.i, nie0.i, oie0Var, 0L, kie0Var2, 32, null);
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
        kie0Var = new kie0(this, continuationImpl);
        kie0 kie0Var22 = kie0Var;
        Object obj2 = kie0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kie0Var22.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return this.m;
    }
}
