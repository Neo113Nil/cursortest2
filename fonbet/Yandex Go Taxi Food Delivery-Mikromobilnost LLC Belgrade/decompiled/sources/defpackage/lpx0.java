package defpackage;

import com.yandex.go.zone.dto.objects.ZoneTariffInfo;
import com.yandex.go.zone.model.Zone;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class lpx0 {
    public final String a;
    public final String b;
    public final String c;
    public final ZoneTariffInfo d;
    public final Zone e;
    public final kpx0 f;

    public lpx0(String str, String str2, String str3, ZoneTariffInfo zoneTariffInfo, Zone zone, kpx0 kpx0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = zoneTariffInfo;
        this.e = zone;
        this.f = kpx0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lpx0)) {
            return false;
        }
        lpx0 lpx0Var = (lpx0) obj;
        return jl40.l(this.a, lpx0Var.a) && jl40.l(this.b, lpx0Var.b) && jl40.l(this.c, lpx0Var.c) && jl40.l(this.d, lpx0Var.d) && jl40.l(this.e, lpx0Var.e) && jl40.l(this.f, lpx0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        ZoneTariffInfo zoneTariffInfo = this.d;
        int hashCode = (this.e.hashCode() + ((b + (zoneTariffInfo == null ? 0 : zoneTariffInfo.hashCode())) * 31)) * 31;
        kpx0 kpx0Var = this.f;
        return hashCode + (kpx0Var != null ? kpx0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("TariffUpgrade(title=", this.a, ", text=", this.b, ", classAfterUpdate=");
        v.append(this.c);
        v.append(", zoneTariffInfo=");
        v.append(this.d);
        v.append(", zone=");
        v.append(this.e);
        v.append(", image=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
