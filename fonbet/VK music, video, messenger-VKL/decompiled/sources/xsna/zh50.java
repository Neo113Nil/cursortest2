package xsna;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import xsna.dy5;

/* compiled from: MutableSubject.kt */
/* loaded from: classes9.dex */
public final class zh50<T> {
    public final Object a = new Object();
    public final sk3<T> b = new sk3<>();
    public final CopyOnWriteArraySet<am8<T>> c = new CopyOnWriteArraySet<>();
    public final zl8<T> d = new zl8<>(new wou(this), 128, null);

    /* compiled from: MutableSubject.kt */
    public final class a extends wn4 {
        public final dy5.a a;

        /* compiled from: MutableSubject.kt */
        /* renamed from: xsna.zh50$a$a, reason: collision with other inner class name */
        public static final class C4179a implements hgn {
            public final AtomicBoolean b = new AtomicBoolean();
            public final AtomicReference<am8<T>> c = new AtomicReference<>(null);
            public final /* synthetic */ zh50<T> d;

            public C4179a(zh50<T> zh50Var) {
                this.d = zh50Var;
            }

            @Override // xsna.hgn
            public final void dispose() {
                am8<T> andSet;
                if (!this.b.compareAndSet(false, true) || (andSet = this.c.getAndSet(null)) == null) {
                    return;
                }
                andSet.dispose();
                this.d.c.remove(andSet);
            }
        }

        public a(dy5.a aVar) {
            this.a = aVar;
        }

        @Override // xsna.wn4
        public final void r(vq70<T> vq70Var) {
            am8<T> a;
            am8<T> andSet;
            C4179a c4179a = new C4179a(zh50.this);
            vq70Var.a(c4179a);
            zh50<T> zh50Var = zh50.this;
            zh50Var.getClass();
            synchronized (zh50Var.a) {
                a = bm8.a(this.a, vq70Var, null);
                List O0 = j5g.O0(zh50Var.b);
                synchronized (a.e) {
                    try {
                        Iterator<T> it = O0.iterator();
                        while (it.hasNext()) {
                            a.b(it.next());
                        }
                        s3q0 s3q0Var = s3q0.a;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                zh50Var.c.add(a);
            }
            AtomicReference<am8<T>> atomicReference = c4179a.c;
            while (!atomicReference.compareAndSet(null, a) && atomicReference.get() == null) {
            }
            if (c4179a.b.get() && (andSet = c4179a.c.getAndSet(null)) != null) {
                andSet.dispose();
                c4179a.d.c.remove(andSet);
            }
            a.a();
        }
    }

    public final void a(T t) {
        synchronized (this.a) {
            try {
                if (this.b.size() >= 1) {
                    this.b.l();
                }
                this.b.addLast(t);
                s3q0 s3q0Var = s3q0.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.b(t);
        this.d.a();
    }
}
