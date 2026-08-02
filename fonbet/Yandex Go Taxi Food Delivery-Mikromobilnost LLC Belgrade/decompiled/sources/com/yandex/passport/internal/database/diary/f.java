package com.yandex.passport.internal.database.diary;

import defpackage.b64;

/* loaded from: classes15.dex */
public final class f {
    public final long a;
    public final long b;

    public f(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
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
        return this.a == fVar.a && this.b == fVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiaryUploadEntity(id=");
        sb.append(this.a);
        sb.append(", uploadedAt=");
        return b64.o(sb, this.b, ')');
    }

    public /* synthetic */ f(long j) {
        this(0L, j);
    }
}
