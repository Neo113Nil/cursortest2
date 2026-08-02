package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class bjq0 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final ThemedImageUrlEntity f;

    public bjq0(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bjq0)) {
            return false;
        }
        bjq0 bjq0Var = (bjq0) obj;
        return jl40.l(this.a, bjq0Var.a) && jl40.l(this.b, bjq0Var.b) && jl40.l(this.c, bjq0Var.c) && jl40.l(this.d, bjq0Var.d) && jl40.l(this.e, bjq0Var.e) && jl40.l(this.f, bjq0Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.f;
        return hashCode2 + (themedImageUrlEntity != null ? themedImageUrlEntity.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("TransferTarget(targetId=", this.a, ", receiverPhone=", this.b, ", title=");
        g8e.D(v, this.c, ", description=", this.d, ", requestId=");
        v.append(this.e);
        v.append(", image=");
        v.append(this.f);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
