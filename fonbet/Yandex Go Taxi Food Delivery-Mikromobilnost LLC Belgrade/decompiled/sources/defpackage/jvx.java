package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class jvx implements ovx {
    public final sdm a;

    public jvx(sdm sdmVar) {
        this.a = sdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jvx) && jl40.l(this.a, ((jvx) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Discovery(payload=" + this.a + Extension.C_BRAKE;
    }
}
