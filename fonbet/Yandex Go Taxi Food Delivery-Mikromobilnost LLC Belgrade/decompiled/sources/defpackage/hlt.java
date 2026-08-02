package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lhlt;", "", "Companion", "flt", "glt", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class hlt {
    public static final glt Companion = new glt();
    public final Integer a;
    public final Integer b;
    public final Integer c;
    public final Long d;
    public final Long e;
    public final Double f;
    public final Double g;
    public final Double h;
    public final Double i;
    public final Double j;
    public final Float k;
    public final Double l;
    public final Double m;
    public final Integer n;
    public final Double o;
    public final Double p;
    public final Integer q;
    public final Double r;
    public final Double s;
    public final Double t;
    public final Double u;

    public /* synthetic */ hlt(int i, Integer num, Integer num2, Integer num3, Long l, Long l2, Double d, Double d2, Double d3, Double d4, Double d5, Float f, Double d6, Double d7, Integer num4, Double d8, Double d9, Integer num5, Double d10, Double d11, Double d12, Double d13) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = num3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = l2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d2;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = d3;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = d4;
        }
        if ((i & 512) == 0) {
            this.j = null;
        } else {
            this.j = d5;
        }
        if ((i & 1024) == 0) {
            this.k = null;
        } else {
            this.k = f;
        }
        if ((i & 2048) == 0) {
            this.l = null;
        } else {
            this.l = d6;
        }
        if ((i & 4096) == 0) {
            this.m = null;
        } else {
            this.m = d7;
        }
        if ((i & 8192) == 0) {
            this.n = null;
        } else {
            this.n = num4;
        }
        if ((i & 16384) == 0) {
            this.o = null;
        } else {
            this.o = d8;
        }
        if ((32768 & i) == 0) {
            this.p = null;
        } else {
            this.p = d9;
        }
        if ((65536 & i) == 0) {
            this.q = null;
        } else {
            this.q = num5;
        }
        if ((131072 & i) == 0) {
            this.r = null;
        } else {
            this.r = d10;
        }
        if ((262144 & i) == 0) {
            this.s = null;
        } else {
            this.s = d11;
        }
        if ((524288 & i) == 0) {
            this.t = null;
        } else {
            this.t = d12;
        }
        if ((i & 1048576) == 0) {
            this.u = null;
        } else {
            this.u = d13;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlt)) {
            return false;
        }
        hlt hltVar = (hlt) obj;
        return jl40.l(this.a, hltVar.a) && jl40.l(this.b, hltVar.b) && jl40.l(this.c, hltVar.c) && jl40.l(this.d, hltVar.d) && jl40.l(this.e, hltVar.e) && jl40.l(this.f, hltVar.f) && jl40.l(this.g, hltVar.g) && jl40.l(this.h, hltVar.h) && jl40.l(this.i, hltVar.i) && jl40.l(this.j, hltVar.j) && jl40.l(this.k, hltVar.k) && jl40.l(this.l, hltVar.l) && jl40.l(this.m, hltVar.m) && jl40.l(this.n, hltVar.n) && jl40.l(this.o, hltVar.o) && jl40.l(this.p, hltVar.p) && jl40.l(this.q, hltVar.q) && jl40.l(this.r, hltVar.r) && jl40.l(this.s, hltVar.s) && jl40.l(this.t, hltVar.t) && jl40.l(this.u, hltVar.u);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.b;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.c;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.d;
        int hashCode4 = (hashCode3 + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.e;
        int hashCode5 = (hashCode4 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d = this.f;
        int hashCode6 = (hashCode5 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.g;
        int hashCode7 = (hashCode6 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.h;
        int hashCode8 = (hashCode7 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.i;
        int hashCode9 = (hashCode8 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Double d5 = this.j;
        int hashCode10 = (hashCode9 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Float f = this.k;
        int hashCode11 = (hashCode10 + (f == null ? 0 : f.hashCode())) * 31;
        Double d6 = this.l;
        int hashCode12 = (hashCode11 + (d6 == null ? 0 : d6.hashCode())) * 31;
        Double d7 = this.m;
        int hashCode13 = (hashCode12 + (d7 == null ? 0 : d7.hashCode())) * 31;
        Integer num4 = this.n;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Double d8 = this.o;
        int hashCode15 = (hashCode14 + (d8 == null ? 0 : d8.hashCode())) * 31;
        Double d9 = this.p;
        int hashCode16 = (hashCode15 + (d9 == null ? 0 : d9.hashCode())) * 31;
        Integer num5 = this.q;
        int hashCode17 = (hashCode16 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Double d10 = this.r;
        int hashCode18 = (hashCode17 + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.s;
        int hashCode19 = (hashCode18 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.t;
        int hashCode20 = (hashCode19 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Double d13 = this.u;
        return hashCode20 + (d13 != null ? d13.hashCode() : 0);
    }

    public final String toString() {
        return "GnssMeasurementData(svid=" + this.a + ", constellationType=" + this.b + ", state=" + this.c + ", receivedSvTimeNanos=" + this.d + ", receivedSvTimeUncertaintyNanos=" + this.e + ", timeOffsetNanos=" + this.f + ", cn0DbHz=" + this.g + ", snrDb=" + this.h + ", agcLevelDb=" + this.i + ", basebandCn0DbHz=" + this.j + ", carrierFrequencyHz=" + this.k + ", pseudorangeRateMps=" + this.l + ", pseudorangeRateUncertaintyMps=" + this.m + ", adrState=" + this.n + ", adrMeters=" + this.o + ", adrUncertaintyMeters=" + this.p + ", multipathIndicator=" + this.q + ", fullIsbNanos=" + this.r + ", fullIsbUncertaintyNanos=" + this.s + ", satelliteIsbNanos=" + this.t + ", satelliteIsbUncertaintyNanos=" + this.u + Extension.C_BRAKE;
    }

    public hlt() {
        this(0);
    }

    public hlt(Integer num, Integer num2, Integer num3, Long l, Long l2, Double d, Double d2, Double d3, Double d4, Double d5, Float f, Double d6, Double d7, Integer num4, Double d8, Double d9, Integer num5, Double d10, Double d11, Double d12, Double d13) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = l;
        this.e = l2;
        this.f = d;
        this.g = d2;
        this.h = d3;
        this.i = d4;
        this.j = d5;
        this.k = f;
        this.l = d6;
        this.m = d7;
        this.n = num4;
        this.o = d8;
        this.p = d9;
        this.q = num5;
        this.r = d10;
        this.s = d11;
        this.t = d12;
        this.u = d13;
    }

    public /* synthetic */ hlt(int i) {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
    }
}
