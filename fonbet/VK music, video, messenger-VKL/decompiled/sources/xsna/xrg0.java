package xsna;

import androidx.constraintlayout.core.widgets.ConstraintWidget;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: RunGroup.java */
/* loaded from: classes11.dex */
public final class xrg0 {
    public final pnx0 a;
    public final ArrayList<pnx0> b = new ArrayList<>();

    public xrg0(pnx0 pnx0Var) {
        this.a = null;
        this.a = pnx0Var;
    }

    public static long c(mzl mzlVar, long j) {
        pnx0 pnx0Var = mzlVar.d;
        ArrayList arrayList = mzlVar.k;
        if (pnx0Var instanceof c2v) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            hzl hzlVar = (hzl) arrayList.get(i);
            if (hzlVar instanceof mzl) {
                mzl mzlVar2 = (mzl) hzlVar;
                if (mzlVar2.d != pnx0Var) {
                    j2 = Math.min(j2, c(mzlVar2, mzlVar2.f + j));
                }
            }
        }
        mzl mzlVar3 = pnx0Var.i;
        mzl mzlVar4 = pnx0Var.h;
        if (mzlVar != mzlVar3) {
            return j2;
        }
        long j3 = j - pnx0Var.j();
        return Math.min(Math.min(j2, c(mzlVar4, j3)), j3 - mzlVar4.f);
    }

    public static long d(mzl mzlVar, long j) {
        pnx0 pnx0Var = mzlVar.d;
        ArrayList arrayList = mzlVar.k;
        if (pnx0Var instanceof c2v) {
            return j;
        }
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            hzl hzlVar = (hzl) arrayList.get(i);
            if (hzlVar instanceof mzl) {
                mzl mzlVar2 = (mzl) hzlVar;
                if (mzlVar2.d != pnx0Var) {
                    j2 = Math.max(j2, d(mzlVar2, mzlVar2.f + j));
                }
            }
        }
        mzl mzlVar3 = pnx0Var.h;
        mzl mzlVar4 = pnx0Var.i;
        if (mzlVar != mzlVar3) {
            return j2;
        }
        long j3 = pnx0Var.j() + j;
        return Math.max(Math.max(j2, d(mzlVar4, j3)), j3 - mzlVar4.f);
    }

    public final void a(pnx0 pnx0Var) {
        this.b.add(pnx0Var);
    }

    public final long b(androidx.constraintlayout.core.widgets.d dVar, int i) {
        float f;
        pnx0 pnx0Var = this.a;
        if (!(pnx0Var instanceof era) ? i != 0 ? (pnx0Var instanceof fpr0) : (pnx0Var instanceof yfv) : ((era) pnx0Var).f == i) {
            return 0L;
        }
        mzl mzlVar = (i == 0 ? dVar.d : dVar.e).h;
        mzl mzlVar2 = (i == 0 ? dVar.d : dVar.e).i;
        boolean contains = pnx0Var.h.l.contains(mzlVar);
        boolean contains2 = pnx0Var.i.l.contains(mzlVar2);
        long j = pnx0Var.j();
        if (!contains || !contains2) {
            if (contains) {
                return Math.max(d(pnx0Var.h, r13.f), pnx0Var.h.f + j);
            }
            if (!contains2) {
                return (pnx0Var.j() + pnx0Var.h.f) - pnx0Var.i.f;
            }
            return Math.max(-c(pnx0Var.i, r13.f), (-pnx0Var.i.f) + j);
        }
        long d = d(pnx0Var.h, 0L);
        long c = c(pnx0Var.i, 0L);
        long j2 = d - j;
        int i2 = pnx0Var.i.f;
        if (j2 >= (-i2)) {
            j2 += i2;
        }
        long j3 = pnx0Var.h.f;
        long j4 = ((-c) - j) - j3;
        if (j4 >= j3) {
            j4 -= j3;
        }
        ConstraintWidget constraintWidget = pnx0Var.b;
        if (i == 0) {
            f = constraintWidget.g0;
        } else if (i == 1) {
            f = constraintWidget.h0;
        } else {
            constraintWidget.getClass();
            f = -1.0f;
        }
        float f2 = f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? (long) ((j2 / (1.0f - f)) + (j4 / f)) : 0L;
        return (pnx0Var.h.f + ((((long) ((f2 * f) + 0.5f)) + j) + ((long) u11.b(1.0f, f, f2, 0.5f)))) - pnx0Var.i.f;
    }
}
