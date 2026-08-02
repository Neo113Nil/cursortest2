package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.node.r;
import java.util.List;

/* loaded from: classes10.dex */
public final class hl40 implements z910 {
    public final gl40 a;

    public hl40(gl40 gl40Var) {
        this.a = gl40Var;
    }

    @Override // defpackage.z910
    public final aa10 b(k kVar, List list, long j) {
        return this.a.b(kVar, r.a(kVar), j);
    }

    @Override // defpackage.z910
    public final int e(yuw yuwVar, List list, int i) {
        return this.a.e(yuwVar, r.a(yuwVar), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hl40) && jl40.l(this.a, ((hl40) obj).a);
    }

    @Override // defpackage.z910
    public final int f(yuw yuwVar, List list, int i) {
        return this.a.f(yuwVar, r.a(yuwVar), i);
    }

    @Override // defpackage.z910
    public final int g(yuw yuwVar, List list, int i) {
        return this.a.g(yuwVar, r.a(yuwVar), i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.z910
    public final int i(yuw yuwVar, List list, int i) {
        return this.a.i(yuwVar, r.a(yuwVar), i);
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
