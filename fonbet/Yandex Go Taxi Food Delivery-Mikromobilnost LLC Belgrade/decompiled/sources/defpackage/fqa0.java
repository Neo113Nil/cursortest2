package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import com.yandex.payment.sdk.ui.view.HeaderView;

/* loaded from: classes2.dex */
public final class fqa0 implements zo31 {
    public final HeaderView a;
    public final TextView b;
    public final ImageView c;
    public final Space d;
    public final ImageView e;
    public final ImageView f;
    public final TextView g;

    public fqa0(HeaderView headerView, TextView textView, ImageView imageView, Space space, ImageView imageView2, ImageView imageView3, TextView textView2) {
        this.a = headerView;
        this.b = textView;
        this.c = imageView;
        this.d = space;
        this.e = imageView2;
        this.f = imageView3;
        this.g = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
