package xsna;

/* compiled from: ReefSignalLteDetails.kt */
/* loaded from: classes5.dex */
public final class tof0 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;

    public tof0() {
        this(null, null, null, null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tof0)) {
            return false;
        }
        tof0 tof0Var = (tof0) obj;
        return epx.f(this.a, tof0Var.a) && epx.f(this.b, tof0Var.b) && epx.f(this.c, tof0Var.c) && epx.f(this.d, tof0Var.d) && epx.f(this.e, tof0Var.e) && epx.f(this.f, tof0Var.f);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.d;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.e;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.f;
        return hashCode5 + (num6 != null ? num6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = wr.a(this.a, "ReefSignalLteDetails(rssnr=", this.b, ", cqi=", ", rsrp=");
        sq.b(a, this.c, ", rsrq=", this.d, ", rssi=");
        a.append(this.e);
        a.append(", timingAdvance=");
        a.append(this.f);
        a.append(")");
        return a.toString();
    }

    public tof0(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = num5;
        this.f = num6;
    }
}
