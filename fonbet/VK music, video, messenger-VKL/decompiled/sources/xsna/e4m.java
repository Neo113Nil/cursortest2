package xsna;

import android.view.View;

/* compiled from: DesignViewExt.kt */
/* loaded from: classes17.dex */
public final class e4m implements View.OnLayoutChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ gzs<s3q0> c;

    public e4m(View view, gzs gzsVar) {
        this.b = view;
        this.c = gzsVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.b.postDelayed(new d4m(0, this.c), 0L);
    }
}
