package xsna;

import android.view.View;

/* compiled from: Effects.kt */
/* loaded from: classes5.dex */
public final class wtf0 implements kgn {
    public final /* synthetic */ View a;
    public final /* synthetic */ vtf0 b;

    public wtf0(View view, vtf0 vtf0Var) {
        this.a = view;
        this.b = vtf0Var;
    }

    @Override // xsna.kgn
    public final void dispose() {
        this.a.removeOnAttachStateChangeListener(this.b);
    }
}
