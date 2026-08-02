package defpackage;

import android.view.View;
import android.view.animation.PathInterpolator;

/* loaded from: classes10.dex */
public abstract class buf0 {
    public final int a;
    public final auf0 b;
    public u1w c;
    public u1w d;
    public cuf0 e;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public buf0(int i) {
        auf0 auf0Var = new auf0();
        auf0Var.a = -1;
        auf0Var.b = -1;
        u1w u1wVar = u1w.e;
        auf0Var.c = u1wVar;
        auf0Var.d = false;
        auf0Var.e = null;
        auf0Var.f = 0.0f;
        auf0Var.g = 0.0f;
        auf0Var.h = 1.0f;
        this.b = auf0Var;
        this.c = u1wVar;
        this.d = u1wVar;
        this.e = null;
        if (i == 1 || i == 2 || i == 4 || i == 8) {
            this.a = i;
        } else {
            ny61.g(oyr.i(i, "Unexpected side: "));
            throw null;
        }
    }

    public final void a(float f) {
        float f2 = f * 1.0f;
        auf0 auf0Var = this.b;
        if (auf0Var.h != f2) {
            auf0Var.h = f2;
            y4a0 y4a0Var = auf0Var.i;
            if (y4a0Var != null) {
                ((View) y4a0Var.c).setAlpha(f2);
            }
        }
    }

    public final void b(float f) {
        float f2 = f * 1.0f;
        auf0 auf0Var = this.b;
        int i = this.a;
        if (i == 1) {
            float f3 = (-(1.0f - f2)) * auf0Var.a;
            if (auf0Var.f != f3) {
                auf0Var.f = f3;
                y4a0 y4a0Var = auf0Var.i;
                if (y4a0Var != null) {
                    ((View) y4a0Var.c).setTranslationX(f3);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 2) {
            float f4 = (-(1.0f - f2)) * auf0Var.b;
            if (auf0Var.g != f4) {
                auf0Var.g = f4;
                y4a0 y4a0Var2 = auf0Var.i;
                if (y4a0Var2 != null) {
                    ((View) y4a0Var2.c).setTranslationY(f4);
                    return;
                }
                return;
            }
            return;
        }
        if (i == 4) {
            float f5 = (1.0f - f2) * auf0Var.a;
            if (auf0Var.f != f5) {
                auf0Var.f = f5;
                y4a0 y4a0Var3 = auf0Var.i;
                if (y4a0Var3 != null) {
                    ((View) y4a0Var3.c).setTranslationX(f5);
                    return;
                }
                return;
            }
            return;
        }
        if (i != 8) {
            return;
        }
        float f6 = (1.0f - f2) * auf0Var.b;
        if (auf0Var.g != f6) {
            auf0Var.g = f6;
            y4a0 y4a0Var4 = auf0Var.i;
            if (y4a0Var4 != null) {
                ((View) y4a0Var4.c).setTranslationY(f6);
            }
        }
    }
}
