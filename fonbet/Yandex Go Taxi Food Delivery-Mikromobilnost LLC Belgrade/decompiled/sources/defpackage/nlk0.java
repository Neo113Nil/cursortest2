package defpackage;

import com.yandex.go.taxi.order.details.v2.state.RideCardPresentationType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nlk0 {
    public final String a;
    public final RideCardPresentationType b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final h0n g;
    public final h0n h;
    public final h0n i;
    public final h0n j;
    public final h0n k;
    public final h0n l;
    public final boolean m;
    public final boolean n;

    public nlk0(String str, RideCardPresentationType rideCardPresentationType, long j, long j2, long j3, long j4, h0n h0nVar, h0n h0nVar2, h0n h0nVar3, h0n h0nVar4, h0n h0nVar5, h0n h0nVar6, boolean z, boolean z2) {
        this.a = str;
        this.b = rideCardPresentationType;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = h0nVar;
        this.h = h0nVar2;
        this.i = h0nVar3;
        this.j = h0nVar4;
        this.k = h0nVar5;
        this.l = h0nVar6;
        this.m = z;
        this.n = z2;
    }

    public static nlk0 a(nlk0 nlk0Var, String str, RideCardPresentationType rideCardPresentationType, long j, long j2, long j3, long j4, h0n h0nVar, h0n h0nVar2, h0n h0nVar3, h0n h0nVar4, h0n h0nVar5, h0n h0nVar6, int i) {
        String str2 = (i & 1) != 0 ? nlk0Var.a : str;
        RideCardPresentationType rideCardPresentationType2 = (i & 2) != 0 ? nlk0Var.b : rideCardPresentationType;
        long j5 = (i & 4) != 0 ? nlk0Var.c : j;
        long j6 = (i & 8) != 0 ? nlk0Var.d : j2;
        long j7 = (i & 16) != 0 ? nlk0Var.e : j3;
        long j8 = (i & 32) != 0 ? nlk0Var.f : j4;
        h0n h0nVar7 = (i & 64) != 0 ? nlk0Var.g : h0nVar;
        h0n h0nVar8 = (i & 128) != 0 ? nlk0Var.h : h0nVar2;
        h0n h0nVar9 = (i & 256) != 0 ? nlk0Var.i : h0nVar3;
        h0n h0nVar10 = (i & 512) != 0 ? nlk0Var.j : h0nVar4;
        h0n h0nVar11 = (i & 1024) != 0 ? nlk0Var.k : h0nVar5;
        h0n h0nVar12 = (i & 2048) != 0 ? nlk0Var.l : h0nVar6;
        boolean z = (i & 4096) != 0 ? nlk0Var.m : true;
        boolean z2 = (i & 8192) != 0 ? nlk0Var.n : true;
        nlk0Var.getClass();
        return new nlk0(str2, rideCardPresentationType2, j5, j6, j7, j8, h0nVar7, h0nVar8, h0nVar9, h0nVar10, h0nVar11, h0nVar12, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlk0)) {
            return false;
        }
        nlk0 nlk0Var = (nlk0) obj;
        return jl40.l(this.a, nlk0Var.a) && this.b == nlk0Var.b && this.c == nlk0Var.c && this.d == nlk0Var.d && this.e == nlk0Var.e && this.f == nlk0Var.f && jl40.l(this.g, nlk0Var.g) && jl40.l(this.h, nlk0Var.h) && jl40.l(this.i, nlk0Var.i) && jl40.l(this.j, nlk0Var.j) && jl40.l(this.k, nlk0Var.k) && jl40.l(this.l, nlk0Var.l) && this.m == nlk0Var.m && this.n == nlk0Var.n;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        RideCardPresentationType rideCardPresentationType = this.b;
        int c = qv10.c(qv10.c(qv10.c(qv10.c((hashCode + (rideCardPresentationType == null ? 0 : rideCardPresentationType.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f);
        h0n h0nVar = this.g;
        int hashCode2 = (c + (h0nVar == null ? 0 : h0nVar.hashCode())) * 31;
        h0n h0nVar2 = this.h;
        int hashCode3 = (hashCode2 + (h0nVar2 == null ? 0 : h0nVar2.hashCode())) * 31;
        h0n h0nVar3 = this.i;
        int hashCode4 = (hashCode3 + (h0nVar3 == null ? 0 : h0nVar3.hashCode())) * 31;
        h0n h0nVar4 = this.j;
        int hashCode5 = (hashCode4 + (h0nVar4 == null ? 0 : h0nVar4.hashCode())) * 31;
        h0n h0nVar5 = this.k;
        int hashCode6 = (hashCode5 + (h0nVar5 == null ? 0 : h0nVar5.hashCode())) * 31;
        h0n h0nVar6 = this.l;
        return Boolean.hashCode(this.n) + unr0.e((hashCode6 + (h0nVar6 != null ? h0nVar6.hashCode() : 0)) * 31, 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnalyticsState(orderId=");
        sb.append(this.a);
        sb.append(", presentationType=");
        sb.append(this.b);
        sb.append(", componentCreationTimestamp=");
        sb.append(this.c);
        x4e.A(this.d, ", componentCreationTimeTaken=", ", attachTimestamp=", sb);
        sb.append(this.e);
        x4e.A(this.f, ", startStateProcessingTimestamp=", ", stateEmissionProcessingRecord=", sb);
        sb.append(this.g);
        sb.append(", submitStartProcessingRecord=");
        sb.append(this.h);
        sb.append(", submitEndProcessingRecord=");
        sb.append(this.i);
        sb.append(", stateEmissionReadyRecord=");
        sb.append(this.j);
        sb.append(", submitStartReadyRecord=");
        sb.append(this.k);
        sb.append(", submitEndReadyRecord=");
        sb.append(this.l);
        sb.append(", isBroken=");
        return smw0.k(", isReported=", Extension.C_BRAKE, sb, this.m, this.n);
    }
}
