package xsna;

import android.R;
import android.graphics.drawable.ColorDrawable;
import android.view.View;

/* compiled from: LinkPressReactDrawable.kt */
/* loaded from: classes.dex */
public final class gaz extends ColorDrawable {
    public final View a;

    public gaz(View view) {
        super(0);
        this.a = view;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public final boolean onStateChange(int[] iArr) {
        float r;
        boolean E = rl3.E(R.attr.state_pressed, iArr);
        View view = this.a;
        if (E) {
            view.getContext();
            r = 0.7f;
        } else {
            r = his0.r(view.isEnabled());
        }
        view.setAlpha(r);
        return true;
    }
}
