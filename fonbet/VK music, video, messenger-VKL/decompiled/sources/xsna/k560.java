package xsna;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.reefton.dto.network.ReefMobileNetworkDataState;
import com.vk.reefton.dto.network.ReefNetworkType;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.List;

/* compiled from: ReefState.kt */
/* loaded from: classes5.dex */
public final class k560 extends wof0 {
    public final ReefNetworkType a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final String e;
    public final String f;
    public final boolean g;
    public final ReefMobileNetworkDataState h;
    public final List<uof0> i;
    public final Long j;
    public final Long k;
    public final Long l;
    public final Long m;
    public final Long n;
    public final Long o;
    public final List<dnf0> p;
    public final List<dnf0> q;
    public final List<dnf0> r;
    public final Boolean s;
    public final Boolean t;
    public final Integer u;
    public final Integer v;
    public final String w;
    public final List<sof0> x;
    public final boolean y;

    public k560(ReefNetworkType reefNetworkType, Integer num, Integer num2, Integer num3, String str, String str2, boolean z, ReefMobileNetworkDataState reefMobileNetworkDataState, List<uof0> list, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, List<dnf0> list2, List<dnf0> list3, List<dnf0> list4, Boolean bool, Boolean bool2, Integer num4, Integer num5, String str3, List<sof0> list5, boolean z2) {
        this.a = reefNetworkType;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = str;
        this.f = str2;
        this.g = z;
        this.h = reefMobileNetworkDataState;
        this.i = list;
        this.j = l;
        this.k = l2;
        this.l = l3;
        this.m = l4;
        this.n = l5;
        this.o = l6;
        this.p = list2;
        this.q = list3;
        this.r = list4;
        this.s = bool;
        this.t = bool2;
        this.u = num4;
        this.v = num5;
        this.w = str3;
        this.x = list5;
        this.y = z2;
    }

    public static k560 a(k560 k560Var, ReefNetworkType reefNetworkType, Integer num, Integer num2, Integer num3, String str, String str2, boolean z, ReefMobileNetworkDataState reefMobileNetworkDataState, List list, Long l, Long l2, Long l3, Long l4, Long l5, Long l6, ArrayList arrayList, ArrayList arrayList2, List list2, Boolean bool, Boolean bool2, Integer num4, Integer num5, String str3, ArrayList arrayList3, boolean z2, int i) {
        ReefNetworkType reefNetworkType2 = (i & 1) != 0 ? k560Var.a : reefNetworkType;
        Integer num6 = (i & 2) != 0 ? k560Var.b : num;
        Integer num7 = (i & 4) != 0 ? k560Var.c : num2;
        Integer num8 = (i & 8) != 0 ? k560Var.d : num3;
        String str4 = (i & 16) != 0 ? k560Var.e : str;
        String str5 = (i & 32) != 0 ? k560Var.f : str2;
        boolean z3 = (i & 64) != 0 ? k560Var.g : z;
        ReefMobileNetworkDataState reefMobileNetworkDataState2 = (i & 128) != 0 ? k560Var.h : reefMobileNetworkDataState;
        List list3 = (i & 256) != 0 ? k560Var.i : list;
        Long l7 = (i & 512) != 0 ? k560Var.j : l;
        Long l8 = (i & 1024) != 0 ? k560Var.k : l2;
        Long l9 = (i & 2048) != 0 ? k560Var.l : l3;
        Long l10 = (i & 4096) != 0 ? k560Var.m : l4;
        Long l11 = (i & 8192) != 0 ? k560Var.n : l5;
        ReefNetworkType reefNetworkType3 = reefNetworkType2;
        Long l12 = (i & 16384) != 0 ? k560Var.o : l6;
        List<dnf0> list4 = (i & 32768) != 0 ? k560Var.p : arrayList;
        List<dnf0> list5 = (i & 65536) != 0 ? k560Var.q : arrayList2;
        List list6 = (i & 131072) != 0 ? k560Var.r : list2;
        Boolean bool3 = (i & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? k560Var.s : bool;
        Boolean bool4 = (i & 524288) != 0 ? k560Var.t : bool2;
        Integer num9 = (i & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? k560Var.u : num4;
        Integer num10 = (i & 2097152) != 0 ? k560Var.v : num5;
        String str6 = (i & 4194304) != 0 ? k560Var.w : str3;
        List<sof0> list7 = (i & 8388608) != 0 ? k560Var.x : arrayList3;
        boolean z4 = (i & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? k560Var.y : z2;
        k560Var.getClass();
        return new k560(reefNetworkType3, num6, num7, num8, str4, str5, z3, reefMobileNetworkDataState2, list3, l7, l8, l9, l10, l11, l12, list4, list5, list6, bool3, bool4, num9, num10, str6, list7, z4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k560)) {
            return false;
        }
        k560 k560Var = (k560) obj;
        return this.a == k560Var.a && epx.f(this.b, k560Var.b) && epx.f(this.c, k560Var.c) && epx.f(this.d, k560Var.d) && epx.f(this.e, k560Var.e) && epx.f(this.f, k560Var.f) && this.g == k560Var.g && this.h == k560Var.h && epx.f(this.i, k560Var.i) && epx.f(this.j, k560Var.j) && epx.f(this.k, k560Var.k) && epx.f(this.l, k560Var.l) && epx.f(this.m, k560Var.m) && epx.f(this.n, k560Var.n) && epx.f(this.o, k560Var.o) && epx.f(this.p, k560Var.p) && epx.f(this.q, k560Var.q) && epx.f(this.r, k560Var.r) && epx.f(this.s, k560Var.s) && epx.f(this.t, k560Var.t) && epx.f(this.u, k560Var.u) && epx.f(this.v, k560Var.v) && epx.f(this.w, k560Var.w) && epx.f(this.x, k560Var.x) && this.y == k560Var.y;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str = this.e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        int a = fw3.a((this.h.hashCode() + qoy.b((hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.g)) * 31, 31, this.i);
        Long l = this.j;
        int hashCode6 = (a + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.k;
        int hashCode7 = (hashCode6 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.l;
        int hashCode8 = (hashCode7 + (l3 == null ? 0 : l3.hashCode())) * 31;
        Long l4 = this.m;
        int hashCode9 = (hashCode8 + (l4 == null ? 0 : l4.hashCode())) * 31;
        Long l5 = this.n;
        int hashCode10 = (hashCode9 + (l5 == null ? 0 : l5.hashCode())) * 31;
        Long l6 = this.o;
        int a2 = fw3.a(fw3.a(fw3.a((hashCode10 + (l6 == null ? 0 : l6.hashCode())) * 31, 31, this.p), 31, this.q), 31, this.r);
        Boolean bool = this.s;
        int hashCode11 = (a2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.t;
        int hashCode12 = (hashCode11 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Integer num4 = this.u;
        int hashCode13 = (hashCode12 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.v;
        int hashCode14 = (hashCode13 + (num5 == null ? 0 : num5.hashCode())) * 31;
        String str3 = this.w;
        int hashCode15 = (hashCode14 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<sof0> list = this.x;
        return Boolean.hashCode(this.y) + ((hashCode15 + (list != null ? list.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NetworkState(type=");
        sb.append(this.a);
        sb.append(", typeCode=");
        sb.append(this.b);
        sb.append(", mobileNetworkTypeCode=");
        sq.b(sb, this.c, ", subtypeCode=", this.d, ", simOperator=");
        n6j.b(sb, this.e, ", networkOperator=", this.f, ", isRoaming=");
        sb.append(this.g);
        sb.append(", networkDataState=");
        sb.append(this.h);
        sb.append(", simInfo=");
        sb.append(this.i);
        sb.append(", totalReceivedBytes=");
        sb.append(this.j);
        sb.append(", purgedReceivedBytes=");
        sb.append(this.k);
        sb.append(", totalReceivedBytesByProcess=");
        sb.append(this.l);
        sb.append(", purgedReceivedBytesByProcess=");
        sb.append(this.m);
        sb.append(", totalReceivedBytesBySession=");
        sb.append(this.n);
        sb.append(", purgedReceivedBytesBySession=");
        sb.append(this.o);
        sb.append(", cellsBecameActiveSinceLastSync=");
        sb.append(this.p);
        sb.append(", cellsBecameInactiveSinceLastSync=");
        vq.d(sb, this.q, ", allCellInfo=", this.r, ", capabilitiesHasTransportCellular=");
        tq.i(sb, this.s, ", capabilitiesHasTransportWifi=", this.t, ", networkBandwidth=");
        sq.b(sb, this.u, ", signalStrength=", this.v, ", operatorName=");
        com.vk.movika.sdk.base.model.history.b.c(this.w, ", tmSignalStrength=", ", isVpn=", sb, this.x);
        return n23.b(sb, this.y, ")");
    }
}
