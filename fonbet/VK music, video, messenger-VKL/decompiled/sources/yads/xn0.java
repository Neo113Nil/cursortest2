package yads;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import java.util.List;
import xsna.ao90;
import xsna.e4t;
import xsna.hl30;
import xsna.rft0;
import xsna.viz0;
import xsna.vvi0;
import xsna.xhb0;

/* loaded from: classes10.dex */
public final class xn0 implements hk3, dl, d73, yt1, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, l33, xk, rk, e53, rn0 {
    public final /* synthetic */ ao0 a;

    public xn0(ao0 ao0Var) {
        this.a = ao0Var;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.a(surfaceTexture);
        this.a.a(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.a.a((Surface) null);
        this.a.a(0, 0);
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        this.a.a(i, i2);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.a.a(i2, i3);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        ao0 ao0Var = this.a;
        if (ao0Var.M) {
            ao0Var.a(surfaceHolder.getSurface());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        ao0 ao0Var = this.a;
        if (ao0Var.M) {
            ao0Var.a((Surface) null);
        }
        this.a.a(0, 0);
    }

    public final /* synthetic */ void a(nf2 nf2Var) {
        nf2Var.a(this.a.G);
    }

    public final void a(List list) {
        qg1 qg1Var = this.a.j;
        qg1Var.a(27, new e4t(list, 24));
        qg1Var.a();
    }

    public final void a(q20 q20Var) {
        this.a.getClass();
        qg1 qg1Var = this.a.j;
        qg1Var.a(27, new viz0(q20Var));
        qg1Var.a();
    }

    public final void a(ut1 ut1Var) {
        ao0 ao0Var = this.a;
        kn1 kn1Var = ao0Var.Y;
        kn1Var.getClass();
        jn1 jn1Var = new jn1(kn1Var);
        int i = 0;
        while (true) {
            tt1[] tt1VarArr = ut1Var.b;
            if (i >= tt1VarArr.length) {
                break;
            }
            tt1VarArr[i].a(jn1Var);
            i++;
        }
        ao0Var.Y = new kn1(jn1Var);
        kn1 a = this.a.a();
        if (!a.equals(this.a.G)) {
            ao0 ao0Var2 = this.a;
            ao0Var2.G = a;
            ao0Var2.j.a(14, new hl30(this, 28));
        }
        this.a.j.a(28, new xhb0(ut1Var, 24));
        this.a.j.a();
    }

    public final void a(Object obj, long j) {
        ((kb0) this.a.o).a(obj, j);
        ao0 ao0Var = this.a;
        if (ao0Var.I == obj) {
            qg1 qg1Var = ao0Var.j;
            qg1Var.a(26, new rft0(3));
            qg1Var.a();
        }
    }

    public final void a(final boolean z) {
        ao0 ao0Var = this.a;
        if (ao0Var.U == z) {
            return;
        }
        ao0Var.U = z;
        qg1 qg1Var = ao0Var.j;
        qg1Var.a(23, new ng1() { // from class: xsna.xiz0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                ((yads.nf2) obj).onSkipSilenceEnabledChanged(z);
            }
        });
        qg1Var.a();
    }

    public final void a() {
        ig0 a = ao0.a(this.a.w);
        if (a.equals(this.a.X)) {
            return;
        }
        ao0 ao0Var = this.a;
        ao0Var.X = a;
        qg1 qg1Var = ao0Var.j;
        qg1Var.a(29, new vvi0(a, 14));
        qg1Var.a();
    }

    public final void a(final boolean z, final int i) {
        qg1 qg1Var = this.a.j;
        qg1Var.a(30, new ng1() { // from class: xsna.wiz0
            @Override // yads.ng1
            public final void invoke(Object obj) {
                ((yads.nf2) obj).a(z, i);
            }
        });
        qg1Var.a();
    }

    public final void a(sk3 sk3Var) {
        this.a.getClass();
        qg1 qg1Var = this.a.j;
        qg1Var.a(25, new ao90(sk3Var, 16));
        qg1Var.a();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
