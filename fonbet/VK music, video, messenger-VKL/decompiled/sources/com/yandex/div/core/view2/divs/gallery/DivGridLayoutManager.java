package com.yandex.div.core.view2.divs.gallery;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.yandex.div.core.view2.BindingContext;
import com.yandex.div.core.view2.divs.BaseDivViewExtensionsKt;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.core.DivItemBuilderResult;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div2.DivGallery;
import com.yandex.div2.v9;
import java.util.HashSet;
import xsna.ikn;
import xsna.j5g;
import xsna.mq;
import xsna.rl3;

/* compiled from: DivGridLayoutManager.kt */
/* loaded from: classes7.dex */
public final class DivGridLayoutManager extends StaggeredGridLayoutManager implements DivGalleryItemHelper {
    private final BindingContext bindingContext;
    private final HashSet<View> childrenToRelayout;
    private final DivGallery div;
    private final RecyclerView view;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DivGridLayoutManager(BindingContext bindingContext, RecyclerView recyclerView, DivGallery divGallery, int i) {
        super(r0, i);
        int i2;
        Expression<Long> expression = divGallery.h;
        if (expression != null) {
            long longValue = expression.evaluate(bindingContext.getExpressionResolver()).longValue();
            long j = longValue >> 31;
            if (j == 0 || j == -1) {
                i2 = (int) longValue;
            } else {
                KAssert kAssert = KAssert.INSTANCE;
                if (Assert.isEnabled()) {
                    mq.a(longValue, "Unable convert '", "' to Int");
                }
                i2 = longValue > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
        } else {
            i2 = 1;
        }
        this.bindingContext = bindingContext;
        this.view = recyclerView;
        this.div = divGallery;
        this.childrenToRelayout = new HashSet<>();
    }

    private final int getCrossSpacing() {
        Expression<Long> expression = getDiv().k;
        return expression != null ? BaseDivViewExtensionsKt.dpToPx(Long.valueOf(expression.evaluate(getBindingContext().getExpressionResolver()).longValue()), getView().getResources().getDisplayMetrics()) : getItemSpacing();
    }

    private final int getItemSpacing() {
        return BaseDivViewExtensionsKt.dpToPx(getDiv().t.evaluate(getBindingContext().getExpressionResolver()), getView().getResources().getDisplayMetrics());
    }

    private final int spacingByOrientation(int i) {
        return i == getOrientation() ? getItemSpacing() : getCrossSpacing();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public View _getChildAt(int i) {
        return getChildAt(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int _getPosition(View view) {
        return getPosition(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void calculateItemDecorationsForChild(View view, Rect rect) {
        DivItemBuilderResult itemDiv;
        super.calculateItemDecorationsForChild(view, rect);
        int _getPosition = _getPosition(view);
        if (_getPosition == -1 || (itemDiv = getItemDiv(_getPosition)) == null) {
            return;
        }
        ikn b = itemDiv.getDiv().b();
        boolean z = b.getHeight() instanceof v9.a;
        boolean z2 = b.getWidth() instanceof v9.a;
        int i = 0;
        boolean z3 = getSpanCount() > 1;
        int spacingByOrientation = (z && z3) ? spacingByOrientation(1) / 2 : 0;
        if (z2 && z3) {
            i = spacingByOrientation(0) / 2;
        }
        rect.set(rect.left - i, rect.top - spacingByOrientation, rect.right - i, rect.bottom - spacingByOrientation);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void detachViewAt(int i) {
        super.detachViewAt(i);
        _detachViewAt(i);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int firstCompletelyVisibleItemPosition() {
        int itemCount = getItemCount();
        int spanCount = getSpanCount();
        if (itemCount < spanCount) {
            itemCount = spanCount;
        }
        int[] iArr = new int[itemCount];
        findFirstCompletelyVisibleItemPositions(iArr);
        return rl3.K(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int firstVisibleItemPosition() {
        int itemCount = getItemCount();
        int spanCount = getSpanCount();
        if (itemCount < spanCount) {
            itemCount = spanCount;
        }
        int[] iArr = new int[itemCount];
        findFirstVisibleItemPositions(iArr);
        return rl3.K(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public BindingContext getBindingContext() {
        return this.bindingContext;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public DivGallery getDiv() {
        return this.div;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public DivItemBuilderResult getItemDiv(int i) {
        return (DivItemBuilderResult) j5g.b0(i, ((DivGalleryAdapter) getView().getAdapter()).getVisibleItems());
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int getLayoutManagerOrientation() {
        return getOrientation();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getPaddingBottom() {
        return super.getPaddingBottom() - (spacingByOrientation(1) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getPaddingLeft() {
        return super.getPaddingLeft() - (spacingByOrientation(0) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getPaddingRight() {
        return super.getPaddingRight() - (spacingByOrientation(0) / 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int getPaddingTop() {
        return super.getPaddingTop() - (spacingByOrientation(1) / 2);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public RecyclerView getView() {
        return this.view;
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void instantScrollToPosition(int i, ScrollPosition scrollPosition) {
        DivGalleryItemHelper.instantScroll$default(this, i, scrollPosition, 0, 4, null);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void instantScrollToPositionWithOffset(int i, int i2, ScrollPosition scrollPosition) {
        instantScroll(i, scrollPosition, i2);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int lastCompletelyVisibleItemPosition() {
        int itemCount = getItemCount();
        int spanCount = getSpanCount();
        if (itemCount < spanCount) {
            itemCount = spanCount;
        }
        int[] iArr = new int[itemCount];
        findLastCompletelyVisibleItemPositions(iArr);
        return rl3.a0(iArr);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int lastVisibleItemPosition() {
        int itemCount = getItemCount();
        int spanCount = getSpanCount();
        if (itemCount < spanCount) {
            itemCount = spanCount;
        }
        int[] iArr = new int[itemCount];
        findLastVisibleItemPositions(iArr);
        return rl3.a0(iArr);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        DivGalleryItemHelper._layoutDecoratedWithMargins$default(this, view, i, i2, i3, i4, false, 32, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void onAttachedToWindow(RecyclerView recyclerView) {
        super.onAttachedToWindow(recyclerView);
        _onAttachedToWindow(recyclerView);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onDetachedFromWindow(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.onDetachedFromWindow(recyclerView, vVar);
        _onDetachedFromWindow(recyclerView, vVar);
    }

    @Override // androidx.recyclerview.widget.StaggeredGridLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void onLayoutCompleted(RecyclerView.a0 a0Var) {
        _onLayoutCompleted(a0Var);
        super.onLayoutCompleted(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void removeAndRecycleAllViews(RecyclerView.v vVar) {
        _removeAndRecycleAllViews(vVar);
        super.removeAndRecycleAllViews(vVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void removeView(View view) {
        super.removeView(view);
        _removeView(view);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void removeViewAt(int i) {
        super.removeViewAt(i);
        _removeViewAt(i);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public void superLayoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
        super.layoutDecoratedWithMargins(view, i, i2, i3, i4);
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public DivGridLayoutManager toLayoutManager() {
        return this;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o, com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public int width() {
        return getWidth();
    }

    @Override // com.yandex.div.core.view2.divs.gallery.DivGalleryItemHelper
    public HashSet<View> getChildrenToRelayout() {
        return this.childrenToRelayout;
    }
}
