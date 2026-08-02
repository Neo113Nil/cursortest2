package defpackage;

import android.graphics.drawable.Drawable;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class b8j extends d8j {
    public final String a;
    public final CharSequence b;
    public final CharSequence c;
    public final Drawable d;
    public final ibk0 e;
    public final int f;
    public final boolean g;

    public b8j(String str, CharSequence charSequence, CharSequence charSequence2, Drawable drawable, ibk0 ibk0Var, int i, boolean z) {
        this.a = str;
        this.b = charSequence;
        this.c = charSequence2;
        this.d = drawable;
        this.e = ibk0Var;
        this.f = i;
        this.g = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b8j)) {
            return false;
        }
        b8j b8jVar = (b8j) obj;
        return jl40.l(this.a, b8jVar.a) && jl40.l(this.b, b8jVar.b) && jl40.l(this.c, b8jVar.c) && jl40.l(this.d, b8jVar.d) && jl40.l(this.e, b8jVar.e) && this.f == b8jVar.f && this.g == b8jVar.g;
    }

    public final int hashCode() {
        int b = smw0.b(smw0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        Drawable drawable = this.d;
        return Boolean.hashCode(this.g) + oyr.b(this.f, (this.e.hashCode() + ((b + (drawable == null ? 0 : drawable.hashCode())) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder t = ly3.t(this.b, "Content(upsellId=", this.a, ", title=", ", subtitle=");
        t.append((Object) this.c);
        t.append(", icon=");
        t.append(this.d);
        t.append(", upsellAction=");
        t.append(this.e);
        t.append(", maxShowCount=");
        t.append(this.f);
        t.append(", hideOnAction=");
        return x4e.i(t, this.g, Extension.C_BRAKE);
    }
}
