package xsna;

import com.vk.dto.common.Peer;

/* compiled from: Mention.kt */
/* loaded from: classes2.dex */
public final class x120 extends k320 {
    public final Peer a;
    public final String b;
    public final String c;
    public final boolean d;

    public x120(Peer peer, String str, String str2, boolean z) {
        this.a = peer;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // xsna.k320
    public final String a() {
        return this.b;
    }

    public final Peer b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x120)) {
            return false;
        }
        x120 x120Var = (x120) obj;
        return epx.f(this.a, x120Var.a) && epx.f(this.b, x120Var.b) && epx.f(this.c, x120Var.c) && this.d == x120Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + urd0.a(urd0.a(Long.hashCode(this.a.b) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MemberMention(member=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", nickName=");
        sb.append(this.c);
        sb.append(", writeRestricted=");
        return defpackage.q0.a(sb, this.d, ')');
    }

    public /* synthetic */ x120(Peer peer, String str, String str2, int i) {
        this(peer, str, (i & 4) != 0 ? "" : str2, false);
    }
}
