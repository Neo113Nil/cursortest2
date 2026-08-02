package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;

/* loaded from: classes4.dex */
public final class fb61 implements zo31 {
    public final LinearLayout a;
    public final SwitchCompat b;
    public final TextView c;

    public fb61(LinearLayout linearLayout, SwitchCompat switchCompat, TextView textView) {
        this.a = linearLayout;
        this.b = switchCompat;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
