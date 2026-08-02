package com.yandex.passport.sloth.ui;

import defpackage.b64;

/* loaded from: classes2.dex */
public final class j2 implements m2 {
    public final String a;

    public j2(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j2) && this.a.equals(((j2) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("ExecJs(js="), this.a, ')');
    }
}
