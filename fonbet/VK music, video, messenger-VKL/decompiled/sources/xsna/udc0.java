package xsna;

import android.graphics.Bitmap;
import com.vk.newsfeed.posting.impl.domain.model.RelativeImageCropArea;

/* compiled from: PostingCropPostProcessor.kt */
/* loaded from: classes4.dex */
public final class udc0 extends mk6 {
    public final RelativeImageCropArea c;
    public final bik d;

    public udc0(RelativeImageCropArea relativeImageCropArea) {
        this.c = relativeImageCropArea;
        bik bikVar = new bik();
        bikVar.g(relativeImageCropArea.b, relativeImageCropArea.d, relativeImageCropArea.c, relativeImageCropArea.e);
        this.d = bikVar;
    }

    @Override // xsna.mk6, xsna.ktc0
    public final ww8 a() {
        return this.d.a();
    }

    @Override // xsna.mk6, xsna.ktc0
    public final uvf<Bitmap> b(Bitmap bitmap, hta0 hta0Var) {
        float width = bitmap.getWidth();
        RelativeImageCropArea relativeImageCropArea = this.c;
        int b = an10.b(width * relativeImageCropArea.f);
        int width2 = bitmap.getWidth();
        if (b > width2) {
            b = width2;
        }
        int b2 = an10.b(bitmap.getHeight() * relativeImageCropArea.g);
        int height = bitmap.getHeight();
        if (b2 > height) {
            b2 = height;
        }
        bik bikVar = this.d;
        bikVar.f(b, b2);
        return bikVar.b(bitmap, hta0Var);
    }

    public final String toString() {
        return this.d.toString();
    }
}
