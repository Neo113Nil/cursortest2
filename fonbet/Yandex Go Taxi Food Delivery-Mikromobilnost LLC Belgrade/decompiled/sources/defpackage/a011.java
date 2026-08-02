package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

/* loaded from: classes6.dex */
public final class a011 {
    public final zz01 a;
    public final String b;
    public final String c;
    public final double d;
    public final String e;
    public final String f;
    public final MapBuilder g;

    public a011(zz01 zz01Var, String str, String str2, double d, String str3, String str4) {
        this.a = zz01Var;
        this.b = str;
        this.c = str2;
        this.d = d;
        this.e = str3;
        this.f = str4;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("coordinate", zz01Var.c);
        mapBuilder.put(MetaDataField.SCREEN_FIELD, str);
        mapBuilder.put("update_time", str2);
        mapBuilder.put("time_since_last_address_selection_sec", Double.valueOf(d));
        if (str3 != null) {
            mapBuilder.put("action", str3);
        }
        if (str4 != null) {
            mapBuilder.put("method", str4);
        }
        this.g = mapBuilder.j();
    }

    public final MapBuilder a() {
        return this.g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a011)) {
            return false;
        }
        a011 a011Var = (a011) obj;
        return this.a.equals(a011Var.a) && this.b.equals(a011Var.b) && this.c.equals(a011Var.c) && Double.compare(this.d, a011Var.d) == 0 && jl40.l(this.e, a011Var.e) && jl40.l(this.f, a011Var.f);
    }

    public final int hashCode() {
        int a = unr0.a(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        String str = this.e;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Starting(coordinate=");
        sb.append(this.a);
        sb.append(", screen=");
        sb.append(this.b);
        sb.append(", updateTime=");
        sb.append(this.c);
        sb.append(", timeSinceLastAddressSelectionSec=");
        sb.append(this.d);
        g8e.D(sb, ", action=", this.e, ", method=", this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
