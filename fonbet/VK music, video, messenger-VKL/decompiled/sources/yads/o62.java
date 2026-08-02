package yads;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes10.dex */
public final class o62 extends FrameLayout {
    public final vo2 a;
    public final hm1 b;

    /* JADX WARN: Multi-variable type inference failed */
    public o62(Context context, vo2 vo2Var, hm1 hm1Var) {
        super(context);
        this.a = vo2Var;
        this.b = hm1Var;
        addView(vo2Var);
        if (hm1Var == 0 || !(hm1Var instanceof View)) {
            return;
        }
        addView((View) hm1Var);
    }
}
