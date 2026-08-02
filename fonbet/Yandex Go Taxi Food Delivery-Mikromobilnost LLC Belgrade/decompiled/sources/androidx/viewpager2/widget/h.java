package androidx.viewpager2.widget;

import android.R;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.dxf0;
import defpackage.ft31;
import defpackage.it31;
import defpackage.ny61;
import defpackage.ph;
import defpackage.th;
import defpackage.uh;
import defpackage.va90;
import defpackage.wh;

/* loaded from: classes.dex */
public final class h extends ft31 {
    public final dxf0 a = new dxf0(this);
    public final va90 b = new va90(this);
    public it31 c;
    public final /* synthetic */ ViewPager2 d;

    public h(ViewPager2 viewPager2) {
        this.d = viewPager2;
    }

    @Override // defpackage.ft31
    public final boolean b(int i) {
        return i == 8192 || i == 4096;
    }

    @Override // defpackage.ft31
    public final void c(RecyclerView.Adapter adapter) {
        s();
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.c);
        }
    }

    @Override // defpackage.ft31
    public final void d(RecyclerView.Adapter adapter) {
        if (adapter != null) {
            adapter.unregisterAdapterDataObserver(this.c);
        }
    }

    @Override // defpackage.ft31
    public final String e() {
        return "androidx.viewpager.widget.ViewPager";
    }

    @Override // defpackage.ft31
    public final void f(RecyclerView recyclerView) {
        recyclerView.setImportantForAccessibility(2);
        this.c = new it31(this);
        ViewPager2 viewPager2 = this.d;
        if (viewPager2.getImportantForAccessibility() == 0) {
            viewPager2.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.ft31
    public final void g(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i;
        int i2;
        int itemCount;
        ViewPager2 viewPager2 = this.d;
        if (viewPager2.getAdapter() == null) {
            i = 0;
            i2 = 0;
        } else if (viewPager2.getOrientation() == 1) {
            i = viewPager2.getAdapter().getItemCount();
            i2 = 1;
        } else {
            i2 = viewPager2.getAdapter().getItemCount();
            i = 1;
        }
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) th.a(i, i2, 0, false).a);
        RecyclerView.Adapter adapter = viewPager2.getAdapter();
        if (adapter == null || (itemCount = adapter.getItemCount()) == 0 || !viewPager2.isUserInputEnabled()) {
            return;
        }
        if (viewPager2.mCurrentItem > 0) {
            accessibilityNodeInfo.addAction(8192);
        }
        if (viewPager2.mCurrentItem < itemCount - 1) {
            accessibilityNodeInfo.addAction(4096);
        }
        accessibilityNodeInfo.setScrollable(true);
    }

    @Override // defpackage.ft31
    public final void i(View view, wh whVar) {
        int i;
        ViewPager2 viewPager2 = this.d;
        int i2 = 0;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.mLayoutManager.getClass();
            i = RecyclerView.e.r0(view);
        } else {
            i = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.mLayoutManager.getClass();
            i2 = RecyclerView.e.r0(view);
        }
        whVar.s(uh.a(i, 1, i2, 1, false, false));
    }

    @Override // defpackage.ft31
    public final boolean k(int i, Bundle bundle) {
        if (!b(i)) {
            ny61.k();
            return false;
        }
        ViewPager2 viewPager2 = this.d;
        int currentItem = i == 8192 ? viewPager2.getCurrentItem() - 1 : viewPager2.getCurrentItem() + 1;
        if (viewPager2.isUserInputEnabled()) {
            viewPager2.setCurrentItemInternal(currentItem, true);
        }
        return true;
    }

    @Override // defpackage.ft31
    public final void l() {
        s();
    }

    @Override // defpackage.ft31
    public final void n(AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setSource(this.d);
        accessibilityEvent.setClassName("androidx.viewpager.widget.ViewPager");
    }

    @Override // defpackage.ft31
    public final void o() {
        s();
    }

    @Override // defpackage.ft31
    public final void p() {
        s();
    }

    @Override // defpackage.ft31
    public final void q() {
        s();
    }

    @Override // defpackage.ft31
    public final void r() {
        s();
    }

    public final void s() {
        int itemCount;
        int i = R.id.accessibilityActionPageLeft;
        ViewPager2 viewPager2 = this.d;
        androidx.core.view.b.n(R.id.accessibilityActionPageLeft, viewPager2);
        androidx.core.view.b.j(0, viewPager2);
        androidx.core.view.b.n(R.id.accessibilityActionPageRight, viewPager2);
        androidx.core.view.b.j(0, viewPager2);
        androidx.core.view.b.n(R.id.accessibilityActionPageUp, viewPager2);
        androidx.core.view.b.j(0, viewPager2);
        androidx.core.view.b.n(R.id.accessibilityActionPageDown, viewPager2);
        androidx.core.view.b.j(0, viewPager2);
        if (viewPager2.getAdapter() == null || (itemCount = viewPager2.getAdapter().getItemCount()) == 0 || !viewPager2.isUserInputEnabled()) {
            return;
        }
        int orientation = viewPager2.getOrientation();
        va90 va90Var = this.b;
        dxf0 dxf0Var = this.a;
        if (orientation != 0) {
            if (viewPager2.mCurrentItem < itemCount - 1) {
                androidx.core.view.b.o(viewPager2, new ph(R.id.accessibilityActionPageDown, (CharSequence) null), null, dxf0Var);
            }
            if (viewPager2.mCurrentItem > 0) {
                androidx.core.view.b.o(viewPager2, new ph(R.id.accessibilityActionPageUp, (CharSequence) null), null, va90Var);
                return;
            }
            return;
        }
        boolean isRtl = viewPager2.isRtl();
        int i2 = isRtl ? 16908360 : 16908361;
        if (isRtl) {
            i = 16908361;
        }
        if (viewPager2.mCurrentItem < itemCount - 1) {
            androidx.core.view.b.o(viewPager2, new ph(i2, (CharSequence) null), null, dxf0Var);
        }
        if (viewPager2.mCurrentItem > 0) {
            androidx.core.view.b.o(viewPager2, new ph(i, (CharSequence) null), null, va90Var);
        }
    }
}
