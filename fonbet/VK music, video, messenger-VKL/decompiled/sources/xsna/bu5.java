package xsna;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: Await.kt */
/* loaded from: classes8.dex */
public final class bu5<T> {
    public static final /* synthetic */ AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(bu5.class, "notCompletedCount$volatile");
    public final zrl<T>[] a;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* compiled from: Await.kt */
    public final class a extends jyx {
        public static final /* synthetic */ AtomicReferenceFieldUpdater i = AtomicReferenceFieldUpdater.newUpdater(a.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;
        public final lq9 f;
        public ogn g;

        public a(lq9 lq9Var) {
            this.f = lq9Var;
        }

        @Override // xsna.jyx
        public final boolean h() {
            return false;
        }

        @Override // xsna.jyx
        public final void i(Throwable th) {
            lq9 lq9Var = this.f;
            if (th != null) {
                lq9Var.getClass();
                con0 C = lq9Var.C(new d8i(th, false), null);
                if (C != null) {
                    lq9Var.D(C);
                    b bVar = (b) i.get(this);
                    if (bVar != null) {
                        bVar.b();
                        return;
                    }
                    return;
                }
                return;
            }
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = bu5.b;
            bu5<T> bu5Var = bu5.this;
            if (atomicIntegerFieldUpdater.decrementAndGet(bu5Var) == 0) {
                zrl<T>[] zrlVarArr = bu5Var.a;
                ArrayList arrayList = new ArrayList(zrlVarArr.length);
                for (zrl<T> zrlVar : zrlVarArr) {
                    arrayList.add(zrlVar.o());
                }
                lq9Var.resumeWith(arrayList);
            }
        }
    }

    /* compiled from: Await.kt */
    public final class b implements mp9 {
        public final bu5<T>.a[] b;

        public b(a[] aVarArr) {
            this.b = aVarArr;
        }

        @Override // xsna.mp9
        public final void a(Throwable th) {
            b();
        }

        public final void b() {
            for (bu5<T>.a aVar : this.b) {
                ogn ognVar = aVar.g;
                if (ognVar == null) {
                    ognVar = null;
                }
                ognVar.dispose();
            }
        }

        public final String toString() {
            return "DisposeHandlersOnCancel[" + this.b + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public bu5(zrl<? extends T>[] zrlVarArr) {
        this.a = zrlVarArr;
        this.notCompletedCount$volatile = zrlVarArr.length;
    }

    public final Object a(spj<? super List<? extends T>> spjVar) {
        lq9 lq9Var = new lq9(1, s7s0.c(spjVar));
        lq9Var.o();
        zrl<T>[] zrlVarArr = this.a;
        int length = zrlVarArr.length;
        a[] aVarArr = new a[length];
        for (int i = 0; i < length; i++) {
            zrl<T> zrlVar = zrlVarArr[i];
            zrlVar.start();
            a aVar = new a(lq9Var);
            aVar.g = iyx.g(zrlVar, aVar);
            s3q0 s3q0Var = s3q0.a;
            aVarArr[i] = aVar;
        }
        b bVar = new b(aVarArr);
        for (int i2 = 0; i2 < length; i2++) {
            a aVar2 = aVarArr[i2];
            aVar2.getClass();
            a.i.set(aVar2, bVar);
        }
        if (lq9Var.t()) {
            bVar.b();
        } else {
            lq9Var.s(bVar);
        }
        Object n = lq9Var.n();
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        return n;
    }
}
