package xsna;

import android.graphics.drawable.Drawable;

/* compiled from: PopupItem.kt */
/* loaded from: classes2.dex */
public final class lwb0<T> {
    public final CharSequence a;
    public final int b;
    public final Drawable c;
    public final Integer d;
    public final int e;
    public final T f;
    public final boolean g;
    public final cpj0 h;
    public final boolean i;
    public final boolean j;
    public final boolean k;

    public lwb0() {
        this(null, 0, null, null, 0, null, false, null, false, false, 2047);
    }

    public lwb0(CharSequence charSequence, int i, Drawable drawable, Integer num, int i2, Object obj, boolean z, cpj0 cpj0Var, boolean z2, boolean z3, int i3) {
        charSequence = (i3 & 1) != 0 ? "" : charSequence;
        i = (i3 & 2) != 0 ? 0 : i;
        drawable = (i3 & 4) != 0 ? null : drawable;
        num = (i3 & 8) != 0 ? null : num;
        i2 = (i3 & 16) != 0 ? 0 : i2;
        obj = (i3 & 32) != 0 ? (T) null : obj;
        z = (i3 & 64) != 0 ? false : z;
        cpj0Var = (i3 & 128) != 0 ? null : cpj0Var;
        z2 = (i3 & 256) != 0 ? true : z2;
        z3 = (i3 & 512) != 0 ? false : z3;
        boolean z4 = (i3 & 1024) == 0;
        this.a = charSequence;
        this.b = i;
        this.c = drawable;
        this.d = num;
        this.e = i2;
        this.f = (T) obj;
        this.g = z;
        this.h = cpj0Var;
        this.i = z2;
        this.j = z3;
        this.k = z4;
    }
}
