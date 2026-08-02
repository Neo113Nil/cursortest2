package xsna;

import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.multiaccount.impl.MultiAccountComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class vxg0 implements gzs<c8m<MultiAccountComponent, pwj0>> {
    public final /* synthetic */ com.vk.superapp.multiaccount.api.b b;

    public vxg0(i7m i7mVar, com.vk.superapp.multiaccount.api.b bVar) {
        this.b = bVar;
    }

    @Override // xsna.gzs
    public final c8m<MultiAccountComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = new MultiAccountComponentImpl.a(wxg0.b);
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
