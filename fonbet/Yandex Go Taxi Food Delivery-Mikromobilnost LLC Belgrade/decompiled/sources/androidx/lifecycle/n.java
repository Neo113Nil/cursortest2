package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.l8x;
import defpackage.oyj;
import defpackage.wu5;

/* loaded from: classes10.dex */
public final class n {
    public final Lifecycle a;
    public final Lifecycle.State b;
    public final oyj c;
    public final wu5 d;

    public n(Lifecycle lifecycle, Lifecycle.State state, oyj oyjVar, l8x l8xVar) {
        this.a = lifecycle;
        this.b = state;
        this.c = oyjVar;
        wu5 wu5Var = new wu5(2, this, l8xVar);
        this.d = wu5Var;
        if (lifecycle.b() != Lifecycle.State.DESTROYED) {
            lifecycle.a(wu5Var);
        } else {
            l8xVar.a(null);
            a();
        }
    }

    public final void a() {
        this.a.d(this.d);
        oyj oyjVar = this.c;
        oyjVar.b = true;
        oyjVar.a();
    }
}
