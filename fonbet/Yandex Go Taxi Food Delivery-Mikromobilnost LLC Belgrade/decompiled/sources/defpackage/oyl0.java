package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class oyl0 {
    public final float a;
    public final float b;
    public final float c;

    public oyl0(float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = f + f2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oyl0)) {
            return false;
        }
        oyl0 oyl0Var = (oyl0) obj;
        return Float.compare(this.a, oyl0Var.a) == 0 && Float.compare(this.b, oyl0Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return x4e.e("WidestCharacterData(boundsWidth=", this.a, ", advance=", this.b, Extension.C_BRAKE);
    }
}
