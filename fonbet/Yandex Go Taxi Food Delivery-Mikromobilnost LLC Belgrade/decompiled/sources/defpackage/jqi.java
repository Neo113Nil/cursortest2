package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class jqi {
    public final doe a;

    public jqi(doe doeVar) {
        this.a = doeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jqi) && this.a.equals(((jqi) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PathPoint(coordinates=" + this.a + Extension.C_BRAKE;
    }
}
