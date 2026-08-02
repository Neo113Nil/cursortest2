package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public final class k131 implements p651 {
    public final String a;
    public final oz40 b;

    public k131(s2w s2wVar, String str) {
        this.a = str;
        this.b = f.j(s2wVar);
    }

    @Override // defpackage.p651
    public final int a(fwi fwiVar) {
        return e().d;
    }

    @Override // defpackage.p651
    public final int b(fwi fwiVar, LayoutDirection layoutDirection) {
        return e().c;
    }

    @Override // defpackage.p651
    public final int c(fwi fwiVar) {
        return e().b;
    }

    @Override // defpackage.p651
    public final int d(fwi fwiVar, LayoutDirection layoutDirection) {
        return e().a;
    }

    public final s2w e() {
        return (s2w) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k131) {
            return jl40.l(e(), ((k131) obj).e());
        }
        return false;
    }

    public final void f(s2w s2wVar) {
        this.b.setValue(s2wVar);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append("(left=");
        sb.append(e().a);
        sb.append(", top=");
        sb.append(e().b);
        sb.append(", right=");
        sb.append(e().c);
        sb.append(", bottom=");
        return oyr.s(sb, e().d, ')');
    }
}
