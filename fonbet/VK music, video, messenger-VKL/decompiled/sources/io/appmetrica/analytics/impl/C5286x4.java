package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.x4, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C5286x4 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Boolean f;

    public C5286x4(C5236v4 c5236v4) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        Boolean bool;
        z = c5236v4.a;
        this.a = z;
        z2 = c5236v4.b;
        this.b = z2;
        z3 = c5236v4.c;
        this.c = z3;
        z4 = c5236v4.d;
        this.d = z4;
        z5 = c5236v4.e;
        this.e = z5;
        bool = c5236v4.f;
        this.f = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5286x4.class == obj.getClass()) {
            C5286x4 c5286x4 = (C5286x4) obj;
            if (this.a != c5286x4.a || this.b != c5286x4.b || this.c != c5286x4.c || this.d != c5286x4.d || this.e != c5286x4.e) {
                return false;
            }
            Boolean bool = this.f;
            Boolean bool2 = c5286x4.f;
            if (bool != null) {
                return bool.equals(bool2);
            }
            if (bool2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (((((((((this.a ? 1 : 0) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        Boolean bool = this.f;
        return i + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CollectingFlags{permissionsCollectingEnabled=");
        sb.append(this.a);
        sb.append(", featuresCollectingEnabled=");
        sb.append(this.b);
        sb.append(", googleAid=");
        sb.append(this.c);
        sb.append(", simInfo=");
        sb.append(this.d);
        sb.append(", huaweiOaid=");
        sb.append(this.e);
        sb.append(", sslPinning=");
        return xsna.tn.a(sb, this.f, '}');
    }
}
