package defpackage;

import java.util.UUID;

/* loaded from: classes10.dex */
public final class dx31 extends x9s {
    public final String b;
    public int c;

    public dx31(ar7 ar7Var) {
        super(ar7Var);
        this.b = "virtual-" + ar7Var.c() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.x9s, defpackage.ar7
    public final String c() {
        return this.b;
    }

    @Override // defpackage.x9s, defpackage.ar7
    public final int i(int i) {
        return lw01.k(this.a.i(i) - this.c);
    }

    @Override // defpackage.x9s, defpackage.ar7
    public final int m() {
        return i(0);
    }
}
