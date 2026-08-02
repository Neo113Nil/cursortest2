package yads;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes10.dex */
public final class uo2 {
    public final hl3 a;
    public final wo2 c;
    public final dq b = new dq();
    public final so2 d = new so2();

    public uo2(hl3 hl3Var, t72 t72Var) {
        this.a = hl3Var;
        this.c = new wo2(hl3Var, t72Var);
    }

    public final void a() {
        g82 g82Var = (g82) this.a.b();
        if (g82Var != null) {
            vo2 vo2Var = g82Var.c.a;
            wo2 wo2Var = this.c;
            wo2Var.getClass();
            vo2Var.setVisibility(4);
            vo2Var.a.setOnClickListener(wo2Var.a);
            Bitmap bitmap = g82Var.b.getBitmap();
            if (bitmap != null) {
                this.b.a.execute(new cq(bitmap, new to2(this, g82Var, vo2Var), new Handler(Looper.getMainLooper()), new kq()));
            }
        }
    }
}
