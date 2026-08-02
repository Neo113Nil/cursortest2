package defpackage;

import com.yandex.go.scooters.api.domain.model.ScootersInsuranceType;
import com.yandex.go.scooters.api.domain.model.ScootersSessionType;
import com.yandex.go.scooters.api.domain.model.ScootersVehicleType;
import com.yandex.go.scooters.api.domain.model.b;
import java.util.ArrayList;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class lrj0 implements zuo0 {
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
    public final int w;
    public final int x;

    public lrj0(long j, String str, String str2, r7p0 r7p0Var, String str3, String str4, ScootersVehicleType scootersVehicleType, String str5, String str6, int i, int i2, long j2, zzs zzsVar, List list, zzs zzsVar2, ArrayList arrayList, boolean z, int i3, ScootersSessionType scootersSessionType, ScootersInsuranceType scootersInsuranceType, List list2, fef fefVar, int i4, int i5) {
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
        this.w = i4;
        this.x = i5;
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
        if (!(obj instanceof lrj0)) {
            return false;
        }
        lrj0 lrj0Var = (lrj0) obj;
        return this.a == lrj0Var.a && this.b.equals(lrj0Var.b) && this.c.equals(lrj0Var.c) && this.d.equals(lrj0Var.d) && this.e.equals(lrj0Var.e) && this.f.equals(lrj0Var.f) && this.g == lrj0Var.g && this.h.equals(lrj0Var.h) && this.i.equals(lrj0Var.i) && this.j == lrj0Var.j && this.k == lrj0Var.k && this.l == lrj0Var.l && jl40.l(this.m, lrj0Var.m) && this.n.equals(lrj0Var.n) && jl40.l(this.o, lrj0Var.o) && this.p.equals(lrj0Var.p) && this.q == lrj0Var.q && this.r == lrj0Var.r && this.s == lrj0Var.s && this.t == lrj0Var.t && this.u.equals(lrj0Var.u) && this.v.equals(lrj0Var.v) && this.w == lrj0Var.w && this.x == lrj0Var.x;
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
        return Integer.hashCode(this.x) + oyr.b(this.w, (this.v.hashCode() + unr0.c((this.t.hashCode() + ((this.s.hashCode() + oyr.b(this.r, unr0.e(ly3.b((c2 + (zzsVar2 != null ? zzsVar2.hashCode() : 0)) * 31, 31, this.p), 31, this.q), 31)) * 31)) * 31, 31, this.u)) * 31, 31);
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

    public final int t() {
        return this.w;
    }

    public final String toString() {
        String b = b.b(this.u);
        StringBuilder k = x4e.k("ReservationSessionState(startTime=", this.a, ", sessionId=", this.b);
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
        k.append(", freeTime=");
        k.append(this.w);
        return b64.q(k, ", freeReservationUntilSec=", this.x, Extension.C_BRAKE);
    }
}
