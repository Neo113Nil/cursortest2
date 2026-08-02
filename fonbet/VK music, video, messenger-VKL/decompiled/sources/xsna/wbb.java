package xsna;

import com.vk.channels.impl.channel_screen.send_msg.ChannelMsgSendState;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;

/* compiled from: ChannelSendMsgNavigationEvent.kt */
/* loaded from: classes16.dex */
public abstract class wbb implements vl50 {

    /* compiled from: ChannelSendMsgNavigationEvent.kt */
    public static final class a extends wbb {
        public final long a;
        public final ChannelMsgSendConfig b;
        public final ChannelMsgSendState c;

        public a(long j, ChannelMsgSendConfig channelMsgSendConfig, ChannelMsgSendState channelMsgSendState) {
            this.a = j;
            this.b = channelMsgSendConfig;
            this.c = channelMsgSendState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31);
        }

        public final String toString() {
            return "OpenPostSettings(channelId=" + this.a + ", config=" + this.b + ", state=" + this.c + ')';
        }
    }

    /* compiled from: ChannelSendMsgNavigationEvent.kt */
    public static final class b extends wbb {
        public final long a;

        public b(long j) {
            this.a = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("OpenPostponedPosts(channelId="));
        }
    }

    /* compiled from: ChannelSendMsgNavigationEvent.kt */
    public static final class c extends wbb {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenStory(ownerStoryId="), this.a, ')');
        }
    }
}
