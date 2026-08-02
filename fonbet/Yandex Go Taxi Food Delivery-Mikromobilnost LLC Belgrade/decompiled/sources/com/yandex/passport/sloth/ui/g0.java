package com.yandex.passport.sloth.ui;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class g0 implements h0 {
    public final String a;

    public g0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g0) && jl40.l(this.a, ((g0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenUrl(url=" + ((Object) com.yandex.passport.common.url.b.l(this.a)) + ')';
    }
}
