package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class cni {
    public static final cni c = new cni(vuh.j, EmptyList.a);
    public final vuh a;
    public final List b;

    public cni(vuh vuhVar, List list) {
        this.a = vuhVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cni)) {
            return false;
        }
        cni cniVar = (cni) obj;
        return jl40.l(this.a, cniVar.a) && this.b.equals(cniVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeliveryRouteInfo(sourcePointInfo=" + this.a + ", destinationPointsInfo=" + this.b + Extension.C_BRAKE;
    }
}
