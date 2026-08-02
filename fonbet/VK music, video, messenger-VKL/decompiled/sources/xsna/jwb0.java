package xsna;

import android.graphics.drawable.Drawable;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: PopupItem.kt */
@ozl
/* loaded from: classes2.dex */
public final class jwb0<T> {
    public final CharSequence a;
    public final int b;
    public final Drawable c;
    public final Integer d;
    public final int e;
    public final T f;
    public final boolean g;
    public final boolean h;
    public final cpj0 i;
    public final boolean j;

    public jwb0() {
        this(null, 0, null, null, 0, null, false, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE);
    }

    public jwb0(String str, int i, Drawable drawable, Integer num, int i2, Object obj, boolean z, cpj0 cpj0Var, int i3) {
        str = (i3 & 1) != 0 ? "" : str;
        i = (i3 & 2) != 0 ? 0 : i;
        drawable = (i3 & 4) != 0 ? null : drawable;
        num = (i3 & 8) != 0 ? null : num;
        i2 = (i3 & 16) != 0 ? 0 : i2;
        obj = (i3 & 32) != 0 ? (T) null : obj;
        z = (i3 & 64) != 0 ? true : z;
        boolean z2 = (i3 & 128) == 0;
        cpj0Var = (i3 & 256) != 0 ? null : cpj0Var;
        boolean z3 = (i3 & 512) != 0;
        this.a = str;
        this.b = i;
        this.c = drawable;
        this.d = num;
        this.e = i2;
        this.f = (T) obj;
        this.g = z;
        this.h = z2;
        this.i = cpj0Var;
        this.j = z3;
    }
}
