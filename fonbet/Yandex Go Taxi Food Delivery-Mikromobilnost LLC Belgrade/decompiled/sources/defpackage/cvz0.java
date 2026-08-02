package defpackage;

import android.graphics.drawable.BitmapDrawable;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class cvz0 implements dvz0 {
    public final int a;
    public final BitmapDrawable b;
    public final CharSequence c;
    public final CharSequence d;
    public final hk60 e;
    public final bsf0 f;
    public final bsf0 g;
    public final Map h;

    public cvz0(int i, BitmapDrawable bitmapDrawable, CharSequence charSequence, CharSequence charSequence2, hk60 hk60Var, bsf0 bsf0Var, bsf0 bsf0Var2, Map map) {
        this.a = i;
        this.b = bitmapDrawable;
        this.c = charSequence;
        this.d = charSequence2;
        this.e = hk60Var;
        this.f = bsf0Var;
        this.g = bsf0Var2;
        this.h = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cvz0)) {
            return false;
        }
        cvz0 cvz0Var = (cvz0) obj;
        return this.a == cvz0Var.a && jl40.l(this.b, cvz0Var.b) && jl40.l(this.c, cvz0Var.c) && jl40.l(this.d, cvz0Var.d) && jl40.l(this.e, cvz0Var.e) && jl40.l(this.f, cvz0Var.f) && jl40.l(this.g, cvz0Var.g) && jl40.l(this.h, cvz0Var.h);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        BitmapDrawable bitmapDrawable = this.b;
        int hashCode2 = (this.f.hashCode() + ((this.e.hashCode() + unr0.e(smw0.b(smw0.b((hashCode + (bitmapDrawable == null ? 0 : bitmapDrawable.hashCode())) * 31, 31, this.c), 31, this.d), 31, false)) * 31)) * 31;
        bsf0 bsf0Var = this.g;
        return this.h.hashCode() + ((hashCode2 + (bsf0Var != null ? bsf0Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ready(backgroundTintColor=");
        sb.append(this.a);
        sb.append(", leadIcon=");
        sb.append(this.b);
        sb.append(", title=");
        vfc.A(sb, this.c, ", subtitle=", this.d, ", updateAnimation=false, trail=");
        sb.append(this.e);
        sb.append(", showCallback=");
        sb.append(this.f);
        sb.append(", clickCallback=");
        sb.append(this.g);
        sb.append(", metaInfo=");
        sb.append(this.h);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
