package xsna;

import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: VhFirstDrawPerfTrackerImpl.kt */
/* loaded from: classes16.dex */
public final class hrr0 {
    public boolean a;

    /* JADX WARN: Type inference failed for: r0v2, types: [T, xsna.irr0] */
    public final void a(String str, View view, long j) {
        if (this.a) {
            return;
        }
        com.vk.movika.sdk.base.ui.h hVar = new com.vk.movika.sdk.base.ui.h(this, j, str);
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        jrr0 jrr0Var = new jrr0(viewTreeObserver, view, ref$ObjectRef, hVar);
        ref$ObjectRef.element = new irr0(viewTreeObserver, jrr0Var);
        viewTreeObserver.addOnDrawListener(jrr0Var);
        T t = ref$ObjectRef.element;
        view.addOnAttachStateChangeListener(t == 0 ? null : (View.OnAttachStateChangeListener) t);
    }
}
