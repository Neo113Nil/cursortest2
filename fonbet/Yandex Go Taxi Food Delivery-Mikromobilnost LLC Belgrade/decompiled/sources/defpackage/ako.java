package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class ako implements p651 {
    public final p651 a;
    public final p651 b;

    public ako(p651 p651Var, p651 p651Var2) {
        this.a = p651Var;
        this.b = p651Var2;
    }

    @Override // defpackage.p651
    public final int a(fwi fwiVar) {
        int a = this.a.a(fwiVar) - this.b.a(fwiVar);
        if (a < 0) {
            return 0;
        }
        return a;
    }

    @Override // defpackage.p651
    public final int b(fwi fwiVar, LayoutDirection layoutDirection) {
        int b = this.a.b(fwiVar, layoutDirection) - this.b.b(fwiVar, layoutDirection);
        if (b < 0) {
            return 0;
        }
        return b;
    }

    @Override // defpackage.p651
    public final int c(fwi fwiVar) {
        int c = this.a.c(fwiVar) - this.b.c(fwiVar);
        if (c < 0) {
            return 0;
        }
        return c;
    }

    @Override // defpackage.p651
    public final int d(fwi fwiVar, LayoutDirection layoutDirection) {
        int d = this.a.d(fwiVar, layoutDirection) - this.b.d(fwiVar, layoutDirection);
        if (d < 0) {
            return 0;
        }
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ako)) {
            return false;
        }
        ako akoVar = (ako) obj;
        return jl40.l(akoVar.a, this.a) && jl40.l(akoVar.b, this.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return Extension.O_BRAKE + this.a + " - " + this.b + ')';
    }
}
