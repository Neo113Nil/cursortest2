package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.dfz0;
import defpackage.tj10;
import defpackage.xn10;

/* loaded from: classes10.dex */
public final class ExpandedMenuView extends ListView implements tj10, xn10, AdapterView.OnItemClickListener {
    private static final int[] TINT_ATTRS = {R.attr.background, R.attr.divider};
    private int mAnimations;
    private MenuBuilder mMenu;

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        dfz0 e = dfz0.e(i, 0, context, attributeSet, TINT_ATTRS);
        TypedArray typedArray = e.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(e.b(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(e.b(1));
        }
        e.g();
    }

    public int getWindowAnimations() {
        return this.mAnimations;
    }

    @Override // defpackage.xn10
    public void initialize(MenuBuilder menuBuilder) {
        this.mMenu = menuBuilder;
    }

    @Override // defpackage.tj10
    public boolean invokeItem(MenuItemImpl menuItemImpl) {
        return this.mMenu.performItemAction(menuItemImpl, 0);
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i, long j) {
        invokeItem((MenuItemImpl) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }
}
