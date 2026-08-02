package androidx.viewpager.widget;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.AccessibilityDelegateCompat;
import defpackage.e890;
import defpackage.wh;

/* loaded from: classes.dex */
public final class a extends AccessibilityDelegateCompat {
    public final /* synthetic */ ViewPager a;

    public a(ViewPager viewPager) {
        this.a = viewPager;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0017, code lost:
    
        if (r2.b() > 1) goto L8;
     */
    @Override // androidx.core.view.AccessibilityDelegateCompat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        e890 e890Var;
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName(ViewPager.class.getName());
        ViewPager viewPager = this.a;
        e890 e890Var2 = viewPager.mAdapter;
        boolean z = e890Var2 != null;
        accessibilityEvent.setScrollable(z);
        if (accessibilityEvent.getEventType() != 4096 || (e890Var = viewPager.mAdapter) == null) {
            return;
        }
        accessibilityEvent.setItemCount(e890Var.b());
        accessibilityEvent.setFromIndex(viewPager.mCurItem);
        accessibilityEvent.setToIndex(viewPager.mCurItem);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.p(ViewPager.class.getName());
        ViewPager viewPager = this.a;
        e890 e890Var = viewPager.mAdapter;
        whVar.B(e890Var != null && e890Var.b() > 1);
        if (viewPager.canScrollHorizontally(1)) {
            whVar.a(4096);
        }
        if (viewPager.canScrollHorizontally(-1)) {
            whVar.a(8192);
        }
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        if (super.performAccessibilityAction(view, i, bundle)) {
            return true;
        }
        ViewPager viewPager = this.a;
        if (i == 4096) {
            if (!viewPager.canScrollHorizontally(1)) {
                return false;
            }
            viewPager.setCurrentItem(viewPager.mCurItem + 1);
            return true;
        }
        if (i != 8192 || !viewPager.canScrollHorizontally(-1)) {
            return false;
        }
        viewPager.setCurrentItem(viewPager.mCurItem - 1);
        return true;
    }
}
