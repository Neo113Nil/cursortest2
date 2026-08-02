package yads;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes10.dex */
public final class nm3 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener a;
    public final /* synthetic */ View b;

    public nm3(View view, ViewTreeObserver.OnPreDrawListener onPreDrawListener) {
        this.a = onPreDrawListener;
        this.b = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.onPreDraw();
        this.b.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
