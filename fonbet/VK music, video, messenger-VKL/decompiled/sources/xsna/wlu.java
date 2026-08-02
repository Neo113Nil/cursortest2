package xsna;

import android.view.ViewTreeObserver;

/* compiled from: GroupPickerView.kt */
/* loaded from: classes5.dex */
public final class wlu implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ xlu b;

    public wlu(xlu xluVar) {
        this.b = xluVar;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        xlu xluVar = this.b;
        xluVar.getViewTreeObserver().removeOnPreDrawListener(this);
        xluVar.a();
        return false;
    }
}
