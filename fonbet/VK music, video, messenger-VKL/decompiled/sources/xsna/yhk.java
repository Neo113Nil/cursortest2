package xsna;

import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: CropOverlayLayout.kt */
/* loaded from: classes4.dex */
public final class yhk extends FrameLayout {
    public boolean b;
    public final hfk c;
    public final Matrix d;

    public yhk(Context context) {
        super(context, null, 0);
        hfk hfkVar = new hfk(context);
        this.c = hfkVar;
        this.d = new Matrix();
        addView(hfkVar);
        setClipToPadding(false);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return false;
        }
        Matrix matrix = this.d;
        matrix.reset();
        hfk hfkVar = this.c;
        hfkVar.getMatrix().invert(matrix);
        motionEvent.transform(matrix);
        return hfkVar.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!this.b) {
            return false;
        }
        Matrix matrix = this.d;
        matrix.reset();
        hfk hfkVar = this.c;
        hfkVar.getMatrix().invert(matrix);
        motionEvent.transform(matrix);
        return hfkVar.dispatchTouchEvent(motionEvent);
    }

    public final hfk getOverlay$android_release() {
        return this.c;
    }

    public final void setTouchesEnabled$android_release(boolean z) {
        this.b = z;
    }
}
