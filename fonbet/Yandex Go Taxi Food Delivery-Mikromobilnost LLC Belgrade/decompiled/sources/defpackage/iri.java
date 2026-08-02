package defpackage;

import com.yandex.delivery.mapper.model.state.DeliveryStateItem$Barcode$BarcodeOrientation;
import com.yandex.delivery.mapper.model.state.DeliveryStateItem$Barcode$BarcodeType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class iri extends uri {
    public final o4b1 a;
    public final String b;
    public final String c;
    public final DeliveryStateItem$Barcode$BarcodeType d;
    public final DeliveryStateItem$Barcode$BarcodeOrientation e;
    public final gv90 f;

    public iri(o4b1 o4b1Var, String str, String str2, DeliveryStateItem$Barcode$BarcodeType deliveryStateItem$Barcode$BarcodeType, DeliveryStateItem$Barcode$BarcodeOrientation deliveryStateItem$Barcode$BarcodeOrientation, gv90 gv90Var) {
        this.a = o4b1Var;
        this.b = str;
        this.c = str2;
        this.d = deliveryStateItem$Barcode$BarcodeType;
        this.e = deliveryStateItem$Barcode$BarcodeOrientation;
        this.f = gv90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iri)) {
            return false;
        }
        iri iriVar = (iri) obj;
        return this.a.equals(iriVar.a) && jl40.l(this.b, iriVar.b) && jl40.l(this.c, iriVar.c) && this.d == iriVar.d && this.e == iriVar.e && jl40.l(this.f, iriVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (this.e.hashCode() + ((this.d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31)) * 31;
        gv90 gv90Var = this.f;
        return hashCode3 + (gv90Var != null ? gv90Var.hashCode() : 0);
    }

    public final String toString() {
        return "Barcode(barcode=" + this.a + ", subtitle=" + this.b + ", trailImageUrl=" + this.c + ", type=" + this.d + ", orientation=" + this.e + ", action=" + this.f + Extension.C_BRAKE;
    }
}
