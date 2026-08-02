package xsna;

import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes16.dex */
public final class qhs0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ j8o c;
    public final /* synthetic */ long d;
    public final /* synthetic */ m9o e;

    public qhs0(View view, j8o j8oVar, long j, m9o m9oVar) {
        this.b = view;
        this.c = j8oVar;
        this.d = j;
        this.e = m9oVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        int H = f870.H(this.d);
        j8o j8oVar = this.c;
        j8oVar.setTint(H);
        m9o m9oVar = this.e;
        j8oVar.b(m9oVar.b, m9oVar.a);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
