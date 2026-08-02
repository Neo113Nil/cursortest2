package defpackage;

import android.content.Context;

/* loaded from: classes10.dex */
public final class oyi0 extends yjs0 {
    public final bjs0 d;
    public final bjs0 e;
    public final bjs0 f;
    public final bjs0 g;
    public final yjs0 h;
    public int i;
    public int j;
    public int k;

    public oyi0(bjs0 bjs0Var, bjs0 bjs0Var2, bjs0 bjs0Var3, bjs0 bjs0Var4, yjs0 yjs0Var) {
        this.d = bjs0Var;
        this.e = bjs0Var2;
        this.f = bjs0Var3;
        this.g = bjs0Var4;
        this.h = yjs0Var;
    }

    @Override // defpackage.yjs0
    public final void b(Context context, int i, int i2, int i3, n86 n86Var) {
        this.h.b(context, i + this.i, i2 + this.k, i3, n86Var);
    }

    @Override // defpackage.yjs0
    public final void c(Context context, qa10 qa10Var) {
        nyi0 nyi0Var;
        bjs0 bjs0Var = this.f;
        bjs0 bjs0Var2 = this.d;
        bjs0 bjs0Var3 = this.g;
        bjs0 bjs0Var4 = this.e;
        if (bjs0Var4 == null && bjs0Var == null && bjs0Var3 == null) {
            nyi0Var = new nyi0(bjs0Var2, bjs0Var2, bjs0Var2, bjs0Var2);
        } else if (bjs0Var == null && bjs0Var3 == null) {
            if (bjs0Var4 == null) {
                ny61.g("Required value was null.");
                return;
            }
            nyi0Var = new nyi0(bjs0Var2, bjs0Var4, bjs0Var2, bjs0Var4);
        } else if (bjs0Var4 == null) {
            ny61.g("Required value was null.");
            return;
        } else if (bjs0Var == null) {
            ny61.g("Required value was null.");
            return;
        } else {
            if (bjs0Var3 == null) {
                ny61.g("Required value was null.");
                return;
            }
            nyi0Var = new nyi0(bjs0Var2, bjs0Var4, bjs0Var, bjs0Var3);
        }
        this.i = sb2.A(nyi0Var.d, context, qa10Var.a);
        this.j = sb2.A(nyi0Var.b, context, qa10Var.a);
        this.k = sb2.A(nyi0Var.a, context, qa10Var.b);
        int A = sb2.A(nyi0Var.c, context, qa10Var.b);
        int i = this.i + this.j;
        int i2 = this.k + A;
        qa10Var.a -= i;
        qa10Var.b -= i2;
        yjs0 yjs0Var = this.h;
        yjs0Var.a(context, qa10Var);
        d(yjs0Var.b + i, yjs0Var.c + i2);
    }
}
