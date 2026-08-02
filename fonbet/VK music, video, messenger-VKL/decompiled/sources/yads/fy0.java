package yads;

import android.view.View;
import android.view.Window;
import android.widget.RelativeLayout;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.bqx0;
import xsna.h4x;
import xsna.iut0;
import xsna.ppx0;
import xsna.pwy0;
import xsna.qwy0;

/* loaded from: classes10.dex */
public final class fy0 {
    public final e00 a;

    public fy0(e00 e00Var) {
        this.a = e00Var;
    }

    public static void b(RelativeLayout relativeLayout) {
        qwy0 qwy0Var = new qwy0();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(relativeLayout, qwy0Var);
    }

    public final void a(Window window, RelativeLayout relativeLayout) {
        ppx0.b(window, false);
        if (ub.a(30)) {
            window.getAttributes().layoutInDisplayCutoutMode = 3;
        } else if (ub.a(28)) {
            window.getAttributes().layoutInDisplayCutoutMode = 1;
        }
        if (this.a == e00.i) {
            b(relativeLayout);
        } else {
            a(relativeLayout);
        }
    }

    public static final bqx0 b(View view, bqx0 bqx0Var) {
        return bqx0.b;
    }

    public static void a(RelativeLayout relativeLayout) {
        pwy0 pwy0Var = new pwy0();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(relativeLayout, pwy0Var);
    }

    public static final bqx0 a(View view, bqx0 bqx0Var) {
        h4x i = bqx0Var.a.i(647);
        view.setPadding(i.a, i.b, i.c, i.d);
        return bqx0.b;
    }
}
