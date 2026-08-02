package xsna;

import android.graphics.Point;

/* compiled from: DefaultUserAgent.kt */
/* loaded from: classes.dex */
public final class hql implements ggq0 {
    public final String a;
    public final String b;
    public final String c;
    public final Point d;
    public final bpn0 e = new bpn0(new qx2(this, 1));

    public hql(String str, String str2, String str3, Point point) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = point;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hql)) {
            return false;
        }
        hql hqlVar = (hql) obj;
        return epx.f(this.a, hqlVar.a) && epx.f(this.b, hqlVar.b) && epx.f(this.c, hqlVar.c) && epx.f(this.d, hqlVar.d);
    }

    @Override // xsna.ggq0
    public final String getUserAgent() {
        return (String) this.e.getValue();
    }

    public final int hashCode() {
        return this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder a = xe9.a("DefaultUserAgent(prefix=", this.a, ", appVersion=", this.b, ", appBuild=");
        a.append(this.c);
        a.append(", displaySize=");
        a.append(this.d);
        a.append(")");
        return a.toString();
    }
}
