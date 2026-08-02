package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class dl9 implements el9 {
    public final List a;
    public final hba b;

    public dl9(List list, gba gbaVar) {
        this.a = list;
        this.b = gbaVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl9)) {
            return false;
        }
        dl9 dl9Var = (dl9) obj;
        return jl40.l(this.a, dl9Var.a) && jl40.l(this.b, dl9Var.b);
    }

    @Override // defpackage.el9
    public final hba getAction() {
        return this.b;
    }

    @Override // defpackage.el9
    public final CharSequence getTitle() {
        return "";
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 29791);
    }

    public final String toString() {
        return "OrderButtonsItem(buttons=" + this.a + ", title=, subtitle=, action=" + this.b + Extension.C_BRAKE;
    }
}
