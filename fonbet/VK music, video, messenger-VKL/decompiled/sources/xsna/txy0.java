package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import xsna.z8y0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class txy0 implements Runnable {
    public final saz0 b = saz0.b(10000);
    public final idy0 c;
    public final ArrayList d;
    public final Map e;
    public volatile x8y0 f;
    public volatile int g;

    public txy0(String str, ArrayList arrayList, idy0 idy0Var, x8y0 x8y0Var) {
        this.d = arrayList;
        this.c = idy0Var;
        this.f = x8y0Var;
        this.g = arrayList.size();
        this.e = this.g == 0 ? Collections.EMPTY_MAP : new HashMap();
    }

    public final void a() {
        synchronized (this) {
            try {
                x8y0 x8y0Var = this.f;
                if (x8y0Var == null) {
                    gu8.c(null, "MediationParamsLoader: onResult has already been called");
                    return;
                }
                this.f = null;
                final Map map = this.e;
                final z8y0.a aVar = x8y0Var.a;
                final String str = x8y0Var.b;
                final u6z0 u6z0Var = x8y0Var.c;
                final s3z0 s3z0Var = x8y0Var.d;
                final idy0 idy0Var = x8y0Var.e;
                final m8z0 m8z0Var = x8y0Var.f;
                o8z0.a(new Runnable() { // from class: xsna.y8y0
                    @Override // java.lang.Runnable
                    public final void run() {
                        z8y0.a aVar2 = z8y0.a.this;
                        aVar2.getClass();
                        gu8.c(null, "DefaultAdServiceBuilder: mediation params is loaded");
                        aVar2.d(str, u6z0Var, map, s3z0Var, idy0Var, m8z0Var);
                    }
                });
                this.b.close();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        gu8.c(null, "MediationParamsLoader: loading timeout");
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            ((qg0) it.next()).b();
        }
        a();
    }
}
