package xsna;

import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import xsna.g1e0;

/* compiled from: InvalidateMembersCmd.kt */
/* loaded from: classes2.dex */
public final class opx extends le6<ProfilesInfo> {
    public final Msg b;
    public final Source c;

    public opx(Msg msg, Source source) {
        this.b = msg;
        this.c = source;
    }

    @Override // xsna.le6
    public final ProfilesInfo e(w2w w2wVar) {
        f1e0 a = lv30.a(this.b);
        g1e0.a aVar = new g1e0.a();
        aVar.a.e(a);
        aVar.b = this.c;
        aVar.c = true;
        aVar.d = m5j.a;
        return (ProfilesInfo) w2wVar.L0(this, new d1e0(new g1e0(aVar)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof opx)) {
            return false;
        }
        opx opxVar = (opx) obj;
        return epx.f(this.b, opxVar.b) && this.c == opxVar.c;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "InvalidateMembersCmd(msg=" + this.b + ", source=" + this.c + ')';
    }
}
