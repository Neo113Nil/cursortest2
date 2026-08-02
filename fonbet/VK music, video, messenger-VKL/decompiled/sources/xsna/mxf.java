package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: CnvMsgEditLpEvent.kt */
/* loaded from: classes2.dex */
public final class mxf implements e900 {
    public final Peer a;
    public final int b;
    public final Msg c;
    public final boolean d;

    public mxf(Peer peer, int i, Msg msg, boolean z) {
        this.a = peer;
        this.b = i;
        this.c = msg;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mxf)) {
            return false;
        }
        mxf mxfVar = (mxf) obj;
        return epx.f(this.a, mxfVar.a) && this.b == mxfVar.b && epx.f(this.c, mxfVar.c) && this.d == mxfVar.d;
    }

    public final int hashCode() {
        int a = shy.a(this.b, Long.hashCode(this.a.b) * 31, 31);
        Msg msg = this.c;
        return Boolean.hashCode(this.d) + ((a + (msg == null ? 0 : msg.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CnvMsgEditLpEvent(dialog=");
        sb.append(this.a);
        sb.append(", msgCnvId=");
        sb.append(this.b);
        sb.append(", msg=");
        sb.append(this.c);
        sb.append(", currentUserMentioned=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
