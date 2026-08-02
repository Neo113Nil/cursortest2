package xsna;

import android.graphics.Bitmap;
import android.graphics.RectF;
import xsna.m4g0;

/* compiled from: ReplySticker.kt */
/* loaded from: classes15.dex */
public interface l4g0 extends blj {
    void f(Bitmap bitmap);

    @Override // xsna.blj, xsna.nov
    default float getMaxScaleLimit() {
        return 1.5f;
    }

    @Override // xsna.blj, xsna.nov
    default float getMinScaleLimit() {
        return 0.25f;
    }

    void setLoadingVisible(boolean z);

    @Override // xsna.nov
    default void x0(RectF rectF, float f, float f2) {
        m4g0.a aVar = m4g0.a;
        aVar.getClass();
        int i = m4g0.a.c;
        aVar.getClass();
        aVar.getClass();
        aVar.getClass();
        rectF.set(i, i, f - i, f2 - m4g0.a.d);
    }
}
