package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes15.dex */
public final class dq20 {
    public static final cq20 Companion = new cq20();
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public /* synthetic */ dq20(int i, String str, String str2, String str3, String str4) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, bq20.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public static final /* synthetic */ void a(dq20 dq20Var, yjd yjdVar, SerialDescriptor serialDescriptor) {
        String str = dq20Var.a;
        String str2 = dq20Var.d;
        String str3 = dq20Var.c;
        yjdVar.o(serialDescriptor, 0, str);
        yjdVar.o(serialDescriptor, 1, dq20Var.b);
        if (yjdVar.F() || str3 != null) {
            yjdVar.g(serialDescriptor, 2, auu0.a, str3);
        }
        if (!yjdVar.F() && str2 == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 3, auu0.a, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dq20)) {
            return false;
        }
        dq20 dq20Var = (dq20) obj;
        return jl40.l(this.a, dq20Var.a) && jl40.l(this.b, dq20Var.b) && jl40.l(this.c, dq20Var.c) && jl40.l(this.d, dq20Var.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("MobPendingDetailReportEntry(proxyId=", this.a, ", host=", this.b, ", apiName="), this.c, ", contour=", this.d, Extension.C_BRAKE);
    }

    public /* synthetic */ dq20(String str) {
        this("external_reference", str, null, null);
    }

    public dq20(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }
}
