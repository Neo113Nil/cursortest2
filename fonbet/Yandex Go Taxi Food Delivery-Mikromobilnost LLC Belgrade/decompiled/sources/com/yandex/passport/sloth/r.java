package com.yandex.passport.sloth;

import defpackage.b64;

/* loaded from: classes2.dex */
public final class r implements u {
    public final String a;

    public r(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r) && this.a.equals(((r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("SendPerfMetric(event="), this.a, ')');
    }
}
