package defpackage;

import android.os.Handler;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;

/* loaded from: classes10.dex */
public final class pds implements q {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ i8m b;

    public pds(Handler handler, i8m i8mVar) {
        this.a = handler;
        this.b = i8mVar;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            this.a.removeCallbacks(this.b);
            peyVar.getLifecycle().d(this);
        }
    }
}
