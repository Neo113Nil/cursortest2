package com.yandex.passport.internal.ui.challenge.webview;

import defpackage.b64;

/* loaded from: classes2.dex */
public final class h implements j {
    public final String a;

    public h(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h) && this.a.equals(((h) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return b64.p(new StringBuilder("ShowError(message="), this.a, ')');
    }
}
