package xsna;

import com.vkontakte.android.R;

/* compiled from: CollageColor.kt */
/* loaded from: classes4.dex */
public final class f0g {
    public static final f0g e = new f0g("White", -1, new x8g0(R.string.editor_collage_color_white), true);
    public static final f0g f = new f0g("Black", -16777216, new x8g0(R.string.editor_collage_color_black), false);
    public final String a;
    public final int b;
    public final x8g0 c;
    public final boolean d;

    public f0g(String str, int i, x8g0 x8g0Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = x8g0Var;
        this.d = z;
    }

    public static f0g a(f0g f0gVar, boolean z) {
        String str = f0gVar.a;
        int i = f0gVar.b;
        x8g0 x8g0Var = f0gVar.c;
        f0gVar.getClass();
        return new f0g(str, i, x8g0Var, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0g)) {
            return false;
        }
        f0g f0gVar = (f0g) obj;
        return epx.f(this.a, f0gVar.a) && this.b == f0gVar.b && epx.f(this.c, f0gVar.c) && this.d == f0gVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + shy.a(this.c.a, shy.a(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        return this.a;
    }
}
