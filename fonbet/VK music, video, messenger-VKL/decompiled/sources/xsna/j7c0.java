package xsna;

import com.vk.channels.impl.channel_screen.send_msg.ChannelMsgSendState;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;

/* compiled from: PostSettingsViewState.kt */
/* loaded from: classes16.dex */
public final class j7c0 implements ao50 {
    public final ChannelMsgSendConfig a;
    public final pp80 b;
    public final String c;
    public final ChannelMsgSendState d;
    public final boolean e;

    public j7c0(ChannelMsgSendConfig channelMsgSendConfig, pp80 pp80Var, String str, ChannelMsgSendState channelMsgSendState, boolean z) {
        this.a = channelMsgSendConfig;
        this.b = pp80Var;
        this.c = str;
        this.d = channelMsgSendState;
        this.e = z;
    }

    public static j7c0 a(j7c0 j7c0Var, ChannelMsgSendConfig channelMsgSendConfig, pp80 pp80Var, String str, ChannelMsgSendState channelMsgSendState, boolean z, int i) {
        if ((i & 1) != 0) {
            channelMsgSendConfig = j7c0Var.a;
        }
        ChannelMsgSendConfig channelMsgSendConfig2 = channelMsgSendConfig;
        if ((i & 2) != 0) {
            pp80Var = j7c0Var.b;
        }
        pp80 pp80Var2 = pp80Var;
        if ((i & 4) != 0) {
            str = j7c0Var.c;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            channelMsgSendState = j7c0Var.d;
        }
        ChannelMsgSendState channelMsgSendState2 = channelMsgSendState;
        if ((i & 16) != 0) {
            z = j7c0Var.e;
        }
        j7c0Var.getClass();
        return new j7c0(channelMsgSendConfig2, pp80Var2, str2, channelMsgSendState2, z);
    }

    public final boolean b() {
        ChannelMsgSendConfig channelMsgSendConfig = this.a;
        return channelMsgSendConfig.l() == null && this.b == null && !epx.f(channelMsgSendConfig.p(), Boolean.TRUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j7c0)) {
            return false;
        }
        j7c0 j7c0Var = (j7c0) obj;
        return epx.f(this.a, j7c0Var.a) && epx.f(this.b, j7c0Var.b) && epx.f(this.c, j7c0Var.c) && epx.f(this.d, j7c0Var.d) && this.e == j7c0Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        pp80 pp80Var = this.b;
        int hashCode2 = (hashCode + (pp80Var == null ? 0 : pp80Var.hashCode())) * 31;
        String str = this.c;
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + ((hashCode2 + (str != null ? str.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PostSettingsViewState(config=");
        sb.append(this.a);
        sb.append(", visibleToDonsOption=");
        sb.append(this.b);
        sb.append(", prevOrdErid=");
        sb.append(this.c);
        sb.append(", msgSendState=");
        sb.append(this.d);
        sb.append(", isPublishToStoryEnabled=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
