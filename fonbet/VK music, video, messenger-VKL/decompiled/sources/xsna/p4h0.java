package xsna;

import android.content.Context;
import android.view.ScaleGestureDetector;

/* compiled from: ScaleGestureDetector.kt */
/* loaded from: classes4.dex */
public final class p4h0 {
    public Object a;
    public final ScaleGestureDetector b;

    /* compiled from: ScaleGestureDetector.kt */
    public interface a {
        void onScale(float f, float f2, float f3);
    }

    public p4h0(Context context) {
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new n4h0(this));
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.b = scaleGestureDetector;
    }
}
