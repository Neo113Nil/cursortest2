package yads;

import android.graphics.Bitmap;
import android.os.Handler;

/* loaded from: classes10.dex */
public final class cq implements Runnable {
    public final Bitmap b;
    public final to2 c;
    public final Handler d;
    public final kq e;

    public cq(Bitmap bitmap, to2 to2Var, Handler handler, kq kqVar) {
        this.b = bitmap;
        this.c = to2Var;
        this.d = handler;
        this.e = kqVar;
    }

    public final void a(Bitmap bitmap) {
        this.d.post(new xsna.eo1(9, this, bitmap));
    }

    @Override // java.lang.Runnable
    public final void run() {
        kq kqVar = this.e;
        Bitmap bitmap = this.b;
        kqVar.getClass();
        try {
            bitmap = kq.a(bitmap, 0.1d);
        } catch (Throwable unused) {
        }
        a(bitmap);
    }

    public static final void a(cq cqVar, Bitmap bitmap) {
        to2 to2Var = cqVar.c;
        so2 so2Var = to2Var.a.d;
        g82 g82Var = to2Var.b;
        vo2 vo2Var = to2Var.c;
        so2Var.getClass();
        so2.a(g82Var, vo2Var, bitmap);
    }
}
