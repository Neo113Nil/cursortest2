package com.yandex.plus.home.feature.panel.internal.base;

import android.content.Context;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import defpackage.bb1;
import defpackage.db90;
import defpackage.eb90;
import defpackage.tls;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0010\u0018\u0000 J2\u00020\u0001:\u0002KLB1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0018\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010#\u001a\u00020\u000b2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000b0 H\u0082\b¢\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\u000b*\u00020!2\u0006\u0010%\u001a\u00020\u0006H\u0002¢\u0006\u0004\b&\u0010'J3\u0010+\u001a\u00020\u000b*\u00020!2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00062\u0006\u0010)\u001a\u00020\u00062\u0006\u0010*\u001a\u00020\u0006H\u0002¢\u0006\u0004\b+\u0010,J#\u0010.\u001a\u00020\u000b*\u00020!2\u0006\u0010%\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u0006H\u0002¢\u0006\u0004\b.\u0010/J\u0013\u00100\u001a\u00020\u0014*\u00020\u000eH\u0002¢\u0006\u0004\b0\u00101J\u001b\u00103\u001a\u00020\u0014*\u00020\u000e2\u0006\u00102\u001a\u00020\u000eH\u0002¢\u0006\u0004\b3\u00104J\u0011\u00105\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R,\u0010;\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060:098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R(\u0010@\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b@\u00108\u0012\u0004\bE\u0010\r\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR(\u0010F\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\bF\u00108\u0012\u0004\bI\u0010\r\u001a\u0004\bG\u0010B\"\u0004\bH\u0010D¨\u0006M"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internal/base/PanelChainLayout;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Lzy11;", "removeAllViews", "()V", "Landroid/view/View;", "child", "addView", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "p", "", "checkLayoutParams", "(Landroid/view/ViewGroup$LayoutParams;)Z", "Lcom/yandex/plus/home/feature/panel/internal/base/PanelChainLayout$LayoutParams;", "generateLayoutParams", "(Landroid/util/AttributeSet;)Lcom/yandex/plus/home/feature/panel/internal/base/PanelChainLayout$LayoutParams;", "(Landroid/view/ViewGroup$LayoutParams;)Landroid/view/ViewGroup$LayoutParams;", "generateDefaultLayoutParams", "()Lcom/yandex/plus/home/feature/panel/internal/base/PanelChainLayout$LayoutParams;", "Ldb90;", "getChildParams", "(Landroid/view/View;)Ldb90;", "Lkotlin/Function1;", "Landroidx/constraintlayout/widget/e;", "block", "withNewConstraints", "(Ltls;)V", "childId", "connectChildAsFirstRow", "(Landroidx/constraintlayout/widget/e;I)V", "endId", "endSide", "marginTop", "connectChildAsNextRow", "(Landroidx/constraintlayout/widget/e;IIII)V", "prevChildId", "connectChildToPrevChild", "(Landroidx/constraintlayout/widget/e;II)V", "isWidthMatchParent", "(Landroid/view/View;)Z", "prevChild", "needWrap", "(Landroid/view/View;Landroid/view/View;)Z", "getAnchorChild", "()Landroid/view/View;", "currentRowNumber", CA20Status.STATUS_USER_I, "", "Lkotlin/Pair;", "childPositionsMap", "Ljava/util/Map;", "Landroid/util/SparseIntArray;", "rows", "Landroid/util/SparseIntArray;", "gap", "getGap", "()I", "setGap", "(I)V", "getGap$annotations", "maxViewsWrap", "getMaxViewsWrap", "setMaxViewsWrap", "getMaxViewsWrap$annotations", "Companion", "LayoutParams", "eb90", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class PanelChainLayout extends ConstraintLayout {
    private static final eb90 Companion = new eb90();
    private static final Pair<Integer, Integer> EMPTY_POSITION = new Pair<>(0, 0);

    @Deprecated
    public static final int MAX_VIEWS_WRAP_DEFAULT = 2;
    private final Map<Integer, Pair<Integer, Integer>> childPositionsMap;
    private int currentRowNumber;
    private int gap;
    private int maxViewsWrap;
    private final SparseIntArray rows;

    public PanelChainLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.currentRowNumber = -1;
        this.childPositionsMap = new LinkedHashMap();
        this.rows = new SparseIntArray();
        this.maxViewsWrap = 2;
    }

    private final void connectChildAsFirstRow(e eVar, int i) {
        connectChildAsNextRow(eVar, i, 0, 3, 0);
    }

    private final void connectChildAsNextRow(e eVar, int i, int i2, int i3, int i4) {
        eVar.i(i, 6, 0, 6);
        eVar.i(i, 7, 0, 7);
        eVar.i(i, 3, i2, i3);
        eVar.w(i, 3, i4);
        SparseIntArray sparseIntArray = this.rows;
        int i5 = this.currentRowNumber + 1;
        this.currentRowNumber = i5;
        sparseIntArray.put(i5, 1);
    }

    private final void connectChildToPrevChild(e eVar, int i, int i2) {
        eVar.i(i2, 7, i, 6);
        eVar.i(i, 6, i2, 7);
        eVar.i(i, 7, 0, 7);
        eVar.w(i, 6, this.gap);
        View anchorChild = getAnchorChild();
        if (anchorChild != null) {
            eVar.i(i, 3, anchorChild.getId(), 4);
            eVar.w(i, 3, this.gap);
        } else {
            eVar.i(i, 3, 0, 3);
        }
        SparseIntArray sparseIntArray = this.rows;
        int i3 = this.currentRowNumber;
        sparseIntArray.put(i3, sparseIntArray.get(i3) + 1);
    }

    private final View getAnchorChild() {
        int size = this.rows.size() - 1;
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.rows.get(i2);
        }
        return getChildAt(i);
    }

    public static /* synthetic */ void getGap$annotations() {
    }

    public static /* synthetic */ void getMaxViewsWrap$annotations() {
    }

    private final boolean isWidthMatchParent(View view) {
        return ((LayoutParams) view.getLayoutParams()).getIsWidthMatchParent();
    }

    private final boolean needWrap(View view, View view2) {
        return isWidthMatchParent(view) || isWidthMatchParent(view2) || (this.maxViewsWrap > 0 && this.rows.get(this.currentRowNumber) % this.maxViewsWrap == 0);
    }

    private final void withNewConstraints(tls block) {
        e eVar = new e();
        eVar.g(this);
        block.invoke(eVar);
        eVar.b(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        super.addView(child);
        bb1.M(child);
        int indexOfChild = indexOfChild(child);
        int childCount = getChildCount() - 2;
        e eVar = new e();
        eVar.g(this);
        View childAt = getChildAt(childCount);
        if (childAt == null) {
            connectChildAsFirstRow(eVar, child.getId());
            this.childPositionsMap.put(Integer.valueOf(indexOfChild), EMPTY_POSITION);
        } else if (needWrap(child, childAt)) {
            connectChildAsNextRow(eVar, child.getId(), childAt.getId(), 4, this.gap);
            Map<Integer, Pair<Integer, Integer>> map = this.childPositionsMap;
            Integer valueOf = Integer.valueOf(indexOfChild);
            Pair<Integer, Integer> pair = this.childPositionsMap.get(Integer.valueOf(childCount));
            map.put(valueOf, pair != null ? new Pair<>(Integer.valueOf(((Number) pair.getFirst()).intValue() + 1), 0) : EMPTY_POSITION);
        } else {
            connectChildToPrevChild(eVar, child.getId(), childAt.getId());
            Map<Integer, Pair<Integer, Integer>> map2 = this.childPositionsMap;
            Integer valueOf2 = Integer.valueOf(indexOfChild);
            Pair<Integer, Integer> pair2 = this.childPositionsMap.get(Integer.valueOf(childCount));
            map2.put(valueOf2, pair2 != null ? new Pair<>(Integer.valueOf(((Number) pair2.getFirst()).intValue()), Integer.valueOf(((Number) pair2.getSecond()).intValue() + 1)) : EMPTY_POSITION);
        }
        eVar.b(this);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams p) {
        return p instanceof LayoutParams;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(100);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public LayoutParams generateLayoutParams(AttributeSet attrs) {
        return new LayoutParams(getContext(), attrs);
    }

    public final db90 getChildParams(View child) {
        Pair<Integer, Integer> pair = this.childPositionsMap.get(Integer.valueOf(indexOfChild(child)));
        if (pair == null) {
            return null;
        }
        int intValue = ((Number) pair.getFirst()).intValue();
        return new db90(this.rows.size(), this.rows.get(intValue), intValue, ((Number) pair.getSecond()).intValue());
    }

    public final int getGap() {
        return this.gap;
    }

    public final int getMaxViewsWrap() {
        return this.maxViewsWrap;
    }

    @Override // android.view.ViewGroup
    public void removeAllViews() {
        super.removeAllViews();
        this.currentRowNumber = -1;
        this.childPositionsMap.clear();
        this.rows.clear();
    }

    public final void setGap(int i) {
        this.gap = i;
    }

    public final void setMaxViewsWrap(int i) {
        this.maxViewsWrap = i;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\rR\"\u0010\u000f\u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/yandex/plus/home/feature/panel/internal/base/PanelChainLayout$LayoutParams;", "Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "height", "(I)V", "Landroid/view/ViewGroup$LayoutParams;", "source", "(Landroid/view/ViewGroup$LayoutParams;)V", "", "isWidthMatchParent", "Z", "()Z", "setWidthMatchParent", "(Z)V", "Companion", "com/yandex/plus/home/feature/panel/internal/base/a", "plus-home-feature-panel_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class LayoutParams extends ConstraintLayout.LayoutParams {
        public static final a Companion = new a();
        public static final int DEFAULT_HEIGHT = 100;
        private boolean isWidthMatchParent;

        public LayoutParams(int i) {
            super(0, i);
            this.isWidthMatchParent = true;
        }

        /* renamed from: isWidthMatchParent, reason: from getter */
        public final boolean getIsWidthMatchParent() {
            return this.isWidthMatchParent;
        }

        public final void setWidthMatchParent(boolean z) {
            this.isWidthMatchParent = z;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.isWidthMatchParent = true;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.isWidthMatchParent = true;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams p) {
        return new LayoutParams(p);
    }

    public PanelChainLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
    }

    public PanelChainLayout(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0, 8, null);
    }

    public /* synthetic */ PanelChainLayout(Context context, AttributeSet attributeSet, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? 0 : i2);
    }

    public PanelChainLayout(Context context) {
        this(context, null, 0, 0, 14, null);
    }
}
