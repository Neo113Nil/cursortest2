package xsna;

/* compiled from: ReefSignalInfo.kt */
/* loaded from: classes5.dex */
public final class sof0 {
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final tof0 d;
    public final rof0 e;
    public final eof0 f;

    public sof0() {
        this(null, null, null, null, null, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sof0)) {
            return false;
        }
        sof0 sof0Var = (sof0) obj;
        return epx.f(this.a, sof0Var.a) && epx.f(this.b, sof0Var.b) && epx.f(this.c, sof0Var.c) && epx.f(this.d, sof0Var.d) && epx.f(this.e, sof0Var.e) && epx.f(this.f, sof0Var.f);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        tof0 tof0Var = this.d;
        int hashCode4 = (hashCode3 + (tof0Var == null ? 0 : tof0Var.hashCode())) * 31;
        rof0 rof0Var = this.e;
        int hashCode5 = (hashCode4 + (rof0Var == null ? 0 : rof0Var.hashCode())) * 31;
        eof0 eof0Var = this.f;
        return hashCode5 + (eof0Var != null ? eof0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = wr.a(this.a, "ReefSignalInfo(asuLevel=", this.b, ", level=", ", dbm=");
        a.append(this.c);
        a.append(", lteDetails=");
        a.append(this.d);
        a.append(", gsmDetails=");
        a.append(this.e);
        a.append(", noGuaranteedSignalInfo=");
        a.append(this.f);
        a.append(")");
        return a.toString();
    }

    public sof0(Integer num, Integer num2, Integer num3, tof0 tof0Var, rof0 rof0Var, eof0 eof0Var, int i) {
        num = (i & 1) != 0 ? null : num;
        num2 = (i & 2) != 0 ? null : num2;
        num3 = (i & 4) != 0 ? null : num3;
        tof0Var = (i & 8) != 0 ? null : tof0Var;
        rof0Var = (i & 16) != 0 ? null : rof0Var;
        eof0Var = (i & 32) != 0 ? null : eof0Var;
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = tof0Var;
        this.e = rof0Var;
        this.f = eof0Var;
    }
}
