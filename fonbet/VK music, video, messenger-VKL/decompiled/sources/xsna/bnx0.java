package xsna;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.HashMap;

/* compiled from: WidgetFrame.java */
/* loaded from: classes.dex */
public final class bnx0 {
    public final ConstraintWidget a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public float o;
    public float p;
    public int q;
    public final HashMap<String, zok> r;

    public bnx0() {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = 0;
        this.r = new HashMap<>();
    }

    public static void a(float f, String str, StringBuilder sb) {
        if (Float.isNaN(f)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f);
        sb.append(",\n");
    }

    public static void b(int i, String str, StringBuilder sb) {
        nyh0.a(i, str, ": ", ",\n", sb);
    }

    public final void c(bnx0 bnx0Var) {
        if (bnx0Var == null) {
            return;
        }
        this.f = bnx0Var.f;
        this.g = bnx0Var.g;
        this.h = bnx0Var.h;
        this.i = bnx0Var.i;
        this.j = bnx0Var.j;
        this.k = bnx0Var.k;
        this.l = bnx0Var.l;
        this.m = bnx0Var.m;
        this.n = bnx0Var.n;
        this.o = bnx0Var.o;
        this.p = bnx0Var.p;
        this.q = bnx0Var.q;
        HashMap<String, zok> hashMap = this.r;
        hashMap.clear();
        for (zok zokVar : bnx0Var.r.values()) {
            hashMap.put(zokVar.c(), zokVar.b());
        }
    }

    public bnx0(ConstraintWidget constraintWidget) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = 0;
        this.r = new HashMap<>();
        this.a = constraintWidget;
    }

    public bnx0(bnx0 bnx0Var) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = 0;
        this.e = 0;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = Float.NaN;
        this.p = Float.NaN;
        this.q = 0;
        this.r = new HashMap<>();
        this.a = bnx0Var.a;
        this.b = bnx0Var.b;
        this.c = bnx0Var.c;
        this.d = bnx0Var.d;
        this.e = bnx0Var.e;
        c(bnx0Var);
    }
}
