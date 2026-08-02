package defpackage;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;

/* loaded from: classes.dex */
public class p751 extends bvf0 {
    public final WindowInsetsController j;
    public final va90 k;
    public final Window l;

    public p751(WindowInsetsController windowInsetsController, va90 va90Var) {
        new ycs0();
        this.j = windowInsetsController;
        this.k = va90Var;
    }

    @Override // defpackage.bvf0
    public final void B(int i) {
        if ((i & 8) != 0) {
            ((ez2) this.k.a).c();
        }
        this.j.hide(i & (-9));
    }

    @Override // defpackage.bvf0
    public boolean E() {
        int systemBarsAppearance;
        this.j.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.j.getSystemBarsAppearance();
        return (systemBarsAppearance & 16) != 0;
    }

    @Override // defpackage.bvf0
    public boolean F() {
        int systemBarsAppearance;
        this.j.setSystemBarsAppearance(0, 0);
        systemBarsAppearance = this.j.getSystemBarsAppearance();
        return (systemBarsAppearance & 8) != 0;
    }

    @Override // defpackage.bvf0
    public final void T(boolean z) {
        Window window = this.l;
        if (z) {
            if (window != null) {
                g0(16);
            }
            this.j.setSystemBarsAppearance(16, 16);
        } else {
            if (window != null) {
                h0(16);
            }
            this.j.setSystemBarsAppearance(0, 16);
        }
    }

    @Override // defpackage.bvf0
    public final void U(boolean z) {
        Window window = this.l;
        if (z) {
            if (window != null) {
                g0(8192);
            }
            this.j.setSystemBarsAppearance(8, 8);
        } else {
            if (window != null) {
                h0(8192);
            }
            this.j.setSystemBarsAppearance(0, 8);
        }
    }

    @Override // defpackage.bvf0
    public void V() {
        Window window = this.l;
        if (window == null) {
            this.j.setSystemBarsBehavior(2);
            return;
        }
        window.getDecorView().setTag(356039078, 2);
        h0(2048);
        g0(4096);
    }

    @Override // defpackage.bvf0
    public final void W() {
        ((ez2) this.k.a).d();
        this.j.show(0);
    }

    public final void g0(int i) {
        View decorView = this.l.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void h0(int i) {
        View decorView = this.l.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public p751(Window window, va90 va90Var) {
        this(r0, va90Var);
        WindowInsetsController insetsController;
        insetsController = window.getInsetsController();
        this.l = window;
    }
}
