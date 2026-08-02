package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class oox {
    public final boolean a;
    public final nbv b;

    public oox(boolean z, nbv nbvVar) {
        this.a = z;
        this.b = nbvVar;
    }

    public final boolean a() {
        return this.a;
    }

    public final rbv b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oox)) {
            return false;
        }
        oox ooxVar = (oox) obj;
        return this.a == ooxVar.a && this.b.equals(ooxVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "Flash(enabled=" + this.a + ", image=" + this.b + Extension.C_BRAKE;
    }
}
