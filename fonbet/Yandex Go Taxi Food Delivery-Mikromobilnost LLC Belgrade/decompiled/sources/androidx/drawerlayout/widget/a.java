package androidx.drawerlayout.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.AccessibilityDelegateCompat;
import defpackage.ph;
import defpackage.wh;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class a extends AccessibilityDelegateCompat {
    public final Rect a = new Rect();
    public final /* synthetic */ DrawerLayout b;

    public a(DrawerLayout drawerLayout) {
        this.b = drawerLayout;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        CharSequence drawerTitle;
        if (accessibilityEvent.getEventType() != 32) {
            return super.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }
        List<CharSequence> text = accessibilityEvent.getText();
        DrawerLayout drawerLayout = this.b;
        View findVisibleDrawer = drawerLayout.findVisibleDrawer();
        if (findVisibleDrawer == null || (drawerTitle = drawerLayout.getDrawerTitle(drawerLayout.getDrawerViewAbsoluteGravity(findVisibleDrawer))) == null) {
            return true;
        }
        text.add(drawerTitle);
        return true;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
        accessibilityEvent.setClassName("androidx.drawerlayout.widget.DrawerLayout");
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        if (DrawerLayout.CAN_HIDE_DESCENDANTS) {
            super.onInitializeAccessibilityNodeInfo(view, whVar);
        } else {
            AccessibilityNodeInfo accessibilityNodeInfo = whVar.a;
            AccessibilityNodeInfo accessibilityNodeInfo2 = whVar.a;
            AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(accessibilityNodeInfo);
            wh whVar2 = new wh(obtain);
            super.onInitializeAccessibilityNodeInfo(view, whVar2);
            whVar.c = -1;
            accessibilityNodeInfo2.setSource(view);
            WeakHashMap weakHashMap = androidx.core.view.b.a;
            Object parentForAccessibility = view.getParentForAccessibility();
            if (parentForAccessibility instanceof View) {
                whVar.A((View) parentForAccessibility);
            }
            Rect rect = this.a;
            whVar2.f(rect);
            whVar.l(rect);
            whVar.G(obtain.isVisibleToUser());
            whVar.z(obtain.getPackageName());
            whVar.p(obtain.getClassName());
            whVar.t(obtain.getContentDescription());
            whVar.v(obtain.isEnabled());
            accessibilityNodeInfo2.setFocused(obtain.isFocused());
            whVar.j(obtain.isAccessibilityFocused());
            whVar.C(obtain.isSelected());
            whVar.a(obtain.getActions());
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (DrawerLayout.includeChildForAccessibility(childAt)) {
                    accessibilityNodeInfo2.addChild(childAt);
                }
            }
        }
        whVar.p("androidx.drawerlayout.widget.DrawerLayout");
        whVar.w(false);
        whVar.a.setFocused(false);
        whVar.i(ph.e);
        whVar.i(ph.f);
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        if (DrawerLayout.CAN_HIDE_DESCENDANTS || DrawerLayout.includeChildForAccessibility(view)) {
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
        return false;
    }
}
