package xsna;

import com.vk.dto.newsfeed.discover.DiscoverId;

/* compiled from: NewsfeedCustomMviState.kt */
/* loaded from: classes4.dex */
public final class xf60 implements tw60<xf60> {
    public final String b;
    public final String c;
    public final ur60 d;
    public final String e;
    public final String f;
    public final DiscoverId g;
    public final boolean h;
    public final boolean i;

    public xf60(String str, String str2, ur60 ur60Var, String str3, String str4, DiscoverId discoverId, boolean z, boolean z2) {
        this.b = str;
        this.c = str2;
        this.d = ur60Var;
        this.e = str3;
        this.f = str4;
        this.g = discoverId;
        this.h = z;
        this.i = z2;
    }

    public static xf60 a(xf60 xf60Var, String str, ur60 ur60Var, String str2, int i) {
        if ((i & 1) != 0) {
            str = xf60Var.b;
        }
        String str3 = str;
        String str4 = xf60Var.c;
        if ((i & 4) != 0) {
            ur60Var = xf60Var.d;
        }
        ur60 ur60Var2 = ur60Var;
        if ((i & 8) != 0) {
            str2 = xf60Var.e;
        }
        String str5 = xf60Var.f;
        DiscoverId discoverId = xf60Var.g;
        boolean z = xf60Var.h;
        boolean z2 = xf60Var.i;
        xf60Var.getClass();
        return new xf60(str3, str4, ur60Var2, str2, str5, discoverId, z, z2);
    }

    @Override // xsna.tw60
    public final xf60 b(ur60 ur60Var) {
        return a(this, null, ur60Var, null, 251);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xf60)) {
            return false;
        }
        xf60 xf60Var = (xf60) obj;
        return epx.f(this.b, xf60Var.b) && epx.f(this.c, xf60Var.c) && epx.f(this.d, xf60Var.d) && epx.f(this.e, xf60Var.e) && epx.f(this.f, xf60Var.f) && epx.f(this.g, xf60Var.g) && this.h == xf60Var.h && this.i == xf60Var.i;
    }

    public final int hashCode() {
        int a = urd0.a((this.d.hashCode() + urd0.a(this.b.hashCode() * 31, 31, this.c)) * 31, 31, this.e);
        String str = this.f;
        return Boolean.hashCode(this.i) + qoy.b((this.g.hashCode() + ((a + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.h);
    }

    @Override // xsna.tw60
    public final ur60 p() {
        return this.d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewsfeedCustomMviState(title=");
        sb.append(this.b);
        sb.append(", feedId=");
        sb.append(this.c);
        sb.append(", listState=");
        sb.append(this.d);
        sb.append(", refer=");
        sb.append(this.e);
        sb.append(", trackCode=");
        sb.append(this.f);
        sb.append(", discoverId=");
        sb.append(this.g);
        sb.append(", isRestored=");
        sb.append(this.h);
        sb.append(", withPreload=");
        return defpackage.q0.a(sb, this.i, ')');
    }
}
