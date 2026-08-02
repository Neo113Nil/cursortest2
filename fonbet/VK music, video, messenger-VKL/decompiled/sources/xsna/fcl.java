package xsna;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: DefaultCanvasHolder.kt */
/* loaded from: classes4.dex */
public final class fcl implements hr9 {
    public final pb7 a = new pb7();
    public final pb7 b;
    public final pb7 c;
    public final pb7 d;
    public final nlo e;
    public final ru90 f;

    public fcl() {
        pb7 pb7Var = new pb7();
        this.b = pb7Var;
        pb7 pb7Var2 = new pb7();
        this.c = pb7Var2;
        pb7 pb7Var3 = new pb7();
        this.d = pb7Var3;
        this.e = new nlo(pb7Var2);
        this.f = new ru90(pb7Var3, pb7Var);
    }

    @Override // xsna.hr9
    public final void a(Canvas canvas) {
        nlo nloVar = this.e;
        pb7 pb7Var = nloVar.b;
        pb7Var.b();
        Bitmap bitmap = pb7Var.a;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, nloVar.c);
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.hr9
    public final void b(vlo vloVar) {
        nlo nloVar = this.e;
        nloVar.clear();
        xlo.a(vloVar, nloVar);
    }

    @Override // xsna.jti0
    public final qu90 c() {
        return this.f;
    }

    @Override // xsna.jti0
    public final mlo d() {
        return this.e;
    }

    @Override // xsna.hr9
    public final void e(jio jioVar) {
        jioVar.a(this.e);
    }

    @Override // xsna.hr9
    public final void init(int i, int i2) {
        this.d.a(i, i2);
        this.c.a(i, i2);
        this.a.a(i, i2);
        this.b.a(i, i2);
    }
}
