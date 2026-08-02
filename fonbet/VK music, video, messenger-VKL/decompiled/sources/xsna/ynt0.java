package xsna;

import android.util.Size;
import android.view.View;

/* compiled from: View.kt */
/* loaded from: classes14.dex */
public final class ynt0 implements View.OnLayoutChangeListener {
    public final /* synthetic */ io.reactivex.rxjava3.core.r b;
    public final /* synthetic */ qnt0 c;
    public final /* synthetic */ View d;

    public ynt0(io.reactivex.rxjava3.core.r rVar, qnt0 qnt0Var, View view) {
        this.b = rVar;
        this.c = qnt0Var;
        this.d = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        Size f = xnt0.f(this.d);
        io.reactivex.rxjava3.core.r rVar = this.b;
        rVar.onNext(f);
        if (rVar.h()) {
            return;
        }
        view.addOnLayoutChangeListener(this.c);
    }
}
