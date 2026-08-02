package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class al9 implements el9 {
    public final CharSequence a;
    public final CharSequence b;
    public final hba c;
    public final String d;
    public final Map e;

    public al9(CharSequence charSequence, CharSequence charSequence2, hba hbaVar, String str, Map map) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = hbaVar;
        this.d = str;
        this.e = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof al9)) {
            return false;
        }
        al9 al9Var = (al9) obj;
        return jl40.l(this.a, al9Var.a) && jl40.l(this.b, al9Var.b) && this.c.equals(al9Var.c) && jl40.l(this.d, al9Var.d) && jl40.l(this.e, al9Var.e);
    }

    @Override // defpackage.el9
    public final hba getAction() {
        return this.c;
    }

    @Override // defpackage.el9
    public final CharSequence getTitle() {
        return this.a;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + smw0.b(this.a.hashCode() * 31, 31, this.b)) * 31;
        String str = this.d;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.e;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Banner(title=", ", subtitle=", ", action=");
        r.append(this.c);
        r.append(", imageUrl=");
        r.append(this.d);
        r.append(", analyticsPayload=");
        return b64.r(r, this.e, Extension.C_BRAKE);
    }
}
