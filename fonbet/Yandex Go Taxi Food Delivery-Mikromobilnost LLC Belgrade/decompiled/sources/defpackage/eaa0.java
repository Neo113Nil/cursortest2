package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class eaa0 implements faa0 {
    public final h9a0 a;

    public eaa0(h9a0 h9a0Var) {
        this.a = h9a0Var;
    }

    public final h9a0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eaa0) && this.a.equals(((eaa0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "WithAttachment(attachment=" + this.a + Extension.C_BRAKE;
    }
}
