package ru.mail.libverify.d;

import ru.mail.verify.core.utils.Gsonable;
import xsna.epx;

/* loaded from: classes9.dex */
public final class b implements Gsonable {
    private final int code;
    private final String location;

    public b(String str, int i) {
        this.location = str;
        this.code = i;
    }

    public final String a() {
        return this.location;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return epx.f(this.location, bVar.location) && this.code == bVar.code;
    }

    public final int hashCode() {
        return Integer.hashCode(this.code) + (this.location.hashCode() * 31);
    }

    public final String toString() {
        return "";
    }

    public b() {
        this("", 0);
    }
}
