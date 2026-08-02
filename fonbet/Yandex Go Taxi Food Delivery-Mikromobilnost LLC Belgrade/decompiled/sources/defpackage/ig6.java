package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.TransferDeeplink;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class ig6 {
    public final String a;
    public final ymq0 b;
    public final xmq0 c;
    public final String d;
    public final String e;
    public final ThemedImageUrlEntity f;
    public final String g;
    public final String h;
    public final TransferDeeplink i;
    public final t910 j;
    public final yi1 k;

    public ig6(String str, ymq0 ymq0Var, xmq0 xmq0Var, String str2, String str3, ThemedImageUrlEntity themedImageUrlEntity, String str4, String str5, TransferDeeplink transferDeeplink, t910 t910Var, yi1 yi1Var) {
        this.a = str;
        this.b = ymq0Var;
        this.c = xmq0Var;
        this.d = str2;
        this.e = str3;
        this.f = themedImageUrlEntity;
        this.g = str4;
        this.h = str5;
        this.i = transferDeeplink;
        this.j = t910Var;
        this.k = yi1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig6)) {
            return false;
        }
        ig6 ig6Var = (ig6) obj;
        return jl40.l(this.a, ig6Var.a) && jl40.l(this.b, ig6Var.b) && jl40.l(this.c, ig6Var.c) && jl40.l(this.d, ig6Var.d) && jl40.l(this.e, ig6Var.e) && jl40.l(this.f, ig6Var.f) && jl40.l(this.g, ig6Var.g) && jl40.l(this.h, ig6Var.h) && jl40.l(this.i, ig6Var.i) && jl40.l(this.j, ig6Var.j) && jl40.l(this.k, ig6Var.k);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ymq0 ymq0Var = this.b;
        int hashCode2 = (hashCode + (ymq0Var == null ? 0 : ymq0Var.hashCode())) * 31;
        xmq0 xmq0Var = this.c;
        int b = unr0.b((hashCode2 + (xmq0Var == null ? 0 : xmq0Var.hashCode())) * 31, 31, this.d);
        String str = this.e;
        int hashCode3 = (b + (str == null ? 0 : str.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.f;
        int hashCode4 = (hashCode3 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
        String str2 = this.g;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.h;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TransferDeeplink transferDeeplink = this.i;
        int hashCode7 = (hashCode6 + (transferDeeplink == null ? 0 : transferDeeplink.hashCode())) * 31;
        t910 t910Var = this.j;
        int hashCode8 = (hashCode7 + (t910Var == null ? 0 : t910Var.hashCode())) * 31;
        yi1 yi1Var = this.k;
        return hashCode8 + (yi1Var != null ? yi1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BottomSheetPayloadItemEntity(id=");
        sb.append(this.a);
        sb.append(", selfTransferPayload=");
        sb.append(this.b);
        sb.append(", selfTopupPayload=");
        sb.append(this.c);
        sb.append(", title=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", image=");
        sb.append(this.f);
        sb.append(", action=");
        g8e.D(sb, this.g, ", onSelectedAction=", this.h, ", deeplink=");
        sb.append(this.i);
        sb.append(", me2meTopupPayload=");
        sb.append(this.j);
        sb.append(", aftTopupPayload=");
        sb.append(this.k);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
