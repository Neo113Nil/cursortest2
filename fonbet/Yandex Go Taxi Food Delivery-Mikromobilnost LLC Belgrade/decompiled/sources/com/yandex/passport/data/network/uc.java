package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.unr0;

@gsq0
/* loaded from: classes15.dex */
public final class uc {
    public static final tc Companion = new tc();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ uc(String str, String str2, String str3, String str4, int i, String str5) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, sc.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc)) {
            return false;
        }
        uc ucVar = (uc) obj;
        return jl40.l(this.a, ucVar.a) && jl40.l(this.b, ucVar.b) && jl40.l(this.c, ucVar.c) && jl40.l(this.d, ucVar.d) && jl40.l(this.e, ucVar.e);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response(redirectUri=");
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
