package xsna;

import androidx.compose.foundation.text.Handle;
import xsna.obi0;

/* compiled from: SelectionManager.kt */
/* loaded from: classes11.dex */
public final class cei0 {
    public static final zhf0 a = new zhf0(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);

    /* compiled from: SelectionManager.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.SelectionStart.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.Cursor.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final boolean a(zhf0 zhf0Var, long j) {
        float f = zhf0Var.a;
        float f2 = zhf0Var.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        if (f > intBitsToFloat || intBitsToFloat > f2) {
            return false;
        }
        float f3 = zhf0Var.b;
        float f4 = zhf0Var.d;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        return f3 <= intBitsToFloat2 && intBitsToFloat2 <= f4;
    }

    public static final long b(bei0 bei0Var, long j, obi0.a aVar) {
        tny tnyVar;
        tny a2;
        int i;
        float f;
        cai0 c = bei0Var.c(aVar);
        if (c == null || (tnyVar = bei0Var.m) == null || (a2 = c.a()) == null || (i = aVar.b) > c.b()) {
            return 9205357640488583168L;
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (a2.w(tnyVar, ((ov70) ((zak0) bei0Var.t).getValue()).a) >> 32));
        long f2 = c.f(i);
        if (qko0.c(f2)) {
            f = c.j(i);
        } else {
            float j2 = c.j((int) (f2 >> 32));
            float l = c.l(((int) (f2 & 4294967295L)) - 1);
            f = swe0.f(intBitsToFloat, Math.min(j2, l), Math.max(j2, l));
        }
        if (f == -1.0f) {
            return 9205357640488583168L;
        }
        if (!q9x.b(j, 0L) && Math.abs(intBitsToFloat - f) > ((int) (j >> 32)) / 2) {
            return 9205357640488583168L;
        }
        if (c.c(i) == -1.0f) {
            return 9205357640488583168L;
        }
        return tnyVar.w(a2, (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(r12) & 4294967295L));
    }

    public static final zhf0 c(tny tnyVar) {
        zhf0 j = jgz.j(tnyVar, true);
        long F = tnyVar.F(j.e());
        float f = j.c;
        float f2 = j.d;
        return p490.d(F, tnyVar.F((Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L)));
    }
}
