package xsna;

import androidx.compose.foundation.text.selection.CrossStatus;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import xsna.obi0;

/* compiled from: SelectionAdjustment.kt */
/* loaded from: classes11.dex */
public final class bci0 {
    public static final obi0 a(ndi0 ndi0Var, x98 x98Var) {
        boolean z = ndi0Var.d() == CrossStatus.CROSSED;
        return new obi0(c(ndi0Var.k(), z, true, ndi0Var.l(), x98Var), c(ndi0Var.j(), z, false, ndi0Var.h(), x98Var), z);
    }

    public static final obi0.a b(final ndi0 ndi0Var, final jai0 jai0Var, obi0.a aVar) {
        final int i = ndi0Var.a() ? jai0Var.c : jai0Var.d;
        int l = ndi0Var.a() ? ndi0Var.l() : ndi0Var.h();
        int i2 = jai0Var.b;
        ljo0 ljo0Var = jai0Var.f;
        int i3 = jai0Var.e;
        if (l != i2) {
            return jai0Var.a(i);
        }
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        final Lazy a = msy.a(lazyThreadSafetyMode, new i6l(jai0Var, i, 1));
        final int i4 = ndi0Var.a() ? jai0Var.d : jai0Var.c;
        Lazy a2 = msy.a(lazyThreadSafetyMode, new gzs() { // from class: xsna.aci0
            /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
            @Override // xsna.gzs
            public final Object invoke() {
                int intValue = ((Number) a.getValue()).intValue();
                ndi0 ndi0Var2 = ndi0Var;
                boolean a3 = ndi0Var2.a();
                boolean z = ndi0Var2.d() == CrossStatus.CROSSED;
                jai0 jai0Var2 = jai0.this;
                ljo0 ljo0Var2 = jai0Var2.f;
                int i5 = i;
                long l2 = ljo0Var2.l(i5);
                ljo0 ljo0Var3 = jai0Var2.f;
                int i6 = qko0.c;
                int i7 = (int) (l2 >> 32);
                m540 m540Var = ljo0Var3.b;
                m540 m540Var2 = ljo0Var3.b;
                int d = m540Var.d(i7);
                int i8 = m540Var.f;
                if (d != intValue) {
                    i7 = intValue >= i8 ? m540Var.f(i8 - 1) : m540Var.f(intValue);
                }
                int i9 = (int) (l2 & 4294967295L);
                if (m540Var.d(i9) != intValue) {
                    i9 = intValue >= i8 ? m540Var2.c(i8 - 1, false) : m540Var2.c(intValue, false);
                }
                int i10 = i4;
                if (i7 == i10) {
                    return jai0Var2.a(i9);
                }
                if (i9 == i10) {
                    return jai0Var2.a(i7);
                }
                if (!(a3 ^ z) ? i5 >= i7 : i5 > i9) {
                    i7 = i9;
                }
                return jai0Var2.a(i7);
            }
        });
        if (jai0Var.a != aVar.c) {
            return (obi0.a) a2.getValue();
        }
        if (i == i3) {
            return aVar;
        }
        if (((Number) a.getValue()).intValue() != ljo0Var.b.d(i3)) {
            return (obi0.a) a2.getValue();
        }
        int i5 = aVar.b;
        long l2 = ljo0Var.l(i5);
        boolean a3 = ndi0Var.a();
        if (i3 != -1) {
            if (i != i3) {
                if (((a3 ? 1 : 0) ^ (jai0Var.b() != CrossStatus.CROSSED ? 0 : 1)) == 0) {
                }
            }
            return jai0Var.a(i);
        }
        int i6 = qko0.c;
        return (i5 == ((int) (l2 >> 32)) || i5 == ((int) (l2 & 4294967295L))) ? (obi0.a) a2.getValue() : jai0Var.a(i);
    }

    public static final obi0.a c(jai0 jai0Var, boolean z, boolean z2, int i, x98 x98Var) {
        long j;
        int i2 = z2 ? jai0Var.c : jai0Var.d;
        if (i != jai0Var.b) {
            return jai0Var.a(i2);
        }
        long a = x98Var.a(jai0Var, i2);
        if (z ^ z2) {
            int i3 = qko0.c;
            j = a >> 32;
        } else {
            int i4 = qko0.c;
            j = 4294967295L & a;
        }
        return jai0Var.a((int) j);
    }

    public static final obi0.a d(obi0.a aVar, jai0 jai0Var, int i) {
        return new obi0.a(jai0Var.f.a(i), i, aVar.c);
    }
}
