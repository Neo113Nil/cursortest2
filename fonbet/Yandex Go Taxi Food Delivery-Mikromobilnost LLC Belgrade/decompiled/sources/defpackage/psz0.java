package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class psz0 {
    public final au2 a;
    public final String b;
    public final etz0 c;

    public psz0(au2 au2Var, String str, etz0 etz0Var) {
        this.a = au2Var;
        this.b = str;
        this.c = etz0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof psz0) {
            psz0 psz0Var = (psz0) obj;
            if (this.a == psz0Var.a && jl40.l(this.b, psz0Var.b) && this.c.equals(psz0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ToolbarButtonUiState(appIcon=" + this.a + ", contentDescription=" + this.b + ", toolbarUiAction=" + this.c + Extension.C_BRAKE;
    }
}
