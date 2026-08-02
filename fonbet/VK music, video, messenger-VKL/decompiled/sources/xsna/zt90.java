package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.messages.Msg;
import java.util.List;

/* compiled from: PeerMsgHistoryApiResult.kt */
/* loaded from: classes2.dex */
public final class zt90 {
    public final ut90 a;
    public final List<Msg> b;
    public final ProfilesSimpleInfo c;
    public final boolean d;
    public final boolean e;
    public final int f;

    /* JADX WARN: Multi-variable type inference failed */
    public zt90(ut90 ut90Var, List<? extends Msg> list, ProfilesSimpleInfo profilesSimpleInfo, boolean z, boolean z2, int i) {
        this.a = ut90Var;
        this.b = list;
        this.c = profilesSimpleInfo;
        this.d = z;
        this.e = z2;
        this.f = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt90)) {
            return false;
        }
        zt90 zt90Var = (zt90) obj;
        return epx.f(this.a, zt90Var.a) && epx.f(this.b, zt90Var.b) && epx.f(this.c, zt90Var.c) && this.d == zt90Var.d && this.e == zt90Var.e && this.f == zt90Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + qoy.b(qoy.b(io.reactivex.rxjava3.subjects.c.a(this.c, fw3.a(this.a.hashCode() * 31, 31, this.b), 31), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PeerMsgHistoryApiResult(peerInfo=");
        sb.append(this.a);
        sb.append(", history=");
        sb.append(this.b);
        sb.append(", profiles=");
        sb.append(this.c);
        sb.append(", hasHistoryBefore=");
        sb.append(this.d);
        sb.append(", hasHistoryAfter=");
        sb.append(this.e);
        sb.append(", anchorMsgCnvId=");
        return vu5.b(sb, this.f, ')');
    }
}
