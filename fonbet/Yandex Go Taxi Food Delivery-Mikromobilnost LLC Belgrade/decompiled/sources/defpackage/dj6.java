package defpackage;

import androidx.compose.foundation.layout.BoxScopeInstance$align$$inlined$debugInspectorInfo$1;
import androidx.compose.foundation.layout.BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1;
import androidx.compose.ui.platform.m;

/* loaded from: classes10.dex */
public final class dj6 implements bj6 {
    public final fwi a;
    public final long b;

    public dj6(tyu0 tyu0Var, long j) {
        this.a = tyu0Var;
        this.b = j;
    }

    @Override // defpackage.bj6
    public final f530 a(f530 f530Var, jt1 jt1Var) {
        return f530Var.k(new mi6(jt1Var, false, m.b ? new BoxScopeInstance$align$$inlined$debugInspectorInfo$1(jt1Var) : m.a()));
    }

    @Override // defpackage.bj6
    public final f530 b(f530 f530Var) {
        return f530Var.k(new mi6(x4c.y, true, m.b ? new BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1() : m.a()));
    }

    public final float c() {
        long j = this.b;
        if (!n8e.d(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.H(n8e.h(j));
    }

    public final float d() {
        long j = this.b;
        if (!n8e.e(j)) {
            return Float.POSITIVE_INFINITY;
        }
        return this.a.H(n8e.i(j));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dj6)) {
            return false;
        }
        dj6 dj6Var = (dj6) obj;
        return jl40.l(this.a, dj6Var.a) && n8e.c(this.b, dj6Var.b);
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BoxWithConstraintsScopeImpl(density=" + this.a + ", constraints=" + ((Object) n8e.l(this.b)) + ')';
    }
}
