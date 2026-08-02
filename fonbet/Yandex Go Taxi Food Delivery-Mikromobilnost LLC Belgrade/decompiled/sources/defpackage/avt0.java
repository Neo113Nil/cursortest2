package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class avt0 implements cvt0 {
    public final kao a;

    public avt0(kao kaoVar) {
        this.a = kaoVar;
    }

    public final kao a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof avt0) && this.a == ((avt0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return ly3.n("Error(errorViewState=", this.a, Extension.C_BRAKE);
    }
}
