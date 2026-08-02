package defpackage;

import androidx.compose.ui.unit.LayoutDirection;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes10.dex */
public final class pfy implements p651 {
    public final p651 a;
    public final int b;

    public pfy(p651 p651Var, int i) {
        this.a = p651Var;
        this.b = i;
    }

    @Override // defpackage.p651
    public final int a(fwi fwiVar) {
        if ((this.b & 32) != 0) {
            return this.a.a(fwiVar);
        }
        return 0;
    }

    @Override // defpackage.p651
    public final int b(fwi fwiVar, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.Ltr ? 4 : 1) & this.b) != 0) {
            return this.a.b(fwiVar, layoutDirection);
        }
        return 0;
    }

    @Override // defpackage.p651
    public final int c(fwi fwiVar) {
        if ((this.b & 16) != 0) {
            return this.a.c(fwiVar);
        }
        return 0;
    }

    @Override // defpackage.p651
    public final int d(fwi fwiVar, LayoutDirection layoutDirection) {
        if (((layoutDirection == LayoutDirection.Ltr ? 8 : 2) & this.b) != 0) {
            return this.a.d(fwiVar, layoutDirection);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pfy)) {
            return false;
        }
        pfy pfyVar = (pfy) obj;
        return jl40.l(this.a, pfyVar.a) && this.b == pfyVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(Extension.O_BRAKE);
        sb.append(this.a);
        sb.append(" only ");
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i = this.b;
        int i2 = zm91.b;
        if ((i & i2) == i2) {
            zm91.b("Start", sb3);
        }
        int i3 = zm91.d;
        if ((i & i3) == i3) {
            zm91.b("Left", sb3);
        }
        if ((i & 16) == 16) {
            zm91.b("Top", sb3);
        }
        int i4 = zm91.c;
        if ((i & i4) == i4) {
            zm91.b("End", sb3);
        }
        int i5 = zm91.e;
        if ((i & i5) == i5) {
            zm91.b("Right", sb3);
        }
        if ((i & 32) == 32) {
            zm91.b("Bottom", sb3);
        }
        sb2.append(sb3.toString());
        sb2.append(')');
        sb.append((Object) sb2.toString());
        sb.append(')');
        return sb.toString();
    }
}
