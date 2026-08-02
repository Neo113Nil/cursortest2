package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class p1d {
    public final int a;
    public final int b;

    public p1d(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.b;
    }

    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p1d)) {
            return false;
        }
        p1d p1dVar = (p1d) obj;
        return this.a == p1dVar.a && this.b == p1dVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return b64.d(this.a, this.b, "ComponentTitleSubtitleMaxLines(titleMaxLines=", ", subtitleMaxLines=", Extension.C_BRAKE);
    }
}
