package xsna;

import android.view.View;

/* compiled from: RxExtCore.kt */
/* loaded from: classes17.dex */
public final class htg0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c b;

    public htg0(io.reactivex.rxjava3.disposables.c cVar) {
        this.b = cVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.dispose();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
