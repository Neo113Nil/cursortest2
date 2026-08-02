package xsna;

import android.view.View;

/* compiled from: BottomActionSingleCommunityAdapter.kt */
/* loaded from: classes6.dex */
public final class b50 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ c50 b;

    public b50(c50 c50Var) {
        this.b = c50Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        pgn pgnVar = this.b.n;
        qcy<Object> qcyVar = c50.o[0];
        io.reactivex.rxjava3.disposables.c cVar = (io.reactivex.rxjava3.disposables.c) pgnVar.b;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
