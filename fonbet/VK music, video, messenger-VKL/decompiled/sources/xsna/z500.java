package xsna;

import android.view.View;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes16.dex */
public final class z500 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ b600 b;
    public final /* synthetic */ Ref$ObjectRef c;

    public z500(b600 b600Var, Ref$ObjectRef ref$ObjectRef) {
        this.b = b600Var;
        this.c = ref$ObjectRef;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b.removeOnAttachStateChangeListener(this);
        gzs gzsVar = (gzs) this.c.element;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
