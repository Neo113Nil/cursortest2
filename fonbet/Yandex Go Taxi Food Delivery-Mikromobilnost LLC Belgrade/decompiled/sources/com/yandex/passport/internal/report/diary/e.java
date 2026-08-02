package com.yandex.passport.internal.report.diary;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class e {
    public final String a;
    public final String b;
    public final String c;
    public final int d;

    public e(String str, String str2, String str3, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return jl40.l(this.a, eVar.a) && jl40.l(this.b, eVar.b) && jl40.l(this.c, eVar.c) && this.d == eVar.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiaryParameterStats(name=");
        sb.append(this.a);
        sb.append(", methodName=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(", count=");
        return oyr.s(sb, this.d, ')');
    }
}
