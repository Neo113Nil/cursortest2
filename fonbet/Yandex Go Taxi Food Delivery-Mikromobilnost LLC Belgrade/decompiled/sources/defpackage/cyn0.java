package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes6.dex */
public final class cyn0 {
    public static final byn0 Companion = new byn0();
    public final String a;
    public final String b;
    public final zzs c;
    public final int d;
    public final String e;

    public /* synthetic */ cyn0(int i, int i2, zzs zzsVar, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qje.Z(i, 7, ayn0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = zzsVar;
        this.d = (i & 8) == 0 ? 0 : i2;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str3;
        }
    }

    public static cyn0 a(cyn0 cyn0Var, String str) {
        String str2 = cyn0Var.a;
        String str3 = cyn0Var.b;
        return new cyn0(cyn0Var.d, cyn0Var.c, str2, str3, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cyn0)) {
            return false;
        }
        cyn0 cyn0Var = (cyn0) obj;
        return jl40.l(this.a, cyn0Var.a) && jl40.l(this.b, cyn0Var.b) && jl40.l(this.c, cyn0Var.c) && this.d == cyn0Var.d && jl40.l(this.e, cyn0Var.e);
    }

    public final int hashCode() {
        int b = oyr.b(this.d, nnm.b(this.c, unr0.b(this.a.hashCode() * 31, 31, this.b), 31), 31);
        String str = this.e;
        return b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("ScootersMobilityHubContext(source=", this.a, ", mmOfferId=", this.b, ", nextStepTargetPoint=");
        v.append(this.c);
        v.append(", allowedCompletionDistanceFromTargetM=");
        v.append(this.d);
        v.append(", sessionId=");
        return oyr.t(v, this.e, Extension.C_BRAKE);
    }

    public cyn0(int i, zzs zzsVar, String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = zzsVar;
        this.d = i;
        this.e = str3;
    }
}
