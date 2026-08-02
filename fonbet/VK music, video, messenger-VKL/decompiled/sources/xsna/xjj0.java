package xsna;

import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: ShowcaseSectionOpenPerfTracker.kt */
/* loaded from: classes16.dex */
public final class xjj0 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ RecyclerView b;
    public final /* synthetic */ Ref$ObjectRef<View.OnAttachStateChangeListener> c;
    public final /* synthetic */ vjj0 d;

    public xjj0(RecyclerView recyclerView, Ref$ObjectRef ref$ObjectRef, yjj0 yjj0Var, vjj0 vjj0Var) {
        this.b = recyclerView;
        this.c = ref$ObjectRef;
        this.d = vjj0Var;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        RecyclerView recyclerView = this.b;
        boolean isAttachedToWindow = recyclerView.isAttachedToWindow();
        Ref$ObjectRef<View.OnAttachStateChangeListener> ref$ObjectRef = this.c;
        if (!isAttachedToWindow) {
            recyclerView.getViewTreeObserver().removeOnPreDrawListener(this);
            View.OnAttachStateChangeListener onAttachStateChangeListener = ref$ObjectRef.element;
            recyclerView.removeOnAttachStateChangeListener(onAttachStateChangeListener != null ? onAttachStateChangeListener : null);
            return true;
        }
        if (yjj0.b(recyclerView)) {
            recyclerView.getViewTreeObserver().removeOnPreDrawListener(this);
            View.OnAttachStateChangeListener onAttachStateChangeListener2 = ref$ObjectRef.element;
            recyclerView.removeOnAttachStateChangeListener(onAttachStateChangeListener2 != null ? onAttachStateChangeListener2 : null);
            this.d.invoke();
        }
        return true;
    }
}
