package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class oby {
    public static final oby c = new oby("INFO", 800);
    public static final oby d = new oby("WARNING", 900);
    public final String a;
    public final int b;

    public oby(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oby)) {
            return false;
        }
        oby obyVar = (oby) obj;
        return this.a.equals(obyVar.a) && this.b == obyVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return qv10.i(this.b, "Level(name=", this.a, ", value=", Extension.C_BRAKE);
    }
}
