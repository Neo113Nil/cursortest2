package xsna;

import com.vk.dto.common.Peer;

/* compiled from: BotButtonLpEvent.kt */
/* loaded from: classes2.dex */
public final class v28 implements e900 {
    public final Peer a;
    public final Peer b;
    public final String c;
    public final z28 d;

    public v28(Peer peer, Peer peer2, String str, z28 z28Var) {
        this.a = peer;
        this.b = peer2;
        this.c = str;
        this.d = z28Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v28)) {
            return false;
        }
        v28 v28Var = (v28) obj;
        return epx.f(this.a, v28Var.a) && epx.f(this.b, v28Var.b) && epx.f(this.c, v28Var.c) && epx.f(this.d, v28Var.d);
    }

    public final int hashCode() {
        int a = urd0.a(bh10.a(Long.hashCode(this.a.b) * 31, 31, this.b.b), 31, this.c);
        z28 z28Var = this.d;
        return a + (z28Var == null ? 0 : z28Var.hashCode());
    }

    public final String toString() {
        return "BotButtonLpEvent(dialog=" + this.a + ", botOwner=" + this.b + ", eventId=" + this.c + ", callbackAction=" + this.d + ')';
    }
}
