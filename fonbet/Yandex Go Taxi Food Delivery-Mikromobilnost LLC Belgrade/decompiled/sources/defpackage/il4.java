package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$BadgePlace;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class il4 extends xl4 {
    public final String c;

    public il4(String str) {
        super(BadgeModel$BadgePlace.SINGLE_BOTTOM_LEFT);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof il4) && jl40.l(this.c, ((il4) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return oyr.p("Car(imageTag=", this.c, Extension.C_BRAKE);
    }
}
