package xsna;

import android.util.Size;
import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes14.dex */
public final class znt0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ io.reactivex.rxjava3.core.r b;
    public final /* synthetic */ snt0 c;
    public final /* synthetic */ View d;

    public znt0(io.reactivex.rxjava3.core.r rVar, snt0 snt0Var, View view) {
        this.b = rVar;
        this.c = snt0Var;
        this.d = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        View view2 = this.d;
        Size size = new Size(view2.getWidth(), view2.getHeight());
        io.reactivex.rxjava3.core.r rVar = this.b;
        rVar.onNext(size);
        if (rVar.h()) {
            return;
        }
        view.addOnLayoutChangeListener(this.c);
    }
}
