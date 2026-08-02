package com.yandex.passport.sloth.command.data;

import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.qv10;

@gsq0
/* loaded from: classes2.dex */
public final class r {
    public static final q Companion = new q();
    public final String a;
    public final String b;
    public final String c;
    public final Boolean d;
    public final String e;
    public final String f;
    public final Long g;

    public /* synthetic */ r(int i, String str, String str2, String str3, Boolean bool, String str4, String str5, Long l) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, p.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = bool;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = l;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return jl40.l(this.a, rVar.a) && jl40.l(this.b, rVar.b) && jl40.l(this.c, rVar.c) && jl40.l(this.d, rVar.d) && jl40.l(this.e, rVar.e) && jl40.l(this.f, rVar.f) && jl40.l(this.g, rVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str3 = this.e;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.g;
        return hashCode6 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GetOtpData(kind=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", machineReadableLogin=");
        sb.append(this.c);
        sb.append(", isTeam=");
        sb.append(this.d);
        sb.append(", pin=");
        sb.append(this.e);
        sb.append(", secret=");
        sb.append(this.f);
        sb.append(", timestamp=");
        return qv10.q(sb, this.g, ')');
    }
}
