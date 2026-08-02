package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class mjq0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ThemedImageUrlEntity f;
    public final String g;

    public mjq0(String str, String str2, String str3, String str4, String str5, String str6, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = themedImageUrlEntity;
        this.g = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mjq0)) {
            return false;
        }
        mjq0 mjq0Var = (mjq0) obj;
        return jl40.l(this.a, mjq0Var.a) && jl40.l(this.b, mjq0Var.b) && jl40.l(this.c, mjq0Var.c) && jl40.l(this.d, mjq0Var.d) && jl40.l(this.e, mjq0Var.e) && jl40.l(this.f, mjq0Var.f) && jl40.l(this.g, mjq0Var.g);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.f;
        int hashCode3 = (hashCode2 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
        String str3 = this.g;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("TransferTarget(targetId=", this.a, ", receiverPhone=", this.b, ", title=");
        g8e.D(v, this.c, ", description=", this.d, ", requestId=");
        v.append(this.e);
        v.append(", image=");
        v.append(this.f);
        v.append(", pam=");
        return oyr.t(v, this.g, Extension.C_BRAKE);
    }
}
