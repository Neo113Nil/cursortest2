package xsna;

import android.graphics.Matrix;
import android.graphics.RectF;
import com.vk.core.util.measure.ScaleType;
import com.vk.dto.photo.ImageCropData;
import com.vk.feed.tool.view.newsfeed.image.FixedSizeVKEnhancedImageView;

/* compiled from: CropFeedDelegate.kt */
/* loaded from: classes4.dex */
public final class chk {
    public final FixedSizeVKEnhancedImageView a;
    public ImageCropData e;
    public float f;
    public float g;
    public final Matrix b = new Matrix();
    public final Matrix c = new Matrix();
    public final RectF d = new RectF();
    public Float h = Float.valueOf(1.0f);

    public chk(FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView) {
        this.a = fixedSizeVKEnhancedImageView;
        bwt0.h(fixedSizeVKEnhancedImageView, new xqf(this, 11));
    }

    public final Matrix a(RectF rectF) {
        ImageCropData imageCropData = this.e;
        Matrix matrix = this.c;
        if (imageCropData != null) {
            RectF rectF2 = this.d;
            double c = imageCropData.c();
            double c2 = ((this.f / 2.0f) - ((imageCropData.c() / 2.0f) + imageCropData.d())) / ((this.f / rectF.width()) * (rectF2.width() / rectF.width()));
            double a = ((this.g / 2.0f) - ((imageCropData.a() / 2.0f) + imageCropData.e())) / ((this.g / rectF.height()) * (rectF2.height() / rectF.height()));
            double d = this.f / c;
            double a2 = this.g / imageCropData.a();
            if (Math.abs(c2) <= Double.MAX_VALUE && Math.abs(a) <= Double.MAX_VALUE && Math.abs(a2) <= Double.MAX_VALUE && Math.abs(d) <= Double.MAX_VALUE) {
                matrix.reset();
                matrix.postTranslate((float) c2, (float) a);
                matrix.postScale((float) d, (float) a2, rectF.centerX(), rectF.centerY());
            }
        }
        return matrix;
    }

    public final boolean b() {
        ImageCropData imageCropData = this.e;
        boolean z = false;
        if (imageCropData == null) {
            return false;
        }
        int b = an10.b(this.f);
        int b2 = an10.b(this.g);
        if (imageCropData.d() == 0 && imageCropData.e() == 0 && imageCropData.c() == b && imageCropData.a() == b2) {
            z = true;
        }
        return !z;
    }

    public final void c(ImageCropData imageCropData, int i, int i2, Float f) {
        this.e = imageCropData;
        this.h = f;
        this.g = i2;
        this.f = i;
        boolean b = b();
        FixedSizeVKEnhancedImageView fixedSizeVKEnhancedImageView = this.a;
        fixedSizeVKEnhancedImageView.setHasCrop(b);
        if (b()) {
            fixedSizeVKEnhancedImageView.setScaleType(ScaleType.FIT_CENTER);
            fixedSizeVKEnhancedImageView.setWithImageDownscale(false);
        } else {
            fixedSizeVKEnhancedImageView.setScaleType(ScaleType.CENTER_CROP);
            fixedSizeVKEnhancedImageView.setWithImageDownscale(true);
        }
    }
}
