package com.yandex.passport.internal.ui.challenge.webview;

import defpackage.b64;

/* loaded from: classes2.dex */
public final class e implements j {
    public final String a;

    public e(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e) && this.a.equals(((e) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("OpenUrl(url="), this.a, ')');
    }
}
