package xsna;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: VhFirstDrawPerfTrackerImpl.kt */
/* loaded from: classes16.dex */
public final class jrr0 implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ ViewTreeObserver b;
    public final /* synthetic */ View c;
    public final /* synthetic */ Ref$ObjectRef<View.OnAttachStateChangeListener> d;
    public final /* synthetic */ com.vk.movika.sdk.base.ui.h e;

    public jrr0(ViewTreeObserver viewTreeObserver, View view, Ref$ObjectRef ref$ObjectRef, com.vk.movika.sdk.base.ui.h hVar) {
        this.b = viewTreeObserver;
        this.c = view;
        this.d = ref$ObjectRef;
        this.e = hVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        ViewTreeObserver viewTreeObserver = this.b;
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnDrawListener(this);
        }
        View.OnAttachStateChangeListener onAttachStateChangeListener = this.d.element;
        this.c.removeOnAttachStateChangeListener(onAttachStateChangeListener == null ? null : onAttachStateChangeListener);
        this.e.invoke();
    }
}
