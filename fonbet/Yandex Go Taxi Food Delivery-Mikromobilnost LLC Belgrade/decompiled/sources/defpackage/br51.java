package defpackage;

import com.ybsdk.core.common.domain.entities.ActionButtonEntity;
import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class br51 {
    public final String a;
    public final String b;
    public final ThemedImageUrlEntity c;
    public final ActionButtonEntity d;
    public final ActionButtonEntity e;

    public br51(String str, String str2, ThemedImageUrlEntity themedImageUrlEntity, ActionButtonEntity actionButtonEntity, ActionButtonEntity actionButtonEntity2) {
        this.a = str;
        this.b = str2;
        this.c = themedImageUrlEntity;
        this.d = actionButtonEntity;
        this.e = actionButtonEntity2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof br51)) {
            return false;
        }
        br51 br51Var = (br51) obj;
        return jl40.l(this.a, br51Var.a) && jl40.l(this.b, br51Var.b) && jl40.l(this.c, br51Var.c) && jl40.l(this.d, br51Var.d) && jl40.l(this.e, br51Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.c;
        int hashCode3 = (hashCode2 + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode())) * 31;
        ActionButtonEntity actionButtonEntity = this.d;
        int hashCode4 = (hashCode3 + (actionButtonEntity == null ? 0 : actionButtonEntity.hashCode())) * 31;
        ActionButtonEntity actionButtonEntity2 = this.e;
        return hashCode4 + (actionButtonEntity2 != null ? actionButtonEntity2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("YbCheckErrorInfo(title=", this.a, ", description=", this.b, ", imageUrl=");
        v.append(this.c);
        v.append(", buttonPrimary=");
        v.append(this.d);
        v.append(", buttonSecondary=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
