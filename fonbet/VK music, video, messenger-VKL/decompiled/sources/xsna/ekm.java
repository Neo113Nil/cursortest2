package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogStyleChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class ekm implements e900 {
    public final Peer a;

    public ekm(Peer peer) {
        this.a = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ekm) && epx.f(this.a, ((ekm) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("DialogStyleChangeLpEvent(dialog="), this.a, ')');
    }
}
