package xsna;

import com.vk.mail.auth.contract.di.MailAuthInternalComponent;
import com.vk.mail.auth.impl.di.internal.component.MailAuthInternalComponentFactory;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class txg0 implements gzs<c8m<MailAuthInternalComponent, pwj0>> {
    public final /* synthetic */ com.vk.mail.auth.contract.di.e b;

    public txg0(i7m i7mVar, com.vk.mail.auth.contract.di.e eVar) {
        this.b = eVar;
    }

    @Override // xsna.gzs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c8m<MailAuthInternalComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = (c8m) new MailAuthInternalComponentFactory();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
