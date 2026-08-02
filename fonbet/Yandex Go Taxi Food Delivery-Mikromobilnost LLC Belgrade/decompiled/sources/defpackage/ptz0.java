package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class ptz0 implements rtz0 {
    public final rbv a;

    public ptz0(rbv rbvVar) {
        this.a = rbvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ptz0) && jl40.l(this.a, ((ptz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Image(image=" + this.a + Extension.C_BRAKE;
    }
}
