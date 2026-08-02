package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class i5r0 extends mab1 {
    public final ev3 d;
    public final String e;
    public final String f;
    public final ArrayList g;

    public i5r0(ev3 ev3Var, String str, String str2, ArrayList arrayList) {
        this.d = ev3Var;
        this.e = str;
        this.f = str2;
        this.g = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i5r0)) {
            return false;
        }
        i5r0 i5r0Var = (i5r0) obj;
        return this.d.equals(i5r0Var.d) && jl40.l(this.e, i5r0Var.e) && jl40.l(this.f, i5r0Var.f) && this.g.equals(i5r0Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + unr0.b(unr0.b(this.d.hashCode() * 31, 31, this.e), 31, this.f);
    }

    public final String toString() {
        return "AutoTopup(buttonGroup=" + this.d + ", title=" + this.e + ", subtitle=" + this.f + ", editFields=" + this.g + Extension.C_BRAKE;
    }
}
