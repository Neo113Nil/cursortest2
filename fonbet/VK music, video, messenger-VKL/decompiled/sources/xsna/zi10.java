package xsna;

import android.os.Parcelable;
import android.os.RemoteException;
import com.vk.push.common.Logger;
import com.vk.push.common.exception.SdkIsNotInitializedException;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.hostinfo.MasterElections;
import com.vk.push.core.utils.AidlExtensionsKt;
import com.vk.push.core.utils.BinderExtensionsKt;
import kotlin.Lazy;
import kotlin.jvm.internal.Lambda;

/* compiled from: MasterElectionsStubImpl.kt */
/* loaded from: classes5.dex */
public final class zi10 extends MasterElections.Stub {
    public static final /* synthetic */ int e = 0;
    public final Lazy a;
    public final Lazy b;

    /* compiled from: MasterElectionsStubImpl.kt */
    public static final class a extends Lambda implements izs<AidlResult<? extends Parcelable>, s3q0> {
        final /* synthetic */ AsyncCallback $callback;
        final /* synthetic */ zi10 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AsyncCallback asyncCallback, zi10 zi10Var) {
            super(1);
            this.$callback = asyncCallback;
            this.this$0 = zi10Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(AidlResult<? extends Parcelable> aidlResult) {
            AidlResult<? extends Parcelable> aidlResult2 = aidlResult;
            AsyncCallback asyncCallback = this.$callback;
            zi10 zi10Var = this.this$0;
            try {
                asyncCallback.onResult(aidlResult2);
            } catch (RemoteException e) {
                int i = zi10.e;
                zi10Var.f().warn("get host info has failed", e);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MasterElectionsStubImpl.kt */
    public static final class b extends Lambda implements izs<AidlResult<? extends Parcelable>, s3q0> {
        final /* synthetic */ AsyncCallback $callback;
        final /* synthetic */ zi10 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AsyncCallback asyncCallback, zi10 zi10Var) {
            super(1);
            this.$callback = asyncCallback;
            this.this$0 = zi10Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(AidlResult<? extends Parcelable> aidlResult) {
            AidlResult<? extends Parcelable> aidlResult2 = aidlResult;
            AsyncCallback asyncCallback = this.$callback;
            zi10 zi10Var = this.this$0;
            try {
                asyncCallback.onResult(aidlResult2);
            } catch (RemoteException e) {
                int i = zi10.e;
                zi10Var.f().warn("send request to get master has failed", e);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MasterElectionsStubImpl.kt */
    public static final class c extends Lambda implements izs<AidlResult<? extends Parcelable>, s3q0> {
        final /* synthetic */ AsyncCallback $callback;
        final /* synthetic */ zi10 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AsyncCallback asyncCallback, zi10 zi10Var) {
            super(1);
            this.$callback = asyncCallback;
            this.this$0 = zi10Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(AidlResult<? extends Parcelable> aidlResult) {
            AidlResult<? extends Parcelable> aidlResult2 = aidlResult;
            AsyncCallback asyncCallback = this.$callback;
            zi10 zi10Var = this.this$0;
            try {
                asyncCallback.onResult(aidlResult2);
            } catch (RemoteException e) {
                int i = zi10.e;
                zi10Var.f().warn("send request to notifier has failed", e);
            }
            return s3q0.a;
        }
    }

    /* compiled from: MasterElectionsStubImpl.kt */
    public static final class d extends Lambda implements izs<AidlResult<? extends Parcelable>, s3q0> {
        final /* synthetic */ AsyncCallback $callback;
        final /* synthetic */ zi10 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AsyncCallback asyncCallback, zi10 zi10Var) {
            super(1);
            this.$callback = asyncCallback;
            this.this$0 = zi10Var;
        }

        @Override // xsna.izs
        public final s3q0 invoke(AidlResult<? extends Parcelable> aidlResult) {
            AidlResult<? extends Parcelable> aidlResult2 = aidlResult;
            AsyncCallback asyncCallback = this.$callback;
            zi10 zi10Var = this.this$0;
            try {
                asyncCallback.onResult(aidlResult2);
            } catch (RemoteException e) {
                int i = zi10.e;
                zi10Var.f().warn("send request to initiate elections has failed", e);
            }
            return s3q0.a;
        }
    }

    public zi10(Lazy<? extends gk10> lazy, Lazy<? extends Logger> lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    public final Logger f() {
        return (Logger) this.b.getValue();
    }

    @Override // com.vk.push.core.hostinfo.MasterElections
    public final void getHostInfo(AsyncCallback asyncCallback) {
        if (SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
            if (asyncCallback == null) {
                return;
            }
            ((gk10) this.a.getValue()).b(new a(asyncCallback, this));
        } else if (asyncCallback != null) {
            AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Get host info called with host sdk not being initialized"), f());
        }
    }

    @Override // com.vk.push.core.hostinfo.MasterElections
    public final void getMaster(AsyncCallback asyncCallback) {
        if (SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
            if (asyncCallback == null) {
                return;
            }
            ((gk10) this.a.getValue()).c(BinderExtensionsKt.getCallingIds(this), new b(asyncCallback, this));
        } else if (asyncCallback != null) {
            AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Get master called with host sdk not being initialized"), f());
        }
    }

    @Override // com.vk.push.core.hostinfo.MasterElections
    public final void notifyOldMaster(String str, AsyncCallback asyncCallback) {
        if (SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
            if (asyncCallback == null) {
                return;
            }
            ((gk10) this.a.getValue()).a(BinderExtensionsKt.getCallingIds(this), str, new c(asyncCallback, this));
        } else if (asyncCallback != null) {
            AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Notify old master called with host sdk not being initialized"), f());
        }
    }

    @Override // com.vk.push.core.hostinfo.MasterElections
    public final void sendRequestToInitiateElections(AsyncCallback asyncCallback) {
        if (SdkInitAwaiter.awaitInitialization$default(e5w0.z, 0L, 1, null)) {
            if (asyncCallback == null) {
                return;
            }
            ((gk10) this.a.getValue()).d(BinderExtensionsKt.getCallingIds(this), new d(asyncCallback, this));
        } else if (asyncCallback != null) {
            AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Send elections request called with host sdk not being initialized"), f());
        }
    }
}
