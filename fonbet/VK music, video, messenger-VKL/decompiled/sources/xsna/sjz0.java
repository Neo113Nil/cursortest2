package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class sjz0 {
    public final pjz0 a;
    public final udz0 b;
    public final jjz0 c;
    public iaz0 d = null;

    public sjz0(pjz0 pjz0Var, udz0 udz0Var, jjz0 jjz0Var) {
        this.a = pjz0Var;
        this.b = udz0Var;
        this.c = jjz0Var;
    }

    public final String a() {
        StringBuilder sb = new StringBuilder();
        pjz0 pjz0Var = this.a;
        sb.append(pjz0Var.c);
        sb.append(pjz0Var.k() ? " point=-1.0" : "");
        return sb.toString();
    }

    public final void b(List list) {
        this.d = null;
        this.b.d(10000, a());
        if (ijz0.a(this.c.b, list, new fhb0(this, 19))) {
            return;
        }
        this.d = iaz0.c;
        c();
    }

    public final void c() {
        iaz0 iaz0Var = this.d;
        pjz0 pjz0Var = this.a;
        if (iaz0Var == null) {
            int i = pjz0Var.b;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3 && i != 4) {
                        iaz0Var = iaz0.w;
                    }
                } else if (pjz0Var.b(-1.0f).isEmpty()) {
                    iaz0Var = iaz0.j;
                }
            }
            if (Collections.unmodifiableList(pjz0Var.d).isEmpty()) {
                iaz0Var = iaz0.j;
            }
        }
        udz0 udz0Var = this.b;
        if (iaz0Var == null) {
            udz0Var.d(10001, a());
        } else {
            udz0Var.b(0, 10002, a() + ": " + iaz0Var);
        }
        this.c.a(iaz0Var, pjz0Var);
    }

    public final void d() {
        pjz0 pjz0Var = this.a;
        ArrayList arrayList = pjz0Var.e;
        jkz0 jkz0Var = arrayList.size() > 0 ? (jkz0) arrayList.remove(0) : null;
        if (jkz0Var == null) {
            c();
            return;
        }
        if (pjz0Var.k()) {
            gu8.c(null, "InstreamAdEngine: Using doAfter service for point - -1.0");
        } else {
            qjk0.a(new StringBuilder("InstreamAdEngine: Loading doAfter service - "), jkz0Var.a, null);
        }
        if (pjz0Var.k()) {
            jkz0Var.v = true;
            jkz0Var.s = -1.0f;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(jkz0Var);
        b(arrayList2);
    }

    public final void e() {
        pjz0 pjz0Var = this.a;
        List g = pjz0Var.k() ? pjz0Var.g(-1.0f) : Collections.EMPTY_LIST;
        if (g.isEmpty()) {
            d();
        } else {
            gu8.c(null, "InstreamAdEngine: Loading midpoint services for point - -1.0");
            b(g);
        }
    }
}
