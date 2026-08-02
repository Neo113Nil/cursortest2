package defpackage;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.q;

/* loaded from: classes5.dex */
public final class ffy implements q {
    public final /* synthetic */ Lifecycle.Event a;
    public final /* synthetic */ pzt0 b;
    public final /* synthetic */ Lifecycle c;

    public ffy(Lifecycle.Event event, pzt0 pzt0Var, Lifecycle lifecycle) {
        this.a = event;
        this.b = pzt0Var;
        this.c = lifecycle;
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        if (event == this.a) {
            this.b.a(null);
            this.c.d(this);
        }
    }
}
