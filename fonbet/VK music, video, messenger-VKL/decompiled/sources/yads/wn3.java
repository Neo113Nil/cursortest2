package yads;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import xsna.anj;

/* loaded from: classes10.dex */
public final class wn3 {
    public final yy1 a;

    public wn3(yy1 yy1Var) {
        this.a = yy1Var;
    }

    public final void a(View view, boolean z) {
        int i;
        int i2 = z ? this.a.a : this.a.b;
        if (z) {
            i = this.a.c;
        } else {
            if (z) {
                throw new NoWhenBranchMatchedException();
            }
            i = this.a.d;
        }
        view.setBackground(view.getContext().getDrawable(i2));
        view.setContentDescription(anj.c(i, view.getContext()));
    }
}
