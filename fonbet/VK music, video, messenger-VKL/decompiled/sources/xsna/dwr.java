package xsna;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
import xsna.mo9;

/* compiled from: FocusOverlayManager.java */
/* loaded from: classes13.dex */
public final class dwr {
    public int a;
    public boolean b;
    public boolean c;
    public Matrix d;
    public int e;
    public int f;
    public boolean g;
    public int h;
    public ArrayList i;
    public ArrayList j;
    public String k;
    public sj9 l;
    public a m;
    public zd9 n;
    public zd9 o;

    /* compiled from: FocusOverlayManager.java */
    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what != 0) {
                return;
            }
            dwr.this.b();
        }
    }

    public final void a(int i, int i2, float f, int i3, int i4, int i5, int i6, Rect rect) {
        int i7 = (int) (i * f);
        int i8 = (int) (i2 * f);
        RectF rectF = new RectF(bn10.c(i3 - (i7 / 2), 0, i5 - i7), bn10.c(i4 - (i8 / 2), 0, i6 - i8), r4 + i7, r3 + i8);
        this.d.mapRect(rectF);
        rect.left = Math.round(rectF.left);
        rect.top = Math.round(rectF.top);
        rect.right = Math.round(rectF.right);
        rect.bottom = Math.round(rectF.bottom);
    }

    public final void b() {
        zd9 zd9Var;
        if (this.d != null && (zd9Var = this.o) != null) {
            zd9Var.d();
            this.i = null;
            this.j = null;
        }
        jhu0 jhu0Var = this.n.m;
        if (jhu0Var != null) {
            jhu0Var.g();
        }
        this.a = 0;
        f();
        this.m.removeMessages(0);
    }

    public final void c() {
        sk9 sk9Var;
        zd9 zd9Var = this.n;
        if (zd9Var.m == null) {
            return;
        }
        xl0 xl0Var = zd9Var.c0;
        mo9.b bVar = zd9Var.s;
        if (bVar != null && (sk9Var = bVar.r) != null && sk9Var.j0) {
            pes pesVar = new pes();
            pesVar.g = true;
            ri9 ri9Var = sk9Var.f0;
            synchronized (ri9Var.b) {
                ri9Var.c.a.f(pesVar);
            }
            if (egs.a(pesVar) != null) {
                xl0Var.c(egs.a(pesVar), null);
                this.a = 0;
                this.m.removeMessages(0);
            }
        }
        oo9 cameraPreview = zd9Var.getCameraPreview();
        ae9 ae9Var = new ae9(zd9Var);
        syf0 syf0Var = (syf0) ((mo9) cameraPreview).g.l.b;
        if (syf0Var != null) {
            syf0Var.sendMessage(syf0Var.obtainMessage(5, ae9Var));
        }
        this.a = 0;
        this.m.removeMessages(0);
    }

    public final String d() {
        List<String> c = this.l.c();
        if (!this.b || this.i == null) {
            this.k = "auto";
        } else {
            this.k = "auto";
        }
        if (c.indexOf(this.k) < 0) {
            if (this.l.c().indexOf("auto") >= 0) {
                this.k = "auto";
            } else {
                this.k = this.l.b();
            }
        }
        return this.k;
    }

    public final void e() {
        if (this.e == 0 || this.f == 0) {
            return;
        }
        Matrix matrix = new Matrix();
        boolean z = this.g;
        int i = this.h;
        int i2 = this.e;
        int i3 = this.f;
        matrix.setScale(z ? -1.0f : 1.0f, 1.0f);
        bpn0 bpn0Var = t5m.a;
        if ("LGE".equalsIgnoreCase(Build.MANUFACTURER) && "bullhead".equalsIgnoreCase(Build.DEVICE) && !z) {
            matrix.postScale(-1.0f, -1.0f);
        }
        matrix.postRotate(i);
        float f = i2;
        float f2 = i3;
        matrix.postScale(f / 2000.0f, f2 / 2000.0f);
        matrix.postTranslate(f / 2.0f, f2 / 2.0f);
        matrix.invert(this.d);
    }

    public final void f() {
        zd9 zd9Var;
        if (this.d == null || (zd9Var = this.o) == null) {
            return;
        }
        int i = this.a;
        if (i == 0) {
            if (this.i == null) {
                zd9Var.d();
                return;
            } else {
                zd9Var.g();
                return;
            }
        }
        if (i == 1 || i == 2) {
            zd9Var.g();
            return;
        }
        if ("continuous-picture".equals(this.k)) {
            zd9 zd9Var2 = this.o;
            zd9Var2.b.postDelayed(zd9Var2.j, 1000L);
            return;
        }
        int i2 = this.a;
        if (i2 == 3) {
            zd9 zd9Var3 = this.o;
            zd9Var3.b.postDelayed(zd9Var3.j, 1000L);
        } else if (i2 == 4) {
            zd9 zd9Var4 = this.o;
            zd9Var4.b.postDelayed(zd9Var4.j, 1000L);
        }
    }
}
