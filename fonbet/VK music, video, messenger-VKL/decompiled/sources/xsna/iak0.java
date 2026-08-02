package xsna;

import java.util.ArrayList;
import xsna.i640;

/* compiled from: SnapshotFlow.kt */
/* loaded from: classes11.dex */
public final class iak0 {
    public jak0 a = new hwj0();

    public final Object a(qta qtaVar, gzs gzsVar) {
        hwj0 hwj0Var;
        ohi0<? super s3q0> ohi0Var;
        int i;
        if (this.a == null) {
            gxc0.b("Called runAndWatch on a manager that has been disposed of");
        }
        jak0 jak0Var = this.a;
        if ((jak0Var instanceof hwj0) && (ohi0Var = (hwj0Var = (hwj0) jak0Var).f) != null && !ohi0Var.equals(qtaVar)) {
            i640 i640Var = new i640();
            ohi0<? super s3q0> ohi0Var2 = hwj0Var.f;
            if (ohi0Var2 == null) {
                gxc0.b("promote must only be called when a manager is managing subscriptions for one channel and needs to start managing them for a second");
            }
            qh50<Object> qh50Var = hwj0Var.d;
            ArrayList arrayList = i640Var.c;
            if (qh50Var == null) {
                arrayList.add(new i640.a(hwj0Var.b, ohi0Var2));
            } else {
                Object[] objArr = qh50Var.b;
                long[] jArr = qh50Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8;
                            int i4 = 8 - ((~(i2 - length)) >>> 31);
                            int i5 = 0;
                            while (i5 < i4) {
                                if ((j & 255) < 128) {
                                    i = i3;
                                    arrayList.add(new i640.a(objArr[(i2 << 3) + i5], ohi0Var2));
                                } else {
                                    i = i3;
                                }
                                j >>= i;
                                i5++;
                                i3 = i;
                            }
                            if (i4 != i3) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                }
            }
            i640Var.b();
            hwj0Var.c();
            this.a = i640Var;
        }
        jak0 jak0Var2 = this.a;
        dak0 u = qak0.j().u(jak0Var2.d(qtaVar));
        jak0Var2.a(qtaVar);
        try {
            dak0 j2 = u.j();
            try {
                Object invoke = gzsVar.invoke();
                u.c();
                jak0Var2.b();
                return invoke;
            } finally {
                dak0.q(j2);
            }
        } catch (Throwable th) {
            u.c();
            throw th;
        }
    }
}
