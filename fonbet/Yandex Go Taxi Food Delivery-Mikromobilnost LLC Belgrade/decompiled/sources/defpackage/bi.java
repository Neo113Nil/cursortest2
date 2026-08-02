package defpackage;

import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes5.dex */
public final class bi extends AccessibilityDelegateCompat {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ bi(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public final void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        int i = this.a;
        String str = this.b;
        switch (i) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.b(new ph(16, str));
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                if (view.isClickable()) {
                    whVar.p("android.widget.Button");
                }
                whVar.b(new ph(16, str));
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                if (str != null) {
                    whVar.b(new ph(16, str));
                    break;
                }
                break;
            case 3:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.b(new ph(16, str));
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(view, whVar);
                whVar.p("android.widget.Button");
                whVar.b(new ph(16, str));
                break;
        }
    }
}
