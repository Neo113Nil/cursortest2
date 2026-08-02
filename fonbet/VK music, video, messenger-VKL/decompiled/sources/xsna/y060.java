package xsna;

import com.vk.dto.common.Peer;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class y060 {
    public final Peer a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final int g;
    public final CharSequence h;

    public y060(Peer peer, boolean z, boolean z2, boolean z3, boolean z4, long j, int i, CharSequence charSequence) {
        this.a = peer;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j;
        this.g = i;
        this.h = charSequence;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y060)) {
            return false;
        }
        y060 y060Var = (y060) obj;
        return epx.f(this.a, y060Var.a) && this.b == y060Var.b && this.c == y060Var.c && this.d == y060Var.d && this.e == y060Var.e && this.f == y060Var.f && this.g == y060Var.g && epx.f(this.h, y060Var.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + shy.a(this.g, bh10.a(qoy.b(qoy.b(qoy.b(qoy.b(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NestedMsgMeta(from=");
        sb.append(this.a);
        sb.append(", hasAttaches=");
        sb.append(this.b);
        sb.append(", isAudioMsg=");
        sb.append(this.c);
        sb.append(", isVideoMsg=");
        sb.append(this.d);
        sb.append(", isGiftMsg=");
        sb.append(this.e);
        sb.append(", time=");
        sb.append(this.f);
        sb.append(", forwardCount=");
        sb.append(this.g);
        sb.append(", replyContent=");
        return thl0.a(sb, this.h, ')');
    }
}
