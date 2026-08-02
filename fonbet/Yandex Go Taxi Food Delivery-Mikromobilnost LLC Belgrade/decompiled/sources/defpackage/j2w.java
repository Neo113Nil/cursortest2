package defpackage;

import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public final class j2w implements j690 {
    public final p651 b;
    public final fwi c;

    public j2w(p651 p651Var, fwi fwiVar) {
        this.b = p651Var;
        this.c = fwiVar;
    }

    @Override // defpackage.j690
    public final float a() {
        p651 p651Var = this.b;
        fwi fwiVar = this.c;
        return fwiVar.H(p651Var.a(fwiVar));
    }

    @Override // defpackage.j690
    public final float b(LayoutDirection layoutDirection) {
        p651 p651Var = this.b;
        fwi fwiVar = this.c;
        return fwiVar.H(p651Var.d(fwiVar, layoutDirection));
    }

    @Override // defpackage.j690
    public final float c(LayoutDirection layoutDirection) {
        p651 p651Var = this.b;
        fwi fwiVar = this.c;
        return fwiVar.H(p651Var.b(fwiVar, layoutDirection));
    }

    @Override // defpackage.j690
    public final float d() {
        p651 p651Var = this.b;
        fwi fwiVar = this.c;
        return fwiVar.H(p651Var.c(fwiVar));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2w)) {
            return false;
        }
        j2w j2wVar = (j2w) obj;
        return jl40.l(this.b, j2wVar.b) && jl40.l(this.c, j2wVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "InsetsPaddingValues(insets=" + this.b + ", density=" + this.c + ')';
    }
}
