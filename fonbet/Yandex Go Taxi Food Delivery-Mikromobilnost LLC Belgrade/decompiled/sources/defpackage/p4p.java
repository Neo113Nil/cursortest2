package defpackage;

import com.adjust.sdk.Constants;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class p4p {
    public final k4p a;
    public final float b;
    public final boolean c;
    public final jj2 d;
    public final boolean e;

    public /* synthetic */ p4p(int i) {
        this(new k4p(0), Float.NaN, (i & 4) != 0, sb2.K(Constants.MINIMAL_ERROR_STATUS_CODE, 0, null, 6), true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4p)) {
            return false;
        }
        p4p p4pVar = (p4p) obj;
        return jl40.l(this.a, p4pVar.a) && y7m.b(this.b, p4pVar.b) && this.c == p4pVar.c && jl40.l(this.d, p4pVar.d) && this.e == p4pVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + unr0.e(g8e.c(this.b, this.a.hashCode() * 31, 31), 31, this.c)) * 31);
    }

    public final String toString() {
        String c = y7m.c(this.b);
        StringBuilder sb = new StringBuilder("ExtraBarCardStyle(colors=");
        sb.append(this.a);
        sb.append(", cardRadius=");
        sb.append(c);
        sb.append(", roundFromAllSides=");
        sb.append(this.c);
        sb.append(", animationSpec=");
        sb.append(this.d);
        sb.append(", clipCardContent=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }

    public p4p(k4p k4pVar, float f, boolean z, jj2 jj2Var, boolean z2) {
        this.a = k4pVar;
        this.b = f;
        this.c = z;
        this.d = jj2Var;
        this.e = z2;
    }
}
