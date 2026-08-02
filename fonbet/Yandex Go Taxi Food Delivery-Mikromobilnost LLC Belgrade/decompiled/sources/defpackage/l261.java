package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes13.dex */
public final class l261 implements zo31 {
    public final ConstraintLayout a;
    public final TextView b;
    public final SwitchCompat c;

    public l261(ConstraintLayout constraintLayout, TextView textView, SwitchCompat switchCompat) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = switchCompat;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
