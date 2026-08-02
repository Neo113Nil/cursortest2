package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import defpackage.gnr;
import defpackage.hnr;
import defpackage.ny61;
import defpackage.oyr;
import defpackage.shr;
import defpackage.v2i0;
import defpackage.w511;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes10.dex */
public class FlexboxLayout extends ViewGroup implements shr {
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    private int mAlignContent;
    private int mAlignItems;
    private Drawable mDividerDrawableHorizontal;
    private Drawable mDividerDrawableVertical;
    private int mDividerHorizontalHeight;
    private int mDividerVerticalWidth;
    private int mFlexDirection;
    private List<a> mFlexLines;
    private gnr mFlexLinesResult;
    private int mFlexWrap;
    private b mFlexboxHelper;
    private int mJustifyContent;
    private int mMaxLine;
    private SparseIntArray mOrderCache;
    private int[] mReorderedIndices;
    private int mShowDividerHorizontal;
    private int mShowDividerVertical;

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mMaxLine = -1;
        this.mFlexboxHelper = new b(this);
        this.mFlexLines = new ArrayList();
        this.mFlexLinesResult = new gnr();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v2i0.FlexboxLayout, i, 0);
        this.mFlexDirection = obtainStyledAttributes.getInt(v2i0.FlexboxLayout_flexDirection, 0);
        this.mFlexWrap = obtainStyledAttributes.getInt(v2i0.FlexboxLayout_flexWrap, 0);
        this.mJustifyContent = obtainStyledAttributes.getInt(v2i0.FlexboxLayout_justifyContent, 0);
        this.mAlignItems = obtainStyledAttributes.getInt(v2i0.FlexboxLayout_alignItems, 0);
        this.mAlignContent = obtainStyledAttributes.getInt(v2i0.FlexboxLayout_alignContent, 0);
        this.mMaxLine = obtainStyledAttributes.getInt(v2i0.FlexboxLayout_maxLine, -1);
        Drawable drawable = obtainStyledAttributes.getDrawable(v2i0.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = obtainStyledAttributes.getDrawable(v2i0.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = obtainStyledAttributes.getDrawable(v2i0.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i2 = obtainStyledAttributes.getInt(v2i0.FlexboxLayout_showDivider, 0);
        if (i2 != 0) {
            this.mShowDividerVertical = i2;
            this.mShowDividerHorizontal = i2;
        }
        int i3 = obtainStyledAttributes.getInt(v2i0.FlexboxLayout_showDividerVertical, 0);
        if (i3 != 0) {
            this.mShowDividerVertical = i3;
        }
        int i4 = obtainStyledAttributes.getInt(v2i0.FlexboxLayout_showDividerHorizontal, 0);
        if (i4 != 0) {
            this.mShowDividerHorizontal = i4;
        }
        obtainStyledAttributes.recycle();
    }

    private boolean allFlexLinesAreDummyBefore(int i) {
        for (int i2 = 0; i2 < i; i2++) {
            if (this.mFlexLines.get(i2).a() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean allViewsAreGoneBefore(int i, int i2) {
        for (int i3 = 1; i3 <= i2; i3++) {
            View reorderedChildAt = getReorderedChildAt(i - i3);
            if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void drawDividersHorizontal(Canvas canvas, boolean z, boolean z2) {
        int paddingLeft = getPaddingLeft();
        int max = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.mFlexLines.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.mFlexLines.get(i);
            for (int i2 = 0; i2 < aVar.h; i2++) {
                int i3 = aVar.o + i2;
                View reorderedChildAt = getReorderedChildAt(i3);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i3, i2)) {
                        drawVerticalDivider(canvas, z ? reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDividerVerticalWidth, aVar.b, aVar.g);
                    }
                    if (i2 == aVar.h - 1 && (this.mShowDividerVertical & 4) > 0) {
                        drawVerticalDivider(canvas, z ? (reorderedChildAt.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.mDividerVerticalWidth : reorderedChildAt.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, aVar.b, aVar.g);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i)) {
                drawHorizontalDivider(canvas, paddingLeft, z2 ? aVar.d : aVar.b - this.mDividerHorizontalHeight, max);
            }
            if (hasEndDividerAfterFlexLine(i) && (this.mShowDividerHorizontal & 4) > 0) {
                drawHorizontalDivider(canvas, paddingLeft, z2 ? aVar.b - this.mDividerHorizontalHeight : aVar.d, max);
            }
        }
    }

    private void drawDividersVertical(Canvas canvas, boolean z, boolean z2) {
        int paddingTop = getPaddingTop();
        int max = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.mFlexLines.size();
        for (int i = 0; i < size; i++) {
            a aVar = this.mFlexLines.get(i);
            for (int i2 = 0; i2 < aVar.h; i2++) {
                int i3 = aVar.o + i2;
                View reorderedChildAt = getReorderedChildAt(i3);
                if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                    if (hasDividerBeforeChildAtAlongMainAxis(i3, i2)) {
                        drawHorizontalDivider(canvas, aVar.a, z2 ? reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDividerHorizontalHeight, aVar.g);
                    }
                    if (i2 == aVar.h - 1 && (this.mShowDividerHorizontal & 4) > 0) {
                        drawHorizontalDivider(canvas, aVar.a, z2 ? (reorderedChildAt.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.mDividerHorizontalHeight : reorderedChildAt.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, aVar.g);
                    }
                }
            }
            if (hasDividerBeforeFlexLine(i)) {
                drawVerticalDivider(canvas, z ? aVar.c : aVar.a - this.mDividerVerticalWidth, paddingTop, max);
            }
            if (hasEndDividerAfterFlexLine(i) && (this.mShowDividerVertical & 4) > 0) {
                drawVerticalDivider(canvas, z ? aVar.a - this.mDividerVerticalWidth : aVar.c, paddingTop, max);
            }
        }
    }

    private void drawHorizontalDivider(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.mDividerDrawableHorizontal;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, i3 + i, this.mDividerHorizontalHeight + i2);
        this.mDividerDrawableHorizontal.draw(canvas);
    }

    private void drawVerticalDivider(Canvas canvas, int i, int i2, int i3) {
        Drawable drawable = this.mDividerDrawableVertical;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i, i2, this.mDividerVerticalWidth + i, i3 + i2);
        this.mDividerDrawableVertical.draw(canvas);
    }

    private boolean hasDividerBeforeChildAtAlongMainAxis(int i, int i2) {
        return allViewsAreGoneBefore(i, i2) ? isMainAxisDirectionHorizontal() ? (this.mShowDividerVertical & 1) != 0 : (this.mShowDividerHorizontal & 1) != 0 : isMainAxisDirectionHorizontal() ? (this.mShowDividerVertical & 2) != 0 : (this.mShowDividerHorizontal & 2) != 0;
    }

    private boolean hasDividerBeforeFlexLine(int i) {
        if (i >= 0 && i < this.mFlexLines.size()) {
            if (allFlexLinesAreDummyBefore(i)) {
                return isMainAxisDirectionHorizontal() ? (this.mShowDividerHorizontal & 1) != 0 : (this.mShowDividerVertical & 1) != 0;
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 2) != 0;
            }
            if ((this.mShowDividerVertical & 2) != 0) {
                return true;
            }
        }
        return false;
    }

    private boolean hasEndDividerAfterFlexLine(int i) {
        if (i >= 0 && i < this.mFlexLines.size()) {
            for (int i2 = i + 1; i2 < this.mFlexLines.size(); i2++) {
                if (this.mFlexLines.get(i2).a() > 0) {
                    return false;
                }
            }
            if (isMainAxisDirectionHorizontal()) {
                return (this.mShowDividerHorizontal & 4) != 0;
            }
            if ((this.mShowDividerVertical & 4) != 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void layoutHorizontal(boolean z, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        View view;
        a aVar;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i10 = i3 - i;
        int paddingBottom = (i4 - i2) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.mFlexLines.size();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar2 = this.mFlexLines.get(i11);
            if (hasDividerBeforeFlexLine(i11)) {
                int i12 = this.mDividerHorizontalHeight;
                paddingBottom -= i12;
                paddingTop += i12;
            }
            int i13 = paddingBottom;
            int i14 = this.mJustifyContent;
            char c = 4;
            int i15 = 2;
            boolean z3 = true;
            if (i14 == 0) {
                f = paddingLeft;
                f2 = i10 - paddingRight;
            } else if (i14 == 1) {
                int i16 = aVar2.e;
                f2 = i16 - paddingLeft;
                f = (i10 - i16) + paddingRight;
            } else if (i14 != 2) {
                if (i14 == 3) {
                    f = paddingLeft;
                    f3 = (i10 - aVar2.e) / (aVar2.a() != 1 ? r7 - 1 : 1.0f);
                    f2 = i10 - paddingRight;
                } else if (i14 == 4) {
                    int a = aVar2.a();
                    float f4 = a != 0 ? (i10 - aVar2.e) / a : 0.0f;
                    float f5 = f4 / 2.0f;
                    f = paddingLeft + f5;
                    float f6 = (i10 - paddingRight) - f5;
                    f3 = f4;
                    f2 = f6;
                } else {
                    if (i14 != 5) {
                        w511.d(this.mJustifyContent, "Invalid justifyContent is set: ");
                        return;
                    }
                    f3 = aVar2.a() != 0 ? (i10 - aVar2.e) / (r3 + 1) : 0.0f;
                    f = paddingLeft + f3;
                    f2 = (i10 - paddingRight) - f3;
                }
                float max = Math.max(f3, 0.0f);
                i5 = 0;
                while (i5 < aVar2.h) {
                    int i17 = aVar2.o + i5;
                    View reorderedChildAt = getReorderedChildAt(i17);
                    char c2 = c;
                    if (reorderedChildAt != null) {
                        boolean z4 = z3;
                        if (reorderedChildAt.getVisibility() == 8) {
                            z2 = z4;
                        } else {
                            LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                            float f7 = f + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                            float f8 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            if (hasDividerBeforeChildAtAlongMainAxis(i17, i5)) {
                                int i18 = this.mDividerVerticalWidth;
                                float f9 = i18;
                                f7 += f9;
                                f8 -= f9;
                                i9 = i18;
                            } else {
                                i9 = 0;
                            }
                            float f10 = f8;
                            int i19 = (i5 != aVar2.h + (-1) || (this.mShowDividerVertical & 4) <= 0) ? 0 : this.mDividerVerticalWidth;
                            if (this.mFlexWrap == i15) {
                                int i20 = i15;
                                b bVar = this.mFlexboxHelper;
                                if (z) {
                                    i7 = i20;
                                    i8 = i5;
                                    view = reorderedChildAt;
                                    z2 = z4;
                                    bVar.o(view, aVar2, Math.round(f10) - reorderedChildAt.getMeasuredWidth(), i13 - reorderedChildAt.getMeasuredHeight(), Math.round(f10), i13);
                                } else {
                                    i8 = i5;
                                    view = reorderedChildAt;
                                    z2 = z4;
                                    i7 = i20;
                                    bVar.o(view, aVar2, Math.round(f7), i13 - view.getMeasuredHeight(), view.getMeasuredWidth() + Math.round(f7), i13);
                                }
                                i6 = i13;
                            } else {
                                i8 = i5;
                                view = reorderedChildAt;
                                z2 = z4;
                                i7 = i15;
                                i6 = i13;
                                b bVar2 = this.mFlexboxHelper;
                                if (z) {
                                    bVar2.o(view, aVar2, Math.round(f10) - view.getMeasuredWidth(), paddingTop, Math.round(f10), view.getMeasuredHeight() + paddingTop);
                                } else {
                                    int i21 = paddingTop;
                                    bVar2.o(view, aVar2, Math.round(f7), i21, view.getMeasuredWidth() + Math.round(f7), view.getMeasuredHeight() + i21);
                                    paddingTop = i21;
                                }
                            }
                            f = f7 + view.getMeasuredWidth() + max + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                            float measuredWidth = f10 - ((view.getMeasuredWidth() + max) + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin);
                            if (z) {
                                aVar = aVar2;
                                aVar.b(i19, 0, i9, 0, view);
                            } else {
                                aVar = aVar2;
                                aVar.b(i9, 0, i19, 0, view);
                            }
                            aVar2 = aVar;
                            f2 = measuredWidth;
                            i5 = i8 + 1;
                            c = c2;
                            i15 = i7;
                            z3 = z2;
                            i13 = i6;
                        }
                    } else {
                        z2 = z3;
                    }
                    i7 = i15;
                    i8 = i5;
                    i6 = i13;
                    i5 = i8 + 1;
                    c = c2;
                    i15 = i7;
                    z3 = z2;
                    i13 = i6;
                }
                int i22 = aVar2.g;
                paddingTop += i22;
                paddingBottom = i13 - i22;
            } else {
                int i23 = aVar2.e;
                f = paddingLeft + ((i10 - i23) / 2.0f);
                f2 = (i10 - paddingRight) - ((i10 - i23) / 2.0f);
            }
            f3 = 0.0f;
            float max2 = Math.max(f3, 0.0f);
            i5 = 0;
            while (i5 < aVar2.h) {
            }
            int i222 = aVar2.g;
            paddingTop += i222;
            paddingBottom = i13 - i222;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void layoutVertical(boolean z, boolean z2, int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        int i5;
        char c;
        int i6;
        int i7;
        int i8;
        int i9;
        View view;
        a aVar;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i10 = i4 - i2;
        int i11 = (i3 - i) - paddingRight;
        int size = this.mFlexLines.size();
        for (int i12 = 0; i12 < size; i12++) {
            a aVar2 = this.mFlexLines.get(i12);
            if (hasDividerBeforeFlexLine(i12)) {
                int i13 = this.mDividerVerticalWidth;
                paddingLeft += i13;
                i11 -= i13;
            }
            int i14 = i11;
            int i15 = this.mJustifyContent;
            char c2 = 4;
            int i16 = 1;
            if (i15 == 0) {
                f = paddingTop;
                f2 = i10 - paddingBottom;
            } else if (i15 == 1) {
                int i17 = aVar2.e;
                f2 = i17 - paddingTop;
                f = (i10 - i17) + paddingBottom;
            } else if (i15 != 2) {
                if (i15 == 3) {
                    f = paddingTop;
                    f3 = (i10 - aVar2.e) / (aVar2.a() != 1 ? r13 - 1 : 1.0f);
                    f2 = i10 - paddingBottom;
                } else if (i15 == 4) {
                    int a = aVar2.a();
                    f3 = a != 0 ? (i10 - aVar2.e) / a : 0.0f;
                    float f4 = f3 / 2.0f;
                    f = paddingTop + f4;
                    f2 = (i10 - paddingBottom) - f4;
                } else {
                    if (i15 != 5) {
                        w511.d(this.mJustifyContent, "Invalid justifyContent is set: ");
                        return;
                    }
                    f3 = aVar2.a() != 0 ? (i10 - aVar2.e) / (r5 + 1) : 0.0f;
                    f = paddingTop + f3;
                    f2 = (i10 - paddingBottom) - f3;
                }
                float max = Math.max(f3, 0.0f);
                i5 = 0;
                while (i5 < aVar2.h) {
                    int i18 = aVar2.o + i5;
                    View reorderedChildAt = getReorderedChildAt(i18);
                    if (reorderedChildAt != null) {
                        c = c2;
                        if (reorderedChildAt.getVisibility() != 8) {
                            LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                            float f5 = f + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                            float f6 = f2 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            if (hasDividerBeforeChildAtAlongMainAxis(i18, i5)) {
                                i9 = this.mDividerHorizontalHeight;
                                float f7 = i9;
                                f5 += f7;
                                f6 -= f7;
                            } else {
                                i9 = 0;
                            }
                            float f8 = f6;
                            int i19 = (i5 != aVar2.h - i16 || (this.mShowDividerHorizontal & 4) <= 0) ? 0 : this.mDividerHorizontalHeight;
                            if (z) {
                                int i20 = i5;
                                b bVar = this.mFlexboxHelper;
                                if (z2) {
                                    i8 = i16;
                                    view = reorderedChildAt;
                                    i7 = i20;
                                    bVar.p(view, aVar2, true, i14 - reorderedChildAt.getMeasuredWidth(), Math.round(f8) - reorderedChildAt.getMeasuredHeight(), i14, Math.round(f8));
                                } else {
                                    i8 = i16;
                                    i7 = i20;
                                    view = reorderedChildAt;
                                    bVar.p(view, aVar2, true, i14 - view.getMeasuredWidth(), Math.round(f5), i14, view.getMeasuredHeight() + Math.round(f5));
                                }
                                i6 = i14;
                            } else {
                                i7 = i5;
                                i8 = i16;
                                view = reorderedChildAt;
                                i6 = i14;
                                b bVar2 = this.mFlexboxHelper;
                                if (z2) {
                                    bVar2.p(view, aVar2, false, paddingLeft, Math.round(f8) - view.getMeasuredHeight(), view.getMeasuredWidth() + paddingLeft, Math.round(f8));
                                } else {
                                    int i21 = paddingLeft;
                                    bVar2.p(view, aVar2, false, i21, Math.round(f5), view.getMeasuredWidth() + i21, view.getMeasuredHeight() + Math.round(f5));
                                    paddingLeft = i21;
                                }
                            }
                            f = f5 + view.getMeasuredHeight() + max + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                            float measuredHeight = f8 - ((view.getMeasuredHeight() + max) + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin);
                            if (z2) {
                                aVar = aVar2;
                                aVar.b(0, i19, 0, i9, view);
                            } else {
                                aVar = aVar2;
                                aVar.b(0, i9, 0, i19, view);
                            }
                            aVar2 = aVar;
                            f2 = measuredHeight;
                            i5 = i7 + 1;
                            c2 = c;
                            i16 = i8;
                            i14 = i6;
                        }
                    } else {
                        c = c2;
                    }
                    i7 = i5;
                    i8 = i16;
                    i6 = i14;
                    i5 = i7 + 1;
                    c2 = c;
                    i16 = i8;
                    i14 = i6;
                }
                int i22 = aVar2.g;
                paddingLeft += i22;
                i11 = i14 - i22;
            } else {
                int i23 = aVar2.e;
                f = paddingTop + ((i10 - i23) / 2.0f);
                f2 = (i10 - paddingBottom) - ((i10 - i23) / 2.0f);
            }
            f3 = 0.0f;
            float max2 = Math.max(f3, 0.0f);
            i5 = 0;
            while (i5 < aVar2.h) {
            }
            int i222 = aVar2.g;
            paddingLeft += i222;
            i11 = i14 - i222;
        }
    }

    private void measureHorizontal(int i, int i2) {
        this.mFlexLines.clear();
        gnr gnrVar = this.mFlexLinesResult;
        gnrVar.a = null;
        gnrVar.b = 0;
        this.mFlexboxHelper.b(gnrVar, i, i2, Integer.MAX_VALUE, 0, -1, null);
        this.mFlexLines = this.mFlexLinesResult.a;
        this.mFlexboxHelper.h(i, i2, 0);
        if (this.mAlignItems == 3) {
            for (a aVar : this.mFlexLines) {
                int i3 = Integer.MIN_VALUE;
                for (int i4 = 0; i4 < aVar.h; i4++) {
                    View reorderedChildAt = getReorderedChildAt(aVar.o + i4);
                    if (reorderedChildAt != null && reorderedChildAt.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) reorderedChildAt.getLayoutParams();
                        int i5 = this.mFlexWrap;
                        int i6 = aVar.l;
                        i3 = i5 != 2 ? Math.max(i3, reorderedChildAt.getMeasuredHeight() + Math.max(i6 - reorderedChildAt.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(i3, reorderedChildAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max(reorderedChildAt.getBaseline() + (i6 - reorderedChildAt.getMeasuredHeight()), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                aVar.g = i3;
            }
        }
        this.mFlexboxHelper.g(i, i2, getPaddingBottom() + getPaddingTop());
        this.mFlexboxHelper.u(0);
        setMeasuredDimensionForFlex(this.mFlexDirection, i, i2, this.mFlexLinesResult.b);
    }

    private void measureVertical(int i, int i2) {
        this.mFlexLines.clear();
        gnr gnrVar = this.mFlexLinesResult;
        gnrVar.a = null;
        gnrVar.b = 0;
        this.mFlexboxHelper.b(gnrVar, i2, i, Integer.MAX_VALUE, 0, -1, null);
        this.mFlexLines = this.mFlexLinesResult.a;
        this.mFlexboxHelper.h(i, i2, 0);
        this.mFlexboxHelper.g(i, i2, getPaddingRight() + getPaddingLeft());
        this.mFlexboxHelper.u(0);
        setMeasuredDimensionForFlex(this.mFlexDirection, i, i2, this.mFlexLinesResult.b);
    }

    private void setMeasuredDimensionForFlex(int i, int i2, int i3, int i4) {
        int paddingBottom;
        int largestMainSize;
        int resolveSizeAndState;
        int resolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (i == 0 || i == 1) {
            paddingBottom = getPaddingBottom() + getPaddingTop() + getSumOfCrossSize();
            largestMainSize = getLargestMainSize();
        } else {
            if (i != 2 && i != 3) {
                ny61.g(oyr.i(i, "Invalid flex direction: "));
                return;
            }
            paddingBottom = getLargestMainSize();
            largestMainSize = getPaddingRight() + getPaddingLeft() + getSumOfCrossSize();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            } else {
                size = largestMainSize;
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        } else if (mode == 0) {
            resolveSizeAndState = View.resolveSizeAndState(largestMainSize, i2, i4);
        } else if (mode != 1073741824) {
            ny61.r(oyr.i(mode, "Unknown width mode is set: "));
            return;
        } else {
            if (size < largestMainSize) {
                i4 = View.combineMeasuredStates(i4, 16777216);
            }
            resolveSizeAndState = View.resolveSizeAndState(size, i2, i4);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            } else {
                size2 = paddingBottom;
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        } else if (mode2 == 0) {
            resolveSizeAndState2 = View.resolveSizeAndState(paddingBottom, i3, i4);
        } else if (mode2 != 1073741824) {
            ny61.r(oyr.i(mode2, "Unknown height mode is set: "));
            return;
        } else {
            if (size2 < paddingBottom) {
                i4 = View.combineMeasuredStates(i4, 256);
            }
            resolveSizeAndState2 = View.resolveSizeAndState(size2, i3, i4);
        }
        setMeasuredDimension(resolveSizeAndState, resolveSizeAndState2);
    }

    private void setWillNotDrawFlag() {
        if (this.mDividerDrawableHorizontal == null && this.mDividerDrawableVertical == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        b bVar = this.mFlexboxHelper;
        SparseIntArray sparseIntArray = this.mOrderCache;
        shr shrVar = bVar.a;
        int flexItemCount = shrVar.getFlexItemCount();
        ArrayList f = bVar.f(flexItemCount);
        hnr hnrVar = new hnr();
        if (view == null || !(layoutParams instanceof FlexItem)) {
            hnrVar.b = 1;
        } else {
            hnrVar.b = ((FlexItem) layoutParams).getOrder();
        }
        if (i == -1 || i == flexItemCount) {
            hnrVar.a = flexItemCount;
        } else if (i < shrVar.getFlexItemCount()) {
            hnrVar.a = i;
            for (int i2 = i; i2 < flexItemCount; i2++) {
                ((hnr) f.get(i2)).a++;
            }
        } else {
            hnrVar.a = flexItemCount;
        }
        f.add(hnrVar);
        this.mReorderedIndices = b.r(flexItemCount + 1, f, sparseIntArray);
        super.addView(view, i, layoutParams);
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams ? new LayoutParams((LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // defpackage.shr
    public int getAlignContent() {
        return this.mAlignContent;
    }

    @Override // defpackage.shr
    public int getAlignItems() {
        return this.mAlignItems;
    }

    @Override // defpackage.shr
    public int getChildHeightMeasureSpec(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // defpackage.shr
    public int getChildWidthMeasureSpec(int i, int i2, int i3) {
        return ViewGroup.getChildMeasureSpec(i, i2, i3);
    }

    @Override // defpackage.shr
    public int getDecorationLengthCrossAxis(View view) {
        return 0;
    }

    @Override // defpackage.shr
    public int getDecorationLengthMainAxis(View view, int i, int i2) {
        int i3;
        int i4;
        if (isMainAxisDirectionHorizontal()) {
            i3 = hasDividerBeforeChildAtAlongMainAxis(i, i2) ? this.mDividerVerticalWidth : 0;
            if ((this.mShowDividerVertical & 4) <= 0) {
                return i3;
            }
            i4 = this.mDividerVerticalWidth;
        } else {
            i3 = hasDividerBeforeChildAtAlongMainAxis(i, i2) ? this.mDividerHorizontalHeight : 0;
            if ((this.mShowDividerHorizontal & 4) <= 0) {
                return i3;
            }
            i4 = this.mDividerHorizontalHeight;
        }
        return i3 + i4;
    }

    public Drawable getDividerDrawableHorizontal() {
        return this.mDividerDrawableHorizontal;
    }

    public Drawable getDividerDrawableVertical() {
        return this.mDividerDrawableVertical;
    }

    @Override // defpackage.shr
    public int getFlexDirection() {
        return this.mFlexDirection;
    }

    @Override // defpackage.shr
    public View getFlexItemAt(int i) {
        return getChildAt(i);
    }

    @Override // defpackage.shr
    public int getFlexItemCount() {
        return getChildCount();
    }

    public List<a> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.mFlexLines.size());
        for (a aVar : this.mFlexLines) {
            if (aVar.a() != 0) {
                arrayList.add(aVar);
            }
        }
        return arrayList;
    }

    @Override // defpackage.shr
    public List<a> getFlexLinesInternal() {
        return this.mFlexLines;
    }

    @Override // defpackage.shr
    public int getFlexWrap() {
        return this.mFlexWrap;
    }

    public int getJustifyContent() {
        return this.mJustifyContent;
    }

    @Override // defpackage.shr
    public int getLargestMainSize() {
        Iterator<a> it = this.mFlexLines.iterator();
        int i = Integer.MIN_VALUE;
        while (it.hasNext()) {
            i = Math.max(i, it.next().e);
        }
        return i;
    }

    @Override // defpackage.shr
    public int getMaxLine() {
        return this.mMaxLine;
    }

    public View getReorderedChildAt(int i) {
        if (i < 0) {
            return null;
        }
        int[] iArr = this.mReorderedIndices;
        if (i >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i]);
    }

    @Override // defpackage.shr
    public View getReorderedFlexItemAt(int i) {
        return getReorderedChildAt(i);
    }

    public int getShowDividerHorizontal() {
        return this.mShowDividerHorizontal;
    }

    public int getShowDividerVertical() {
        return this.mShowDividerVertical;
    }

    @Override // defpackage.shr
    public int getSumOfCrossSize() {
        int size = this.mFlexLines.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            a aVar = this.mFlexLines.get(i2);
            if (hasDividerBeforeFlexLine(i2)) {
                i += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            if (hasEndDividerAfterFlexLine(i2)) {
                i += isMainAxisDirectionHorizontal() ? this.mDividerHorizontalHeight : this.mDividerVerticalWidth;
            }
            i += aVar.g;
        }
        return i;
    }

    @Override // defpackage.shr
    public boolean isMainAxisDirectionHorizontal() {
        int i = this.mFlexDirection;
        return i == 0 || i == 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.mDividerDrawableVertical == null && this.mDividerDrawableHorizontal == null) {
            return;
        }
        if (this.mShowDividerHorizontal == 0 && this.mShowDividerVertical == 0) {
            return;
        }
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        int layoutDirection = getLayoutDirection();
        int i = this.mFlexDirection;
        if (i == 0) {
            drawDividersHorizontal(canvas, layoutDirection == 1, this.mFlexWrap == 2);
            return;
        }
        if (i == 1) {
            drawDividersHorizontal(canvas, layoutDirection != 1, this.mFlexWrap == 2);
            return;
        }
        if (i == 2) {
            boolean z = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z = !z;
            }
            drawDividersVertical(canvas, z, false);
            return;
        }
        if (i != 3) {
            return;
        }
        boolean z2 = layoutDirection == 1;
        if (this.mFlexWrap == 2) {
            z2 = !z2;
        }
        drawDividersVertical(canvas, z2, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean z2;
        FlexboxLayout flexboxLayout;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        FlexboxLayout flexboxLayout2;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        WeakHashMap weakHashMap = androidx.core.view.b.a;
        int layoutDirection = getLayoutDirection();
        int i13 = this.mFlexDirection;
        if (i13 == 0) {
            if (layoutDirection == 1) {
                z2 = true;
                flexboxLayout = this;
                i5 = i;
                i8 = i2;
                i7 = i4;
                i6 = i3;
            } else {
                z2 = false;
                flexboxLayout = this;
                i5 = i;
                i6 = i3;
                i7 = i4;
                i8 = i2;
            }
            flexboxLayout.layoutHorizontal(z2, i5, i8, i6, i7);
            return;
        }
        if (i13 != 1) {
            if (i13 == 2) {
                z4 = layoutDirection == 1;
                if (this.mFlexWrap == 2) {
                    z4 = !z4;
                }
                layoutVertical(z4, false, i, i2, i3, i4);
                return;
            }
            if (i13 != 3) {
                w511.d(this.mFlexDirection, "Invalid flex direction is set: ");
                return;
            }
            z4 = layoutDirection == 1;
            if (this.mFlexWrap == 2) {
                z4 = !z4;
            }
            layoutVertical(z4, true, i, i2, i3, i4);
            return;
        }
        if (layoutDirection != 1) {
            z3 = true;
            flexboxLayout2 = this;
            i9 = i;
            i12 = i2;
            i11 = i4;
            i10 = i3;
        } else {
            z3 = false;
            flexboxLayout2 = this;
            i9 = i;
            i10 = i3;
            i11 = i4;
            i12 = i2;
        }
        flexboxLayout2.layoutHorizontal(z3, i9, i12, i10, i11);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        if (this.mOrderCache == null) {
            this.mOrderCache = new SparseIntArray(getChildCount());
        }
        b bVar = this.mFlexboxHelper;
        SparseIntArray sparseIntArray = this.mOrderCache;
        shr shrVar = bVar.a;
        int flexItemCount = shrVar.getFlexItemCount();
        if (sparseIntArray.size() == flexItemCount) {
            for (int i4 = 0; i4 < flexItemCount; i4++) {
                View flexItemAt = shrVar.getFlexItemAt(i4);
                if (flexItemAt == null || ((FlexItem) flexItemAt.getLayoutParams()).getOrder() == sparseIntArray.get(i4)) {
                }
            }
            i3 = this.mFlexDirection;
            if (i3 == 0 && i3 != 1) {
                if (i3 == 2 || i3 == 3) {
                    measureVertical(i, i2);
                    return;
                } else {
                    w511.d(this.mFlexDirection, "Invalid value for the flex direction is set: ");
                    return;
                }
            }
            measureHorizontal(i, i2);
        }
        b bVar2 = this.mFlexboxHelper;
        SparseIntArray sparseIntArray2 = this.mOrderCache;
        int flexItemCount2 = bVar2.a.getFlexItemCount();
        this.mReorderedIndices = b.r(flexItemCount2, bVar2.f(flexItemCount2), sparseIntArray2);
        i3 = this.mFlexDirection;
        if (i3 == 0) {
        }
        measureHorizontal(i, i2);
    }

    @Override // defpackage.shr
    public void onNewFlexItemAdded(View view, int i, int i2, a aVar) {
        if (hasDividerBeforeChildAtAlongMainAxis(i, i2)) {
            if (isMainAxisDirectionHorizontal()) {
                int i3 = aVar.e;
                int i4 = this.mDividerVerticalWidth;
                aVar.e = i3 + i4;
                aVar.f += i4;
                return;
            }
            int i5 = aVar.e;
            int i6 = this.mDividerHorizontalHeight;
            aVar.e = i5 + i6;
            aVar.f += i6;
        }
    }

    @Override // defpackage.shr
    public void onNewFlexLineAdded(a aVar) {
        if (isMainAxisDirectionHorizontal()) {
            if ((this.mShowDividerVertical & 4) > 0) {
                int i = aVar.e;
                int i2 = this.mDividerVerticalWidth;
                aVar.e = i + i2;
                aVar.f += i2;
                return;
            }
            return;
        }
        if ((this.mShowDividerHorizontal & 4) > 0) {
            int i3 = aVar.e;
            int i4 = this.mDividerHorizontalHeight;
            aVar.e = i3 + i4;
            aVar.f += i4;
        }
    }

    public void setAlignContent(int i) {
        if (this.mAlignContent != i) {
            this.mAlignContent = i;
            requestLayout();
        }
    }

    public void setAlignItems(int i) {
        if (this.mAlignItems != i) {
            this.mAlignItems = i;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(Drawable drawable) {
        if (drawable == this.mDividerDrawableHorizontal) {
            return;
        }
        this.mDividerDrawableHorizontal = drawable;
        if (drawable != null) {
            this.mDividerHorizontalHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerHorizontalHeight = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    public void setDividerDrawableVertical(Drawable drawable) {
        if (drawable == this.mDividerDrawableVertical) {
            return;
        }
        this.mDividerDrawableVertical = drawable;
        if (drawable != null) {
            this.mDividerVerticalWidth = drawable.getIntrinsicWidth();
        } else {
            this.mDividerVerticalWidth = 0;
        }
        setWillNotDrawFlag();
        requestLayout();
    }

    public void setFlexDirection(int i) {
        if (this.mFlexDirection != i) {
            this.mFlexDirection = i;
            requestLayout();
        }
    }

    @Override // defpackage.shr
    public void setFlexLines(List<a> list) {
        this.mFlexLines = list;
    }

    public void setFlexWrap(int i) {
        if (this.mFlexWrap != i) {
            this.mFlexWrap = i;
            requestLayout();
        }
    }

    public void setJustifyContent(int i) {
        if (this.mJustifyContent != i) {
            this.mJustifyContent = i;
            requestLayout();
        }
    }

    public void setMaxLine(int i) {
        if (this.mMaxLine != i) {
            this.mMaxLine = i;
            requestLayout();
        }
    }

    public void setShowDivider(int i) {
        setShowDividerVertical(i);
        setShowDividerHorizontal(i);
    }

    public void setShowDividerHorizontal(int i) {
        if (i != this.mShowDividerHorizontal) {
            this.mShowDividerHorizontal = i;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i) {
        if (i != this.mShowDividerVertical) {
            this.mShowDividerVertical = i;
            requestLayout();
        }
    }

    @Override // defpackage.shr
    public void updateViewCache(int i, View view) {
    }

    @Override // android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new Parcelable.Creator<LayoutParams>() { // from class: com.google.android.flexbox.FlexboxLayout.LayoutParams.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public LayoutParams[] newArray(int i) {
                return new LayoutParams[i];
            }
        };
        private int mAlignSelf;
        private float mFlexBasisPercent;
        private float mFlexGrow;
        private float mFlexShrink;
        private int mMaxHeight;
        private int mMaxWidth;
        private int mMinHeight;
        private int mMinWidth;
        private int mOrder;
        private boolean mWrapBefore;

        public LayoutParams(Parcel parcel) {
            super(0, 0);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mOrder = parcel.readInt();
            this.mFlexGrow = parcel.readFloat();
            this.mFlexShrink = parcel.readFloat();
            this.mAlignSelf = parcel.readInt();
            this.mFlexBasisPercent = parcel.readFloat();
            this.mMinWidth = parcel.readInt();
            this.mMinHeight = parcel.readInt();
            this.mMaxWidth = parcel.readInt();
            this.mMaxHeight = parcel.readInt();
            this.mWrapBefore = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getAlignSelf() {
            return this.mAlignSelf;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexBasisPercent() {
            return this.mFlexBasisPercent;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexGrow() {
            return this.mFlexGrow;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float getFlexShrink() {
            return this.mFlexShrink;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginBottom() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginLeft() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginRight() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMarginTop() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxHeight() {
            return this.mMaxHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMaxWidth() {
            return this.mMaxWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinHeight() {
            return this.mMinHeight;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getMinWidth() {
            return this.mMinWidth;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.mOrder;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean isWrapBefore() {
            return this.mWrapBefore;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setAlignSelf(int i) {
            this.mAlignSelf = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexBasisPercent(float f) {
            this.mFlexBasisPercent = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexGrow(float f) {
            this.mFlexGrow = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setFlexShrink(float f) {
            this.mFlexShrink = f;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setHeight(int i) {
            ((ViewGroup.MarginLayoutParams) this).height = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxHeight(int i) {
            this.mMaxHeight = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMaxWidth(int i) {
            this.mMaxWidth = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinHeight(int i) {
            this.mMinHeight = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setMinWidth(int i) {
            this.mMinWidth = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setOrder(int i) {
            this.mOrder = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWidth(int i) {
            ((ViewGroup.MarginLayoutParams) this).width = i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void setWrapBefore(boolean z) {
            this.mWrapBefore = z;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.mOrder);
            parcel.writeFloat(this.mFlexGrow);
            parcel.writeFloat(this.mFlexShrink);
            parcel.writeInt(this.mAlignSelf);
            parcel.writeFloat(this.mFlexBasisPercent);
            parcel.writeInt(this.mMinWidth);
            parcel.writeInt(this.mMinHeight);
            parcel.writeInt(this.mMaxWidth);
            parcel.writeInt(this.mMaxHeight);
            parcel.writeByte(this.mWrapBefore ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            this.mOrder = layoutParams.mOrder;
            this.mFlexGrow = layoutParams.mFlexGrow;
            this.mFlexShrink = layoutParams.mFlexShrink;
            this.mAlignSelf = layoutParams.mAlignSelf;
            this.mFlexBasisPercent = layoutParams.mFlexBasisPercent;
            this.mMinWidth = layoutParams.mMinWidth;
            this.mMinHeight = layoutParams.mMinHeight;
            this.mMaxWidth = layoutParams.mMaxWidth;
            this.mMaxHeight = layoutParams.mMaxHeight;
            this.mWrapBefore = layoutParams.mWrapBefore;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(int i, int i2) {
            super(new ViewGroup.LayoutParams(i, i2));
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.mOrder = 1;
            this.mFlexGrow = 0.0f;
            this.mFlexShrink = 1.0f;
            this.mAlignSelf = -1;
            this.mFlexBasisPercent = -1.0f;
            this.mMinWidth = -1;
            this.mMinHeight = -1;
            this.mMaxWidth = 16777215;
            this.mMaxHeight = 16777215;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, v2i0.FlexboxLayout_Layout);
            this.mOrder = obtainStyledAttributes.getInt(v2i0.FlexboxLayout_Layout_layout_order, 1);
            this.mFlexGrow = obtainStyledAttributes.getFloat(v2i0.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.mFlexShrink = obtainStyledAttributes.getFloat(v2i0.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.mAlignSelf = obtainStyledAttributes.getInt(v2i0.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.mFlexBasisPercent = obtainStyledAttributes.getFraction(v2i0.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.mMinWidth = obtainStyledAttributes.getDimensionPixelSize(v2i0.FlexboxLayout_Layout_layout_minWidth, -1);
            this.mMinHeight = obtainStyledAttributes.getDimensionPixelSize(v2i0.FlexboxLayout_Layout_layout_minHeight, -1);
            this.mMaxWidth = obtainStyledAttributes.getDimensionPixelSize(v2i0.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.mMaxHeight = obtainStyledAttributes.getDimensionPixelSize(v2i0.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.mWrapBefore = obtainStyledAttributes.getBoolean(v2i0.FlexboxLayout_Layout_layout_wrapBefore, false);
            obtainStyledAttributes.recycle();
        }
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }
}
