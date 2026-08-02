package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public final class cb61 implements zo31 {
    public final LinearLayout a;
    public final AppCompatTextView b;
    public final TextView c;

    public cb61(LinearLayout linearLayout, AppCompatTextView appCompatTextView, TextView textView) {
        this.a = linearLayout;
        this.b = appCompatTextView;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
