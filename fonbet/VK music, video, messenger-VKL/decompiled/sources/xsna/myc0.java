package xsna;

import com.vk.bridges.ImageViewer;
import com.vk.core.preference.Preference;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Result;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DispatchException;

/* compiled from: OldEncryptedPreference.kt */
@ozl
/* loaded from: classes.dex */
public final class myc0 implements bey {
    public static bpn0 a;

    public static asl b(yvj yvjVar, kotlin.coroutines.d dVar, CoroutineStart coroutineStart, wzs wzsVar, int i) {
        if ((i & 1) != 0) {
            dVar = EmptyCoroutineContext.b;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        kotlin.coroutines.d b = mvj.b(yvjVar, dVar);
        coroutineStart.getClass();
        asl hqyVar = coroutineStart == CoroutineStart.LAZY ? new hqy(b, wzsVar) : new asl(b);
        hqyVar.w0(coroutineStart, hqyVar, wzsVar);
        return hqyVar;
    }

    public static void c(String str, boolean z) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static final ImageViewer d() {
        bpn0 bpn0Var = a;
        if (bpn0Var == null) {
            bpn0Var = null;
        }
        return (ImageViewer) bpn0Var.getValue();
    }

    public static final boolean f(CharSequence charSequence) {
        return !(charSequence == null || charSequence.length() == 0);
    }

    public static final yok0 g(yvj yvjVar, kotlin.coroutines.d dVar, CoroutineStart coroutineStart, wzs wzsVar) {
        kotlin.coroutines.d b = mvj.b(yvjVar, dVar);
        coroutineStart.getClass();
        yok0 xxyVar = coroutineStart == CoroutineStart.LAZY ? new xxy(b, wzsVar) : new yok0(b, true, true);
        xxyVar.w0(coroutineStart, xxyVar, wzsVar);
        return xxyVar;
    }

    public static /* synthetic */ yok0 h(yvj yvjVar, kotlin.coroutines.d dVar, CoroutineStart coroutineStart, wzs wzsVar, int i) {
        if ((i & 1) != 0) {
            dVar = EmptyCoroutineContext.b;
        }
        if ((i & 2) != 0) {
            coroutineStart = CoroutineStart.DEFAULT;
        }
        return g(yvjVar, dVar, coroutineStart, wzsVar);
    }

    public static final Object i(kotlin.coroutines.d dVar, wzs wzsVar) throws InterruptedException {
        c0q c0qVar;
        kotlin.coroutines.d a2;
        long Y;
        Thread currentThread = Thread.currentThread();
        c.a aVar = c.a.b;
        kotlin.coroutines.c cVar = (kotlin.coroutines.c) dVar.get(aVar);
        if (cVar == null) {
            c0qVar = bro0.a();
            a2 = mvj.a(EmptyCoroutineContext.b, dVar.plus(c0qVar), true);
            xll xllVar = bdn.b;
            if (a2 != xllVar && a2.get(aVar) == null) {
                a2 = a2.plus(xllVar);
            }
        } else {
            if (cVar instanceof c0q) {
            }
            c0qVar = bro0.a.get();
            a2 = mvj.a(EmptyCoroutineContext.b, dVar, true);
            xll xllVar2 = bdn.b;
            if (a2 != xllVar2 && a2.get(aVar) == null) {
                a2 = a2.plus(xllVar2);
            }
        }
        sf7 sf7Var = new sf7(a2, currentThread, c0qVar);
        sf7Var.w0(CoroutineStart.DEFAULT, sf7Var, wzsVar);
        c0q c0qVar2 = sf7Var.f;
        if (c0qVar2 != null) {
            int i = c0q.f;
            c0qVar2.X(false);
        }
        while (true) {
            if (c0qVar2 != null) {
                try {
                    Y = c0qVar2.Y();
                } catch (Throwable th) {
                    if (c0qVar2 != null) {
                        int i2 = c0q.f;
                        c0qVar2.U(false);
                    }
                    throw th;
                }
            } else {
                Y = Long.MAX_VALUE;
            }
            if (sf7Var.m()) {
                break;
            }
            LockSupport.parkNanos(sf7Var, Y);
            if (Thread.interrupted()) {
                sf7Var.M(new InterruptedException());
            }
        }
        if (c0qVar2 != null) {
            int i3 = c0q.f;
            c0qVar2.U(false);
        }
        Object d = tyx.d(pyx.b.get(sf7Var));
        d8i d8iVar = d instanceof d8i ? (d8i) d : null;
        if (d8iVar == null) {
            return d;
        }
        throw d8iVar.a;
    }

    public static final Object k(kotlin.coroutines.d dVar, wzs wzsVar, spj spjVar) {
        Object d;
        kotlin.coroutines.d context = spjVar.getContext();
        kotlin.coroutines.d plus = !((Boolean) dVar.fold(Boolean.FALSE, new jvj())).booleanValue() ? context.plus(dVar) : mvj.a(context, dVar, false);
        iyx.e(plus);
        if (plus == context) {
            z9h0 z9h0Var = new z9h0(spjVar, plus);
            d = e2l.c(z9h0Var, true, z9h0Var, wzsVar);
        } else {
            c.a aVar = c.a.b;
            if (epx.f(plus.get(aVar), context.get(aVar))) {
                z2q0 z2q0Var = new z2q0(spjVar, plus);
                kotlin.coroutines.d dVar2 = z2q0Var.d;
                Object b = mqo0.b(dVar2, null);
                try {
                    Object c = e2l.c(z2q0Var, true, z2q0Var, wzsVar);
                    mqo0.a(dVar2, b);
                    d = c;
                } catch (Throwable th) {
                    mqo0.a(dVar2, b);
                    throw th;
                }
            } else {
                ncn ncnVar = new ncn(spjVar, plus);
                try {
                    upj.b(s3q0.a, s7s0.c(s7s0.a(ncnVar, ncnVar, wzsVar)));
                    AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = ncn.f;
                    while (true) {
                        int i = atomicIntegerFieldUpdater.get(ncnVar);
                        if (i != 0) {
                            if (i != 2) {
                                throw new IllegalStateException("Already suspended");
                            }
                            d = tyx.d(pyx.b.get(ncnVar));
                            if (d instanceof d8i) {
                                throw ((d8i) d).a;
                            }
                        } else if (atomicIntegerFieldUpdater.compareAndSet(ncnVar, 0, 1)) {
                            d = CoroutineSingletons.COROUTINE_SUSPENDED;
                            break;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (th instanceof DispatchException) {
                        th = ((DispatchException) th).getCause();
                    }
                    ncnVar.resumeWith(new Result.Failure(th));
                    throw th;
                }
            }
        }
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return d;
    }

    @Override // xsna.bey
    public void a(String str, byte[] bArr) {
        if (bArr != null) {
            Preference.H("EncryptedPreferenceMeta", "encrypted_key.".concat(str), c4g0.E(bArr));
        } else {
            Preference.C("EncryptedPreferenceMeta", "encrypted_key.".concat(str));
        }
    }

    public String e() {
        return ply.a();
    }

    @Override // xsna.bey
    public byte[] get(String str) {
        String s = Preference.s("EncryptedPreferenceMeta", "encrypted_key.".concat(str), "");
        if (drm0.N(s)) {
            return null;
        }
        return c4g0.r(s);
    }
}
