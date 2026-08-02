package xsna;

import android.view.View;

/* compiled from: ProfileCoverDelegate.kt */
/* loaded from: classes5.dex */
public final class pvd0 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ com.vk.profile.core.cover.a b;

    public pvd0(com.vk.profile.core.cover.a aVar) {
        this.b = aVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        com.vk.profile.core.cover.a aVar = this.b;
        aVar.a.getViewTreeObserver().addOnGlobalLayoutListener(aVar.o);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        com.vk.profile.core.cover.a aVar = this.b;
        aVar.a.getViewTreeObserver().removeOnGlobalLayoutListener(aVar.o);
    }
}
