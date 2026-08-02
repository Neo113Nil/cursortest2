package com.vungle.ads.internal.ui.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.vungle.ads.internal.util.a0;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;

/* loaded from: classes7.dex */
public final class l extends FrameLayout {
    public ImageView a;
    public boolean b;

    public l(Context context) {
        super(context);
        a(context);
    }

    public final void a(Context context) {
        this.a = new ImageView(context);
        int a = a0.a(context, 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        ImageView imageView = this.a;
        if (imageView == null) {
            imageView = null;
        }
        imageView.setLayoutParams(layoutParams);
        ImageView imageView2 = this.a;
        addView(imageView2 != null ? imageView2 : null);
    }

    public final ImageView getPrivacyIcon$vungle_ads_release() {
        ImageView imageView = this.a;
        if (imageView == null) {
            return null;
        }
        return imageView;
    }

    public final void a(FrameLayout frameLayout, int i) {
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
        frameLayout.addView(this);
        int a = a0.a(getContext(), 20);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(a, a);
        if (i == 0) {
            layoutParams.gravity = 8388659;
        } else if (i == 1) {
            layoutParams.gravity = 8388661;
        } else if (i == 2) {
            layoutParams.gravity = 8388691;
        } else if (i != 3) {
            layoutParams.gravity = 8388661;
        } else {
            layoutParams.gravity = 8388693;
        }
        setLayoutParams(layoutParams);
        frameLayout.requestLayout();
    }

    public final void a() {
        if (this.b) {
            return;
        }
        this.b = true;
        try {
            ImageView imageView = this.a;
            if (imageView == null) {
                imageView = null;
            }
            Drawable drawable = imageView.getDrawable();
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e) {
            boolean z = u.a;
            StringBuilder a = com.iab.omid.library.vungle.internal.l.a("error msg: ");
            a.append(e.getLocalizedMessage());
            t.c("NativeAd", a.toString());
        }
        ImageView imageView2 = this.a;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setImageDrawable(null);
        removeAllViews();
        if (getParent() != null) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }
}
