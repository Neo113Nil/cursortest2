package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$BadgePlace;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes13.dex */
public final class hl4 extends xl4 {
    public final kdc c;
    public final FormattedText d;

    public hl4(kdc kdcVar, FormattedText formattedText) {
        super(BadgeModel$BadgePlace.SINGLE_BOTTOM_RIGHT);
        this.c = kdcVar;
        this.d = formattedText;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl4)) {
            return false;
        }
        hl4 hl4Var = (hl4) obj;
        return jl40.l(this.c, hl4Var.c) && jl40.l(this.d, hl4Var.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "ButtonBadge(bgColor=" + this.c + ", attributedText=" + this.d + Extension.C_BRAKE;
    }
}
