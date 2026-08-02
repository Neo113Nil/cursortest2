package com.vkontakte.android.ui.widget;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.design.ui.themehelper.R$styleable;

/* loaded from: classes7.dex */
public class RatioWebView extends WebView {
    public int b;
    public float c;

    public RatioWebView(Context context) {
        super(context);
        this.b = 1;
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public final void a(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.m);
        if (obtainStyledAttributes != null) {
            this.c = obtainStyledAttributes.getFloat(1, this.c);
            this.b = obtainStyledAttributes.getInt(0, this.b);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // android.webkit.WebView, android.widget.AbsoluteLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.c != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            int i3 = this.b;
            if (i3 == 0) {
                i2 = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i) * this.c), 1073741824);
            } else if (i3 == 1) {
                i = View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(i2) * this.c), 1073741824);
            }
        }
        super.onMeasure(i, i2);
    }

    public void setOrientation(int i) {
        if (i == 0 || i == 1) {
            this.b = i;
            requestLayout();
        }
    }

    public void setRatio(float f) {
        if (this.c != f) {
            this.c = f;
            requestLayout();
        }
    }

    public RatioWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = 1;
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        a(attributeSet);
    }

    public RatioWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = 1;
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        a(attributeSet);
    }

    @TargetApi(21)
    public RatioWebView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.b = 1;
        this.c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        a(attributeSet);
    }
}
