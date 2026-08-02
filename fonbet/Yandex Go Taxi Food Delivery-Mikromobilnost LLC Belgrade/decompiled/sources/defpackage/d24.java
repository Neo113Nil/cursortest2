package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class d24 implements e24 {
    public final String a;
    public final ThemedImageUrlEntity b;
    public final String c;
    public final String d;
    public final ActionButtonEntity e;
    public final ActionButtonEntity f;

    public d24(String str, ThemedImageUrlEntity themedImageUrlEntity, String str2, String str3, ActionButtonEntity actionButtonEntity, ActionButtonEntity actionButtonEntity2) {
        this.a = str;
        this.b = themedImageUrlEntity;
        this.c = str2;
        this.d = str3;
        this.e = actionButtonEntity;
        this.f = actionButtonEntity2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d24)) {
            return false;
        }
        d24 d24Var = (d24) obj;
        return jl40.l(this.a, d24Var.a) && this.b.equals(d24Var.b) && jl40.l(this.c, d24Var.c) && jl40.l(this.d, d24Var.d) && this.e.equals(d24Var.e) && jl40.l(this.f, d24Var.f);
    }

    public final int hashCode() {
        int b = unr0.b(xvz.c(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        String str = this.d;
        int hashCode = (this.e.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        ActionButtonEntity actionButtonEntity = this.f;
        return hashCode + (actionButtonEntity != null ? actionButtonEntity.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Success(autoTopupId=");
        sb.append(this.a);
        sb.append(", imageUrl=");
        sb.append(this.b);
        sb.append(", title=");
        g8e.D(sb, this.c, ", description=", this.d, ", primaryButton=");
        sb.append(this.e);
        sb.append(", secondaryButton=");
        sb.append(this.f);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
