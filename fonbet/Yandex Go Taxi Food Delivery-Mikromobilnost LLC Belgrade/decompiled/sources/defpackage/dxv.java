package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dxv {
    public final ThemedImageUrlEntity a;
    public final String b;
    public final String c;
    public final String d;
    public final nhy0 e;

    public dxv(ThemedImageUrlEntity themedImageUrlEntity, String str, String str2, String str3, nhy0 nhy0Var) {
        this.a = themedImageUrlEntity;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = nhy0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxv)) {
            return false;
        }
        dxv dxvVar = (dxv) obj;
        return this.a.equals(dxvVar.a) && jl40.l(this.b, dxvVar.b) && jl40.l(this.c, dxvVar.c) && jl40.l(this.d, dxvVar.d) && this.e.equals(dxvVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InitiateTestPaymentEntity(memberImage=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        g8e.D(sb, this.c, ", requestId=", this.d, ", timeoutData=");
        sb.append(this.e);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
