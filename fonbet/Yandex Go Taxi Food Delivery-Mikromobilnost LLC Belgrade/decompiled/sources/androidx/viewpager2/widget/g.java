package androidx.viewpager2.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.r0;
import defpackage.wh;

/* loaded from: classes.dex */
public final class g extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ViewPager2 viewPager2, Context context) {
        super(context);
        this.b0 = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.e
    public final void L0(r0 r0Var, RecyclerView.k kVar, wh whVar) {
        super.L0(r0Var, kVar, whVar);
        this.b0.mAccessibilityProvider.h(whVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void N0(r0 r0Var, RecyclerView.k kVar, View view, wh whVar) {
        this.b0.mAccessibilityProvider.i(view, whVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean a1(r0 r0Var, RecyclerView.k kVar, int i, Bundle bundle) {
        ViewPager2 viewPager2 = this.b0;
        return viewPager2.mAccessibilityProvider.a(i) ? viewPager2.mAccessibilityProvider.j(i) : super.a1(r0Var, kVar, i, bundle);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final boolean h1(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void z1(RecyclerView.k kVar, int[] iArr) {
        ViewPager2 viewPager2 = this.b0;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.z1(kVar, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }
}
