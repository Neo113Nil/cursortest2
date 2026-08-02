package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class wc extends xc {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public wc(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wc)) {
            return false;
        }
        wc wcVar = (wc) obj;
        return jl40.l(this.a, wcVar.a) && jl40.l(this.b, wcVar.b) && jl40.l(this.c, wcVar.c) && jl40.l(this.d, wcVar.d) && jl40.l(this.e, wcVar.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(redirectUri=");
        sb.append(this.a);
        sb.append(", esiaSessionId=");
        sb.append(this.b);
        sb.append(", sid=");
        sb.append(this.c);
        sb.append(", esiaCookie=");
        sb.append(this.d);
        sb.append(", tibHost=");
        return b64.p(sb, this.e, ')');
    }
}
