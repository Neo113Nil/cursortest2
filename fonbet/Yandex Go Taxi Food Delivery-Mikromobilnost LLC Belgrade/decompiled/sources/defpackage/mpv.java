package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mpv {
    public final int a;
    public final int b;
    public final int c;

    public mpv(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (i > i2) {
            ny61.g("Failed requirement.");
            throw null;
        }
        if (i > i3 || i3 > i2) {
            ny61.g("Failed requirement.");
            throw null;
        }
    }

    public final float a() {
        if (this.a == this.b) {
            return 1.0f;
        }
        return (this.c - r0) / (r1 - r0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mpv)) {
            return false;
        }
        mpv mpvVar = (mpv) obj;
        return this.a == mpvVar.a && this.b == mpvVar.b && this.c == mpvVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + oyr.b(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return oyr.m(this.c, Extension.C_BRAKE, b64.s(this.a, this.b, "State(min=", ", max=", ", progress="));
    }
}
