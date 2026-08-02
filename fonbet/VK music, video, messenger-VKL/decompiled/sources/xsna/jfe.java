package xsna;

import android.view.ViewTreeObserver;
import android.widget.HorizontalScrollView;

/* compiled from: ClipsHeaderView.kt */
/* loaded from: classes16.dex */
public final class jfe implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ife b;
    public final /* synthetic */ int c;

    public jfe(ife ifeVar, int i) {
        this.b = ifeVar;
        this.c = i;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        ife ifeVar = this.b;
        HorizontalScrollView horizontalScrollView = ifeVar.c;
        horizontalScrollView.getViewTreeObserver().removeOnPreDrawListener(this);
        ifeVar.n = null;
        horizontalScrollView.setScrollX(this.c);
        return true;
    }
}
