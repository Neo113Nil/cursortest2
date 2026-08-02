package defpackage;

import android.os.Trace;
import androidx.compose.runtime.PausedCompositionState;
import androidx.compose.runtime.k;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes10.dex */
public final class gs90 {
    public final bud a;
    public final ttd b;
    public final brw c;
    public final wls d;
    public final boolean e;
    public final dmw0 f;
    public final Object g;
    public final AtomicReference h = new AtomicReference(PausedCompositionState.InitialPending);
    public long i = qke.i();
    public iz40 j = dmm0.a;
    public final zti0 k;
    public final k l;

    public gs90(bud budVar, ttd ttdVar, bts btsVar, kz40 kz40Var, wls wlsVar, boolean z, dmw0 dmw0Var, Object obj) {
        this.a = budVar;
        this.b = ttdVar;
        this.c = btsVar;
        this.d = wlsVar;
        this.e = z;
        this.f = dmw0Var;
        this.g = obj;
        zti0 zti0Var = new zti0();
        zti0Var.g(kz40Var, btsVar.D());
        this.k = zti0Var;
        this.l = new k(dmw0Var.c);
    }

    public final void a() {
        AtomicReference atomicReference = this.h;
        try {
            switch (fs90.a[((PausedCompositionState) atomicReference.get()).ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    b();
                    PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
                    PausedCompositionState pausedCompositionState2 = PausedCompositionState.Applied;
                    while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                        if (atomicReference.get() != pausedCompositionState) {
                            khe0.b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
                            return;
                        }
                    }
                    return;
                case 5:
                    throw new IllegalStateException("The paused composition has already been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(PausedCompositionState.Invalid);
            throw e;
        }
    }

    public final void b() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.c(this.f, this.k);
                    this.k.c();
                    this.k.d();
                } finally {
                    this.k.b();
                    this.a.J = null;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public final k c() {
        return this.l;
    }

    public final zti0 d() {
        return this.k;
    }

    public final boolean e() {
        return ((PausedCompositionState) this.h.get()).compareTo(PausedCompositionState.ApplyPending) >= 0;
    }

    public final boolean f() {
        return this.h.get() == PausedCompositionState.Recomposing && this.i == qke.i();
    }

    public final void g() {
        boolean z;
        PausedCompositionState pausedCompositionState = PausedCompositionState.RecomposePending;
        PausedCompositionState pausedCompositionState2 = PausedCompositionState.ApplyPending;
        while (true) {
            AtomicReference atomicReference = this.h;
            if (atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                z = true;
                break;
            } else if (atomicReference.get() != pausedCompositionState) {
                z = false;
                break;
            }
        }
        if (z) {
            return;
        }
        khe0.b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
    }

    public final void h() {
        AtomicReference atomicReference;
        PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
        PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
        do {
            atomicReference = this.h;
            if (atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                return;
            }
        } while (atomicReference.get() == pausedCompositionState);
    }

    public final boolean i(d5s0 d5s0Var) {
        AtomicReference atomicReference = this.h;
        try {
            int i = fs90.a[((PausedCompositionState) atomicReference.get()).ordinal()];
            bud budVar = this.a;
            ttd ttdVar = this.b;
            switch (i) {
                case 1:
                    brw brwVar = this.c;
                    boolean z = this.e;
                    if (z) {
                        brwVar.g();
                    }
                    try {
                        this.j = ttdVar.b(budVar, d5s0Var, this.d);
                        PausedCompositionState pausedCompositionState = PausedCompositionState.InitialPending;
                        PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                                if (atomicReference.get() != pausedCompositionState) {
                                    khe0.b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + '.');
                                }
                            }
                        }
                        if (this.j.g()) {
                            g();
                        }
                        return e();
                    } finally {
                        if (z) {
                            brwVar.f();
                        }
                    }
                case 2:
                    PausedCompositionState pausedCompositionState3 = PausedCompositionState.RecomposePending;
                    PausedCompositionState pausedCompositionState4 = PausedCompositionState.Recomposing;
                    while (true) {
                        if (!atomicReference.compareAndSet(pausedCompositionState3, pausedCompositionState4)) {
                            if (atomicReference.get() != pausedCompositionState3) {
                                khe0.b("Unexpected state change from: " + pausedCompositionState3 + " to: " + pausedCompositionState4 + '.');
                            }
                        }
                    }
                    long j = this.i;
                    try {
                        this.i = qke.i();
                        this.j = ttdVar.q(budVar, d5s0Var, this.j);
                        this.i = j;
                        PausedCompositionState pausedCompositionState5 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState6 = PausedCompositionState.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState5, pausedCompositionState6)) {
                                if (atomicReference.get() != pausedCompositionState5) {
                                    khe0.b("Unexpected state change from: " + pausedCompositionState5 + " to: " + pausedCompositionState6 + '.');
                                }
                            }
                        }
                        if (this.j.g()) {
                            g();
                        }
                        return e();
                    } catch (Throwable th) {
                        this.i = j;
                        PausedCompositionState pausedCompositionState7 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState8 = PausedCompositionState.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState7, pausedCompositionState8)) {
                                if (atomicReference.get() != pausedCompositionState7) {
                                    khe0.b("Unexpected state change from: " + pausedCompositionState7 + " to: " + pausedCompositionState8 + '.');
                                }
                            }
                        }
                        throw th;
                    }
                case 3:
                    lid.b("Recursive call to resume()");
                    throw new KotlinNothingValueException();
                case 4:
                    throw new IllegalStateException("Pausable composition is complete and apply() should be applied");
                case 5:
                    throw new IllegalStateException("The paused composition has been applied");
                case 6:
                    throw new IllegalStateException("The paused composition has been cancelled");
                case 7:
                    throw new IllegalStateException("The paused composition is invalid because of a previous exception");
                default:
                    throw new NoWhenBranchMatchedException();
            }
        } catch (Exception e) {
            atomicReference.set(PausedCompositionState.Invalid);
            throw e;
        }
    }
}
