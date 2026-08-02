package xsna;

import com.vk.auth.captcha.api.di.CaptchaComponent;
import com.vk.auth.captcha.impl.di.CaptchaComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class twg0 implements gzs<b7m<CaptchaComponent>> {
    public final /* synthetic */ com.vk.auth.captcha.api.di.a b;

    public twg0(i7m i7mVar, com.vk.auth.captcha.api.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final b7m<CaptchaComponent> invoke() {
        Object failure;
        try {
            failure = new CaptchaComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (b7m) failure;
    }
}
