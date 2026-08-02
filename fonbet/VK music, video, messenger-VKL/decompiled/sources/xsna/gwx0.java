package xsna;

import com.vk.push.common.DefaultLogger;
import com.vk.push.common.Logger;
import com.vk.push.common.exception.SdkIsNotInitializedException;
import com.vk.push.core.base.AidlException;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.base.exception.TransferredIpcDataException;
import com.vk.push.core.utils.AidlExtensionsKt;
import com.vk.push.core.work.WorkModel;
import com.vk.push.core.work.WorkRegistrator;
import com.vk.push.core.work.WorkResult;
import com.vk.push.pushsdk.VkpnsPushConfig;
import kotlin.jvm.internal.Lambda;

/* compiled from: WorkManagerRegistratorStubImpl.kt */
/* loaded from: classes5.dex */
public final class gwx0 extends WorkRegistrator.Stub {
    public final bpn0 a = new bpn0(b.i);
    public final bpn0 b = new bpn0(a.i);

    /* compiled from: WorkManagerRegistratorStubImpl.kt */
    public static final class a extends Lambda implements gzs<Logger> {
        public static final a i = new a(0);

        @Override // xsna.gzs
        public final Logger invoke() {
            yhe0 yhe0Var;
            VkpnsPushConfig vkpnsPushConfig = qxi.b;
            return (vkpnsPushConfig == null || (yhe0Var = vkpnsPushConfig.c) == null) ? new DefaultLogger("VkpnsPushProviderSdk") : yhe0Var;
        }
    }

    /* compiled from: WorkManagerRegistratorStubImpl.kt */
    public static final class b extends Lambda implements gzs<fzx0> {
        public static final b i = new b(0);

        @Override // xsna.gzs
        public final fzx0 invoke() {
            Logger logger = v6g0.a;
            return (fzx0) v6g0.w.getValue();
        }
    }

    @Override // com.vk.push.core.work.WorkRegistrator
    public final void cancelWork(String str, AsyncCallback asyncCallback) {
        Logger.DefaultImpls.info$default(f(), go9.b("WorkManagerRegistratorStubImpl cancel ", str), null, 2, null);
        if (str == null) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new TransferredIpcDataException("workName is null"), f());
            }
        } else if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Cancel work called with push provider sdk not being initialized"), f());
            }
        } else {
            if (asyncCallback == null) {
                return;
            }
            try {
                awx0 awx0Var = (awx0) ((fzx0) this.a.getValue()).d.getValue();
                if (awx0Var != null) {
                    awx0Var.c(str);
                }
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable unused) {
            }
            asyncCallback.onResult(AidlResult.Companion.success(WorkResult.SUCESSS));
        }
    }

    public final Logger f() {
        return (Logger) this.b.getValue();
    }

    @Override // com.vk.push.core.work.WorkRegistrator
    public final void registerWork(WorkModel workModel, AsyncCallback asyncCallback) {
        AidlResult<AidlException> failure;
        Logger.DefaultImpls.info$default(f(), "WorkManagerRegistratorStubImpl registering " + workModel, null, 2, null);
        if (workModel == null) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new TransferredIpcDataException("workModel is null"), f());
            }
        } else if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("RegisterWork called with push provider sdk not being initialized"), f());
            }
        } else {
            if (asyncCallback == null) {
                return;
            }
            try {
                failure = AidlResult.Companion.success(((fzx0) this.a.getValue()).a(workModel, true));
            } catch (Exception e) {
                failure = AidlResult.Companion.failure(e);
            }
            asyncCallback.onResult(failure);
        }
    }
}
