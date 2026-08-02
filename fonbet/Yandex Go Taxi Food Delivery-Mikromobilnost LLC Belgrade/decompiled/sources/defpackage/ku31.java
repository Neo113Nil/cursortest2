package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes6.dex */
public final class ku31 {
    public final View a;
    public ValueAnimator b;
    public boolean c;

    public ku31(View view) {
        this.a = view;
    }

    public final void a() {
        b();
        this.c = true;
        this.a.post(new bh11(25, this));
    }

    public final void b() {
        if (this.c || this.b != null) {
            this.c = false;
            ValueAnimator valueAnimator = this.b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.b = null;
            View view = this.a;
            view.animate().scaleY(1.0f);
            view.animate().scaleX(1.0f);
        }
    }
}
