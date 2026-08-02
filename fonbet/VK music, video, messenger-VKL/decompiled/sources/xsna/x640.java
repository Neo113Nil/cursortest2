package xsna;

import androidx.compose.foundation.text.selection.Direction;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import xsna.obi0;

/* compiled from: MultiWidgetSelectionDelegate.kt */
/* loaded from: classes11.dex */
public final class x640 implements cai0 {
    public final long a;
    public final so40 b;
    public final p1d0 c;
    public ljo0 e;
    public final x640 d = this;
    public int f = -1;

    public x640(long j, so40 so40Var, p1d0 p1d0Var) {
        this.a = j;
        this.b = so40Var;
        this.c = p1d0Var;
    }

    @Override // xsna.cai0
    public final tny a() {
        tny tnyVar = (tny) this.b.invoke();
        if (tnyVar == null || !tnyVar.e()) {
            return null;
        }
        return tnyVar;
    }

    @Override // xsna.cai0
    public final int b() {
        ljo0 ljo0Var = (ljo0) this.c.invoke();
        if (ljo0Var == null) {
            return 0;
        }
        return n(ljo0Var);
    }

    @Override // xsna.cai0
    public final float c(int i) {
        m540 m540Var;
        int d;
        ljo0 ljo0Var = (ljo0) this.c.invoke();
        if (ljo0Var == null || (d = (m540Var = ljo0Var.b).d(i)) >= m540Var.f) {
            return -1.0f;
        }
        float g = m540Var.g(d);
        return ((m540Var.b(d) - g) / 2) + g;
    }

    @Override // xsna.cai0
    public final zhf0 d(int i) {
        int length;
        ljo0 ljo0Var = (ljo0) this.c.invoke();
        return (ljo0Var != null && (length = ljo0Var.a.a.c.length()) >= 1) ? ljo0Var.b(swe0.g(i, 0, length - 1)) : zhf0.e;
    }

    @Override // xsna.cai0
    public final long e() {
        return this.a;
    }

    @Override // xsna.cai0
    public final long f(int i) {
        ljo0 ljo0Var = (ljo0) this.c.invoke();
        if (ljo0Var == null) {
            return qko0.b;
        }
        m540 m540Var = ljo0Var.b;
        int n = n(ljo0Var);
        if (n < 1) {
            return qko0.b;
        }
        int d = m540Var.d(swe0.g(i, 0, n - 1));
        return jgz.c(m540Var.f(d), m540Var.c(d, true));
    }

    @Override // xsna.cai0
    public final void g(odi0 odi0Var) {
        ljo0 ljo0Var;
        Direction direction;
        Direction direction2;
        odi0 odi0Var2;
        Direction a;
        Direction direction3;
        long j;
        Direction direction4;
        Direction direction5;
        long j2;
        Direction direction6;
        int i;
        int i2;
        obi0.a aVar;
        obi0.a aVar2;
        tny a2 = a();
        if (a2 == null || (ljo0Var = (ljo0) this.c.invoke()) == null) {
            return;
        }
        tny tnyVar = odi0Var.c;
        boolean z = odi0Var.d;
        long w = tnyVar.w(a2, 0L);
        long e = ov70.e(odi0Var.a, w);
        long j3 = odi0Var.b;
        long e2 = (j3 & 9223372034707292159L) == 9205357640488583168L ? 9205357640488583168L : ov70.e(j3, w);
        long j4 = ljo0Var.c;
        float f = (int) (j4 >> 32);
        float f2 = (int) (j4 & 4294967295L);
        int i3 = (int) (e >> 32);
        Direction direction7 = Float.intBitsToFloat(i3) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Direction.BEFORE : Float.intBitsToFloat(i3) > f ? Direction.AFTER : Direction.ON;
        int i4 = (int) (e & 4294967295L);
        Direction direction8 = Float.intBitsToFloat(i4) < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? Direction.BEFORE : Float.intBitsToFloat(i4) > f2 ? Direction.AFTER : Direction.ON;
        wdi0 wdi0Var = odi0Var.f;
        obi0 obi0Var = odi0Var.e;
        long j5 = this.a;
        if (z) {
            Direction direction9 = direction7;
            direction = direction8;
            direction2 = direction9;
            odi0Var2 = odi0Var;
            direction4 = direction2;
            j = j5;
            direction5 = y640.a(direction2, direction, odi0Var, j5, obi0Var != null ? obi0Var.b : null);
            direction3 = direction5;
            j2 = 9205357640488583168L;
            a = direction;
            direction6 = direction3;
        } else {
            Direction direction10 = direction7;
            direction = direction8;
            direction2 = direction10;
            odi0Var2 = odi0Var;
            a = y640.a(direction2, direction, odi0Var2, j5, obi0Var != null ? obi0Var.a : null);
            direction3 = direction2;
            j = j5;
            direction4 = a;
            direction5 = direction4;
            j2 = 9205357640488583168L;
            direction6 = direction;
        }
        Direction a3 = pdi0.a(direction2, direction);
        if (a3 == Direction.ON || a3 != direction5) {
            int length = ljo0Var.a.a.c.length();
            if (z) {
                int b = y640.b(e, ljo0Var);
                if (obi0Var == null || (aVar2 = obi0Var.b) == null) {
                    length = b;
                } else {
                    int compare = wdi0Var.compare(Long.valueOf(aVar2.c), Long.valueOf(j));
                    if (compare < 0) {
                        length = 0;
                    } else if (compare <= 0) {
                        length = aVar2.b;
                    }
                }
                i2 = length;
                i = b;
            } else {
                int b2 = y640.b(e, ljo0Var);
                if (obi0Var == null || (aVar = obi0Var.a) == null) {
                    length = b2;
                } else {
                    int compare2 = wdi0Var.compare(Long.valueOf(aVar.c), Long.valueOf(j));
                    if (compare2 < 0) {
                        length = 0;
                    } else if (compare2 <= 0) {
                        length = aVar.b;
                    }
                }
                i = length;
                i2 = b2;
            }
            int b3 = (e2 & 9223372034707292159L) == j2 ? -1 : y640.b(e2, ljo0Var);
            int i5 = odi0Var2.k + 2;
            odi0Var2.k = i5;
            long j6 = j;
            jai0 jai0Var = new jai0(j6, i5, i, i2, b3, ljo0Var);
            odi0Var.i = odi0Var.a(odi0Var.i, direction4, a);
            odi0Var.j = odi0Var.a(odi0Var.j, direction3, direction6);
            vg50 vg50Var = odi0Var.g;
            ArrayList arrayList = odi0Var.h;
            vg50Var.e(arrayList.size(), j6);
            arrayList.add(jai0Var);
        }
    }

    @Override // xsna.cai0
    public final us2 getText() {
        ljo0 ljo0Var = (ljo0) this.c.invoke();
        return ljo0Var == null ? new us2("") : ljo0Var.a.a;
    }

    @Override // xsna.cai0
    public final long h(obi0 obi0Var, boolean z) {
        ljo0 ljo0Var;
        long j = this.a;
        if (z && obi0Var.a.c != j) {
            return 9205357640488583168L;
        }
        if ((!z && obi0Var.b.c != j) || a() == null || (ljo0Var = (ljo0) this.c.invoke()) == null) {
            return 9205357640488583168L;
        }
        return cvk.m(ljo0Var, swe0.g((z ? obi0Var.a : obi0Var.b).b, 0, n(ljo0Var)), z, obi0Var.c);
    }

    @Override // xsna.cai0
    public final float i(int i) {
        ljo0 ljo0Var = (ljo0) this.c.invoke();
        return ljo0Var != null ? jjo0.a(ljo0Var, i) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // xsna.cai0
    public final float j(int i) {
        m540 m540Var;
        int d;
        ljo0 ljo0Var = (ljo0) this.c.invoke();
        if (ljo0Var != null && (d = (m540Var = ljo0Var.b).d(i)) < m540Var.f) {
            return ljo0Var.h(d);
        }
        return -1.0f;
    }

    @Override // xsna.cai0
    public final ljo0 k() {
        return (ljo0) this.c.invoke();
    }

    @Override // xsna.cai0
    public final float l(int i) {
        m540 m540Var;
        int d;
        ljo0 ljo0Var = (ljo0) this.c.invoke();
        if (ljo0Var != null && (d = (m540Var = ljo0Var.b).d(i)) < m540Var.f) {
            return ljo0Var.i(d);
        }
        return -1.0f;
    }

    @Override // xsna.cai0
    public final obi0 m() {
        ljo0 ljo0Var = (ljo0) this.c.invoke();
        if (ljo0Var == null) {
            return null;
        }
        int length = ljo0Var.a.a.c.length();
        ResolvedTextDirection a = ljo0Var.a(0);
        long j = this.a;
        return new obi0(new obi0.a(a, 0, j), new obi0.a(ljo0Var.a(Math.max(length - 1, 0)), length, j), false);
    }

    public final int n(ljo0 ljo0Var) {
        int i;
        int i2;
        synchronized (this.d) {
            try {
                if (this.e != ljo0Var) {
                    if (ljo0Var.d()) {
                        m540 m540Var = ljo0Var.b;
                        if (!m540Var.c) {
                            i2 = m540Var.e((int) (ljo0Var.c & 4294967295L));
                            int i3 = ljo0Var.b.f - 1;
                            if (i2 > i3) {
                                i2 = i3;
                            }
                            while (i2 >= 0 && ljo0Var.b.g(i2) >= ((int) (ljo0Var.c & 4294967295L))) {
                                i2--;
                            }
                            if (i2 < 0) {
                                i2 = 0;
                            }
                            this.f = ljo0Var.b.c(i2, true);
                            this.e = ljo0Var;
                        }
                    }
                    i2 = ljo0Var.b.f - 1;
                    this.f = ljo0Var.b.c(i2, true);
                    this.e = ljo0Var;
                }
                i = this.f;
            } catch (Throwable th) {
                throw th;
            }
        }
        return i;
    }
}
