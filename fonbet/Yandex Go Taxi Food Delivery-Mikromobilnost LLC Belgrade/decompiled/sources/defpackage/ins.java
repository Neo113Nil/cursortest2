package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ins {
    public final Throwable a;
    public final fns b;
    public final hns c;
    public final gns d;
    public final String e;
    public final String f;

    public ins(Throwable th, fns fnsVar, hns hnsVar, gns gnsVar, String str, String str2) {
        this.a = th;
        this.b = fnsVar;
        this.c = hnsVar;
        this.d = gnsVar;
        this.e = str;
        this.f = str2;
    }

    public static ins a(ins insVar, Throwable th, fns fnsVar, hns hnsVar, String str, String str2, int i) {
        if ((i & 1) != 0) {
            th = insVar.a;
        }
        Throwable th2 = th;
        if ((i & 2) != 0) {
            fnsVar = insVar.b;
        }
        fns fnsVar2 = fnsVar;
        if ((i & 4) != 0) {
            hnsVar = insVar.c;
        }
        hns hnsVar2 = hnsVar;
        gns gnsVar = (i & 8) != 0 ? insVar.d : null;
        if ((i & 16) != 0) {
            str = insVar.e;
        }
        String str3 = str;
        if ((i & 32) != 0) {
            str2 = insVar.f;
        }
        insVar.getClass();
        return new ins(th2, fnsVar2, hnsVar2, gnsVar, str3, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ins)) {
            return false;
        }
        ins insVar = (ins) obj;
        return jl40.l(this.a, insVar.a) && jl40.l(this.b, insVar.b) && jl40.l(this.c, insVar.c) && jl40.l(this.d, insVar.d) && jl40.l(this.e, insVar.e) && jl40.l(this.f, insVar.f);
    }

    public final int hashCode() {
        Throwable th = this.a;
        int hashCode = (th == null ? 0 : th.hashCode()) * 31;
        fns fnsVar = this.b;
        int hashCode2 = (hashCode + (fnsVar == null ? 0 : fnsVar.hashCode())) * 31;
        hns hnsVar = this.c;
        int hashCode3 = (hashCode2 + (hnsVar == null ? 0 : hnsVar.hashCode())) * 31;
        gns gnsVar = this.d;
        int hashCode4 = (hashCode3 + (gnsVar == null ? 0 : gnsVar.hashCode())) * 31;
        String str = this.e;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return hashCode5 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FundCreationState(throwable=");
        sb.append(this.a);
        sb.append(", loading=");
        sb.append(this.b);
        sb.append(", statusScreen=");
        sb.append(this.c);
        sb.append(", openAndBuyScreen=");
        sb.append(this.d);
        sb.append(", requestId=");
        return g8e.r(sb, this.e, ", operationId=", this.f, Extension.C_BRAKE);
    }
}
