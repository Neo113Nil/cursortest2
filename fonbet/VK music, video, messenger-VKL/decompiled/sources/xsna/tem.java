package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes2.dex */
public final class tem implements View.OnLayoutChangeListener {
    public final /* synthetic */ sem b;

    public tem(sem semVar) {
        this.b = semVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        sem.a(this.b);
    }
}
