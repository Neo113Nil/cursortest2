package xsna;

import android.graphics.Matrix;
import android.graphics.Rect;
import xsna.f5h0;

/* compiled from: VideoFlatActionViewHolder.kt */
/* loaded from: classes16.dex */
public final class qls0 extends f5h0.b {
    @Override // xsna.f5h0.b
    public final void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        matrix.setScale(f4, f4);
        matrix.postTranslate((rect.width() - (i * f4)) + rect.left + 0.5f, (rect.height() - (i2 * f4)) + rect.top + 0.5f);
    }
}
