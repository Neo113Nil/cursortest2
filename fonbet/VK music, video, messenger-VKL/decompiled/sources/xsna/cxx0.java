package xsna;

import android.content.ComponentName;
import android.os.IBinder;
import com.vk.push.common.Logger;
import com.vk.push.core.domain.ComponentActions;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.utils.PackageExtenstionsKt;
import com.vk.push.core.work.WorkRegistrator;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: WorkRegistratorIPCClient.kt */
/* loaded from: classes5.dex */
public final class cxx0 extends BaseIPCClient<WorkRegistrator> {
    public cxx0() {
        throw null;
    }

    public static final ComponentName n(cxx0 cxx0Var, String str) {
        ComponentName findServiceByAction = PackageExtenstionsKt.findServiceByAction(cxx0Var.getContext(), str, ComponentActions.WORK_REGISTRATOR_ACTION);
        if (findServiceByAction == null) {
            Logger.DefaultImpls.error$default(cxx0Var.getLogger(), zr.a("Unable to resolve service in ", str, " by action com.vk.push.WORK_REGISTRATOR"), null, 2, null);
        }
        return findServiceByAction;
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final WorkRegistrator createInterface(IBinder iBinder) {
        return WorkRegistrator.Stub.asInterface(iBinder);
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return "WorkRegistrator";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(String str, ContinuationImpl continuationImpl) {
        vwx0 vwx0Var;
        int i;
        if (continuationImpl instanceof vwx0) {
            vwx0Var = (vwx0) continuationImpl;
            int i2 = vwx0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vwx0Var.label = i2 - Integer.MIN_VALUE;
                vwx0 vwx0Var2 = vwx0Var;
                Object obj = vwx0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vwx0Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    wwx0 wwx0Var = new wwx0(str);
                    dh8 dh8Var = new dh8(1, this, cxx0.class, "findService", "findService(Ljava/lang/String;)Landroid/content/ComponentName;", 0, 8);
                    vwx0Var2.label = 1;
                    obj = BaseIPCClient.makeAsyncRequest$default(this, wwx0Var, "cancelWork", xwx0.i, ywx0.i, dh8Var, 0L, vwx0Var2, 32, null);
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
        vwx0Var = new vwx0(this, continuationImpl);
        vwx0 vwx0Var22 = vwx0Var;
        Object obj2 = vwx0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vwx0Var22.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
