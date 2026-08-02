package xsna;

import android.graphics.Rect;

/* compiled from: ShadowOverlayDrawable.kt */
/* loaded from: classes4.dex */
public final class c5j0 extends ieh0 {
    public final float h;

    public c5j0(float f) {
        this.h = f;
        this.d.setAlpha(swe0.g((int) ((255 * 0.5f) + 0.5f), 0, 255));
    }

    @Override // xsna.ieh0, android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        rect.top = rect.bottom - ((int) (((r0 - rect.top) * this.h) + 0.5f));
        super.onBoundsChange(rect);
    }

    @Override // xsna.ieh0, android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }
}
