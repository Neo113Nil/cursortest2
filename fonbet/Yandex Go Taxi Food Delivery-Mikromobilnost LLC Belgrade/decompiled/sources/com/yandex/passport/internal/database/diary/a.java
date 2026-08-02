package com.yandex.passport.internal.database.diary;

import defpackage.jl40;
import defpackage.oyr;
import defpackage.qv10;
import defpackage.unr0;

/* loaded from: classes8.dex */
public final class a {
    public final String a;
    public final boolean b;
    public final long c;

    public a(String str, long j, boolean z) {
        this.a = str;
        this.b = z;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return jl40.l(this.a, aVar.a) && this.b == aVar.b && this.c == aVar.c;
    }

    public final int hashCode() {
        return qv10.c(unr0.e(unr0.b(Long.hashCode(0L) * 31, 31, this.a), 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiaryMethodEntity(id=0, name=");
        sb.append(this.a);
        sb.append(", isUiMethod=");
        sb.append(this.b);
        sb.append(", issuedAt=");
        return oyr.n(this.c, ", uploadId=null)", sb);
    }
}
