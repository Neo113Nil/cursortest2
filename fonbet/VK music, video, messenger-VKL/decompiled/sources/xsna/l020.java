package xsna;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: MediaView.kt */
/* loaded from: classes4.dex */
public abstract class l020 extends FrameLayout {

    /* compiled from: MediaView.kt */
    public static final class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }
    }

    public abstract a a(int i, int i2);

    public abstract float getAspectRatio();

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        a a2 = a(i, i2);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(a2.a, 1073741824), View.MeasureSpec.makeMeasureSpec(a2.b, 1073741824));
    }
}
