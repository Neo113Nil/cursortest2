package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class plk0 extends slk0 {
    public final String b;
    public final String c;
    public final int d;
    public final Drawable e;
    public final String f;

    public plk0(String str, String str2, int i, Drawable drawable, String str3) {
        this.b = str;
        this.c = str2;
        this.d = i;
        this.e = drawable;
        this.f = str3;
    }

    @Override // defpackage.slk0
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof plk0)) {
            return false;
        }
        plk0 plk0Var = (plk0) obj;
        return jl40.l(this.b, plk0Var.b) && jl40.l(this.c, plk0Var.c) && this.d == plk0Var.d && jl40.l(this.e, plk0Var.e) && jl40.l(this.f, plk0Var.f);
    }

    @Override // defpackage.e6v
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        String str = this.c;
        int hashCode2 = (this.e.hashCode() + oyr.b(this.d, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
        String str2 = this.f;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.slk0
    public final int m() {
        return this.d;
    }

    @Override // defpackage.slk0
    public final String n() {
        return this.f;
    }

    public final String toString() {
        StringBuilder v = b64.v("Content(id=", this.b, ", analyticsId=", this.c, ", height=");
        v.append(this.d);
        v.append(", image=");
        v.append(this.e);
        v.append(", photoDescription=");
        return oyr.t(v, this.f, Extension.C_BRAKE);
    }
}
