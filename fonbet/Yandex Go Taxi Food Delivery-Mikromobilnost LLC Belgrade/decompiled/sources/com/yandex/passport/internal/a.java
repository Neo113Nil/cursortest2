package com.yandex.passport.internal;

import defpackage.ly3;
import defpackage.smw0;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes15.dex */
public final class a {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;

    public a(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
        this.d = arrayList4;
        this.e = arrayList5;
    }

    public final List a() {
        return this.a;
    }

    public final List b() {
        return this.d;
    }

    public final List c() {
        return this.e;
    }

    public final List d() {
        return this.b;
    }

    public final boolean e() {
        return (this.a.isEmpty() && this.b.isEmpty() && this.d.isEmpty()) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !a.class.equals(obj.getClass())) {
            return false;
        }
        a aVar = (a) obj;
        if (this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d)) {
            return this.e.equals(aVar.e);
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ly3.b(ly3.b(ly3.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(a.class.getSimpleName());
        sb.append("{added=");
        sb.append(this.a);
        sb.append(", updated=");
        sb.append(this.b);
        sb.append(", masterTokenUpdated=");
        sb.append(this.c);
        sb.append(", removed=");
        sb.append(this.d);
        sb.append(", skipped=");
        return smw0.m(sb, this.e, '}');
    }
}
