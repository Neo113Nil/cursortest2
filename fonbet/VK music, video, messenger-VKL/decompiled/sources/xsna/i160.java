package xsna;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: NestedScrollInteropConnection.kt */
/* loaded from: classes17.dex */
public final class i160 implements d160 {
    public final boolean b;
    public final s160 c;
    public final int[] d;

    public i160(View view, boolean z) {
        this.b = z;
        s160 s160Var = new s160(view);
        s160Var.g(true);
        this.c = s160Var;
        this.d = new int[2];
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        view.setNestedScrollingEnabled(true);
    }

    @Override // xsna.d160
    public final Object M(long j, spj<? super jmr0> spjVar) {
        float b = jmr0.b(j) * (-1.0f);
        float c = jmr0.c(j) * (-1.0f);
        s160 s160Var = this.c;
        if (!s160Var.b(b, c)) {
            j = 0;
        }
        if (s160Var.f(0)) {
            s160Var.i(0);
        }
        if (s160Var.f(1)) {
            s160Var.i(1);
        }
        return new jmr0(j);
    }

    @Override // xsna.d160
    public final long R0(int i, long j) {
        if (!this.c.h(dz5.c(j), (i == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        boolean z = this.b;
        int[] iArr = this.d;
        if (z) {
            jw5.o(0, 0, 6, iArr);
            this.c.c(dz5.p(Float.intBitsToFloat((int) (j >> 32))), dz5.p(Float.intBitsToFloat((int) (4294967295L & j))), this.d, null, (i == 1 ? 1 : 0) ^ 1);
        }
        return dz5.d(j, iArr);
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        if (!this.c.h(dz5.c(j2), (i == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        boolean z = this.b;
        int[] iArr = this.d;
        if (z) {
            jw5.o(0, 0, 6, iArr);
            int p = dz5.p(Float.intBitsToFloat((int) (j >> 32)));
            int p2 = dz5.p(Float.intBitsToFloat((int) (j & 4294967295L)));
            int p3 = dz5.p(Float.intBitsToFloat((int) (j2 >> 32)));
            int p4 = dz5.p(Float.intBitsToFloat((int) (4294967295L & j2)));
            int i2 = i == 1 ? 1 : 0;
            this.c.d(p, p2, p3, p4, null, i2 ^ 1, this.d);
        }
        return dz5.d(j2, iArr);
    }

    @Override // xsna.d160
    public final Object m0(long j, long j2, spj<? super jmr0> spjVar) {
        float b = jmr0.b(j2) * (-1.0f);
        float c = jmr0.c(j2) * (-1.0f);
        s160 s160Var = this.c;
        if (!s160Var.a(b, c, true)) {
            j2 = 0;
        }
        if (s160Var.f(0)) {
            s160Var.i(0);
        }
        if (s160Var.f(1)) {
            s160Var.i(1);
        }
        return new jmr0(j2);
    }
}
