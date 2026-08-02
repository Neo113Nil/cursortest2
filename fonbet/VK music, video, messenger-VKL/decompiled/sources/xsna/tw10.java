package xsna;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* compiled from: MediaRouteControllerDialog.java */
/* loaded from: classes12.dex */
public final class tw10 extends Animation {
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;

    public tw10(int i, int i2, View view) {
        this.b = i;
        this.c = i2;
        this.d = view;
    }

    @Override // android.view.animation.Animation
    public final void applyTransformation(float f, Transformation transformation) {
        int i = this.c;
        androidx.mediarouter.app.b.w(this.b - ((int) ((r0 - i) * f)), this.d);
    }
}
