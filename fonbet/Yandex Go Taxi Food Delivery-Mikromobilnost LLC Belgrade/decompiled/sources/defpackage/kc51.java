package defpackage;

import java.util.Vector;

/* loaded from: classes4.dex */
public class kc51 {
    public final xa a;
    public final Vector b;

    public kc51(xa xaVar) {
        this.b = new Vector();
        this.a = xaVar;
    }

    public final void a(t2 t2Var, String str) {
        z1 d = this.a.d(t2Var, str);
        u4i0 u4i0Var = new u4i0();
        b2 b2Var = new b2(2);
        b2Var.a(t2Var);
        b2Var.a(d);
        kqf kqfVar = new kqf(new iqf(b2Var));
        kqfVar.c = -1;
        u4i0Var.a = kqfVar;
        this.b.addElement(u4i0Var);
    }

    public kc51() {
        this(wc4.m);
    }
}
