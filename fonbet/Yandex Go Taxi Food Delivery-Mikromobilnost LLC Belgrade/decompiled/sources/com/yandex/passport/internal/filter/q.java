package com.yandex.passport.internal.filter;

import com.yandex.passport.internal.a0;
import defpackage.unr0;

/* loaded from: classes15.dex */
public final class q implements r {
    public final String a;

    public /* synthetic */ q(String str) {
        this.a = str;
    }

    public static final /* synthetic */ q a(String str) {
        return new q(str);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return a0.a(this, (r) obj);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            return this.a.equals(((q) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return unr0.l(')', "StringIdentifier(value=", this.a);
    }
}
