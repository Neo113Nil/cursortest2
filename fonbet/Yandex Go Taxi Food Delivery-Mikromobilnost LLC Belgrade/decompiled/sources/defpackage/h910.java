package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultEntity$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class h910 {
    public final Me2MeDebitResultEntity$Status a;
    public final String b;
    public final String c;
    public final g910 d;

    public h910(Me2MeDebitResultEntity$Status me2MeDebitResultEntity$Status, String str, String str2, g910 g910Var) {
        this.a = me2MeDebitResultEntity$Status;
        this.b = str;
        this.c = str2;
        this.d = g910Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h910)) {
            return false;
        }
        h910 h910Var = (h910) obj;
        return this.a == h910Var.a && jl40.l(this.b, h910Var.b) && jl40.l(this.c, h910Var.c) && jl40.l(this.d, h910Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        g910 g910Var = this.d;
        return hashCode3 + (g910Var != null ? g910Var.hashCode() : 0);
    }

    public final String toString() {
        return "Me2MeDebitResultEntity(status=" + this.a + ", title=" + this.b + ", description=" + this.c + ", widget=" + this.d + Extension.C_BRAKE;
    }
}
