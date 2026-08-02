package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jis implements kis {
    public final sls a;

    public jis(sls slsVar) {
        this.a = slsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jis) && this.a.equals(((jis) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(applyMedia=" + this.a + Extension.C_BRAKE;
    }
}
