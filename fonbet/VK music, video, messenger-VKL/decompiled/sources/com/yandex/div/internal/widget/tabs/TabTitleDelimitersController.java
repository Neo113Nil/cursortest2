package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.yandex.div.internal.widget.tabs.BaseIndicatorTabLayout;

/* compiled from: TabTitleDelimitersController.kt */
/* loaded from: classes7.dex */
public final class TabTitleDelimitersController {
    private final Context context;
    private final BaseIndicatorTabLayout.OvalIndicators indicators;
    private Bitmap tabDelimiterBitmap;
    private int tabDelimiterHeight;
    private int tabDelimiterWidth;

    public TabTitleDelimitersController(Context context, BaseIndicatorTabLayout.OvalIndicators ovalIndicators) {
        this.context = context;
        this.indicators = ovalIndicators;
    }

    private final void addDelimiters() {
        removeDelimiters();
        if (getHasTabDelimiters()) {
            int childCount = this.indicators.getChildCount();
            for (int i = 1; i < childCount; i++) {
                this.indicators.addView(createDelimiterView(), (i * 2) - 1);
            }
            this.indicators.setContainsDelimiters(true);
        }
    }

    private final View createDelimiterView() {
        ImageView imageView = new ImageView(this.context);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.tabDelimiterWidth, this.tabDelimiterHeight);
        layoutParams.gravity = 17;
        imageView.setLayoutParams(layoutParams);
        imageView.setImageBitmap(this.tabDelimiterBitmap);
        return imageView;
    }

    private final boolean getHasTabDelimiters() {
        return this.tabDelimiterBitmap != null;
    }

    private final void removeDelimiters() {
        if (this.indicators.hasDelimiters()) {
            for (int childCount = this.indicators.getChildCount() - 1; childCount > 0; childCount -= 2) {
                this.indicators.removeViewAt(childCount);
            }
        }
        this.indicators.setContainsDelimiters(false);
    }

    public final void tabAdded(int i) {
        if (getHasTabDelimiters() && this.indicators.getChildCount() != 1) {
            if (i == 0) {
                this.indicators.addView(createDelimiterView(), 1);
            } else {
                this.indicators.addView(createDelimiterView(), i);
            }
        }
    }

    public final void tabRemoved(int i) {
        if (getHasTabDelimiters() && this.indicators.getChildCount() != 0) {
            if (i == 0) {
                this.indicators.removeViewAt(0);
            } else {
                this.indicators.removeViewAt(i - 1);
            }
        }
    }

    public final void updateTitleDelimiters(Bitmap bitmap, int i, int i2) {
        this.tabDelimiterBitmap = bitmap;
        this.tabDelimiterHeight = i2;
        this.tabDelimiterWidth = i;
        addDelimiters();
    }
}
