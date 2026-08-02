package xsna;

import android.content.Context;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public final class a8z0 extends LinearLayout {
    public final ArrayList b;
    public final ujz0 c;

    public a8z0(Context context) {
        super(context);
        this.c = new ujz0(context);
        setOrientation(0);
        this.b = new ArrayList();
    }

    public final void a(int i, float f) {
        ((paz0) this.b.get(i)).setMaxTime(f);
    }

    public void setCountBars(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            vbz0 vbz0Var = new vbz0(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.weight = 1.0f;
            if (i > 1 && i2 != i - 1) {
                layoutParams.setMarginEnd(this.c.a.get(ujz0.g));
            }
            vbz0Var.setLayoutParams(layoutParams);
            this.b.add(vbz0Var);
            addView(vbz0Var);
        }
    }
}
