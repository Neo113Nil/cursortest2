package xsna;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: BaseCameraUIView.kt */
/* loaded from: classes16.dex */
public final class m96 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ n96 c;
    public final /* synthetic */ gzs<s3q0> d;

    public m96(View view, n96 n96Var, gzs<s3q0> gzsVar) {
        this.b = view;
        this.c = n96Var;
        this.d = gzsVar;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.b;
        if (view.getWidth() != 0) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.c.getLayoutObservers().remove(this);
            this.d.invoke();
        }
    }
}
