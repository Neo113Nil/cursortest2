package xsna;

import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;

/* compiled from: ChannelWithLastMessageApiModel.kt */
/* loaded from: classes2.dex */
public final class eeb implements nuu {
    public final yta a;
    public final Msg b;

    public eeb(yta ytaVar, MsgFromChannel msgFromChannel) {
        this.a = ytaVar;
        this.b = msgFromChannel;
    }

    @Override // xsna.nuu
    public final Msg G0() {
        return this.b;
    }

    public final yta a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eeb)) {
            return false;
        }
        eeb eebVar = (eeb) obj;
        return epx.f(this.a, eebVar.a) && epx.f(this.b, eebVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Msg msg = this.b;
        return hashCode + (msg == null ? 0 : msg.hashCode());
    }

    public final String toString() {
        return "ChannelWithLastMessageApiModel(channel=" + this.a + ", lastMessage=" + this.b + ')';
    }
}
