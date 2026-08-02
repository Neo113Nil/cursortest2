package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.go.design.view.GoLinearLayout;

/* loaded from: classes12.dex */
public final class bzm implements zo31 {
    public final GoLinearLayout a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public bzm(GoLinearLayout goLinearLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.a = goLinearLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
