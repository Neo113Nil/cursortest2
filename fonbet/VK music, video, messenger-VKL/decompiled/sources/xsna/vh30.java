package xsna;

import com.vk.dto.common.Peer;
import com.vk.im.engine.models.typing.ComposingType;

/* compiled from: MsgComposing.kt */
/* loaded from: classes2.dex */
public final class vh30 {
    public final Peer a;
    public final ComposingType b;

    public vh30(Peer peer, ComposingType composingType) {
        this.a = peer;
        this.b = composingType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return epx.f(this.a, ((vh30) obj).a);
    }

    public final int hashCode() {
        return Long.hashCode(this.a.b);
    }

    public final String toString() {
        return "MsgComposing(member=" + this.a + ", type=" + this.b + ')';
    }
}
