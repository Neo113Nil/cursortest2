package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import defpackage.fse;
import defpackage.pey;

/* loaded from: classes.dex */
public final class p extends o implements q {
    public final Lifecycle a;
    public final fse b;

    public p(Lifecycle lifecycle, fse fseVar) {
        this.a = lifecycle;
        this.b = fseVar;
        if (lifecycle.b() == Lifecycle.State.DESTROYED) {
            kotlinx.coroutines.a.e(fseVar, null);
        }
    }

    @Override // androidx.lifecycle.q
    public final void M1(pey peyVar, Lifecycle.Event event) {
        Lifecycle lifecycle = this.a;
        if (lifecycle.b().compareTo(Lifecycle.State.DESTROYED) <= 0) {
            lifecycle.d(this);
            kotlinx.coroutines.a.e(this.b, null);
        }
    }

    @Override // androidx.lifecycle.o
    public final Lifecycle a() {
        return this.a;
    }

    @Override // defpackage.tse
    public final fse getCoroutineContext() {
        return this.b;
    }
}
