package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import com.ybsdk.core.transfer.utils.domain.entities.PageHeaderEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class b910 {
    public final PageHeaderEntity a;
    public final ThemedImageUrlEntity b;
    public final String c;
    public final String d;
    public final ActionButtonEntity e;
    public final String f;

    public b910(PageHeaderEntity pageHeaderEntity, ThemedImageUrlEntity themedImageUrlEntity, String str, String str2, ActionButtonEntity actionButtonEntity, String str3) {
        this.a = pageHeaderEntity;
        this.b = themedImageUrlEntity;
        this.c = str;
        this.d = str2;
        this.e = actionButtonEntity;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b910)) {
            return false;
        }
        b910 b910Var = (b910) obj;
        return jl40.l(this.a, b910Var.a) && this.b.equals(b910Var.b) && jl40.l(this.c, b910Var.c) && jl40.l(this.d, b910Var.d) && this.e.equals(b910Var.e) && jl40.l(this.f, b910Var.f);
    }

    public final int hashCode() {
        PageHeaderEntity pageHeaderEntity = this.a;
        int hashCode = (this.e.hashCode() + unr0.b(unr0.b(xvz.c(this.b, (pageHeaderEntity == null ? 0 : pageHeaderEntity.hashCode()) * 31, 31), 31, this.c), 31, this.d)) * 31;
        String str = this.f;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Me2MeDebitAutoPullPageContentEntity(header=");
        sb.append(this.a);
        sb.append(", ybLogo=");
        sb.append(this.b);
        sb.append(", title=");
        g8e.D(sb, this.c, ", description=", this.d, ", button=");
        sb.append(this.e);
        sb.append(", legal=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
