package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class o301 {
    public final e501 a;

    public o301(e501 e501Var) {
        this.a = e501Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o301) && this.a.equals(((o301) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "StrokeSegment(color=" + this.a + Extension.C_BRAKE;
    }
}
