package xsna;

import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.PriorityBlockingQueue;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cuo;
import xsna.m0d0;

/* compiled from: EarlyConsumeAsyncPrefetcher.kt */
/* loaded from: classes12.dex */
public final class cuo extends m0d0 implements euo {
    public final hg00 e;
    public final long f;
    public final izs<RecyclerView.e0, Boolean> g;
    public final Object h;
    public volatile a i;

    /* compiled from: EarlyConsumeAsyncPrefetcher.kt */
    public interface a {

        /* compiled from: EarlyConsumeAsyncPrefetcher.kt */
        /* renamed from: xsna.cuo$a$a, reason: collision with other inner class name */
        public static final class C2685a implements a {
            public static final C2685a a = new C2685a();

            @Override // xsna.cuo.a
            public final int a() {
                return -1;
            }

            @Override // xsna.cuo.a
            public final int l() {
                return -1;
            }
        }

        /* compiled from: EarlyConsumeAsyncPrefetcher.kt */
        public static final class b implements a {
            public final int a;
            public final int b;

            public b(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            @Override // xsna.cuo.a
            public final int a() {
                return this.b;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.a == bVar.a && this.b == bVar.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            @Override // xsna.cuo.a
            public final int l() {
                return this.a;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("StartViewHolderCreation(viewType=");
                sb.append(this.a);
                sb.append(", generation=");
                return vu5.b(sb, this.b, ')');
            }
        }

        /* compiled from: EarlyConsumeAsyncPrefetcher.kt */
        public static final class c implements a {
            public final int a;
            public final RecyclerView.e0 b;
            public final int c;

            public c(int i, int i2, RecyclerView.e0 e0Var) {
                this.a = i;
                this.b = e0Var;
                this.c = i2;
            }

            @Override // xsna.cuo.a
            public final int a() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && epx.f(this.b, cVar.b) && this.c == cVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
            }

            @Override // xsna.cuo.a
            public final int l() {
                return this.a;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ViewHolderConsumed(viewType=");
                sb.append(this.a);
                sb.append(", viewHolder=");
                sb.append(this.b);
                sb.append(", generation=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: EarlyConsumeAsyncPrefetcher.kt */
        public static final class d implements a {
            public final int a;
            public final RecyclerView.e0 b;
            public final int c;

            public d(int i, int i2, RecyclerView.e0 e0Var) {
                this.a = i;
                this.b = e0Var;
                this.c = i2;
            }

            @Override // xsna.cuo.a
            public final int a() {
                return this.c;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.a == dVar.a && epx.f(this.b, dVar.b) && this.c == dVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
            }

            @Override // xsna.cuo.a
            public final int l() {
                return this.a;
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ViewHolderCreated(viewType=");
                sb.append(this.a);
                sb.append(", viewHolder=");
                sb.append(this.b);
                sb.append(", generation=");
                return vu5.b(sb, this.c, ')');
            }
        }

        int a();

        int l();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cuo(long j, izs izsVar) {
        super(nz3.a);
        hg00 hg00Var = hg00.a;
        this.e = hg00Var;
        this.f = j;
        this.g = izsVar;
        this.h = new Object();
        this.i = a.C2685a.a;
    }

    @Override // xsna.euo
    public final RecyclerView.e0 a(int i, int i2, m0d0.a aVar) {
        a aVar2 = this.i;
        if (aVar2.l() != i || i2 != aVar2.a()) {
            return null;
        }
        if (!(aVar2 instanceof a.b)) {
            if (!(aVar2 instanceof a.d)) {
                return null;
            }
            a.d dVar = (a.d) aVar2;
            e(new a.c(i, i2, dVar.b));
            return dVar.b;
        }
        synchronized (this.h) {
            this.h.wait(this.f);
            s3q0 s3q0Var = s3q0.a;
        }
        a aVar3 = this.i;
        if (!(aVar3 instanceof a.d)) {
            return null;
        }
        a.d dVar2 = (a.d) aVar3;
        if (dVar2.a != i || i2 != dVar2.c) {
            return null;
        }
        e(new a.c(i, i2, dVar2.b));
        return dVar2.b;
    }

    @Override // xsna.m0d0
    public final void c() {
        e(a.C2685a.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v8, types: [T, java.lang.Object] */
    @Override // xsna.m0d0
    public final long d(PriorityBlockingQueue priorityBlockingQueue) {
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.element = priorityBlockingQueue.poll();
        while (true) {
            T t = ref$ObjectRef.element;
            if (t == 0) {
                return 0L;
            }
            j0d0 j0d0Var = (j0d0) t;
            e(new a.b(j0d0Var.c, j0d0Var.e));
            j0d0 j0d0Var2 = (j0d0) ref$ObjectRef.element;
            final RecyclerView.e0 b = j0d0Var2.b.b(j0d0Var2.c);
            if (this.g.invoke(b).booleanValue()) {
                ref$ObjectRef.element = priorityBlockingQueue.poll();
            } else {
                j0d0 j0d0Var3 = (j0d0) ref$ObjectRef.element;
                synchronized (this.h) {
                    try {
                        if (j0d0Var3.b.f(j0d0Var3)) {
                            e(new a.d(j0d0Var3.c, j0d0Var3.e, b));
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                final Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
                hg00 hg00Var = this.e;
                gzs gzsVar = new gzs() { // from class: xsna.buo
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.gzs
                    public final Object invoke() {
                        cuo cuoVar = cuo.this;
                        RecyclerView.e0 e0Var = b;
                        Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                        Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                        cuo.a aVar = cuoVar.i;
                        if ((aVar instanceof cuo.a.d) && epx.f(((cuo.a.d) aVar).b, e0Var)) {
                            j0d0 j0d0Var4 = (j0d0) ref$ObjectRef2.element;
                            if (j0d0Var4.b.a(j0d0Var4)) {
                                ((j0d0) ref$ObjectRef2.element).b.i(e0Var);
                                j0d0 j0d0Var5 = (j0d0) ref$ObjectRef2.element;
                                j0d0Var5.b.e(j0d0Var5, "create");
                                ref$BooleanRef2.element = true;
                            }
                        }
                        cuoVar.e(cuo.a.C2685a.a);
                        return s3q0.a;
                    }
                };
                hg00Var.getClass();
                hg00.a(gzsVar);
                if (ref$BooleanRef.element) {
                    return 0L;
                }
                ref$ObjectRef.element = priorityBlockingQueue.poll();
            }
        }
    }

    public final void e(a aVar) {
        this.i = aVar;
        a aVar2 = this.i;
        if ((aVar2 instanceof a.C2685a) || (aVar2 instanceof a.d)) {
            synchronized (this.h) {
                this.h.notifyAll();
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }
}
