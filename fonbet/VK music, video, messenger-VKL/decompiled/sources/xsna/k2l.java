package xsna;

import android.view.View;

/* compiled from: DebouncePostHandler.kt */
/* loaded from: classes2.dex */
public final class k2l {
    public final View a;
    public boolean b;
    public final u12 c;

    public k2l(View view) {
        this.a = view;
        this.b = true;
        u12 u12Var = new u12(this, 7);
        this.c = u12Var;
        view.removeCallbacks(u12Var);
        if (view.isAttachedToWindow()) {
            view.addOnAttachStateChangeListener(new j2l(view, this));
        } else {
            this.b = true;
        }
    }
}
