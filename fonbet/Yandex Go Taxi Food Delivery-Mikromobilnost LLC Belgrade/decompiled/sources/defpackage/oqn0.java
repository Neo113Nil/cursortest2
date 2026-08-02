package defpackage;

import com.yandex.go.scooters.ignition.domain.model.ScootersIgnitionOption;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class oqn0 implements qqn0 {
    public final String a;
    public final String b;
    public final ScootersIgnitionOption c;
    public final int d;

    public oqn0(String str, String str2, ScootersIgnitionOption scootersIgnitionOption, int i) {
        this.a = str;
        this.b = str2;
        this.c = scootersIgnitionOption;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqn0)) {
            return false;
        }
        oqn0 oqn0Var = (oqn0) obj;
        return jl40.l(this.a, oqn0Var.a) && jl40.l(this.b, oqn0Var.b) && this.c == oqn0Var.c && this.d == oqn0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        String j = oyr.j(this.d, "ScootersIgnitionOptionState(value=", Extension.C_BRAKE);
        StringBuilder v = b64.v("Option(title=", this.a, ", subtitle=", this.b, ", id=");
        v.append(this.c);
        v.append(", state=");
        v.append(j);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
