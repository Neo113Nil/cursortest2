package ru.mail.libverify.b;

import xsna.epx;

/* loaded from: classes9.dex */
public final class a {
    private final String a;

    public a(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        aVar.getClass();
        return epx.f(this.a, aVar.a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "";
    }
}
