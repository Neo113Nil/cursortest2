package xsna;

import android.os.IBinder;
import com.vk.push.core.ipc.BaseIPCClient;
import com.vk.push.core.work.WorkExecutor;
import com.vk.push.core.work.WorkModel;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: WorkExecutorIPCClient.kt */
/* loaded from: classes5.dex */
public final class ovx0 extends BaseIPCClient<WorkExecutor> {
    public static final /* synthetic */ int m = 0;

    public ovx0() {
        throw null;
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final WorkExecutor createInterface(IBinder iBinder) {
        return WorkExecutor.Stub.asInterface(iBinder);
    }

    @Override // com.vk.push.core.ipc.BaseIPCClient
    public final String getLogTag() {
        return "WorkExecutor";
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(WorkModel workModel, ContinuationImpl continuationImpl) {
        kvx0 kvx0Var;
        int i;
        if (continuationImpl instanceof kvx0) {
            kvx0Var = (kvx0) continuationImpl;
            int i2 = kvx0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kvx0Var.label = i2 - Integer.MIN_VALUE;
                kvx0 kvx0Var2 = kvx0Var;
                Object obj = kvx0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = kvx0Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    lvx0 lvx0Var = new lvx0(workModel);
                    wd8 wd8Var = new wd8(1, this, ovx0.class, "findService", "findService(Ljava/lang/String;)Landroid/content/ComponentName;", 0, 16);
                    kvx0Var2.label = 1;
                    obj = BaseIPCClient.makeAsyncRequest$default(this, lvx0Var, "executeWork", mvx0.i, nvx0.i, wd8Var, 0L, kvx0Var2, 32, null);
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
        kvx0Var = new kvx0(this, continuationImpl);
        kvx0 kvx0Var22 = kvx0Var;
        Object obj2 = kvx0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = kvx0Var22.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
