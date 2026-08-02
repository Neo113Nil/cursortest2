package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class pm31 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    public pm31(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pm31)) {
            return false;
        }
        pm31 pm31Var = (pm31) obj;
        return this.a == pm31Var.a && this.b == pm31Var.b && this.c == pm31Var.c && this.d == pm31Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.k(this.c, this.d, ", exoLoadControlBufferForPlaybackAfterRebufferMS=", Extension.C_BRAKE, b64.s(this.a, this.b, "VideoPlayerConfig(exoLoadControlMinBufferMs=", ", exoLoadControlMaxBufferMs=", ", exoLoadControlBufferForPlaybackMs="));
    }

    public pm31() {
        this(50000, 50000, 2500, 5000);
    }
}
