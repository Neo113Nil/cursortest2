package xsna;

import com.vk.mail.auth.api.di.MailAuthComponent;
import com.vk.mail.auth.impl.di.MailAuthComponentFactory;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class sxg0 implements gzs<c8m<MailAuthComponent, pwj0>> {
    public final /* synthetic */ com.vk.mail.auth.api.di.a b;

    public sxg0(i7m i7mVar, com.vk.mail.auth.api.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final c8m<MailAuthComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = (c8m) new MailAuthComponentFactory();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
