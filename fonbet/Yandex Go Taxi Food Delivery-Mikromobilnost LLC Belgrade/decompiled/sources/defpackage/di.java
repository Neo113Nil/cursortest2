package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* loaded from: classes11.dex */
public abstract class di {
    public static final /* synthetic */ int a = 0;

    static {
        new View.AccessibilityDelegate() { // from class: com.yandex.alicekit.core.accessibility.AccessibilityUtils$accessibilityDelegateButton$1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.setClassName("android.widget.Button");
            }
        };
        new View.AccessibilityDelegate() { // from class: com.yandex.alicekit.core.accessibility.AccessibilityUtils$removeActionClickDelegate$1
            @Override // android.view.View.AccessibilityDelegate
            public void onInitializeAccessibilityNodeInfo(View host, AccessibilityNodeInfo info) {
                super.onInitializeAccessibilityNodeInfo(host, info);
                info.removeAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK);
                info.setClickable(false);
            }
        };
    }
}
