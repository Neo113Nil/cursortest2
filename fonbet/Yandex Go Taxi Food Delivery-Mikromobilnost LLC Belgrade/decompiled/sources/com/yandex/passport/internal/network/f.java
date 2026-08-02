package com.yandex.passport.internal.network;

import com.yandex.passport.internal.report.reporters.PassportInitReporter$Companion$UrlSource;
import defpackage.jl40;
import defpackage.uw51;

/* loaded from: classes8.dex */
public final class f {
    public final String a;
    public final PassportInitReporter$Companion$UrlSource b;

    public f(String str, PassportInitReporter$Companion$UrlSource passportInitReporter$Companion$UrlSource) {
        this.a = str;
        this.b = passportInitReporter$Companion$UrlSource;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return jl40.l(this.a, fVar.a) && this.b == fVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FormationUrlData(url=");
        uw51.y(sb, this.a, ", source=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
