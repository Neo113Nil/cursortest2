package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: RoundRectOutlineProvider.kt */
/* loaded from: classes8.dex */
public final class eog0 extends ViewOutlineProvider {
    public final float a;

    public eog0(float f) {
        this.a = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        if (width == 0) {
            width = view.getMeasuredWidth();
        }
        int i = width;
        int height = view.getHeight();
        if (height == 0) {
            height = view.getMeasuredHeight();
        }
        outline.setRoundRect(0, 0, i, height, this.a);
    }
}
