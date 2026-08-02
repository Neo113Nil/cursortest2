package xsna;

import android.graphics.Canvas;
import android.view.ViewGroup;

/* compiled from: ViewLayerContainer.android.kt */
/* loaded from: classes11.dex */
public class pho extends ViewGroup {
    public boolean b;

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        int childCount = super.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((jyt0) getChildAt(i)).d) {
                this.b = true;
                try {
                    super.dispatchDraw(canvas);
                    return;
                } finally {
                    this.b = false;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public int getChildCount() {
        if (this.b) {
            return super.getChildCount();
        }
        return 0;
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
