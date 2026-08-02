package com.yandex.div.core.view2.divs.gallery;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.yandex.div.R$id;
import com.yandex.div.core.util.ViewsKt;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper;
import com.yandex.div.core.view2.divs.widgets.DivHolderView;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div2.DivAlignmentHorizontal;
import com.yandex.div2.DivAlignmentVertical;
import com.yandex.div2.DivGallery;
import com.yandex.div2.a;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import xsna.ikn;
import xsna.kxt0;

/* compiled from: DivGalleryItemHelper.kt */
/* loaded from: classes7.dex */
public interface DivGalleryItemHelper {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: DivGalleryItemHelper.kt */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        /* compiled from: DivGalleryItemHelper.kt */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;
            public static final /* synthetic */ int[] $EnumSwitchMapping$2;

            static {
                int[] iArr = new int[DivGallery.CrossContentAlignment.values().length];
                try {
                    iArr[DivGallery.CrossContentAlignment.START.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[DivGallery.CrossContentAlignment.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[DivGallery.CrossContentAlignment.END.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[DivAlignmentHorizontal.values().length];
                try {
                    iArr2[DivAlignmentHorizontal.LEFT.ordinal()] = 1;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.CENTER.ordinal()] = 2;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.RIGHT.ordinal()] = 3;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.START.ordinal()] = 4;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr2[DivAlignmentHorizontal.END.ordinal()] = 5;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$1 = iArr2;
                int[] iArr3 = new int[DivAlignmentVertical.values().length];
                try {
                    iArr3[DivAlignmentVertical.TOP.ordinal()] = 1;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr3[DivAlignmentVertical.BASELINE.ordinal()] = 2;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr3[DivAlignmentVertical.CENTER.ordinal()] = 3;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr3[DivAlignmentVertical.BOTTOM.ordinal()] = 4;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$2 = iArr3;
            }
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DivGallery.CrossContentAlignment asCrossContentAlignment(DivAlignmentHorizontal divAlignmentHorizontal) {
            int i = WhenMappings.$EnumSwitchMapping$1[divAlignmentHorizontal.ordinal()];
            if (i == 1) {
                return DivGallery.CrossContentAlignment.START;
            }
            if (i == 2) {
                return DivGallery.CrossContentAlignment.CENTER;
            }
            if (i == 3) {
                return DivGallery.CrossContentAlignment.END;
            }
            if (i == 4) {
                return DivGallery.CrossContentAlignment.START;
            }
            if (i == 5) {
                return DivGallery.CrossContentAlignment.END;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int calculateOffset(int i, int i2, DivGallery.CrossContentAlignment crossContentAlignment) {
            int i3 = i - i2;
            int i4 = WhenMappings.$EnumSwitchMapping$0[crossContentAlignment.ordinal()];
            if (i4 == 1) {
                return 0;
            }
            if (i4 == 2) {
                return i3 / 2;
            }
            if (i4 == 3) {
                return i3;
            }
            throw new NoWhenBranchMatchedException();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final DivGallery.CrossContentAlignment asCrossContentAlignment(DivAlignmentVertical divAlignmentVertical) {
            int i = WhenMappings.$EnumSwitchMapping$2[divAlignmentVertical.ordinal()];
            if (i == 1 || i == 2) {
                return DivGallery.CrossContentAlignment.START;
            }
            if (i == 3) {
                return DivGallery.CrossContentAlignment.CENTER;
            }
            if (i == 4) {
                return DivGallery.CrossContentAlignment.END;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: DivGalleryItemHelper.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ScrollPosition.values().length];
            try {
                iArr[ScrollPosition.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScrollPosition.DEFAULT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static /* synthetic */ void _layoutDecoratedWithMargins$default(DivGalleryItemHelper divGalleryItemHelper, View view, int i, int i2, int i3, int i4, boolean z, int i5, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: _layoutDecoratedWithMargins");
        }
        if ((i5 & 32) != 0) {
            z = false;
        }
        divGalleryItemHelper._layoutDecoratedWithMargins(view, i, i2, i3, i4, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default int getScrollOffset(View view) {
        int marginStart;
        int paddingStart;
        if (isHorizontal()) {
            int width = ViewsKt.isLayoutRtl(view) ? getView().getWidth() - view.getRight() : view.getLeft();
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            marginStart = width - (layoutParams instanceof ViewGroup.MarginLayoutParams ? ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart() : 0);
            paddingStart = getView().getPaddingStart();
        } else {
            int top = view.getTop();
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
            marginStart = top - (marginLayoutParams != null ? marginLayoutParams.topMargin : 0);
            paddingStart = getView().getPaddingTop();
        }
        return marginStart - paddingStart;
    }

    static /* synthetic */ void instantScroll$default(DivGalleryItemHelper divGalleryItemHelper, int i, ScrollPosition scrollPosition, int i2, int i3, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: instantScroll");
        }
        if ((i3 & 2) != 0) {
            scrollPosition = ScrollPosition.DEFAULT;
        }
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        divGalleryItemHelper.instantScroll(i, scrollPosition, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    default boolean isHorizontal() {
        return getLayoutManagerOrientation() == 0;
    }

    static /* synthetic */ void trackVisibilityAction$default(DivGalleryItemHelper divGalleryItemHelper, View view, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: trackVisibilityAction");
        }
        if ((i & 2) != 0) {
            z = false;
        }
        divGalleryItemHelper.trackVisibilityAction(view, z);
    }

    default void _detachViewAt(int i) {
        View _getChildAt = _getChildAt(i);
        if (_getChildAt == null) {
            return;
        }
        trackVisibilityAction(_getChildAt, true);
    }

    View _getChildAt(int i);

    int _getPosition(View view);

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ba, code lost:
    
        if (r5 == null) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e6, code lost:
    
        if (r2 == null) goto L53;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    default void _layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4, boolean z) {
        ExpressionResolver expressionResolver;
        int i5;
        int i6;
        DivGallery.CrossContentAlignment evaluate;
        DivAlignmentVertical evaluate2;
        DivGallery.CrossContentAlignment evaluate3;
        DivAlignmentHorizontal evaluate4;
        a div;
        int layoutManagerOrientation = getLayoutManagerOrientation();
        int measuredWidth = (getView().getMeasuredWidth() - getView().getPaddingLeft()) - getView().getPaddingRight();
        int measuredHeight = (getView().getMeasuredHeight() - getView().getPaddingTop()) - getView().getPaddingBottom();
        if (layoutManagerOrientation == 0 ? getView().getMeasuredHeight() == 0 || measuredHeight == 0 || view.getMeasuredHeight() == 0 : layoutManagerOrientation == 1 && (getView().getMeasuredWidth() == 0 || measuredWidth == 0 || view.getMeasuredWidth() == 0)) {
            superLayoutDecoratedWithMargins(view, i, i2, i3, i4);
            if (z) {
                return;
            }
            getChildrenToRelayout().add(view);
            return;
        }
        Integer num = (Integer) view.getTag(R$id.div_gallery_item_index);
        DivItemBuilderResult itemDiv = num != null ? getItemDiv(num.intValue()) : null;
        ikn b = (itemDiv == null || (div = itemDiv.getDiv()) == null) ? null : div.b();
        if (itemDiv == null || (expressionResolver = itemDiv.getExpressionResolver()) == null) {
            expressionResolver = getBindingContext().getExpressionResolver();
        }
        Expression<DivGallery.CrossContentAlignment> expression = getDiv().j;
        if (layoutManagerOrientation == 1) {
            Expression<DivAlignmentHorizontal> j = b != null ? b.j() : null;
            if (j != null && (evaluate4 = j.evaluate(expressionResolver)) != null) {
                evaluate3 = Companion.asCrossContentAlignment(evaluate4);
            }
            evaluate3 = expression.evaluate(expressionResolver);
            i5 = Companion.calculateOffset(measuredWidth, i3 - i, evaluate3);
        } else {
            i5 = 0;
        }
        if (layoutManagerOrientation == 0) {
            Expression<DivAlignmentVertical> v = b != null ? b.v() : null;
            if (v != null && (evaluate2 = v.evaluate(expressionResolver)) != null) {
                evaluate = Companion.asCrossContentAlignment(evaluate2);
            }
            evaluate = expression.evaluate(expressionResolver);
            i6 = Companion.calculateOffset(measuredHeight, i4 - i2, evaluate);
        } else {
            i6 = 0;
        }
        superLayoutDecoratedWithMargins(view, i + i5, i2 + i6, i3 + i5, i4 + i6);
        trackVisibilityAction$default(this, view, false, 2, null);
        if (z) {
            return;
        }
        getChildrenToRelayout().remove(view);
    }

    default void _onAttachedToWindow(RecyclerView recyclerView) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            trackVisibilityAction$default(this, recyclerView.getChildAt(i), false, 2, null);
        }
    }

    default void _onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            trackVisibilityAction(recyclerView.getChildAt(i), true);
        }
    }

    default void _onLayoutCompleted(RecyclerView.a0 a0Var) {
        for (View view : getChildrenToRelayout()) {
            _layoutDecoratedWithMargins(view, view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), true);
        }
        getChildrenToRelayout().clear();
    }

    default void _removeAndRecycleAllViews(RecyclerView.v vVar) {
        RecyclerView view = getView();
        int childCount = view.getChildCount();
        for (int i = 0; i < childCount; i++) {
            trackVisibilityAction(view.getChildAt(i), true);
        }
    }

    default void _removeView(View view) {
        trackVisibilityAction(view, true);
    }

    default void _removeViewAt(int i) {
        View _getChildAt = _getChildAt(i);
        if (_getChildAt == null) {
            return;
        }
        trackVisibilityAction(_getChildAt, true);
    }

    default int calcScrollOffset(View view) {
        return getScrollOffset(view);
    }

    int firstCompletelyVisibleItemPosition();

    int firstVisibleItemPosition();

    BindingContext getBindingContext();

    default int getChildMeasureSpec(int i, int i2, int i3, int i4, int i5, boolean z) {
        int i6 = i - i3;
        if (i6 < 0) {
            i6 = 0;
        }
        return (i4 < 0 || i4 > Integer.MAX_VALUE) ? i4 == -1 ? (z && i2 == 0) ? com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec() : View.MeasureSpec.makeMeasureSpec(i6, i2) : i4 == -2 ? i5 == Integer.MAX_VALUE ? com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec() : com.yandex.div.core.widget.ViewsKt.makeAtMostSpec(i5) : i4 == -3 ? (i2 == Integer.MIN_VALUE || i2 == 1073741824) ? com.yandex.div.core.widget.ViewsKt.makeAtMostSpec(Math.min(i6, i5)) : i5 == Integer.MAX_VALUE ? com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec() : com.yandex.div.core.widget.ViewsKt.makeAtMostSpec(i5) : com.yandex.div.core.widget.ViewsKt.makeUnspecifiedSpec() : com.yandex.div.core.widget.ViewsKt.makeExactSpec(i4);
    }

    Set<View> getChildrenToRelayout();

    DivGallery getDiv();

    DivItemBuilderResult getItemDiv(int i);

    int getLayoutManagerOrientation();

    RecyclerView getView();

    default void instantScroll(final int i, final ScrollPosition scrollPosition, final int i2) {
        RecyclerView view = getView();
        if (!ViewsKt.isActuallyLaidOut(view) || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper$instantScroll$$inlined$doOnActualLayout$1
                @Override // android.view.View.OnLayoutChangeListener
                public void onLayoutChange(View view2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                    view2.removeOnLayoutChangeListener(this);
                    if (i == 0) {
                        int i11 = (this.isHorizontal() && ViewsKt.isLayoutRtl(this.getView())) ? i2 : -i2;
                        this.getView().scrollBy(i11, i11);
                        return;
                    }
                    this.getView().scrollBy(-this.getView().getScrollX(), -this.getView().getScrollY());
                    RecyclerView.o layoutManager = this.getView().getLayoutManager();
                    View findViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i) : null;
                    while (findViewByPosition == null && (this.getView().canScrollVertically(1) || this.getView().canScrollHorizontally(1))) {
                        RecyclerView.o layoutManager2 = this.getView().getLayoutManager();
                        if (layoutManager2 != null) {
                            layoutManager2.requestLayout();
                        }
                        RecyclerView.o layoutManager3 = this.getView().getLayoutManager();
                        findViewByPosition = layoutManager3 != null ? layoutManager3.findViewByPosition(i) : null;
                        if (findViewByPosition != null) {
                            break;
                        } else {
                            this.getView().scrollBy(this.getView().getWidth(), this.getView().getHeight());
                        }
                    }
                    if (findViewByPosition != null) {
                        int i12 = DivGalleryItemHelper.WhenMappings.$EnumSwitchMapping$0[scrollPosition.ordinal()];
                        if (i12 != 1) {
                            if (i12 != 2) {
                                return;
                            }
                            int scrollOffset = this.getScrollOffset(findViewByPosition) - i2;
                            if (ViewsKt.isLayoutRtl(this.getView())) {
                                scrollOffset = -scrollOffset;
                            }
                            this.getView().scrollBy(scrollOffset, scrollOffset);
                            return;
                        }
                        int[] iArr = {0, 0};
                        int[] iArr2 = {0, 0};
                        this.getView().getLocationOnScreen(iArr2);
                        findViewByPosition.getLocationOnScreen(iArr);
                        this.getView().scrollBy(((findViewByPosition.getWidth() - this.getView().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((findViewByPosition.getHeight() - this.getView().getHeight()) / 2) + (iArr[1] - iArr2[1]));
                    }
                }
            });
            return;
        }
        if (i == 0) {
            if (!isHorizontal() || !ViewsKt.isLayoutRtl(getView())) {
                i2 = -i2;
            }
            getView().scrollBy(i2, i2);
            return;
        }
        getView().scrollBy(-getView().getScrollX(), -getView().getScrollY());
        RecyclerView.o layoutManager = getView().getLayoutManager();
        View findViewByPosition = layoutManager != null ? layoutManager.findViewByPosition(i) : null;
        while (findViewByPosition == null && (getView().canScrollVertically(1) || getView().canScrollHorizontally(1))) {
            RecyclerView.o layoutManager2 = getView().getLayoutManager();
            if (layoutManager2 != null) {
                layoutManager2.requestLayout();
            }
            RecyclerView.o layoutManager3 = getView().getLayoutManager();
            findViewByPosition = layoutManager3 != null ? layoutManager3.findViewByPosition(i) : null;
            if (findViewByPosition != null) {
                break;
            } else {
                getView().scrollBy(getView().getWidth(), getView().getHeight());
            }
        }
        if (findViewByPosition != null) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[scrollPosition.ordinal()];
            if (i3 != 1) {
                if (i3 != 2) {
                    return;
                }
                int scrollOffset = getScrollOffset(findViewByPosition) - i2;
                if (ViewsKt.isLayoutRtl(getView())) {
                    scrollOffset = -scrollOffset;
                }
                getView().scrollBy(scrollOffset, scrollOffset);
                return;
            }
            int[] iArr = {0, 0};
            int[] iArr2 = {0, 0};
            getView().getLocationOnScreen(iArr2);
            findViewByPosition.getLocationOnScreen(iArr);
            getView().scrollBy(((findViewByPosition.getWidth() - getView().getWidth()) / 2) + (iArr[0] - iArr2[0]), ((findViewByPosition.getHeight() - getView().getHeight()) / 2) + (iArr[1] - iArr2[1]));
        }
    }

    void instantScrollToPosition(int i, ScrollPosition scrollPosition);

    void instantScrollToPositionWithOffset(int i, int i2, ScrollPosition scrollPosition);

    int lastCompletelyVisibleItemPosition();

    int lastVisibleItemPosition();

    void superLayoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4);

    RecyclerView.o toLayoutManager();

    /* JADX WARN: Multi-variable type inference failed */
    default void trackVisibilityAction(View view, boolean z) {
        BindingContext bindingContext;
        int _getPosition = _getPosition(view);
        if (_getPosition == -1) {
            return;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null) {
            return;
        }
        kxt0 kxt0Var = new kxt0(viewGroup);
        View next = !kxt0Var.hasNext() ? null : kxt0Var.next();
        if (next == 0) {
            return;
        }
        Div2View divView = getBindingContext().getDivView();
        if (!z) {
            DivItemBuilderResult itemDiv = getItemDiv(_getPosition);
            if (itemDiv == null) {
                return;
            }
            divView.getDiv2Component$div_release().getVisibilityActionTracker().startTrackingViewsHierarchy(getBindingContext().getFor(itemDiv.getExpressionResolver()), next, itemDiv.getDiv());
            divView.bindViewToDiv$div_release(next, itemDiv.getDiv());
            return;
        }
        a takeBindingDiv$div_release = divView.takeBindingDiv$div_release(next);
        if (takeBindingDiv$div_release == null) {
            return;
        }
        DivHolderView divHolderView = next instanceof DivHolderView ? (DivHolderView) next : null;
        if (divHolderView == null || (bindingContext = divHolderView.getBindingContext()) == null) {
            return;
        }
        divView.getDiv2Component$div_release().getVisibilityActionTracker().cancelTrackingViewsHierarchy(bindingContext, next, takeBindingDiv$div_release);
        divView.unbindViewFromDiv$div_release(next);
    }

    int width();
}
