package xsna;

import android.view.View;
import android.widget.PopupWindow;

/* compiled from: View.kt */
/* loaded from: classes14.dex */
public final class cvo implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ avo c;
    public final /* synthetic */ PopupWindow d;

    public cvo(View view, avo avoVar, PopupWindow popupWindow) {
        this.b = view;
        this.c = avoVar;
        this.d = popupWindow;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        this.c.invoke(this.d);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
