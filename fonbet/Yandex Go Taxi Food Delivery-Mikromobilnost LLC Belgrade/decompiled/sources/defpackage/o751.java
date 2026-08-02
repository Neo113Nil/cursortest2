package defpackage;

import android.view.View;
import android.view.Window;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;

/* loaded from: classes10.dex */
public final class o751 extends bvf0 {
    public final Window j;
    public final va90 k;

    public o751(Window window, va90 va90Var) {
        this.j = window;
        this.k = va90Var;
    }

    @Override // defpackage.bvf0
    public final void B(int i) {
        for (int i2 = 1; i2 <= 512; i2 <<= 1) {
            if ((i & i2) != 0) {
                if (i2 == 1) {
                    g0(4);
                } else if (i2 == 2) {
                    g0(2);
                } else if (i2 == 8) {
                    ((ez2) this.k.a).c();
                }
            }
        }
    }

    @Override // defpackage.bvf0
    public final boolean E() {
        return (this.j.getDecorView().getSystemUiVisibility() & 16) != 0;
    }

    @Override // defpackage.bvf0
    public final boolean F() {
        return (this.j.getDecorView().getSystemUiVisibility() & 8192) != 0;
    }

    @Override // defpackage.bvf0
    public final void T(boolean z) {
        if (!z) {
            h0(16);
            return;
        }
        Window window = this.j;
        window.clearFlags(SelfTester_JCP.DECRYPT_CNT);
        window.addFlags(Integer.MIN_VALUE);
        g0(16);
    }

    @Override // defpackage.bvf0
    public final void U(boolean z) {
        if (!z) {
            h0(8192);
            return;
        }
        Window window = this.j;
        window.clearFlags(SelfTester_JCP.DECRYPT_CBC);
        window.addFlags(Integer.MIN_VALUE);
        g0(8192);
    }

    @Override // defpackage.bvf0
    public final void V() {
        this.j.getDecorView().setTag(356039078, 2);
        h0(2048);
        g0(4096);
    }

    @Override // defpackage.bvf0
    public final void W() {
        for (int i = 1; i <= 512; i <<= 1) {
            if ((8 & i) != 0) {
                if (i == 1) {
                    h0(4);
                    this.j.clearFlags(1024);
                } else if (i == 2) {
                    h0(2);
                } else if (i == 8) {
                    ((ez2) this.k.a).d();
                }
            }
        }
    }

    public final void g0(int i) {
        View decorView = this.j.getDecorView();
        decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
    }

    public final void h0(int i) {
        View decorView = this.j.getDecorView();
        decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
    }
}
