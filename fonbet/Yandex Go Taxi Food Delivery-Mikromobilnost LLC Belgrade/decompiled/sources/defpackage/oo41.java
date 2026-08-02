package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class oo41 extends ro41 {
    public final Exception a;
    public final String b;

    public oo41(Exception exc, String str) {
        this.a = exc;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo41)) {
            return false;
        }
        oo41 oo41Var = (oo41) obj;
        return this.a.equals(oo41Var.a) && jl40.l(this.b, oo41Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "FailedNavigation(error=" + this.a + ", url=" + this.b + Extension.C_BRAKE;
    }
}
