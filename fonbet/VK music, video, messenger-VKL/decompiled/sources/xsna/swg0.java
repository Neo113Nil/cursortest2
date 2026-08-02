package xsna;

import com.vk.confirmaccount.api.di.ConfirmAccountComponent;
import com.vk.confirmaccount.impl.di.ConfirmAccountComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class swg0 implements gzs<b7m<ConfirmAccountComponent>> {
    public final /* synthetic */ com.vk.confirmaccount.api.di.a b;

    public swg0(i7m i7mVar, com.vk.confirmaccount.api.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final b7m<ConfirmAccountComponent> invoke() {
        Object failure;
        try {
            failure = new ConfirmAccountComponentImpl.a();
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (b7m) failure;
    }
}
