package xsna;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: ViewExt.kt */
/* loaded from: classes17.dex */
public final class owt0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ gzs<s3q0> c;

    public owt0(View view, gzs<s3q0> gzsVar) {
        this.b = view;
        this.c = gzsVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.c.invoke();
        return true;
    }
}
