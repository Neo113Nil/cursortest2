package xsna;

import com.vk.emailforwarding.api.di.EmailForwardingComponent;
import com.vk.emailforwarding.di.EmailForwardingComponentFactory;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class hxg0 implements gzs<c8m<EmailForwardingComponent, pwj0>> {
    public final /* synthetic */ com.vk.emailforwarding.api.di.a b;

    public hxg0(i7m i7mVar, com.vk.emailforwarding.api.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c8m<EmailForwardingComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = (c8m) new EmailForwardingComponentFactory();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
