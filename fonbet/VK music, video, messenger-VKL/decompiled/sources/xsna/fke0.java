package xsna;

import com.vk.push.common.Logger;
import com.vk.push.common.exception.SdkIsNotInitializedException;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.base.exception.TransferredIpcDataException;
import com.vk.push.core.push.PushProvider;
import com.vk.push.core.utils.AidlExtensionsKt;
import com.vk.push.core.utils.BinderExtensionsKt;
import kotlin.Lazy;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: PushProviderStubImpl.kt */
/* loaded from: classes5.dex */
public final class fke0 extends PushProvider.Stub {
    public final Lazy a;
    public final Lazy b;

    /* compiled from: PushProviderStubImpl.kt */
    public /* synthetic */ class a extends FunctionReferenceImpl implements izs<AidlResult, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(AidlResult aidlResult) {
            ((AsyncCallback) this.receiver).onResult(aidlResult);
            return s3q0.a;
        }
    }

    public fke0(Lazy<? extends fqf0> lazy, Lazy<? extends Logger> lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    @Override // com.vk.push.core.push.PushProvider
    public final void registerForPushes(String str, String str2, AsyncCallback asyncCallback) {
        boolean awaitInitialization$default = SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null);
        Lazy lazy = this.b;
        if (!awaitInitialization$default) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Register for pushes called with host sdk not being initialized"), (Logger) lazy.getValue());
                return;
            }
            return;
        }
        Logger.DefaultImpls.info$default((Logger) lazy.getValue(), "IPC registerForPushes", null, 2, null);
        if (str != null && str.length() != 0 && str2 != null && str2.length() != 0 && asyncCallback != null) {
            ((fqf0) this.a.getValue()).a(BinderExtensionsKt.getCallingIds(this), str, str2, new a(1, asyncCallback, AsyncCallback.class, "onResult", "onResult(Lcom/vk/push/core/base/AidlResult;)V", 0));
            return;
        }
        Logger.DefaultImpls.warn$default((Logger) lazy.getValue(), "One or more arguments is null for some reason", null, 2, null);
        if (asyncCallback != null) {
            AidlExtensionsKt.safeOnResult(asyncCallback, new TransferredIpcDataException("push token or project id is null"), (Logger) lazy.getValue());
        }
    }
}
