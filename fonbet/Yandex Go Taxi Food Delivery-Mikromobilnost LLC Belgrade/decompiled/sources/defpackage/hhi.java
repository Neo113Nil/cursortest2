package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class hhi {
    public final ghi a;
    public final ghi b;

    public hhi(ghi ghiVar, ghi ghiVar2) {
        this.a = ghiVar;
        this.b = ghiVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhi)) {
            return false;
        }
        hhi hhiVar = (hhi) obj;
        return this.a.equals(hhiVar.a) && this.b.equals(hhiVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeliveryPaidInsuranceScreenButtonOptionsModel(selected=" + this.a + ", unselected=" + this.b + Extension.C_BRAKE;
    }
}
