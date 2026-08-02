package xsna;

import java.util.List;

/* compiled from: MultiContentMeasurePolicy.kt */
/* loaded from: classes11.dex */
public final class c540 implements cp10 {
    public final b540 a;

    public c540(b540 b540Var) {
        this.a = b540Var;
    }

    @Override // xsna.cp10
    public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
        return this.a.b(ep10Var, androidx.compose.ui.node.n.a(ep10Var), j);
    }

    @Override // xsna.cp10
    public final int c(apx apxVar, List<? extends zox> list, int i) {
        return this.a.c(apxVar, androidx.compose.ui.node.n.a(apxVar), i);
    }

    @Override // xsna.cp10
    public final int e(apx apxVar, List<? extends zox> list, int i) {
        return this.a.e(apxVar, androidx.compose.ui.node.n.a(apxVar), i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c540) && epx.f(this.a, ((c540) obj).a);
    }

    @Override // xsna.cp10
    public final int f(apx apxVar, List<? extends zox> list, int i) {
        return this.a.f(apxVar, androidx.compose.ui.node.n.a(apxVar), i);
    }

    @Override // xsna.cp10
    public final int g(apx apxVar, List<? extends zox> list, int i) {
        return this.a.g(apxVar, androidx.compose.ui.node.n.a(apxVar), i);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
