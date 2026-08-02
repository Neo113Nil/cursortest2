package com.yandex.passport.internal.ui.sloth.authsdk;

import defpackage.b64;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class f implements g {
    public final String a;
    public final String b;
    public final long c;

    public f(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && this.b.equals(fVar.b) && this.c == fVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuccessResult(accessToken=");
        sb.append(this.a);
        sb.append(", tokenType=");
        sb.append(this.b);
        sb.append(", expiresIn=");
        return b64.o(sb, this.c, ')');
    }
}
