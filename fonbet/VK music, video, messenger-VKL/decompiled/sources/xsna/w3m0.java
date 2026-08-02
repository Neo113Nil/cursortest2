package xsna;

import android.view.View;
import java.util.concurrent.TimeUnit;

/* compiled from: StoryGeoSearchHolder.kt */
/* loaded from: classes6.dex */
public final class w3m0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ x3m0 b;

    public w3m0(x3m0 x3m0Var) {
        this.b = x3m0Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        x3m0 x3m0Var = this.b;
        x3m0Var.o = new qno0(x3m0Var.n.d).y(500L, TimeUnit.MILLISECONDS).U(new mvc0(new kl60(17), 3)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).r0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new p350(new j5b0(x3m0Var, 14), 19), new r7a0(new y160(12), 10));
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        io.reactivex.rxjava3.disposables.c cVar = this.b.o;
        if (cVar != null) {
            cVar.dispose();
        }
    }
}
