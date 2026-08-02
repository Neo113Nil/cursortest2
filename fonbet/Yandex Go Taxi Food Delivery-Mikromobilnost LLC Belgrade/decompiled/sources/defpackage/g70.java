package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Pair;
import android.util.Range;
import androidx.lifecycle.v;
import java.util.Iterator;

/* loaded from: classes10.dex */
public final class g70 extends x9s {
    public final ar7 b;
    public final m0r0 c;
    public final jp7 d;
    public v e;

    public g70(ar7 ar7Var, jp7 jp7Var) {
        super(ar7Var);
        this.e = null;
        this.b = ar7Var;
        this.d = jp7Var;
        this.c = jp7Var.u();
        x34 x34Var = jp7.o1;
        Boolean bool = Boolean.FALSE;
        ((Boolean) jp7Var.g(x34Var, bool)).getClass();
        ((Boolean) jp7Var.g(jp7.r1, bool)).getClass();
    }

    public static float C(float f, float f2, float f3) {
        if (f3 == f2) {
            return 0.0f;
        }
        if (f == f3) {
            return 1.0f;
        }
        if (f == f2) {
            return 0.0f;
        }
        float f4 = 1.0f / f2;
        return ((1.0f / f) - f4) / ((1.0f / f3) - f4);
    }

    public static float D(float f, float f2, float f3) {
        if (f == 1.0f) {
            return f3;
        }
        if (f == 0.0f) {
            return f2;
        }
        double d = 1.0f / f2;
        double d2 = 1.0d / ((((1.0f / f3) - d) * f) + d);
        double d3 = f2;
        double d4 = f3;
        if (d2 < d3) {
            d2 = d3;
        } else if (d2 > d4) {
            d2 = d4;
        }
        return (float) d2;
    }

    @Override // defpackage.x9s, defpackage.ar7
    public final ar7 getImplementation() {
        return this.b;
    }

    @Override // defpackage.x9s, defpackage.ar7
    public final v k() {
        m0r0 m0r0Var = this.c;
        if (!fab1.a(m0r0Var, 0)) {
            return new dy40(new y64(1.0f, 1.0f, 1.0f, 0.0f));
        }
        ar7 ar7Var = this.b;
        if (m0r0Var != null) {
            kf61 kf61Var = (kf61) ar7Var.k().d();
            Range m = m0r0Var.m();
            if (m != null && (((Float) m.getLower()).floatValue() != kf61Var.c() || ((Float) m.getUpper()).floatValue() != kf61Var.a())) {
                if (this.e == null) {
                    this.e = efb1.c(ar7Var.k(), new m6(1, m));
                }
                return this.e;
            }
        }
        return ar7Var.k();
    }

    @Override // defpackage.x9s, defpackage.ar7
    public final boolean p() {
        if (fab1.a(this.c, 5)) {
            return this.b.p();
        }
        return false;
    }

    @Override // defpackage.x9s, defpackage.ar7
    public final boolean t() {
        int[] iArr;
        m0r0 m0r0Var = this.c;
        if (m0r0Var != null) {
            Iterator it = m0r0Var.l().iterator();
            while (true) {
                if (!it.hasNext()) {
                    iArr = null;
                    break;
                }
                Pair pair = (Pair) it.next();
                if (((CameraCharacteristics.Key) pair.first).equals(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
                    iArr = (int[]) pair.second;
                    break;
                }
            }
            if (iArr != null) {
                for (int i : iArr) {
                    if (i == 1) {
                        return true;
                    }
                }
                return false;
            }
        }
        return this.a.t();
    }

    @Override // defpackage.x9s, defpackage.ar7
    public final v u() {
        return !fab1.a(this.c, 6) ? new dy40(0) : this.b.u();
    }

    @Override // defpackage.x9s, defpackage.ar7
    public final gvo v() {
        return !fab1.a(this.c, 7) ? new f70() : this.b.v();
    }
}
