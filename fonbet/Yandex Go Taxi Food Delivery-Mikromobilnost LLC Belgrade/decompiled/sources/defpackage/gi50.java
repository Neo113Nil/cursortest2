package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class gi50 extends ji50 {
    public final String a;

    public gi50(String str) {
        this.a = str;
    }

    @Override // defpackage.ji50
    public final d51 b() {
        return c51.a;
    }

    @Override // defpackage.ji50
    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gi50) && this.a.equals(((gi50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Deeplink(tariffClass=", this.a, Extension.C_BRAKE);
    }
}
