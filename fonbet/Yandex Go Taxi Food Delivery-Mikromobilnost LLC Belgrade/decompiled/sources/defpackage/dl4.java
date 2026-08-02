package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$BadgePlace;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class dl4 extends xl4 {
    public final String c;
    public final Integer d;

    public dl4(String str, Integer num) {
        super(BadgeModel$BadgePlace.SINGLE_BOTTOM_RIGHT);
        this.c = str;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl4)) {
            return false;
        }
        dl4 dl4Var = (dl4) obj;
        return jl40.l(this.c, dl4Var.c) && jl40.l(this.d, dl4Var.d);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        Integer num = this.d;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        return "BottomRight(imageTag=" + this.c + ", fallbackImageRes=" + this.d + Extension.C_BRAKE;
    }
}
