package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes13.dex */
public final class n650 implements zo31 {
    public final LinearLayout a;
    public final TextView b;
    public final ImageView c;
    public final TextView d;

    public n650(LinearLayout linearLayout, TextView textView, ImageView imageView, TextView textView2) {
        this.a = linearLayout;
        this.b = textView;
        this.c = imageView;
        this.d = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
