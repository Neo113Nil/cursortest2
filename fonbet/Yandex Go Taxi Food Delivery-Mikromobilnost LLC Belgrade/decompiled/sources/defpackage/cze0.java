package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class cze0 implements fze0 {
    public final hmc a;

    public cze0(hmc hmcVar) {
        this.a = hmcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cze0) && this.a.equals(((cze0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Enabled(commentItem=" + this.a + Extension.C_BRAKE;
    }
}
