package com.yandex.passport.data.network;

import defpackage.unr0;

/* loaded from: classes8.dex */
public final class o0 {
    public final double a;
    public final double b;

    public o0(double d, double d2) {
        this.a = d;
        this.b = d2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0)) {
            return false;
        }
        o0 o0Var = (o0) obj;
        return Double.compare(this.a, o0Var.a) == 0 && Double.compare(this.b, o0Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Gps(lat=");
        sb.append(this.a);
        sb.append(", lon=");
        return unr0.q(sb, this.b, ')');
    }
}
