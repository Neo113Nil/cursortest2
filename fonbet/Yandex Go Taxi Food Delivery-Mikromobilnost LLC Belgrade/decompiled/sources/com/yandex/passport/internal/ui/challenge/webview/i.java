package com.yandex.passport.internal.ui.challenge.webview;

import defpackage.b64;

/* loaded from: classes2.dex */
public final class i implements j {
    public final String a;

    public i(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i) && this.a.equals(((i) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("ShowToast(message="), this.a, ')');
    }
}
