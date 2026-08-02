package xsna;

import android.os.Bundle;
import android.view.View;

/* compiled from: StoryMediaStoreItemSmallHolder.kt */
/* loaded from: classes15.dex */
public final class k6m0 extends View.AccessibilityDelegate {
    public final /* synthetic */ m6m0 a;

    public k6m0(m6m0 m6m0Var) {
        this.a = m6m0Var;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        m6m0 m6m0Var = this.a;
        if (i == 64) {
            m6m0Var.v = true;
        } else if (i == 128) {
            m6m0Var.v = false;
        }
        return super.performAccessibilityAction(view, i, bundle);
    }
}
