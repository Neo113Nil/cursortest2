package xsna;

import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes2.dex */
public final class g6p implements View.OnLayoutChangeListener {
    public final /* synthetic */ f6p b;

    public g6p(f6p f6pVar) {
        this.b = f6pVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        this.b.b();
    }
}
