package xsna;

import com.vk.auth.oauth.component.di.OAuthUiComponent;
import com.vk.auth.oauth.component.impl.di.OAuthUiComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class exg0 implements gzs<c8m<OAuthUiComponent, pwj0>> {
    public final /* synthetic */ com.vk.auth.oauth.component.di.a b;

    public exg0(i7m i7mVar, com.vk.auth.oauth.component.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final c8m<OAuthUiComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = new OAuthUiComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
