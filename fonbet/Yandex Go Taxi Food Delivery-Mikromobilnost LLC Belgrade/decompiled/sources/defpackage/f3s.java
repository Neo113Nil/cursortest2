package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class f3s implements h3s {
    public final bpc a;

    public f3s(bpc bpcVar) {
        this.a = bpcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3s) && this.a.equals(((f3s) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ResponseError(result=" + this.a + Extension.C_BRAKE;
    }
}
