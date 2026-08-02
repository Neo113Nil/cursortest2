package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class a741 {
    public final String a;
    public final String b;
    public final my6 c;
    public final String d;
    public final Drawable e;

    public a741(String str, String str2, my6 my6Var, String str3, Drawable drawable) {
        this.a = str;
        this.b = str2;
        this.c = my6Var;
        this.d = str3;
        this.e = drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a741)) {
            return false;
        }
        a741 a741Var = (a741) obj;
        return jl40.l(this.a, a741Var.a) && jl40.l(this.b, a741Var.b) && jl40.l(this.c, a741Var.c) && jl40.l(this.d, a741Var.d) && jl40.l(this.e, a741Var.e);
    }

    public final int hashCode() {
        int b = unr0.b((this.c.hashCode() + unr0.b(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d);
        Drawable drawable = this.e;
        return b + (drawable == null ? 0 : drawable.hashCode());
    }

    public final String toString() {
        StringBuilder v = b64.v("WalkingInfoUiState(title=", this.a, ", subtitle=", this.b, ", cancelButton=");
        v.append(this.c);
        v.append(", tariffIconTag=");
        v.append(this.d);
        v.append(", shadow=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }

    public a741() {
        this("", "", my6.k, "", null);
    }
}
