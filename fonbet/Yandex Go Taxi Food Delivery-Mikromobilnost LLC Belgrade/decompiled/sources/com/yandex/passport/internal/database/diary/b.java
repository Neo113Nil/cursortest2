package com.yandex.passport.internal.database.diary;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes8.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public b(String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return jl40.l(this.a, bVar.a) && jl40.l(this.b, bVar.b) && this.c.equals(bVar.c) && this.d == bVar.d;
    }

    public final int hashCode() {
        return qv10.c(unr0.b(unr0.b(unr0.b(Long.hashCode(0L) * 31, 31, this.a), 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiaryParameterEntity(id=0, name=");
        sb.append(this.a);
        sb.append(", methodName=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(", issuedAt=");
        return oyr.n(this.d, ", uploadId=null)", sb);
    }
}
