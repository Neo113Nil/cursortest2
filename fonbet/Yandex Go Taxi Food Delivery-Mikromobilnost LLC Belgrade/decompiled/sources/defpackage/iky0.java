package defpackage;

import com.ybsdk.core.common.domain.entities.ThemedImageUrlEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class iky0 {
    public final ThemedImageUrlEntity a;
    public final String b;

    public iky0(ThemedImageUrlEntity themedImageUrlEntity, String str) {
        this.a = themedImageUrlEntity;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof iky0)) {
            return false;
        }
        iky0 iky0Var = (iky0) obj;
        return this.a.equals(iky0Var.a) && jl40.l(this.b, iky0Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "TextBadgeEntity(icon=" + this.a + ", action=" + this.b + Extension.C_BRAKE;
    }
}
