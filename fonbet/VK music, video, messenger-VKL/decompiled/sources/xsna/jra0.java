package xsna;

import android.view.View;
import java.util.concurrent.TimeUnit;

/* compiled from: PlacePickerSearchHolder.kt */
/* loaded from: classes4.dex */
public final class jra0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ kra0 b;

    public jra0(kra0 kra0Var) {
        this.b = kra0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        kra0 kra0Var = this.b;
        io.reactivex.rxjava3.internal.operators.observable.j1 U = d02.y(kra0Var.m, 0L, 3).y(500L, TimeUnit.MILLISECONDS).U(new o860(new leq(25), 2));
        asu0 asu0Var = asu0.a;
        kra0Var.n = U.a0(asu0Var.d()).r0(asu0Var.d()).subscribe(new b8v(new kn20(kra0Var, 20), 14), new k130(new q8w(13), 12));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        io.reactivex.rxjava3.disposables.c cVar = this.b.n;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
