package com.yandex.passport.internal.report.diary;

import defpackage.jl40;
import defpackage.oyr;

/* loaded from: classes15.dex */
public final class d {
    public final String a;
    public final int b;

    public d(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final String a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return jl40.l(this.a, dVar.a) && this.b == dVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiaryMethodStats(name=");
        sb.append(this.a);
        sb.append(", count=");
        return oyr.s(sb, this.b, ')');
    }
}
