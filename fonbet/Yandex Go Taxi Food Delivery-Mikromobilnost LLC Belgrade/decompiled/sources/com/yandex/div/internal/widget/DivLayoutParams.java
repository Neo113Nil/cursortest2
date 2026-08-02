package com.yandex.div.internal.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import defpackage.eee0;
import defpackage.kgx;
import defpackage.lyk;
import defpackage.oyr;
import defpackage.qoi0;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b \u0018\u0000 @2\u00020\u0001:\u0001AB\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\u000bB\u0013\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0006\u0010\u000eB\u0013\b\u0016\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0006\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001d\u001a\u00020\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R\"\u0010#\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\"8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R+\u00101\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u0010\u0017\"\u0004\b0\u0010\u001cR+\u00105\u001a\u00020\b2\u0006\u0010,\u001a\u00020\b8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b2\u0010.\u001a\u0004\b3\u0010\u0017\"\u0004\b4\u0010\u001cR\"\u00106\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b6\u0010\u0019\u001a\u0004\b7\u0010\u0017\"\u0004\b8\u0010\u001cR\"\u00109\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010\u0019\u001a\u0004\b:\u0010\u0017\"\u0004\b;\u0010\u001cR\u0014\u0010=\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0017R\u0014\u0010?\u001a\u00020\b8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u0017¨\u0006B"}, d2 = {"Lcom/yandex/div/internal/widget/DivLayoutParams;", "Landroid/view/ViewGroup$MarginLayoutParams;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "width", "height", "(II)V", "Landroid/view/ViewGroup$LayoutParams;", "source", "(Landroid/view/ViewGroup$LayoutParams;)V", "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "(Lcom/yandex/div/internal/widget/DivLayoutParams;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "gravity", CA20Status.STATUS_USER_I, "getGravity", "setGravity", "(I)V", "isBaselineAligned", "Z", "()Z", "setBaselineAligned", "(Z)V", "", "verticalWeight", "F", "getVerticalWeight", "()F", "setVerticalWeight", "(F)V", "horizontalWeight", "getHorizontalWeight", "setHorizontalWeight", "<set-?>", "columnSpan$delegate", "Leee0;", "getColumnSpan", "setColumnSpan", "columnSpan", "rowSpan$delegate", "getRowSpan", "setRowSpan", "rowSpan", "maxHeight", "getMaxHeight", "setMaxHeight", "maxWidth", "getMaxWidth", "setMaxWidth", "getHorizontalMargins$div_release", "horizontalMargins", "getVerticalMargins$div_release", "verticalMargins", "Companion", "lyk", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivLayoutParams extends ViewGroup.MarginLayoutParams {
    static final /* synthetic */ kgx[] $$delegatedProperties = {new MutablePropertyReference1Impl("columnSpan", 0, "getColumnSpan()I", DivLayoutParams.class), oyr.B(qoi0.a, DivLayoutParams.class, "rowSpan", "getRowSpan()I", 0)};
    public static final lyk Companion = new lyk();
    public static final int DEFAULT_GRAVITY = 8388659;
    public static final int DEFAULT_MAX_SIZE = Integer.MAX_VALUE;
    public static final int DEFAULT_MIN_SIZE = 0;
    public static final int DEFAULT_SPAN = 1;
    public static final float DEFAULT_WEIGHT = 0.0f;
    public static final int WRAP_CONTENT_CONSTRAINED = -3;

    /* renamed from: columnSpan$delegate, reason: from kotlin metadata */
    private final eee0 columnSpan;
    private int gravity;
    private float horizontalWeight;
    private boolean isBaselineAligned;
    private int maxHeight;
    private int maxWidth;

    /* renamed from: rowSpan$delegate, reason: from kotlin metadata */
    private final eee0 rowSpan;
    private float verticalWeight;

    public DivLayoutParams(DivLayoutParams divLayoutParams) {
        super((ViewGroup.MarginLayoutParams) divLayoutParams);
        this.gravity = 8388659;
        this.columnSpan = new eee0();
        this.rowSpan = new eee0();
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

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || DivLayoutParams.class != other.getClass()) {
            return false;
        }
        DivLayoutParams divLayoutParams = (DivLayoutParams) other;
        return ((ViewGroup.MarginLayoutParams) this).width == ((ViewGroup.MarginLayoutParams) divLayoutParams).width && ((ViewGroup.MarginLayoutParams) this).height == ((ViewGroup.MarginLayoutParams) divLayoutParams).height && ((ViewGroup.MarginLayoutParams) this).leftMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin && ((ViewGroup.MarginLayoutParams) this).rightMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin && ((ViewGroup.MarginLayoutParams) this).topMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin && ((ViewGroup.MarginLayoutParams) this).bottomMargin == ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin && this.gravity == divLayoutParams.gravity && this.isBaselineAligned == divLayoutParams.isBaselineAligned && getColumnSpan() == divLayoutParams.getColumnSpan() && getRowSpan() == divLayoutParams.getRowSpan() && this.verticalWeight == divLayoutParams.verticalWeight && this.horizontalWeight == divLayoutParams.horizontalWeight && this.maxHeight == divLayoutParams.maxHeight && this.maxWidth == divLayoutParams.maxWidth;
    }

    public final int getColumnSpan() {
        eee0 eee0Var = this.columnSpan;
        kgx kgxVar = $$delegatedProperties[0];
        return eee0Var.a.intValue();
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
        eee0 eee0Var = this.rowSpan;
        kgx kgxVar = $$delegatedProperties[1];
        return eee0Var.a.intValue();
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

    /* renamed from: isBaselineAligned, reason: from getter */
    public final boolean getIsBaselineAligned() {
        return this.isBaselineAligned;
    }

    public final void setBaselineAligned(boolean z) {
        this.isBaselineAligned = z;
    }

    public final void setColumnSpan(int i) {
        eee0 eee0Var = this.columnSpan;
        kgx kgxVar = $$delegatedProperties[0];
        Integer valueOf = Integer.valueOf(i);
        eee0Var.getClass();
        if (valueOf.doubleValue() <= 0.0d) {
            valueOf = 1;
        }
        eee0Var.a = valueOf;
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
        eee0 eee0Var = this.rowSpan;
        kgx kgxVar = $$delegatedProperties[1];
        Integer valueOf = Integer.valueOf(i);
        eee0Var.getClass();
        if (valueOf.doubleValue() <= 0.0d) {
            valueOf = 1;
        }
        eee0Var.a = valueOf;
    }

    public final void setVerticalWeight(float f) {
        this.verticalWeight = f;
    }

    public DivLayoutParams(int i, int i2) {
        super(i, i2);
        this.gravity = 8388659;
        this.columnSpan = new eee0();
        this.rowSpan = new eee0();
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.gravity = 8388659;
        this.columnSpan = new eee0();
        this.rowSpan = new eee0();
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.gravity = 8388659;
        this.columnSpan = new eee0();
        this.rowSpan = new eee0();
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }

    public DivLayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.gravity = 8388659;
        this.columnSpan = new eee0();
        this.rowSpan = new eee0();
        this.maxHeight = Integer.MAX_VALUE;
        this.maxWidth = Integer.MAX_VALUE;
    }
}
