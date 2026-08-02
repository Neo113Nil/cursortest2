package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogInfoBarUpdateLpEvent.kt */
/* loaded from: classes2.dex */
public final class tfm implements e900 {
    public final Peer a;

    public tfm(Peer peer) {
        this.a = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tfm) && epx.f(this.a, ((tfm) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("DialogInfoBarUpdateLpEvent(dialog="), this.a, ')');
    }
}
