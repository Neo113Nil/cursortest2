package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class o711 implements s711 {
    public final h711 a;

    public o711(h711 h711Var) {
        this.a = h711Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o711) && jl40.l(this.a, ((o711) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnDetailRouteItemClicked(item=" + this.a + Extension.C_BRAKE;
    }
}
