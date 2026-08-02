package xsna;

import android.content.Context;
import android.view.View;

/* compiled from: AndroidGraphicsContext.android.kt */
/* loaded from: classes11.dex */
public final class b92 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ c92 b;

    public b92(c92 c92Var) {
        this.b = c92Var;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Context context = view.getContext();
        c92 c92Var = this.b;
        if (c92Var.d) {
            return;
        }
        context.getApplicationContext().registerComponentCallbacks(c92Var.e);
        c92Var.d = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Context context = view.getContext();
        c92 c92Var = this.b;
        if (c92Var.d) {
            context.getApplicationContext().unregisterComponentCallbacks(c92Var.e);
            c92Var.d = false;
        }
    }
}
