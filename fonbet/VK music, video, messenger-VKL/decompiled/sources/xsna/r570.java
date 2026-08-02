package xsna;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.eyx;

/* compiled from: NonCancellable.kt */
/* loaded from: classes8.dex */
public final class r570 extends kotlin.coroutines.a implements eyx {
    public static final r570 b = new r570(eyx.a.b);

    @Override // xsna.eyx
    @ozl
    public final ogn E(izs<? super Throwable, s3q0> izsVar) {
        return t570.b;
    }

    @Override // xsna.eyx
    @ozl
    public final CancellationException I() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // xsna.eyx
    @ozl
    public final ogn c(boolean z, boolean z2, ic1 ic1Var) {
        return t570.b;
    }

    @Override // xsna.eyx
    @ozl
    public final r9c i(pyx pyxVar) {
        return t570.b;
    }

    @Override // xsna.eyx
    public final boolean isActive() {
        return true;
    }

    @Override // xsna.eyx
    public final boolean isCancelled() {
        return false;
    }

    @Override // xsna.eyx
    public final boolean m() {
        return false;
    }

    @Override // xsna.eyx
    public final uki0<eyx> n() {
        return ghp.a;
    }

    @Override // xsna.eyx
    @ozl
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // xsna.eyx
    @ozl
    public final Object y(ContinuationImpl continuationImpl) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // xsna.eyx
    @ozl
    public final void b(CancellationException cancellationException) {
    }
}
