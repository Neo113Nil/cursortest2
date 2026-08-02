package com.yandex.passport.internal.database;

import android.content.ContentValues;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class c {
    public final long a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final boolean i;

    public c(long j, String str, boolean z, boolean z2, String str2, String str3, String str4, String str5, boolean z3) {
        this.a = j;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = str2;
        this.f = str3;
        this.g = str4;
        this.h = str5;
        this.i = z3;
    }

    public final ContentValues a() {
        ContentValues contentValues = new ContentValues();
        contentValues.put("uid", Long.valueOf(this.a));
        contentValues.put("parent_name", this.b);
        contentValues.put("is_child", Boolean.valueOf(this.c));
        contentValues.put("has_plus", Boolean.valueOf(this.d));
        contentValues.put("display_login", this.e);
        contentValues.put("display_name", this.f);
        contentValues.put("public_name", this.g);
        contentValues.put("avatar_url", this.h);
        contentValues.put("is_deleted", Boolean.valueOf(this.i));
        return contentValues;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.b.equals(cVar.b) && this.c == cVar.c && this.d == cVar.d && jl40.l(this.e, cVar.e) && jl40.l(this.f, cVar.f) && jl40.l(this.g, cVar.g) && jl40.l(this.h, cVar.h) && this.i == cVar.i;
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(unr0.b(unr0.e(unr0.e(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
        String str = this.h;
        return Boolean.hashCode(this.i) + ((b + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ChildRow(uid=");
        sb.append(this.a);
        sb.append(", parentName=");
        sb.append(this.b);
        sb.append(", isChild=");
        sb.append(this.c);
        sb.append(", hasPlus=");
        sb.append(this.d);
        sb.append(", displayLogin=");
        sb.append(this.e);
        sb.append(", displayName=");
        sb.append(this.f);
        sb.append(", publicName=");
        sb.append(this.g);
        sb.append(", avatarUrl=");
        sb.append(this.h);
        sb.append(", isDeleted=");
        return unr0.u(sb, this.i, ')');
    }
}
