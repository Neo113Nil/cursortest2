package xsna;

import android.content.ComponentName;
import android.content.Context;
import android.os.IBinder;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.hostinfo.MasterElections;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.utils.PackageExtenstionsKt;
import java.util.Collections;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MasterIPCClient.kt */
/* loaded from: classes5.dex */
public final class ak10 extends BaseIPCClient<MasterElections> {
    public final String m;

    public ak10(Context context, AppInfo appInfo, Logger logger, long j, jj10 jj10Var) {
        super(context, Collections.singletonList(appInfo), j, jj10Var, null, logger);
        this.m = "MasterIPCClient";
    }

    public static final ComponentName n(ak10 ak10Var, String str) {
        ComponentName findServiceByAction = PackageExtenstionsKt.findServiceByAction(ak10Var.getContext(), str, "com.vk.push.MASTER_SERVICE");
        if (findServiceByAction == null) {
            Logger.DefaultImpls.error$default(ak10Var.getLogger(), zr.a("Unable to resolve service in ", str, " by action com.vk.push.MASTER_SERVICE"), null, 2, null);
        }
        return findServiceByAction;
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final MasterElections createInterface(IBinder iBinder) {
        return MasterElections.Stub.asInterface(iBinder);
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return this.m;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(long j, ContinuationImpl continuationImpl) {
        oj10 oj10Var;
        int i;
        if (continuationImpl instanceof oj10) {
            oj10Var = (oj10) continuationImpl;
            int i2 = oj10Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oj10Var.label = i2 - Integer.MIN_VALUE;
                oj10 oj10Var2 = oj10Var;
                Object obj = oj10Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = oj10Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ae8 ae8Var = new ae8(1, this, ak10.class, "findMasterService", "findMasterService(Ljava/lang/String;)Landroid/content/ComponentName;", 0, 5);
                    qj10 qj10Var = qj10.j;
                    oj10Var2.label = 1;
                    obj = makeAsyncRequest(pj10.i, "getHostAppInfo", qj10Var, rj10.i, ae8Var, j, oj10Var2);
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
        oj10Var = new oj10(this, continuationImpl);
        oj10 oj10Var22 = oj10Var;
        Object obj2 = oj10Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = oj10Var22.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(String str, ContinuationImpl continuationImpl) {
        sj10 sj10Var;
        int i;
        if (continuationImpl instanceof sj10) {
            sj10Var = (sj10) continuationImpl;
            int i2 = sj10Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sj10Var.label = i2 - Integer.MIN_VALUE;
                sj10 sj10Var2 = sj10Var;
                Object obj = sj10Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sj10Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    tj10 tj10Var = new tj10(str);
                    vj10 vj10Var = vj10.j;
                    ug8 ug8Var = new ug8(1, this, ak10.class, "findMasterService", "findMasterService(Ljava/lang/String;)Landroid/content/ComponentName;", 0, 8);
                    sj10Var2.label = 1;
                    obj = BaseIPCClient.makeAsyncRequest$default(this, tj10Var, "notifyOldMaster", uj10.i, vj10Var, ug8Var, 0L, sj10Var2, 32, null);
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
        sj10Var = new sj10(this, continuationImpl);
        sj10 sj10Var22 = sj10Var;
        Object obj2 = sj10Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sj10Var22.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(ContinuationImpl continuationImpl) {
        wj10 wj10Var;
        int i;
        if (continuationImpl instanceof wj10) {
            wj10Var = (wj10) continuationImpl;
            int i2 = wj10Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wj10Var.label = i2 - Integer.MIN_VALUE;
                wj10 wj10Var2 = wj10Var;
                Object obj = wj10Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = wj10Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    o1g o1gVar = new o1g(1, this, ak10.class, "findMasterService", "findMasterService(Ljava/lang/String;)Landroid/content/ComponentName;", 0, 5);
                    wj10Var2.label = 1;
                    obj = BaseIPCClient.makeAsyncRequest$default(this, xj10.i, "sendRequestToInitiateElections", yj10.i, zj10.i, o1gVar, 0L, wj10Var2, 32, null);
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
        wj10Var = new wj10(this, continuationImpl);
        wj10 wj10Var22 = wj10Var;
        Object obj2 = wj10Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = wj10Var22.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
