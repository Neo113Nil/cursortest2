package yads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import xsna.j3u0;

/* loaded from: classes10.dex */
public final class y31 {
    public final t31 a;
    public final nj2 b;
    public final n41 c;
    public final ek0 d;
    public final Resources e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ y31(Context context, t31 t31Var, nj2 nj2Var) {
        this(context, t31Var, nj2Var, r0.a(context).b(), r0.a(context).a(), gx2.a());
        u92 u92Var = x92.d;
    }

    public final void a(x41 x41Var, v31 v31Var) {
        nj2 nj2Var = this.b;
        nj2Var.getClass();
        String str = x41Var.g;
        mj2 mj2Var = str != null ? new mj2(str, new c13(x41Var.a, x41Var.b)) : null;
        Bitmap bitmap = mj2Var != null ? (Bitmap) nj2Var.c.get(mj2Var) : null;
        v31Var.a(bitmap != null ? new BitmapDrawable(this.e, bitmap) : null);
        if (this.f) {
            this.d.a(x41Var.c, new x31(v31Var));
        } else {
            b(x41Var, v31Var);
        }
    }

    public final void b(x41 x41Var, v31 v31Var) {
        j3u0 j3u0Var = new j3u0(v31Var, this);
        Bitmap a = this.b.a(x41Var);
        if (a != null) {
            j3u0Var.b(a);
            return;
        }
        nj2 nj2Var = this.b;
        nj2Var.getClass();
        String str = x41Var.g;
        mj2 mj2Var = str != null ? new mj2(str, new c13(x41Var.a, x41Var.b)) : null;
        j3u0Var.b(mj2Var != null ? (Bitmap) nj2Var.c.get(mj2Var) : null);
        if (this.a.a()) {
            String str2 = x41Var.c;
            this.c.a(str2, new w31(this, str2, j3u0Var), x41Var.a, x41Var.b);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0022, code lost:
    
        if (r1.d() == true) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public y31(Context context, t31 t31Var, nj2 nj2Var, n41 n41Var, ek0 ek0Var, hx2 hx2Var) {
        this.a = t31Var;
        this.b = nj2Var;
        this.c = n41Var;
        this.d = ek0Var;
        this.e = context.getResources();
        boolean z = t31Var.a() && (r1 = hx2Var.a(context)) != null;
        this.f = z;
    }

    public static final void a(v31 v31Var, y31 y31Var, Bitmap bitmap) {
        v31Var.a(bitmap != null ? new BitmapDrawable(y31Var.e, bitmap) : null);
    }
}
