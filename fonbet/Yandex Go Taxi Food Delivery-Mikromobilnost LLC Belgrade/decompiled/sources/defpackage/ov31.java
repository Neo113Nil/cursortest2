package defpackage;

import android.view.View;

/* loaded from: classes.dex */
public final class ov31 implements d1k {
    public final View a;
    public volatile noh b;

    public ov31(View view, noh nohVar) {
        this.a = view;
        this.b = nohVar;
    }

    @Override // defpackage.d1k
    public final boolean b() {
        return qje.v(this.a).isDisposed(this);
    }

    @Override // defpackage.d1k
    public final void dispose() {
        if (b()) {
            return;
        }
        qje.v(this.a).dispose();
    }

    @Override // defpackage.d1k
    public final noh f() {
        return this.b;
    }
}
