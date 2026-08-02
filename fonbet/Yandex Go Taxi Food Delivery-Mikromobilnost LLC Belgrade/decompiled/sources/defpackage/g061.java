package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes4.dex */
public final class g061 implements zo31 {
    public final LinearLayout a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final ImageView e;

    public g061(LinearLayout linearLayout, ImageView imageView, TextView textView, TextView textView2, ImageView imageView2) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
        this.e = imageView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
