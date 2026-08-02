package com.google.android.material.internal;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;
import defpackage.kxh0;
import defpackage.wh;

/* loaded from: classes11.dex */
public final class b extends AccessibilityDelegateCompat {
    public final /* synthetic */ NavigationMenuItemView a;

    public b(NavigationMenuItemView navigationMenuItemView) {
        this.a = navigationMenuItemView;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        NavigationMenuItemView navigationMenuItemView = this.a;
        whVar.m(navigationMenuItemView.checkable);
        whVar.a.getExtras().putCharSequence("AccessibilityNodeInfo.roleDescription", navigationMenuItemView.getResources().getString(kxh0.item_view_role_description));
    }
}
