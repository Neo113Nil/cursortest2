package androidx.work.impl.constraints.controllers;

import defpackage.d7e;
import defpackage.e8e;
import defpackage.k8e;
import kotlinx.coroutines.flow.b;
import kotlinx.coroutines.flow.e;

/* loaded from: classes.dex */
public abstract class a implements d7e {
    public final e8e a;

    public a(e8e e8eVar) {
        this.a = e8eVar;
    }

    @Override // defpackage.d7e
    public final b b(k8e k8eVar) {
        return e.g(new BaseConstraintController$track$1(this, null));
    }

    public abstract int c();

    public abstract boolean d(Object obj);
}
