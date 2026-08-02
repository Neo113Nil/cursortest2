package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class nl80 implements pl80 {
    public final yl80 a;

    public nl80(yl80 yl80Var) {
        this.a = yl80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nl80) && jl40.l(this.a, ((nl80) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UpdateMapOverlayPayload(payload=" + this.a + Extension.C_BRAKE;
    }
}
