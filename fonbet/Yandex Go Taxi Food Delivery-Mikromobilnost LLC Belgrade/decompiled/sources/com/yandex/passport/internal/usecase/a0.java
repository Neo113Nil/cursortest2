package com.yandex.passport.internal.usecase;

import defpackage.jl40;

/* loaded from: classes15.dex */
public final class a0 implements c0 {
    public final String a;

    public a0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0) && jl40.l(this.a, ((a0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Needed(url=" + ((Object) com.yandex.passport.common.url.b.l(this.a)) + ')';
    }
}
