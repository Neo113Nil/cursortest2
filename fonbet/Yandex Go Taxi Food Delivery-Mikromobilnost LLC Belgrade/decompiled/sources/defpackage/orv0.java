package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class orv0 extends prv0 {
    public final hlx0 a;
    public final String b;
    public final String c;
    public final drv0 d;
    public final i36 e;

    public orv0(hlx0 hlx0Var, String str, String str2, drv0 drv0Var, i36 i36Var) {
        this.a = hlx0Var;
        this.b = str;
        this.c = str2;
        this.d = drv0Var;
        this.e = i36Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orv0)) {
            return false;
        }
        orv0 orv0Var = (orv0) obj;
        return jl40.l(this.a, orv0Var.a) && jl40.l(this.b, orv0Var.b) && jl40.l(this.c, orv0Var.c) && jl40.l(this.d, orv0Var.d) && jl40.l(this.e, orv0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31;
        i36 i36Var = this.e;
        return hashCode + (i36Var == null ? 0 : i36Var.hashCode());
    }

    public final String toString() {
        return "Visible(widgetData=" + this.a + ", accessibilityTitle=" + this.b + ", accessibilityHint=" + this.c + ", analyticsInfo=" + this.d + ", blizzardUiState=" + this.e + Extension.C_BRAKE;
    }
}
