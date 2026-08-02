package defpackage;

import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class od3 {
    public final String a;
    public final String b;
    public final double c;
    public final MapBuilder d;

    public od3(double d, String str, String str2) {
        this.a = str;
        this.b = str2;
        this.c = d;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("text", str);
        mapBuilder.put(UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, str2);
        this.d = x4e.w(d, mapBuilder, "value");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od3)) {
            return false;
        }
        od3 od3Var = (od3) obj;
        return jl40.l(this.a, od3Var.a) && jl40.l(this.b, od3Var.b) && Double.compare(this.c, od3Var.c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c) + unr0.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return nzs.c(b64.v("AuctionConditionV2(text=", this.a, ", backgroundColor=", this.b, ", value="), this.c, Extension.C_BRAKE);
    }
}
