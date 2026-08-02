package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class bvd implements dvd {
    public final fvd a;

    public bvd(fvd fvdVar) {
        this.a = fvdVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bvd) && jl40.l(this.a, ((bvd) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Shown(uiState=" + this.a + Extension.C_BRAKE;
    }
}
