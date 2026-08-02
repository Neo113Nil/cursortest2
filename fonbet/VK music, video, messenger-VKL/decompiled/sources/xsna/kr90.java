package xsna;

import android.os.Trace;
import androidx.compose.runtime.PausedCompositionState;
import io.jsonwebtoken.JwtParser;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: PausableComposition.kt */
/* loaded from: classes11.dex */
public final class kr90 implements jr90 {
    public final ivi a;
    public final cvi b;
    public final egx c;
    public final wzs<androidx.compose.runtime.a, Integer, s3q0> d;
    public final boolean e;
    public final oc f;
    public final Object g;
    public final AtomicReference<PausedCompositionState> h = new AtomicReference<>(PausedCompositionState.InitialPending);
    public long i = ey2.f();
    public j5h0<androidx.compose.runtime.f> j = k5h0.a;
    public final ytf0 k;
    public final hjs l;

    /* compiled from: PausableComposition.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PausedCompositionState.values().length];
            try {
                iArr[PausedCompositionState.InitialPending.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PausedCompositionState.RecomposePending.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PausedCompositionState.Recomposing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PausedCompositionState.ApplyPending.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PausedCompositionState.Applied.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PausedCompositionState.Cancelled.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PausedCompositionState.Invalid.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public kr90(ivi iviVar, cvi cviVar, androidx.compose.runtime.c cVar, rh50 rh50Var, wzs wzsVar, boolean z, oc ocVar, Object obj) {
        this.a = iviVar;
        this.b = cviVar;
        this.c = cVar;
        this.d = wzsVar;
        this.e = z;
        this.f = ocVar;
        this.g = obj;
        ytf0 ytf0Var = new ytf0();
        ytf0Var.g(rh50Var, cVar.q0());
        this.k = ytf0Var;
        this.l = new hjs(ocVar.b);
    }

    @Override // xsna.jr90
    public final boolean a() {
        return this.h.get().compareTo(PausedCompositionState.ApplyPending) >= 0;
    }

    @Override // xsna.jr90
    public final void apply() {
        AtomicReference<PausedCompositionState> atomicReference = this.h;
        try {
            switch (a.$EnumSwitchMapping$0[atomicReference.get().ordinal()]) {
                case 1:
                case 2:
                case 3:
                    throw new IllegalStateException("The paused composition has not completed yet");
                case 4:
                    c();
                    PausedCompositionState pausedCompositionState = PausedCompositionState.ApplyPending;
                    PausedCompositionState pausedCompositionState2 = PausedCompositionState.Applied;
                    while (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                        if (atomicReference.get() != pausedCompositionState) {
                            gxc0.b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + JwtParser.SEPARATOR_CHAR);
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

    @Override // xsna.jr90
    public final boolean b(ghj0 ghj0Var) {
        AtomicReference<PausedCompositionState> atomicReference = this.h;
        try {
            int i = a.$EnumSwitchMapping$0[atomicReference.get().ordinal()];
            ivi iviVar = this.a;
            cvi cviVar = this.b;
            switch (i) {
                case 1:
                    egx egxVar = this.c;
                    boolean z = this.e;
                    if (z) {
                        egxVar.d0();
                    }
                    try {
                        this.j = cviVar.b(iviVar, ghj0Var, this.d);
                        PausedCompositionState pausedCompositionState = PausedCompositionState.InitialPending;
                        PausedCompositionState pausedCompositionState2 = PausedCompositionState.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState, pausedCompositionState2)) {
                                if (atomicReference.get() != pausedCompositionState) {
                                    gxc0.b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + JwtParser.SEPARATOR_CHAR);
                                }
                            }
                        }
                        if (this.j.c()) {
                            d();
                        }
                        return a();
                    } finally {
                        if (z) {
                            egxVar.a();
                        }
                    }
                case 2:
                    PausedCompositionState pausedCompositionState3 = PausedCompositionState.RecomposePending;
                    PausedCompositionState pausedCompositionState4 = PausedCompositionState.Recomposing;
                    while (true) {
                        if (!atomicReference.compareAndSet(pausedCompositionState3, pausedCompositionState4)) {
                            if (atomicReference.get() != pausedCompositionState3) {
                                gxc0.b("Unexpected state change from: " + pausedCompositionState3 + " to: " + pausedCompositionState4 + JwtParser.SEPARATOR_CHAR);
                            }
                        }
                    }
                    long j = this.i;
                    try {
                        this.i = ey2.f();
                        this.j = cviVar.q(iviVar, ghj0Var, this.j);
                        this.i = j;
                        PausedCompositionState pausedCompositionState5 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState6 = PausedCompositionState.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState5, pausedCompositionState6)) {
                                if (atomicReference.get() != pausedCompositionState5) {
                                    gxc0.b("Unexpected state change from: " + pausedCompositionState5 + " to: " + pausedCompositionState6 + JwtParser.SEPARATOR_CHAR);
                                }
                            }
                        }
                        if (this.j.c()) {
                            d();
                        }
                        return a();
                    } catch (Throwable th) {
                        this.i = j;
                        PausedCompositionState pausedCompositionState7 = PausedCompositionState.Recomposing;
                        PausedCompositionState pausedCompositionState8 = PausedCompositionState.RecomposePending;
                        while (true) {
                            if (!atomicReference.compareAndSet(pausedCompositionState7, pausedCompositionState8)) {
                                if (atomicReference.get() != pausedCompositionState7) {
                                    gxc0.b("Unexpected state change from: " + pausedCompositionState7 + " to: " + pausedCompositionState8 + JwtParser.SEPARATOR_CHAR);
                                }
                            }
                        }
                        throw th;
                    }
                case 3:
                    androidx.compose.runtime.b.b("Recursive call to resume()");
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

    public final void c() {
        Trace.beginSection("PausedComposition:applyChanges");
        try {
            synchronized (this.g) {
                try {
                    this.l.l(this.f, this.k);
                    this.k.c();
                    this.k.d();
                    this.k.b();
                    this.a.r = null;
                    s3q0 s3q0Var = s3q0.a;
                } catch (Throwable th) {
                    this.k.b();
                    this.a.r = null;
                    throw th;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    @Override // xsna.jr90
    public final void cancel() {
        qh50<iuf0> qh50Var;
        this.h.set(PausedCompositionState.Cancelled);
        ytf0 ytf0Var = this.k;
        if (ytf0Var.d.d()) {
            qh50Var = ytf0Var.d;
            ytf0Var.d = k5h0.a();
            ytf0Var.c.g();
        } else {
            qh50Var = null;
        }
        ytf0Var.b();
        ivi iviVar = this.a;
        iviVar.r = null;
        if (qh50Var != null) {
            iviVar.v.k = qh50Var;
            iviVar.x = 2;
        }
    }

    public final void d() {
        boolean z;
        PausedCompositionState pausedCompositionState = PausedCompositionState.RecomposePending;
        PausedCompositionState pausedCompositionState2 = PausedCompositionState.ApplyPending;
        while (true) {
            AtomicReference<PausedCompositionState> atomicReference = this.h;
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
        gxc0.b("Unexpected state change from: " + pausedCompositionState + " to: " + pausedCompositionState2 + JwtParser.SEPARATOR_CHAR);
    }
}
