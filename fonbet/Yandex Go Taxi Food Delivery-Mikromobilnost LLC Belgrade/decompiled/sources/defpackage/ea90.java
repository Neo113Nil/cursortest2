package defpackage;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.api.domain.model.ScootersSessionType;
import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import com.yandex.go.scooters.api.domain.model.b;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ea90 implements zuo0 {
    public final long a;
    public final String b;
    public final String c;
    public final r7p0 d;
    public final String e;
    public final String f;
    public final ScootersVehicleType g;
    public final String h;
    public final String i;
    public final int j;
    public final int k;
    public final long l;
    public final zzs m;
    public final List n;
    public final zzs o;
    public final ArrayList p;
    public final boolean q;
    public final int r;
    public final ScootersSessionType s;
    public final ScootersInsuranceType t;
    public final List u;
    public final fef v;
    public final String w;
    public final int x;
    public final long y;

    public ea90(long j, String str, String str2, r7p0 r7p0Var, String str3, String str4, ScootersVehicleType scootersVehicleType, String str5, String str6, int i, int i2, long j2, zzs zzsVar, List list, zzs zzsVar2, ArrayList arrayList, boolean z, int i3, ScootersSessionType scootersSessionType, ScootersInsuranceType scootersInsuranceType, List list2, fef fefVar, String str7, int i4, long j3) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = r7p0Var;
        this.e = str3;
        this.f = str4;
        this.g = scootersVehicleType;
        this.h = str5;
        this.i = str6;
        this.j = i;
        this.k = i2;
        this.l = j2;
        this.m = zzsVar;
        this.n = list;
        this.o = zzsVar2;
        this.p = arrayList;
        this.q = z;
        this.r = i3;
        this.s = scootersSessionType;
        this.t = scootersInsuranceType;
        this.u = list2;
        this.v = fefVar;
        this.w = str7;
        this.x = i4;
        this.y = j3;
    }

    @Override // defpackage.zuo0
    public final String a() {
        return this.h;
    }

    @Override // defpackage.zuo0
    public final boolean b() {
        return this.q;
    }

    @Override // defpackage.zuo0
    public final ScootersInsuranceType c() {
        return this.t;
    }

    @Override // defpackage.zuo0
    public final int d() {
        return this.j;
    }

    @Override // defpackage.zuo0
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ea90)) {
            return false;
        }
        ea90 ea90Var = (ea90) obj;
        return this.a == ea90Var.a && this.b.equals(ea90Var.b) && this.c.equals(ea90Var.c) && this.d.equals(ea90Var.d) && this.e.equals(ea90Var.e) && this.f.equals(ea90Var.f) && this.g == ea90Var.g && this.h.equals(ea90Var.h) && this.i.equals(ea90Var.i) && this.j == ea90Var.j && this.k == ea90Var.k && this.l == ea90Var.l && jl40.l(this.m, ea90Var.m) && this.n.equals(ea90Var.n) && jl40.l(this.o, ea90Var.o) && this.p.equals(ea90Var.p) && this.q == ea90Var.q && this.r == ea90Var.r && this.s == ea90Var.s && this.t == ea90Var.t && this.u.equals(ea90Var.u) && this.v.equals(ea90Var.v) && jl40.l(this.w, ea90Var.w) && this.x == ea90Var.x && this.y == ea90Var.y;
    }

    @Override // defpackage.zuo0
    public final List f() {
        return this.p;
    }

    @Override // defpackage.zuo0
    public final int g() {
        return this.r;
    }

    @Override // defpackage.zuo0
    public final r7p0 getNumber() {
        return this.d;
    }

    @Override // defpackage.zuo0
    public final String getSessionId() {
        return this.b;
    }

    @Override // defpackage.zuo0
    public final long getStartTime() {
        return this.a;
    }

    @Override // defpackage.zuo0
    public final int h() {
        return this.k;
    }

    public final int hashCode() {
        int c = qv10.c(oyr.b(this.k, oyr.b(this.j, unr0.b(unr0.b((this.g.hashCode() + unr0.b(unr0.b((this.d.hashCode() + unr0.b(unr0.b(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c)) * 31, 31, this.e), 31, this.f)) * 31, 31, this.h), 31, this.i), 31), 31), 31, this.l);
        zzs zzsVar = this.m;
        int c2 = unr0.c((c + (zzsVar == null ? 0 : zzsVar.hashCode())) * 31, 31, this.n);
        zzs zzsVar2 = this.o;
        return Long.hashCode(this.y) + oyr.b(this.x, unr0.b((this.v.hashCode() + unr0.c((this.t.hashCode() + ((this.s.hashCode() + oyr.b(this.r, unr0.e(ly3.b((c2 + (zzsVar2 != null ? zzsVar2.hashCode() : 0)) * 31, 31, this.p), 31, this.q), 31)) * 31)) * 31, 31, this.u)) * 31, 31, this.w), 31);
    }

    @Override // defpackage.zuo0
    public final ScootersSessionType i() {
        return this.s;
    }

    @Override // defpackage.zuo0
    public final String j() {
        return this.f;
    }

    @Override // defpackage.zuo0
    public final zzs k() {
        return this.o;
    }

    @Override // defpackage.zuo0
    public final long l() {
        return this.l;
    }

    @Override // defpackage.zuo0
    public final String m() {
        return this.c;
    }

    @Override // defpackage.zuo0
    public final List n() {
        return this.n;
    }

    @Override // defpackage.zuo0
    public final String o() {
        return this.i;
    }

    @Override // defpackage.zuo0
    public final List p() {
        return this.u;
    }

    @Override // defpackage.zuo0
    public final ScootersVehicleType q() {
        return this.g;
    }

    @Override // defpackage.zuo0
    public final zzs r() {
        return this.m;
    }

    @Override // defpackage.zuo0
    public final fef s() {
        return this.v;
    }

    public final long t() {
        return this.y;
    }

    public final String toString() {
        String b = b.b(this.u);
        StringBuilder k = x4e.k("PaidReservationSessionState(startTime=", this.a, ", sessionId=", this.b);
        k.append(", offerId=");
        k.append(this.c);
        k.append(", number=");
        k.append(this.d);
        g8e.D(k, ", modelId=", this.e, ", vehicleId=", this.f);
        k.append(", vehicleType=");
        k.append(this.g);
        k.append(", imageTag=");
        k.append(this.h);
        k.append(", smallImageTag=");
        k.append(this.i);
        k.append(", powerReserve=");
        k.append(this.j);
        n.A(k, ", chargeLevel=", this.k, ", remainingTimeSec=");
        k.append(this.l);
        k.append(", scooterGeo=");
        k.append(this.m);
        k.append(", finishAreaBoarder=");
        k.append(this.n);
        k.append(", destination=");
        k.append(this.o);
        k.append(", features=");
        k.append(this.p);
        k.append(", evolveToRidingOnStart=");
        k.append(this.q);
        k.append(", ridingPricePerMinute=");
        k.append(this.r);
        k.append(", scootersSessionType=");
        k.append(this.s);
        k.append(", insuranceType=");
        k.append(this.t);
        k.append(", slowdownsInfo=");
        k.append(b);
        k.append(", currencyRules=");
        k.append(this.v);
        k.append(", currentCost=");
        k.append(this.w);
        n.A(k, ", paidReservationPricePerMinute=", this.x, ", duration=");
        return oyr.n(this.y, Extension.C_BRAKE, k);
    }
}
