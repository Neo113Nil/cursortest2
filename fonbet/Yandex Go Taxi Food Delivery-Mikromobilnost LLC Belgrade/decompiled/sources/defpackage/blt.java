package defpackage;

import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lblt;", "", "Companion", "zkt", "alt", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class blt {
    public static final alt Companion = new alt();
    public final Long a;
    public final Integer b;
    public final Long c;
    public final Double d;
    public final Double e;
    public final Double f;
    public final Double g;
    public final Integer h;
    public final Double i;

    public /* synthetic */ blt(int i, Long l, Integer num, Long l2, Double d, Double d2, Double d3, Double d4, Integer num2, Double d5) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = l;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = d;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = d2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = d3;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = d4;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = num2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = d5;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blt)) {
            return false;
        }
        blt bltVar = (blt) obj;
        return jl40.l(this.a, bltVar.a) && jl40.l(this.b, bltVar.b) && jl40.l(this.c, bltVar.c) && jl40.l(this.d, bltVar.d) && jl40.l(this.e, bltVar.e) && jl40.l(this.f, bltVar.f) && jl40.l(this.g, bltVar.g) && jl40.l(this.h, bltVar.h) && jl40.l(this.i, bltVar.i);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Long l2 = this.c;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d = this.d;
        int hashCode4 = (hashCode3 + (d == null ? 0 : d.hashCode())) * 31;
        Double d2 = this.e;
        int hashCode5 = (hashCode4 + (d2 == null ? 0 : d2.hashCode())) * 31;
        Double d3 = this.f;
        int hashCode6 = (hashCode5 + (d3 == null ? 0 : d3.hashCode())) * 31;
        Double d4 = this.g;
        int hashCode7 = (hashCode6 + (d4 == null ? 0 : d4.hashCode())) * 31;
        Integer num2 = this.h;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Double d5 = this.i;
        return hashCode8 + (d5 != null ? d5.hashCode() : 0);
    }

    public final String toString() {
        return "GnssClockData(timeNanos=" + this.a + ", hwClockDiscontinuityCount=" + this.b + ", fullBiasNanos=" + this.c + ", biasNanos=" + this.d + ", biasUncertaintyNanos=" + this.e + ", driftNanosPerSecond=" + this.f + ", driftUncertaintyNanosPerSecond=" + this.g + ", leapSecond=" + this.h + ", timeUncertaintyNanos=" + this.i + Extension.C_BRAKE;
    }

    public blt() {
        this(0);
    }

    public blt(Long l, Integer num, Long l2, Double d, Double d2, Double d3, Double d4, Integer num2, Double d5) {
        this.a = l;
        this.b = num;
        this.c = l2;
        this.d = d;
        this.e = d2;
        this.f = d3;
        this.g = d4;
        this.h = num2;
        this.i = d5;
    }

    public /* synthetic */ blt(int i) {
        this(null, null, null, null, null, null, null, null, null);
    }
}
