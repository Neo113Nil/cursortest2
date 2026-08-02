package me.grishka.appkit.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.appcore.appkit.R$styleable;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vkontakte.android.R;
import xsna.dhr0;
import xsna.gzs;
import xsna.i0q0;
import xsna.oyr;
import xsna.rme0;
import xsna.s3q0;
import xsna.vtg0;

/* compiled from: UsableRecyclerPaginatedView.kt */
/* loaded from: classes8.dex */
public class UsableRecyclerPaginatedView extends VkRecyclerPaginatedView {
    public static final /* synthetic */ int S = 0;
    public UsableRecyclerView O;
    public gzs<s3q0> P;
    public a Q;
    public SwipeDrawableRefreshLayout R;

    /* compiled from: UsableRecyclerPaginatedView.kt */
    public interface a {
        void h();
    }

    /* compiled from: UsableRecyclerPaginatedView.kt */
    public static final class b extends SwipeDrawableRefreshLayout {
        @Override // android.view.View
        public final void onVisibilityChanged(View view, int i) {
            super.onVisibilityChanged(view, i);
            if (view != this || i == 0) {
                return;
            }
            setRefreshing(false);
        }
    }

    public UsableRecyclerPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.c.n
    public final void Mk() {
        super.Mk();
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.R;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setRefreshing(false);
        }
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView, xsna.too0
    public final void Ng() {
        UsableRecyclerView usableRecyclerView = this.O;
        if (usableRecyclerView != null) {
            usableRecyclerView.setSelector(dhr0.t.a(R.drawable.highlight));
        }
    }

    @Override // com.vk.core.view.components.paging.list.VkRecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public View c(Context context, AttributeSet attributeSet) {
        View c = super.c(context, attributeSet);
        boolean z = false;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a);
            z = obtainStyledAttributes.getBoolean(0, false);
            obtainStyledAttributes.recycle();
        }
        if (!z) {
            return c;
        }
        b bVar = new b(context, null);
        i0q0.f(new rme0(bVar, 13));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.addView(c, new FrameLayout.LayoutParams(-2, -2, 17));
        bVar.addView(frameLayout, -1, -1);
        bVar.setOnRefreshListener(new oyr(this, 24));
        this.R = bVar;
        return bVar;
    }

    public final SwipeDrawableRefreshLayout getEmptyViewRefreshLayout() {
        return this.R;
    }

    public final a getEmptyViewRefreshListener() {
        return this.Q;
    }

    @Override // com.vk.lists.RecyclerPaginatedView, com.vk.lists.AbstractPaginatedView
    public final View q(Context context, AttributeSet attributeSet) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.view_usable_recycler_paginated, (ViewGroup) this, false);
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = (SwipeDrawableRefreshLayout) inflate.findViewById(R.id.swipe_refresh_layout);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.list);
        this.x = recyclerView;
        UsableRecyclerView usableRecyclerView = null;
        UsableRecyclerView usableRecyclerView2 = recyclerView instanceof UsableRecyclerView ? (UsableRecyclerView) recyclerView : null;
        if (usableRecyclerView2 != null) {
            usableRecyclerView2.setDrawSelectorOnTop(true);
            usableRecyclerView2.setSelector(R.drawable.highlight);
            usableRecyclerView = usableRecyclerView2;
        }
        this.O = usableRecyclerView;
        RecyclerPaginatedView.n nVar = new RecyclerPaginatedView.n(swipeDrawableRefreshLayout);
        this.w = nVar;
        nVar.c(new vtg0(this, 4));
        return swipeDrawableRefreshLayout;
    }

    public final void setEmptyViewRefreshLayout(SwipeDrawableRefreshLayout swipeDrawableRefreshLayout) {
        this.R = swipeDrawableRefreshLayout;
    }

    public final void setEmptyViewRefreshListener(a aVar) {
        this.Q = aVar;
    }

    public final void setOnEmptyViewRefreshListener(a aVar) {
        this.Q = aVar;
    }

    public final void setOnPullToRefreshCallBack(gzs<s3q0> gzsVar) {
        this.P = gzsVar;
    }
}
