package defpackage;

import com.yandex.delivery.mapper.model.state.DeliveryStateItem$Barcode$BarcodeOrientation;
import com.yandex.delivery.mapper.model.state.DeliveryStateItem$Barcode$BarcodeType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class o5n extends n351 {
    public final o4b1 c;
    public final DeliveryStateItem$Barcode$BarcodeType d;
    public final String e;
    public final v4v f;
    public final DeliveryStateItem$Barcode$BarcodeOrientation g;
    public final gv90 h;
    public final float i;

    public o5n(o4b1 o4b1Var, DeliveryStateItem$Barcode$BarcodeType deliveryStateItem$Barcode$BarcodeType, String str, lvi0 lvi0Var, DeliveryStateItem$Barcode$BarcodeOrientation deliveryStateItem$Barcode$BarcodeOrientation, gv90 gv90Var, float f) {
        super("dynamic-content-barcode-key", false, 14);
        this.c = o4b1Var;
        this.d = deliveryStateItem$Barcode$BarcodeType;
        this.e = str;
        this.f = lvi0Var;
        this.g = deliveryStateItem$Barcode$BarcodeOrientation;
        this.h = gv90Var;
        this.i = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o5n)) {
            return false;
        }
        o5n o5nVar = (o5n) obj;
        return this.c.equals(o5nVar.c) && this.d == o5nVar.d && jl40.l(this.e, o5nVar.e) && jl40.l(this.f, o5nVar.f) && this.g == o5nVar.g && jl40.l(this.h, o5nVar.h) && y7m.b(this.i, o5nVar.i);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + (this.c.hashCode() * 31)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        v4v v4vVar = this.f;
        int hashCode3 = (this.g.hashCode() + ((hashCode2 + (v4vVar == null ? 0 : v4vVar.hashCode())) * 31)) * 31;
        gv90 gv90Var = this.h;
        return Float.hashCode(this.i) + ((hashCode3 + (gv90Var != null ? gv90Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        String c = y7m.c(this.i);
        StringBuilder sb = new StringBuilder("DynamicContentBarcodeModel(barcode=");
        sb.append(this.c);
        sb.append(", type=");
        sb.append(this.d);
        sb.append(", subtitle=");
        sb.append(this.e);
        sb.append(", trailIcon=");
        sb.append(this.f);
        sb.append(", orientation=");
        sb.append(this.g);
        sb.append(", action=");
        sb.append(this.h);
        sb.append(", paddingTop=");
        return oyr.t(sb, c, Extension.C_BRAKE);
    }
}
