package defpackage;

import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes2.dex */
public final class mpa0 implements zo31 {
    public final LinearLayout a;
    public final LinearLayout b;
    public final LinearLayout c;

    public mpa0(LinearLayout linearLayout, LinearLayout linearLayout2, LinearLayout linearLayout3) {
        this.a = linearLayout;
        this.b = linearLayout2;
        this.c = linearLayout3;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
