package xsna;

import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: InternalDropdown.kt */
/* loaded from: classes17.dex */
public final class lt1 implements fxb0 {
    public final dt1 b;
    public final long c;
    public final ya d;
    public final mz1 e;

    public lt1() {
        throw null;
    }

    public lt1(dt1 dt1Var, long j, int i, int i2, ya yaVar, mz1 mz1Var) {
        this.b = dt1Var;
        this.c = j;
        this.d = yaVar;
        this.e = mz1Var;
    }

    @Override // xsna.fxb0
    public final long b(l9x l9xVar, long j, LayoutDirection layoutDirection, long j2) {
        this.d.getClass();
        s3q0 s3q0Var = s3q0.a;
        long j3 = 0;
        long a = this.b.a(0L, (l9xVar.d() << 32) | (l9xVar.b() & 4294967295L), layoutDirection);
        long a2 = this.b.a(0L, (((int) (j2 >> 32)) << 32) | (((int) (j2 & 4294967295L)) & 4294967295L), layoutDirection);
        int i = l9xVar.a;
        int i2 = l9xVar.b;
        long c = h9x.c(h9x.d(h9x.d((j3 & 4294967295L) | (j3 << 32), (i << 32) | (i2 & 4294967295L)), a), (((int) (a2 & 4294967295L)) & 4294967295L) | (((int) (a2 >> 32)) << 32));
        long j4 = this.c;
        long d = h9x.d(c, (((int) (j4 & 4294967295L)) & 4294967295L) | ((((int) (j4 >> 32)) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1)) << 32));
        int i3 = (int) (d & 4294967295L);
        mz1 mz1Var = this.e;
        izs izsVar = (izs) mz1Var.c;
        wh50 wh50Var = (wh50) mz1Var.d;
        boolean z = i2 > i3;
        izsVar.invoke(Boolean.valueOf(z));
        wh50Var.setValue(Boolean.valueOf(z));
        s3q0 s3q0Var2 = s3q0.a;
        return d;
    }
}
