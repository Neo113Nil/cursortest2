package xsna;

import android.view.View;
import java.util.WeakHashMap;

/* compiled from: NestedScrollInteropConnection.android.kt */
/* loaded from: classes11.dex */
public final class j160 implements d160 {
    public final View b;
    public final s160 c;
    public final int[] d;

    public j160(View view) {
        this.b = view;
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
        if (!s160Var.b(b, c) && !s160Var.a(jmr0.b(j) * (-1.0f), jmr0.c(j) * (-1.0f), true)) {
            j = 0;
        }
        return new jmr0(j);
    }

    @Override // xsna.d160
    public final long R0(int i, long j) {
        if (!this.c.h(fz5.d(j), (i == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        int[] iArr = this.d;
        jw5.o(0, 0, 6, iArr);
        int f = fz5.f(Float.intBitsToFloat((int) (j >> 32)));
        int f2 = fz5.f(Float.intBitsToFloat((int) (4294967295L & j)));
        this.c.c(f, f2, this.d, null, (i == 1 ? 1 : 0) ^ 1);
        return fz5.e(j, f, f2, iArr);
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        if (!this.c.h(fz5.d(j2), (i == 1 ? 1 : 0) ^ 1)) {
            return 0L;
        }
        int[] iArr = this.d;
        jw5.o(0, 0, 6, iArr);
        int f = fz5.f(Float.intBitsToFloat((int) (j2 >> 32)));
        int f2 = fz5.f(Float.intBitsToFloat((int) (j2 & 4294967295L)));
        int f3 = fz5.f(Float.intBitsToFloat((int) (j >> 32)));
        int f4 = fz5.f(Float.intBitsToFloat((int) (j & 4294967295L)));
        int i2 = i == 1 ? 1 : 0;
        this.c.d(f3, f4, f, f2, null, i2 ^ 1, this.d);
        return fz5.e(j2, f, f2, iArr);
    }

    @Override // xsna.d160
    public final Object m0(long j, long j2, spj<? super jmr0> spjVar) {
        s160 s160Var = this.c;
        if (s160Var.f(0)) {
            s160Var.i(0);
        }
        if (s160Var.f(1)) {
            s160Var.i(1);
        }
        return new jmr0(0L);
    }
}
