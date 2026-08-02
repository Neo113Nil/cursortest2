package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ky {
    public final String a;
    public final sls b;

    public ky(String str, sls slsVar, int i) {
        this.a = (i & 2) != 0 ? null : str;
        this.b = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky)) {
            return false;
        }
        ky kyVar = (ky) obj;
        return jl40.l(this.a, kyVar.a) && jl40.l(this.b, kyVar.b);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(true) * 31;
        String str = this.a;
        return this.b.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ActionState(enabled=true, onClickLabel=" + this.a + ", onClick=" + this.b + Extension.C_BRAKE;
    }
}
