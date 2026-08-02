package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class j711 {
    public final fiy a;
    public final float b;
    public float c;

    public j711(fiy fiyVar, float f, float f2) {
        this.a = fiyVar;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j711)) {
            return false;
        }
        j711 j711Var = (j711) obj;
        return this.a.equals(j711Var.a) && Float.compare(this.b, j711Var.b) == 0 && Float.compare(this.c, j711Var.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + g8e.c(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        float f = this.c;
        StringBuilder sb = new StringBuilder("Segment(type=");
        sb.append(this.a);
        sb.append(", start=");
        sb.append(this.b);
        sb.append(", end=");
        return uw51.i(sb, f, Extension.C_BRAKE);
    }
}
