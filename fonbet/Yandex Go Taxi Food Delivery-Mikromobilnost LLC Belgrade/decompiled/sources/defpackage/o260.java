package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class o260 implements s260 {
    public final r460 a;

    public o260(r460 r460Var) {
        this.a = r460Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o260) && this.a.equals(((o260) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenPrompt(screen=" + this.a + Extension.C_BRAKE;
    }
}
