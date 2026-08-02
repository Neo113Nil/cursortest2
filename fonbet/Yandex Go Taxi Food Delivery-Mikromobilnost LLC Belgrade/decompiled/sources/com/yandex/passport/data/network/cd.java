package com.yandex.passport.data.network;

import defpackage.b64;
import defpackage.jl40;

/* loaded from: classes15.dex */
public final class cd {
    public final com.yandex.passport.data.models.g a;
    public final String b;
    public final String c;

    public cd(com.yandex.passport.data.models.g gVar, String str, String str2) {
        this.a = gVar;
        this.b = str;
        this.c = str2;
    }

    public final com.yandex.passport.data.models.g a() {
        return this.a;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cd)) {
            return false;
        }
        cd cdVar = (cd) obj;
        return this.a.equals(cdVar.a) && jl40.l(this.b, cdVar.b) && this.c.equals(cdVar.c);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Params(environment=");
        sb.append(this.a);
        sb.append(", trackId=");
        sb.append(this.b);
        sb.append(", language=");
        return b64.p(sb, this.c, ')');
    }
}
