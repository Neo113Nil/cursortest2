package defpackage;

import sun.misc.Unsafe;

/* loaded from: classes11.dex */
public final class m321 extends v321 {
    public m321(Unsafe unsafe) {
        super(unsafe);
    }

    @Override // defpackage.v321
    public final boolean c(long j, Object obj) {
        return y321.g ? y321.h(j, obj) != 0 : y321.i(j, obj) != 0;
    }

    @Override // defpackage.v321
    public final byte d(long j, Object obj) {
        return y321.g ? y321.h(j, obj) : y321.i(j, obj);
    }

    @Override // defpackage.v321
    public final double e(long j, Object obj) {
        return Double.longBitsToDouble(h(j, obj));
    }

    @Override // defpackage.v321
    public final float f(long j, Object obj) {
        return Float.intBitsToFloat(g(j, obj));
    }

    @Override // defpackage.v321
    public final void k(Object obj, long j, boolean z) {
        if (y321.g) {
            y321.l(obj, j, z ? (byte) 1 : (byte) 0);
        } else {
            y321.m(obj, j, z ? (byte) 1 : (byte) 0);
        }
    }

    @Override // defpackage.v321
    public final void l(Object obj, long j, byte b) {
        if (y321.g) {
            y321.l(obj, j, b);
        } else {
            y321.m(obj, j, b);
        }
    }

    @Override // defpackage.v321
    public final void m(Object obj, long j, double d) {
        p(obj, j, Double.doubleToLongBits(d));
    }

    @Override // defpackage.v321
    public final void n(Object obj, long j, float f) {
        o(j, obj, Float.floatToIntBits(f));
    }

    @Override // defpackage.v321
    public final boolean s() {
        return false;
    }
}
