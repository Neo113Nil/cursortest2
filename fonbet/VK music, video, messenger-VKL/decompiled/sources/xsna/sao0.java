package xsna;

import android.os.Parcelable;
import android.os.RemoteException;
import com.vk.push.common.Logger;
import com.vk.push.common.exception.SdkIsNotInitializedException;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.test.TestPushPayload;
import com.vk.push.core.test.TestPushProvider;
import com.vk.push.core.utils.AidlExtensionsKt;
import com.vk.push.core.utils.BinderExtensionsKt;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;

/* compiled from: TestPushProviderStubImpl.kt */
/* loaded from: classes5.dex */
public final class sao0 extends TestPushProvider.Stub {
    public static final /* synthetic */ int f = 0;
    public final Lazy a;
    public final Lazy b;
    public final Lazy e;

    /* compiled from: TestPushProviderStubImpl.kt */
    public static final class a extends Lambda implements izs<AidlResult<? extends Parcelable>, s3q0> {
        final /* synthetic */ AsyncCallback $callback;
        final /* synthetic */ sao0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AsyncCallback asyncCallback, sao0 sao0Var) {
            super(1);
            this.$callback = asyncCallback;
            this.this$0 = sao0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(AidlResult<? extends Parcelable> aidlResult) {
            AidlResult<? extends Parcelable> aidlResult2 = aidlResult;
            AsyncCallback asyncCallback = this.$callback;
            sao0 sao0Var = this.this$0;
            try {
                asyncCallback.onResult(aidlResult2);
            } catch (RemoteException e) {
                int i = sao0.f;
                sao0Var.f().warn("Test get intermediate token has failed", e);
            }
            return s3q0.a;
        }
    }

    /* compiled from: TestPushProviderStubImpl.kt */
    public static final class b extends Lambda implements izs<AidlResult<? extends Parcelable>, s3q0> {
        final /* synthetic */ AsyncCallback $callback;
        final /* synthetic */ sao0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AsyncCallback asyncCallback, sao0 sao0Var) {
            super(1);
            this.$callback = asyncCallback;
            this.this$0 = sao0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(AidlResult<? extends Parcelable> aidlResult) {
            AidlResult<? extends Parcelable> aidlResult2 = aidlResult;
            AsyncCallback asyncCallback = this.$callback;
            sao0 sao0Var = this.this$0;
            try {
                asyncCallback.onResult(aidlResult2);
            } catch (RemoteException e) {
                int i = sao0.f;
                sao0Var.f().warn("Test register for pushes has failed", e);
            }
            return s3q0.a;
        }
    }

    /* compiled from: TestPushProviderStubImpl.kt */
    public static final class c extends Lambda implements izs<AidlResult<? extends Parcelable>, s3q0> {
        final /* synthetic */ AsyncCallback $callback;
        final /* synthetic */ sao0 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AsyncCallback asyncCallback, sao0 sao0Var) {
            super(1);
            this.$callback = asyncCallback;
            this.this$0 = sao0Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(AidlResult<? extends Parcelable> aidlResult) {
            AidlResult<? extends Parcelable> aidlResult2 = aidlResult;
            AsyncCallback asyncCallback = this.$callback;
            sao0 sao0Var = this.this$0;
            try {
                asyncCallback.onResult(aidlResult2);
            } catch (RemoteException e) {
                int i = sao0.f;
                sao0Var.f().warn("Test send push has failed", e);
            }
            return s3q0.a;
        }
    }

    public sao0(bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3) {
        this.a = bpn0Var;
        this.b = bpn0Var2;
        this.e = bpn0Var3;
    }

    public final Logger f() {
        return (Logger) this.e.getValue();
    }

    @Override // com.vk.push.core.test.TestPushProvider
    public final void getIntermediateToken(AsyncCallback asyncCallback) {
        if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Test get intermediate token called with host sdk not being initialized"), f());
            }
        } else {
            if (asyncCallback == null) {
                return;
            }
            Logger.DefaultImpls.info$default(f(), "receive IPC getIntermediateToken", null, 2, null);
            ((iji0) this.a.getValue()).b(new a(asyncCallback, this));
        }
    }

    @Override // com.vk.push.core.test.TestPushProvider
    public final void registerForPushes(String str, String str2, AsyncCallback asyncCallback) {
        if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Test register for pushes called with host sdk not being initialized"), f());
                return;
            }
            return;
        }
        Logger.DefaultImpls.info$default(f(), "receive IPC registerForPushes", null, 2, null);
        if (str == null || str.length() == 0 || str2 == null || str2.length() == 0 || asyncCallback == null) {
            Logger.DefaultImpls.warn$default(f(), "One or more arguments is null for some reason", null, 2, null);
        } else {
            ((fqf0) this.b.getValue()).a(BinderExtensionsKt.getCallingIds(this), str, str2, new b(asyncCallback, this));
        }
    }

    @Override // com.vk.push.core.test.TestPushProvider
    public final void sendTestPush(String str, TestPushPayload testPushPayload, AsyncCallback asyncCallback) {
        if (!SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Send test push called with host sdk not being initialized"), f());
                return;
            }
            return;
        }
        Logger.DefaultImpls.info$default(f(), "receive IPC sendTestPush", null, 2, null);
        if (str == null || str.length() == 0 || testPushPayload == null || asyncCallback == null) {
            Logger.DefaultImpls.warn$default(f(), "One or more arguments is null for some reason", null, 2, null);
        } else {
            ((iji0) this.a.getValue()).a(str, testPushPayload, new c(asyncCallback, this));
        }
    }
}
