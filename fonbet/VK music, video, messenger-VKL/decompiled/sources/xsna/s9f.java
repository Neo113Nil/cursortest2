package xsna;

import android.graphics.Rect;
import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class s9f implements View.OnLayoutChangeListener {
    public final /* synthetic */ Rect b;

    public s9f(Rect rect) {
        this.b = rect;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.b.set(new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
    }
}
