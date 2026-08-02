package defpackage;

import com.yandex.go.scooters.bdui.api.ScootersBduiScreenType;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class d0n0 {
    public final String a;
    public final String b;
    public final ScootersBduiScreenType c;
    public final Map d;
    public final ewn0 e;

    public d0n0(String str, String str2, ScootersBduiScreenType scootersBduiScreenType, Map map, ewn0 ewn0Var) {
        this.a = str;
        this.b = str2;
        this.c = scootersBduiScreenType;
        this.d = map;
        this.e = ewn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0n0)) {
            return false;
        }
        d0n0 d0n0Var = (d0n0) obj;
        return this.a.equals(d0n0Var.a) && this.b.equals(d0n0Var.b) && this.c == d0n0Var.c && jl40.l(this.d, d0n0Var.d) && jl40.l(this.e, d0n0Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        Map map = this.d;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        ewn0 ewn0Var = this.e;
        return hashCode2 + (ewn0Var != null ? ewn0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("ScootersBduiContent(documentPath=", this.a, ", componentOwner=", this.b, ", scootersBduiScreenType=");
        v.append(this.c);
        v.append(", documentBody=");
        v.append(this.d);
        v.append(", scootersLifecycleRepository=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
