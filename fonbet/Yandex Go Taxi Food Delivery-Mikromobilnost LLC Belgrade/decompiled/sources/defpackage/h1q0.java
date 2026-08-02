package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lh1q0;", "", "Companion", "f1q0", "g1q0", "flex-section-extension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class h1q0 {
    public static final g1q0 Companion = new g1q0();
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    public /* synthetic */ h1q0(float f, float f2, float f3, float f4, int i) {
        if ((i & 1) == 0) {
            this.a = 0.0f;
        } else {
            this.a = f;
        }
        if ((i & 2) == 0) {
            this.b = 0.0f;
        } else {
            this.b = f2;
        }
        if ((i & 4) == 0) {
            this.c = 0.0f;
        } else {
            this.c = f3;
        }
        if ((i & 8) == 0) {
            this.d = 0.0f;
        } else {
            this.d = f4;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!h1q0.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        h1q0 h1q0Var = (h1q0) obj;
        return this.a == h1q0Var.a && this.b == h1q0Var.b && this.c == h1q0Var.c && this.d == h1q0Var.d;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return ly3.q(oo31.k("SectionInsets(top=", this.a, ", left=", this.b, ", bottom="), this.c, ", right=", this.d, Extension.C_BRAKE);
    }

    public h1q0() {
        this(0);
    }

    public h1q0(int i) {
        this.a = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.d = 0.0f;
    }
}
