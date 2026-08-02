package xsna;

import com.vk.auth.suspicious_auth.SuspiciousAuthComponent;
import com.vk.auth.suspicious_auth.SuspiciousAuthComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class kxg0 implements gzs<c8m<SuspiciousAuthComponent, pwj0>> {
    public final /* synthetic */ com.vk.auth.suspicious_auth.a b;

    public kxg0(i7m i7mVar, com.vk.auth.suspicious_auth.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final c8m<SuspiciousAuthComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = new SuspiciousAuthComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
