package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogPinnedMsgDetachLpEvent.kt */
/* loaded from: classes2.dex */
public final class qim implements e900 {
    public final Peer a;

    public qim(Peer peer) {
        this.a = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qim) && epx.f(this.a, ((qim) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("DialogPinnedMsgDetachLpEvent(dialog="), this.a, ')');
    }
}
