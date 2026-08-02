package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$BadgePlace;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class nl4 extends xl4 {
    public final kdc c;
    public final String d;

    public nl4(kdc kdcVar, String str) {
        super(BadgeModel$BadgePlace.SINGLE_BOTTOM_RIGHT);
        this.c = kdcVar;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl4)) {
            return false;
        }
        nl4 nl4Var = (nl4) obj;
        return jl40.l(this.c, nl4Var.c) && jl40.l(this.d, nl4Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "Poi(bgColor=" + this.c + ", imageTag=" + this.d + Extension.C_BRAKE;
    }
}
