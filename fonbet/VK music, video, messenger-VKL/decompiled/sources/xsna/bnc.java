package xsna;

import android.app.Activity;
import com.vk.bridges.di.BridgeComponent;

/* compiled from: ClipClickInterceptorImpl.kt */
/* loaded from: classes17.dex */
public final class bnc implements anc {
    public final BridgeComponent a;

    public bnc(BridgeComponent bridgeComponent) {
        this.a = bridgeComponent;
    }

    @Override // xsna.anc
    public final void a(Activity activity, gzs<s3q0> gzsVar) {
        d(activity, gzsVar);
    }

    @Override // xsna.anc
    public final void b(Activity activity, v40 v40Var) {
        d(activity, v40Var);
    }

    @Override // xsna.anc
    public final void c(Activity activity, com.vk.movika.sdk.base.flow.binding.l lVar) {
        d(activity, lVar);
    }

    public final void d(Activity activity, gzs<s3q0> gzsVar) {
        if (this.a.x().k0().a(activity)) {
            return;
        }
        gzsVar.invoke();
    }
}
