package xsna;

import xsna.gwu;

/* compiled from: CommunityPriorityBlockServicesItemModel.kt */
/* loaded from: classes5.dex */
public final class wdh extends s4h {
    public static final bpn0 e = new bpn0(new f84(8));
    public final gwu.b b;
    public final tbd0 c;
    public final rvw d;

    public wdh(gwu.b bVar, tbd0 tbd0Var, rvw rvwVar) {
        this.b = bVar;
        this.c = tbd0Var;
        this.d = rvwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wdh)) {
            return false;
        }
        wdh wdhVar = (wdh) obj;
        return epx.f(this.b, wdhVar.b) && epx.f(this.c, wdhVar.c) && epx.f(this.d, wdhVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + (this.b.hashCode() * 31)) * 31;
        rvw rvwVar = this.d;
        return hashCode + (rvwVar == null ? 0 : rvwVar.hashCode());
    }

    public final String toString() {
        return "CommunityPriorityBlockServicesItemModel(title=" + this.b + ", content=" + this.c + ", infoBlock=" + this.d + ')';
    }
}
