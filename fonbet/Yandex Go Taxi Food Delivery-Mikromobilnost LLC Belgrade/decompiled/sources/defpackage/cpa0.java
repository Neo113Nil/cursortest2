package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes2.dex */
public final class cpa0 implements zo31 {
    public final ConstraintLayout a;
    public final LinearLayout b;

    public cpa0(ConstraintLayout constraintLayout, LinearLayout linearLayout) {
        this.a = constraintLayout;
        this.b = linearLayout;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
