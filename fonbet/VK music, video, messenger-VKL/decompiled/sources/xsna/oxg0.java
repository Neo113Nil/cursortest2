package xsna;

import com.vk.trustedhash.di.TrustedHashComponent;
import com.vk.trustedhash.di.TrustedHashComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class oxg0 implements gzs<c8m<TrustedHashComponent, pwj0>> {
    public final /* synthetic */ c8m b;

    public oxg0(i7m i7mVar, c8m c8mVar) {
        this.b = c8mVar;
    }

    @Override // xsna.gzs
    public final c8m<TrustedHashComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = new TrustedHashComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
