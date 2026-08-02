package defpackage;

import android.util.Range;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class a4c0 {
    public final f4c0 a;
    public final Range b;
    public final List c;

    public a4c0(f4c0 f4c0Var, Range range, List list) {
        this.a = f4c0Var;
        this.b = range;
        this.c = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a4c0)) {
            return false;
        }
        a4c0 a4c0Var = (a4c0) obj;
        return jl40.l(this.a, a4c0Var.a) && jl40.l(this.b, a4c0Var.b) && jl40.l(this.c, a4c0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlacemarkData(placemark=");
        sb.append(this.a);
        sb.append(", currentAppearanceZoomRange=");
        sb.append(this.b);
        sb.append(", pinAppearances=");
        return ly3.s(sb, this.c, Extension.C_BRAKE);
    }
}
