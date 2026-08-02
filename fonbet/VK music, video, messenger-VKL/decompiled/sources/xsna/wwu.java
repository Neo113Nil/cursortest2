package xsna;

import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes4.dex */
public final class wwu implements View.OnLayoutChangeListener {
    public final /* synthetic */ ywu b;

    public wwu(ywu ywuVar) {
        this.b = ywuVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        ywu ywuVar = this.b;
        ywuVar.o.performAccessibilityAction(64, null);
        ywuVar.o.sendAccessibilityEvent(4);
    }
}
