package com.yandex.passport.internal.rotation;

import com.yandex.passport.common.core.Uid;
import defpackage.b64;
import defpackage.gsq0;
import defpackage.jl40;
import defpackage.qje;
import defpackage.uw51;

@gsq0
/* loaded from: classes15.dex */
public final class f {
    public static final e Companion = new e();
    public final String a;
    public final Uid b;
    public final String c;

    static {
        int i = Uid.$stable;
    }

    public /* synthetic */ f(int i, String str, Uid uid, String str2) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, d.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = uid;
        this.c = str2;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.a;
    }

    public final Uid c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return jl40.l(this.a, fVar.a) && jl40.l(this.b, fVar.b) && jl40.l(this.c, fVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + uw51.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("QuarantineMasterToken(masterToken=");
        sb.append(this.a);
        sb.append(", uid=");
        sb.append(this.b);
        sb.append(", clientId=");
        return b64.p(sb, this.c, ')');
    }

    public f(String str, Uid uid, String str2) {
        this.a = str;
        this.b = uid;
        this.c = str2;
    }
}
