package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.go.design.view.GoConstraintLayout;

/* loaded from: classes12.dex */
public final class dw31 implements zo31 {
    public final GoConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;

    public dw31(GoConstraintLayout goConstraintLayout, ImageView imageView, TextView textView, TextView textView2) {
        this.a = goConstraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
