package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$BadgePlace;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ml4 extends pl4 {
    public final bl4 c;

    public ml4(bl4 bl4Var) {
        super(BadgeModel$BadgePlace.MULTY_TOP_RIGHT);
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
        return (obj instanceof ml4) && jl40.l(this.c, ((ml4) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "Label(base=" + this.c + Extension.C_BRAKE;
    }
}
