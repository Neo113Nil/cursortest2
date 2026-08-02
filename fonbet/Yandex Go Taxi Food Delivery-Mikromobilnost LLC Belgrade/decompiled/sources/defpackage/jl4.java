package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$BadgePlace;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class jl4 extends pl4 {
    public final bl4 c;

    public jl4(bl4 bl4Var) {
        super(BadgeModel$BadgePlace.SINGLE_BOTTOM_LEFT);
        this.c = bl4Var;
    }

    @Override // defpackage.pl4
    public final bl4 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jl4) && jl40.l(this.c, ((jl4) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "CornerImage(base=" + this.c + Extension.C_BRAKE;
    }
}
