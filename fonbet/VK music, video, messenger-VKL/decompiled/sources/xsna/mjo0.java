package xsna;

/* compiled from: TextLayoutResultProxy.kt */
/* loaded from: classes11.dex */
public final class mjo0 {
    public final ljo0 a;
    public tny b = null;
    public tny c;

    public mjo0(ljo0 ljo0Var, tny tnyVar) {
        this.a = ljo0Var;
        this.c = tnyVar;
    }

    public final long a(long j) {
        zhf0 zhf0Var;
        tny tnyVar = this.b;
        zhf0 zhf0Var2 = zhf0.e;
        if (tnyVar != null) {
            if (tnyVar.e()) {
                tny tnyVar2 = this.c;
                zhf0Var = tnyVar2 != null ? tnyVar2.z(tnyVar, true) : null;
            } else {
                zhf0Var = zhf0Var2;
            }
            if (zhf0Var != null) {
                zhf0Var2 = zhf0Var;
            }
        }
        int i = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat(i);
        float f = zhf0Var2.a;
        if (intBitsToFloat >= f) {
            float intBitsToFloat2 = Float.intBitsToFloat(i);
            f = zhf0Var2.c;
            if (intBitsToFloat2 <= f) {
                f = Float.intBitsToFloat(i);
            }
        }
        int i2 = (int) (j & 4294967295L);
        float intBitsToFloat3 = Float.intBitsToFloat(i2);
        float f2 = zhf0Var2.b;
        if (intBitsToFloat3 >= f2) {
            float intBitsToFloat4 = Float.intBitsToFloat(i2);
            f2 = zhf0Var2.d;
            if (intBitsToFloat4 <= f2) {
                f2 = Float.intBitsToFloat(i2);
            }
        }
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public final int b(long j, boolean z) {
        if (z) {
            j = a(j);
        }
        return this.a.b.h(d(j));
    }

    public final boolean c(long j) {
        long d = d(a(j));
        float intBitsToFloat = Float.intBitsToFloat((int) (4294967295L & d));
        ljo0 ljo0Var = this.a;
        int e = ljo0Var.b.e(intBitsToFloat);
        int i = (int) (d >> 32);
        return Float.intBitsToFloat(i) >= ljo0Var.h(e) && Float.intBitsToFloat(i) <= ljo0Var.i(e);
    }

    public final long d(long j) {
        tny tnyVar;
        tny tnyVar2 = this.b;
        if (tnyVar2 == null) {
            return j;
        }
        if (!tnyVar2.e()) {
            tnyVar2 = null;
        }
        if (tnyVar2 == null || (tnyVar = this.c) == null) {
            return j;
        }
        tny tnyVar3 = tnyVar.e() ? tnyVar : null;
        return tnyVar3 == null ? j : tnyVar2.w(tnyVar3, j);
    }

    public final long e(long j) {
        tny tnyVar;
        tny tnyVar2 = this.b;
        if (tnyVar2 == null) {
            return j;
        }
        if (!tnyVar2.e()) {
            tnyVar2 = null;
        }
        if (tnyVar2 == null || (tnyVar = this.c) == null) {
            return j;
        }
        tny tnyVar3 = tnyVar.e() ? tnyVar : null;
        return tnyVar3 == null ? j : tnyVar3.w(tnyVar2, j);
    }
}
