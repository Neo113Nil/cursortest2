package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;

/* loaded from: classes4.dex */
public final class j361 implements zo31 {
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final ImageView c;
    public final TextView d;

    public j361(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, ImageView imageView, TextView textView) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = imageView;
        this.d = textView;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
