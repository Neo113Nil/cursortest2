package xsna;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CompletionHandlerException;
import kotlinx.coroutines.JobCancellationException;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.eyx;

/* compiled from: JobSupport.kt */
@ozl
/* loaded from: classes11.dex */
public class pyx implements eyx, pi90 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(pyx.class, Object.class, "_state$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(pyx.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* compiled from: JobSupport.kt */
    public static final class a<T> extends lq9<T> {
        public final pyx j;

        public a(spj<? super T> spjVar, pyx pyxVar) {
            super(1, spjVar);
            this.j = pyxVar;
        }

        @Override // xsna.lq9
        public final Throwable m(pyx pyxVar) {
            Throwable c;
            pyx pyxVar2 = this.j;
            pyxVar2.getClass();
            Object obj = pyx.b.get(pyxVar2);
            return (!(obj instanceof c) || (c = ((c) obj).c()) == null) ? obj instanceof d8i ? ((d8i) obj).a : pyxVar.I() : c;
        }

        @Override // xsna.lq9
        public final String w() {
            return "AwaitContinuation";
        }
    }

    /* compiled from: JobSupport.kt */
    /* loaded from: classes8.dex */
    public static final class b extends jyx {
        public final pyx f;
        public final c g;
        public final s9c h;
        public final Object i;

        public b(pyx pyxVar, c cVar, s9c s9cVar, Object obj) {
            this.f = pyxVar;
            this.g = cVar;
            this.h = s9cVar;
            this.i = obj;
        }

        @Override // xsna.jyx
        public final boolean h() {
            return false;
        }

        @Override // xsna.jyx
        public final void i(Throwable th) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = pyx.b;
            pyx pyxVar = this.f;
            pyxVar.getClass();
            s9c s9cVar = this.h;
            s9c l0 = pyx.l0(s9cVar);
            c cVar = this.g;
            Object obj = this.i;
            if (l0 == null || !pyxVar.t0(cVar, l0, obj)) {
                cVar.b.c(new gez(2), 2);
                s9c l02 = pyx.l0(s9cVar);
                if (l02 == null || !pyxVar.t0(cVar, l02, obj)) {
                    pyxVar.C(pyxVar.W(cVar, obj));
                }
            }
        }
    }

    /* compiled from: JobSupport.kt */
    public static final class c implements atw {
        public static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");
        public static final /* synthetic */ AtomicReferenceFieldUpdater e = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;
        public final b570 b;

        public c(b570 b570Var, Throwable th) {
            this.b = b570Var;
            this._rootCause$volatile = th;
        }

        public final void a(Throwable th) {
            Throwable c2 = c();
            if (c2 == null) {
                d.set(this, th);
                return;
            }
            if (th == c2) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(rqi.c(obj, "State is "));
                }
                ((ArrayList) obj).add(th);
            } else {
                if (th == obj) {
                    return;
                }
                ArrayList arrayList = new ArrayList(4);
                arrayList.add(obj);
                arrayList.add(th);
                atomicReferenceFieldUpdater.set(this, arrayList);
            }
        }

        @Override // xsna.atw
        public final b570 b() {
            return this.b;
        }

        public final Throwable c() {
            return (Throwable) d.get(this);
        }

        public final boolean d() {
            return c() != null;
        }

        public final ArrayList e(Throwable th) {
            ArrayList arrayList;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = e;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(rqi.c(obj, "State is "));
                }
                arrayList = (ArrayList) obj;
            }
            Throwable c2 = c();
            if (c2 != null) {
                arrayList.add(0, c2);
            }
            if (th != null && !th.equals(c2)) {
                arrayList.add(th);
            }
            atomicReferenceFieldUpdater.set(this, tyx.e);
            return arrayList;
        }

        @Override // xsna.atw
        public final boolean isActive() {
            return c() == null;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Finishing[cancelling=");
            sb.append(d());
            sb.append(", completing=");
            sb.append(c.get(this) == 1);
            sb.append(", rootCause=");
            sb.append(c());
            sb.append(", exceptions=");
            sb.append(e.get(this));
            sb.append(", list=");
            sb.append(this.b);
            sb.append(']');
            return sb.toString();
        }
    }

    /* compiled from: JobSupport.kt */
    /* loaded from: classes8.dex */
    public final class d extends jyx {
        public final x8i0<?> f;

        public d(x8i0<?> x8i0Var) {
            this.f = x8i0Var;
        }

        @Override // xsna.jyx
        public final boolean h() {
            return false;
        }

        @Override // xsna.jyx
        public final void i(Throwable th) {
            pyx pyxVar = pyx.this;
            pyxVar.getClass();
            Object obj = pyx.b.get(pyxVar);
            if (!(obj instanceof d8i)) {
                obj = tyx.d(obj);
            }
            this.f.e(pyxVar, obj);
        }
    }

    /* compiled from: JobSupport.kt */
    /* loaded from: classes8.dex */
    public final class e extends jyx {
        public final x8i0<?> f;

        public e(x8i0<?> x8i0Var) {
            this.f = x8i0Var;
        }

        @Override // xsna.jyx
        public final boolean h() {
            return false;
        }

        @Override // xsna.jyx
        public final void i(Throwable th) {
            this.f.e(pyx.this, s3q0.a);
        }
    }

    /* compiled from: JobSupport.kt */
    @b6l(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, 1005}, m = "invokeSuspend")
    /* loaded from: classes8.dex */
    public static final class f extends RestrictedSuspendLambda implements wzs<ali0<? super eyx>, spj<? super s3q0>, Object> {
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ pyx this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(spj spjVar, pyx pyxVar) {
            super(2, spjVar);
            this.this$0 = pyxVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            f fVar = new f(spjVar, this.this$0);
            fVar.L$0 = obj;
            return fVar;
        }

        @Override // xsna.wzs
        public final Object invoke(ali0<? super eyx> ali0Var, spj<? super s3q0> spjVar) {
            return ((f) create(ali0Var, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x007e, code lost:
        
            if (r4.a(r6, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        
            if (r6.a(r1, r5) == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006b -> B:6:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007e -> B:6:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            b570 b;
            pzz pzzVar;
            qzz qzzVar;
            ali0 ali0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                ali0 ali0Var2 = (ali0) this.L$0;
                pyx pyxVar = this.this$0;
                pyxVar.getClass();
                Object obj2 = pyx.b.get(pyxVar);
                if (obj2 instanceof s9c) {
                    pyx pyxVar2 = ((s9c) obj2).f;
                    this.label = 1;
                } else if ((obj2 instanceof atw) && (b = ((atw) obj2).b()) != null) {
                    pzzVar = b;
                    qzzVar = (qzz) qzz.b.get(b);
                    ali0Var = ali0Var2;
                    if (!epx.f(qzzVar, pzzVar)) {
                    }
                }
            } else if (i == 1) {
                kotlin.a.a(obj);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                qzzVar = (qzz) this.L$2;
                pzzVar = (pzz) this.L$1;
                ali0Var = (ali0) this.L$0;
                kotlin.a.a(obj);
                qzzVar = qzzVar.f();
                if (!epx.f(qzzVar, pzzVar)) {
                    if (qzzVar instanceof s9c) {
                        pyx pyxVar3 = ((s9c) qzzVar).f;
                        this.L$0 = ali0Var;
                        this.L$1 = pzzVar;
                        this.L$2 = qzzVar;
                        this.label = 2;
                    }
                    qzzVar = qzzVar.f();
                    if (!epx.f(qzzVar, pzzVar)) {
                    }
                }
            }
            return s3q0.a;
        }
    }

    public pyx(boolean z) {
        this._state$volatile = z ? tyx.g : tyx.f;
    }

    public static s9c l0(qzz qzzVar) {
        while (qzzVar.g()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = qzz.c;
            qzz d2 = qzzVar.d();
            if (d2 == null) {
                Object obj = atomicReferenceFieldUpdater.get(qzzVar);
                while (true) {
                    qzzVar = (qzz) obj;
                    if (!qzzVar.g()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(qzzVar);
                }
            } else {
                qzzVar = d2;
            }
        }
        while (true) {
            qzzVar = qzzVar.f();
            if (!qzzVar.g()) {
                if (qzzVar instanceof s9c) {
                    return (s9c) qzzVar;
                }
                if (qzzVar instanceof b570) {
                    return null;
                }
            }
        }
    }

    public static String r0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof atw ? ((atw) obj).isActive() ? "Active" : "New" : obj instanceof d8i ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.d() ? "Cancelling" : c.c.get(cVar) == 1 ? "Completing" : "Active";
    }

    @Override // xsna.eyx
    public final ogn E(izs<? super Throwable, s3q0> izsVar) {
        return g0(true, new qsx(izsVar));
    }

    public void G(Object obj) {
        C(obj);
    }

    @Override // xsna.eyx
    public final CancellationException I() {
        CancellationException cancellationException;
        Object obj = b.get(this);
        if (!(obj instanceof c)) {
            if (obj instanceof atw) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (!(obj instanceof d8i)) {
                return new JobCancellationException(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            Throwable th = ((d8i) obj).a;
            cancellationException = th instanceof CancellationException ? (CancellationException) th : null;
            return cancellationException == null ? new JobCancellationException(R(), th, this) : cancellationException;
        }
        Throwable c2 = ((c) obj).c();
        if (c2 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        cancellationException = c2 instanceof CancellationException ? (CancellationException) c2 : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        if (concat == null) {
            concat = R();
        }
        return new JobCancellationException(concat, c2, this);
    }

    public final Object J(spj<Object> spjVar) {
        Object obj;
        do {
            obj = b.get(this);
            if (!(obj instanceof atw)) {
                if (obj instanceof d8i) {
                    throw ((d8i) obj).a;
                }
                return tyx.d(obj);
            }
        } while (q0(obj) < 0);
        a aVar = new a(s7s0.c(spjVar), this);
        aVar.o();
        aVar.s(new xgn(iyx.g(this, new keg0(aVar))));
        Object n = aVar.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003d, code lost:
    
        if (r0 == xsna.tyx.b) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x006a, code lost:
    
        r0 = r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean M(Object obj) {
        con0 con0Var;
        Object obj2 = tyx.a;
        if (b0()) {
            do {
                Object obj3 = b.get(this);
                if (obj3 instanceof atw) {
                    if (obj3 instanceof c) {
                        c cVar = (c) obj3;
                        cVar.getClass();
                        if (c.c.get(cVar) == 1) {
                        }
                    }
                    obj2 = s0(obj3, new d8i(V(obj), false));
                }
                obj2 = tyx.a;
                break;
            } while (obj2 == tyx.c);
        }
        if (obj2 == tyx.a) {
            Throwable th = null;
            while (true) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                Object obj4 = atomicReferenceFieldUpdater.get(this);
                if (!(obj4 instanceof c)) {
                    if (!(obj4 instanceof atw)) {
                        con0Var = tyx.d;
                        break;
                    }
                    if (th == null) {
                        th = V(obj);
                    }
                    atw atwVar = (atw) obj4;
                    if (atwVar.isActive()) {
                        b570 c0 = c0(atwVar);
                        if (c0 != null && jq.i(atomicReferenceFieldUpdater, this, atwVar, new c(c0, th))) {
                            m0(c0, th);
                            con0Var = tyx.a;
                            break;
                        }
                    } else {
                        Object s0 = s0(obj4, new d8i(th, false));
                        if (s0 == tyx.a) {
                            throw new IllegalStateException(rqi.c(obj4, "Cannot happen in "));
                        }
                        if (s0 != tyx.c) {
                            obj2 = s0;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        c cVar2 = (c) obj4;
                        cVar2.getClass();
                        if (c.e.get(cVar2) == tyx.e) {
                            con0Var = tyx.d;
                        } else {
                            boolean d2 = ((c) obj4).d();
                            if (obj != null || !d2) {
                                if (th == null) {
                                    th = V(obj);
                                }
                                ((c) obj4).a(th);
                            }
                            Throwable c2 = d2 ? null : ((c) obj4).c();
                            if (c2 != null) {
                                m0(((c) obj4).b, c2);
                            }
                            con0Var = tyx.a;
                        }
                    }
                }
            }
        }
        if (obj2 != tyx.a && obj2 != tyx.b) {
            if (obj2 == tyx.d) {
                return false;
            }
            C(obj2);
            return true;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // xsna.pi90
    public final CancellationException N() {
        CancellationException cancellationException;
        Object obj = b.get(this);
        if (obj instanceof c) {
            cancellationException = ((c) obj).c();
        } else if (obj instanceof d8i) {
            cancellationException = ((d8i) obj).a;
        } else {
            if (obj instanceof atw) {
                throw new IllegalStateException(rqi.c(obj, "Cannot be cancelling child in this state: "));
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new JobCancellationException("Parent job is ".concat(r0(obj)), cancellationException, this) : cancellationException2;
    }

    public void P(CancellationException cancellationException) {
        M(cancellationException);
    }

    public final boolean Q(Throwable th) {
        if (!h0()) {
            boolean z = th instanceof CancellationException;
            r9c r9cVar = (r9c) c.get(this);
            return (r9cVar == null || r9cVar == t570.b) ? z : r9cVar.a(th) || z;
        }
        return true;
    }

    public String R() {
        return "Job was cancelled";
    }

    public boolean S(Throwable th) {
        if (th instanceof CancellationException) {
            return true;
        }
        return M(th) && Z();
    }

    public final void U(atw atwVar, Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        r9c r9cVar = (r9c) atomicReferenceFieldUpdater.get(this);
        if (r9cVar != null) {
            r9cVar.dispose();
            atomicReferenceFieldUpdater.set(this, t570.b);
        }
        CompletionHandlerException completionHandlerException = null;
        d8i d8iVar = obj instanceof d8i ? (d8i) obj : null;
        Throwable th = d8iVar != null ? d8iVar.a : null;
        if (atwVar instanceof jyx) {
            try {
                ((jyx) atwVar).i(th);
                return;
            } catch (Throwable th2) {
                e0(new CompletionHandlerException("Exception in completion handler " + atwVar + " for " + this, th2));
                return;
            }
        }
        b570 b2 = atwVar.b();
        if (b2 != null) {
            b2.c(new gez(1), 1);
            for (qzz qzzVar = (qzz) qzz.b.get(b2); !epx.f(qzzVar, b2); qzzVar = qzzVar.f()) {
                if (qzzVar instanceof jyx) {
                    try {
                        ((jyx) qzzVar).i(th);
                    } catch (Throwable th3) {
                        if (completionHandlerException != null) {
                            mnh0.d(completionHandlerException, th3);
                        } else {
                            completionHandlerException = new CompletionHandlerException("Exception in completion handler " + qzzVar + " for " + this, th3);
                            s3q0 s3q0Var = s3q0.a;
                        }
                    }
                }
            }
            if (completionHandlerException != null) {
                e0(completionHandlerException);
            }
        }
    }

    public final Throwable V(Object obj) {
        if (!(obj == null ? true : obj instanceof Throwable)) {
            return ((pi90) obj).N();
        }
        Throwable th = (Throwable) obj;
        return th == null ? new JobCancellationException(R(), null, this) : th;
    }

    public final Object W(c cVar, Object obj) {
        Throwable Y;
        d8i d8iVar = obj instanceof d8i ? (d8i) obj : null;
        Throwable th = d8iVar != null ? d8iVar.a : null;
        synchronized (cVar) {
            cVar.d();
            ArrayList<Throwable> e2 = cVar.e(th);
            Y = Y(cVar, e2);
            if (Y != null && e2.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(e2.size()));
                for (Throwable th2 : e2) {
                    if (th2 != Y && th2 != Y && !(th2 instanceof CancellationException) && newSetFromMap.add(th2)) {
                        mnh0.d(Y, th2);
                    }
                }
            }
        }
        if (Y != null && Y != th) {
            obj = new d8i(Y, false);
        }
        if (Y != null && (Q(Y) || d0(Y))) {
            d8i d8iVar2 = (d8i) obj;
            d8iVar2.getClass();
            d8i.b.compareAndSet(d8iVar2, 0, 1);
        }
        n0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        Object ctwVar = obj instanceof atw ? new ctw((atw) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, ctwVar) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        U(cVar, obj);
        return obj;
    }

    public final Object X() {
        Object obj = b.get(this);
        if (obj instanceof atw) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof d8i) {
            throw ((d8i) obj).a;
        }
        return tyx.d(obj);
    }

    public final Throwable Y(c cVar, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (cVar.d()) {
                return new JobCancellationException(R(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th = (Throwable) obj;
        if (th != null) {
            return th;
        }
        Throwable th2 = (Throwable) arrayList.get(0);
        if (th2 instanceof TimeoutCancellationException) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th3 = (Throwable) next;
                if (th3 != th2 && (th3 instanceof TimeoutCancellationException)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th4 = (Throwable) obj2;
            if (th4 != null) {
                return th4;
            }
        }
        return th2;
    }

    public boolean Z() {
        return true;
    }

    public final a7i0 a0() {
        qyx qyxVar = qyx.b;
        ttp0.d(3, qyxVar);
        ryx ryxVar = ryx.b;
        ttp0.d(3, ryxVar);
        return new a7i0(this, qyxVar, ryxVar);
    }

    @Override // xsna.eyx
    public void b(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new JobCancellationException(R(), null, this);
        }
        P(cancellationException);
    }

    public boolean b0() {
        return this instanceof o7i;
    }

    @Override // xsna.eyx
    public final ogn c(boolean z, boolean z2, ic1 ic1Var) {
        return g0(z2, z ? new psx(ic1Var) : new qsx(ic1Var));
    }

    public final b570 c0(atw atwVar) {
        b570 b2 = atwVar.b();
        if (b2 != null) {
            return b2;
        }
        if (atwVar instanceof nep) {
            return new b570();
        }
        if (atwVar instanceof jyx) {
            p0((jyx) atwVar);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + atwVar).toString());
    }

    public boolean d0(Throwable th) {
        return false;
    }

    public final void f0(eyx eyxVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
        t570 t570Var = t570.b;
        if (eyxVar == null) {
            atomicReferenceFieldUpdater.set(this, t570Var);
            return;
        }
        eyxVar.start();
        r9c i = eyxVar.i(this);
        atomicReferenceFieldUpdater.set(this, i);
        if (m()) {
            i.dispose();
            atomicReferenceFieldUpdater.set(this, t570Var);
        }
    }

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [xsna.isw] */
    public final ogn g0(boolean z, jyx jyxVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        t570 t570Var;
        boolean z2;
        boolean c2;
        jyxVar.e = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = b;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z3 = obj instanceof nep;
            t570Var = t570.b;
            z2 = true;
            if (!z3) {
                if (!(obj instanceof atw)) {
                    z2 = false;
                    break;
                }
                atw atwVar = (atw) obj;
                b570 b2 = atwVar.b();
                if (b2 == null) {
                    p0((jyx) obj);
                } else {
                    if (jyxVar.h()) {
                        c cVar = atwVar instanceof c ? (c) atwVar : null;
                        Throwable c3 = cVar != null ? cVar.c() : null;
                        if (c3 == null) {
                            c2 = b2.c(jyxVar, 5);
                        } else if (z) {
                            jyxVar.i(c3);
                            return t570Var;
                        }
                    } else {
                        c2 = b2.c(jyxVar, 1);
                    }
                    if (c2) {
                        break;
                    }
                }
            } else {
                nep nepVar = (nep) obj;
                if (nepVar.b) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, jyxVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                b570 b570Var = new b570();
                if (!nepVar.b) {
                    b570Var = new isw(b570Var);
                }
                kq.f(atomicReferenceFieldUpdater, this, nepVar, b570Var);
            }
        }
        if (z2) {
            return jyxVar;
        }
        if (z) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            d8i d8iVar = obj2 instanceof d8i ? (d8i) obj2 : null;
            jyxVar.i(d8iVar != null ? d8iVar.a : null);
        }
        return t570Var;
    }

    @Override // kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.d.b
    public final d.c<?> getKey() {
        return eyx.a.b;
    }

    public boolean h(Object obj) {
        return i0(obj);
    }

    public boolean h0() {
        return this instanceof sf7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x007d, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [xsna.isw] */
    @Override // xsna.eyx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final r9c i(pyx pyxVar) {
        s9c s9cVar = new s9c(pyxVar);
        s9cVar.e = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof nep) {
                nep nepVar = (nep) obj;
                if (nepVar.b) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, s9cVar)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                b570 b570Var = new b570();
                if (!nepVar.b) {
                    b570Var = new isw(b570Var);
                }
                kq.f(atomicReferenceFieldUpdater, this, nepVar, b570Var);
            } else {
                boolean z = obj instanceof atw;
                t570 t570Var = t570.b;
                if (!z) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    d8i d8iVar = obj2 instanceof d8i ? (d8i) obj2 : null;
                    s9cVar.i(d8iVar != null ? d8iVar.a : null);
                    return t570Var;
                }
                b570 b2 = ((atw) obj).b();
                if (b2 == null) {
                    p0((jyx) obj);
                } else if (!b2.c(s9cVar, 7)) {
                    boolean c2 = b2.c(s9cVar, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof c) {
                        r4 = ((c) obj3).c();
                    } else {
                        d8i d8iVar2 = obj3 instanceof d8i ? (d8i) obj3 : null;
                        if (d8iVar2 != null) {
                            r4 = d8iVar2.a;
                        }
                    }
                    s9cVar.i(r4);
                    if (c2) {
                        break loop0;
                    }
                    return t570Var;
                }
            }
        }
    }

    public final boolean i0(Object obj) {
        Object s0;
        do {
            s0 = s0(b.get(this), obj);
            if (s0 == tyx.a) {
                return false;
            }
            if (s0 == tyx.b) {
                return true;
            }
        } while (s0 == tyx.c);
        C(s0);
        return true;
    }

    @Override // xsna.eyx
    public boolean isActive() {
        Object obj = b.get(this);
        return (obj instanceof atw) && ((atw) obj).isActive();
    }

    @Override // xsna.eyx
    public final boolean isCancelled() {
        Object obj = b.get(this);
        if (obj instanceof d8i) {
            return true;
        }
        return (obj instanceof c) && ((c) obj).d();
    }

    public final Object j0(Object obj) {
        Object s0;
        do {
            s0 = s0(b.get(this), obj);
            if (s0 == tyx.a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                d8i d8iVar = obj instanceof d8i ? (d8i) obj : null;
                throw new IllegalStateException(str, d8iVar != null ? d8iVar.a : null);
            }
        } while (s0 == tyx.c);
        return s0;
    }

    public String k0() {
        return getClass().getSimpleName();
    }

    @Override // xsna.eyx
    public final boolean m() {
        return !(b.get(this) instanceof atw);
    }

    public final void m0(b570 b570Var, Throwable th) {
        b570Var.c(new gez(4), 4);
        CompletionHandlerException completionHandlerException = null;
        for (qzz qzzVar = (qzz) qzz.b.get(b570Var); !epx.f(qzzVar, b570Var); qzzVar = qzzVar.f()) {
            if ((qzzVar instanceof jyx) && ((jyx) qzzVar).h()) {
                try {
                    ((jyx) qzzVar).i(th);
                } catch (Throwable th2) {
                    if (completionHandlerException != null) {
                        mnh0.d(completionHandlerException, th2);
                    } else {
                        completionHandlerException = new CompletionHandlerException("Exception in completion handler " + qzzVar + " for " + this, th2);
                        s3q0 s3q0Var = s3q0.a;
                    }
                }
            }
        }
        if (completionHandlerException != null) {
            e0(completionHandlerException);
        }
        Q(th);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(d.c<?> cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // xsna.eyx
    public final uki0<eyx> n() {
        return new bli0(new f(null, this));
    }

    public Object o() {
        return X();
    }

    public final void p0(jyx jyxVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        b570 b570Var = new b570();
        jyxVar.getClass();
        qzz.c.set(b570Var, jyxVar);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = qzz.b;
        atomicReferenceFieldUpdater2.set(b570Var, jyxVar);
        loop0: while (true) {
            if (atomicReferenceFieldUpdater2.get(jyxVar) == jyxVar) {
                while (!atomicReferenceFieldUpdater2.compareAndSet(jyxVar, jyxVar, b570Var)) {
                    if (atomicReferenceFieldUpdater2.get(jyxVar) != jyxVar) {
                        break;
                    }
                }
                b570Var.e(jyxVar);
                break loop0;
            }
            break;
        }
        qzz f2 = jyxVar.f();
        do {
            atomicReferenceFieldUpdater = b;
            if (atomicReferenceFieldUpdater.compareAndSet(this, jyxVar, f2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == jyxVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return d.a.a(this, dVar);
    }

    public final int q0(Object obj) {
        boolean z = obj instanceof nep;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
        if (z) {
            if (((nep) obj).b) {
                return 0;
            }
            nep nepVar = tyx.g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, nepVar)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            o0();
            return 1;
        }
        if (!(obj instanceof isw)) {
            return 0;
        }
        b570 b570Var = ((isw) obj).b;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b570Var)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        o0();
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final Object s0(Object obj, Object obj2) {
        if (!(obj instanceof atw)) {
            return tyx.a;
        }
        if (((obj instanceof nep) || (obj instanceof jyx)) && !(obj instanceof s9c) && !(obj2 instanceof d8i)) {
            atw atwVar = (atw) obj;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
            Object ctwVar = obj2 instanceof atw ? new ctw((atw) obj2) : obj2;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, atwVar, ctwVar)) {
                if (atomicReferenceFieldUpdater.get(this) != atwVar) {
                    return tyx.c;
                }
            }
            n0(obj2);
            U(atwVar, obj2);
            return obj2;
        }
        atw atwVar2 = (atw) obj;
        b570 c0 = c0(atwVar2);
        if (c0 == null) {
            return tyx.c;
        }
        c cVar = atwVar2 instanceof c ? (c) atwVar2 : null;
        if (cVar == null) {
            cVar = new c(c0, null);
        }
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        synchronized (cVar) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = c.c;
            if (atomicIntegerFieldUpdater.get(cVar) == 1) {
                return tyx.a;
            }
            atomicIntegerFieldUpdater.set(cVar, 1);
            if (cVar != atwVar2) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = b;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, atwVar2, cVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != atwVar2) {
                        return tyx.c;
                    }
                }
            }
            boolean d2 = cVar.d();
            d8i d8iVar = obj2 instanceof d8i ? (d8i) obj2 : null;
            if (d8iVar != null) {
                cVar.a(d8iVar.a);
            }
            ?? c2 = d2 ? 0 : cVar.c();
            ref$ObjectRef.element = c2;
            s3q0 s3q0Var = s3q0.a;
            if (c2 != 0) {
                m0(c0, c2);
            }
            s9c l0 = l0(c0);
            if (l0 != null && t0(cVar, l0, obj2)) {
                return tyx.b;
            }
            c0.c(new gez(2), 2);
            s9c l02 = l0(c0);
            return (l02 == null || !t0(cVar, l02, obj2)) ? W(cVar, obj2) : tyx.b;
        }
    }

    @Override // xsna.eyx
    public final boolean start() {
        int q0;
        do {
            q0 = q0(b.get(this));
            if (q0 == 0) {
                return false;
            }
        } while (q0 != 1);
        return true;
    }

    public final boolean t0(c cVar, s9c s9cVar, Object obj) {
        do {
            pyx pyxVar = s9cVar.f;
            b bVar = new b(this, cVar, s9cVar, obj);
            if ((pyxVar != null ? pyxVar.g0(false, bVar) : pyxVar.c(false, false, new ic1((jyx) bVar))) != t570.b) {
                return true;
            }
            s9cVar = l0(s9cVar);
        } while (s9cVar != null);
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(k0() + '{' + r0(b.get(this)) + '}');
        sb.append('@');
        sb.append(y6l.a(this));
        return sb.toString();
    }

    @Override // xsna.eyx
    public final Object y(ContinuationImpl continuationImpl) {
        Object obj;
        do {
            obj = b.get(this);
            if (!(obj instanceof atw)) {
                iyx.e(continuationImpl.getContext());
                return s3q0.a;
            }
        } while (q0(obj) < 0);
        lq9 lq9Var = new lq9(1, s7s0.c(continuationImpl));
        lq9Var.o();
        lq9Var.s(new xgn(iyx.g(this, new leg0(lq9Var))));
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (n != coroutineSingletons) {
            n = s3q0.a;
        }
        return n == coroutineSingletons ? n : s3q0.a;
    }

    public void o0() {
    }

    public void C(Object obj) {
    }

    public void e0(CompletionHandlerException completionHandlerException) {
        throw completionHandlerException;
    }

    public void n0(Object obj) {
    }
}
