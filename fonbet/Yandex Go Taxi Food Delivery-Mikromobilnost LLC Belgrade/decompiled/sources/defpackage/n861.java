package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.core.design.spoiler.SpoilerTextView;
import com.ybsdk.widgets.common.SelectedItemFormView;

/* loaded from: classes4.dex */
public final class n861 implements zo31 {
    public final SelectedItemFormView a;
    public final ImageView b;
    public final TextView c;
    public final ImageView d;
    public final SpoilerTextView e;
    public final TextView f;

    public n861(SelectedItemFormView selectedItemFormView, ImageView imageView, TextView textView, ImageView imageView2, SpoilerTextView spoilerTextView, TextView textView2) {
        this.a = selectedItemFormView;
        this.b = imageView;
        this.c = textView;
        this.d = imageView2;
        this.e = spoilerTextView;
        this.f = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
