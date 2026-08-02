package xsna;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-8a00ff42af949b1913775377e888ba3d64200bdaff78f642603b0d3aafb83a92 */
/* loaded from: classes14.dex */
public class whz0 extends ImageView {
    public Bitmap b;
    public Drawable c;
    public int d;
    public int e;
    public int f;
    public int g;

    public whz0(Context context) {
        super(context);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        setAdjustViewBounds(true);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        int intrinsicWidth;
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i3 = this.d;
        if (i3 == 0 || (intrinsicWidth = this.e) == 0) {
            Bitmap bitmap = this.b;
            if (bitmap != null) {
                intrinsicWidth = bitmap.getWidth();
                i3 = this.b.getHeight();
            } else {
                Drawable drawable = this.c;
                if (drawable == null) {
                    setMeasuredDimension(0, 0);
                    return;
                } else {
                    intrinsicWidth = drawable.getIntrinsicWidth();
                    i3 = this.c.getIntrinsicHeight();
                }
            }
        }
        if (intrinsicWidth <= 0 || i3 <= 0) {
            super.onMeasure(i, i2);
            return;
        }
        float f = intrinsicWidth;
        float f2 = i3;
        float f3 = f / f2;
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int i4 = this.g;
        if (i4 > 0) {
            size2 = Math.min(i4, size2);
        }
        int i5 = this.f;
        if (i5 > 0) {
            size = Math.min(i5, size);
        }
        if (mode == 1073741824 && mode2 == 1073741824) {
            setMeasuredDimension(size, size2);
            return;
        }
        if (mode != 0 || mode2 != 0) {
            if (mode == 0) {
                intrinsicWidth = (int) (size2 * f3);
            } else {
                if (mode2 == 0) {
                    i3 = (int) (size / f3);
                } else {
                    float f4 = size;
                    float f5 = f4 / f;
                    float f6 = size2;
                    if (Math.min(f5, f6 / f2) != f5 || f3 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        intrinsicWidth = (int) (f6 * f3);
                    } else {
                        i3 = (int) (f4 / f3);
                    }
                }
                intrinsicWidth = size;
            }
            i3 = size2;
        }
        setMeasuredDimension(intrinsicWidth, i3);
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(@Nullable Bitmap bitmap) {
        this.b = bitmap;
        super.setImageBitmap(bitmap);
    }

    public void setImageData(@Nullable kiw kiwVar) {
        if (kiwVar == null) {
            this.d = 0;
            this.e = 0;
            setImageBitmap(null);
        } else {
            this.d = kiwVar.c;
            this.e = kiwVar.b;
            setImageBitmap(kiwVar.a());
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@Nullable Drawable drawable) {
        this.c = drawable;
        super.setImageDrawable(drawable);
    }

    @Override // android.widget.ImageView
    public void setMaxHeight(int i) {
        this.g = i;
    }

    @Override // android.widget.ImageView
    public void setMaxWidth(int i) {
        this.f = i;
    }
}
