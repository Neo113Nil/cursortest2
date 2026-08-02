package xsna;

import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: AdvancedClipEditorSwapItemHolder.kt */
/* loaded from: classes18.dex */
public final class y21 extends GestureDetector.SimpleOnGestureListener {
    public final /* synthetic */ z21 b;

    public y21(z21 z21Var) {
        this.b = z21Var;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.b.itemView.performClick();
        return true;
    }
}
