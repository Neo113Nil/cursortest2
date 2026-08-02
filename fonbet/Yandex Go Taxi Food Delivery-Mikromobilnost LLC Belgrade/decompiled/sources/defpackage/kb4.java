package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class kb4 {
    public final int a;

    public kb4(int i) {
        this.a = i;
    }

    public final int a() {
        int a = e8m.a(24);
        int i = this.a;
        return (i == a || i == e8m.a(26)) ? e8m.a(8) : i == e8m.a(32) ? e8m.a(10) : i == e8m.a(40) ? e8m.a(12) : (i == e8m.a(48) || i == e8m.a(56)) ? e8m.a(16) : (i == e8m.a(72) || i == e8m.a(80)) ? e8m.a(24) : (int) (i * 0.2f);
    }

    public final float b() {
        int a = e8m.a(24);
        int i = this.a;
        return (i == a || i == e8m.a(26)) ? e8m.a(8) : i == e8m.a(32) ? e8m.a(10) : i == e8m.a(40) ? e8m.a(12) : (i == e8m.a(48) || i == e8m.a(56)) ? e8m.a(16) : (i == e8m.a(72) || i == e8m.a(80)) ? e8m.a(24) : i * 0.2f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kb4) && this.a == ((kb4) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return oyr.j(this.a, "AvatarSize(size=", Extension.C_BRAKE);
    }
}
