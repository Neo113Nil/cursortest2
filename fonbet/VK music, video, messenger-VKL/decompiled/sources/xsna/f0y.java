package xsna;

import android.view.View;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes7.dex */
public final class f0y implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View b;
    public final /* synthetic */ Ref$ObjectRef c;

    public f0y(View view, Ref$ObjectRef ref$ObjectRef) {
        this.b = view;
        this.c = ref$ObjectRef;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        ((io.reactivex.rxjava3.disposables.c) this.c.element).dispose();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
