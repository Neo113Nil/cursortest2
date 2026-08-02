package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import com.yandex.div.internal.util.PositiveNumberDelegate;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.fpf0;
import xsna.p5j;
import xsna.qcy;
import xsna.zcl;

/* compiled from: DivLayoutParams.kt */
/* loaded from: classes7.dex */
public final class DivLayoutParams extends ViewGroup.MarginLayoutParams {
    static final /* synthetic */ qcy<Object>[] $$delegatedProperties = {new MutablePropertyReference1Impl(DivLayoutParams.class, "columnSpan", "getColumnSpan()I", 0), p5j.a(0, DivLayoutParams.class, "rowSpan", "getRowSpan()I", fpf0.a)};
    public static final Companion Companion = new Companion(null);
    private final PositiveNumberDelegate columnSpan$delegate;
    private int gravity;
    private float horizontalWeight;
    private boolean isBaselineAligned;
    private int maxHeight;
    private int maxWidth;
    private final PositiveNumberDelegate rowSpan$delegate;
    private float verticalWeight;

    /* compiled from: DivLayoutParams.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public DivLayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gravity = 8388659;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DivLayoutParams.class != obj.getClass()) {
            return false;
        }
        DivLayoutParams divLayoutParams = (DivLayoutParams) obj;
        return ((ViewGroup.MarginLayoutParams) this).width == ((ViewGroup.MarginLayoutParams) divLayoutParams).width && ((ViewGroup.MarginLayoutParams) this).height == ((ViewGroup.MarginLayoutParams) divLayoutParams).height && ((ViewGroup.MarginLayoutParams) this).leftMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin && ((ViewGroup.MarginLayoutParams) this).rightMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin && ((ViewGroup.MarginLayoutParams) this).topMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin && ((ViewGroup.MarginLayoutParams) this).bottomMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin && this.gravity == divLayoutParams.gravity && this.isBaselineAligned == divLayoutParams.isBaselineAligned && getColumnSpan() == divLayoutParams.getColumnSpan() && getRowSpan() == divLayoutParams.getRowSpan() && this.verticalWeight == divLayoutParams.verticalWeight && this.horizontalWeight == divLayoutParams.horizontalWeight && this.maxHeight == divLayoutParams.maxHeight && this.maxWidth == divLayoutParams.maxWidth;
    }

    public final int getColumnSpan() {
        return this.columnSpan$delegate.getValue(this, $$delegatedProperties[0]).intValue();
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getHorizontalMargins$div_release() {
        return ((ViewGroup.MarginLayoutParams) this).leftMargin + ((ViewGroup.MarginLayoutParams) this).rightMargin;
    }

    public final float getHorizontalWeight() {
        return this.horizontalWeight;
    }

    public final int getMaxHeight() {
        return this.maxHeight;
    }

    public final int getMaxWidth() {
        return this.maxWidth;
    }

    public final int getRowSpan() {
        return this.rowSpan$delegate.getValue(this, $$delegatedProperties[1]).intValue();
    }

    public final int getVerticalMargins$div_release() {
        return ((ViewGroup.MarginLayoutParams) this).topMargin + ((ViewGroup.MarginLayoutParams) this).bottomMargin;
    }

    public final float getVerticalWeight() {
        return this.verticalWeight;
    }

    public int hashCode() {
        int floatToIntBits = (Float.floatToIntBits(this.horizontalWeight) + ((Float.floatToIntBits(this.verticalWeight) + ((getRowSpan() + ((getColumnSpan() + (((((super.hashCode() * 31) + this.gravity) * 31) + (this.isBaselineAligned ? 1 : 0)) * 31)) * 31)) * 31)) * 31)) * 31;
        int i = this.maxHeight;
        if (i == Integer.MAX_VALUE) {
            i = 0;
        }
        int i2 = (floatToIntBits + i) * 31;
        int i3 = this.maxWidth;
        return i2 + (i3 != Integer.MAX_VALUE ? i3 : 0);
    }

    public final boolean isBaselineAligned() {
        return this.isBaselineAligned;
    }

    public final void setBaselineAligned(boolean z) {
        this.isBaselineAligned = z;
    }

    public final void setColumnSpan(int i) {
        this.columnSpan$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setGravity(int i) {
        this.gravity = i;
    }

    public final void setHorizontalWeight(float f) {
        this.horizontalWeight = f;
    }

    public final void setMaxHeight(int i) {
        this.maxHeight = i;
    }

    public final void setMaxWidth(int i) {
        this.maxWidth = i;
    }

    public final void setRowSpan(int i) {
        this.rowSpan$delegate.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    public final void setVerticalWeight(float f) {
        this.verticalWeight = f;
    }

    public DivLayoutParams(int i, int i2) {
        super(i, i2);
        this.gravity = 8388659;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.gravity = 8388659;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.gravity = 8388659;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(DivLayoutParams divLayoutParams) {
        super((ViewGroup.MarginLayoutParams) divLayoutParams);
        this.gravity = 8388659;
        this.columnSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.rowSpan$delegate = new PositiveNumberDelegate(1, null, 2, null);
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
        this.gravity = divLayoutParams.gravity;
        this.isBaselineAligned = divLayoutParams.isBaselineAligned;
        this.verticalWeight = divLayoutParams.verticalWeight;
        this.horizontalWeight = divLayoutParams.horizontalWeight;
        setColumnSpan(divLayoutParams.getColumnSpan());
        setRowSpan(divLayoutParams.getRowSpan());
        this.maxHeight = divLayoutParams.maxHeight;
        this.maxWidth = divLayoutParams.maxWidth;
    }
}
