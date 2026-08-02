package xsna;

import com.vk.qr.auth.di.QrAuthComponent;
import com.vk.qr.auth.di.QrAuthComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class ixg0 implements gzs<c8m<QrAuthComponent, pwj0>> {
    public final /* synthetic */ c8m b;

    public ixg0(i7m i7mVar, c8m c8mVar) {
        this.b = c8mVar;
    }

    @Override // xsna.gzs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c8m<QrAuthComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = (c8m) new QrAuthComponentImpl.Factory();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
