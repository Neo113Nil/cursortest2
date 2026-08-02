package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class bd71 extends ij71 {
    public final vuz a;

    public bd71(vuz vuzVar) {
        this.a = vuzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bd71) && jl40.l(this.a, ((bd71) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Error(error=" + this.a + Extension.C_BRAKE;
    }
}
