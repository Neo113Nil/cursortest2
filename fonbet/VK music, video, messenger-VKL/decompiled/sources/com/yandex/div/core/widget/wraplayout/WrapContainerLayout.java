package com.yandex.div.core.widget.wraplayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;
import com.yandex.div.core.widget.AspectView;
import com.yandex.div.core.widget.ViewsKt;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.an10;
import xsna.b0u0;
import xsna.e43;
import xsna.fpf0;
import xsna.i9x;
import xsna.ir;
import xsna.iut0;
import xsna.kxt0;
import xsna.lhg;
import xsna.p5j;
import xsna.p7f0;
import xsna.qcy;
import xsna.s3q0;
import xsna.shy;
import xsna.vu5;
import xsna.z8x;
import xsna.zcl;

/* compiled from: WrapContainerLayout.kt */
/* loaded from: classes7.dex */
public class WrapContainerLayout extends DivViewGroup implements AspectView {
    static final /* synthetic */ qcy<Object>[] $$delegatedProperties = {new MutablePropertyReference1Impl(WrapContainerLayout.class, "showSeparators", "getShowSeparators()I", 0), p5j.a(0, WrapContainerLayout.class, "showLineSeparators", "getShowLineSeparators()I", fpf0.a), new MutablePropertyReference1Impl(WrapContainerLayout.class, "separatorDrawable", "getSeparatorDrawable()Landroid/graphics/drawable/Drawable;", 0), new MutablePropertyReference1Impl(WrapContainerLayout.class, "lineSeparatorDrawable", "getLineSeparatorDrawable()Landroid/graphics/drawable/Drawable;", 0), new MutablePropertyReference1Impl(WrapContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0)};
    private final p7f0 aspectRatio$delegate;
    private int childState;
    private int edgeLineSeparatorOffset;
    private boolean isRowDirection;
    private int itemSpacingPx;
    private final p7f0 lineSeparatorDrawable$delegate;
    private int lineSeparatorMarginBottom;
    private int lineSeparatorMarginLeft;
    private int lineSeparatorMarginRight;
    private int lineSeparatorMarginTop;
    private int lineSpacingPx;
    private final List<WrapLine> lines;
    private int middleLineSeparatorOffset;
    private final DivViewGroup.OffsetsHolder offsetsHolder;
    private final p7f0 separatorDrawable$delegate;
    private int separatorMarginBottom;
    private int separatorMarginLeft;
    private int separatorMarginRight;
    private int separatorMarginTop;
    private final p7f0 showLineSeparators$delegate;
    private final p7f0 showSeparators$delegate;
    private int tempSumCrossSize;
    private int wrapDirection;

    /* compiled from: WrapContainerLayout.kt */
    public static final class WrapLine {
        private int bottom;
        private int crossSize;
        private int edgeSeparatorOffset;
        private final int firstIndex;
        private int goneItemCount;
        private int itemCount;
        private int mainSize;
        private int maxBaseline;
        private int maxHeightUnderBaseline;
        private int right;
        private float spaceBetweenChildren;

        public WrapLine() {
            this(0, 0, 0, 7, null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof WrapLine)) {
                return false;
            }
            WrapLine wrapLine = (WrapLine) obj;
            return this.firstIndex == wrapLine.firstIndex && this.mainSize == wrapLine.mainSize && this.itemCount == wrapLine.itemCount;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getCrossSize() {
            return this.crossSize;
        }

        public final int getEdgeSeparatorOffset() {
            return this.edgeSeparatorOffset;
        }

        public final int getFirstIndex() {
            return this.firstIndex;
        }

        public final int getGoneItemCount() {
            return this.goneItemCount;
        }

        public final int getItemCount() {
            return this.itemCount;
        }

        public final int getItemCountNotGone() {
            return this.itemCount - this.goneItemCount;
        }

        public final int getMainSize() {
            return this.mainSize;
        }

        public final int getMaxBaseline() {
            return this.maxBaseline;
        }

        public final int getMaxHeightUnderBaseline() {
            return this.maxHeightUnderBaseline;
        }

        public final int getRight() {
            return this.right;
        }

        public final float getSpaceBetweenChildren() {
            return this.spaceBetweenChildren;
        }

        public int hashCode() {
            return Integer.hashCode(this.itemCount) + shy.a(this.mainSize, Integer.hashCode(this.firstIndex) * 31, 31);
        }

        public final boolean isVisible() {
            return getItemCountNotGone() > 0;
        }

        public final void setBottom(int i) {
            this.bottom = i;
        }

        public final void setCrossSize(int i) {
            this.crossSize = i;
        }

        public final void setEdgeSeparatorOffset(int i) {
            this.edgeSeparatorOffset = i;
        }

        public final void setGoneItemCount(int i) {
            this.goneItemCount = i;
        }

        public final void setItemCount(int i) {
            this.itemCount = i;
        }

        public final void setMainSize(int i) {
            this.mainSize = i;
        }

        public final void setMaxBaseline(int i) {
            this.maxBaseline = i;
        }

        public final void setMaxHeightUnderBaseline(int i) {
            this.maxHeightUnderBaseline = i;
        }

        public final void setRight(int i) {
            this.right = i;
        }

        public final void setSpaceBetweenChildren(float f) {
            this.spaceBetweenChildren = f;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("WrapLine(firstIndex=");
            sb.append(this.firstIndex);
            sb.append(", mainSize=");
            sb.append(this.mainSize);
            sb.append(", itemCount=");
            return vu5.b(sb, this.itemCount, ')');
        }

        public WrapLine(int i, int i2, int i3) {
            this.firstIndex = i;
            this.mainSize = i2;
            this.itemCount = i3;
            this.maxBaseline = -1;
        }

        public /* synthetic */ WrapLine(int i, int i2, int i3, int i4, zcl zclVar) {
            this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0 : i3);
        }
    }

    public WrapContainerLayout(Context context) {
        super(context, null, 0, 6, null);
        this.showSeparators$delegate = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.showLineSeparators$delegate = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.separatorDrawable$delegate = ViewsKt.dimensionAffecting$default(null, null, 2, null);
        this.lineSeparatorDrawable$delegate = ViewsKt.dimensionAffecting$default(null, null, 2, null);
        this.isRowDirection = true;
        this.lines = new ArrayList();
        this.offsetsHolder = new DivViewGroup.OffsetsHolder(this, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 7, null);
        this.aspectRatio$delegate = AspectView.Companion.aspectRatioProperty$div_release();
    }

    private final void addEdgeSpace(WrapLine wrapLine) {
        this.lines.add(0, wrapLine);
        this.lines.add(wrapLine);
    }

    private final void addLine(WrapLine wrapLine) {
        this.lines.add(wrapLine);
        if (wrapLine.getMaxBaseline() > 0) {
            wrapLine.setCrossSize(Math.max(wrapLine.getCrossSize(), wrapLine.getMaxBaseline() + wrapLine.getMaxHeightUnderBaseline()));
        }
        this.tempSumCrossSize += wrapLine.getCrossSize();
    }

    private final void addLineIfNeeded(int i, WrapLine wrapLine) {
        if (i != getChildCount() - 1 || wrapLine.getItemCountNotGone() == 0) {
            return;
        }
        addLine(wrapLine);
    }

    private final void addSpaceBetweenLines(WrapLine wrapLine) {
        for (int i = 1; i < this.lines.size(); i += 2) {
            this.lines.add(i, wrapLine);
        }
    }

    private final void calculateLines(int i, int i2) {
        int i3;
        int edgeSeparatorsLength;
        int i4;
        int i5;
        this.tempSumCrossSize = getEdgeLineSeparatorsLength();
        int i6 = this.isRowDirection ? i : i2;
        int mode = View.MeasureSpec.getMode(i6);
        int size = View.MeasureSpec.getSize(i6);
        int edgeSeparatorsLength2 = getEdgeSeparatorsLength() + (this.isRowDirection ? getHorizontalPaddings$div_release() : getVerticalPaddings$div_release());
        WrapLine wrapLine = new WrapLine(0, edgeSeparatorsLength2, 0, 5, null);
        kxt0 kxt0Var = new kxt0(this);
        int i7 = 0;
        WrapLine wrapLine2 = wrapLine;
        int i8 = Integer.MIN_VALUE;
        while (kxt0Var.hasNext()) {
            View next = kxt0Var.next();
            int i9 = i7 + 1;
            if (i7 < 0) {
                e43.t();
                throw null;
            }
            View view = next;
            if (isHidden(view)) {
                wrapLine2.setGoneItemCount(wrapLine2.getGoneItemCount() + 1);
                wrapLine2.setItemCount(wrapLine2.getItemCount() + 1);
                addLineIfNeeded(i7, wrapLine2);
                int i10 = mode;
                i4 = size;
                i5 = i10;
            } else {
                DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
                int horizontalMargins$div_release = divLayoutParams.getHorizontalMargins$div_release() + getHorizontalPaddings$div_release();
                int verticalMargins$div_release = divLayoutParams.getVerticalMargins$div_release() + getVerticalPaddings$div_release();
                if (this.isRowDirection) {
                    i3 = horizontalMargins$div_release + getEdgeSeparatorsLength();
                    edgeSeparatorsLength = this.tempSumCrossSize;
                } else {
                    i3 = horizontalMargins$div_release + this.tempSumCrossSize;
                    edgeSeparatorsLength = getEdgeSeparatorsLength();
                }
                int i11 = verticalMargins$div_release + edgeSeparatorsLength;
                int i12 = i3;
                DivViewGroup.Companion companion = DivViewGroup.Companion;
                view.measure(companion.getChildMeasureSpec(i, i12, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, view.getMinimumWidth(), divLayoutParams.getMaxWidth()), companion.getChildMeasureSpec(i2, i11, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, view.getMinimumHeight(), divLayoutParams.getMaxHeight()));
                this.childState = View.combineMeasuredStates(this.childState, view.getMeasuredState());
                int horizontalMargins$div_release2 = divLayoutParams.getHorizontalMargins$div_release() + view.getMeasuredWidth();
                int verticalMargins$div_release2 = divLayoutParams.getVerticalMargins$div_release() + view.getMeasuredHeight();
                if (!this.isRowDirection) {
                    verticalMargins$div_release2 = horizontalMargins$div_release2;
                    horizontalMargins$div_release2 = verticalMargins$div_release2;
                }
                int i13 = verticalMargins$div_release2;
                int i14 = mode;
                i4 = size;
                i5 = i14;
                if (isWrapRequired(i5, i4, wrapLine2.getMainSize(), horizontalMargins$div_release2, wrapLine2.getItemCount())) {
                    if (wrapLine2.getItemCountNotGone() > 0) {
                        addLine(wrapLine2);
                    }
                    wrapLine2 = new WrapLine(i7, edgeSeparatorsLength2, 1);
                    i8 = Integer.MIN_VALUE;
                } else {
                    if (wrapLine2.getItemCount() > 0) {
                        wrapLine2.setMainSize(wrapLine2.getMainSize() + getBetweenItemsSpacing());
                    }
                    wrapLine2.setItemCount(wrapLine2.getItemCount() + 1);
                }
                if (this.isRowDirection && divLayoutParams.isBaselineAligned()) {
                    wrapLine2.setMaxBaseline(Math.max(wrapLine2.getMaxBaseline(), view.getBaseline() + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin));
                    wrapLine2.setMaxHeightUnderBaseline(Math.max(wrapLine2.getMaxHeightUnderBaseline(), (view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) - view.getBaseline()));
                }
                wrapLine2.setMainSize(wrapLine2.getMainSize() + horizontalMargins$div_release2);
                i8 = Math.max(i8, i13);
                wrapLine2.setCrossSize(Math.max(wrapLine2.getCrossSize(), i8));
                addLineIfNeeded(i7, wrapLine2);
            }
            int i15 = i4;
            mode = i5;
            size = i15;
            i7 = i9;
        }
    }

    private final void determineCrossSize(int i, int i2, int i3) {
        this.middleLineSeparatorOffset = 0;
        this.edgeLineSeparatorOffset = 0;
        if (this.lines.size() != 0 && View.MeasureSpec.getMode(i) == 1073741824) {
            int size = View.MeasureSpec.getSize(i);
            if (this.lines.size() == 1) {
                this.lines.get(0).setCrossSize(size - i3);
                return;
            }
            int sumOfCrossSize = (size - getSumOfCrossSize()) + i3;
            if (i2 != 1) {
                if (i2 != 5) {
                    if (i2 != 16) {
                        if (i2 != 80) {
                            if (i2 != 16777216) {
                                if (i2 != 33554432) {
                                    if (i2 != 67108864) {
                                        if (i2 != 268435456) {
                                            if (i2 != 536870912) {
                                                if (i2 != 1073741824) {
                                                    return;
                                                }
                                            }
                                        }
                                    }
                                    WrapLine wrapLine = new WrapLine(0, 0, 0, 7, null);
                                    int b = an10.b(DivViewGroup.Companion.getSpaceEvenlyPart$div_release(sumOfCrossSize, this.lines.size()));
                                    wrapLine.setCrossSize(b);
                                    int i4 = b / 2;
                                    this.middleLineSeparatorOffset = i4;
                                    this.edgeLineSeparatorOffset = i4;
                                    addSpaceBetweenLines(wrapLine);
                                    addEdgeSpace(wrapLine);
                                    return;
                                }
                                WrapLine wrapLine2 = new WrapLine(0, 0, 0, 7, null);
                                int b2 = an10.b(DivViewGroup.Companion.getSpaceBetweenPart$div_release(sumOfCrossSize, this.lines.size()));
                                wrapLine2.setCrossSize(b2);
                                this.middleLineSeparatorOffset = b2 / 2;
                                addSpaceBetweenLines(wrapLine2);
                                return;
                            }
                            WrapLine wrapLine3 = new WrapLine(0, 0, 0, 7, null);
                            int b3 = an10.b(DivViewGroup.Companion.getSpaceAroundPart$div_release(sumOfCrossSize, this.lines.size()));
                            wrapLine3.setCrossSize(b3);
                            this.middleLineSeparatorOffset = b3;
                            this.edgeLineSeparatorOffset = b3 / 2;
                            for (int i5 = 0; i5 < this.lines.size(); i5 += 3) {
                                this.lines.add(i5, wrapLine3);
                                this.lines.add(i5 + 2, wrapLine3);
                            }
                            return;
                        }
                    }
                }
                WrapLine wrapLine4 = new WrapLine(0, 0, 0, 7, null);
                wrapLine4.setCrossSize(sumOfCrossSize);
                this.lines.add(0, wrapLine4);
                return;
            }
            WrapLine wrapLine5 = new WrapLine(0, 0, 0, 7, null);
            wrapLine5.setCrossSize(sumOfCrossSize / 2);
            addEdgeSpace(wrapLine5);
        }
    }

    private final void drawLineSeparator(Canvas canvas, int i, int i2, int i3, int i4) {
        drawSeparator(getLineSeparatorDrawable(), canvas, i + this.lineSeparatorMarginLeft, i2 - this.lineSeparatorMarginTop, i3 - this.lineSeparatorMarginRight, i4 + this.lineSeparatorMarginBottom);
    }

    private final void drawSeparator(Canvas canvas, int i, int i2, int i3, int i4) {
        drawSeparator(getSeparatorDrawable(), canvas, i + this.separatorMarginLeft, i2 - this.separatorMarginTop, i3 - this.separatorMarginRight, i4 + this.separatorMarginBottom);
    }

    private final void drawSeparatorsHorizontal(Canvas canvas) {
        int i;
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        if (this.lines.size() > 0 && showSeparatorAtStart(getShowLineSeparators())) {
            WrapLine firstVisibleLine = getFirstVisibleLine();
            int bottom = firstVisibleLine != null ? firstVisibleLine.getBottom() - firstVisibleLine.getCrossSize() : 0;
            ref$IntRef.element = bottom;
            drawSeparatorsHorizontal$drawLineSeparator(this, canvas, bottom - this.edgeLineSeparatorOffset);
        }
        boolean z = false;
        for (WrapLine wrapLine : this.lines) {
            if (wrapLine.getItemCountNotGone() != 0) {
                int bottom2 = wrapLine.getBottom();
                ref$IntRef2.element = bottom2;
                ref$IntRef.element = bottom2 - wrapLine.getCrossSize();
                if (z && showSeparatorBetween(getShowLineSeparators())) {
                    drawSeparatorsHorizontal$drawLineSeparator(this, canvas, ref$IntRef.element - this.middleLineSeparatorOffset);
                }
                i9x indices = com.yandex.div.core.util.ViewsKt.getIndices(this, wrapLine.getFirstIndex(), wrapLine.getItemCount());
                int i2 = indices.b;
                int i3 = indices.c;
                int i4 = indices.d;
                if ((i4 > 0 && i2 <= i3) || (i4 < 0 && i3 <= i2)) {
                    i = 0;
                    boolean z2 = true;
                    while (true) {
                        View childAt = getChildAt(i2);
                        if (childAt != null && !isHidden(childAt)) {
                            DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                            int left = childAt.getLeft() - ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                            i = ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + childAt.getRight();
                            if (z2) {
                                if (showLeftSeparator(getShowSeparators())) {
                                    drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, ref$IntRef, ref$IntRef2, left - wrapLine.getEdgeSeparatorOffset());
                                }
                                z2 = false;
                            } else if (showSeparatorBetween(getShowSeparators())) {
                                drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, ref$IntRef, ref$IntRef2, left - ((int) (wrapLine.getSpaceBetweenChildren() / 2)));
                            }
                        }
                        if (i2 == i3) {
                            break;
                        } else {
                            i2 += i4;
                        }
                    }
                } else {
                    i = 0;
                }
                if (i > 0 && showRightSeparator(getShowSeparators())) {
                    drawSeparatorsHorizontal$lambda$12$drawSeparator(this, canvas, ref$IntRef, ref$IntRef2, i + getSeparatorLength() + wrapLine.getEdgeSeparatorOffset());
                }
                z = true;
            }
        }
        if (ref$IntRef2.element <= 0 || !showSeparatorAtEnd(getShowLineSeparators())) {
            return;
        }
        drawSeparatorsHorizontal$drawLineSeparator(this, canvas, ref$IntRef2.element + getLineSeparatorLength() + this.edgeLineSeparatorOffset);
    }

    private static final void drawSeparatorsHorizontal$drawLineSeparator(WrapContainerLayout wrapContainerLayout, Canvas canvas, int i) {
        wrapContainerLayout.drawLineSeparator(canvas, wrapContainerLayout.getPaddingLeft(), i - wrapContainerLayout.getLineSeparatorLength(), wrapContainerLayout.getWidth() - wrapContainerLayout.getPaddingRight(), i);
    }

    private static final void drawSeparatorsHorizontal$lambda$12$drawSeparator(WrapContainerLayout wrapContainerLayout, Canvas canvas, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, int i) {
        wrapContainerLayout.drawSeparator(canvas, i - wrapContainerLayout.getSeparatorLength(), ref$IntRef.element, i, ref$IntRef2.element);
    }

    private final void drawSeparatorsVertical(Canvas canvas) {
        Ref$IntRef ref$IntRef = new Ref$IntRef();
        Ref$IntRef ref$IntRef2 = new Ref$IntRef();
        if (this.lines.size() > 0 && showLeftSeparator(getShowLineSeparators())) {
            WrapLine firstVisibleLine = getFirstVisibleLine();
            int right = firstVisibleLine != null ? firstVisibleLine.getRight() - firstVisibleLine.getCrossSize() : 0;
            ref$IntRef.element = right;
            drawSeparatorsVertical$drawLineSeparator$13(this, canvas, right - this.edgeLineSeparatorOffset);
        }
        Iterator<Integer> it = com.yandex.div.core.util.ViewsKt.getIndices(this, 0, this.lines.size()).iterator();
        boolean z = false;
        while (it.hasNext()) {
            WrapLine wrapLine = this.lines.get(((z8x) it).nextInt());
            if (wrapLine.getItemCountNotGone() != 0) {
                int right2 = wrapLine.getRight();
                ref$IntRef2.element = right2;
                ref$IntRef.element = right2 - wrapLine.getCrossSize();
                if (z && showSeparatorBetween(getShowLineSeparators())) {
                    drawSeparatorsVertical$drawLineSeparator$13(this, canvas, ref$IntRef.element - this.middleLineSeparatorOffset);
                }
                boolean z2 = true;
                z = getLineSeparatorDrawable() != null;
                int itemCount = wrapLine.getItemCount();
                int i = 0;
                for (int i2 = 0; i2 < itemCount; i2++) {
                    View childAt = getChildAt(wrapLine.getFirstIndex() + i2);
                    if (childAt != null && !isHidden(childAt)) {
                        DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                        int top = childAt.getTop() - ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                        i = ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + childAt.getBottom();
                        if (z2) {
                            if (showSeparatorAtStart(getShowSeparators())) {
                                drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, ref$IntRef, ref$IntRef2, top - wrapLine.getEdgeSeparatorOffset());
                            }
                            z2 = false;
                        } else if (showSeparatorBetween(getShowSeparators())) {
                            drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, ref$IntRef, ref$IntRef2, top - ((int) (wrapLine.getSpaceBetweenChildren() / 2)));
                        }
                    }
                }
                if (i > 0 && showSeparatorAtEnd(getShowSeparators())) {
                    drawSeparatorsVertical$lambda$16$drawSeparator$15(this, canvas, ref$IntRef, ref$IntRef2, i + getSeparatorLength() + wrapLine.getEdgeSeparatorOffset());
                }
            }
        }
        if (ref$IntRef2.element <= 0 || !showRightSeparator(getShowLineSeparators())) {
            return;
        }
        drawSeparatorsVertical$drawLineSeparator$13(this, canvas, ref$IntRef2.element + getLineSeparatorLength() + this.edgeLineSeparatorOffset);
    }

    private static final void drawSeparatorsVertical$drawLineSeparator$13(WrapContainerLayout wrapContainerLayout, Canvas canvas, int i) {
        wrapContainerLayout.drawLineSeparator(canvas, i - wrapContainerLayout.getLineSeparatorLength(), wrapContainerLayout.getPaddingTop(), i, wrapContainerLayout.getHeight() - wrapContainerLayout.getPaddingBottom());
    }

    private static final void drawSeparatorsVertical$lambda$16$drawSeparator$15(WrapContainerLayout wrapContainerLayout, Canvas canvas, Ref$IntRef ref$IntRef, Ref$IntRef ref$IntRef2, int i) {
        wrapContainerLayout.drawSeparator(canvas, ref$IntRef.element, i - wrapContainerLayout.getSeparatorLength(), ref$IntRef2.element, i);
    }

    private final int getBetweenItemsSpacing() {
        return showSeparatorBetween(getShowSeparators()) ? getSeparatorLength() : this.itemSpacingPx;
    }

    private final int getBetweenLinesSpacing() {
        return showSeparatorBetween(getShowLineSeparators()) ? getLineSeparatorLength() : this.lineSpacingPx;
    }

    private final int getEdgeLineSeparatorsLength() {
        return getStartLineSeparatorLength() + getEndLineSeparatorLength();
    }

    private final int getEdgeSeparatorsLength() {
        return getStartSeparatorLength() + getEndSeparatorLength();
    }

    private final int getEndLineSeparatorLength() {
        if (showSeparatorAtEnd(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getEndSeparatorLength() {
        if (showSeparatorAtEnd(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final WrapLine getFirstVisibleLine() {
        Object obj = null;
        if (this.isRowDirection || !com.yandex.div.core.util.ViewsKt.isLayoutRtl(this)) {
            Iterator<T> it = this.lines.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((WrapLine) next).isVisible()) {
                    obj = next;
                    break;
                }
            }
            return (WrapLine) obj;
        }
        List<WrapLine> list = this.lines;
        ListIterator<WrapLine> listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            if (((WrapLine) previous).isVisible()) {
                obj = previous;
                break;
            }
        }
        return (WrapLine) obj;
    }

    private final boolean getHasIncorrectSize(View view) {
        if (this.isRowDirection) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            return isIncorrectForCrossAxis(layoutParams != null ? Integer.valueOf(layoutParams.height) : null);
        }
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        return isIncorrectForCrossAxis(layoutParams2 != null ? Integer.valueOf(layoutParams2.width) : null);
    }

    private final int getLargestMainSize() {
        Integer num;
        Iterator<T> it = this.lines.iterator();
        if (it.hasNext()) {
            Integer valueOf = Integer.valueOf(((WrapLine) it.next()).getMainSize());
            while (it.hasNext()) {
                Integer valueOf2 = Integer.valueOf(((WrapLine) it.next()).getMainSize());
                if (valueOf.compareTo(valueOf2) < 0) {
                    valueOf = valueOf2;
                }
            }
            num = valueOf;
        } else {
            num = null;
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    private final int getLeftOffsetForVerticalLayout(View view, int i) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(DivViewGroup.Companion.toHorizontalGravity(divLayoutParams.getGravity()), getLayoutDirection());
        return absoluteGravity != 1 ? absoluteGravity != 5 ? ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin : (i - view.getMeasuredWidth()) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin : (((i - view.getMeasuredWidth()) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin) / 2;
    }

    private final int getLineSeparatorLength() {
        int intrinsicWidth;
        int i;
        if (this.isRowDirection) {
            Drawable lineSeparatorDrawable = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable != null ? lineSeparatorDrawable.getIntrinsicHeight() : 0) + this.lineSeparatorMarginTop;
            i = this.lineSeparatorMarginBottom;
        } else {
            Drawable lineSeparatorDrawable2 = getLineSeparatorDrawable();
            intrinsicWidth = (lineSeparatorDrawable2 != null ? lineSeparatorDrawable2.getIntrinsicWidth() : 0) + this.lineSeparatorMarginLeft;
            i = this.lineSeparatorMarginRight;
        }
        return intrinsicWidth + i;
    }

    private final int getMiddleLineSeparatorLength() {
        if (showSeparatorBetween(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getMiddleSeparatorLength() {
        if (showSeparatorBetween(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getSeparatorLength() {
        int intrinsicHeight;
        int i;
        if (this.isRowDirection) {
            Drawable separatorDrawable = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable != null ? separatorDrawable.getIntrinsicWidth() : 0) + this.separatorMarginLeft;
            i = this.separatorMarginRight;
        } else {
            Drawable separatorDrawable2 = getSeparatorDrawable();
            intrinsicHeight = (separatorDrawable2 != null ? separatorDrawable2.getIntrinsicHeight() : 0) + this.separatorMarginTop;
            i = this.separatorMarginBottom;
        }
        return intrinsicHeight + i;
    }

    private final int getSize(int i, int i2, int i3, boolean z) {
        if (i == Integer.MIN_VALUE) {
            return z ? Math.min(i2, i3) : (i3 <= i2 && getVisibleLinesCount() <= 1) ? i3 : i2;
        }
        if (i != 0) {
            if (i != 1073741824) {
                throw new IllegalStateException(lhg.a(i, "Unknown size mode is set: "));
            }
        }
    }

    private final int getStartLineSeparatorLength() {
        if (showSeparatorAtStart(getShowLineSeparators())) {
            return getLineSeparatorLength();
        }
        return 0;
    }

    private final int getStartSeparatorLength() {
        if (showSeparatorAtStart(getShowSeparators())) {
            return getSeparatorLength();
        }
        return 0;
    }

    private final int getState(int i, int i2, int i3, int i4, int i5) {
        return (i != 0 && i3 < i4) ? View.combineMeasuredStates(i2, i5) : i2;
    }

    private final int getSumOfCrossSize() {
        Iterator<T> it = this.lines.iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((WrapLine) it.next()).getCrossSize();
        }
        int edgeLineSeparatorsLength = i + getEdgeLineSeparatorsLength();
        return ir.b(getVisibleLinesCount(), 1, getBetweenLinesSpacing(), edgeLineSeparatorsLength);
    }

    private final int getTopOffsetForHorizontalLayout(View view, WrapLine wrapLine) {
        DivLayoutParams divLayoutParams = (DivLayoutParams) view.getLayoutParams();
        int verticalGravity = DivViewGroup.Companion.toVerticalGravity(divLayoutParams.getGravity());
        return verticalGravity != 16 ? verticalGravity != 80 ? divLayoutParams.isBaselineAligned() ? Math.max(wrapLine.getMaxBaseline() - view.getBaseline(), ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) : ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin : (wrapLine.getCrossSize() - view.getMeasuredHeight()) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin : (((wrapLine.getCrossSize() - view.getMeasuredHeight()) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) / 2;
    }

    private final int getVisibleLinesCount() {
        List<WrapLine> list = this.lines;
        int i = 0;
        if ((list instanceof Collection) && list.isEmpty()) {
            return 0;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (((WrapLine) it.next()).getItemCountNotGone() > 0 && (i = i + 1) < 0) {
                e43.s();
                throw null;
            }
        }
        return i;
    }

    private final boolean isHidden(View view) {
        return view.getVisibility() == 8 || getHasIncorrectSize(view);
    }

    private final boolean isIncorrectForCrossAxis(Integer num) {
        return num != null && num.intValue() == -1;
    }

    private final boolean isWrapRequired(int i, int i2, int i3, int i4, int i5) {
        return i != 0 && i2 < (i3 + i4) + (i5 != 0 ? getBetweenItemsSpacing() : 0);
    }

    private final void layoutHorizontal(int i, int i2) {
        int paddingTop = getPaddingTop() + getStartLineSeparatorLength();
        WeakHashMap<View, b0u0> weakHashMap = iut0.a;
        int absoluteGravity = Gravity.getAbsoluteGravity(getHorizontalGravity$div_release(), getLayoutDirection());
        boolean z = false;
        for (WrapLine wrapLine : this.lines) {
            float mainSize = (i2 - i) - wrapLine.getMainSize();
            DivViewGroup.OffsetsHolder offsetsHolder = this.offsetsHolder;
            offsetsHolder.update(mainSize, absoluteGravity, wrapLine.getItemCountNotGone());
            float firstChildOffset = offsetsHolder.getFirstChildOffset() + getPaddingLeft() + (com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? getEndSeparatorLength() : getStartSeparatorLength());
            wrapLine.setSpaceBetweenChildren(offsetsHolder.getSpaceBetweenChildren());
            wrapLine.setEdgeSeparatorOffset(offsetsHolder.getEdgeDividerOffset());
            if (wrapLine.getItemCountNotGone() > 0) {
                if (z) {
                    paddingTop += getBetweenLinesSpacing();
                }
                z = true;
            }
            i9x indices = com.yandex.div.core.util.ViewsKt.getIndices(this, wrapLine.getFirstIndex(), wrapLine.getItemCount());
            int i3 = indices.b;
            int i4 = indices.c;
            int i5 = indices.d;
            if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                boolean z2 = false;
                while (true) {
                    View childAt = getChildAt(i3);
                    if (childAt != null && !isHidden(childAt)) {
                        DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                        float f = firstChildOffset + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                        if (z2) {
                            f += getBetweenItemsSpacing();
                        }
                        int topOffsetForHorizontalLayout = getTopOffsetForHorizontalLayout(childAt, wrapLine) + paddingTop;
                        childAt.layout(an10.b(f), topOffsetForHorizontalLayout, childAt.getMeasuredWidth() + an10.b(f), childAt.getMeasuredHeight() + topOffsetForHorizontalLayout);
                        firstChildOffset = childAt.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + wrapLine.getSpaceBetweenChildren() + f;
                        z2 = true;
                    } else if (getHasIncorrectSize(childAt)) {
                        childAt.layout(0, 0, 0, 0);
                    }
                    if (i3 != i4) {
                        i3 += i5;
                    }
                }
            }
            paddingTop += wrapLine.getCrossSize();
            wrapLine.setRight(an10.b(firstChildOffset));
            wrapLine.setBottom(paddingTop);
        }
    }

    private final void layoutVertical(int i, int i2) {
        int paddingLeft = getPaddingLeft() + (com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? getEndLineSeparatorLength() : getStartLineSeparatorLength());
        Iterator<Integer> it = com.yandex.div.core.util.ViewsKt.getIndices(this, 0, this.lines.size()).iterator();
        boolean z = false;
        while (it.hasNext()) {
            WrapLine wrapLine = this.lines.get(((z8x) it).nextInt());
            float mainSize = (i2 - i) - wrapLine.getMainSize();
            DivViewGroup.OffsetsHolder offsetsHolder = this.offsetsHolder;
            offsetsHolder.update(mainSize, getVerticalGravity$div_release(), wrapLine.getItemCountNotGone());
            float firstChildOffset = offsetsHolder.getFirstChildOffset() + getPaddingTop() + getStartSeparatorLength();
            wrapLine.setSpaceBetweenChildren(offsetsHolder.getSpaceBetweenChildren());
            wrapLine.setEdgeSeparatorOffset(offsetsHolder.getEdgeDividerOffset());
            if (wrapLine.getItemCountNotGone() > 0) {
                if (z) {
                    paddingLeft += getBetweenLinesSpacing();
                }
                z = true;
            }
            int itemCount = wrapLine.getItemCount();
            boolean z2 = false;
            for (int i3 = 0; i3 < itemCount; i3++) {
                View childAt = getChildAt(wrapLine.getFirstIndex() + i3);
                if (childAt != null && !isHidden(childAt)) {
                    DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                    float f = firstChildOffset + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                    if (z2) {
                        f += getBetweenItemsSpacing();
                    }
                    int leftOffsetForVerticalLayout = getLeftOffsetForVerticalLayout(childAt, wrapLine.getCrossSize()) + paddingLeft;
                    childAt.layout(leftOffsetForVerticalLayout, an10.b(f), childAt.getMeasuredWidth() + leftOffsetForVerticalLayout, childAt.getMeasuredHeight() + an10.b(f));
                    firstChildOffset = childAt.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + wrapLine.getSpaceBetweenChildren() + f;
                    z2 = true;
                } else if (getHasIncorrectSize(childAt)) {
                    childAt.layout(0, 0, 0, 0);
                }
            }
            paddingLeft += wrapLine.getCrossSize();
            wrapLine.setRight(paddingLeft);
            wrapLine.setBottom(an10.b(firstChildOffset));
        }
    }

    private final boolean showLeftSeparator(int i) {
        return com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? showSeparatorAtEnd(i) : showSeparatorAtStart(i);
    }

    private final boolean showRightSeparator(int i) {
        return com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? showSeparatorAtStart(i) : showSeparatorAtEnd(i);
    }

    private final boolean showSeparatorAtEnd(int i) {
        return (i & 4) != 0;
    }

    private final boolean showSeparatorAtStart(int i) {
        return (i & 1) != 0;
    }

    private final boolean showSeparatorBetween(int i) {
        return (i & 2) != 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (getSeparatorDrawable() == null && getLineSeparatorDrawable() == null) {
            return;
        }
        if (getShowSeparators() == 0 && getShowLineSeparators() == 0) {
            return;
        }
        if (this.isRowDirection) {
            drawSeparatorsHorizontal(canvas);
        } else {
            drawSeparatorsVertical(canvas);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public float getAspectRatio() {
        return ((Number) this.aspectRatio$delegate.getValue(this, $$delegatedProperties[4])).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        WrapLine firstVisibleLine = getFirstVisibleLine();
        if (firstVisibleLine == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + firstVisibleLine.getMaxBaseline();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable getLineSeparatorDrawable() {
        return (Drawable) this.lineSeparatorDrawable$delegate.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Drawable getSeparatorDrawable() {
        return (Drawable) this.separatorDrawable$delegate.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getShowLineSeparators() {
        return ((Number) this.showLineSeparators$delegate.getValue(this, $$delegatedProperties[1])).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int getShowSeparators() {
        return ((Number) this.showSeparators$delegate.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final int getWrapDirection() {
        return this.wrapDirection;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        if (this.isRowDirection) {
            layoutHorizontal(i, i3);
        } else {
            layoutVertical(i2, i4);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int mode;
        int size;
        int i4;
        this.lines.clear();
        this.childState = 0;
        int mode2 = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i);
        if (getAspectRatio() != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && mode2 == 1073741824) {
            int b = an10.b(size2 / getAspectRatio());
            size = b;
            i3 = View.MeasureSpec.makeMeasureSpec(b, 1073741824);
            mode = 1073741824;
        } else {
            i3 = i2;
            mode = View.MeasureSpec.getMode(i2);
            size = View.MeasureSpec.getSize(i2);
        }
        calculateLines(i, i3);
        if (this.isRowDirection) {
            determineCrossSize(i3, getVerticalGravity$div_release(), getVerticalPaddings$div_release());
        } else {
            determineCrossSize(i, getHorizontalGravity$div_release(), getHorizontalPaddings$div_release());
        }
        int largestMainSize = this.isRowDirection ? getLargestMainSize() : getSumOfCrossSize() + getHorizontalPaddings$div_release();
        int verticalPaddings$div_release = this.isRowDirection ? getVerticalPaddings$div_release() + getSumOfCrossSize() : getLargestMainSize();
        this.childState = getState(mode2, this.childState, size2, largestMainSize, C.DEFAULT_MUXED_BUFFER_SIZE);
        int resolveSizeAndState = View.resolveSizeAndState(getSize(mode2, size2, largestMainSize, !this.isRowDirection), i, this.childState);
        if (!this.isRowDirection || getAspectRatio() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || mode2 == 1073741824) {
            i4 = mode;
        } else {
            size = an10.b((16777215 & resolveSizeAndState) / getAspectRatio());
            i3 = View.MeasureSpec.makeMeasureSpec(size, 1073741824);
            i4 = 1073741824;
        }
        int i5 = size;
        this.childState = getState(i4, this.childState, i5, verticalPaddings$div_release, 256);
        setMeasuredDimension(resolveSizeAndState, View.resolveSizeAndState(getSize(i4, i5, verticalPaddings$div_release, this.isRowDirection), i3, this.childState));
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f) {
        this.aspectRatio$delegate.setValue(this, $$delegatedProperties[4], Float.valueOf(f));
    }

    public final void setItemSpacing(int i) {
        if (this.itemSpacingPx != i) {
            this.itemSpacingPx = i;
            requestLayout();
        }
    }

    public final void setLineSeparatorDrawable(Drawable drawable) {
        this.lineSeparatorDrawable$delegate.setValue(this, $$delegatedProperties[3], drawable);
    }

    public final void setLineSeparatorMargins(int i, int i2, int i3, int i4) {
        this.lineSeparatorMarginLeft = i;
        this.lineSeparatorMarginRight = i3;
        this.lineSeparatorMarginTop = i2;
        this.lineSeparatorMarginBottom = i4;
        requestLayout();
    }

    public final void setLineSpacing(int i) {
        if (this.lineSpacingPx != i) {
            this.lineSpacingPx = i;
            requestLayout();
        }
    }

    public final void setSeparatorDrawable(Drawable drawable) {
        this.separatorDrawable$delegate.setValue(this, $$delegatedProperties[2], drawable);
    }

    public final void setSeparatorMargins(int i, int i2, int i3, int i4) {
        this.separatorMarginLeft = i;
        this.separatorMarginRight = i3;
        this.separatorMarginTop = i2;
        this.separatorMarginBottom = i4;
        requestLayout();
    }

    public final void setShowLineSeparators(int i) {
        this.showLineSeparators$delegate.setValue(this, $$delegatedProperties[1], Integer.valueOf(i));
    }

    public final void setShowSeparators(int i) {
        this.showSeparators$delegate.setValue(this, $$delegatedProperties[0], Integer.valueOf(i));
    }

    public final void setWrapDirection(int i) {
        if (this.wrapDirection != i) {
            this.wrapDirection = i;
            boolean z = true;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Invalid value for the wrap direction is set: " + this.wrapDirection);
                }
                z = false;
            }
            this.isRowDirection = z;
            requestLayout();
        }
    }

    private final s3q0 drawSeparator(Drawable drawable, Canvas canvas, int i, int i2, int i3, int i4) {
        if (drawable == null) {
            return null;
        }
        float f = (i + i3) / 2.0f;
        float f2 = (i2 + i4) / 2.0f;
        float intrinsicWidth = drawable.getIntrinsicWidth() / 2.0f;
        float intrinsicHeight = drawable.getIntrinsicHeight() / 2.0f;
        drawable.setBounds((int) (f - intrinsicWidth), (int) (f2 - intrinsicHeight), (int) (f + intrinsicWidth), (int) (f2 + intrinsicHeight));
        drawable.draw(canvas);
        return s3q0.a;
    }

    public static /* synthetic */ void getShowLineSeparators$annotations() {
    }

    public static /* synthetic */ void getShowSeparators$annotations() {
    }

    public static /* synthetic */ void getWrapDirection$annotations() {
    }
}
