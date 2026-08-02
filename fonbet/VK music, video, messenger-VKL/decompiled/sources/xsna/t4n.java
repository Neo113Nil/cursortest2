package xsna;

import com.vk.dto.newsfeed.discover.DiscoverId;

/* compiled from: DiscoverMediaState.kt */
/* loaded from: classes4.dex */
public final class t4n implements tw60<t4n> {
    public static final t4n f = new t4n(ur60.h, DiscoverId.i, false, 0);
    public final ur60 b;
    public final DiscoverId c;
    public final boolean d;
    public final int e;

    public t4n(ur60 ur60Var, DiscoverId discoverId, boolean z, int i) {
        this.b = ur60Var;
        this.c = discoverId;
        this.d = z;
        this.e = i;
    }

    public static t4n a(t4n t4nVar, ur60 ur60Var, DiscoverId discoverId, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            ur60Var = t4nVar.b;
        }
        if ((i2 & 2) != 0) {
            discoverId = t4nVar.c;
        }
        if ((i2 & 4) != 0) {
            z = t4nVar.d;
        }
        if ((i2 & 8) != 0) {
            i = t4nVar.e;
        }
        t4nVar.getClass();
        return new t4n(ur60Var, discoverId, z, i);
    }

    @Override // xsna.tw60
    public final t4n b(ur60 ur60Var) {
        return a(this, ur60Var, null, false, 0, 14);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t4n)) {
            return false;
        }
        t4n t4nVar = (t4n) obj;
        return epx.f(this.b, t4nVar.b) && epx.f(this.c, t4nVar.c) && this.d == t4nVar.d && this.e == t4nVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + qoy.b((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
    }

    @Override // xsna.tw60
    public final ur60 p() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverMediaState@");
        sb.append(System.identityHashCode(this));
        sb.append("(listState=");
        sb.append(this.b);
        sb.append(", discoverId=");
        sb.append(this.c);
        sb.append(", isRestoredFromBundle=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
