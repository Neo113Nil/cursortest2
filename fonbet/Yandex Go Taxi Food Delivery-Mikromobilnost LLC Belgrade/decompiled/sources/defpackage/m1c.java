package defpackage;

import android.content.Context;
import android.view.View;
import androidx.core.view.AccessibilityDelegateCompat;

/* loaded from: classes11.dex */
public abstract class m1c extends AccessibilityDelegateCompat {
    public final ph a;

    public m1c(Context context, int i) {
        this.a = new ph(16, context.getString(i));
    }

    @Override // androidx.core.view.AccessibilityDelegateCompat
    public void onInitializeAccessibilityNodeInfo(View view, wh whVar) {
        super.onInitializeAccessibilityNodeInfo(view, whVar);
        whVar.b(this.a);
    }
}
