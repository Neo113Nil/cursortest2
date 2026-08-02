package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;

/* loaded from: classes.dex */
public abstract class lev {
    public static final uh a;
    public static final uh b;
    public static final uh c;
    public static final uh d;
    public static final uh e;
    public static final uh f;

    static {
        int i = px01.a;
        a = new uh(zx21.b);
        b = new uh(null);
        Boolean bool = Boolean.TRUE;
        c = new uh(bool);
        d = new uh(null);
        e = new uh(bool);
        f = new uh(Boolean.FALSE);
    }

    public static final Bitmap.Config a(lg70 lg70Var) {
        return (Bitmap.Config) s8o.p(lg70Var, a);
    }

    public static final ColorSpace b(lg70 lg70Var) {
        return (ColorSpace) s8o.p(lg70Var, b);
    }
}
