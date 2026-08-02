package com.yandex.passport.internal.ui.challenge.vpn;

import defpackage.b64;

/* loaded from: classes2.dex */
public final class w implements z {
    public final String a;

    public w(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w) && this.a.equals(((w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("OpenUrl(url="), this.a, ')');
    }
}
