package defpackage;

import android.os.Bundle;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.core.view.accessibility.AccessibilityNodeProviderCompat;

/* loaded from: classes.dex */
public final class l82 extends AccessibilityNodeProviderCompat {
    public final /* synthetic */ AndroidComposeViewAccessibilityDelegateCompat b;

    public l82(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        this.b = androidComposeViewAccessibilityDelegateCompat;
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final void a(int i, wh whVar, String str, Bundle bundle) {
        this.b.addExtraDataToAccessibilityNodeInfoHelper(i, whVar, str, bundle);
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final wh b(int i) {
        wh createNodeInfo;
        boolean z;
        int i2;
        int i3;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.b;
        createNodeInfo = androidComposeViewAccessibilityDelegateCompat.createNodeInfo(i);
        z = androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent;
        if (z) {
            i2 = androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId;
            if (i == i2) {
                androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI = createNodeInfo;
            }
            i3 = androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId;
            if (i == i3) {
                androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = createNodeInfo;
            }
        }
        return createNodeInfo;
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final wh d(int i) {
        int i2;
        int i3;
        int i4;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this.b;
        if (i != 1) {
            if (i == 2) {
                i4 = androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId;
                return b(i4);
            }
            ny61.g(oyr.i(i, "Unknown focus type: "));
            return null;
        }
        i2 = androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        i3 = androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId;
        return b(i3);
    }

    @Override // androidx.core.view.accessibility.AccessibilityNodeProviderCompat
    public final boolean e(int i, int i2, Bundle bundle) {
        boolean performActionHelper;
        performActionHelper = this.b.performActionHelper(i, i2, bundle);
        return performActionHelper;
    }
}
