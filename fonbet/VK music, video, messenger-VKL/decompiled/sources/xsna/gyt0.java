package xsna;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: view.kt */
/* loaded from: classes4.dex */
public final class gyt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ izs<View, s3q0> c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public gyt0(View view, izs<? super View, s3q0> izsVar, boolean z) {
        this.b = view;
        this.c = izsVar;
        this.d = z;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        View view = this.b;
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
        this.c.invoke(view);
        return this.d;
    }
}
