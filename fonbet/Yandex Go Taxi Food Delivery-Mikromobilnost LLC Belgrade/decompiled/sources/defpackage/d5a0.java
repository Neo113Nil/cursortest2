package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class d5a0 {
    public final ThemedImageUrlEntity a;
    public final boolean b;

    public d5a0(ThemedImageUrlEntity themedImageUrlEntity, boolean z) {
        this.a = themedImageUrlEntity;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d5a0)) {
            return false;
        }
        d5a0 d5a0Var = (d5a0) obj;
        return jl40.l(this.a, d5a0Var.a) && this.b == d5a0Var.b;
    }

    public final int hashCode() {
        ThemedImageUrlEntity themedImageUrlEntity = this.a;
        return Boolean.hashCode(this.b) + ((themedImageUrlEntity == null ? 0 : themedImageUrlEntity.hashCode()) * 31);
    }

    public final String toString() {
        return "Me2MeImageModel(themedLogo=" + this.a + ", isSelectedBank=" + this.b + Extension.C_BRAKE;
    }
}
