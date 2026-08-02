package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class h1b {
    public static final h1b d = new h1b(false, 0, false);
    public final boolean a;
    public final int b;
    public final boolean c;

    public h1b(boolean z, int i, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1b)) {
            return false;
        }
        h1b h1bVar = (h1b) obj;
        return this.a == h1bVar.a && this.b == h1bVar.b && this.c == h1bVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + oyr.b(this.b, Boolean.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return x4e.i(xvz.p("ChatButtonState(isTranslationEnabled=", this.b, ", totalMessages=", ", isVisible=", this.a), this.c, Extension.C_BRAKE);
    }
}
