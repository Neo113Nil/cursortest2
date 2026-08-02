package xsna;

import android.view.View;
import xsna.bbv0;

/* compiled from: FullscreenRemeasurer.kt */
/* loaded from: classes6.dex */
public final class czs {
    public static void a(View view) {
        ebv0 ebv0Var;
        View view2;
        bbv0.g.getClass();
        gbv0 gbv0Var = bbv0.a.f().d;
        int i = 0;
        if (gbv0Var != null && (ebv0Var = gbv0Var.a.get()) != null && (view2 = ebv0Var.E) != null) {
            i = view2.getHeight();
        }
        int i2 = view.getLayoutParams().height;
        int p = (iah0.p(view.getContext()) - fnj.a(view.getContext())) - i;
        if (i2 <= p) {
            return;
        }
        uwt0.a(p, view);
    }
}
