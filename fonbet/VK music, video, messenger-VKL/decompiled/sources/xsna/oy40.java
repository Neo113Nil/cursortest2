package xsna;

import android.view.View;
import androidx.compose.foundation.gestures.Orientation;
import java.util.WeakHashMap;

/* compiled from: MusicPlayerScrollInteropConnection.kt */
/* loaded from: classes3.dex */
public final class oy40 implements d160 {
    public final Orientation b;
    public final s160 c;
    public final int[] d;

    public oy40(View view, Orientation orientation) {
        this.b = orientation;
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
        this.c.h(cdi.t(j), (i == 1 ? 1 : 0) ^ 1);
        return 0L;
    }

    @Override // xsna.d160
    public final long W0(int i, long j, long j2) {
        this.c.h(cdi.t(j2), (i == 1 ? 1 : 0) ^ 1);
        return 0L;
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
