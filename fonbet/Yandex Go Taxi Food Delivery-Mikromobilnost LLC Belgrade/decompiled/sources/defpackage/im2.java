package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lim2;", "Lafi;", "Companion", "hm2", "gm2", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class im2 implements afi {
    public static final hm2 Companion = new hm2();
    public final String a;
    public final String b;

    public /* synthetic */ im2(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = "";
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = "";
        } else {
            this.b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof im2)) {
            return false;
        }
        im2 im2Var = (im2) obj;
        return jl40.l(this.a, im2Var.a) && jl40.l(this.b, im2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("ApartmentDeliveryOption(floorLabel=", this.a, ", apartmentLabel=", this.b, Extension.C_BRAKE);
    }

    public im2() {
        this.a = "";
        this.b = "";
    }
}
