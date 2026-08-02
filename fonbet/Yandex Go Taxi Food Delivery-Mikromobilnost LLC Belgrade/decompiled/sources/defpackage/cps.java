package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cps {
    public final Throwable a;
    public final zos b;
    public final bps c;
    public final aps d;
    public final String e;
    public final String f;

    public cps(Throwable th, zos zosVar, bps bpsVar, aps apsVar, String str, String str2) {
        this.a = th;
        this.b = zosVar;
        this.c = bpsVar;
        this.d = apsVar;
        this.e = str;
        this.f = str2;
    }

    public static cps a(cps cpsVar, Throwable th, zos zosVar, bps bpsVar, String str, String str2, int i) {
        if ((i & 1) != 0) {
            th = cpsVar.a;
        }
        Throwable th2 = th;
        if ((i & 2) != 0) {
            zosVar = cpsVar.b;
        }
        zos zosVar2 = zosVar;
        if ((i & 4) != 0) {
            bpsVar = cpsVar.c;
        }
        bps bpsVar2 = bpsVar;
        aps apsVar = (i & 8) != 0 ? cpsVar.d : null;
        if ((i & 16) != 0) {
            str = cpsVar.e;
        }
        String str3 = str;
        if ((i & 32) != 0) {
            str2 = cpsVar.f;
        }
        cpsVar.getClass();
        return new cps(th2, zosVar2, bpsVar2, apsVar, str3, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cps)) {
            return false;
        }
        cps cpsVar = (cps) obj;
        return jl40.l(this.a, cpsVar.a) && jl40.l(this.b, cpsVar.b) && jl40.l(this.c, cpsVar.c) && jl40.l(this.d, cpsVar.d) && jl40.l(this.e, cpsVar.e) && jl40.l(this.f, cpsVar.f);
    }

    public final int hashCode() {
        Throwable th = this.a;
        int hashCode = (th == null ? 0 : th.hashCode()) * 31;
        zos zosVar = this.b;
        int hashCode2 = (hashCode + (zosVar == null ? 0 : zosVar.hashCode())) * 31;
        bps bpsVar = this.c;
        int hashCode3 = (hashCode2 + (bpsVar == null ? 0 : bpsVar.hashCode())) * 31;
        aps apsVar = this.d;
        int hashCode4 = (hashCode3 + (apsVar == null ? 0 : apsVar.hashCode())) * 31;
        String str = this.e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FundOperationState(throwable=");
        sb.append(this.a);
        sb.append(", loading=");
        sb.append(this.b);
        sb.append(", statusScreen=");
        sb.append(this.c);
        sb.append(", operationConfirmScreen=");
        sb.append(this.d);
        sb.append(", requestId=");
        return g8e.r(sb, this.e, ", operationId=", this.f, Extension.C_BRAKE);
    }
}
