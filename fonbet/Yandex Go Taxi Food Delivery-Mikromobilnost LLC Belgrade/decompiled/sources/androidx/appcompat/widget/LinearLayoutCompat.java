package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import android.widget.LinearLayout;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import defpackage.br2;
import defpackage.dfz0;
import defpackage.iog0;
import defpackage.kbs;
import defpackage.n4i0;
import defpackage.sp31;
import defpackage.x4e;
import java.util.WeakHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
    public static final int HORIZONTAL = 0;
    private static final int INDEX_BOTTOM = 2;
    private static final int INDEX_CENTER_VERTICAL = 0;
    private static final int INDEX_FILL = 3;
    private static final int INDEX_TOP = 1;
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_GRAVITY_COUNT = 4;
    private boolean mBaselineAligned;
    private int mBaselineAlignedChildIndex;
    private int mBaselineChildTop;
    private Drawable mDivider;
    private int mDividerHeight;
    private int mDividerPadding;
    private int mDividerWidth;
    private int mGravity;
    private int[] mMaxAscent;
    private int[] mMaxDescent;
    private int mOrientation;
    private int mShowDividers;
    private int mTotalLength;
    private boolean mUseLargestChild;
    private float mWeightSum;

    /* loaded from: classes10.dex */
    public final class InspectionCompanion implements android.view.inspector.InspectionCompanion<LinearLayoutCompat> {
        private int mBaselineAlignedChildIndexId;
        private int mBaselineAlignedId;
        private int mDividerId;
        private int mDividerPaddingId;
        private int mGravityId;
        private int mMeasureWithLargestChildId;
        private int mOrientationId;
        private boolean mPropertiesMapped = false;
        private int mShowDividersId;
        private int mWeightSumId;

        @Override // android.view.inspector.InspectionCompanion
        public void mapProperties(PropertyMapper propertyMapper) {
            this.mBaselineAlignedId = propertyMapper.mapBoolean("baselineAligned", R.attr.baselineAligned);
            this.mBaselineAlignedChildIndexId = propertyMapper.mapInt("baselineAlignedChildIndex", R.attr.baselineAlignedChildIndex);
            this.mGravityId = propertyMapper.mapGravity("gravity", R.attr.gravity);
            this.mOrientationId = propertyMapper.mapIntEnum("orientation", R.attr.orientation, new br2(2));
            this.mWeightSumId = propertyMapper.mapFloat("weightSum", R.attr.weightSum);
            this.mDividerId = propertyMapper.mapObject("divider", iog0.divider);
            this.mDividerPaddingId = propertyMapper.mapInt("dividerPadding", iog0.dividerPadding);
            this.mMeasureWithLargestChildId = propertyMapper.mapBoolean("measureWithLargestChild", iog0.measureWithLargestChild);
            this.mShowDividersId = propertyMapper.mapIntFlag("showDividers", iog0.showDividers, new br2(3));
            this.mPropertiesMapped = true;
        }

        @Override // android.view.inspector.InspectionCompanion
        public void readProperties(LinearLayoutCompat linearLayoutCompat, PropertyReader propertyReader) {
            if (!this.mPropertiesMapped) {
                throw new InspectionCompanion.UninitializedPropertyMapException();
            }
            propertyReader.readBoolean(this.mBaselineAlignedId, linearLayoutCompat.isBaselineAligned());
            propertyReader.readInt(this.mBaselineAlignedChildIndexId, linearLayoutCompat.getBaselineAlignedChildIndex());
            propertyReader.readGravity(this.mGravityId, linearLayoutCompat.getGravity());
            propertyReader.readIntEnum(this.mOrientationId, linearLayoutCompat.getOrientation());
            propertyReader.readFloat(this.mWeightSumId, linearLayoutCompat.getWeightSum());
            propertyReader.readObject(this.mDividerId, linearLayoutCompat.getDividerDrawable());
            propertyReader.readInt(this.mDividerPaddingId, linearLayoutCompat.getDividerPadding());
            propertyReader.readBoolean(this.mMeasureWithLargestChildId, linearLayoutCompat.isMeasureWithLargestChildEnabled());
            propertyReader.readIntFlag(this.mShowDividersId, linearLayoutCompat.getShowDividers());
        }
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mBaselineAligned = true;
        this.mBaselineAlignedChildIndex = -1;
        this.mBaselineChildTop = 0;
        this.mGravity = 8388659;
        dfz0 e = dfz0.e(i, 0, context, attributeSet, n4i0.LinearLayoutCompat);
        int[] iArr = n4i0.LinearLayoutCompat;
        TypedArray typedArray = e.b;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        sp31.b(this, context, iArr, attributeSet, typedArray, i, 0);
        int i2 = n4i0.LinearLayoutCompat_android_orientation;
        TypedArray typedArray2 = e.b;
        int i3 = typedArray2.getInt(i2, -1);
        if (i3 >= 0) {
            setOrientation(i3);
        }
        int i4 = typedArray2.getInt(n4i0.LinearLayoutCompat_android_gravity, -1);
        if (i4 >= 0) {
            setGravity(i4);
        }
        boolean z = typedArray2.getBoolean(n4i0.LinearLayoutCompat_android_baselineAligned, true);
        if (!z) {
            setBaselineAligned(z);
        }
        this.mWeightSum = typedArray2.getFloat(n4i0.LinearLayoutCompat_android_weightSum, -1.0f);
        this.mBaselineAlignedChildIndex = typedArray2.getInt(n4i0.LinearLayoutCompat_android_baselineAlignedChildIndex, -1);
        this.mUseLargestChild = typedArray2.getBoolean(n4i0.LinearLayoutCompat_measureWithLargestChild, false);
        setDividerDrawable(e.b(n4i0.LinearLayoutCompat_divider));
        this.mShowDividers = typedArray2.getInt(n4i0.LinearLayoutCompat_showDividers, 0);
        this.mDividerPadding = typedArray2.getDimensionPixelSize(n4i0.LinearLayoutCompat_dividerPadding, 0);
        e.g();
    }

    private void forceUniformHeight(int i, int i2) {
        LinearLayoutCompat linearLayoutCompat;
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View virtualChildAt = this.getVirtualChildAt(i4);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).height == -1) {
                    int i5 = ((LinearLayout.LayoutParams) layoutParams).width;
                    ((LinearLayout.LayoutParams) layoutParams).width = virtualChildAt.getMeasuredWidth();
                    linearLayoutCompat = this;
                    i3 = i2;
                    linearLayoutCompat.measureChildWithMargins(virtualChildAt, i3, 0, makeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) layoutParams).width = i5;
                    i4++;
                    this = linearLayoutCompat;
                    i2 = i3;
                }
            }
            linearLayoutCompat = this;
            i3 = i2;
            i4++;
            this = linearLayoutCompat;
            i2 = i3;
        }
    }

    private void forceUniformWidth(int i, int i2) {
        LinearLayoutCompat linearLayoutCompat;
        int i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i4 = 0;
        while (i4 < i) {
            View virtualChildAt = this.getVirtualChildAt(i4);
            if (virtualChildAt.getVisibility() != 8) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i5 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = virtualChildAt.getMeasuredHeight();
                    linearLayoutCompat = this;
                    i3 = i2;
                    linearLayoutCompat.measureChildWithMargins(virtualChildAt, makeMeasureSpec, 0, i3, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i5;
                    i4++;
                    this = linearLayoutCompat;
                    i2 = i3;
                }
            }
            linearLayoutCompat = this;
            i3 = i2;
            i4++;
            this = linearLayoutCompat;
            i2 = i3;
        }
    }

    private void setChildFrame(View view, int i, int i2, int i3, int i4) {
        view.layout(i, i2, i3 + i, i4 + i2);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public void drawDividersHorizontal(Canvas canvas) {
        int right;
        int left;
        int i;
        int virtualChildCount = getVirtualChildCount();
        boolean z = getLayoutDirection() == 1;
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View virtualChildAt = getVirtualChildAt(i2);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i2)) {
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                drawVerticalDivider(canvas, z ? virtualChildAt.getRight() + ((LinearLayout.LayoutParams) layoutParams).rightMargin : (virtualChildAt.getLeft() - ((LinearLayout.LayoutParams) layoutParams).leftMargin) - this.mDividerWidth);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            if (virtualChildAt2 != null) {
                LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                if (z) {
                    left = virtualChildAt2.getLeft() - ((LinearLayout.LayoutParams) layoutParams2).leftMargin;
                    i = this.mDividerWidth;
                    right = left - i;
                } else {
                    right = virtualChildAt2.getRight() + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                }
            } else if (z) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i = this.mDividerWidth;
                right = left - i;
            }
            drawVerticalDivider(canvas, right);
        }
    }

    public void drawDividersVertical(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i = 0; i < virtualChildCount; i++) {
            View virtualChildAt = getVirtualChildAt(i);
            if (virtualChildAt != null && virtualChildAt.getVisibility() != 8 && hasDividerBeforeChildAt(i)) {
                drawHorizontalDivider(canvas, (virtualChildAt.getTop() - ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt.getLayoutParams())).topMargin) - this.mDividerHeight);
            }
        }
        if (hasDividerBeforeChildAt(virtualChildCount)) {
            View virtualChildAt2 = getVirtualChildAt(virtualChildCount - 1);
            drawHorizontalDivider(canvas, virtualChildAt2 == null ? (getHeight() - getPaddingBottom()) - this.mDividerHeight : virtualChildAt2.getBottom() + ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt2.getLayoutParams())).bottomMargin);
        }
    }

    public void drawHorizontalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    public void drawVerticalDivider(Canvas canvas, int i) {
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        int i = this.mOrientation;
        if (i == 0) {
            return new LayoutParams(-2, -2);
        }
        if (i == 1) {
            return new LayoutParams(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i;
        if (this.mBaselineAlignedChildIndex < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i2 = this.mBaselineAlignedChildIndex;
        if (childCount <= i2) {
            kbs.g("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
            return 0;
        }
        View childAt = getChildAt(i2);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.mBaselineAlignedChildIndex == 0) {
                return -1;
            }
            kbs.g("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
            return 0;
        }
        int i3 = this.mBaselineChildTop;
        if (this.mOrientation == 1 && (i = this.mGravity & 112) != 48) {
            if (i == 16) {
                i3 = x4e.c(((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom(), this.mTotalLength, 2, i3);
            } else if (i == 80) {
                i3 = ((getBottom() - getTop()) - getPaddingBottom()) - this.mTotalLength;
            }
        }
        return i3 + ((LinearLayout.LayoutParams) ((LayoutParams) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.mBaselineAlignedChildIndex;
    }

    public int getChildrenSkipCount(View view, int i) {
        return 0;
    }

    public Drawable getDividerDrawable() {
        return this.mDivider;
    }

    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    public int getGravity() {
        return this.mGravity;
    }

    public int getLocationOffset(View view) {
        return 0;
    }

    public int getNextLocationOffset(View view) {
        return 0;
    }

    public int getOrientation() {
        return this.mOrientation;
    }

    public int getShowDividers() {
        return this.mShowDividers;
    }

    public View getVirtualChildAt(int i) {
        return getChildAt(i);
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.mWeightSum;
    }

    public boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        }
        int childCount = getChildCount();
        int i2 = this.mShowDividers;
        if (i == childCount) {
            return (i2 & 4) != 0;
        }
        if ((i2 & 2) != 0) {
            for (int i3 = i - 1; i3 >= 0; i3--) {
                if (getChildAt(i3).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean isBaselineAligned() {
        return this.mBaselineAligned;
    }

    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutHorizontal(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        boolean z;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int c;
        int i14;
        boolean z2 = true;
        Object[] objArr = getLayoutDirection() == 1;
        int paddingTop = getPaddingTop();
        int i15 = i4 - i2;
        int paddingBottom = i15 - getPaddingBottom();
        int paddingBottom2 = (i15 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i16 = this.mGravity;
        int i17 = i16 & 112;
        boolean z3 = this.mBaselineAligned;
        int[] iArr = this.mMaxAscent;
        int[] iArr2 = this.mMaxDescent;
        int absoluteGravity = Gravity.getAbsoluteGravity(8388615 & i16, getLayoutDirection());
        int i18 = 2;
        int paddingLeft = absoluteGravity != 1 ? absoluteGravity != 5 ? getPaddingLeft() : ((getPaddingLeft() + i3) - i) - this.mTotalLength : x4e.c(i3 - i, this.mTotalLength, 2, getPaddingLeft());
        if (objArr == true) {
            i5 = virtualChildCount - 1;
            i6 = -1;
        } else {
            i5 = 0;
            i6 = 1;
        }
        int i19 = 0;
        while (i19 < virtualChildCount) {
            int i20 = (i6 * i19) + i5;
            int i21 = i19;
            View virtualChildAt = getVirtualChildAt(i20);
            if (virtualChildAt == null) {
                paddingLeft = measureNullChild(i20) + paddingLeft;
                i9 = i21;
                z = z2;
                i7 = paddingTop;
                i8 = paddingBottom;
            } else {
                z = z2;
                int i22 = i18;
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    int i23 = paddingLeft;
                    if (z3) {
                        i10 = measuredWidth;
                        if (((LinearLayout.LayoutParams) layoutParams).height != -1) {
                            i11 = virtualChildAt.getBaseline();
                            i12 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                            if (i12 < 0) {
                                i12 = i17;
                            }
                            i13 = i12 & 112;
                            i8 = paddingBottom;
                            if (i13 != 16) {
                                c = (x4e.c(paddingBottom2, measuredHeight, i22, paddingTop) + ((LinearLayout.LayoutParams) layoutParams).topMargin) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                            } else if (i13 == 48) {
                                c = ((LinearLayout.LayoutParams) layoutParams).topMargin + paddingTop;
                                if (i11 != -1) {
                                    c = (iArr[z ? 1 : 0] - i11) + c;
                                }
                            } else if (i13 != 80) {
                                i14 = paddingTop;
                                int i24 = (hasDividerBeforeChildAt(i20) ? i23 + this.mDividerWidth : i23) + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                                i7 = paddingTop;
                                int i25 = i10;
                                setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i24, i14, i25, measuredHeight);
                                paddingLeft = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i25 + i24;
                                i9 = getChildrenSkipCount(virtualChildAt, i20) + i21;
                            } else {
                                c = (i8 - measuredHeight) - ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                                if (i11 != -1) {
                                    c -= iArr2[i22] - (virtualChildAt.getMeasuredHeight() - i11);
                                }
                            }
                            i14 = c;
                            int i242 = (hasDividerBeforeChildAt(i20) ? i23 + this.mDividerWidth : i23) + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                            i7 = paddingTop;
                            int i252 = i10;
                            setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i242, i14, i252, measuredHeight);
                            paddingLeft = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i252 + i242;
                            i9 = getChildrenSkipCount(virtualChildAt, i20) + i21;
                        }
                    } else {
                        i10 = measuredWidth;
                    }
                    i11 = -1;
                    i12 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i12 < 0) {
                    }
                    i13 = i12 & 112;
                    i8 = paddingBottom;
                    if (i13 != 16) {
                    }
                    i14 = c;
                    int i2422 = (hasDividerBeforeChildAt(i20) ? i23 + this.mDividerWidth : i23) + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                    i7 = paddingTop;
                    int i2522 = i10;
                    setChildFrame(virtualChildAt, getLocationOffset(virtualChildAt) + i2422, i14, i2522, measuredHeight);
                    paddingLeft = getNextLocationOffset(virtualChildAt) + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i2522 + i2422;
                    i9 = getChildrenSkipCount(virtualChildAt, i20) + i21;
                } else {
                    i7 = paddingTop;
                    i8 = paddingBottom;
                    i9 = i21;
                }
            }
            i19 = i9 + 1;
            z2 = z;
            paddingBottom = i8;
            paddingTop = i7;
            i18 = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void layoutVertical(int i, int i2, int i3, int i4) {
        int c;
        int i5;
        int i6;
        int paddingLeft = getPaddingLeft();
        int i7 = i3 - i;
        int paddingRight = i7 - getPaddingRight();
        int paddingRight2 = (i7 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i8 = this.mGravity;
        int i9 = i8 & 112;
        int i10 = i8 & 8388615;
        int paddingTop = i9 != 16 ? i9 != 80 ? getPaddingTop() : ((getPaddingTop() + i4) - i2) - this.mTotalLength : x4e.c(i4 - i2, this.mTotalLength, 2, getPaddingTop());
        int i11 = 0;
        while (i11 < virtualChildCount) {
            int i12 = paddingTop;
            View virtualChildAt = getVirtualChildAt(i11);
            if (virtualChildAt == null) {
                paddingTop = measureNullChild(i11) + i12;
            } else {
                if (virtualChildAt.getVisibility() != 8) {
                    int measuredWidth = virtualChildAt.getMeasuredWidth();
                    int measuredHeight = virtualChildAt.getMeasuredHeight();
                    LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                    int i13 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i13 < 0) {
                        i13 = i10;
                    }
                    int absoluteGravity = Gravity.getAbsoluteGravity(i13, getLayoutDirection()) & 7;
                    if (absoluteGravity == 1) {
                        c = x4e.c(paddingRight2, measuredWidth, 2, paddingLeft) + ((LinearLayout.LayoutParams) layoutParams).leftMargin;
                        i5 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    } else if (absoluteGravity != 5) {
                        i6 = ((LinearLayout.LayoutParams) layoutParams).leftMargin + paddingLeft;
                        if (hasDividerBeforeChildAt(i11)) {
                            i12 += this.mDividerHeight;
                        }
                        int i14 = ((LinearLayout.LayoutParams) layoutParams).topMargin + i12;
                        setChildFrame(virtualChildAt, i6, getLocationOffset(virtualChildAt) + i14, measuredWidth, measuredHeight);
                        i12 = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i14;
                        i11 += getChildrenSkipCount(virtualChildAt, i11);
                    } else {
                        c = paddingRight - measuredWidth;
                        i5 = ((LinearLayout.LayoutParams) layoutParams).rightMargin;
                    }
                    i6 = c - i5;
                    if (hasDividerBeforeChildAt(i11)) {
                    }
                    int i142 = ((LinearLayout.LayoutParams) layoutParams).topMargin + i12;
                    setChildFrame(virtualChildAt, i6, getLocationOffset(virtualChildAt) + i142, measuredWidth, measuredHeight);
                    i12 = getNextLocationOffset(virtualChildAt) + measuredHeight + ((LinearLayout.LayoutParams) layoutParams).bottomMargin + i142;
                    i11 += getChildrenSkipCount(virtualChildAt, i11);
                }
                paddingTop = i12;
            }
            i11++;
        }
    }

    public void measureChildBeforeLayout(View view, int i, int i2, int i3, int i4, int i5) {
        measureChildWithMargins(view, i2, i3, i4, i5);
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0453  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureHorizontal(int i, int i2) {
        int i3;
        int i4;
        float f;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        int baseline;
        int i11;
        int i12;
        float f2;
        char c;
        int i13;
        boolean z2;
        int i14;
        int i15;
        int i16;
        int[] iArr;
        int i17;
        int i18;
        boolean z3;
        int[] iArr2;
        View view;
        boolean z4;
        boolean z5;
        int baseline2;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        if (this.mMaxAscent == null || this.mMaxDescent == null) {
            this.mMaxAscent = new int[4];
            this.mMaxDescent = new int[4];
        }
        int[] iArr3 = this.mMaxAscent;
        int[] iArr4 = this.mMaxDescent;
        iArr3[3] = -1;
        iArr3[2] = -1;
        iArr3[1] = -1;
        iArr3[0] = -1;
        iArr4[3] = -1;
        iArr4[2] = -1;
        iArr4[1] = -1;
        iArr4[0] = -1;
        boolean z6 = this.mBaselineAligned;
        boolean z7 = this.mUseLargestChild;
        int i19 = 1073741824;
        boolean z8 = mode == 1073741824;
        boolean z9 = z7;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        boolean z10 = false;
        int i23 = 0;
        boolean z11 = false;
        boolean z12 = true;
        float f3 = 0.0f;
        int i24 = 0;
        int i25 = 0;
        while (true) {
            i3 = i21;
            if (i20 >= virtualChildCount) {
                break;
            }
            boolean z13 = z6;
            View virtualChildAt = getVirtualChildAt(i20);
            if (virtualChildAt == null) {
                this.mTotalLength = measureNullChild(i20) + this.mTotalLength;
            } else if (virtualChildAt.getVisibility() == 8) {
                i20 += getChildrenSkipCount(virtualChildAt, i20);
            } else {
                if (hasDividerBeforeChildAt(i20)) {
                    this.mTotalLength += this.mDividerWidth;
                }
                LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                float f4 = ((LinearLayout.LayoutParams) layoutParams).weight;
                float f5 = f3 + f4;
                if (mode == i19 && ((LinearLayout.LayoutParams) layoutParams).width == 0 && f4 > 0.0f) {
                    int i26 = this.mTotalLength;
                    if (z8) {
                        this.mTotalLength = ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i26;
                    } else {
                        this.mTotalLength = Math.max(i26, ((LinearLayout.LayoutParams) layoutParams).leftMargin + i26 + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                    }
                    if (z13) {
                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                        virtualChildAt.measure(makeMeasureSpec, makeMeasureSpec);
                        i15 = virtualChildCount;
                        i16 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                    } else {
                        i15 = virtualChildCount;
                        i16 = mode;
                        iArr = iArr3;
                        iArr2 = iArr4;
                        z10 = true;
                    }
                    i17 = i3;
                    i18 = 1073741824;
                    z3 = z9;
                    view = virtualChildAt;
                } else {
                    if (((LinearLayout.LayoutParams) layoutParams).width != 0 || f4 <= 0.0f) {
                        c = 65534;
                        i13 = Integer.MIN_VALUE;
                    } else {
                        c = 65534;
                        ((LinearLayout.LayoutParams) layoutParams).width = -2;
                        i13 = 0;
                    }
                    if (f5 == 0.0f) {
                        z2 = z9;
                        i14 = this.mTotalLength;
                    } else {
                        z2 = z9;
                        i14 = 0;
                    }
                    i15 = virtualChildCount;
                    i16 = mode;
                    iArr = iArr3;
                    i17 = i3;
                    i18 = 1073741824;
                    z3 = z2;
                    iArr2 = iArr4;
                    int i27 = i13;
                    measureChildBeforeLayout(virtualChildAt, i20, i, i14, i2, 0);
                    view = virtualChildAt;
                    if (i27 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) layoutParams).width = i27;
                    }
                    int measuredWidth = view.getMeasuredWidth();
                    int i28 = this.mTotalLength;
                    if (z8) {
                        this.mTotalLength = getNextLocationOffset(view) + ((LinearLayout.LayoutParams) layoutParams).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).rightMargin + i28;
                    } else {
                        this.mTotalLength = Math.max(i28, getNextLocationOffset(view) + i28 + measuredWidth + ((LinearLayout.LayoutParams) layoutParams).leftMargin + ((LinearLayout.LayoutParams) layoutParams).rightMargin);
                    }
                    if (z3) {
                        i22 = Math.max(measuredWidth, i22);
                    }
                }
                if (mode2 == i18 || ((LinearLayout.LayoutParams) layoutParams).height != -1) {
                    z4 = false;
                } else {
                    z4 = true;
                    z11 = true;
                }
                int i29 = ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin;
                int measuredHeight = view.getMeasuredHeight() + i29;
                i23 = View.combineMeasuredStates(i23, view.getMeasuredState());
                if (!z13 || (baseline2 = view.getBaseline()) == -1) {
                    z5 = z4;
                } else {
                    int i30 = ((LinearLayout.LayoutParams) layoutParams).gravity;
                    if (i30 < 0) {
                        i30 = this.mGravity;
                    }
                    int i31 = (((i30 & 112) >> 4) & (-2)) >> 1;
                    z5 = z4;
                    iArr[i31] = Math.max(iArr[i31], baseline2);
                    iArr2[i31] = Math.max(iArr2[i31], measuredHeight - baseline2);
                }
                int max = Math.max(i17, measuredHeight);
                z12 = z12 && ((LinearLayout.LayoutParams) layoutParams).height == -1;
                if (((LinearLayout.LayoutParams) layoutParams).weight > 0.0f) {
                    if (!z5) {
                        i29 = measuredHeight;
                    }
                    i25 = Math.max(i25, i29);
                } else {
                    if (!z5) {
                        i29 = measuredHeight;
                    }
                    i24 = Math.max(i24, i29);
                }
                i20 += getChildrenSkipCount(view, i20);
                i21 = max;
                f3 = f5;
                i20++;
                z9 = z3;
                iArr4 = iArr2;
                z6 = z13;
                mode = i16;
                iArr3 = iArr;
                virtualChildCount = i15;
                i19 = 1073741824;
            }
            i15 = virtualChildCount;
            i16 = mode;
            iArr = iArr3;
            iArr2 = iArr4;
            i21 = i3;
            z3 = z9;
            i20++;
            z9 = z3;
            iArr4 = iArr2;
            z6 = z13;
            mode = i16;
            iArr3 = iArr;
            virtualChildCount = i15;
            i19 = 1073741824;
        }
        boolean z14 = z6;
        int i32 = virtualChildCount;
        int i33 = mode;
        int[] iArr5 = iArr3;
        int[] iArr6 = iArr4;
        int i34 = i23;
        boolean z15 = z9;
        if (this.mTotalLength > 0) {
            i4 = i32;
            if (hasDividerBeforeChildAt(i4)) {
                this.mTotalLength += this.mDividerWidth;
            }
        } else {
            i4 = i32;
        }
        int i35 = iArr5[1];
        int max2 = (i35 == -1 && iArr5[0] == -1 && iArr5[2] == -1 && iArr5[3] == -1) ? i3 : Math.max(i3, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i35, iArr5[2]))));
        if (z15) {
            i5 = i33;
            if (i5 == Integer.MIN_VALUE || i5 == 0) {
                this.mTotalLength = 0;
                int i36 = 0;
                while (i36 < i4) {
                    View virtualChildAt2 = getVirtualChildAt(i36);
                    if (virtualChildAt2 == null) {
                        this.mTotalLength = measureNullChild(i36) + this.mTotalLength;
                    } else if (virtualChildAt2.getVisibility() == 8) {
                        i36 += getChildrenSkipCount(virtualChildAt2, i36);
                    } else {
                        LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                        int i37 = this.mTotalLength;
                        if (z8) {
                            f2 = f3;
                            this.mTotalLength = getNextLocationOffset(virtualChildAt2) + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + i22 + ((LinearLayout.LayoutParams) layoutParams2).rightMargin + i37;
                        } else {
                            f2 = f3;
                            this.mTotalLength = Math.max(i37, getNextLocationOffset(virtualChildAt2) + i37 + i22 + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin);
                        }
                        i36++;
                        f3 = f2;
                    }
                    f2 = f3;
                    i36++;
                    f3 = f2;
                }
            }
            f = f3;
        } else {
            f = f3;
            i5 = i33;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
        this.mTotalLength = paddingRight;
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingRight, getSuggestedMinimumWidth()), i, 0);
        int i38 = (16777215 & resolveSizeAndState) - this.mTotalLength;
        if (z10 || (i38 != 0 && f > 0.0f)) {
            float f6 = this.mWeightSum;
            if (f6 > 0.0f) {
                f = f6;
            }
            iArr5[3] = -1;
            iArr5[2] = -1;
            iArr5[1] = -1;
            iArr5[0] = -1;
            iArr6[3] = -1;
            iArr6[2] = -1;
            iArr6[1] = -1;
            iArr6[0] = -1;
            this.mTotalLength = 0;
            max2 = -1;
            int i39 = 0;
            while (i39 < i4) {
                View virtualChildAt3 = getVirtualChildAt(i39);
                if (virtualChildAt3 == null || virtualChildAt3.getVisibility() == 8) {
                    i9 = resolveSizeAndState;
                } else {
                    LayoutParams layoutParams3 = (LayoutParams) virtualChildAt3.getLayoutParams();
                    float f7 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                    if (f7 > 0.0f) {
                        int i40 = (int) ((i38 * f7) / f);
                        f -= f7;
                        i38 -= i40;
                        i9 = resolveSizeAndState;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i2, getPaddingBottom() + getPaddingTop() + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin, ((LinearLayout.LayoutParams) layoutParams3).height);
                        if (((LinearLayout.LayoutParams) layoutParams3).width == 0) {
                            i12 = 1073741824;
                            if (i5 == 1073741824) {
                                if (i40 <= 0) {
                                    i40 = 0;
                                }
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(i40, 1073741824), childMeasureSpec);
                                i34 = View.combineMeasuredStates(i34, virtualChildAt3.getMeasuredState() & ModalContentViewContainer.BASE_SHADOW_COLOR);
                            }
                        } else {
                            i12 = 1073741824;
                        }
                        int measuredWidth2 = virtualChildAt3.getMeasuredWidth() + i40;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i12), childMeasureSpec);
                        i34 = View.combineMeasuredStates(i34, virtualChildAt3.getMeasuredState() & ModalContentViewContainer.BASE_SHADOW_COLOR);
                    } else {
                        i9 = resolveSizeAndState;
                    }
                    int i41 = this.mTotalLength;
                    if (z8) {
                        this.mTotalLength = getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin + i41;
                    } else {
                        this.mTotalLength = Math.max(i41, getNextLocationOffset(virtualChildAt3) + virtualChildAt3.getMeasuredWidth() + i41 + ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin);
                    }
                    boolean z16 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == -1;
                    int i42 = ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin;
                    int measuredHeight2 = virtualChildAt3.getMeasuredHeight() + i42;
                    max2 = Math.max(max2, measuredHeight2);
                    if (!z16) {
                        i42 = measuredHeight2;
                    }
                    int max3 = Math.max(i24, i42);
                    if (z12) {
                        i10 = -1;
                        if (((LinearLayout.LayoutParams) layoutParams3).height == -1) {
                            z = true;
                            if (z14 && (baseline = virtualChildAt3.getBaseline()) != i10) {
                                i11 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                                if (i11 < 0) {
                                    i11 = this.mGravity;
                                }
                                int i43 = (((i11 & 112) >> 4) & (-2)) >> 1;
                                iArr5[i43] = Math.max(iArr5[i43], baseline);
                                iArr6[i43] = Math.max(iArr6[i43], measuredHeight2 - baseline);
                            }
                            i24 = max3;
                            z12 = z;
                        }
                    } else {
                        i10 = -1;
                    }
                    z = false;
                    if (z14) {
                        i11 = ((LinearLayout.LayoutParams) layoutParams3).gravity;
                        if (i11 < 0) {
                        }
                        int i432 = (((i11 & 112) >> 4) & (-2)) >> 1;
                        iArr5[i432] = Math.max(iArr5[i432], baseline);
                        iArr6[i432] = Math.max(iArr6[i432], measuredHeight2 - baseline);
                    }
                    i24 = max3;
                    z12 = z;
                }
                i39++;
                resolveSizeAndState = i9;
            }
            i6 = resolveSizeAndState;
            i7 = ModalContentViewContainer.BASE_SHADOW_COLOR;
            this.mTotalLength = getPaddingRight() + getPaddingLeft() + this.mTotalLength;
            int i44 = iArr5[1];
            if (i44 != -1 || iArr5[0] != -1 || iArr5[2] != -1 || iArr5[3] != -1) {
                max2 = Math.max(max2, Math.max(iArr6[3], Math.max(iArr6[0], Math.max(iArr6[1], iArr6[2]))) + Math.max(iArr5[3], Math.max(iArr5[0], Math.max(i44, iArr5[2]))));
            }
            i8 = i24;
        } else {
            i8 = Math.max(i24, i25);
            if (z15 && i5 != 1073741824) {
                for (int i45 = 0; i45 < i4; i45++) {
                    View virtualChildAt4 = getVirtualChildAt(i45);
                    if (virtualChildAt4 != null && virtualChildAt4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt4.getLayoutParams())).weight > 0.0f) {
                        virtualChildAt4.measure(View.MeasureSpec.makeMeasureSpec(i22, 1073741824), View.MeasureSpec.makeMeasureSpec(virtualChildAt4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i6 = resolveSizeAndState;
            i7 = ModalContentViewContainer.BASE_SHADOW_COLOR;
        }
        int i46 = i34;
        if (!z12 && mode2 != 1073741824) {
            max2 = i8;
        }
        setMeasuredDimension(i6 | (i46 & i7), View.resolveSizeAndState(Math.max(getPaddingBottom() + getPaddingTop() + max2, getSuggestedMinimumHeight()), i2, i46 << 16));
        if (z11) {
            forceUniformHeight(i4, i);
        }
    }

    public int measureNullChild(int i) {
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void measureVertical(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view;
        boolean z;
        int i16;
        boolean z2;
        int max;
        int i17;
        this.mTotalLength = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i18 = this.mBaselineAlignedChildIndex;
        boolean z3 = this.mUseLargestChild;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        boolean z4 = false;
        boolean z5 = false;
        float f = 0.0f;
        boolean z6 = true;
        while (true) {
            int i25 = 8;
            if (i19 >= virtualChildCount) {
                float f2 = f;
                int i26 = i20;
                int i27 = virtualChildCount;
                int i28 = mode2;
                boolean z7 = z3;
                int i29 = i21;
                int i30 = i22;
                int i31 = i23;
                if (this.mTotalLength > 0) {
                    i3 = i27;
                    if (hasDividerBeforeChildAt(i3)) {
                        this.mTotalLength += this.mDividerHeight;
                    }
                } else {
                    i3 = i27;
                }
                int i32 = i28;
                if (z7 && (i32 == Integer.MIN_VALUE || i32 == 0)) {
                    this.mTotalLength = 0;
                    int i33 = 0;
                    while (i33 < i3) {
                        View virtualChildAt = getVirtualChildAt(i33);
                        if (virtualChildAt == null) {
                            this.mTotalLength = measureNullChild(i33) + this.mTotalLength;
                        } else if (virtualChildAt.getVisibility() == i25) {
                            i33 += getChildrenSkipCount(virtualChildAt, i33);
                        } else {
                            LayoutParams layoutParams = (LayoutParams) virtualChildAt.getLayoutParams();
                            int i34 = this.mTotalLength;
                            this.mTotalLength = Math.max(i34, getNextLocationOffset(virtualChildAt) + i34 + i29 + ((LinearLayout.LayoutParams) layoutParams).topMargin + ((LinearLayout.LayoutParams) layoutParams).bottomMargin);
                        }
                        i33++;
                        i25 = 8;
                    }
                }
                int paddingBottom = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                this.mTotalLength = paddingBottom;
                int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingBottom, getSuggestedMinimumHeight()), i2, 0);
                int i35 = (16777215 & resolveSizeAndState) - this.mTotalLength;
                if (z4 || (i35 != 0 && f2 > 0.0f)) {
                    float f3 = this.mWeightSum;
                    if (f3 <= 0.0f) {
                        f3 = f2;
                    }
                    this.mTotalLength = 0;
                    float f4 = f3;
                    int i36 = i35;
                    int i37 = 0;
                    while (i37 < i3) {
                        View virtualChildAt2 = getVirtualChildAt(i37);
                        if (virtualChildAt2.getVisibility() == 8) {
                            i5 = i32;
                            i6 = i37;
                        } else {
                            LayoutParams layoutParams2 = (LayoutParams) virtualChildAt2.getLayoutParams();
                            float f5 = ((LinearLayout.LayoutParams) layoutParams2).weight;
                            if (f5 > 0.0f) {
                                i6 = i37;
                                int i38 = (int) ((i36 * f5) / f4);
                                f4 -= f5;
                                i36 -= i38;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, getPaddingRight() + getPaddingLeft() + ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin, ((LinearLayout.LayoutParams) layoutParams2).width);
                                if (((LinearLayout.LayoutParams) layoutParams2).height == 0) {
                                    i8 = 1073741824;
                                    if (i32 == 1073741824) {
                                        i5 = i32;
                                        virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i38 > 0 ? i38 : 0, 1073741824));
                                        i31 = View.combineMeasuredStates(i31, virtualChildAt2.getMeasuredState() & (-256));
                                    }
                                } else {
                                    i8 = 1073741824;
                                }
                                i5 = i32;
                                int measuredHeight = virtualChildAt2.getMeasuredHeight() + i38;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                virtualChildAt2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i8));
                                i31 = View.combineMeasuredStates(i31, virtualChildAt2.getMeasuredState() & (-256));
                            } else {
                                i5 = i32;
                                i6 = i37;
                            }
                            int i39 = ((LinearLayout.LayoutParams) layoutParams2).leftMargin + ((LinearLayout.LayoutParams) layoutParams2).rightMargin;
                            int measuredWidth = virtualChildAt2.getMeasuredWidth() + i39;
                            i30 = Math.max(i30, measuredWidth);
                            if (mode != 1073741824) {
                                i7 = -1;
                                if (((LinearLayout.LayoutParams) layoutParams2).width == -1) {
                                    measuredWidth = i39;
                                }
                            } else {
                                i7 = -1;
                            }
                            int max2 = Math.max(i24, measuredWidth);
                            boolean z8 = z6 && ((LinearLayout.LayoutParams) layoutParams2).width == i7;
                            int i40 = this.mTotalLength;
                            this.mTotalLength = Math.max(i40, getNextLocationOffset(virtualChildAt2) + virtualChildAt2.getMeasuredHeight() + i40 + ((LinearLayout.LayoutParams) layoutParams2).topMargin + ((LinearLayout.LayoutParams) layoutParams2).bottomMargin);
                            i24 = max2;
                            z6 = z8;
                        }
                        i37 = i6 + 1;
                        i32 = i5;
                    }
                    this.mTotalLength = getPaddingBottom() + getPaddingTop() + this.mTotalLength;
                    i4 = i24;
                } else {
                    i4 = Math.max(i24, i26);
                    if (z7 && i32 != 1073741824) {
                        for (int i41 = 0; i41 < i3; i41++) {
                            View virtualChildAt3 = getVirtualChildAt(i41);
                            if (virtualChildAt3 != null && virtualChildAt3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((LayoutParams) virtualChildAt3.getLayoutParams())).weight > 0.0f) {
                                virtualChildAt3.measure(View.MeasureSpec.makeMeasureSpec(virtualChildAt3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i29, 1073741824));
                            }
                        }
                    }
                }
                if (!z6 && mode != 1073741824) {
                    i30 = i4;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + getPaddingLeft() + i30, getSuggestedMinimumWidth()), i, i31), resolveSizeAndState);
                if (z5) {
                    forceUniformWidth(i3, i2);
                    return;
                }
                return;
            }
            float f6 = f;
            View virtualChildAt4 = getVirtualChildAt(i19);
            if (virtualChildAt4 == null) {
                this.mTotalLength = measureNullChild(i19) + this.mTotalLength;
            } else if (virtualChildAt4.getVisibility() == 8) {
                i19 += getChildrenSkipCount(virtualChildAt4, i19);
            } else {
                if (hasDividerBeforeChildAt(i19)) {
                    this.mTotalLength += this.mDividerHeight;
                }
                LayoutParams layoutParams3 = (LayoutParams) virtualChildAt4.getLayoutParams();
                float f7 = ((LinearLayout.LayoutParams) layoutParams3).weight;
                float f8 = f6 + f7;
                if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) layoutParams3).height == 0 && f7 > 0.0f) {
                    int i42 = this.mTotalLength;
                    this.mTotalLength = Math.max(i42, ((LinearLayout.LayoutParams) layoutParams3).topMargin + i42 + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                    i16 = i20;
                    i12 = virtualChildCount;
                    i13 = mode2;
                    z4 = true;
                    view = virtualChildAt4;
                    i15 = i22;
                    i14 = i23;
                    z = z3;
                } else {
                    if (((LinearLayout.LayoutParams) layoutParams3).height != 0 || f7 <= 0.0f) {
                        i9 = Integer.MIN_VALUE;
                    } else {
                        ((LinearLayout.LayoutParams) layoutParams3).height = -2;
                        i9 = 0;
                    }
                    if (f8 == 0.0f) {
                        int i43 = i23;
                        i11 = this.mTotalLength;
                        i10 = i43;
                    } else {
                        i10 = i23;
                        i11 = 0;
                    }
                    int i44 = i21;
                    i12 = virtualChildCount;
                    i13 = mode2;
                    i14 = i10;
                    i15 = i22;
                    view = virtualChildAt4;
                    z = z3;
                    i16 = i20;
                    measureChildBeforeLayout(view, i19, i, 0, i2, i11);
                    if (i9 != Integer.MIN_VALUE) {
                        ((LinearLayout.LayoutParams) layoutParams3).height = i9;
                    }
                    int measuredHeight2 = view.getMeasuredHeight();
                    int i45 = this.mTotalLength;
                    this.mTotalLength = Math.max(i45, getNextLocationOffset(view) + i45 + measuredHeight2 + ((LinearLayout.LayoutParams) layoutParams3).topMargin + ((LinearLayout.LayoutParams) layoutParams3).bottomMargin);
                    i21 = z ? Math.max(measuredHeight2, i44) : i44;
                }
                if (i18 >= 0 && i18 == i19 + 1) {
                    this.mBaselineChildTop = this.mTotalLength;
                }
                if (i19 < i18 && ((LinearLayout.LayoutParams) layoutParams3).weight > 0.0f) {
                    kbs.g("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    return;
                }
                if (mode == 1073741824 || ((LinearLayout.LayoutParams) layoutParams3).width != -1) {
                    z2 = false;
                } else {
                    z2 = true;
                    z5 = true;
                }
                int i46 = ((LinearLayout.LayoutParams) layoutParams3).leftMargin + ((LinearLayout.LayoutParams) layoutParams3).rightMargin;
                int measuredWidth2 = view.getMeasuredWidth() + i46;
                max = Math.max(i15, measuredWidth2);
                int i47 = i21;
                int combineMeasuredStates = View.combineMeasuredStates(i14, view.getMeasuredState());
                if (z6) {
                    i17 = combineMeasuredStates;
                    if (((LinearLayout.LayoutParams) layoutParams3).width == -1) {
                        z6 = true;
                        if (((LinearLayout.LayoutParams) layoutParams3).weight <= 0.0f) {
                            if (!z2) {
                                i46 = measuredWidth2;
                            }
                            i16 = Math.max(i16, i46);
                        } else {
                            if (!z2) {
                                i46 = measuredWidth2;
                            }
                            i24 = Math.max(i24, i46);
                        }
                        i19 += getChildrenSkipCount(view, i19);
                        f = f8;
                        i21 = i47;
                        i23 = i17;
                        i19++;
                        i22 = max;
                        i20 = i16;
                        z3 = z;
                        mode2 = i13;
                        virtualChildCount = i12;
                    }
                } else {
                    i17 = combineMeasuredStates;
                }
                z6 = false;
                if (((LinearLayout.LayoutParams) layoutParams3).weight <= 0.0f) {
                }
                i19 += getChildrenSkipCount(view, i19);
                f = f8;
                i21 = i47;
                i23 = i17;
                i19++;
                i22 = max;
                i20 = i16;
                z3 = z;
                mode2 = i13;
                virtualChildCount = i12;
            }
            i16 = i20;
            i12 = virtualChildCount;
            i13 = mode2;
            z = z3;
            f = f6;
            max = i22;
            i19++;
            i22 = max;
            i20 = i16;
            z3 = z;
            mode2 = i13;
            virtualChildCount = i12;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDivider == null) {
            return;
        }
        if (this.mOrientation == 1) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(ACCESSIBILITY_CLASS_NAME);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.mOrientation == 1) {
            layoutVertical(i, i2, i3, i4);
        } else {
            layoutHorizontal(i, i2, i3, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        if (this.mOrientation == 1) {
            measureVertical(i, i2);
        } else {
            measureHorizontal(i, i2);
        }
    }

    public void setBaselineAligned(boolean z) {
        this.mBaselineAligned = z;
    }

    public void setBaselineAlignedChildIndex(int i) {
        if (i < 0 || i >= getChildCount()) {
            kbs.i("base aligned child index out of range (0, ", getChildCount(), Extension.C_BRAKE);
        } else {
            this.mBaselineAlignedChildIndex = i;
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    public void setGravity(int i) {
        if (this.mGravity != i) {
            if ((8388615 & i) == 0) {
                i |= 8388611;
            }
            if ((i & 112) == 0) {
                i |= 48;
            }
            this.mGravity = i;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i) {
        int i2 = i & 8388615;
        int i3 = this.mGravity;
        if ((8388615 & i3) != i2) {
            this.mGravity = i2 | ((-8388616) & i3);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    public void setOrientation(int i) {
        if (this.mOrientation != i) {
            this.mOrientation = i;
            requestLayout();
        }
    }

    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
        }
        this.mShowDividers = i;
    }

    public void setVerticalGravity(int i) {
        int i2 = i & 112;
        int i3 = this.mGravity;
        if ((i3 & 112) != i2) {
            this.mGravity = i2 | (i3 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f) {
        this.mWeightSum = Math.max(0.0f, f);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public static class LayoutParams extends LinearLayout.LayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(int i, int i2, float f) {
            super(i, i2, f);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public LinearLayoutCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(Context context) {
        this(context, null);
    }
}
