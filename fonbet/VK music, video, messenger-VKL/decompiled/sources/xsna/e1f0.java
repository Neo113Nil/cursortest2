package xsna;

import android.view.View;

/* compiled from: ReactionListAdapter.kt */
/* loaded from: classes2.dex */
public final class e1f0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ io.reactivex.rxjava3.disposables.b b;

    public e1f0(io.reactivex.rxjava3.disposables.b bVar) {
        this.b = bVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.dispose();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
