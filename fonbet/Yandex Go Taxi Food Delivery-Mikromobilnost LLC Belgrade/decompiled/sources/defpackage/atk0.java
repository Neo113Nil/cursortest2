package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class atk0 implements ctk0 {
    public final au2 a;

    public atk0(au2 au2Var) {
        this.a = au2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof atk0) && this.a == ((atk0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Content(appIcon=" + this.a + Extension.C_BRAKE;
    }
}
