package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class oia implements pia {
    public final String a;
    public final bia b;

    public oia(String str, bia biaVar) {
        this.a = str;
        this.b = biaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oia)) {
            return false;
        }
        oia oiaVar = (oia) obj;
        return jl40.l(this.a, oiaVar.a) && this.b.equals(oiaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(passId=" + this.a + ", content=" + this.b + Extension.C_BRAKE;
    }
}
