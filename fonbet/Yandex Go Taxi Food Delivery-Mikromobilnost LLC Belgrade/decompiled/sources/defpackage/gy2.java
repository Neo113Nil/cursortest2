package defpackage;

import java.util.Iterator;

/* loaded from: classes9.dex */
public final /* synthetic */ class gy2 implements Runnable {
    public final /* synthetic */ ky2 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ gy2(ky2 ky2Var, boolean z, boolean z2) {
        this.a = ky2Var;
        this.b = z;
        this.c = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ky2 ky2Var = this.a;
        boolean z = this.b;
        boolean z2 = this.c;
        boolean z3 = ky2Var.a;
        boolean j = ky2Var.j();
        if (z == z3 && z2 == j) {
            return;
        }
        Iterator it = ky2Var.c.iterator();
        while (it.hasNext()) {
            ((fy2) it.next()).a(z3, j);
        }
    }
}
