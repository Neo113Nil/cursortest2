package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.internal.util.PlacemarkType;

/* loaded from: classes7.dex */
public final class ga20 extends ccb1 {
    public final mwb0 a;
    public final PlacemarkType b;
    public final String c;

    public ga20(mwb0 mwb0Var, PlacemarkType placemarkType, String str) {
        this.a = mwb0Var;
        this.b = placemarkType;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga20)) {
            return false;
        }
        ga20 ga20Var = (ga20) obj;
        return jl40.l(this.a, ga20Var.a) && this.b == ga20Var.b && jl40.l(this.c, ga20Var.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MetricKey(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", variationName=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
