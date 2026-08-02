package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class oqx {
    public final int a;
    public final float b;
    public final float c;

    public oqx(int i, float f, float f2) {
        this.a = i;
        this.b = f;
        this.c = f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqx)) {
            return false;
        }
        oqx oqxVar = (oqx) obj;
        return this.a == oqxVar.a && Float.compare(this.b, oqxVar.b) == 0 && Float.compare(this.c, oqxVar.c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + g8e.c(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LabelConfig(maxLength=");
        sb.append(this.a);
        sb.append(", textSize=");
        sb.append(this.b);
        sb.append(", outlineWidth=");
        return uw51.i(sb, this.c, Extension.C_BRAKE);
    }
}
