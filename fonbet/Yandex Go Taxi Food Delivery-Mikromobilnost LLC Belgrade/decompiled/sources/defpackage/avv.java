package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class avv {
    public final LinkedHashMap a;
    public final joz0 b;
    public final jly c;
    public final zuv d;

    public avv(LinkedHashMap linkedHashMap, joz0 joz0Var, jly jlyVar, zuv zuvVar) {
        this.a = linkedHashMap;
        this.b = joz0Var;
        this.c = jlyVar;
        this.d = zuvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof avv)) {
            return false;
        }
        avv avvVar = (avv) obj;
        return this.a.equals(avvVar.a) && this.b.equals(avvVar.b) && this.c.equals(avvVar.c) && this.d.equals(avvVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "InitAdditionalVerifyResult(tokenizationContext=" + this.a + ", tokenizerInstance=" + this.b + ", linkedCardInfo=" + this.c + ", verificationIntent=" + this.d + Extension.C_BRAKE;
    }
}
