package defpackage;

import androidx.media3.common.a;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.text.TextRenderer;

/* loaded from: classes10.dex */
public final class myi0 {
    public final fyi0 a;
    public final int b;
    public final fyi0 c;
    public int d = 0;
    public boolean e = false;
    public boolean f = false;

    public myi0(fyi0 fyi0Var, fyi0 fyi0Var2, int i) {
        this.a = fyi0Var;
        this.b = i;
        this.c = fyi0Var2;
    }

    public static boolean g(fyi0 fyi0Var) {
        return fyi0Var.getState() != 0;
    }

    public static void l(fyi0 fyi0Var, long j) {
        fyi0Var.setCurrentStreamFinal();
        if (fyi0Var instanceof TextRenderer) {
            ((TextRenderer) fyi0Var).setFinalStreamEndPositionUs(j);
        }
    }

    public final void a(fyi0 fyi0Var, neh nehVar) {
        d6z.x(this.a == fyi0Var || this.c == fyi0Var);
        if (g(fyi0Var)) {
            if (fyi0Var == nehVar.c) {
                nehVar.w = null;
                nehVar.c = null;
                nehVar.x = true;
            }
            if (fyi0Var.getState() == 2) {
                fyi0Var.stop();
            }
            fyi0Var.disable();
        }
    }

    public final int b() {
        boolean g = g(this.a);
        fyi0 fyi0Var = this.c;
        return (g ? 1 : 0) + ((fyi0Var == null || !g(fyi0Var)) ? 0 : 1);
    }

    public final fyi0 c(ye10 ye10Var) {
        if (ye10Var != null) {
            xyl0[] xyl0VarArr = ye10Var.c;
            int i = this.b;
            if (xyl0VarArr[i] != null) {
                fyi0 fyi0Var = this.a;
                if (fyi0Var.getStream() == xyl0VarArr[i]) {
                    return fyi0Var;
                }
                fyi0 fyi0Var2 = this.c;
                if (fyi0Var2 != null && fyi0Var2.getStream() == xyl0VarArr[i]) {
                    return fyi0Var2;
                }
            }
        }
        return null;
    }

    public final boolean d(ye10 ye10Var, fyi0 fyi0Var) {
        if (fyi0Var == null) {
            return true;
        }
        xyl0[] xyl0VarArr = ye10Var.c;
        int i = this.b;
        xyl0 xyl0Var = xyl0VarArr[i];
        if (fyi0Var.getStream() == null) {
            return true;
        }
        if (fyi0Var.getStream() == xyl0Var) {
            if (xyl0Var == null || fyi0Var.hasReadStreamToEnd()) {
                return true;
            }
            ye10 ye10Var2 = ye10Var.m;
            if (ye10Var.g.g && ye10Var2 != null && ye10Var2.e && ((fyi0Var instanceof TextRenderer) || (fyi0Var instanceof MetadataRenderer) || fyi0Var.getReadingPositionUs() >= ye10Var2.e())) {
                return true;
            }
        }
        ye10 ye10Var3 = ye10Var.m;
        return ye10Var3 != null && ye10Var3.c[i] == fyi0Var.getStream();
    }

    public final boolean e() {
        int i = this.d;
        return i == 2 || i == 4 || i == 3;
    }

    public final boolean f() {
        int i = this.d;
        if (i == 0 || i == 2 || i == 4) {
            return g(this.a);
        }
        fyi0 fyi0Var = this.c;
        fyi0Var.getClass();
        return fyi0Var.getState() != 0;
    }

    public final boolean h(int i) {
        int i2 = this.d;
        int i3 = this.b;
        return ((i2 == 2 || i2 == 4) && i == i3) || (i2 == 3 && i != i3);
    }

    public final void i(boolean z) {
        if (z) {
            if (this.e) {
                this.a.reset();
                this.e = false;
                return;
            }
            return;
        }
        if (this.f) {
            fyi0 fyi0Var = this.c;
            fyi0Var.getClass();
            fyi0Var.reset();
            this.f = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int j(fyi0 fyi0Var, ye10 ye10Var, y001 y001Var, neh nehVar) {
        fyi0 fyi0Var2;
        int i;
        if (fyi0Var == null || fyi0Var.getState() == 0 || (fyi0Var == (fyi0Var2 = this.a) && ((i = this.d) == 2 || i == 4))) {
            return 1;
        }
        if (fyi0Var == this.c && this.d == 3) {
            return 1;
        }
        xyl0 stream = fyi0Var.getStream();
        xyl0[] xyl0VarArr = ye10Var.c;
        int i2 = this.b;
        Object[] objArr = stream != xyl0VarArr[i2];
        boolean b = y001Var.b(i2);
        if (!b || objArr != false) {
            if (!fyi0Var.isCurrentStreamFinal()) {
                loo looVar = y001Var.c[i2];
                int length = looVar != null ? looVar.length() : 0;
                a[] aVarArr = new a[length];
                for (int i3 = 0; i3 < length; i3++) {
                    looVar.getClass();
                    aVarArr[i3] = looVar.getFormat(i3);
                }
                xyl0 xyl0Var = ye10Var.c[i2];
                xyl0Var.getClass();
                fyi0Var.replaceStream(aVarArr, xyl0Var, ye10Var.e(), ye10Var.p, ye10Var.g.a);
                return 3;
            }
            if (!fyi0Var.isEnded()) {
                return 0;
            }
            a(fyi0Var, nehVar);
            if (!b || e()) {
                i(fyi0Var == fyi0Var2);
                return 1;
            }
        }
        return 1;
    }

    public final void k() {
        if (!g(this.a)) {
            i(true);
        }
        fyi0 fyi0Var = this.c;
        if (fyi0Var == null || fyi0Var.getState() != 0) {
            return;
        }
        i(false);
    }

    public final void m() {
        fyi0 fyi0Var = this.a;
        if (fyi0Var.getState() == 1 && this.d != 4) {
            fyi0Var.start();
            return;
        }
        fyi0 fyi0Var2 = this.c;
        if (fyi0Var2 == null || fyi0Var2.getState() != 1 || this.d == 3) {
            return;
        }
        fyi0Var2.start();
    }
}
