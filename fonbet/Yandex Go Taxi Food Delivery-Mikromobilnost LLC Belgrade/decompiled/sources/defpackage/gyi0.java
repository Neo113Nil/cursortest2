package defpackage;

import android.content.Context;

/* loaded from: classes10.dex */
public final class gyi0 extends yjs0 {
    public final bjs0 d;
    public final bjs0 e;
    public final bjs0 f;

    public gyi0(bjs0 bjs0Var, bjs0 bjs0Var2, bjs0 bjs0Var3) {
        this.d = bjs0Var;
        this.e = bjs0Var2;
        this.f = bjs0Var3;
    }

    @Override // defpackage.yjs0
    public final void b(Context context, int i, int i2, int i3, n86 n86Var) {
        int i4 = this.b;
        int i5 = this.c;
        bjs0 bjs0Var = this.f;
        n86Var.o(context, i, i2, i3, i4, i5, bjs0Var != null ? Integer.valueOf(sb2.A(bjs0Var, context, -1)) : null, null, true);
    }

    @Override // defpackage.yjs0
    public final void c(Context context, qa10 qa10Var) {
        int A = sb2.A(this.d, context, qa10Var.a);
        bjs0 bjs0Var = this.e;
        d(A, bjs0Var != null ? sb2.A(bjs0Var, context, qa10Var.b) : A);
    }
}
