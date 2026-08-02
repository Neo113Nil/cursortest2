package xsna;

import android.view.View;

/* compiled from: ScrollingUtils.kt */
/* loaded from: classes17.dex */
public final class bih0 implements Runnable {
    public final /* synthetic */ View b;

    public bih0(View view) {
        this.b = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        View view = this.b;
        view.performAccessibilityAction(64, null);
        view.requestFocus();
    }
}
