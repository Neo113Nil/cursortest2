package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$BadgePlace;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fl4 extends pl4 {
    public static final el4 e = new el4();
    public final bl4 c;
    public final BadgeModel$BadgePlace d;

    public fl4(bl4 bl4Var, BadgeModel$BadgePlace badgeModel$BadgePlace) {
        super(badgeModel$BadgePlace);
        this.c = bl4Var;
        this.d = badgeModel$BadgePlace;
    }

    @Override // defpackage.xl4
    public final BadgeModel$BadgePlace a() {
        return this.d;
    }

    @Override // defpackage.pl4
    public final bl4 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl4)) {
            return false;
        }
        fl4 fl4Var = (fl4) obj;
        return jl40.l(this.c, fl4Var.c) && this.d == fl4Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return "Bubble(base=" + this.c + ", place=" + this.d + Extension.C_BRAKE;
    }
}
