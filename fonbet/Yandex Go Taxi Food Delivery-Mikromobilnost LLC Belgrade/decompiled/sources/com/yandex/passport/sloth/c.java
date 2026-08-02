package com.yandex.passport.sloth;

import defpackage.b64;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class c implements a1 {
    public final String a;
    public final String b;
    public final long c;

    public c(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b.equals(cVar.b) && this.c == cVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SlothAuthSdkResult(accessToken=");
        sb.append(this.a);
        sb.append(", tokenType=");
        sb.append(this.b);
        sb.append(", expiresIn=");
        return b64.o(sb, this.c, ')');
    }
}
