package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes6.dex */
public final class j261 implements zo31 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final AppCompatImageView c;
    public final TextView d;

    public j261(ConstraintLayout constraintLayout, ImageView imageView, AppCompatImageView appCompatImageView, TextView textView) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = appCompatImageView;
        this.d = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
