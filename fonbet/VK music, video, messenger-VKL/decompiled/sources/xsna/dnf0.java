package xsna;

import com.vk.reefton.dto.network.ReefNetworkType;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: ReefCellInfo.kt */
/* loaded from: classes5.dex */
public final class dnf0 {
    public final ReefNetworkType a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Long e;
    public final Integer f;
    public final Integer g;
    public final Integer h;
    public final boolean i;
    public final boolean j;
    public final long k;
    public final int l;
    public final List<sof0> m;

    public dnf0(ReefNetworkType reefNetworkType, Integer num, Integer num2, Integer num3, Long l, Integer num4, Integer num5, Integer num6, boolean z, boolean z2, long j, int i, List<sof0> list) {
        this.a = reefNetworkType;
        this.b = num;
        this.c = num2;
        this.d = num3;
        this.e = l;
        this.f = num4;
        this.g = num5;
        this.h = num6;
        this.i = z;
        this.j = z2;
        this.k = j;
        this.l = i;
        this.m = list;
    }

    public static dnf0 d(dnf0 dnf0Var, boolean z, List list, int i) {
        ReefNetworkType reefNetworkType = dnf0Var.a;
        Integer num = dnf0Var.b;
        Integer num2 = dnf0Var.c;
        Integer num3 = dnf0Var.d;
        Long l = dnf0Var.e;
        Integer num4 = dnf0Var.f;
        Integer num5 = dnf0Var.g;
        Integer num6 = dnf0Var.h;
        boolean z2 = (i & 256) != 0 ? dnf0Var.i : z;
        boolean z3 = dnf0Var.j;
        boolean z4 = z2;
        long j = dnf0Var.k;
        int i2 = dnf0Var.l;
        List list2 = (i & 4096) != 0 ? dnf0Var.m : list;
        dnf0Var.getClass();
        return new dnf0(reefNetworkType, num, num2, num3, l, num4, num5, num6, z4, z3, j, i2, (List<sof0>) list2);
    }

    public final dnf0 a() {
        return d(this, true, null, 7935);
    }

    public final dnf0 b() {
        return d(this, false, null, 7935);
    }

    public final dnf0 c(sof0 sof0Var) {
        ArrayList arrayList = new ArrayList(this.m);
        arrayList.add(sof0Var);
        return d(this, false, j5g.O0(arrayList), 4095);
    }

    public final boolean e(dnf0 dnf0Var) {
        return (epx.f(this.b, dnf0Var.b) && epx.f(this.c, dnf0Var.c) && epx.f(this.e, dnf0Var.e) && this.a == dnf0Var.a && epx.f(this.d, dnf0Var.d) && this.j == dnf0Var.j && this.k == dnf0Var.k && this.l == dnf0Var.l) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dnf0)) {
            return false;
        }
        dnf0 dnf0Var = (dnf0) obj;
        return this.a == dnf0Var.a && epx.f(this.b, dnf0Var.b) && epx.f(this.c, dnf0Var.c) && epx.f(this.d, dnf0Var.d) && epx.f(this.e, dnf0Var.e) && epx.f(this.f, dnf0Var.f) && epx.f(this.g, dnf0Var.g) && epx.f(this.h, dnf0Var.h) && this.i == dnf0Var.i && this.j == dnf0Var.j && this.k == dnf0Var.k && this.l == dnf0Var.l && epx.f(this.m, dnf0Var.m);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.c;
        int hashCode3 = (hashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.d;
        int hashCode4 = (hashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Long l = this.e;
        int hashCode5 = (hashCode4 + (l == null ? 0 : l.hashCode())) * 31;
        Integer num4 = this.f;
        int hashCode6 = (hashCode5 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.g;
        int hashCode7 = (hashCode6 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.h;
        return this.m.hashCode() + shy.a(this.l, bh10.a(qoy.b(qoy.b((hashCode7 + (num6 != null ? num6.hashCode() : 0)) * 31, 31, this.i), 31, this.j), 31, this.k), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ReefCellInfo(type=");
        sb.append(this.a);
        sb.append(", mcc=");
        sb.append(this.b);
        sb.append(", mnc=");
        sq.b(sb, this.c, ", area=", this.d, ", cellId=");
        sb.append(this.e);
        sb.append(", rfcn=");
        sb.append(this.f);
        sb.append(", pscPci=");
        sq.b(sb, this.g, ", bandwidth=", this.h, ", isActive=");
        gsi0.c(sb, this.i, ", isRegistered=", this.j, ", timeStamp=");
        sb.append(this.k);
        sb.append(", connectionStatus=");
        sb.append(this.l);
        sb.append(", signalList=");
        sb.append(this.m);
        sb.append(")");
        return sb.toString();
    }

    public dnf0(ReefNetworkType reefNetworkType, Integer num, Integer num2, Integer num3, Long l, Integer num4, Integer num5, Integer num6, boolean z, long j, int i, List list, int i2) {
        this((i2 & 1) != 0 ? ReefNetworkType.UNKNOWN : reefNetworkType, (i2 & 2) != 0 ? null : num, (i2 & 4) != 0 ? null : num2, (i2 & 8) != 0 ? null : num3, (i2 & 16) != 0 ? null : l, (i2 & 32) != 0 ? null : num4, (i2 & 64) != 0 ? null : num5, (i2 & 128) != 0 ? null : num6, true, z, j, i, (List<sof0>) ((i2 & 4096) != 0 ? EmptyList.b : list));
    }
}
