package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class hi51 extends gu91 {
    public final String f;

    public hi51(String str) {
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hi51) && this.f.equals(((hi51) obj).f);
    }

    public final int hashCode() {
        return this.f.hashCode();
    }

    public final String toString() {
        return oyr.p("ChangePhoneNumber(applicationId=", this.f, Extension.C_BRAKE);
    }
}
