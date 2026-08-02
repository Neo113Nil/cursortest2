package xsna;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: AfterLikeTimer.kt */
/* loaded from: classes7.dex */
public final class c71 {
    public final long a;
    public final io.reactivex.rxjava3.core.w b;
    public final AtomicLong c;
    public final AtomicReference<a> d;

    /* compiled from: AfterLikeTimer.kt */
    public static final class a {
        public final long a;
        public final io.reactivex.rxjava3.disposables.c b;
        public final afl0 c;
        public final orj0 d;

        public a(long j, io.reactivex.rxjava3.disposables.c cVar, afl0 afl0Var, orj0 orj0Var) {
            this.a = j;
            this.b = cVar;
            this.c = afl0Var;
            this.d = orj0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b) && this.c.equals(aVar.c) && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Long.hashCode(this.a) * 31)) * 31)) * 31);
        }

        public final String toString() {
            return "Session(token=" + this.a + ", disposableTimer=" + this.b + ", onFinish=" + this.c + ", onStop=" + this.d + ')';
        }
    }

    public c71() {
        io.reactivex.rxjava3.core.w a2 = io.reactivex.rxjava3.schedulers.a.a();
        this.a = 15L;
        this.b = a2;
        this.c = new AtomicLong(0L);
        this.d = new AtomicReference<>(null);
    }

    public final void a() {
        a andSet = this.d.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.b.dispose();
        andSet.d.invoke();
    }
}
