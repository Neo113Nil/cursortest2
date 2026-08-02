package defpackage;

import defpackage.gb3;
import java.util.concurrent.TimeUnit;

/* loaded from: classes9.dex */
public final class fb3 {
    public static final void a(gb3 gb3Var) {
        k3f0 k3f0Var = gb3.h;
        if (gb3.i == null) {
            gb3.i = new gb3();
            new gb3.a().start();
        }
        long nanoTime = System.nanoTime();
        long j = gb3Var.c;
        boolean z = gb3Var.a;
        if (j != 0 && z) {
            gb3Var.g = Math.min(j, gb3Var.c() - nanoTime) + nanoTime;
        } else if (j != 0) {
            gb3Var.g = nanoTime + j;
        } else {
            if (!z) {
                ny61.w();
                return;
            }
            gb3Var.g = gb3Var.c();
        }
        k3f0 k3f0Var2 = gb3.h;
        int i = k3f0Var2.a + 1;
        k3f0Var2.a = i;
        gb3[] gb3VarArr = k3f0Var2.b;
        if (i == gb3VarArr.length) {
            gb3[] gb3VarArr2 = new gb3[i * 2];
            f73.l(gb3VarArr, 0, gb3VarArr2, 0, 14);
            k3f0Var2.b = gb3VarArr2;
        }
        k3f0Var2.a(i, gb3Var);
        if (gb3Var.f == 1) {
            gb3.k.signal();
        }
    }

    public static gb3 b() {
        k3f0 k3f0Var = gb3.h;
        gb3 gb3Var = k3f0Var.b[1];
        if (gb3Var == null) {
            long nanoTime = System.nanoTime();
            gb3.k.await(gb3.l, TimeUnit.MILLISECONDS);
            if (k3f0Var.b[1] != null || System.nanoTime() - nanoTime < gb3.m) {
                return null;
            }
            return gb3.i;
        }
        long nanoTime2 = gb3Var.g - System.nanoTime();
        if (nanoTime2 > 0) {
            gb3.k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        k3f0Var.b(gb3Var);
        gb3Var.e = 2;
        return gb3Var;
    }
}
