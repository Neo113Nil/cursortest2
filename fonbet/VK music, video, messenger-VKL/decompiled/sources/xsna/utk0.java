package xsna;

import com.ironsource.InterfaceC4413l1;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.channels.BufferOverflow;
import xsna.eyx;

/* compiled from: StateFlow.kt */
/* loaded from: classes11.dex */
public final class utk0<T> extends th<ytk0> implements xh50<T>, ksr, m0t<T> {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(utk0.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    public int f;

    /* compiled from: StateFlow.kt */
    @b6l(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, 401, InterfaceC4413l1.a.b.f}, m = "collect")
    public static final class a extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ utk0<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(utk0<T> utk0Var, spj<? super a> spjVar) {
            super(spjVar);
            this.this$0 = utk0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    public utk0(Object obj) {
        this._state$volatile = obj;
    }

    @Override // xsna.m0t
    public final ksr<T> a(kotlin.coroutines.d dVar, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? lyd.e(this, dVar, i, bufferOverflow) : this;
    }

    @Override // xsna.th
    public final ytk0 c() {
        return new ytk0();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00bf, code lost:
    
        r10 = r14.equals(r15);
        r14 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c3, code lost:
    
        if (r10 != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0124, code lost:
    
        if (r15 == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a9, code lost:
    
        if (xsna.s3q0.a == r1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0091, code lost:
    
        if (((xsna.wwm0) r14).a(r0) == r1) goto L69;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b1 A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003c, B:14:0x00a9, B:16:0x00b1, B:19:0x00b8, B:20:0x00bc, B:24:0x00bf, B:26:0x00e0, B:29:0x00ed, B:30:0x0107, B:36:0x0119, B:41:0x0122, B:32:0x010e, B:35:0x0114, B:46:0x00c5, B:49:0x00cc, B:57:0x005d, B:59:0x0070, B:60:0x009a), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ed A[Catch: all -> 0x0040, TryCatch #0 {all -> 0x0040, blocks: (B:13:0x003c, B:14:0x00a9, B:16:0x00b1, B:19:0x00b8, B:20:0x00bc, B:24:0x00bf, B:26:0x00e0, B:29:0x00ed, B:30:0x0107, B:36:0x0119, B:41:0x0122, B:32:0x010e, B:35:0x0114, B:46:0x00c5, B:49:0x00cc, B:57:0x005d, B:59:0x0070, B:60:0x009a), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00ec -> B:14:0x00a9). Please report as a decompilation issue!!! */
    @Override // xsna.ksr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(lsr<? super T> lsrVar, spj<?> spjVar) {
        a aVar;
        CoroutineSingletons coroutineSingletons;
        int i;
        utk0<T> utk0Var;
        ytk0 ytk0Var;
        lsr lsrVar2;
        eyx eyxVar;
        Object obj;
        AtomicReference<Object> atomicReference;
        con0 con0Var;
        T t;
        try {
            if (spjVar instanceof a) {
                aVar = (a) spjVar;
                int i2 = aVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    aVar.label = i2 - Integer.MIN_VALUE;
                    Object obj2 = aVar.result;
                    coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = aVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj2);
                        ytk0Var = b();
                        try {
                            if (lsrVar instanceof wwm0) {
                                aVar.L$0 = this;
                                aVar.L$1 = lsrVar;
                                aVar.L$2 = ytk0Var;
                                aVar.label = 1;
                            }
                            utk0Var = this;
                        } catch (Throwable th) {
                            th = th;
                            utk0Var = this;
                            utk0Var.h(ytk0Var);
                            throw th;
                        }
                    } else if (i == 1) {
                        ytk0Var = (ytk0) aVar.L$2;
                        lsrVar = (lsr) aVar.L$1;
                        utk0Var = (utk0) aVar.L$0;
                        kotlin.a.a(obj2);
                    } else if (i == 2) {
                        Object obj3 = aVar.L$4;
                        eyxVar = (eyx) aVar.L$3;
                        ytk0Var = (ytk0) aVar.L$2;
                        lsrVar2 = (lsr) aVar.L$1;
                        utk0Var = (utk0) aVar.L$0;
                        kotlin.a.a(obj2);
                        obj = obj3;
                        atomicReference = ytk0Var.a;
                        con0Var = vtk0.a;
                        if (atomicReference.getAndSet(con0Var) == vtk0.b) {
                        }
                        Object obj4 = g.get(utk0Var);
                        if (eyxVar != null) {
                        }
                        if (obj4 == tyx.h) {
                        }
                        aVar.L$0 = utk0Var;
                        aVar.L$1 = lsrVar2;
                        aVar.L$2 = ytk0Var;
                        aVar.L$3 = eyxVar;
                        aVar.L$4 = obj4;
                        aVar.label = 2;
                        if (lsrVar2.emit(t, aVar) == coroutineSingletons) {
                        }
                    } else {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        obj = aVar.L$4;
                        eyxVar = (eyx) aVar.L$3;
                        ytk0Var = (ytk0) aVar.L$2;
                        lsrVar2 = (lsr) aVar.L$1;
                        utk0Var = (utk0) aVar.L$0;
                        kotlin.a.a(obj2);
                        Object obj42 = g.get(utk0Var);
                        if (eyxVar != null && !eyxVar.isActive()) {
                            throw eyxVar.I();
                        }
                        t = obj42 == tyx.h ? null : obj42;
                        aVar.L$0 = utk0Var;
                        aVar.L$1 = lsrVar2;
                        aVar.L$2 = ytk0Var;
                        aVar.L$3 = eyxVar;
                        aVar.L$4 = obj42;
                        aVar.label = 2;
                        if (lsrVar2.emit(t, aVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        obj = obj42;
                        atomicReference = ytk0Var.a;
                        con0Var = vtk0.a;
                        if (atomicReference.getAndSet(con0Var) == vtk0.b) {
                            aVar.L$0 = utk0Var;
                            aVar.L$1 = lsrVar2;
                            aVar.L$2 = ytk0Var;
                            aVar.L$3 = eyxVar;
                            aVar.L$4 = obj;
                            aVar.label = 3;
                            lq9 lq9Var = new lq9(1, s7s0.c(aVar));
                            lq9Var.o();
                            AtomicReference<Object> atomicReference2 = ytk0Var.a;
                            while (true) {
                                if (atomicReference2.compareAndSet(con0Var, lq9Var)) {
                                    break;
                                }
                                if (atomicReference2.get() != con0Var) {
                                    lq9Var.resumeWith(s3q0.a);
                                    break;
                                }
                            }
                            Object n = lq9Var.n();
                            if (n != CoroutineSingletons.COROUTINE_SUSPENDED) {
                            }
                        }
                        Object obj422 = g.get(utk0Var);
                        if (eyxVar != null) {
                            throw eyxVar.I();
                        }
                        if (obj422 == tyx.h) {
                        }
                        aVar.L$0 = utk0Var;
                        aVar.L$1 = lsrVar2;
                        aVar.L$2 = ytk0Var;
                        aVar.L$3 = eyxVar;
                        aVar.L$4 = obj422;
                        aVar.label = 2;
                        if (lsrVar2.emit(t, aVar) == coroutineSingletons) {
                        }
                    }
                    lsrVar2 = lsrVar;
                    eyxVar = (eyx) aVar.getContext().get(eyx.a.b);
                    obj = null;
                    Object obj4222 = g.get(utk0Var);
                    if (eyxVar != null) {
                    }
                    if (obj4222 == tyx.h) {
                    }
                    aVar.L$0 = utk0Var;
                    aVar.L$1 = lsrVar2;
                    aVar.L$2 = ytk0Var;
                    aVar.L$3 = eyxVar;
                    aVar.L$4 = obj4222;
                    aVar.label = 2;
                    if (lsrVar2.emit(t, aVar) == coroutineSingletons) {
                    }
                }
            }
            if (i != 0) {
            }
            lsrVar2 = lsrVar;
            eyxVar = (eyx) aVar.getContext().get(eyx.a.b);
            obj = null;
            Object obj42222 = g.get(utk0Var);
            if (eyxVar != null) {
            }
            if (obj42222 == tyx.h) {
            }
            aVar.L$0 = utk0Var;
            aVar.L$1 = lsrVar2;
            aVar.L$2 = ytk0Var;
            aVar.L$3 = eyxVar;
            aVar.L$4 = obj42222;
            aVar.label = 2;
            if (lsrVar2.emit(t, aVar) == coroutineSingletons) {
            }
        } catch (Throwable th2) {
            th = th2;
        }
        aVar = new a(this, spjVar);
        Object obj22 = aVar.result;
        coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aVar.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [xsna.con0] */
    @Override // xsna.xh50
    public final boolean compareAndSet(T t, T t2) {
        ?? r0 = tyx.h;
        if (t == null) {
            t = r0;
        }
        if (t2 == null) {
            t2 = r0;
        }
        return i(t, t2);
    }

    @Override // xsna.sh50
    public final void d() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // xsna.sh50
    public final boolean e(T t) {
        setValue(t);
        return true;
    }

    @Override // xsna.sh50, xsna.lsr
    public final Object emit(T t, spj<? super s3q0> spjVar) {
        setValue(t);
        return s3q0.a;
    }

    @Override // xsna.th
    public final vh[] f() {
        return new ytk0[2];
    }

    @Override // xsna.xh50, xsna.ttk0
    public final T getValue() {
        con0 con0Var = tyx.h;
        T t = (T) g.get(this);
        if (t == con0Var) {
            return null;
        }
        return t;
    }

    public final boolean i(Object obj, Object obj2) {
        int i;
        Object obj3;
        con0 con0Var;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj4 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !epx.f(obj4, obj)) {
                return false;
            }
            if (epx.f(obj4, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.f;
            if ((i2 & 1) != 0) {
                this.f = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f = i3;
            Object obj5 = this.b;
            s3q0 s3q0Var = s3q0.a;
            while (true) {
                ytk0[] ytk0VarArr = (ytk0[]) obj5;
                if (ytk0VarArr != null) {
                    for (ytk0 ytk0Var : ytk0VarArr) {
                        if (ytk0Var != null) {
                            AtomicReference<Object> atomicReference = ytk0Var.a;
                            while (true) {
                                Object obj6 = atomicReference.get();
                                if (obj6 != null && obj6 != (con0Var = vtk0.b)) {
                                    con0 con0Var2 = vtk0.a;
                                    if (obj6 != con0Var2) {
                                        while (!atomicReference.compareAndSet(obj6, con0Var2)) {
                                            if (atomicReference.get() != obj6) {
                                                break;
                                            }
                                        }
                                        ((lq9) obj6).resumeWith(s3q0.a);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj6, con0Var)) {
                                        if (atomicReference.get() != obj6) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f;
                    if (i == i3) {
                        this.f = i3 + 1;
                        return true;
                    }
                    obj3 = this.b;
                    s3q0 s3q0Var2 = s3q0.a;
                }
                obj5 = obj3;
                i3 = i;
            }
        }
    }

    @Override // xsna.xh50
    public final void setValue(T t) {
        if (t == null) {
            t = (T) tyx.h;
        }
        i(null, t);
    }
}
