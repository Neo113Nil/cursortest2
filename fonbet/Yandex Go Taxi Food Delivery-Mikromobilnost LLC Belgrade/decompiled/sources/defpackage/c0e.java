package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes6.dex */
public final class c0e {
    public static final b0e Companion = new b0e();
    public final String a;
    public final zzs b;
    public final kd7 c;

    public /* synthetic */ c0e(int i, String str, zzs zzsVar, kd7 kd7Var) {
        if (3 != (i & 3)) {
            qje.Z(i, 3, a0e.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = zzsVar;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = kd7Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0e)) {
            return false;
        }
        c0e c0eVar = (c0e) obj;
        return jl40.l(this.a, c0eVar.a) && jl40.l(this.b, c0eVar.b) && jl40.l(this.c, c0eVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int b = nnm.b(this.b, (str == null ? 0 : str.hashCode()) * 31, 31);
        kd7 kd7Var = this.c;
        return b + (kd7Var != null ? kd7Var.a.hashCode() : 0);
    }

    public final String toString() {
        return "ConfigParams(onboardingType=" + this.a + ", geoPoint=" + this.b + ", typedExperiments=" + this.c + Extension.C_BRAKE;
    }

    public c0e(String str, zzs zzsVar, kd7 kd7Var) {
        this.a = str;
        this.b = zzsVar;
        this.c = kd7Var;
    }
}
