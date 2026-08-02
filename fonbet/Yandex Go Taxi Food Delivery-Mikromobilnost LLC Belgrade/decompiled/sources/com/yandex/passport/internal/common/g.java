package com.yandex.passport.internal.common;

import defpackage.unr0;

/* loaded from: classes8.dex */
public final class g {
    public final double a;
    public final double b;

    public g(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Double.compare(this.a, gVar.a) == 0 && Double.compare(this.b, gVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Location(lat=");
        sb.append(this.a);
        sb.append(", lon=");
        return unr0.q(sb, this.b, ')');
    }
}
