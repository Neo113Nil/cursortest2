package defpackage;

import android.view.View;

/* loaded from: classes10.dex */
public final class pv31 implements g1k {
    public final View a;
    public volatile noh b;

    public pv31(View view, noh nohVar) {
        this.a = view;
        this.b = nohVar;
    }

    @Override // defpackage.g1k
    public final void dispose() {
        View view = this.a;
        if (m.c(view).isDisposed(this)) {
            return;
        }
        m.c(view).dispose();
    }
}
