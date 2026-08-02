package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$BadgePlace;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class al4 extends pl4 {
    public final bl4 c;
    public final int d;

    public al4(bl4 bl4Var) {
        super(BadgeModel$BadgePlace.SINGLE_BOTTOM_LEFT);
        this.c = bl4Var;
        this.d = 6;
    }

    @Override // defpackage.pl4
    public final bl4 b() {
        return this.c;
    }

    @Override // defpackage.pl4
    public final Integer c() {
        return Integer.valueOf(this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof al4) && jl40.l(this.c, ((al4) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Afisha(base=" + this.c + Extension.C_BRAKE;
    }
}
