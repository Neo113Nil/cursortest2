package xsna;

import android.graphics.Matrix;
import android.graphics.Rect;
import xsna.f5h0;

/* compiled from: CommunityStaticCover.kt */
/* loaded from: classes17.dex */
public final class w48 extends f5h0.b {
    public int a;

    public w48() {
        this(0);
    }

    @Override // xsna.f5h0.b
    public final void b(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float f5;
        float height;
        float f6 = i;
        float width = rect.width() / f6;
        float f7 = i2;
        float f8 = this.a / f7;
        if (f8 > width) {
            f5 = ((rect.width() - (f6 * f8)) * 0.5f) + rect.left;
            height = (rect.height() - (f7 * f8)) + rect.top;
            width = f8;
        } else {
            f5 = rect.left;
            height = (rect.height() - (f7 * width)) + rect.top;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (height + 0.5f));
    }

    public w48(int i) {
        this.a = 0;
    }
}
