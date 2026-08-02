package xsna;

import com.vk.superapp.verification.account.di.VerificationAccountComponent;
import com.vk.superapp.verification.account.di.VerificationAccountComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class rwg0 implements gzs<b7m<VerificationAccountComponent>> {
    public final /* synthetic */ com.vk.superapp.verification.account.di.a b;

    public rwg0(i7m i7mVar, com.vk.superapp.verification.account.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final b7m<VerificationAccountComponent> invoke() {
        Object failure;
        try {
            failure = new VerificationAccountComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (b7m) failure;
    }
}
