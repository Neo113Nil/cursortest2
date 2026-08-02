package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class emo {
    public final String a;
    public final ldc b;

    public emo(ldc ldcVar, String str) {
        this.a = str;
        this.b = ldcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof emo)) {
            return false;
        }
        emo emoVar = (emo) obj;
        return jl40.l(this.a, emoVar.a) && jl40.l(this.b, emoVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ldc ldcVar = this.b;
        return hashCode + (ldcVar == null ? 0 : Long.hashCode(ldcVar.a));
    }

    public final String toString() {
        return "ExistingProfileDescriptionState(text=" + this.a + ", textColor=" + this.b + Extension.C_BRAKE;
    }
}
