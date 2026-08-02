package xsna;

import com.vk.push.common.Logger;
import com.vk.push.common.exception.SdkIsNotInitializedException;
import com.vk.push.common.messaging.RemoteMessage;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.base.exception.TransferredIpcDataException;
import com.vk.push.core.push.PushClient;
import com.vk.push.core.utils.AidlExtensionsKt;
import com.vk.push.core.utils.BinderExtensionsKt;
import java.util.List;
import kotlin.Lazy;

/* loaded from: classes9.dex */
public final class rzy0 extends PushClient.Stub {
    public final Lazy a;
    public final Lazy b;
    public final Lazy e;

    public rzy0(bpn0 bpn0Var, bpn0 bpn0Var2, bpn0 bpn0Var3) {
        this.a = bpn0Var;
        this.b = bpn0Var2;
        this.e = bpn0Var3;
    }

    @Override // com.vk.push.core.push.PushClient
    public final void isPushTokenExist(String str, AsyncCallback asyncCallback) {
        boolean awaitInitialization$default = SdkInitAwaiter.awaitInitialization$default(ru.rustore.sdk.pushclient.a.h.w, 0L, 1, null);
        Lazy lazy = this.e;
        if (!awaitInitialization$default) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Is push token exist called with client sdk not being initialized"), (Logger) lazy.getValue());
            }
        } else {
            if (asyncCallback != null && str != null) {
                ((kfy0) this.b.getValue()).d(BinderExtensionsKt.getCallingIds(this), str, asyncCallback);
                return;
            }
            Logger.DefaultImpls.warn$default((Logger) lazy.getValue(), "Token or callback argument is null for some reason", null, 2, null);
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new TransferredIpcDataException("token is null"), (Logger) lazy.getValue());
            }
        }
    }

    @Override // com.vk.push.core.push.PushClient
    public final void onDeletedMessages(AsyncCallback asyncCallback) {
        boolean awaitInitialization$default = SdkInitAwaiter.awaitInitialization$default(ru.rustore.sdk.pushclient.a.h.w, 0L, 1, null);
        Lazy lazy = this.e;
        if (!awaitInitialization$default) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Delete messages called with client sdk not being initialized"), (Logger) lazy.getValue());
            }
        } else if (asyncCallback == null) {
            Logger.DefaultImpls.warn$default((Logger) lazy.getValue(), "Callback is null for some reason", null, 2, null);
        } else {
            ((kfy0) this.b.getValue()).e(asyncCallback, BinderExtensionsKt.getCallingIds(this));
        }
    }

    @Override // com.vk.push.core.push.PushClient
    public final void onMessagesReceived(List<RemoteMessage> list, AsyncCallback asyncCallback) {
        boolean awaitInitialization$default = SdkInitAwaiter.awaitInitialization$default(ru.rustore.sdk.pushclient.a.h.w, 0L, 1, null);
        Lazy lazy = this.e;
        if (!awaitInitialization$default) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Messages received called with client sdk not being initialized"), (Logger) lazy.getValue());
            }
        } else {
            if (list != null && !list.isEmpty() && asyncCallback != null) {
                ((nvy0) this.a.getValue()).b(BinderExtensionsKt.getCallingIds(this), list, asyncCallback);
                return;
            }
            Logger.DefaultImpls.warn$default((Logger) lazy.getValue(), "Callback or messages is null for some reason", null, 2, null);
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new TransferredIpcDataException("messages is null"), (Logger) lazy.getValue());
            }
        }
    }

    @Override // com.vk.push.core.push.PushClient
    public final void onTokenInvalidated(AsyncCallback asyncCallback) {
        boolean awaitInitialization$default = SdkInitAwaiter.awaitInitialization$default(ru.rustore.sdk.pushclient.a.h.w, 0L, 1, null);
        Lazy lazy = this.e;
        if (!awaitInitialization$default) {
            if (asyncCallback != null) {
                AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Token invalidated called with client sdk not being initialized"), (Logger) lazy.getValue());
            }
        } else if (asyncCallback == null) {
            Logger.DefaultImpls.warn$default((Logger) lazy.getValue(), "Callback is null for some reason", null, 2, null);
        } else {
            ((kfy0) this.b.getValue()).f(asyncCallback, BinderExtensionsKt.getCallingIds(this));
        }
    }
}
