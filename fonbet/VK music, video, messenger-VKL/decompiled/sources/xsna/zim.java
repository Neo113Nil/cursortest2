package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogPushSettingsChangeLpEvent.kt */
/* loaded from: classes2.dex */
public final class zim implements e900 {
    public final Peer a;

    public zim(Peer peer) {
        this.a = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zim) && epx.f(this.a, ((zim) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("DialogPushSettingsChangeLpEvent(dialog="), this.a, ')');
    }
}
