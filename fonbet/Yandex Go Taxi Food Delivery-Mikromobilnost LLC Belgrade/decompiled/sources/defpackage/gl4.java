package defpackage;

import com.yandex.go.shortcuts.view.adapter.model.BadgeModel$BadgePlace;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class gl4 extends pl4 {
    public final bl4 c;
    public final String d;

    public gl4(bl4 bl4Var, String str) {
        super(BadgeModel$BadgePlace.SINGLE_BOTTOM);
        this.c = bl4Var;
        this.d = str;
    }

    @Override // defpackage.pl4
    public final bl4 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl4)) {
            return false;
        }
        gl4 gl4Var = (gl4) obj;
        return jl40.l(this.c, gl4Var.c) && jl40.l(this.d, gl4Var.d);
    }

    public final int hashCode() {
        int hashCode = this.c.hashCode() * 31;
        String str = this.d;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "Button(base=" + this.c + ", imageTag=" + this.d + Extension.C_BRAKE;
    }
}
