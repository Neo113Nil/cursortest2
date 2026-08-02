package defpackage;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.graphics.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* loaded from: classes11.dex */
public abstract class gza1 {
    public static u92 a;
    public static s72 b;
    public static k28 c;

    public static final void a(final boolean z, final long j, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(60626988);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.d(j) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i3 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
        } else {
            final View view = (View) btsVar.m(AndroidCompositionLocals_androidKt.f);
            if (!view.isInEditMode()) {
                btsVar.e0(-1224400529);
                boolean e = ((i3 & 112) == 32) | btsVar.e(view) | ((i3 & 896) == 256) | ((i3 & 14) == 4);
                Object Q = btsVar.Q();
                if (e || Q == did.a) {
                    Q = new sls() { // from class: q23
                        @Override // defpackage.sls
                        public final Object invoke() {
                            View view2 = view;
                            Window window = ((Activity) view2.getContext()).getWindow();
                            window.setStatusBarColor(rzo.X(j));
                            va90 va90Var = new va90(view2);
                            int i4 = Build.VERSION.SDK_INT;
                            (i4 >= 35 ? new q751(window, va90Var) : i4 >= 30 ? new p751(window, va90Var) : new o751(window, va90Var)).U(!z);
                            return zy11.a;
                        }
                    };
                    btsVar.o0(Q);
                }
                btsVar.t(false);
                zpn.i((sls) Q, btsVar);
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r23(i, 0, j, z);
        }
    }

    public static final f530 b(f530 f530Var, float f, float f2) {
        return (f == 1.0f && f2 == 1.0f) ? f530Var : d.c(f530Var, f, f2, 0.0f, 0.0f, 0.0f, 0.0f, null, 524284);
    }

    public static int c(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }
}
