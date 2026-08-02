package xsna;

import android.os.Looper;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import xsna.m0d0;

/* compiled from: EarlyConsumeNonBlockingAsyncPrefetcher.kt */
/* loaded from: classes12.dex */
public final class duo extends m0d0 implements euo {
    public final hg00 e;
    public final long f;
    public final izs<RecyclerView.e0, Boolean> g;
    public final Object h;
    public final LinkedHashMap i;
    public volatile a j;

    /* compiled from: EarlyConsumeNonBlockingAsyncPrefetcher.kt */
    public interface a {

        /* compiled from: EarlyConsumeNonBlockingAsyncPrefetcher.kt */
        /* renamed from: xsna.duo$a$a, reason: collision with other inner class name */
        public static final class C2754a implements a {
            public static final C2754a a = new C2754a();
        }

        /* compiled from: EarlyConsumeNonBlockingAsyncPrefetcher.kt */
        public static final class b implements a {
            public final int a;
            public final int b;

            public b(int i, int i2) {
                this.a = i;
                this.b = i2;
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

            public final String toString() {
                StringBuilder sb = new StringBuilder("StartViewHolderCreation(viewType=");
                sb.append(this.a);
                sb.append(", generation=");
                return vu5.b(sb, this.b, ')');
            }
        }
    }

    /* compiled from: EarlyConsumeNonBlockingAsyncPrefetcher.kt */
    public static final class b {
        public final RecyclerView.e0 a;
        public final int b;

        public b(RecyclerView.e0 e0Var, int i) {
            this.a = e0Var;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ViewHolderCreated(viewHolder=");
            sb.append(this.a);
            sb.append(", generation=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public duo(long j, izs izsVar) {
        super(r0);
        nz3 nz3Var = nz3.a;
        hg00 hg00Var = hg00.a;
        this.e = hg00Var;
        this.f = j;
        this.g = izsVar;
        this.h = new Object();
        this.i = new LinkedHashMap();
        this.j = a.C2754a.a;
    }

    @Override // xsna.euo
    public final RecyclerView.e0 a(int i, int i2, m0d0.a aVar) {
        a aVar2 = this.j;
        synchronized (this.h) {
            if (!(aVar2 instanceof a.b) || ((a.b) aVar2).a != i || i2 != ((a.b) aVar2).b) {
                return f(i2, i, aVar);
            }
            this.h.wait(this.f);
            return f(i2, i, aVar);
        }
    }

    @Override // xsna.m0d0
    public final void c() {
        e(a.C2754a.a);
        synchronized (this.h) {
            this.i.clear();
            s3q0 s3q0Var = s3q0.a;
        }
    }

    @Override // xsna.m0d0
    public final long d(PriorityBlockingQueue priorityBlockingQueue) {
        j0d0 j0d0Var = (j0d0) priorityBlockingQueue.poll();
        while (j0d0Var != null) {
            e(new a.b(j0d0Var.c, j0d0Var.e));
            RecyclerView.e0 b2 = j0d0Var.b.b(j0d0Var.c);
            if (this.g.invoke(b2).booleanValue()) {
                j0d0Var = (j0d0) priorityBlockingQueue.poll();
            } else {
                synchronized (this.h) {
                    try {
                        if (j0d0Var.b.f(j0d0Var)) {
                            LinkedHashMap linkedHashMap = this.i;
                            m0d0.a aVar = j0d0Var.b;
                            Object obj = linkedHashMap.get(aVar);
                            if (obj == null) {
                                obj = new LinkedList();
                                linkedHashMap.put(aVar, obj);
                            }
                            ((Queue) obj).add(new b(b2, j0d0Var.e));
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                e(a.C2754a.a);
                hg00 hg00Var = this.e;
                g4 g4Var = new g4(12, this, j0d0Var);
                hg00Var.getClass();
                if (epx.f(Looper.getMainLooper(), Looper.myLooper())) {
                    g4Var.invoke();
                } else {
                    hg00.b.post(new vk9(g4Var, 6));
                }
                j0d0Var = (j0d0) priorityBlockingQueue.poll();
            }
        }
        return 0L;
    }

    public final void e(a aVar) {
        this.j = aVar;
        if (this.j instanceof a.C2754a) {
            synchronized (this.h) {
                this.h.notifyAll();
                s3q0 s3q0Var = s3q0.a;
            }
        }
    }

    public final RecyclerView.e0 f(int i, int i2, m0d0.a aVar) {
        synchronized (this.h) {
            try {
                Queue queue = (Queue) this.i.get(aVar);
                if (queue == null) {
                    return null;
                }
                Iterator it = queue.iterator();
                while (it.hasNext()) {
                    b bVar = (b) it.next();
                    if (bVar.b != i) {
                        it.remove();
                    } else if (bVar.a.getItemViewType() == i2) {
                        it.remove();
                        return bVar.a;
                    }
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
