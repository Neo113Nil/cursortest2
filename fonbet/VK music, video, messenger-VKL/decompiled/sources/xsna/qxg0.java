package xsna;

import com.vk.passkey.api.di.PasskeyComponent;
import com.vk.passkey.di.PasskeyComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class qxg0 implements gzs<c8m<PasskeyComponent, pwj0>> {
    public final /* synthetic */ com.vk.passkey.api.di.a b;
    public final /* synthetic */ xxg0 c;

    public qxg0(i7m i7mVar, com.vk.passkey.api.di.a aVar, xxg0 xxg0Var) {
        this.b = aVar;
        this.c = xxg0Var;
    }

    @Override // xsna.gzs
    public final c8m<PasskeyComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = new PasskeyComponentImpl.a(this.c.a);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
