package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.c;

/* loaded from: classes7.dex */
public final class fuy implements noh {
    public final /* synthetic */ fyc a;

    public fuy(fyc fycVar) {
        this.a = fycVar;
    }

    @Override // defpackage.l8x
    public final m1k D(tls tlsVar, boolean z, boolean z2) {
        return this.a.D(tlsVar, z, z2);
    }

    @Override // defpackage.l8x
    public final CancellationException I() {
        return this.a.I();
    }

    @Override // defpackage.l8x
    public final void a(CancellationException cancellationException) {
        this.a.a(cancellationException);
    }

    @Override // defpackage.l8x
    public final hpb b0(c cVar) {
        return this.a.b0(cVar);
    }

    @Override // defpackage.noh
    public final Object c() {
        return this.a.E();
    }

    @Override // defpackage.fse
    public final Object fold(Object obj, wls wlsVar) {
        return wlsVar.invoke(obj, this.a);
    }

    @Override // defpackage.fse
    public final dse get(ese eseVar) {
        return ffx.H(this.a, eseVar);
    }

    @Override // defpackage.l8x
    public final qrq0 getChildren() {
        return this.a.getChildren();
    }

    @Override // defpackage.dse
    public final ese getKey() {
        return seu.C;
    }

    @Override // defpackage.l8x
    public final boolean isActive() {
        return this.a.isActive();
    }

    @Override // defpackage.l8x
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.noh
    public final Object k(Continuation continuation) {
        Object s = this.a.s(continuation);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return s;
    }

    @Override // defpackage.l8x
    public final boolean k0() {
        return this.a.k0();
    }

    @Override // defpackage.fse
    public final fse minusKey(ese eseVar) {
        return ffx.Y(this.a, eseVar);
    }

    @Override // defpackage.fse
    public final fse plus(fse fseVar) {
        return cvw.U(this.a, fseVar);
    }

    @Override // defpackage.l8x
    public final boolean start() {
        return this.a.start();
    }

    @Override // defpackage.l8x
    public final Object u0(Continuation continuation) {
        return this.a.u0(continuation);
    }

    @Override // defpackage.l8x
    public final m1k w(tls tlsVar) {
        return this.a.w(tlsVar);
    }
}
