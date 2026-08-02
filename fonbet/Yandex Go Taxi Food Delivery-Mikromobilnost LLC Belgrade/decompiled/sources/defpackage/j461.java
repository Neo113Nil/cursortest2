package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ybsdk.feature.qr.payments.internal.screens.list.presentation.view.SelectorView;

/* loaded from: classes3.dex */
public final class j461 implements zo31 {
    public final SelectorView a;
    public final ImageView b;
    public final TextView c;

    public j461(SelectorView selectorView, ImageView imageView, TextView textView) {
        this.a = selectorView;
        this.b = imageView;
        this.c = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
