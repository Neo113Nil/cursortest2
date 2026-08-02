package xsna;

import com.vk.silentauthbylogin.di.SilentAuthByLoginComponent;
import com.vk.silentauthbylogin.di.SilentAuthByLoginComponentImpl;
import kotlin.Result;

/* compiled from: SDKDependencyGraphHelper.kt */
/* loaded from: classes11.dex */
public final class pxg0 implements gzs<c8m<SilentAuthByLoginComponent, pwj0>> {
    public final /* synthetic */ com.vk.silentauthbylogin.di.a b;

    public pxg0(i7m i7mVar, com.vk.silentauthbylogin.di.a aVar) {
        this.b = aVar;
    }

    @Override // xsna.gzs
    public final c8m<SilentAuthByLoginComponent, pwj0> invoke() {
        Object failure;
        try {
            failure = new SilentAuthByLoginComponentImpl.a(new bpn0(bse0.d));
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (failure instanceof Result.Failure) {
            failure = this.b;
        }
        return (c8m) failure;
    }
}
