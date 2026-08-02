package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hz3 {
    public final s24 a;
    public final r24 b;

    public hz3(s24 s24Var, r24 r24Var) {
        this.a = s24Var;
        this.b = r24Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hz3)) {
            return false;
        }
        hz3 hz3Var = (hz3) obj;
        return jl40.l(this.a, hz3Var.a) && jl40.l(this.b, hz3Var.b);
    }

    public final int hashCode() {
        s24 s24Var = this.a;
        int hashCode = (s24Var == null ? 0 : s24Var.hashCode()) * 31;
        r24 r24Var = this.b;
        return hashCode + (r24Var != null ? r24Var.hashCode() : 0);
    }

    public final String toString() {
        return "AutoTopupSaveV2Settings(autoTopupSetting=" + this.a + ", autoFundSetting=" + this.b + Extension.C_BRAKE;
    }
}
