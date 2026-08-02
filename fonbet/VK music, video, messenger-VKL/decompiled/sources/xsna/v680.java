package xsna;

import com.vk.im.engine.events.JoiningToChannelError;

/* compiled from: OnJoiningToChannelErrorEvent.kt */
/* loaded from: classes2.dex */
public final class v680 extends sxp {
    public final long b;
    public final JoiningToChannelError c;

    public v680(long j, JoiningToChannelError joiningToChannelError) {
        this.b = j;
        this.c = joiningToChannelError;
    }

    @Override // xsna.sxp
    public final Object a() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v680)) {
            return false;
        }
        v680 v680Var = (v680) obj;
        return this.b == v680Var.b && this.c == v680Var.c;
    }

    public final int hashCode() {
        return (this.c.hashCode() + (Long.hashCode(this.b) * 31)) * 31;
    }

    public final String toString() {
        return "OnJoiningToChannelErrorEvent(channelId=" + this.b + ", error=" + this.c + ", changerTag=null)";
    }
}
