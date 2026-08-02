package androidx.camera.extensions;

import android.content.Context;
import androidx.camera.extensions.impl.InitializerImpl;
import androidx.concurrent.futures.b;
import defpackage.a3c;
import defpackage.azo;
import defpackage.c94;
import defpackage.dyo;
import defpackage.euy;
import defpackage.geb1;
import defpackage.gl7;
import defpackage.grb1;
import defpackage.hsj0;
import defpackage.kzo;
import defpackage.lp7;
import defpackage.ni91;
import defpackage.ns7;
import defpackage.ny61;
import defpackage.pq7;
import defpackage.qwo;
import defpackage.sgb1;
import defpackage.v64;
import defpackage.ws7;
import defpackage.x4e;
import defpackage.xen;
import defpackage.xs7;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class a {
    public static final Object c = new Object();
    public static gl7 d;
    public static a e;
    public final ExtensionsManager$ExtensionsAvailability a;
    public final kzo b;

    public a(ExtensionsManager$ExtensionsAvailability extensionsManager$ExtensionsAvailability, ns7 ns7Var, Context context) {
        this.a = extensionsManager$ExtensionsAvailability;
        this.b = new kzo(ns7Var, context);
    }

    public static euy b(ns7 ns7Var, Context context) {
        a3c a3cVar = a3c.b;
        synchronized (c) {
            try {
                Context b = grb1.b(context);
                if (azo.b() == null) {
                    return ni91.f(c(ExtensionsManager$ExtensionsAvailability.NONE, ns7Var, b));
                }
                c94 c94Var = c94.x;
                if (!a3c.a(c94Var) && !azo.e(c94Var)) {
                    if (d == null) {
                        b bVar = new b();
                        bVar.c = new hsj0();
                        gl7 gl7Var = new gl7(bVar);
                        bVar.b = gl7Var;
                        bVar.a = x4e.class;
                        try {
                            e(a3cVar, b, ns7Var, bVar);
                            bVar.a = "Initialize extensions";
                        } catch (Exception e2) {
                            gl7Var.a(e2);
                        }
                        d = gl7Var;
                    }
                    return d;
                }
                return ni91.f(c(ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE, ns7Var, b));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static a c(ExtensionsManager$ExtensionsAvailability extensionsManager$ExtensionsAvailability, ns7 ns7Var, Context context) {
        synchronized (c) {
            try {
                a aVar = e;
                if (aVar != null) {
                    return aVar;
                }
                a aVar2 = new a(extensionsManager$ExtensionsAvailability, ns7Var, context);
                e = aVar2;
                return aVar2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void e(a3c a3cVar, final Context context, final ns7 ns7Var, final b bVar) {
        try {
            InitializerImpl.init(a3cVar.a.toString(), context, new InitializerImpl.OnExtensionsInitializedCallback() { // from class: androidx.camera.extensions.ExtensionsManager$1
                public void onFailure(int i) {
                    sgb1.d("ExtensionsManager", "Failed to initialize extensions");
                    b.this.b(a.c(ExtensionsManager$ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, ns7Var, context));
                }

                public void onSuccess() {
                    sgb1.g(3, "ExtensionsManager");
                    b.this.b(a.c(ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE, ns7Var, context));
                }
            }, geb1.b());
        } catch (AbstractMethodError | NoClassDefFoundError | NoSuchMethodError e2) {
            sgb1.d("ExtensionsManager", "Failed to initialize extensions. Some classes or methods are missed in the vendor library. " + e2);
            bVar.b(c(ExtensionsManager$ExtensionsAvailability.LIBRARY_UNAVAILABLE_MISSING_IMPLEMENTATION, ns7Var, context));
        } catch (RuntimeException e3) {
            sgb1.d("ExtensionsManager", "Failed to initialize extensions. Something wents wrong when initializing the vendor library. " + e3);
            bVar.b(c(ExtensionsManager$ExtensionsAvailability.LIBRARY_UNAVAILABLE_ERROR_LOADING, ns7Var, context));
        }
    }

    public final xs7 a(xs7 xs7Var) {
        if (this.a != ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE) {
            ny61.g("This device doesn't support extensions function! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
            return null;
        }
        final kzo kzoVar = this.b;
        kzoVar.getClass();
        ws7 ws7Var = new ws7(xs7Var.a);
        ws7Var.a.add(new dyo(":camera:camera-extensions-EXTENSION_MODE_NIGHT", ((xen) kzoVar.w).g(kzoVar.b)));
        if (ws7Var.a().a(((ns7) kzoVar.c).a()).isEmpty()) {
            ny61.g("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
            return null;
        }
        Iterator it = xs7Var.a.iterator();
        while (it.hasNext()) {
            if (((pq7) it.next()) instanceof dyo) {
                ny61.g("An extension is already applied to the base CameraSelector.");
                return null;
            }
        }
        final v64 v64Var = new v64(":camera:camera-extensions-EXTENSION_MODE_NIGHT");
        if (qwo.a(v64Var) == lp7.a) {
            lp7 lp7Var = new lp7() { // from class: jzo
                @Override // defpackage.lp7
                public final jp7 a(ar7 ar7Var, Context context) {
                    kzo kzoVar2 = kzo.this;
                    xen xenVar = (xen) kzoVar2.w;
                    boolean z = kzoVar2.b;
                    b731 g = xenVar.g(z);
                    g.l(ar7Var);
                    tzo tzoVar = new tzo(g);
                    yy40 b = yy40.b();
                    b.w(hzo.b, 3);
                    b.w(jp7.j1, tzoVar);
                    b.w(jp7.k1, v64Var);
                    b.w(jp7.n1, Boolean.TRUE);
                    b.w(jp7.o1, Boolean.valueOf(g.s()));
                    b.w(jp7.r1, Boolean.valueOf(g.j()));
                    b.w(jp7.l1, 1);
                    if (z) {
                        b.w(jp7.q1, new cge0().a != null ? new fp7(1) : jp7.s1);
                    }
                    m0r0 p = g.p(context);
                    if (p != null) {
                        b.w(jp7.m1, p);
                    }
                    return new hzo(b);
                }
            };
            synchronized (qwo.a) {
                qwo.b.put(v64Var, lp7Var);
            }
        }
        ws7 ws7Var2 = new ws7(xs7Var.a);
        ws7Var2.a.add(new dyo(":camera:camera-extensions-EXTENSION_MODE_NIGHT", ((xen) kzoVar.w).g(kzoVar.b)));
        return ws7Var2.a();
    }

    public final boolean d(xs7 xs7Var) {
        if (this.a != ExtensionsManager$ExtensionsAvailability.LIBRARY_AVAILABLE) {
            return false;
        }
        kzo kzoVar = this.b;
        kzoVar.getClass();
        new ws7(xs7Var.a).a.add(new dyo(":camera:camera-extensions-EXTENSION_MODE_NIGHT", ((xen) kzoVar.w).g(kzoVar.b)));
        return !r0.a().a(((ns7) kzoVar.c).a()).isEmpty();
    }
}
