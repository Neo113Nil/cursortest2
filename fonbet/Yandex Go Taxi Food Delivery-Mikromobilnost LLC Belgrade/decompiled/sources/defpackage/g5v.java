package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class g5v {
    public final j7v a;
    public final String b;

    public g5v(j7v j7vVar, String str) {
        this.a = j7vVar;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5v)) {
            return false;
        }
        g5v g5vVar = (g5v) obj;
        return this.a.equals(g5vVar.a) && jl40.l(this.b, g5vVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "IconSpotState(icon=" + this.a + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
