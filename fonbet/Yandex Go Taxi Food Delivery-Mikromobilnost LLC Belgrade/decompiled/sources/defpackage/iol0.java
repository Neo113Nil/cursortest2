package defpackage;

import android.webkit.SafeBrowsingResponse;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes10.dex */
public final class iol0 extends hol0 {
    public SafeBrowsingResponse a;
    public SafeBrowsingResponseBoundaryInterface b;

    @Override // defpackage.hol0
    public final void a(boolean z) {
        qp41.p.getClass();
        d().backToSafety(z);
    }

    @Override // defpackage.hol0
    public final void b(boolean z) {
        qp41.q.getClass();
        d().proceed(z);
    }

    @Override // defpackage.hol0
    public final void c(boolean z) {
        qp41.r.getClass();
        d().showInterstitial(z);
    }

    public final SafeBrowsingResponse d() {
        if (this.a == null) {
            aj31 aj31Var = mq41.a;
            this.a = (SafeBrowsingResponse) ((WebkitToCompatConverterBoundaryInterface) aj31Var.b).convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }
}
