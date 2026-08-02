package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class d0k {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public d0k(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0k)) {
            return false;
        }
        d0k d0kVar = (d0k) obj;
        return Float.compare(this.a, d0kVar.a) == 0 && Float.compare(this.b, d0kVar.b) == 0 && Float.compare(this.c, d0kVar.c) == 0 && Float.compare(this.d, d0kVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.q(oo31.k("PaddingsSettings(left=", this.a, ", top=", this.b, ", right="), this.c, ", bottom=", this.d, Extension.C_BRAKE);
    }

    public d0k() {
        this(0);
    }

    public /* synthetic */ d0k(int i) {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }
}
