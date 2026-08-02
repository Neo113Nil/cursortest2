package xsna;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class xrz0 {
    public final a a;
    public final udz0 b;
    public final pjz0 c;
    public final float d;
    public volatile boolean e;
    public boolean f;
    public int g;
    public int h;
    public List i;
    public final AtomicReference j;

    /* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
    public interface a {
        void a();

        void a(xrz0 xrz0Var, boolean z);

        boolean b(ArrayList arrayList, ga40 ga40Var);

        void c(lgz0 lgz0Var);

        void d(lgz0 lgz0Var);
    }

    public xrz0(pjz0 pjz0Var, float f, udz0 udz0Var, List list, a aVar, AtomicReference atomicReference) {
        atomicReference.set(this);
        this.c = pjz0Var;
        this.d = f;
        this.b = udz0Var;
        this.a = aVar;
        this.i = list;
        this.j = atomicReference;
        this.e = false;
        this.f = false;
        this.g = pjz0Var.i;
        this.h = -1;
    }

    public final String a() {
        String str;
        StringBuilder sb = new StringBuilder();
        pjz0 pjz0Var = this.c;
        sb.append(pjz0Var.c);
        if (pjz0Var.k()) {
            str = " point=" + this.d;
        } else {
            str = "";
        }
        sb.append(str);
        return sb.toString();
    }

    public final void b(boolean z) {
        if (this.c.k()) {
            this.c.i = this.g;
        }
        if (this.f || this.e) {
            return;
        }
        this.a.a(this, z);
        this.f = true;
    }

    public final void c() {
        pjz0 pjz0Var = this.c;
        ArrayList arrayList = pjz0Var.e;
        jkz0 jkz0Var = arrayList.size() > 0 ? (jkz0) arrayList.remove(0) : null;
        if (jkz0Var == null) {
            b(true);
            return;
        }
        boolean k = pjz0Var.k();
        float f = this.d;
        if (k) {
            gu8.c(null, "InstreamAdEngine: Using doAfter service for point - " + f);
        } else {
            qjk0.a(new StringBuilder("InstreamAdEngine: Loading doAfter service - "), jkz0Var.a, null);
        }
        if (pjz0Var.k()) {
            jkz0Var.v = true;
            jkz0Var.s = f;
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(jkz0Var);
        this.b.d(10000, a());
        if (this.a.b(arrayList2, new ga40(this, 23))) {
            return;
        }
        b(false);
    }

    public final void d() {
        pjz0 pjz0Var = this.c;
        float f = this.d;
        ArrayList b = pjz0Var.b(f);
        int size = b.size();
        if (size > 0 && this.h < size - 1) {
            this.i = b;
            e();
            return;
        }
        ArrayList g = pjz0Var.g(f);
        if (g.isEmpty()) {
            gu8.c(null, "InstreamAdEngine: There is no one midpoint service for point - " + f);
            c();
            return;
        }
        gu8.c(null, "InstreamAdEngine: Loading midpoint services for point - " + f);
        this.b.d(10000, a());
        if (this.a.b(g, new ga40(this, 23))) {
            return;
        }
        b(false);
    }

    public final void e() {
        lgz0 lgz0Var;
        boolean equals;
        a aVar = this.a;
        aVar.a();
        if (this.g == 0 || this.i.isEmpty()) {
            c();
            return;
        }
        do {
            int i = this.h + 1;
            if (i >= this.i.size()) {
                c();
                return;
            }
            this.h = i;
            lgz0Var = (lgz0) this.i.get(i);
            equals = "statistics".equals(lgz0Var.E);
            if (equals) {
                aVar.c(lgz0Var);
            }
        } while (equals);
        int i2 = this.g;
        if (i2 > 0) {
            this.g = i2 - 1;
        }
        aVar.d(lgz0Var);
    }

    public final void f() {
        if (this.c.k()) {
            d();
        } else {
            e();
        }
    }
}
