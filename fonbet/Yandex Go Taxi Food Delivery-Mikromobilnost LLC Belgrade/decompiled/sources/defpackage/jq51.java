package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class jq51 {
    public final ThemedImageUrlEntity a;
    public final ThemedImageUrlEntity b;

    public jq51(ThemedImageUrlEntity themedImageUrlEntity, ThemedImageUrlEntity themedImageUrlEntity2) {
        this.a = themedImageUrlEntity;
        this.b = themedImageUrlEntity2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jq51)) {
            return false;
        }
        jq51 jq51Var = (jq51) obj;
        return this.a.equals(jq51Var.a) && jl40.l(this.b, jq51Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ThemedImageUrlEntity themedImageUrlEntity = this.b;
        return hashCode + (themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode());
    }

    public final String toString() {
        return "YbCardSkinEntity(defaultLayer=" + this.a + ", samsungPayLayer=" + this.b + Extension.C_BRAKE;
    }
}
