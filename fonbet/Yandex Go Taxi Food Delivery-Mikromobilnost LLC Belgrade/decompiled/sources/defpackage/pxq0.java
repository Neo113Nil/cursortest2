package defpackage;

import android.webkit.ServiceWorkerWebSettings;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.WebkitToCompatConverterBoundaryInterface;

/* loaded from: classes10.dex */
public final class pxq0 extends oxq0 {
    public ServiceWorkerWebSettings a;

    public final ServiceWorkerWebSettings a() {
        if (this.a == null) {
            aj31 aj31Var = mq41.a;
            this.a = (ServiceWorkerWebSettings) ((WebkitToCompatConverterBoundaryInterface) aj31Var.b).convertServiceWorkerSettings(Proxy.getInvocationHandler(null));
        }
        return this.a;
    }
}
