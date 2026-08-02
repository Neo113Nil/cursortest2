package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
import xsna.xrz0;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class rcz0 {
    public final ArrayList a = new ArrayList();
    public final AtomicReference b = new AtomicReference();
    public a c = null;
    public xrz0 d = null;
    public t8z0 e = null;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public static final class a {
        public final String a;
        public boolean b = false;

        public a(pjz0 pjz0Var) {
            this.a = pjz0Var.c;
        }
    }

    public final a a(pjz0 pjz0Var, float f) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.a.equals(pjz0Var.c) && b920.b(-1.0f, f) == 0) {
                return aVar;
            }
        }
        return null;
    }

    public final synchronized void b(pjz0 pjz0Var, float f, udz0 udz0Var, xrz0.a aVar, t8z0 t8z0Var) {
        xrz0 xrz0Var = new xrz0(pjz0Var, f, udz0Var, Collections.unmodifiableList(pjz0Var.d), aVar, this.b);
        a a2 = a(pjz0Var, f);
        if (a2 == null || a2.b) {
            t8z0Var.accept(xrz0Var);
            return;
        }
        gu8.c(null, "LoadPlayCoordinator: play will be started after loading section " + pjz0Var.c + ", point " + f);
        this.c = a2;
        this.d = xrz0Var;
        this.e = t8z0Var;
    }

    public final synchronized void c(xrz0 xrz0Var) {
        xrz0Var.e = true;
        if (xrz0Var == this.d) {
            this.d = null;
            this.e = null;
        }
    }
}
