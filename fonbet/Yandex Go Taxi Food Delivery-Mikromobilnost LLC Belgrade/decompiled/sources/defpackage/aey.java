package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;
import java.util.Set;

/* loaded from: classes9.dex */
public final class aey implements q {
    public final /* synthetic */ Set a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ Lifecycle c;

    public aey(Set set, Runnable runnable, Lifecycle lifecycle) {
        this.a = set;
        this.b = runnable;
        this.c = lifecycle;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        boolean contains = this.a.contains(event);
        Lifecycle lifecycle = this.c;
        if (contains) {
            this.b.run();
            lifecycle.d(this);
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            lifecycle.d(this);
        }
    }
}
