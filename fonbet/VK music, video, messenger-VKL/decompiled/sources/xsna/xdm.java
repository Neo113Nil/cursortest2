package xsna;

import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;

/* compiled from: DialogGetAllMembersCmd.kt */
@ozl
/* loaded from: classes2.dex */
public final class xdm extends le6<xpp<ohm>> {
    public final Peer b;
    public final Source c;
    public final boolean d;
    public final Object e;

    public xdm(Peer peer, Source source, boolean z, Object obj) {
        this.b = peer;
        this.c = source;
        this.d = z;
        this.e = obj;
    }

    @Override // xsna.le6
    public final xpp<ohm> e(w2w w2wVar) {
        dem demVar = (dem) w2wVar.L0(this, new cem(this.b, this.c, this.d, this.e, null, null));
        if (demVar.b) {
            com.vk.metrics.eventtracking.b.a.q(new IllegalStateException("Expect no more items in this scenario: " + this.b + ' ' + this.c + ' ' + this.d));
        }
        return demVar.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xdm)) {
            return false;
        }
        xdm xdmVar = (xdm) obj;
        return epx.f(this.b, xdmVar.b) && this.c == xdmVar.c && this.d == xdmVar.d && epx.f(this.e, xdmVar.e);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        int b = qoy.b(io.reactivex.rxjava3.internal.operators.mixed.k.c(Long.hashCode(this.b.b) * 31, 31, this.c), 31, this.d);
        Object obj = this.e;
        return b + (obj == null ? 0 : obj.hashCode());
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogGetAllMembersCmd(peer=");
        sb.append(this.b);
        sb.append(", source=");
        sb.append(this.c);
        sb.append(", isAwaitNetwork=");
        sb.append(this.d);
        sb.append(", changerTag=");
        return k73.c(sb, this.e, ')');
    }
}
