package com.yandex.go.flex.screens.common.flexible.layout.manager.staggeredgrid;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.lzt0;
import defpackage.ny61;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\n¢\u0006\u0004\b\u0005\u0010\u000bB\u0011\b\u0016\u0012\u0006\u0010\b\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\fB\u001b\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0005\u0010\u0011J\r\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u0014\"\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/yandex/go/flex/screens/common/flexible/layout/manager/staggeredgrid/StaggeredGridLayoutParams;", "Landroidx/recyclerview/widget/RecyclerView$LayoutParams;", "", "width", "height", "<init>", "(II)V", "Landroid/view/ViewGroup$LayoutParams;", "source", "(Landroid/view/ViewGroup$LayoutParams;)V", "Landroid/view/ViewGroup$MarginLayoutParams;", "(Landroid/view/ViewGroup$MarginLayoutParams;)V", "(Landroidx/recyclerview/widget/RecyclerView$LayoutParams;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Llzt0;", "requireItem", "()Llzt0;", "Lzy11;", "reset", "()V", "item", "Llzt0;", "getItem", "setItem", "(Llzt0;)V", "flexible_layout_managers"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StaggeredGridLayoutParams extends RecyclerView.LayoutParams {
    private lzt0 item;

    public StaggeredGridLayoutParams(int i, int i2) {
        super(i, i2);
    }

    public final lzt0 getItem() {
        return this.item;
    }

    public final lzt0 requireItem() {
        lzt0 lzt0Var = this.item;
        if (lzt0Var != null) {
            return lzt0Var;
        }
        ny61.g("item is null");
        return null;
    }

    public final void reset() {
        this.item = null;
    }

    public final void setItem(lzt0 lzt0Var) {
        this.item = lzt0Var;
    }

    public StaggeredGridLayoutParams(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public StaggeredGridLayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public StaggeredGridLayoutParams(RecyclerView.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public StaggeredGridLayoutParams(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
