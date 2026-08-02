package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class m9x {
    public final String a;
    public final boolean b;

    public m9x(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m9x)) {
            return false;
        }
        m9x m9xVar = (m9x) obj;
        return jl40.l(this.a, m9xVar.a) && this.b == m9xVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return xvz.k("JoinLinkUiState(linkText=", this.a, ", isJoinButtonEnabled=", this.b, Extension.C_BRAKE);
    }

    public m9x() {
        this(0);
    }

    public /* synthetic */ m9x(int i) {
        this("", false);
    }
}
