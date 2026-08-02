package xsna;

import android.graphics.PointF;
import com.unity3d.services.UnityAdsConstants;
import xsna.hio0;

/* compiled from: HandwritingGesture.android.kt */
/* loaded from: classes11.dex */
public final class ttu {
    public static final int a(j1z j1zVar, long j, rut0 rut0Var) {
        ljo0 ljo0Var;
        long p;
        int e;
        mjo0 d = j1zVar.d();
        if (d != null && (ljo0Var = d.a) != null) {
            m540 m540Var = ljo0Var.b;
            tny c = j1zVar.c();
            if (c != null && (e = e(m540Var, (p = c.p(j)), rut0Var)) != -1) {
                return m540Var.h(ov70.a(1, p, (m540Var.b(e) + m540Var.g(e)) / 2.0f));
            }
        }
        return -1;
    }

    public static final long b(j1z j1zVar, zhf0 zhf0Var, zhf0 zhf0Var2, int i) {
        long f = f(j1zVar, zhf0Var, i);
        if (qko0.c(f)) {
            return qko0.b;
        }
        long f2 = f(j1zVar, zhf0Var2, i);
        if (qko0.c(f2)) {
            return qko0.b;
        }
        int i2 = (int) (f >> 32);
        int i3 = (int) (f2 & 4294967295L);
        return jgz.c(Math.min(i2, i2), Math.max(i3, i3));
    }

    public static final boolean c(ljo0 ljo0Var, int i) {
        int d = ljo0Var.b.d(i);
        m540 m540Var = ljo0Var.b;
        return i == m540Var.f(d) || i == m540Var.c(d, false) ? ljo0Var.j(i) != ljo0Var.a(i) : ljo0Var.a(i) != ljo0Var.a(i - 1);
    }

    public static final long d(PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        return (Float.floatToRawIntBits(f) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static final int e(m540 m540Var, long j, rut0 rut0Var) {
        float a = rut0Var != null ? rut0Var.a() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i = (int) (4294967295L & j);
        int e = m540Var.e(Float.intBitsToFloat(i));
        if (Float.intBitsToFloat(i) < m540Var.g(e) - a || Float.intBitsToFloat(i) > m540Var.b(e) + a) {
            return -1;
        }
        int i2 = (int) (j >> 32);
        if (Float.intBitsToFloat(i2) < (-a) || Float.intBitsToFloat(i2) > m540Var.d + a) {
            return -1;
        }
        return e;
    }

    public static final long f(j1z j1zVar, zhf0 zhf0Var, int i) {
        ljo0 ljo0Var;
        mjo0 d = j1zVar.d();
        m540 m540Var = (d == null || (ljo0Var = d.a) == null) ? null : ljo0Var.b;
        tny c = j1zVar.c();
        return (m540Var == null || c == null) ? qko0.b : m540Var.i(zhf0Var.j(c.p(0L)), i, hio0.a.b);
    }

    public static final boolean g(int i) {
        int type = Character.getType(i);
        return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
    }

    public static final boolean h(int i) {
        return Character.isWhitespace(i) || i == 160;
    }

    public static final boolean i(int i) {
        int type;
        return (!h(i) || (type = Character.getType(i)) == 14 || type == 13 || i == 10) ? false : true;
    }
}
