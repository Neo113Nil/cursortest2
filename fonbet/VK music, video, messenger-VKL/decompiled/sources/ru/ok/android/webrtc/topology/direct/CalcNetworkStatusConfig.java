package ru.ok.android.webrtc.topology.direct;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.be;
import xsna.lby;
import xsna.wn4;

/* loaded from: classes9.dex */
public final class CalcNetworkStatusConfig {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final double j;
    public final double k;
    public final double l;
    public final double m;
    public final double n;
    public final double o;
    public final double p;
    public final boolean q;
    public final double r;
    public final double s;
    public final double t;
    public final boolean u;
    public final double v;
    public final double w;
    public final double x;
    public final double y;
    public final double z;

    public CalcNetworkStatusConfig(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z, double d17, double d18, double d19, boolean z2, double d20, double d21, double d22, double d23, double d24) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        this.h = d8;
        this.i = d9;
        this.j = d10;
        this.k = d11;
        this.l = d12;
        this.m = d13;
        this.n = d14;
        this.o = d15;
        this.p = d16;
        this.q = z;
        this.r = d17;
        this.s = d18;
        this.t = d19;
        this.u = z2;
        this.v = d20;
        this.w = d21;
        this.x = d22;
        this.y = d23;
        this.z = d24;
    }

    public static /* synthetic */ CalcNetworkStatusConfig copy$default(CalcNetworkStatusConfig calcNetworkStatusConfig, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z, double d17, double d18, double d19, boolean z2, double d20, double d21, double d22, double d23, double d24, int i, Object obj) {
        double d25;
        double d26;
        double d27;
        double d28;
        double d29;
        double d30;
        boolean z3;
        double d31;
        double d32;
        double d33;
        boolean z4;
        double d34;
        double d35;
        double d36;
        double d37;
        double d38;
        double d39;
        double d40;
        double d41;
        double d42;
        double d43;
        double d44;
        double d45;
        double d46;
        double d47;
        CalcNetworkStatusConfig calcNetworkStatusConfig2;
        double d48 = (i & 1) != 0 ? calcNetworkStatusConfig.a : d;
        double d49 = (i & 2) != 0 ? calcNetworkStatusConfig.b : d2;
        double d50 = (i & 4) != 0 ? calcNetworkStatusConfig.c : d3;
        double d51 = (i & 8) != 0 ? calcNetworkStatusConfig.d : d4;
        double d52 = (i & 16) != 0 ? calcNetworkStatusConfig.e : d5;
        double d53 = (i & 32) != 0 ? calcNetworkStatusConfig.f : d6;
        double d54 = (i & 64) != 0 ? calcNetworkStatusConfig.g : d7;
        double d55 = d48;
        double d56 = (i & 128) != 0 ? calcNetworkStatusConfig.h : d8;
        double d57 = (i & 256) != 0 ? calcNetworkStatusConfig.i : d9;
        double d58 = (i & 512) != 0 ? calcNetworkStatusConfig.j : d10;
        double d59 = (i & 1024) != 0 ? calcNetworkStatusConfig.k : d11;
        double d60 = (i & 2048) != 0 ? calcNetworkStatusConfig.l : d12;
        double d61 = (i & 4096) != 0 ? calcNetworkStatusConfig.m : d13;
        double d62 = (i & 8192) != 0 ? calcNetworkStatusConfig.n : d14;
        double d63 = (i & 16384) != 0 ? calcNetworkStatusConfig.o : d15;
        double d64 = (i & 32768) != 0 ? calcNetworkStatusConfig.p : d16;
        boolean z5 = (i & 65536) != 0 ? calcNetworkStatusConfig.q : z;
        double d65 = d64;
        double d66 = (i & 131072) != 0 ? calcNetworkStatusConfig.r : d17;
        double d67 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? calcNetworkStatusConfig.s : d18;
        double d68 = (i & 524288) != 0 ? calcNetworkStatusConfig.t : d19;
        boolean z6 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? calcNetworkStatusConfig.u : z2;
        double d69 = (i & 2097152) != 0 ? calcNetworkStatusConfig.v : d20;
        double d70 = (i & 4194304) != 0 ? calcNetworkStatusConfig.w : d21;
        double d71 = (i & 8388608) != 0 ? calcNetworkStatusConfig.x : d22;
        double d72 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? calcNetworkStatusConfig.y : d23;
        if ((i & 33554432) != 0) {
            d26 = d72;
            d25 = calcNetworkStatusConfig.z;
            d28 = d66;
            d29 = d67;
            d30 = d68;
            z3 = z6;
            d31 = d69;
            d32 = d70;
            d33 = d71;
            z4 = z5;
            d35 = d58;
            d36 = d59;
            d37 = d60;
            d38 = d61;
            d39 = d62;
            d40 = d63;
            d27 = d65;
            d42 = d50;
            d43 = d51;
            d44 = d52;
            d45 = d53;
            d46 = d54;
            d47 = d56;
            d34 = d57;
            calcNetworkStatusConfig2 = calcNetworkStatusConfig;
            d41 = d49;
        } else {
            d25 = d24;
            d26 = d72;
            d27 = d65;
            d28 = d66;
            d29 = d67;
            d30 = d68;
            z3 = z6;
            d31 = d69;
            d32 = d70;
            d33 = d71;
            z4 = z5;
            d34 = d57;
            d35 = d58;
            d36 = d59;
            d37 = d60;
            d38 = d61;
            d39 = d62;
            d40 = d63;
            d41 = d49;
            d42 = d50;
            d43 = d51;
            d44 = d52;
            d45 = d53;
            d46 = d54;
            d47 = d56;
            calcNetworkStatusConfig2 = calcNetworkStatusConfig;
        }
        return calcNetworkStatusConfig2.copy(d55, d41, d42, d43, d44, d45, d46, d47, d34, d35, d36, d37, d38, d39, d40, d27, z4, d28, d29, d30, z3, d31, d32, d33, d26, d25);
    }

    public final double component1() {
        return this.a;
    }

    public final double component10() {
        return this.j;
    }

    public final double component11() {
        return this.k;
    }

    public final double component12() {
        return this.l;
    }

    public final double component13() {
        return this.m;
    }

    public final double component14() {
        return this.n;
    }

    public final double component15() {
        return this.o;
    }

    public final double component16() {
        return this.p;
    }

    public final boolean component17() {
        return this.q;
    }

    public final double component18() {
        return this.r;
    }

    public final double component19() {
        return this.s;
    }

    public final double component2() {
        return this.b;
    }

    public final double component20() {
        return this.t;
    }

    public final boolean component21() {
        return this.u;
    }

    public final double component22() {
        return this.v;
    }

    public final double component23() {
        return this.w;
    }

    public final double component24() {
        return this.x;
    }

    public final double component25() {
        return this.y;
    }

    public final double component26() {
        return this.z;
    }

    public final double component3() {
        return this.c;
    }

    public final double component4() {
        return this.d;
    }

    public final double component5() {
        return this.e;
    }

    public final double component6() {
        return this.f;
    }

    public final double component7() {
        return this.g;
    }

    public final double component8() {
        return this.h;
    }

    public final double component9() {
        return this.i;
    }

    public final CalcNetworkStatusConfig copy(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z, double d17, double d18, double d19, boolean z2, double d20, double d21, double d22, double d23, double d24) {
        return new CalcNetworkStatusConfig(d, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16, z, d17, d18, d19, z2, d20, d21, d22, d23, d24);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalcNetworkStatusConfig)) {
            return false;
        }
        CalcNetworkStatusConfig calcNetworkStatusConfig = (CalcNetworkStatusConfig) obj;
        return Double.compare(this.a, calcNetworkStatusConfig.a) == 0 && Double.compare(this.b, calcNetworkStatusConfig.b) == 0 && Double.compare(this.c, calcNetworkStatusConfig.c) == 0 && Double.compare(this.d, calcNetworkStatusConfig.d) == 0 && Double.compare(this.e, calcNetworkStatusConfig.e) == 0 && Double.compare(this.f, calcNetworkStatusConfig.f) == 0 && Double.compare(this.g, calcNetworkStatusConfig.g) == 0 && Double.compare(this.h, calcNetworkStatusConfig.h) == 0 && Double.compare(this.i, calcNetworkStatusConfig.i) == 0 && Double.compare(this.j, calcNetworkStatusConfig.j) == 0 && Double.compare(this.k, calcNetworkStatusConfig.k) == 0 && Double.compare(this.l, calcNetworkStatusConfig.l) == 0 && Double.compare(this.m, calcNetworkStatusConfig.m) == 0 && Double.compare(this.n, calcNetworkStatusConfig.n) == 0 && Double.compare(this.o, calcNetworkStatusConfig.o) == 0 && Double.compare(this.p, calcNetworkStatusConfig.p) == 0 && this.q == calcNetworkStatusConfig.q && Double.compare(this.r, calcNetworkStatusConfig.r) == 0 && Double.compare(this.s, calcNetworkStatusConfig.s) == 0 && Double.compare(this.t, calcNetworkStatusConfig.t) == 0 && this.u == calcNetworkStatusConfig.u && Double.compare(this.v, calcNetworkStatusConfig.v) == 0 && Double.compare(this.w, calcNetworkStatusConfig.w) == 0 && Double.compare(this.x, calcNetworkStatusConfig.x) == 0 && Double.compare(this.y, calcNetworkStatusConfig.y) == 0 && Double.compare(this.z, calcNetworkStatusConfig.z) == 0;
    }

    public final boolean getBitrateRatingEnabled() {
        return this.u;
    }

    public final double getBitrateRatingInfluenceFactor() {
        return this.v;
    }

    public final double getCriticalFastLoss() {
        return this.o;
    }

    public final double getCriticalRtt() {
        return this.n;
    }

    public final double getCriticalSlowLoss() {
        return this.p;
    }

    public final double getEstimatedBitrateWeightDown() {
        return this.x;
    }

    public final double getEstimatedBitrateWeightUp() {
        return this.w;
    }

    public final double getFastLossValue() {
        return this.l;
    }

    public final double getFastLossWeight() {
        return this.j;
    }

    public final double getGoodLoss() {
        return this.r;
    }

    public final double getGoodRtt() {
        return this.e;
    }

    public final double getLossStep() {
        return this.s;
    }

    public final double getLossStepWeight() {
        return this.t;
    }

    public final boolean getNewNetworkRatingModelEnabled() {
        return this.q;
    }

    public final double getRatingWeightDown() {
        return this.d;
    }

    public final double getRatingWeightUp() {
        return this.c;
    }

    public final double getRedline() {
        return this.a;
    }

    public final double getRedlineMargin() {
        return this.b;
    }

    public final double getReportedBitrateWeightDown() {
        return this.z;
    }

    public final double getReportedBitrateWeightUp() {
        return this.y;
    }

    public final double getRttStep() {
        return this.h;
    }

    public final double getRttStepWeight() {
        return this.i;
    }

    public final double getRttWeightDown() {
        return this.g;
    }

    public final double getRttWeightUp() {
        return this.f;
    }

    public final double getSlowLossValue() {
        return this.m;
    }

    public final double getSlowLossWeight() {
        return this.k;
    }

    public int hashCode() {
        return Double.hashCode(this.z) + be.b(this.y, be.b(this.x, be.b(this.w, be.b(this.v, wn4.b(this.u, be.b(this.t, be.b(this.s, be.b(this.r, wn4.b(this.q, be.b(this.p, be.b(this.o, be.b(this.n, be.b(this.m, be.b(this.l, be.b(this.k, be.b(this.j, be.b(this.i, be.b(this.h, be.b(this.g, be.b(this.f, be.b(this.e, be.b(this.d, be.b(this.c, be.b(this.b, Double.hashCode(this.a) * 31))))))))))))))))))))))));
    }

    public String toString() {
        double d = this.a;
        double d2 = this.b;
        double d3 = this.c;
        double d4 = this.d;
        double d5 = this.e;
        double d6 = this.f;
        double d7 = this.g;
        double d8 = this.h;
        double d9 = this.i;
        double d10 = this.j;
        double d11 = this.k;
        double d12 = this.l;
        double d13 = this.m;
        double d14 = this.n;
        double d15 = this.o;
        double d16 = this.p;
        boolean z = this.q;
        double d17 = this.r;
        double d18 = this.s;
        double d19 = this.t;
        boolean z2 = this.u;
        double d20 = this.v;
        double d21 = this.w;
        double d22 = this.x;
        double d23 = this.y;
        double d24 = this.z;
        StringBuilder a = lby.a("CalcNetworkStatusConfig(redline=", d, ", redlineMargin=");
        a.append(d2);
        com.vk.movika.sdk.android.defaultplayer.view.a.a(a, ", ratingWeightUp=", d3, ", ratingWeightDown=");
        a.append(d4);
        com.vk.movika.sdk.android.defaultplayer.view.a.a(a, ", goodRtt=", d5, ", rttWeightUp=");
        a.append(d6);
        com.vk.movika.sdk.android.defaultplayer.view.a.a(a, ", rttWeightDown=", d7, ", rttStep=");
        a.append(d8);
        com.vk.movika.sdk.android.defaultplayer.view.a.a(a, ", rttStepWeight=", d9, ", fastLossWeight=");
        a.append(d10);
        com.vk.movika.sdk.android.defaultplayer.view.a.a(a, ", slowLossWeight=", d11, ", fastLossValue=");
        a.append(d12);
        com.vk.movika.sdk.android.defaultplayer.view.a.a(a, ", slowLossValue=", d13, ", criticalRtt=");
        a.append(d14);
        com.vk.movika.sdk.android.defaultplayer.view.a.a(a, ", criticalFastLoss=", d15, ", criticalSlowLoss=");
        a.append(d16);
        a.append(", newNetworkRatingModelEnabled=");
        a.append(z);
        com.vk.movika.sdk.android.defaultplayer.view.a.a(a, ", goodLoss=", d17, ", lossStep=");
        a.append(d18);
        com.vk.movika.sdk.android.defaultplayer.view.a.a(a, ", lossStepWeight=", d19, ", bitrateRatingEnabled=");
        a.append(z2);
        a.append(", bitrateRatingInfluenceFactor=");
        a.append(d20);
        com.vk.movika.sdk.android.defaultplayer.view.a.a(a, ", estimatedBitrateWeightUp=", d21, ", estimatedBitrateWeightDown=");
        a.append(d22);
        com.vk.movika.sdk.android.defaultplayer.view.a.a(a, ", reportedBitrateWeightUp=", d23, ", reportedBitrateWeightDown=");
        a.append(d24);
        a.append(")");
        return a.toString();
    }
}
