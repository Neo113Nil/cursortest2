package defpackage;

import android.net.Uri;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes11.dex */
public final class gfj0 {
    public final Uri a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public gfj0(Uri uri, String str, String str2, String str3, String str4, String str5) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gfj0)) {
            return false;
        }
        gfj0 gfj0Var = (gfj0) obj;
        return jl40.l(this.a, gfj0Var.a) && jl40.l(this.b, gfj0Var.b) && jl40.l(this.c, gfj0Var.c) && jl40.l(this.d, gfj0Var.d) && jl40.l(this.e, gfj0Var.e) && jl40.l(this.f, gfj0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RequirementDeeplink(deeplinkUri=");
        sb.append(this.a);
        sb.append(", requirementId=");
        sb.append(this.b);
        sb.append(", groupId=");
        g8e.D(sb, this.c, ", fallbackTariffClass=", this.d, ", fallbackVerticalId=");
        return g8e.r(sb, this.e, ", action=", this.f, Extension.C_BRAKE);
    }
}
