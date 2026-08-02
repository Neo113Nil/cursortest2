package xsna;

import com.vk.auth.smartflow.impl.mail.MailSmartflowComponentImpl;
import com.vk.auth.smartflow.mail.MailSmartflowComponent;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class nxg0 implements gzs<c8m<MailSmartflowComponent, pwj0>> {
    public final /* synthetic */ com.vk.auth.smartflow.mail.a b;

    public nxg0(i7m i7mVar, com.vk.auth.smartflow.mail.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final c8m<MailSmartflowComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = new MailSmartflowComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
