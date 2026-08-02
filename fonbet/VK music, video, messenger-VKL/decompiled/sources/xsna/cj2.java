package xsna;

import android.graphics.Bitmap;
import android.graphics.Rect;
import xsna.qk2;

/* compiled from: AnimatedDrawableBackendFrameRenderer.kt */
/* loaded from: classes12.dex */
public final class cj2 implements gc7 {
    public final dc7 a;
    public bj2 b;
    public final boolean c;
    public qk2 d;
    public final a e;

    /* compiled from: AnimatedDrawableBackendFrameRenderer.kt */
    public static final class a implements qk2.b {
        public a() {
        }

        @Override // xsna.qk2.b
        public final uvf<Bitmap> a(int i) {
            return cj2.this.a.g(i);
        }
    }

    public cj2(dc7 dc7Var, bj2 bj2Var, boolean z) {
        this.a = dc7Var;
        this.b = bj2Var;
        this.c = z;
        a aVar = new a();
        this.e = aVar;
        this.d = new qk2(bj2Var, z, aVar);
    }

    @Override // xsna.gc7
    public final boolean a(int i, Bitmap bitmap) {
        try {
            this.d.d(i, bitmap);
            return true;
        } catch (IllegalStateException e) {
            if (!ahq.a.a(6)) {
                return false;
            }
            bhq.c(6, cj2.class.getSimpleName(), "Rendering of frame unsuccessful. Frame number: " + i, e);
            return false;
        }
    }

    @Override // xsna.gc7
    public final int getIntrinsicHeight() {
        return ((dj2) this.b).c.getHeight();
    }

    @Override // xsna.gc7
    public final int getIntrinsicWidth() {
        return ((dj2) this.b).c.getWidth();
    }

    @Override // xsna.gc7
    public final void setBounds(Rect rect) {
        dj2 dj2Var = (dj2) this.b;
        if (!dj2.a(dj2Var.c, rect).equals(dj2Var.d)) {
            dj2Var = new dj2(dj2Var.a, dj2Var.b, rect, dj2Var.j);
        }
        if (dj2Var != this.b) {
            this.b = dj2Var;
            this.d = new qk2(dj2Var, this.c, this.e);
        }
    }
}
