package xsna;

import com.vk.push.common.Logger;
import com.vk.push.common.exception.SdkIsNotInitializedException;
import com.vk.push.core.auth.Auth;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.base.SdkInitAwaiter;
import com.vk.push.core.utils.AidlExtensionsKt;
import com.vk.push.core.utils.BinderExtensionsKt;
import kotlin.Lazy;

/* compiled from: AuthStubImpl.kt */
/* loaded from: classes5.dex */
public final class m65 extends Auth.Stub {
    public final Lazy a;
    public final Lazy b;

    public m65(Lazy<? extends n65> lazy, Lazy<? extends Logger> lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    @Override // com.vk.push.core.auth.Auth
    public final void getIntermediateToken(AsyncCallback asyncCallback) {
        if (SdkInitAwaiter.awaitInitialization$default(b4w0.F, 0L, 1, null)) {
            if (asyncCallback == null) {
                return;
            }
            ((n65) this.a.getValue()).c(asyncCallback, BinderExtensionsKt.getCallingIds(this));
        } else if (asyncCallback != null) {
            AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Get intermediate token called with auth sdk not being initialized"), (Logger) this.b.getValue());
        }
    }

    @Override // com.vk.push.core.auth.Auth
    public final void isUserAuthorized(AsyncCallback asyncCallback) {
        if (SdkInitAwaiter.awaitInitialization$default(b4w0.F, 0L, 1, null)) {
            if (asyncCallback == null) {
                return;
            }
            ((n65) this.a.getValue()).a(asyncCallback, BinderExtensionsKt.getCallingIds(this));
        } else if (asyncCallback != null) {
            AidlExtensionsKt.safeOnResult(asyncCallback, new SdkIsNotInitializedException("Is user authorized called with auth sdk not being initialized"), (Logger) this.b.getValue());
        }
    }
}
