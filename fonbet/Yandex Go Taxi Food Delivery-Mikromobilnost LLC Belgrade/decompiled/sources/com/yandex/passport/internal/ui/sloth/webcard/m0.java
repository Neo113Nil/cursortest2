package com.yandex.passport.internal.ui.sloth.webcard;

/* loaded from: classes2.dex */
public final class m0 implements q0 {
    public final String a;

    public m0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m0) && this.a.equals(((m0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OpenUrl(url=hidden)";
    }
}
