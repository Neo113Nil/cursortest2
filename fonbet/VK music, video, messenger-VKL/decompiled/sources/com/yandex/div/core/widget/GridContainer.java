package com.yandex.div.core.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import com.yandex.div.R$styleable;
import com.yandex.div.core.widget.GridContainer;
import com.yandex.div.internal.KLog;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.g5g;
import xsna.gzs;
import xsna.j5g;
import xsna.j9x;
import xsna.k9x;
import xsna.qlb0;
import xsna.rl3;
import xsna.swe0;
import xsna.x9;
import xsna.zcl;

/* compiled from: GridContainer.kt */
@SuppressLint({"RtlHardcoded"})
/* loaded from: classes7.dex */
public class GridContainer extends DivViewGroup {
    public static final Companion Companion = new Companion(null);
    private final Grid grid;
    private boolean initialized;
    private int lastLayoutHashCode;

    /* compiled from: GridContainer.kt */
    public static final class Cell {
        public final int columnIndex;
        public int columnSpan;
        public final int rowIndex;
        public int rowSpan;
        public final int viewIndex;

        public Cell(int i, int i2, int i3, int i4, int i5) {
            this.viewIndex = i;
            this.columnIndex = i2;
            this.rowIndex = i3;
            this.columnSpan = i4;
            this.rowSpan = i5;
        }
    }

    /* compiled from: GridContainer.kt */
    public static final class CellProjection {
        public final int contentSize;
        public final int index;
        public final int marginEnd;
        public final int marginStart;
        public final int span;
        public final float weight;

        public CellProjection(int i, int i2, int i3, int i4, int i5, float f) {
            this.index = i;
            this.contentSize = i2;
            this.marginStart = i3;
            this.marginEnd = i4;
            this.span = i5;
            this.weight = f;
        }

        public final int getSize() {
            return this.contentSize + this.marginStart + this.marginEnd;
        }

        public final int getSpecificSize() {
            return getSize() / this.span;
        }
    }

    /* compiled from: GridContainer.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    /* compiled from: GridContainer.kt */
    public final class Grid {
        private final SizeConstraint heightConstraint;
        private final SizeConstraint widthConstraint;
        private int columnCount = 1;
        private final Resettable<List<Cell>> _cells = new Resettable<>(new gzs<List<? extends Cell>>() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_cells$1
            {
                super(0);
            }

            @Override // xsna.gzs
            public final List<? extends GridContainer.Cell> invoke() {
                List<? extends GridContainer.Cell> distributeCells;
                distributeCells = GridContainer.Grid.this.distributeCells();
                return distributeCells;
            }
        });
        private final Resettable<List<Line>> _columns = new Resettable<>(new gzs<List<? extends Line>>() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_columns$1
            {
                super(0);
            }

            @Override // xsna.gzs
            public final List<? extends GridContainer.Line> invoke() {
                List<? extends GridContainer.Line> measureColumns;
                measureColumns = GridContainer.Grid.this.measureColumns();
                return measureColumns;
            }
        });
        private final Resettable<List<Line>> _rows = new Resettable<>(new gzs<List<? extends Line>>() { // from class: com.yandex.div.core.widget.GridContainer$Grid$_rows$1
            {
                super(0);
            }

            @Override // xsna.gzs
            public final List<? extends GridContainer.Line> invoke() {
                List<? extends GridContainer.Line> measureRows;
                measureRows = GridContainer.Grid.this.measureRows();
                return measureRows;
            }
        });

        public Grid() {
            int i = 0;
            int i2 = 3;
            zcl zclVar = null;
            this.widthConstraint = new SizeConstraint(i, i, i2, zclVar);
            this.heightConstraint = new SizeConstraint(i, i, i2, zclVar);
        }

        private final void adjustWeightedLines(List<Line> list, SizeConstraint sizeConstraint) {
            int size = list.size();
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            int i = 0;
            float f2 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                Line line = list.get(i2);
                if (line.isFlexible()) {
                    f += line.getWeight();
                    f2 = Math.max(f2, line.getSize() / line.getWeight());
                } else {
                    i += line.getSize();
                }
                line.getSize();
            }
            int size2 = list.size();
            int i3 = 0;
            for (int i4 = 0; i4 < size2; i4++) {
                Line line2 = list.get(i4);
                i3 += line2.isFlexible() ? (int) Math.ceil(line2.getWeight() * f2) : line2.getSize();
            }
            float max = Math.max(0, Math.max(sizeConstraint.min, i3) - i) / f;
            int size3 = list.size();
            for (int i5 = 0; i5 < size3; i5++) {
                Line line3 = list.get(i5);
                if (line3.isFlexible()) {
                    int ceil = (int) Math.ceil(line3.getWeight() * max);
                    Line.include$default(line3, ceil - line3.getMarginSize(), ceil, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
                }
            }
        }

        private final void align(List<Line> list) {
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                Line line = list.get(i2);
                line.setOffset(i);
                i += line.getSize();
            }
        }

        private final int calculateSize(List<Line> list) {
            if (list.isEmpty()) {
                return 0;
            }
            Line line = (Line) j5g.i0(list);
            return line.getOffset() + line.getSize();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Cell> distributeCells() {
            Integer num;
            if (GridContainer.this.getChildCount() == 0) {
                return EmptyList.b;
            }
            int i = this.columnCount;
            ArrayList arrayList = new ArrayList(GridContainer.this.getChildCount());
            int[] iArr = new int[i];
            int[] iArr2 = new int[i];
            GridContainer gridContainer = GridContainer.this;
            int childCount = gridContainer.getChildCount();
            int i2 = 0;
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = gridContainer.getChildAt(i3);
                if (childAt.getVisibility() != 8) {
                    Integer i0 = rl3.i0(iArr2);
                    int intValue = i0 != null ? i0.intValue() : 0;
                    int T = rl3.T(intValue, iArr2);
                    int i4 = i2 + intValue;
                    k9x q = swe0.q(0, i);
                    int i5 = q.b;
                    int i6 = q.c;
                    if (i5 <= i6) {
                        while (true) {
                            iArr2[i5] = Math.max(0, iArr2[i5] - intValue);
                            if (i5 == i6) {
                                break;
                            }
                            i5++;
                        }
                    }
                    DivViewGroup.Companion companion = DivViewGroup.Companion;
                    DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                    int min = Math.min(divLayoutParams.getColumnSpan(), i - T);
                    int rowSpan = divLayoutParams.getRowSpan();
                    arrayList.add(new Cell(i3, T, i4, min, rowSpan));
                    int i7 = T + min;
                    while (T < i7) {
                        if (iArr2[T] > 0) {
                            Cell cell = (Cell) arrayList.get(iArr[T]);
                            int i8 = cell.columnIndex;
                            int i9 = cell.columnSpan + i8;
                            while (i8 < i9) {
                                int i10 = iArr2[i8];
                                iArr2[i8] = 0;
                                i8++;
                            }
                            cell.rowSpan = i4 - cell.rowIndex;
                        }
                        iArr[T] = i3;
                        iArr2[T] = rowSpan;
                        T++;
                    }
                    i2 = i4;
                }
            }
            if (i == 0) {
                num = null;
            } else {
                int i11 = iArr2[0];
                if (i11 < 1) {
                    i11 = 1;
                }
                Integer valueOf = Integer.valueOf(i11);
                j9x it = new k9x(1, i - 1, 1).iterator();
                while (it.d) {
                    int i12 = iArr2[it.nextInt()];
                    if (i12 < 1) {
                        i12 = 1;
                    }
                    Integer valueOf2 = Integer.valueOf(i12);
                    if (valueOf.compareTo(valueOf2) > 0) {
                        valueOf = valueOf2;
                    }
                }
                num = valueOf;
            }
            int intValue2 = ((Cell) j5g.i0(arrayList)).rowIndex + (num != null ? num.intValue() : 1);
            int size = arrayList.size();
            for (int i13 = 0; i13 < size; i13++) {
                Cell cell2 = (Cell) arrayList.get(i13);
                int i14 = cell2.rowIndex;
                if (cell2.rowSpan + i14 > intValue2) {
                    cell2.rowSpan = intValue2 - i14;
                }
            }
            return arrayList;
        }

        private final int getHeight() {
            return calculateSize(getRows());
        }

        private final int getWidth() {
            return calculateSize(getColumns());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Line> measureColumns() {
            int i;
            float f;
            int i2;
            float columnWeight;
            float columnWeight2;
            int i3;
            int i4 = this.columnCount;
            SizeConstraint sizeConstraint = this.widthConstraint;
            List<Cell> list = this._cells.get();
            ArrayList arrayList = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList.add(new Line());
            }
            GridContainer gridContainer = GridContainer.this;
            int size = list.size();
            for (int i6 = 0; i6 < size; i6++) {
                Cell cell = list.get(i6);
                View childAt = gridContainer.getChildAt(cell.viewIndex);
                DivViewGroup.Companion companion = DivViewGroup.Companion;
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                int i7 = cell.columnIndex;
                int measuredWidth = childAt.getMeasuredWidth();
                int i8 = ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                int i9 = ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                int i10 = cell.columnSpan;
                columnWeight2 = GridContainerKt.getColumnWeight(divLayoutParams);
                CellProjection cellProjection = new CellProjection(i7, measuredWidth, i8, i9, i10, columnWeight2);
                int i11 = cellProjection.span;
                if (i11 == 1) {
                    ((Line) arrayList.get(cellProjection.index)).include(cellProjection.contentSize, cellProjection.getSize(), cellProjection.weight);
                } else {
                    int i12 = i11 - 1;
                    float f2 = cellProjection.weight / i11;
                    if (i12 >= 0) {
                        while (true) {
                            Line.include$default((Line) arrayList.get(cellProjection.index + i3), 0, 0, f2, 3, null);
                            i3 = i3 != i12 ? i3 + 1 : 0;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            GridContainer gridContainer2 = GridContainer.this;
            int size2 = list.size();
            for (int i13 = 0; i13 < size2; i13++) {
                Cell cell2 = list.get(i13);
                View childAt2 = gridContainer2.getChildAt(cell2.viewIndex);
                DivViewGroup.Companion companion2 = DivViewGroup.Companion;
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) childAt2.getLayoutParams();
                int i14 = cell2.columnIndex;
                int measuredWidth2 = childAt2.getMeasuredWidth();
                int i15 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).leftMargin;
                int i16 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).rightMargin;
                int i17 = cell2.columnSpan;
                columnWeight = GridContainerKt.getColumnWeight(divLayoutParams2);
                CellProjection cellProjection2 = new CellProjection(i14, measuredWidth2, i15, i16, i17, columnWeight);
                if (cellProjection2.span > 1) {
                    arrayList2.add(cellProjection2);
                }
            }
            g5g.L(arrayList2, SpannedCellComparator.INSTANCE);
            int size3 = arrayList2.size();
            for (int i18 = 0; i18 < size3; i18++) {
                CellProjection cellProjection3 = (CellProjection) arrayList2.get(i18);
                int i19 = cellProjection3.index;
                int i20 = (cellProjection3.span + i19) - 1;
                int size4 = cellProjection3.getSize();
                if (i19 <= i20) {
                    int i21 = i19;
                    i = size4;
                    f = 0.0f;
                    i2 = 0;
                    while (true) {
                        Line line = (Line) arrayList.get(i21);
                        size4 -= line.getSize();
                        if (line.isFlexible()) {
                            f += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i2++;
                            }
                            i -= line.getSize();
                        }
                        if (i21 == i20) {
                            break;
                        }
                        i21++;
                    }
                } else {
                    i = size4;
                    f = 0.0f;
                    i2 = 0;
                }
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (i19 <= i20) {
                        while (true) {
                            Line line2 = (Line) arrayList.get(i19);
                            if (line2.isFlexible()) {
                                int ceil = (int) Math.ceil((line2.getWeight() / f) * i);
                                Line.include$default(line2, ceil - line2.getMarginSize(), ceil, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
                            }
                            if (i19 != i20) {
                                i19++;
                            }
                        }
                    }
                } else if (size4 > 0 && i19 <= i20) {
                    while (true) {
                        Line line3 = (Line) arrayList.get(i19);
                        if (i2 <= 0) {
                            int i22 = size4 / cellProjection3.span;
                            Line.include$default(line3, line3.getContentSize() + i22, line3.getSize() + i22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
                        } else if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                            int i23 = size4 / i2;
                            Line.include$default(line3, line3.getContentSize() + i23, line3.getSize() + i23, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
                        }
                        if (i19 != i20) {
                            i19++;
                        }
                    }
                }
            }
            adjustWeightedLines(arrayList, sizeConstraint);
            align(arrayList);
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Line> measureRows() {
            int i;
            float f;
            int i2;
            float rowWeight;
            float rowWeight2;
            int i3;
            int rowCount = getRowCount();
            SizeConstraint sizeConstraint = this.heightConstraint;
            List<Cell> list = this._cells.get();
            ArrayList arrayList = new ArrayList(rowCount);
            for (int i4 = 0; i4 < rowCount; i4++) {
                arrayList.add(new Line());
            }
            GridContainer gridContainer = GridContainer.this;
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                Cell cell = list.get(i5);
                View childAt = gridContainer.getChildAt(cell.viewIndex);
                DivViewGroup.Companion companion = DivViewGroup.Companion;
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                int i6 = cell.rowIndex;
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                int i8 = ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                int i9 = cell.rowSpan;
                rowWeight2 = GridContainerKt.getRowWeight(divLayoutParams);
                CellProjection cellProjection = new CellProjection(i6, measuredHeight, i7, i8, i9, rowWeight2);
                int i10 = cellProjection.span;
                if (i10 == 1) {
                    ((Line) arrayList.get(cellProjection.index)).include(cellProjection.contentSize, cellProjection.getSize(), cellProjection.weight);
                } else {
                    int i11 = i10 - 1;
                    float f2 = cellProjection.weight / i10;
                    if (i11 >= 0) {
                        while (true) {
                            Line.include$default((Line) arrayList.get(cellProjection.index + i3), 0, 0, f2, 3, null);
                            i3 = i3 != i11 ? i3 + 1 : 0;
                        }
                    }
                }
            }
            ArrayList arrayList2 = new ArrayList();
            GridContainer gridContainer2 = GridContainer.this;
            int size2 = list.size();
            for (int i12 = 0; i12 < size2; i12++) {
                Cell cell2 = list.get(i12);
                View childAt2 = gridContainer2.getChildAt(cell2.viewIndex);
                DivViewGroup.Companion companion2 = DivViewGroup.Companion;
                DivLayoutParams divLayoutParams2 = (DivLayoutParams) childAt2.getLayoutParams();
                int i13 = cell2.rowIndex;
                int measuredHeight2 = childAt2.getMeasuredHeight();
                int i14 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).topMargin;
                int i15 = ((ViewGroup.MarginLayoutParams) divLayoutParams2).bottomMargin;
                int i16 = cell2.rowSpan;
                rowWeight = GridContainerKt.getRowWeight(divLayoutParams2);
                CellProjection cellProjection2 = new CellProjection(i13, measuredHeight2, i14, i15, i16, rowWeight);
                if (cellProjection2.span > 1) {
                    arrayList2.add(cellProjection2);
                }
            }
            g5g.L(arrayList2, SpannedCellComparator.INSTANCE);
            int size3 = arrayList2.size();
            for (int i17 = 0; i17 < size3; i17++) {
                CellProjection cellProjection3 = (CellProjection) arrayList2.get(i17);
                int i18 = cellProjection3.index;
                int i19 = (cellProjection3.span + i18) - 1;
                int size4 = cellProjection3.getSize();
                if (i18 <= i19) {
                    int i20 = i18;
                    i = size4;
                    f = 0.0f;
                    i2 = 0;
                    while (true) {
                        Line line = (Line) arrayList.get(i20);
                        size4 -= line.getSize();
                        if (line.isFlexible()) {
                            f += line.getWeight();
                        } else {
                            if (line.getContentSize() == 0) {
                                i2++;
                            }
                            i -= line.getSize();
                        }
                        if (i20 == i19) {
                            break;
                        }
                        i20++;
                    }
                } else {
                    i = size4;
                    f = 0.0f;
                    i2 = 0;
                }
                if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    if (i18 <= i19) {
                        while (true) {
                            Line line2 = (Line) arrayList.get(i18);
                            if (line2.isFlexible()) {
                                int ceil = (int) Math.ceil((line2.getWeight() / f) * i);
                                Line.include$default(line2, ceil - line2.getMarginSize(), ceil, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
                            }
                            if (i18 != i19) {
                                i18++;
                            }
                        }
                    }
                } else if (size4 > 0 && i18 <= i19) {
                    while (true) {
                        Line line3 = (Line) arrayList.get(i18);
                        if (i2 <= 0) {
                            int i21 = size4 / cellProjection3.span;
                            Line.include$default(line3, line3.getContentSize() + i21, line3.getSize() + i21, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
                        } else if (line3.getContentSize() == 0 && !line3.isFlexible()) {
                            int i22 = size4 / i2;
                            Line.include$default(line3, line3.getContentSize() + i22, line3.getSize() + i22, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4, null);
                        }
                        if (i18 != i19) {
                            i18++;
                        }
                    }
                }
            }
            adjustWeightedLines(arrayList, sizeConstraint);
            align(arrayList);
            return arrayList;
        }

        private final int rowCount(List<Cell> list) {
            if (list.isEmpty()) {
                return 0;
            }
            Cell cell = (Cell) j5g.i0(list);
            return cell.rowIndex + cell.rowSpan;
        }

        public final List<Cell> getCells() {
            return this._cells.get();
        }

        public final int getColumnCount() {
            return this.columnCount;
        }

        public final List<Line> getColumns() {
            return this._columns.get();
        }

        public final int getMeasuredHeight() {
            if (this._rows.getInitialized()) {
                return calculateSize(this._rows.get());
            }
            return 0;
        }

        public final int getMeasuredWidth() {
            if (this._columns.getInitialized()) {
                return calculateSize(this._columns.get());
            }
            return 0;
        }

        public final int getRowCount() {
            return rowCount(getCells());
        }

        public final List<Line> getRows() {
            return this._rows.get();
        }

        public final void invalidateMeasurement() {
            this._columns.reset();
            this._rows.reset();
        }

        public final void invalidateStructure() {
            this._cells.reset();
            invalidateMeasurement();
        }

        public final int measureHeight(int i) {
            this.heightConstraint.set(i);
            return Math.max(this.heightConstraint.min, Math.min(getHeight(), this.heightConstraint.max));
        }

        public final int measureWidth(int i) {
            this.widthConstraint.set(i);
            return Math.max(this.widthConstraint.min, Math.min(getWidth(), this.widthConstraint.max));
        }

        public final void setColumnCount(int i) {
            if (i <= 0 || this.columnCount == i) {
                return;
            }
            this.columnCount = i;
            invalidateStructure();
        }
    }

    /* compiled from: GridContainer.kt */
    public static final class Line {
        private int contentSize;
        private int offset;
        private int size;
        private float weight;

        public static /* synthetic */ void include$default(Line line, int i, int i2, float f, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = 0;
            }
            if ((i3 & 4) != 0) {
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
            line.include(i, i2, f);
        }

        public final int getContentSize() {
            return this.contentSize;
        }

        public final int getMarginSize() {
            return this.size - this.contentSize;
        }

        public final int getOffset() {
            return this.offset;
        }

        public final int getSize() {
            return this.size;
        }

        public final float getWeight() {
            return this.weight;
        }

        public final void include(int i, int i2, float f) {
            this.contentSize = Math.max(this.contentSize, i);
            this.size = Math.max(this.size, i2);
            this.weight = Math.max(this.weight, f);
        }

        public final boolean isFlexible() {
            return this.weight > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }

        public final void setOffset(int i) {
            this.offset = i;
        }
    }

    /* compiled from: GridContainer.kt */
    public static final class SpannedCellComparator implements Comparator<CellProjection> {
        public static final SpannedCellComparator INSTANCE = new SpannedCellComparator();

        private SpannedCellComparator() {
        }

        @Override // java.util.Comparator
        public int compare(CellProjection cellProjection, CellProjection cellProjection2) {
            if (cellProjection.getSpecificSize() < cellProjection2.getSpecificSize()) {
                return 1;
            }
            return cellProjection.getSpecificSize() > cellProjection2.getSpecificSize() ? -1 : 0;
        }
    }

    public GridContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.grid = new Grid();
        if (isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.GridContainer, i, 0);
            try {
                setColumnCount(obtainStyledAttributes.getInt(R$styleable.GridContainer_android_columnCount, 1));
                setGravity(obtainStyledAttributes.getInt(R$styleable.GridContainer_android_gravity, 8388659));
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        this.initialized = true;
    }

    private final int calculateChildHorizontalPosition(int i, int i2, int i3, int i4) {
        int i5 = i4 & 7;
        return i5 != 1 ? i5 != 5 ? i : (i + i2) - i3 : x9.b(i2, i3, 2, i);
    }

    private final int calculateChildVerticalPosition(int i, int i2, int i3, int i4) {
        int i5 = i4 & 112;
        return i5 != 16 ? i5 != 80 ? i : (i + i2) - i3 : x9.b(i2, i3, 2, i);
    }

    private final int calculateGridHorizontalPosition() {
        int gravity = getGravity() & 7;
        int measuredWidth = this.grid.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
        return gravity != 1 ? gravity != 5 ? getPaddingLeft() : (getPaddingLeft() + measuredWidth2) - measuredWidth : x9.b(measuredWidth2, measuredWidth, 2, getPaddingLeft());
    }

    private final int calculateGridVerticalPosition() {
        int gravity = getGravity() & 112;
        int measuredHeight = this.grid.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        return gravity != 16 ? gravity != 80 ? getPaddingTop() : (getPaddingTop() + measuredHeight2) - measuredHeight : x9.b(measuredHeight2, measuredHeight, 2, getPaddingTop());
    }

    private final void checkConsistency() {
        int i = this.lastLayoutHashCode;
        if (i == 0) {
            validateLayoutParams();
            this.lastLayoutHashCode = computeLayoutHashCode();
        } else if (i != computeLayoutHashCode()) {
            invalidateStructure();
            checkConsistency();
        }
    }

    private final int computeLayoutHashCode() {
        int childCount = getChildCount();
        int i = Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt.getVisibility() != 8) {
                i = ((DivLayoutParams) childAt.getLayoutParams()).hashCode() + (i * 31);
            }
        }
        return i;
    }

    private final int getPaddingHorizontal() {
        return getPaddingRight() + getPaddingLeft();
    }

    private final int getPaddingVertical() {
        return getPaddingBottom() + getPaddingTop();
    }

    private final void invalidateMeasurement() {
        this.grid.invalidateMeasurement();
    }

    private final void invalidateStructure() {
        this.lastLayoutHashCode = 0;
        this.grid.invalidateStructure();
    }

    private final void measureChild(View view, int i, int i2, int i3, int i4) {
        DivViewGroup.Companion companion = DivViewGroup.Companion;
        view.measure(companion.getChildMeasureSpec(i, 0, i3, view.getMinimumWidth(), ((DivLayoutParams) view.getLayoutParams()).getMaxWidth()), companion.getChildMeasureSpec(i2, 0, i4, view.getMinimumHeight(), ((DivLayoutParams) view.getLayoutParams()).getMaxHeight()));
    }

    private final void measureChildrenInitial(int i, int i2) {
        int i3;
        int i4;
        int i5;
        GridContainer gridContainer;
        int childCount = getChildCount();
        int i6 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                int i7 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
                int i8 = i7 == -1 ? 0 : i7;
                int i9 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
                if (i9 == -1) {
                    i5 = 0;
                    gridContainer = this;
                    i3 = i;
                    i4 = i2;
                } else {
                    i5 = i9;
                    i3 = i;
                    i4 = i2;
                    gridContainer = this;
                }
                gridContainer.measureChild(childAt, i3, i4, i8, i5);
            } else {
                i3 = i;
                i4 = i2;
            }
            i6++;
            i = i3;
            i2 = i4;
        }
    }

    private final void measureMatchParentChild(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        view.measure(i3 == -1 ? View.MeasureSpec.makeMeasureSpec(i5, 1073741824) : DivViewGroup.Companion.getChildMeasureSpec(i, 0, i3, view.getMinimumWidth(), ((DivLayoutParams) view.getLayoutParams()).getMaxWidth()), i4 == -1 ? View.MeasureSpec.makeMeasureSpec(i6, 1073741824) : DivViewGroup.Companion.getChildMeasureSpec(i2, 0, i4, view.getMinimumHeight(), ((DivLayoutParams) view.getLayoutParams()).getMaxHeight()));
    }

    private final void remeasureChildrenHeight(int i, int i2) {
        List<Cell> cells = this.grid.getCells();
        List<Line> columns = this.grid.getColumns();
        List<Line> rows = this.grid.getRows();
        int childCount = getChildCount();
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt.getVisibility() != 8) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
                    Cell cell = cells.get(i3);
                    Line line = columns.get((cell.columnIndex + cell.columnSpan) - 1);
                    int offset = ((line.getOffset() + line.getSize()) - columns.get(cell.columnIndex).getOffset()) - divLayoutParams.getHorizontalMargins$div_release();
                    Line line2 = rows.get((cell.rowIndex + cell.rowSpan) - 1);
                    measureMatchParentChild(childAt, i, i2, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, offset, ((line2.getOffset() + line2.getSize()) - rows.get(cell.rowIndex).getOffset()) - divLayoutParams.getVerticalMargins$div_release());
                }
                i3++;
            }
        }
    }

    private final void remeasureChildrenWidth(int i, int i2) {
        int i3;
        int i4;
        List<Cell> cells = this.grid.getCells();
        List<Line> columns = this.grid.getColumns();
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).width != -1) {
                    i6++;
                } else {
                    Cell cell = cells.get(i6);
                    Line line = columns.get((cell.columnIndex + cell.columnSpan) - 1);
                    int offset = ((line.getOffset() + line.getSize()) - columns.get(cell.columnIndex).getOffset()) - divLayoutParams.getHorizontalMargins$div_release();
                    i3 = i;
                    i4 = i2;
                    measureMatchParentChild(childAt, i3, i4, ((ViewGroup.MarginLayoutParams) divLayoutParams).width, ((ViewGroup.MarginLayoutParams) divLayoutParams).height, offset, 0);
                    i6++;
                    i5++;
                    i = i3;
                    i2 = i4;
                }
            }
            i3 = i;
            i4 = i2;
            i5++;
            i = i3;
            i2 = i4;
        }
    }

    private final void validateLayoutParams() {
        float columnWeight;
        float rowWeight;
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            DivLayoutParams divLayoutParams = (DivLayoutParams) getChildAt(i).getLayoutParams();
            if (divLayoutParams.getColumnSpan() < 0 || divLayoutParams.getRowSpan() < 0) {
                throw new IllegalStateException("Negative spans are not supported.");
            }
            columnWeight = GridContainerKt.getColumnWeight(divLayoutParams);
            if (columnWeight >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                rowWeight = GridContainerKt.getRowWeight(divLayoutParams);
                if (rowWeight >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                }
            }
            throw new IllegalStateException("Negative weights are not supported.");
        }
    }

    public final int getColumnCount() {
        return this.grid.getColumnCount();
    }

    public final int getRowCount() {
        return this.grid.getRowCount();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        long j;
        List<Line> list;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        checkConsistency();
        List<Line> columns = this.grid.getColumns();
        List<Line> rows = this.grid.getRows();
        List<Cell> cells = this.grid.getCells();
        int calculateGridHorizontalPosition = calculateGridHorizontalPosition();
        int calculateGridVerticalPosition = calculateGridVerticalPosition();
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        while (i5 < childCount) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8) {
                DivLayoutParams divLayoutParams = (DivLayoutParams) childAt.getLayoutParams();
                Cell cell = cells.get(i6);
                int offset = columns.get(cell.columnIndex).getOffset() + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                j = elapsedRealtime;
                int offset2 = rows.get(cell.rowIndex).getOffset() + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                Line line = columns.get((cell.columnIndex + cell.columnSpan) - 1);
                int offset3 = ((line.getOffset() + line.getSize()) - offset) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin;
                Line line2 = rows.get((cell.rowIndex + cell.rowSpan) - 1);
                int offset4 = ((line2.getOffset() + line2.getSize()) - offset2) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                list = columns;
                int calculateChildHorizontalPosition = calculateChildHorizontalPosition(offset, offset3, childAt.getMeasuredWidth(), divLayoutParams.getGravity()) + calculateGridHorizontalPosition;
                int calculateChildVerticalPosition = calculateChildVerticalPosition(offset2, offset4, childAt.getMeasuredHeight(), divLayoutParams.getGravity()) + calculateGridVerticalPosition;
                childAt.layout(calculateChildHorizontalPosition, calculateChildVerticalPosition, childAt.getMeasuredWidth() + calculateChildHorizontalPosition, childAt.getMeasuredHeight() + calculateChildVerticalPosition);
                i6++;
            } else {
                j = elapsedRealtime;
                list = columns;
            }
            i5++;
            elapsedRealtime = j;
            columns = list;
        }
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, "GridContainer", qlb0.a(elapsedRealtime2, "onLayout() performed in ", " ms"));
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        checkConsistency();
        invalidateMeasurement();
        int paddingHorizontal = getPaddingHorizontal();
        int paddingVertical = getPaddingVertical();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i - paddingHorizontal), View.MeasureSpec.getMode(i));
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2 - paddingVertical), View.MeasureSpec.getMode(i2));
        measureChildrenInitial(makeMeasureSpec, makeMeasureSpec2);
        int measureWidth = this.grid.measureWidth(makeMeasureSpec);
        remeasureChildrenWidth(makeMeasureSpec, makeMeasureSpec2);
        int measureHeight = this.grid.measureHeight(makeMeasureSpec2);
        remeasureChildrenHeight(makeMeasureSpec, makeMeasureSpec2);
        setMeasuredDimension(View.resolveSizeAndState(Math.max(measureWidth + paddingHorizontal, getSuggestedMinimumWidth()), i, 0), View.resolveSizeAndState(Math.max(measureHeight + paddingVertical, getSuggestedMinimumHeight()), i2, 0));
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        KLog kLog = KLog.INSTANCE;
        if (kLog.isAtLeast(Severity.INFO)) {
            kLog.print(4, "GridContainer", qlb0.a(elapsedRealtime2, "onMeasure() performed in ", " ms"));
        }
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        invalidateStructure();
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        invalidateStructure();
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        super.requestLayout();
        if (this.initialized) {
            invalidateMeasurement();
        }
    }

    public final void setColumnCount(int i) {
        this.grid.setColumnCount(i);
        invalidateStructure();
        requestLayout();
    }

    /* compiled from: GridContainer.kt */
    public static final class SizeConstraint {
        public int max;
        public int min;

        public SizeConstraint(int i, int i2) {
            this.min = i;
            this.max = i2;
        }

        public final void set(int i) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == Integer.MIN_VALUE) {
                this.min = 0;
                this.max = size;
            } else if (mode == 0) {
                this.min = 0;
                this.max = 32768;
            } else {
                if (mode != 1073741824) {
                    return;
                }
                this.min = size;
                this.max = size;
            }
        }

        public /* synthetic */ SizeConstraint(int i, int i2, int i3, zcl zclVar) {
            this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 32768 : i2);
        }
    }
}
