package xsna;

import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.miniapps.impl.picture_in_picture.feature.data.MiniAppNetworkState;

/* compiled from: MiniAppCallPiPSpeakerInfo.kt */
/* loaded from: classes7.dex */
public final class uo20 {
    public final CallMemberId a;
    public final String b;
    public final sew0 c;
    public final boolean d;
    public final MiniAppNetworkState e;
    public final boolean f;

    public uo20(CallMemberId callMemberId, String str, sew0 sew0Var, boolean z, MiniAppNetworkState miniAppNetworkState, boolean z2) {
        this.a = callMemberId;
        this.b = str;
        this.c = sew0Var;
        this.d = z;
        this.e = miniAppNetworkState;
        this.f = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo20)) {
            return false;
        }
        uo20 uo20Var = (uo20) obj;
        return epx.f(this.a, uo20Var.a) && epx.f(this.b, uo20Var.b) && epx.f(this.c, uo20Var.c) && this.d == uo20Var.d && this.e == uo20Var.e && this.f == uo20Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + ((this.e.hashCode() + qoy.b((this.c.hashCode() + urd0.a(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MiniAppCallPiPSpeakerInfo(id=");
        sb.append(this.a);
        sb.append(", firstName=");
        sb.append(this.b);
        sb.append(", avatar=");
        sb.append(this.c);
        sb.append(", isMe=");
        sb.append(this.d);
        sb.append(", networkState=");
        sb.append(this.e);
        sb.append(", isConnected=");
        return defpackage.q0.a(sb, this.f, ')');
    }
}
