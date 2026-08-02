package com.yandex.passport.internal.ui.challenge.logout;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class q {
    public final String a;

    public q(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && jl40.l(this.a, ((q) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ProcessReturnUrl(url=" + ((Object) com.yandex.passport.common.url.b.l(this.a)) + ')';
    }
}
