package com.yandex.passport.internal.filter;

import com.yandex.passport.internal.a0;
import defpackage.oyr;

/* loaded from: classes15.dex */
public final class p implements r {
    public final int a;

    public /* synthetic */ p(int i) {
        this.a = i;
    }

    public static final /* synthetic */ p a(int i) {
        return new p(i);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a0.a(this, (r) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p) {
            return this.a == ((p) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.e(')', this.a, "NumericIdentifier(value=");
    }
}
