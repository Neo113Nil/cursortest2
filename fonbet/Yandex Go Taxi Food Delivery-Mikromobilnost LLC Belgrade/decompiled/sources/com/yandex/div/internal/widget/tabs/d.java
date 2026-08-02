package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;

/* loaded from: classes.dex */
public final class d {
    public final Context a;
    public final BaseIndicatorTabLayout.OvalIndicators b;
    public Bitmap c;
    public int d;
    public int e;

    public d(Context context, BaseIndicatorTabLayout.OvalIndicators ovalIndicators) {
        this.a = context;
        this.b = ovalIndicators;
    }

    public final ImageView a() {
        ImageView imageView = new ImageView(this.a);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.e, this.d);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap(this.c);
        return imageView;
    }

    public final void b(int i) {
        if (this.c != null) {
            BaseIndicatorTabLayout.OvalIndicators ovalIndicators = this.b;
            if (ovalIndicators.getChildCount() == 1) {
                return;
            }
            if (i == 0) {
                ovalIndicators.addView(a(), 1);
            } else {
                ovalIndicators.addView(a(), i);
            }
        }
    }
}
