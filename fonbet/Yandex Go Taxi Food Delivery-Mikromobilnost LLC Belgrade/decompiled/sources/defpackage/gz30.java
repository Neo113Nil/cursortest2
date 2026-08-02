package defpackage;

import com.yandex.mapkit.geometry.Subpolyline;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gz30 implements hz30 {
    public final kdc a;
    public final String b;
    public final Integer c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final List k;
    public final Integer l;
    public final String m;
    public final Subpolyline n;
    public final double o;
    public final int p;

    public gz30(kdc kdcVar, String str, Integer num, String str2, String str3, String str4, String str5, String str6, String str7, String str8, List list, Integer num2, String str9, Subpolyline subpolyline, double d, int i) {
        this.a = kdcVar;
        this.b = str;
        this.c = num;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = list;
        this.l = num2;
        this.m = str9;
        this.n = subpolyline;
        this.o = d;
        this.p = i;
    }

    @Override // defpackage.hz30
    public final int b() {
        return this.p;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gz30)) {
            return false;
        }
        gz30 gz30Var = (gz30) obj;
        return jl40.l(this.a, gz30Var.a) && jl40.l(this.b, gz30Var.b) && jl40.l(this.c, gz30Var.c) && jl40.l(this.d, gz30Var.d) && jl40.l(this.e, gz30Var.e) && jl40.l(this.f, gz30Var.f) && jl40.l(this.g, gz30Var.g) && jl40.l(this.h, gz30Var.h) && jl40.l(this.i, gz30Var.i) && jl40.l(this.j, gz30Var.j) && jl40.l(this.k, gz30Var.k) && jl40.l(this.l, gz30Var.l) && jl40.l(this.m, gz30Var.m) && jl40.l(this.n, gz30Var.n) && Double.compare(this.o, gz30Var.o) == 0 && this.p == gz30Var.p;
    }

    @Override // defpackage.hz30
    public final double getDuration() {
        return this.o;
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (b + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int c = unr0.c(unr0.b(unr0.b((hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31, 31, this.i), 31, this.j), 31, this.k);
        Integer num2 = this.l;
        int hashCode6 = (c + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str6 = this.m;
        return Integer.hashCode(this.p) + unr0.a((this.n.hashCode() + ((hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31)) * 31, 31, this.o);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MtScooterSection(color=");
        sb.append(this.a);
        sb.append(", travelTime=");
        sb.append(this.b);
        sb.append(", freeReservationMinutes=");
        tse0.w(this.c, ", price=", this.d, ", reservationIconTag=", sb);
        g8e.D(sb, this.e, ", parkingIconTag=", this.f, ", startingAddress=");
        g8e.D(sb, this.g, ", destinationAddress=", this.h, ", departureTime=");
        g8e.D(sb, this.i, ", arrivalTime=", this.j, ", stops=");
        sb.append(this.k);
        sb.append(", scootersAmount=");
        sb.append(this.l);
        sb.append(", vehicleLabel=");
        sb.append(this.m);
        sb.append(", subpolyline=");
        sb.append(this.n);
        sb.append(", duration=");
        sb.append(this.o);
        sb.append(", sectionId=");
        sb.append(this.p);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
