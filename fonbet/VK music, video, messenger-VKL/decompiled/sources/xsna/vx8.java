package xsna;

/* compiled from: TextMeasurer.kt */
/* loaded from: classes11.dex */
public final class vx8 {
    public final kjo0 a;

    public vx8(kjo0 kjo0Var) {
        this.a = kjo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vx8)) {
            return false;
        }
        kjo0 kjo0Var = this.a;
        us2 us2Var = kjo0Var.a;
        vx8 vx8Var = (vx8) obj;
        kjo0 kjo0Var2 = vx8Var.a;
        kjo0 kjo0Var3 = vx8Var.a;
        return epx.f(us2Var, kjo0Var2.a) && kjo0Var.b.c(kjo0Var3.b) && epx.f(kjo0Var.c, kjo0Var3.c) && kjo0Var.d == kjo0Var3.d && kjo0Var.e == kjo0Var3.e && kjo0Var.f == kjo0Var3.f && epx.f(kjo0Var.g, kjo0Var3.g) && kjo0Var.h == kjo0Var3.h && kjo0Var.i == kjo0Var3.i && o6j.c(kjo0Var.j, kjo0Var3.j);
    }

    public final int hashCode() {
        kjo0 kjo0Var = this.a;
        int hashCode = kjo0Var.a.hashCode() * 31;
        nmo0 nmo0Var = kjo0Var.b;
        hik0 hik0Var = nmo0Var.a;
        long j = hik0Var.b;
        gno0[] gno0VarArr = fno0.b;
        int hashCode2 = Long.hashCode(j) * 31;
        b6s b6sVar = hik0Var.c;
        int i = (hashCode2 + (b6sVar != null ? b6sVar.b : 0)) * 31;
        u5s u5sVar = hik0Var.d;
        int hashCode3 = (i + (u5sVar != null ? Integer.hashCode(u5sVar.a) : 0)) * 31;
        v5s v5sVar = hik0Var.e;
        int hashCode4 = (hashCode3 + (v5sVar != null ? Integer.hashCode(v5sVar.a) : 0)) * 31;
        v4s v4sVar = hik0Var.f;
        int hashCode5 = (hashCode4 + (v4sVar != null ? v4sVar.hashCode() : 0)) * 31;
        String str = hik0Var.g;
        int a = bh10.a((hashCode5 + (str != null ? str.hashCode() : 0)) * 31, 31, hik0Var.h);
        et6 et6Var = hik0Var.i;
        int hashCode6 = (a + (et6Var != null ? Float.hashCode(et6Var.a) : 0)) * 31;
        zho0 zho0Var = hik0Var.j;
        int hashCode7 = (hashCode6 + (zho0Var != null ? zho0Var.hashCode() : 0)) * 31;
        lwz lwzVar = hik0Var.k;
        int hashCode8 = (hashCode7 + (lwzVar != null ? lwzVar.b.hashCode() : 0)) * 31;
        long j2 = hik0Var.l;
        int i2 = l5g.l;
        int a2 = bh10.a(hashCode8, 31, j2);
        hua0 hua0Var = hik0Var.o;
        int hashCode9 = (nmo0Var.b.hashCode() + ((a2 + (hua0Var != null ? hua0Var.hashCode() : 0)) * 31)) * 31;
        rua0 rua0Var = nmo0Var.c;
        return Long.hashCode(kjo0Var.j) + ((kjo0Var.i.hashCode() + ((kjo0Var.h.hashCode() + ((kjo0Var.g.hashCode() + shy.a(kjo0Var.f, qoy.b((fw3.a((hashCode9 + (rua0Var != null ? rua0Var.hashCode() : 0) + hashCode) * 31, 31, kjo0Var.c) + kjo0Var.d) * 31, 31, kjo0Var.e), 31)) * 31)) * 31)) * 31);
    }
}
