package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;

/* loaded from: classes3.dex */
public final class c061 implements zo31 {
    public final LinearLayout a;
    public final SpoilerTextView b;
    public final TextView c;

    public c061(LinearLayout linearLayout, SpoilerTextView spoilerTextView, TextView textView) {
        this.a = linearLayout;
        this.b = spoilerTextView;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
