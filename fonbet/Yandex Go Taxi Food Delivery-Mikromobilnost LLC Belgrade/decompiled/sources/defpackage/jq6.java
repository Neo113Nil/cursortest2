package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.channels.a;

/* loaded from: classes9.dex */
public final class jq6 implements k041 {
    public Object a = kq6.p;
    public j18 b;
    public final /* synthetic */ a c;

    public jq6(a aVar) {
        this.c = aVar;
    }

    public final Object a(Continuation continuation) {
        pi9 pi9Var;
        Boolean bool;
        Object obj = this.a;
        boolean z = true;
        if (obj == kq6.p || obj == kq6.l) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a.B;
            a aVar = this.c;
            pi9 pi9Var2 = (pi9) atomicReferenceFieldUpdater.get(aVar);
            while (true) {
                if (aVar.D()) {
                    this.a = kq6.l;
                    Throwable u = aVar.u();
                    if (u != null) {
                        int i = xyt0.a;
                        throw u;
                    }
                    z = false;
                } else {
                    long andIncrement = a.x.getAndIncrement(aVar);
                    int i2 = kq6.b;
                    long j = andIncrement / i2;
                    int i3 = (int) (andIncrement % i2);
                    if (pi9Var2.x != j) {
                        pi9Var = aVar.s(j, pi9Var2);
                        if (pi9Var == null) {
                            continue;
                        }
                    } else {
                        pi9Var = pi9Var2;
                    }
                    Object R = aVar.R(pi9Var, i3, andIncrement, null);
                    pi9 pi9Var3 = pi9Var;
                    jb20 jb20Var = kq6.m;
                    sp5 sp5Var = null;
                    if (R == jb20Var) {
                        ny61.r("unreachable");
                        return null;
                    }
                    jb20 jb20Var2 = kq6.o;
                    if (R == jb20Var2) {
                        if (andIncrement < aVar.x()) {
                            pi9Var3.b();
                        }
                        pi9Var2 = pi9Var3;
                    } else {
                        if (R == kq6.n) {
                            a aVar2 = this.c;
                            j18 V = cma1.V(dvw.b(continuation));
                            try {
                                this.b = V;
                                Object R2 = aVar2.R(pi9Var3, i3, andIncrement, this);
                                tls tlsVar = aVar2.b;
                                if (R2 == jb20Var) {
                                    c(pi9Var3, i3);
                                } else {
                                    if (R2 == jb20Var2) {
                                        if (andIncrement < aVar2.x()) {
                                            pi9Var3.b();
                                        }
                                        pi9 pi9Var4 = (pi9) a.B.get(aVar2);
                                        while (true) {
                                            if (aVar2.D()) {
                                                j18 j18Var = this.b;
                                                this.b = null;
                                                this.a = kq6.l;
                                                Throwable u2 = aVar.u();
                                                if (u2 == null) {
                                                    j18Var.resumeWith(Boolean.FALSE);
                                                } else {
                                                    j18Var.resumeWith(new Result.Failure(u2));
                                                }
                                            } else {
                                                long andIncrement2 = a.x.getAndIncrement(aVar2);
                                                long j2 = kq6.b;
                                                long j3 = andIncrement2 / j2;
                                                int i4 = (int) (andIncrement2 % j2);
                                                if (pi9Var4.x != j3) {
                                                    pi9 s = aVar2.s(j3, pi9Var4);
                                                    if (s != null) {
                                                        pi9Var4 = s;
                                                    }
                                                }
                                                Object R3 = aVar2.R(pi9Var4, i4, andIncrement2, this);
                                                if (R3 == kq6.m) {
                                                    c(pi9Var4, i4);
                                                    break;
                                                }
                                                if (R3 == kq6.o) {
                                                    if (andIncrement2 < aVar2.x()) {
                                                        pi9Var4.b();
                                                    }
                                                } else {
                                                    if (R3 == kq6.n) {
                                                        throw new IllegalStateException("unexpected");
                                                    }
                                                    pi9Var4.b();
                                                    this.a = R3;
                                                    this.b = null;
                                                    bool = Boolean.TRUE;
                                                    if (tlsVar != null) {
                                                        sp5Var = new sp5(4, tlsVar, R3);
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        pi9Var3.b();
                                        this.a = R2;
                                        this.b = null;
                                        bool = Boolean.TRUE;
                                        if (tlsVar != null) {
                                            sp5Var = new sp5(4, tlsVar, R2);
                                        }
                                    }
                                    V.q(bool, sp5Var);
                                }
                                Object s2 = V.s();
                                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                                return s2;
                            } catch (Throwable th) {
                                V.C();
                                throw th;
                            }
                        }
                        pi9Var3.b();
                        this.a = R;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }

    public final Object b() {
        Object obj = this.a;
        jb20 jb20Var = kq6.p;
        if (obj == jb20Var) {
            ny61.r("`hasNext()` has not been invoked");
            return null;
        }
        this.a = jb20Var;
        if (obj != kq6.l) {
            return obj;
        }
        Throwable v = this.c.v();
        int i = xyt0.a;
        throw v;
    }

    @Override // defpackage.k041
    public final void c(s7q0 s7q0Var, int i) {
        j18 j18Var = this.b;
        if (j18Var != null) {
            j18Var.c(s7q0Var, i);
        }
    }
}
