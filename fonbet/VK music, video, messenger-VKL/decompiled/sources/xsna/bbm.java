package xsna;

import com.vk.dto.common.Peer;

/* compiled from: DialogBotKeyboardUpdatedLpEvent.kt */
/* loaded from: classes2.dex */
public final class bbm implements e900 {
    public final Peer a;

    public bbm(Peer peer) {
        this.a = peer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bbm) && epx.f(this.a, ((bbm) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return eq.a(new StringBuilder("DialogBotKeyboardUpdatedLpEvent(dialog="), this.a, ')');
    }
}
