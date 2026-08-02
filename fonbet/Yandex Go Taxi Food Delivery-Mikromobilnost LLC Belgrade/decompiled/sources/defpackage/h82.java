package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes.dex */
public final class h82 extends AccessibilityDelegateCompat {
    public final /* synthetic */ AndroidComposeView a;
    public final /* synthetic */ LayoutNode b;
    public final /* synthetic */ AndroidComposeView c;

    public h82(AndroidComposeView androidComposeView, LayoutNode layoutNode, AndroidComposeView androidComposeView2) {
        this.a = androidComposeView;
        this.b = layoutNode;
        this.c = androidComposeView2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0046, code lost:
    
        if (r2.intValue() == r6.getSemanticsOwner().a().f) goto L19;
     */
    @Override // androidx.core.view.AccessibilityDelegateCompat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat4;
        AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat5;
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        AndroidComposeView androidComposeView = this.a;
        androidComposeViewAccessibilityDelegateCompat = androidComposeView.composeAccessibilityDelegate;
        if (androidComposeViewAccessibilityDelegateCompat.isEnabled$ui()) {
            whVar.G(false);
        }
        LayoutNode layoutNode = this.b;
        LayoutNode s = layoutNode.s();
        while (true) {
            if (s == null) {
                s = null;
                break;
            } else if (s.a0.e(8)) {
                break;
            } else {
                s = s.s();
            }
        }
        Integer valueOf = s != null ? Integer.valueOf(s.b) : null;
        if (valueOf != null) {
        }
        valueOf = -1;
        int intValue = valueOf.intValue();
        whVar.b = intValue;
        AccessibilityNodeInfo accessibilityNodeInfo = whVar.a;
        AndroidComposeView androidComposeView2 = this.c;
        accessibilityNodeInfo.setParent(androidComposeView2, intValue);
        int i = layoutNode.b;
        androidComposeViewAccessibilityDelegateCompat2 = androidComposeView.composeAccessibilityDelegate;
        int e = androidComposeViewAccessibilityDelegateCompat2.getIdToBeforeMap().e(i);
        if (e != -1) {
            AndroidViewHolder g = m9b1.g(androidComposeView.getAndroidViewsHandler$ui(), e);
            if (g != null) {
                accessibilityNodeInfo.setTraversalBefore(g);
            } else {
                accessibilityNodeInfo.setTraversalBefore(androidComposeView2, e);
            }
            androidComposeViewAccessibilityDelegateCompat5 = androidComposeView.composeAccessibilityDelegate;
            androidComposeView.addExtraDataToAccessibilityNodeInfoHelper(i, accessibilityNodeInfo, androidComposeViewAccessibilityDelegateCompat5.getExtraDataTestTraversalBeforeVal());
        }
        androidComposeViewAccessibilityDelegateCompat3 = androidComposeView.composeAccessibilityDelegate;
        int e2 = androidComposeViewAccessibilityDelegateCompat3.getIdToAfterMap().e(i);
        if (e2 != -1) {
            AndroidViewHolder g2 = m9b1.g(androidComposeView.getAndroidViewsHandler$ui(), e2);
            if (g2 != null) {
                whVar.F(g2);
            } else {
                accessibilityNodeInfo.setTraversalAfter(androidComposeView2, e2);
            }
            androidComposeViewAccessibilityDelegateCompat4 = androidComposeView.composeAccessibilityDelegate;
            androidComposeView.addExtraDataToAccessibilityNodeInfoHelper(i, accessibilityNodeInfo, androidComposeViewAccessibilityDelegateCompat4.getExtraDataTestTraversalAfterVal());
        }
    }
}
