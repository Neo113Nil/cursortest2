package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class mwt0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ gzs<s3q0> c;

    public mwt0(View view, gzs gzsVar) {
        this.b = view;
        this.c = gzsVar;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.b;
        view2.removeOnLayoutChangeListener(this);
        view2.postDelayed(new vk(1, this.c), 0L);
    }
}
