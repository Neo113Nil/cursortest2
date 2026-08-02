package defpackage;

import android.util.Range;
import java.util.Collections;

/* loaded from: classes10.dex */
public final class e70 extends w9s {
    public final qp7 c;
    public final m0r0 d;

    public e70(qp7 qp7Var, m0r0 m0r0Var) {
        super(qp7Var);
        this.c = qp7Var;
        this.d = m0r0Var;
    }

    @Override // defpackage.w9s, defpackage.qp7
    public final euy b(float f) {
        Range m;
        m0r0 m0r0Var = this.d;
        if (!fab1.a(m0r0Var, 0)) {
            return new hiv(1, new IllegalStateException("Zoom is not supported"));
        }
        qp7 qp7Var = this.c;
        if (m0r0Var != null && (m = m0r0Var.m()) != null) {
            return (f > 1.0f || f < 0.0f) ? new hiv(1, new IllegalArgumentException(x4e.f("Requested linearZoom ", " is not within valid range [0..1]", f))) : qp7Var.d(g70.D(f, ((Float) m.getLower()).floatValue(), ((Float) m.getUpper()).floatValue()));
        }
        return qp7Var.b(f);
    }

    @Override // defpackage.w9s, defpackage.qp7
    public final euy d(float f) {
        Range m;
        m0r0 m0r0Var = this.d;
        if (!fab1.a(m0r0Var, 0)) {
            return new hiv(1, new IllegalStateException("Zoom is not supported"));
        }
        if (m0r0Var == null || (m = m0r0Var.m()) == null || (f >= ((Float) m.getLower()).floatValue() && f <= ((Float) m.getUpper()).floatValue())) {
            return this.c.d(f);
        }
        return new hiv(1, new IllegalArgumentException("Requested zoomRatio " + f + " is not within valid range [" + m.getLower() + " , " + m.getUpper() + "]"));
    }

    @Override // defpackage.w9s, defpackage.qp7
    public final euy f(boolean z) {
        return !fab1.a(this.d, 6) ? new hiv(1, new IllegalStateException("Torch is not supported")) : this.c.f(z);
    }

    @Override // defpackage.w9s, defpackage.qp7
    public final qp7 getImplementation() {
        return this.c;
    }

    @Override // defpackage.w9s, defpackage.qp7
    public final euy j(fur furVar) {
        boolean z;
        m0r0 m0r0Var = this.d;
        if (m0r0Var != null) {
            eur eurVar = new eur(furVar);
            if (furVar.a.isEmpty() || fab1.a(m0r0Var, 1, 2)) {
                z = false;
            } else {
                eurVar.b(1);
                z = true;
            }
            if (!furVar.b.isEmpty() && !fab1.a(m0r0Var, 3)) {
                eurVar.b(2);
                z = true;
            }
            if (!furVar.c.isEmpty() && !fab1.a(m0r0Var, 4)) {
                eurVar.b(4);
                z = true;
            }
            if (z) {
                furVar = (Collections.unmodifiableList(eurVar.a).isEmpty() && Collections.unmodifiableList(eurVar.b).isEmpty() && Collections.unmodifiableList(eurVar.c).isEmpty()) ? null : new fur(eurVar);
            }
        }
        return furVar == null ? new hiv(1, new IllegalStateException("FocusMetering is not supported")) : this.c.j(furVar);
    }

    @Override // defpackage.w9s, defpackage.qp7
    public final euy k(int i) {
        return !fab1.a(this.d, 7) ? new hiv(1, new IllegalStateException("ExposureCompensation is not supported")) : this.c.k(i);
    }

    @Override // defpackage.w9s, defpackage.qp7
    public final euy l() {
        return this.c.l();
    }
}
