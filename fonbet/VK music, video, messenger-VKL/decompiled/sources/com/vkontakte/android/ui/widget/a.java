package com.vkontakte.android.ui.widget;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.vk.log.L;
import com.vkontakte.android.R;
import xsna.d3r0;

/* compiled from: MenuListView.java */
/* loaded from: classes7.dex */
public final class a implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ MenuListView b;

    public a(MenuListView menuListView) {
        this.b = menuListView;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        MenuListView menuListView = this.b;
        menuListView.getRootView().getViewTreeObserver().removeOnPreDrawListener(this);
        menuListView.g();
        ((ViewGroup) d3r0.a(menuListView.getContext()).findViewById(R.id.fragment_wrapper)).setOnHierarchyChangeListener(new ViewGroupOnHierarchyChangeListenerC2108a());
        return true;
    }

    /* compiled from: MenuListView.java */
    /* renamed from: com.vkontakte.android.ui.widget.a$a, reason: collision with other inner class name */
    public class ViewGroupOnHierarchyChangeListenerC2108a implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroupOnHierarchyChangeListenerC2108a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            L.l("vk", "onChildViewAdded " + view2);
            a.this.b.g();
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
        }
    }
}
