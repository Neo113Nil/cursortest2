package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nbm {
    public final bbm a;
    public final float b = 0.5660377f;

    public nbm(bbm bbmVar) {
        this.a = bbmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof nbm) && jl40.l(this.a, ((nbm) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DrawableShape(image=" + this.a + Extension.C_BRAKE;
    }
}
