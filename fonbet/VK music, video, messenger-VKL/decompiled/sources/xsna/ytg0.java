package xsna;

import android.view.View;

/* compiled from: RxExt.kt */
/* loaded from: classes17.dex */
public final class ytg0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ io.reactivex.rxjava3.disposables.c c;

    public ytg0(View view, io.reactivex.rxjava3.disposables.c cVar) {
        this.b = view;
        this.c = cVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        this.c.dispose();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
