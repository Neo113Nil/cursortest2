package xsna;

import android.view.View;
import android.view.ViewTreeObserver;

/* compiled from: ViewUtils.java */
/* loaded from: classes7.dex */
public final class w1u0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ Runnable c;

    public w1u0(View view, Runnable runnable) {
        this.b = view;
        this.c = runnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        this.c.run();
        return false;
    }
}
