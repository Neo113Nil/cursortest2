package xsna;

import com.vk.dto.newsfeed.discover.DiscoverId;

/* compiled from: DiscoverMediaArguments.kt */
/* loaded from: classes4.dex */
public final class p2n {
    public final String a;
    public final DiscoverId b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    public p2n(String str, DiscoverId discoverId, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = discoverId;
        this.c = z;
        this.d = z2;
        this.e = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p2n)) {
            return false;
        }
        p2n p2nVar = (p2n) obj;
        return epx.f(this.a, p2nVar.a) && epx.f(this.b, p2nVar.b) && this.c == p2nVar.c && this.d == p2nVar.d && this.e == p2nVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + qoy.b(qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverMediaArguments(refFull=");
        sb.append(this.a);
        sb.append(", discoverId=");
        sb.append(this.b);
        sb.append(", isRestored=");
        sb.append(this.c);
        sb.append(", hasDiscoverId=");
        sb.append(this.d);
        sb.append(", isShowInLegoTheme=");
        return defpackage.q0.a(sb, this.e, ')');
    }
}
