package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;

/* compiled from: CadreOutlineProvider.kt */
/* loaded from: classes16.dex */
public final class hz8 extends ViewOutlineProvider {
    public final boolean a;
    public final boolean b;

    public hz8(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        int i;
        boolean s = iah0.s(view.getContext());
        int i2 = 0;
        if (this.a) {
            i = 0;
        } else {
            int i3 = iz8.j;
            i = -iz8.j;
        }
        if (!this.b) {
            int i4 = iz8.j;
            i2 = iz8.j;
        }
        if (!s) {
            int width = view.getWidth() + i2;
            int height = view.getHeight();
            int i5 = iz8.j;
            outline.setRoundRect(i, 0, width, height, (1 / view.getScaleX()) * iz8.j);
            return;
        }
        int width2 = view.getWidth();
        int height2 = view.getHeight() + i2;
        int i6 = iz8.j;
        outline.setRoundRect(0, i, width2, height2, (1 / view.getScaleX()) * iz8.j);
    }
}
