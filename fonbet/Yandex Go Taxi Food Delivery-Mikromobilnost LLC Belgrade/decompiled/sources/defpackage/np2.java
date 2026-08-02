package defpackage;

import android.view.View;

/* loaded from: classes12.dex */
public final class np2 extends r8 {
    public final float c;

    public np2(float f, View view) {
        super(1, view);
        this.c = f;
    }

    public final void Hg(float f) {
        ((View) this.b).setAlpha(y6i0.c(f / this.c, 0.0f, 1.0f));
    }
}
