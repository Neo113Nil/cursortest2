package xsna;

import com.vk.im.engine.models.messages.Msg;
import java.util.List;

/* compiled from: OnChannelMsgSentEvent.kt */
/* loaded from: classes2.dex */
public final class n280 extends sxp {
    public final String b = "ChannelMsgSendViaBgCmd";
    public final long c;
    public final List<Msg> d;

    public n280(long j, List list) {
        this.c = j;
        this.d = list;
    }

    @Override // xsna.sxp
    public final Object a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n280)) {
            return false;
        }
        n280 n280Var = (n280) obj;
        return epx.f(this.b, n280Var.b) && this.c == n280Var.c && epx.f(this.d, n280Var.d);
    }

    public final int hashCode() {
        String str = this.b;
        return this.d.hashCode() + bh10.a((str == null ? 0 : str.hashCode()) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnChannelMsgSentEvent(changerTag=");
        sb.append((Object) this.b);
        sb.append(", channelId=");
        sb.append(this.c);
        sb.append(", messages=");
        return ms9.a(')', sb, this.d);
    }
}
