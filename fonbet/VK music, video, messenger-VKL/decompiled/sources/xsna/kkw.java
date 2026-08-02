package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import xsna.l020;

/* compiled from: ImageMediaView.kt */
/* loaded from: classes4.dex */
public final class kkw extends l020 {
    public izs<? super Float, s3q0> b;
    public final ImageView c;
    public final ImageView d;
    public final FrameLayout e;
    public boolean f;
    public o3p g;
    public Float h;
    public float i;

    public kkw(Context context) {
        super(context, null, 0);
        ImageView imageView = new ImageView(context);
        imageView.setAdjustViewBounds(true);
        this.c = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        imageView2.setAdjustViewBounds(true);
        this.d = imageView2;
        FrameLayout frameLayout = new FrameLayout(context);
        this.e = frameLayout;
        addView(imageView2);
        addView(imageView);
        addView(frameLayout);
        this.i = getAspectRatio();
    }

    private final boolean getHasImage() {
        return getImageWidth() > 0 && getImageHeight() > 0;
    }

    @Override // xsna.l020
    public final l020.a a(int i, int i2) {
        float aspectRatio = getAspectRatio();
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        float f = size;
        float f2 = size2;
        float f3 = f / f2;
        if (aspectRatio != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            if (aspectRatio == 1.0f) {
                int i3 = size > size2 ? size2 : size;
                if (size > size2) {
                    size = size2;
                }
                size2 = size;
                size = i3;
            } else if (aspectRatio > 1.0f) {
                if (f3 <= aspectRatio) {
                    size2 = an10.b(f / aspectRatio);
                } else {
                    size = an10.b(f2 * aspectRatio);
                }
            } else if (f3 >= aspectRatio) {
                size = an10.b(f2 * aspectRatio);
            } else {
                size2 = an10.b(f / aspectRatio);
            }
        }
        return new l020.a(size, size2);
    }

    @Override // xsna.l020
    public float getAspectRatio() {
        Float f = this.h;
        return f != null ? f.floatValue() : getImageAspectRatio();
    }

    public final Float getCustomAspectRatio() {
        return this.h;
    }

    public final o3p getImage() {
        return this.g;
    }

    public float getImageAspectRatio() {
        if (getHasImage()) {
            return getImageWidth() / getImageHeight();
        }
        return 1.0f;
    }

    public int getImageHeight() {
        ImageView imageView = this.c;
        if (imageView.getDrawable() != null) {
            return imageView.getDrawable().getIntrinsicHeight();
        }
        return 0;
    }

    public int getImageWidth() {
        ImageView imageView = this.c;
        if (imageView.getDrawable() != null) {
            return imageView.getDrawable().getIntrinsicWidth();
        }
        return 0;
    }

    public final izs<Float, s3q0> getOnAspectRatioDidUpdated() {
        return this.b;
    }

    public final void setCustomAspectRatio(Float f) {
        this.h = f;
    }

    public final void setImage(o3p o3pVar) {
        ld7 ld7Var;
        this.g = o3pVar;
        Bitmap bitmap = (o3pVar == null || (ld7Var = o3pVar.c) == null) ? null : ld7Var.a;
        this.c.setImageBitmap(bitmap);
        ImageView imageView = this.d;
        if (imageView.getDrawable() == null) {
            imageView.setImageBitmap(bitmap);
        }
    }

    public final void setOnAspectRatioDidUpdated(izs<? super Float, s3q0> izsVar) {
        this.b = izsVar;
    }

    public View getView() {
        return this;
    }
}
