package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.vungle.ads.internal.r1;
import com.vungle.ads.nativead.NativeVideoListener;
import xsna.s3q0;

/* loaded from: classes7.dex */
public class e extends RelativeLayout {
    public final r1 a;
    public ImageView b;
    public NativeVideoListener c;

    public e(Context context, r1 r1Var) {
        super(context);
        this.a = r1Var;
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        imageView.setLayoutParams(layoutParams);
        imageView.setAdjustViewBounds(true);
        addView(imageView);
    }

    public void a(Context context) {
        ImageView imageView = this.b;
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        this.a.b(this.b);
        requestLayout();
    }

    public final ImageView getImageView$vungle_ads_release() {
        return this.b;
    }

    public final r1 getInternal() {
        return this.a;
    }

    public final NativeVideoListener getNativeVideoListener() {
        return this.c;
    }

    public final void setImageView$vungle_ads_release(ImageView imageView) {
        this.b = imageView;
    }

    public final void setNativeVideoListener(NativeVideoListener nativeVideoListener) {
        this.c = nativeVideoListener;
    }

    public void a() {
        removeAllViews();
        try {
            ImageView imageView = this.b;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
            s3q0 s3q0Var = s3q0.a;
        } catch (Throwable unused) {
        }
        ImageView imageView2 = this.b;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
    }
}
