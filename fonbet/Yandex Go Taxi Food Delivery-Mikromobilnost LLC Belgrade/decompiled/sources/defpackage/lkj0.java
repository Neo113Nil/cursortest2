package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lkj0 implements qkj0 {
    public final au2 a;
    public final xlj0 b;
    public final String c;

    public lkj0(au2 au2Var, xlj0 xlj0Var, String str) {
        this.a = au2Var;
        this.b = xlj0Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof lkj0) {
            lkj0 lkj0Var = (lkj0) obj;
            if (this.a == lkj0Var.a && this.b.equals(lkj0Var.b) && jl40.l(this.c, lkj0Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ButtonUiState(appIcon=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", clickActionLabel=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
