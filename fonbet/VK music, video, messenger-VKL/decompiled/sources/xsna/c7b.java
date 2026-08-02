package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import java.util.Collections;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import xsna.uj70;

/* compiled from: ChannelNotificationsSettingsChangeCmd.kt */
/* loaded from: classes2.dex */
public final class c7b extends le6<s3q0> {
    public final Peer b;
    public final uj70 c;

    public c7b(Peer peer, uj70 uj70Var) {
        this.b = peer;
        this.c = uj70Var;
    }

    public static ChannelNotificationsSettings f(uj70 uj70Var) {
        if (uj70Var instanceof uj70.b) {
            return new ChannelNotificationsSettings(true, 0L, 2, null);
        }
        if (uj70Var instanceof uj70.a) {
            return new ChannelNotificationsSettings(false, ((uj70.a) uj70Var).a);
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // xsna.le6
    public final s3q0 e(w2w w2wVar) {
        w2wVar.O0().c(new mb(this, 19));
        uib a = w2wVar.I0().a();
        Peer peer = this.b;
        Map<Long, bdb> d = a.d(Collections.singletonList(Long.valueOf(peer.b)));
        long j = peer.b;
        ChannelNotificationsSettings channelNotificationsSettings = d.get(Long.valueOf(j)).q;
        uj70 uj70Var = this.c;
        ChannelNotificationsSettings f = f(uj70Var);
        if (!f.equals(channelNotificationsSettings)) {
            a.r(j, f);
            w2wVar.S0().H(j);
        }
        w2wVar.O0().a(new e7b(peer, f(uj70Var)));
        return s3q0.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7b)) {
            return false;
        }
        c7b c7bVar = (c7b) obj;
        return epx.f(this.b, c7bVar.b) && epx.f(this.c, c7bVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (Long.hashCode(this.b.b) * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        return "ChannelNotificationsSettingsChangeCmd(peer=" + this.b + ", mode=" + this.c + ')';
    }
}
