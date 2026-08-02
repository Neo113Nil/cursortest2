package yads;

import android.view.View;
import android.view.ViewGroup;
import java.util.WeakHashMap;
import xsna.b0u0;
import xsna.bqx0;
import xsna.iut0;
import xsna.yez0;

/* loaded from: classes10.dex */
public abstract class uc {
    public static void a(ViewGroup viewGroup) {
        yez0 yez0Var = new yez0();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        iut0.d.c(viewGroup, yez0Var);
    }

    public static final bqx0 a(View view, bqx0 bqx0Var) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), bqx0Var.a.i(647).d);
        return bqx0.b;
    }
}
