package defpackage;

import androidx.webkit.internal.a;
import defpackage.kh41;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;

/* loaded from: classes10.dex */
public final class hh41 implements WebMessageCallbackBoundaryInterface {
    public final kh41.a a;

    public hh41(kh41.a aVar) {
        this.a = aVar;
    }

    @Override // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    public final String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    @Override // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public final void onMessage(InvocationHandler invocationHandler, InvocationHandler invocationHandler2) {
        ih41 b = gh41.b((WebMessageBoundaryInterface) ei6.a(WebMessageBoundaryInterface.class, invocationHandler2));
        if (b != null) {
            this.a.onMessage(new a(invocationHandler), b);
        }
    }
}
