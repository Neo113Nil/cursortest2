package com.yandex.passport.internal.ui.bouncer.model;

import defpackage.jl40;

/* loaded from: classes2.dex */
public final class w0 implements a1 {
    public final String a;

    public w0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w0) && jl40.l(this.a, ((w0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SamlSsoRequest(authUrl=" + ((Object) com.yandex.passport.common.url.b.l(this.a)) + ')';
    }
}
