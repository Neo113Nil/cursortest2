package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public class r5z0 extends whz0 {
    public int h;

    public r5z0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setAdjustViewBounds(true);
        this.h = -1;
        this.h = c1z0.d(20, context);
    }

    @Override // xsna.whz0, android.widget.ImageView, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.h >= 0) {
            setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
        } else {
            super.onMeasure(i, i2);
        }
    }

    public void setFixedHeight(int i) {
        this.h = i;
    }

    @Override // xsna.whz0, android.widget.ImageView
    public void setImageBitmap(@Nullable Bitmap bitmap) {
        int i;
        int i2;
        int i3 = this.h;
        int i4 = 0;
        if (i3 >= 0) {
            i = (i3 - getPaddingTop()) - getPaddingBottom();
            if (i < 0) {
                i = 0;
            }
        } else {
            i = -1;
        }
        if (i >= 0) {
            if (bitmap != null) {
                i2 = bitmap.getWidth();
                i4 = bitmap.getHeight();
            } else {
                i2 = 0;
            }
            setMeasuredDimension(getPaddingRight() + getPaddingLeft() + ((int) (i * (i4 > 0 ? i2 / i4 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))), this.h);
        }
        super.setImageBitmap(bitmap);
    }

    @Override // xsna.whz0, android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        int i;
        int i2;
        int i3 = this.h;
        int i4 = 0;
        if (i3 >= 0) {
            i = (i3 - getPaddingTop()) - getPaddingBottom();
            if (i < 0) {
                i = 0;
            }
        } else {
            i = -1;
        }
        if (i >= 0) {
            if (drawable != null) {
                i2 = drawable.getIntrinsicWidth();
                i4 = drawable.getIntrinsicHeight();
            } else {
                i2 = 0;
            }
            setMeasuredDimension(getPaddingRight() + getPaddingLeft() + ((int) (i * (i4 > 0 ? i2 / i4 : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT))), this.h);
        }
        super.setImageDrawable(drawable);
    }
}
