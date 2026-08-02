package com.yandex.passport.sloth.ui;

import defpackage.b64;

/* loaded from: classes2.dex */
public final class h1 implements o1 {
    public final String a;

    public h1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h1) && this.a.equals(((h1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("ExecJs(js="), this.a, ')');
    }
}
