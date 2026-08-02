package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.common.MobileProvidersListItemData$Contact$Type;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class cu20 implements fu20 {
    public final jfb0 a;
    public final MobileProvidersListItemData$Contact$Type b;

    public cu20(jfb0 jfb0Var, MobileProvidersListItemData$Contact$Type mobileProvidersListItemData$Contact$Type) {
        this.a = jfb0Var;
        this.b = mobileProvidersListItemData$Contact$Type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu20)) {
            return false;
        }
        cu20 cu20Var = (cu20) obj;
        return jl40.l(this.a, cu20Var.a) && this.b == cu20Var.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Contact(phone=" + this.a + ", type=" + this.b + Extension.C_BRAKE;
    }
}
