package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes15.dex */
public final class iai0 implements e1k {
    public final sls a;
    public final pnt0 b = new pnt0((Object) null);
    public final /* synthetic */ jai0 c;

    public iai0(jai0 jai0Var, sls slsVar) {
        this.c = jai0Var;
        this.a = slsVar;
        jai0Var.g.b(this);
    }

    public final Drawable a(int i) {
        jai0 jai0Var = this.c;
        pnt0 pnt0Var = jai0Var.e;
        tje.e();
        z83.h(null, i > 0);
        pnt0 pnt0Var2 = this.b;
        Drawable drawable = (Drawable) pnt0Var2.b(i);
        if (drawable != null) {
            return drawable;
        }
        if (pnt0Var.a) {
            kp50.a(pnt0Var);
        }
        if (cvw.c(pnt0Var.b, pnt0Var.w, i) < 0) {
            jai0.a(jai0Var, i);
        }
        Bitmap bitmap = (Bitmap) pnt0Var.b(i);
        if (bitmap == null) {
            return jai0Var.d;
        }
        BitmapDrawable bitmapDrawable = new BitmapDrawable(jai0Var.a.getResources(), bitmap);
        pnt0Var2.d(i, bitmapDrawable);
        return bitmapDrawable;
    }

    public final void c(int i) {
        tje.e();
        z83.h(null, i > 0);
        jai0 jai0Var = this.c;
        pnt0 pnt0Var = jai0Var.e;
        if (pnt0Var.a) {
            kp50.a(pnt0Var);
        }
        if (cvw.c(pnt0Var.b, pnt0Var.w, i) >= 0) {
            return;
        }
        jai0.a(jai0Var, i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.c.g.d(this);
    }
}
