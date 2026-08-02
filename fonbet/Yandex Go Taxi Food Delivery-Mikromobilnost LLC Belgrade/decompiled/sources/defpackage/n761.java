package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class n761 implements zo31 {
    public final LinearLayout a;
    public final ImageView b;
    public final TextView c;

    public n761(LinearLayout linearLayout, ImageView imageView, TextView textView) {
        this.a = linearLayout;
        this.b = imageView;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
