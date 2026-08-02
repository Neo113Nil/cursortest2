package xsna;

import com.vk.dto.common.Peer;

/* compiled from: MsgSkeletonConfig.kt */
/* loaded from: classes2.dex */
public final class wz30 {
    public final boolean a;
    public final Long b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final Peer h;

    public wz30() {
        this(0);
    }

    public static wz30 a(wz30 wz30Var, boolean z, Long l, int i) {
        if ((i & 1) != 0) {
            z = wz30Var.a;
        }
        boolean z2 = z;
        if ((i & 2) != 0) {
            l = wz30Var.b;
        }
        int i2 = wz30Var.c;
        int i3 = wz30Var.d;
        int i4 = wz30Var.e;
        int i5 = wz30Var.f;
        int i6 = wz30Var.g;
        Peer peer = wz30Var.h;
        wz30Var.getClass();
        return new wz30(z2, l, i2, i3, i4, i5, i6, peer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wz30)) {
            return false;
        }
        wz30 wz30Var = (wz30) obj;
        return this.a == wz30Var.a && epx.f(this.b, wz30Var.b) && this.c == wz30Var.c && this.d == wz30Var.d && this.e == wz30Var.e && this.f == wz30Var.f && this.g == wz30Var.g && epx.f(this.h, wz30Var.h);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        Long l = this.b;
        return Long.hashCode(this.h.b) + shy.a(this.g, shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, (hashCode + (l == null ? 0 : l.hashCode())) * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MsgSkeletonConfig(isCustomBackground=");
        sb.append(this.a);
        sb.append(", dialogId=");
        sb.append(this.b);
        sb.append(", skeletonMinCount=");
        sb.append(this.c);
        sb.append(", lineHeight=");
        sb.append(this.d);
        sb.append(", maxTextLines=");
        sb.append(this.e);
        sb.append(", maxIncomingInOrder=");
        sb.append(this.f);
        sb.append(", maxOutgoingInOrder=");
        sb.append(this.g);
        sb.append(", currentMember=");
        return eq.a(sb, this.h, ')');
    }

    public wz30(boolean z, Long l, int i, int i2, int i3, int i4, int i5, Peer peer) {
        this.a = z;
        this.b = l;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = peer;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public wz30(int i) {
        this(false, null, 2, r4, 4, 4, 2, (r10 == null ? null : r10).q());
        int b = cn70.b(30);
        a1w a1wVar = q1w.a;
    }
}
