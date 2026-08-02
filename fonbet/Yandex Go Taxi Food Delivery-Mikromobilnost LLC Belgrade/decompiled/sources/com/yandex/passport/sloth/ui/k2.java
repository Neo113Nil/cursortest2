package com.yandex.passport.sloth.ui;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class k2 implements m2 {
    public final String a;

    public k2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k2) && jl40.l(this.a, ((k2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LoadUrl(url=" + ((Object) com.yandex.passport.common.url.b.l(this.a)) + ')';
    }
}
