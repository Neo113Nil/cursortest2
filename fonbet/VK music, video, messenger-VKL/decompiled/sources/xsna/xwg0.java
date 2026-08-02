package xsna;

import com.vk.odnoklassniki.registration.OkRegistrationComponent;
import com.vk.odnoklassniki.registration.di.OkRegistrationComponentImpl;
import kotlin.LazyThreadSafetyMode;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class xwg0 implements gzs<b7m<OkRegistrationComponent>> {
    public final /* synthetic */ com.vk.odnoklassniki.registration.a b;

    public xwg0(i7m i7mVar, com.vk.odnoklassniki.registration.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final b7m<OkRegistrationComponent> invoke() {
        Object failure;
        try {
            failure = (b7m) new OkRegistrationComponentImpl.Factory(msy.a(LazyThreadSafetyMode.NONE, qwg0.b));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (b7m) failure;
    }
}
