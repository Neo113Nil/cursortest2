package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class oq extends lr {
    public final hki a;

    public oq(hki hkiVar) {
        this.a = hkiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oq) && jl40.l(this.a, ((oq) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PhotocommentCameraChosen(pointType=" + this.a + Extension.C_BRAKE;
    }
}
