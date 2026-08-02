package defpackage;

import android.webkit.ServiceWorkerController;
import android.webkit.ServiceWorkerWebSettings;
import androidx.webkit.internal.FrameworkServiceWorkerClient;
import org.chromium.support_lib_boundary.ServiceWorkerControllerBoundaryInterface;

/* loaded from: classes10.dex */
public class nxq0 extends mxq0 {
    public ServiceWorkerController a;
    public final ServiceWorkerControllerBoundaryInterface b;
    public final pxq0 c;

    public nxq0() {
        qp41.h.getClass();
        ServiceWorkerController serviceWorkerController = ServiceWorkerController.getInstance();
        this.a = serviceWorkerController;
        this.b = null;
        if (serviceWorkerController == null) {
            this.a = ServiceWorkerController.getInstance();
        }
        ServiceWorkerWebSettings serviceWorkerWebSettings = this.a.getServiceWorkerWebSettings();
        pxq0 pxq0Var = new pxq0();
        pxq0Var.a = serviceWorkerWebSettings;
        this.c = pxq0Var;
    }

    @Override // defpackage.mxq0
    public final pxq0 a() {
        return this.c;
    }

    @Override // defpackage.mxq0
    public final void b(kxq0 kxq0Var) {
        qp41.h.getClass();
        ServiceWorkerController serviceWorkerController = this.a;
        if (kxq0Var == null) {
            if (serviceWorkerController == null) {
                this.a = ServiceWorkerController.getInstance();
            }
            this.a.setServiceWorkerClient(null);
        } else {
            if (serviceWorkerController == null) {
                this.a = ServiceWorkerController.getInstance();
            }
            this.a.setServiceWorkerClient(new FrameworkServiceWorkerClient(kxq0Var));
        }
    }
}
