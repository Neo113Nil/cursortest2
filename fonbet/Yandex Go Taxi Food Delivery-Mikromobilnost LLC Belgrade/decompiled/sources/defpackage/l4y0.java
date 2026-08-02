package defpackage;

import android.graphics.drawable.Drawable;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class l4y0 extends s4y0 {
    public final CharSequence a;
    public final CharSequence b;
    public final Drawable c;
    public final boolean d;
    public final List e;

    public /* synthetic */ l4y0(String str, String str2, Drawable drawable, List list, int i) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : drawable, false, (i & 16) != 0 ? EmptyList.a : list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4y0)) {
            return false;
        }
        l4y0 l4y0Var = (l4y0) obj;
        return jl40.l(this.a, l4y0Var.a) && jl40.l(this.b, l4y0Var.b) && jl40.l(this.c, l4y0Var.c) && this.d == l4y0Var.d && jl40.l(this.e, l4y0Var.e);
    }

    public final int hashCode() {
        int b = smw0.b(this.a.hashCode() * 31, 31, this.b);
        Drawable drawable = this.c;
        return this.e.hashCode() + unr0.e((b + (drawable == null ? 0 : drawable.hashCode())) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder r = vfc.r(this.a, this.b, "Content(title=", ", content=", ", icon=");
        r.append(this.c);
        r.append(", isIconHotSpot=");
        r.append(this.d);
        r.append(", widgets=");
        return ly3.s(r, this.e, Extension.C_BRAKE);
    }

    public l4y0(CharSequence charSequence, CharSequence charSequence2, Drawable drawable, boolean z, List list) {
        this.a = charSequence;
        this.b = charSequence2;
        this.c = drawable;
        this.d = z;
        this.e = list;
    }

    public l4y0() {
        this((CharSequence) null, (CharSequence) null, (Drawable) null, (List) null, 31);
    }
}
