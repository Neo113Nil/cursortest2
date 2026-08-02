package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.sync.a;

/* loaded from: classes9.dex */
public final class h050 implements i18, k041 {
    public final j18 a;
    public final /* synthetic */ a b;

    public h050(a aVar, j18 j18Var) {
        this.b = aVar;
        this.a = j18Var;
    }

    @Override // defpackage.i18
    public final boolean b(Throwable th) {
        return this.a.b(th);
    }

    @Override // defpackage.k041
    public final void c(s7q0 s7q0Var, int i) {
        this.a.c(s7q0Var, i);
    }

    @Override // kotlin.coroutines.Continuation
    /* renamed from: getContext */
    public final fse get_context() {
        return this.a.x;
    }

    @Override // defpackage.i18
    public final boolean isActive() {
        return this.a.t() instanceof mf60;
    }

    @Override // defpackage.i18
    public final void j(Object obj) {
        this.a.j(obj);
    }

    @Override // defpackage.i18
    public final jb20 m(Object obj, zls zlsVar) {
        a aVar = this.b;
        iq6 iq6Var = new iq6(aVar, this);
        jb20 I = this.a.I((zy11) obj, iq6Var);
        if (I != null) {
            a.C.set(aVar, null);
        }
        return I;
    }

    @Override // defpackage.i18
    public final void q(Object obj, zls zlsVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.C;
        a aVar = this.b;
        atomicReferenceFieldUpdater.set(aVar, null);
        weu weuVar = new weu(aVar, this);
        this.a.E(weuVar, (zy11) obj);
    }

    @Override // kotlin.coroutines.Continuation
    public final void resumeWith(Object obj) {
        this.a.resumeWith(obj);
    }
}
