package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class d7c0 implements vdc0 {
    public final lg80 a;
    public final String b;

    public d7c0(lg80 lg80Var, String str) {
        this.a = lg80Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d7c0)) {
            return false;
        }
        d7c0 d7c0Var = (d7c0) obj;
        hvj hvjVar = hvj.b;
        return hvjVar.equals(hvjVar) && this.a.equals(d7c0Var.a) && jl40.l(this.b, d7c0Var.b);
    }

    @Override // defpackage.vdc0
    public final lg80 getMode() {
        return this.a;
    }

    @Override // defpackage.vdc0
    public final svj getSource() {
        return hvj.b;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() - 682735896) * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacesDiscoveryMapOverlayRouterPayload(source=");
        sb.append(hvj.b);
        sb.append(", mode=");
        sb.append(this.a);
        sb.append(", layersContext=");
        return oyr.t(sb, this.b, Extension.C_BRAKE);
    }
}
