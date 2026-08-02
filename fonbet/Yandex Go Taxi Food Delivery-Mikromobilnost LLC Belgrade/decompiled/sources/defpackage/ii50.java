package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class ii50 extends ji50 {
    public final String a;

    public ii50(String str) {
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
        return (obj instanceof ii50) && this.a.equals(((ii50) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return oyr.p("Summary(tariffClass=", this.a, Extension.C_BRAKE);
    }
}
