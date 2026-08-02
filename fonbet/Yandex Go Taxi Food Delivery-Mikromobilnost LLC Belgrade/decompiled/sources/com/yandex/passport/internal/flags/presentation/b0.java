package com.yandex.passport.internal.flags.presentation;

import defpackage.b64;

/* loaded from: classes15.dex */
public final class b0 implements c0 {
    public final String a;

    public b0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && this.a.equals(((b0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("ShowToast(message="), this.a, ')');
    }
}
