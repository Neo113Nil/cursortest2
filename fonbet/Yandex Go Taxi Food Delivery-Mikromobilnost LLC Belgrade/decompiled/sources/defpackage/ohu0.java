package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.model.StopSelectionStage;

/* loaded from: classes6.dex */
public final class ohu0 {
    public static final ohu0 i = new ohu0(null, false, StopSelectionStage.SELECT_STARTING_STOP, null, null, null, null, null);
    public final String a;
    public final boolean b;
    public final StopSelectionStage c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public ohu0(String str, boolean z, StopSelectionStage stopSelectionStage, String str2, String str3, String str4, String str5, String str6) {
        this.a = str;
        this.b = z;
        this.c = stopSelectionStage;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public static ohu0 a(ohu0 ohu0Var, String str, boolean z, StopSelectionStage stopSelectionStage, String str2, String str3, String str4, String str5, String str6, int i2) {
        if ((i2 & 1) != 0) {
            str = ohu0Var.a;
        }
        String str7 = str;
        if ((i2 & 2) != 0) {
            z = ohu0Var.b;
        }
        boolean z2 = z;
        if ((i2 & 4) != 0) {
            stopSelectionStage = ohu0Var.c;
        }
        StopSelectionStage stopSelectionStage2 = stopSelectionStage;
        if ((i2 & 8) != 0) {
            str2 = ohu0Var.d;
        }
        String str8 = str2;
        if ((i2 & 16) != 0) {
            str3 = ohu0Var.e;
        }
        String str9 = str3;
        if ((i2 & 32) != 0) {
            str4 = ohu0Var.f;
        }
        String str10 = str4;
        String str11 = (i2 & 64) != 0 ? ohu0Var.g : str5;
        ohu0Var.getClass();
        String str12 = (i2 & 256) != 0 ? ohu0Var.h : str6;
        ohu0Var.getClass();
        return new ohu0(str7, z2, stopSelectionStage2, str8, str9, str10, str11, str12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ohu0)) {
            return false;
        }
        ohu0 ohu0Var = (ohu0) obj;
        return jl40.l(this.a, ohu0Var.a) && this.b == ohu0Var.b && this.c == ohu0Var.c && jl40.l(this.d, ohu0Var.d) && jl40.l(this.e, ohu0Var.e) && jl40.l(this.f, ohu0Var.f) && jl40.l(this.g, ohu0Var.g) && jl40.l(this.h, ohu0Var.h);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (this.c.hashCode() + unr0.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b)) * 31;
        String str2 = this.d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.e;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.g;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 961;
        String str6 = this.h;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder l = oo31.l("StopSelectorState(selectedDestinationStopId=", this.a, ", expandStops=", ", selectionStage=", this.b);
        l.append(this.c);
        l.append(", selectedStartingStopId=");
        l.append(this.d);
        l.append(", directionId=");
        g8e.D(l, this.e, ", vehicleId=", this.f, ", qrUrl=");
        return g8e.r(l, this.g, ", metaCheckoutInfo=null, checkoutRequestId=", this.h, Extension.C_BRAKE);
    }
}
