package xsna;

import com.vk.channels.api.Channel;
import com.vk.im.engine.models.messages.Msg;

/* compiled from: ChannelMsgSearchItem.kt */
/* loaded from: classes16.dex */
public final class n5b implements hfz {
    public final Msg b;
    public final CharSequence c;
    public final Channel d;

    public n5b(Msg msg, CharSequence charSequence, Channel channel) {
        this.b = msg;
        this.c = charSequence;
        this.d = channel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5b)) {
            return false;
        }
        n5b n5bVar = (n5b) obj;
        return epx.f(this.b, n5bVar.b) && epx.f(this.c, n5bVar.c) && epx.f(this.d, n5bVar.d);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Long.valueOf(this.b.d);
    }

    public final int hashCode() {
        int c = u11.c(this.b.hashCode() * 31, 31, this.c);
        Channel channel = this.d;
        return c + (channel == null ? 0 : channel.hashCode());
    }

    public final String toString() {
        return "ChannelMsgSearchItem(msg=" + this.b + ", body=" + ((Object) this.c) + ", channel=" + this.d + ')';
    }
}
