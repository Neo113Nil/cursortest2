package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ol80 implements pl80 {
    public final yl80 a;

    public ol80(yl80 yl80Var) {
        this.a = yl80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ol80) && jl40.l(this.a, ((ol80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdatePlacesPayload(payload=" + this.a + Extension.C_BRAKE;
    }
}
