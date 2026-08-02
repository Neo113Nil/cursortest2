package xsna;

import android.view.View;

/* compiled from: FriendsSearchDelegateCallbackImpl.kt */
/* loaded from: classes15.dex */
public final class ats implements View.OnAttachStateChangeListener {
    public final /* synthetic */ bts b;

    public ats(bts btsVar) {
        this.b = btsVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        bts btsVar = this.b;
        view.removeOnLayoutChangeListener(btsVar.e);
        view.removeOnAttachStateChangeListener(btsVar.f);
        if (btsVar.d == view) {
            btsVar.d = null;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
