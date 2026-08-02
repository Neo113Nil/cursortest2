package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class hq51 {
    public final String a;
    public final ThemedImageUrlEntity b;

    public hq51(String str, ThemedImageUrlEntity themedImageUrlEntity) {
        this.a = str;
        this.b = themedImageUrlEntity;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hq51)) {
            return false;
        }
        hq51 hq51Var = (hq51) obj;
        return jl40.l(this.a, hq51Var.a) && this.b.equals(hq51Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "YbCardPromoPointEntity(text=" + this.a + ", iconUrl=" + this.b + Extension.C_BRAKE;
    }
}
