package xsna;

import android.view.View;

/* compiled from: ViewExt.kt */
/* loaded from: classes18.dex */
public final class lwt0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ gzs<s3q0> c;
    public final /* synthetic */ long d;

    public lwt0(View view, gzs<s3q0> gzsVar, long j) {
        this.b = view;
        this.c = gzsVar;
        this.d = j;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.b;
        view2.removeOnLayoutChangeListener(this);
        view2.postDelayed(new r44(this.c, 20), this.d);
    }
}
