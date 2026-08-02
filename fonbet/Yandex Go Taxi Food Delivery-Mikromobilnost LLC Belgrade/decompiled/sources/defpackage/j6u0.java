package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import coil3.c;
import coil3.graphics.C0139b;

/* loaded from: classes.dex */
public final class j6u0 implements fyg {
    public final onq0 a;

    public j6u0() {
        this(qnq0.a(4));
    }

    @Override // defpackage.fyg
    public final iyg a(zct0 zct0Var, lg70 lg70Var, c cVar) {
        ImageDecoder.Source V;
        Bitmap.Config a = lev.a(lg70Var);
        if ((a == Bitmap.Config.ARGB_8888 || a == Bitmap.Config.HARDWARE) && (V = s8o.V(zct0Var.a, lg70Var, false)) != null) {
            return new C0139b(V, zct0Var.a, lg70Var, this.a);
        }
        return null;
    }

    public j6u0(pnq0 pnq0Var) {
        this.a = pnq0Var;
    }
}
