package xsna;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* compiled from: Select.kt */
/* loaded from: classes8.dex */
public final class v8i0<R> implements mp9, x8i0, a8x0 {
    public static final /* synthetic */ AtomicReferenceFieldUpdater g = AtomicReferenceFieldUpdater.newUpdater(v8i0.class, Object.class, "state$volatile");
    public final kotlin.coroutines.d b;
    public Object d;
    private volatile /* synthetic */ Object state$volatile = y8i0.a;
    public ArrayList c = new ArrayList(2);
    public int e = -1;
    public Object f = y8i0.d;

    /* compiled from: Select.kt */
    public final class a {
        public final Object a;
        public final yzs<Object, x8i0<?>, Object, s3q0> b;
        public final yzs<Object, Object, Object, Object> c;
        public final Object d;
        public final SuspendLambda e;
        public final yzs<x8i0<?>, Object, Object, yzs<Throwable, Object, kotlin.coroutines.d, s3q0>> f;
        public Object g;
        public int h = -1;

        public a(Object obj, yzs yzsVar, yzs yzsVar2, con0 con0Var, SuspendLambda suspendLambda, yzs yzsVar3) {
            this.a = obj;
            this.b = yzsVar;
            this.c = yzsVar2;
            this.d = con0Var;
            this.e = suspendLambda;
            this.f = yzsVar3;
        }

        public final void a() {
            Object obj = this.g;
            if (obj instanceof n4i0) {
                ((n4i0) obj).h(this.h, v8i0.this.b);
                return;
            }
            ogn ognVar = obj instanceof ogn ? (ogn) obj : null;
            if (ognVar != null) {
                ognVar.dispose();
            }
        }
    }

    public v8i0(kotlin.coroutines.d dVar) {
        this.b = dVar;
    }

    @Override // xsna.mp9
    public final void a(Throwable th) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == y8i0.b) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, y8i0.c)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            ArrayList arrayList = this.c;
            if (arrayList == null) {
                return;
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((a) it.next()).a();
            }
            this.f = y8i0.d;
            this.c = null;
            return;
        }
    }

    @Override // xsna.x8i0
    public final void b(ogn ognVar) {
        this.d = ognVar;
    }

    @Override // xsna.x8i0
    public final void c(Object obj) {
        this.f = obj;
    }

    @Override // xsna.a8x0
    public final void d(n4i0<?> n4i0Var, int i) {
        this.d = n4i0Var;
        this.e = i;
    }

    @Override // xsna.x8i0
    public final boolean e(Object obj, Object obj2) {
        return m(obj, obj2) == 0;
    }

    public final Object f(ContinuationImpl continuationImpl) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        a aVar = (a) atomicReferenceFieldUpdater.get(this);
        Object obj = this.f;
        ArrayList arrayList = this.c;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar2 = (a) it.next();
                if (aVar2 != aVar) {
                    aVar2.a();
                }
            }
            atomicReferenceFieldUpdater.set(this, y8i0.b);
            this.f = y8i0.d;
            this.c = null;
        }
        yzs<Object, Object, Object, Object> yzsVar = aVar.c;
        Object obj2 = aVar.d;
        Object invoke = yzsVar.invoke(aVar.a, obj2, obj);
        h0t h0tVar = aVar.e;
        return obj2 == y8i0.e ? ((izs) h0tVar).invoke(continuationImpl) : ((wzs) h0tVar).invoke(invoke, continuationImpl);
    }

    public final Object g(SuspendLambda suspendLambda) {
        return g.get(this) instanceof a ? f(suspendLambda) : h(suspendLambda);
    }

    @Override // xsna.x8i0
    public final kotlin.coroutines.d getContext() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00cd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(ContinuationImpl continuationImpl) {
        w8i0 w8i0Var;
        int i;
        v8i0<R> v8i0Var;
        if (continuationImpl instanceof w8i0) {
            w8i0Var = (w8i0) continuationImpl;
            int i2 = w8i0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                w8i0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = w8i0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = w8i0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    w8i0Var.L$0 = this;
                    w8i0Var.label = 1;
                    lq9 lq9Var = new lq9(1, s7s0.c(w8i0Var));
                    lq9Var.o();
                    loop0: while (true) {
                        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
                        Object obj2 = atomicReferenceFieldUpdater.get(this);
                        con0 con0Var = y8i0.a;
                        if (obj2 == con0Var) {
                            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, lq9Var)) {
                                if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    break;
                                }
                            }
                            lq9Var.s(this);
                            break loop0;
                        }
                        if (obj2 instanceof List) {
                            while (true) {
                                if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, con0Var)) {
                                    Iterator it = ((Iterable) obj2).iterator();
                                    while (it.hasNext()) {
                                        v8i0<R>.a i3 = i(it.next());
                                        i3.g = null;
                                        i3.h = -1;
                                        k(i3, true);
                                    }
                                } else if (atomicReferenceFieldUpdater.get(this) != obj2) {
                                    break;
                                }
                            }
                        } else {
                            if (!(obj2 instanceof a)) {
                                throw new IllegalStateException(rqi.c(obj2, "unexpected state: "));
                            }
                            s3q0 s3q0Var = s3q0.a;
                            a aVar = (a) obj2;
                            Object obj3 = this.f;
                            yzs<x8i0<?>, Object, Object, yzs<Throwable, Object, kotlin.coroutines.d, s3q0>> yzsVar = aVar.f;
                            lq9Var.F(s3q0Var, yzsVar != null ? yzsVar.invoke(this, aVar.d, obj3) : null);
                        }
                    }
                    Object n = lq9Var.n();
                    if (n != CoroutineSingletons.COROUTINE_SUSPENDED) {
                        n = s3q0.a;
                    }
                    if (n != coroutineSingletons) {
                        v8i0Var = this;
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                v8i0Var = (v8i0) w8i0Var.L$0;
                kotlin.a.a(obj);
                w8i0Var.L$0 = null;
                w8i0Var.label = 2;
                Object f = v8i0Var.f(w8i0Var);
                return f != coroutineSingletons ? coroutineSingletons : f;
            }
        }
        w8i0Var = new w8i0(this, continuationImpl);
        Object obj4 = w8i0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = w8i0Var.label;
        if (i != 0) {
        }
        w8i0Var.L$0 = null;
        w8i0Var.label = 2;
        Object f2 = v8i0Var.f(w8i0Var);
        if (f2 != coroutineSingletons2) {
        }
    }

    public final v8i0<R>.a i(Object obj) {
        ArrayList arrayList = this.c;
        Object obj2 = null;
        if (arrayList == null) {
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((a) next).a == obj) {
                obj2 = next;
                break;
            }
        }
        v8i0<R>.a aVar = (a) obj2;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException(("Clause with object " + obj + " is not found").toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <Q> void j(a7i0 a7i0Var, wzs<? super Q, ? super spj<? super R>, ? extends Object> wzsVar) {
        k(new a(a7i0Var.a, a7i0Var.b, a7i0Var.c, null, (SuspendLambda) wzsVar, a7i0Var.d), false);
    }

    public final void k(v8i0<R>.a aVar, boolean z) {
        ArrayList arrayList;
        Object obj = aVar.a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
        if (atomicReferenceFieldUpdater.get(this) instanceof a) {
            return;
        }
        if (!z && ((arrayList = this.c) == null || !arrayList.isEmpty())) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((a) it.next()).a == obj) {
                    throw new IllegalStateException(cqi.c(obj, "Cannot use select clauses on the same object: ").toString());
                }
            }
        }
        aVar.b.invoke(obj, this, aVar.d);
        if (this.f != y8i0.d) {
            atomicReferenceFieldUpdater.set(this, aVar);
            return;
        }
        if (!z) {
            this.c.add(aVar);
        }
        aVar.g = this.d;
        aVar.h = this.e;
        this.d = null;
        this.e = -1;
    }

    public final TrySelectDetailedResult l(nm8 nm8Var, Object obj) {
        int m = m(nm8Var, obj);
        if (m == 0) {
            return TrySelectDetailedResult.SUCCESSFUL;
        }
        if (m == 1) {
            return TrySelectDetailedResult.REREGISTER;
        }
        if (m == 2) {
            return TrySelectDetailedResult.CANCELLED;
        }
        if (m == 3) {
            return TrySelectDetailedResult.ALREADY_SELECTED;
        }
        throw new IllegalStateException(("Unexpected internal result: " + m).toString());
    }

    public final int m(Object obj, Object obj2) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = g;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (!(obj3 instanceof kq9)) {
                if (epx.f(obj3, y8i0.b) || (obj3 instanceof a)) {
                    return 3;
                }
                if (epx.f(obj3, y8i0.c)) {
                    return 2;
                }
                if (epx.f(obj3, y8i0.a)) {
                    List singletonList = Collections.singletonList(obj);
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, singletonList)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj3) {
                            break;
                        }
                    }
                    return 1;
                }
                if (!(obj3 instanceof List)) {
                    throw new IllegalStateException(rqi.c(obj3, "Unexpected state: "));
                }
                ArrayList v0 = j5g.v0(obj, (Collection) obj3);
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, v0)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                return 1;
            }
            v8i0<R>.a i = i(obj);
            if (i != null) {
                yzs<x8i0<?>, Object, Object, yzs<Throwable, Object, kotlin.coroutines.d, s3q0>> yzsVar = i.f;
                yzs<Throwable, Object, kotlin.coroutines.d, s3q0> invoke = yzsVar != null ? yzsVar.invoke(this, i.d, obj2) : null;
                while (!atomicReferenceFieldUpdater.compareAndSet(this, obj3, i)) {
                    if (atomicReferenceFieldUpdater.get(this) != obj3) {
                        break;
                    }
                }
                kq9 kq9Var = (kq9) obj3;
                this.f = obj2;
                con0 K = kq9Var.K(s3q0.a, invoke);
                if (K == null) {
                    this.f = y8i0.d;
                    return 2;
                }
                kq9Var.D(K);
                return 0;
            }
            continue;
        }
    }
}
