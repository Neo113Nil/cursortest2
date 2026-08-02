package xsna;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.JobCancellationException;
import xsna.nm8;

/* compiled from: ChannelCoroutine.kt */
/* loaded from: classes11.dex */
public class wwa<E> extends xd<s3q0> implements qta<E> {
    public final nm8 e;

    public wwa(kotlin.coroutines.d dVar, nm8 nm8Var) {
        super(dVar, true, true);
        this.e = nm8Var;
    }

    @Override // xsna.ohi0
    public final boolean B(Throwable th) {
        return this.e.m(th, false);
    }

    @Override // xsna.pyx
    public final void P(CancellationException cancellationException) {
        this.e.m(cancellationException, true);
        M(cancellationException);
    }

    @Override // xsna.b9f0
    public final Object a(spj<? super E> spjVar) {
        return this.e.a(spjVar);
    }

    @Override // xsna.pyx, xsna.eyx
    public final void b(CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(R(), null, this);
        }
        P(cancellationException);
    }

    @Override // xsna.ohi0
    public final boolean d() {
        return this.e.d();
    }

    @Override // xsna.b9f0
    public final a7i0 e() {
        return this.e.e();
    }

    @Override // xsna.ohi0
    public final Object f(E e) {
        return this.e.f(e);
    }

    @Override // xsna.b9f0
    public final a7i0 g() {
        return this.e.g();
    }

    @Override // xsna.b9f0
    public final o0b<E> iterator() {
        nm8 nm8Var = this.e;
        nm8Var.getClass();
        return new nm8.a();
    }

    @Override // xsna.b9f0
    public final Object l() {
        return this.e.l();
    }

    @Override // xsna.ohi0
    public final void s(izs<? super Throwable, s3q0> izsVar) {
        this.e.s(izsVar);
    }

    @Override // xsna.ohi0
    public final Object t(E e, spj<? super s3q0> spjVar) {
        return this.e.t(e, spjVar);
    }

    @Override // xsna.b9f0
    public final Object u(SuspendLambda suspendLambda) {
        nm8 nm8Var = this.e;
        nm8Var.getClass();
        Object G = nm8.G(nm8Var, suspendLambda);
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return G;
    }
}
