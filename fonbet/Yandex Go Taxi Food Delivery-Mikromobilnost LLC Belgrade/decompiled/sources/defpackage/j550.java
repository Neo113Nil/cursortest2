package defpackage;

import androidx.view.f;

/* loaded from: classes10.dex */
public final class j550 {
    public boolean a;
    public boolean b;
    public String d;
    public boolean e;
    public boolean f;
    public int c = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;

    public final k550 a() {
        String str = this.d;
        boolean z = this.a;
        if (str == null) {
            return new k550(z, this.b, this.c, this.e, this.f, this.g, this.h, this.i, this.j);
        }
        boolean z2 = this.b;
        boolean z3 = this.e;
        boolean z4 = this.f;
        int i = this.g;
        int i2 = this.h;
        int i3 = this.i;
        int i4 = this.j;
        int i5 = f.D;
        k550 k550Var = new k550(z, z2, "android-app://androidx.navigation/".concat(str).hashCode(), z3, z4, i, i2, i3, i4);
        k550Var.j = str;
        return k550Var;
    }
}
