package com.vkontakte.android.actionlinks.views.fragments.wall;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.design.view.actionlinks.holders.tip.ItemTipView;
import com.vk.lists.AbstractPaginatedView;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.movika.sdk.base.hooks.k;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.views.fragments.WrappedView;
import xsna.dhr0;
import xsna.f4m;
import xsna.iah0;
import xsna.qp0;
import xsna.rp0;

/* compiled from: AddGridView.kt */
/* loaded from: classes7.dex */
public final class AddGridView extends WrappedView implements qp0 {
    public static final /* synthetic */ int S = 0;
    public rp0 P;
    public RecyclerPaginatedView Q;
    public ItemTipView R;

    @Override // xsna.qp0
    public final ItemTipView Ni() {
        ItemTipView itemTipView = this.R;
        if (itemTipView == null) {
            itemTipView = null;
        }
        itemTipView.setVisibility(0);
        RecyclerPaginatedView recyclerPaginatedView = this.Q;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        f4m.j(recyclerPaginatedView);
        ItemTipView itemTipView2 = this.R;
        if (itemTipView2 != null) {
            return itemTipView2;
        }
        return null;
    }

    @Override // xsna.qp0
    public final void Pd() {
        ItemTipView itemTipView = this.R;
        if (itemTipView == null) {
            itemTipView = null;
        }
        f4m.j(itemTipView);
        RecyclerPaginatedView recyclerPaginatedView = this.Q;
        (recyclerPaginatedView != null ? recyclerPaginatedView : null).setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.collection_items_add_grid_fragment_view, viewGroup, false);
        this.Q = (RecyclerPaginatedView) inflate.findViewById(R.id.collection_items_add_grid_fragment_recycler);
        this.R = (ItemTipView) inflate.findViewById(R.id.collection_items_add_grid_fragment_tip);
        int a = iah0.a(12);
        RecyclerPaginatedView recyclerPaginatedView = this.Q;
        if (recyclerPaginatedView == null) {
            recyclerPaginatedView = null;
        }
        recyclerPaginatedView.getRecyclerView().setPadding(a, a, a, a);
        RecyclerPaginatedView recyclerPaginatedView2 = this.Q;
        if (recyclerPaginatedView2 == null) {
            recyclerPaginatedView2 = null;
        }
        recyclerPaginatedView2.getRecyclerView().setClipToPadding(false);
        RecyclerPaginatedView recyclerPaginatedView3 = this.Q;
        if (recyclerPaginatedView3 == null) {
            recyclerPaginatedView3 = null;
        }
        recyclerPaginatedView3.getRecyclerView().setBackgroundColor(dhr0.t.c(R.attr.vk_ui_background_content));
        ItemTipView itemTipView = this.R;
        if (itemTipView == null) {
            itemTipView = null;
        }
        f4m.j(itemTipView);
        RecyclerPaginatedView recyclerPaginatedView4 = this.Q;
        if (recyclerPaginatedView4 == null) {
            recyclerPaginatedView4 = null;
        }
        AbstractPaginatedView.LayoutType layoutType = AbstractPaginatedView.LayoutType.GRID;
        recyclerPaginatedView4.getClass();
        AbstractPaginatedView.d dVar = new AbstractPaginatedView.d(layoutType, recyclerPaginatedView4);
        dVar.d(new k(inflate, 1));
        dVar.a();
        rp0 rp0Var = this.P;
        if (rp0Var != null) {
            RecyclerPaginatedView recyclerPaginatedView5 = this.Q;
            rp0Var.b(recyclerPaginatedView5 != null ? recyclerPaginatedView5 : null);
        }
        return inflate;
    }
}
