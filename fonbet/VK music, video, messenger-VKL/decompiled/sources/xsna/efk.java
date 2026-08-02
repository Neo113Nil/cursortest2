package xsna;

import android.content.Context;
import android.graphics.Matrix;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* compiled from: CropContentLayout.kt */
/* loaded from: classes4.dex */
public final class efk extends FrameLayout {
    public final ffk b;

    public efk(Context context) {
        super(context, null, 0);
        ffk ffkVar = new ffk(context);
        this.b = ffkVar;
        setClipChildren(false);
        setClipToPadding(false);
        addView(ffkVar);
    }

    public final ffk getContent() {
        return this.b;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.b.i;
    }

    public final void setClippingEnabled(boolean z) {
        this.b.setClippingEnabled(z);
    }

    public final void setContentMatrix(Matrix matrix) {
        this.b.setContentMatrix$android_release(matrix);
    }

    public final void setCropArea(afk afkVar) {
        this.b.setCropArea(afkVar);
    }

    public final void setCropping(boolean z) {
        this.b.setCropping(z);
    }
}
