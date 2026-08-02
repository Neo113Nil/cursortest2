package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.c;

/* loaded from: classes9.dex */
public final class ie60 extends d7 implements l8x {
    public static final ie60 a = new ie60(seu.C);

    @Override // defpackage.l8x
    public final m1k D(tls tlsVar, boolean z, boolean z2) {
        return ke60.a;
    }

    @Override // defpackage.l8x
    public final CancellationException I() {
        throw new IllegalStateException("This job is always active");
    }

    @Override // defpackage.l8x
    public final void a(CancellationException cancellationException) {
    }

    @Override // defpackage.l8x
    public final hpb b0(c cVar) {
        return ke60.a;
    }

    @Override // defpackage.l8x
    public final qrq0 getChildren() {
        return ixn.a;
    }

    @Override // defpackage.l8x
    public final boolean isActive() {
        return true;
    }

    @Override // defpackage.l8x
    public final boolean isCancelled() {
        return false;
    }

    @Override // defpackage.l8x
    public final boolean k0() {
        return false;
    }

    @Override // defpackage.l8x
    public final boolean start() {
        return false;
    }

    public final String toString() {
        return "NonCancellable";
    }

    @Override // defpackage.l8x
    public final Object u0(Continuation continuation) {
        throw new UnsupportedOperationException("This job is always active");
    }

    @Override // defpackage.l8x
    public final m1k w(tls tlsVar) {
        return ke60.a;
    }
}
