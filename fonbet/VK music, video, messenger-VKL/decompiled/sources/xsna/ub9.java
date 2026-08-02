package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.X3;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import xsna.kh;

/* compiled from: CallbackToFutureAdapter.java */
/* loaded from: classes.dex */
public final class ub9 {

    /* compiled from: CallbackToFutureAdapter.java */
    public static final class a<T> {
        public Object a;
        public d<T> b;
        public z9g0<Void> c = new z9g0<>();
        public boolean d;

        public final void a(@NonNull Runnable runnable, @NonNull Executor executor) {
            z9g0<Void> z9g0Var = this.c;
            if (z9g0Var != null) {
                z9g0Var.addListener(runnable, executor);
            }
        }

        public final boolean b(T t) {
            this.d = true;
            d<T> dVar = this.b;
            boolean z = dVar != null && dVar.c.j(t);
            if (z) {
                this.a = null;
                this.b = null;
                this.c = null;
            }
            return z;
        }

        public final void c() {
            this.d = true;
            d<T> dVar = this.b;
            if (dVar == null || !dVar.c.cancel(true)) {
                return;
            }
            this.a = null;
            this.b = null;
            this.c = null;
        }

        public final boolean d(@NonNull Throwable th) {
            this.d = true;
            d<T> dVar = this.b;
            boolean z = dVar != null && dVar.c.k(th);
            if (z) {
                this.a = null;
                this.b = null;
                this.c = null;
            }
            return z;
        }

        public final void finalize() {
            z9g0<Void> z9g0Var;
            d<T> dVar = this.b;
            if (dVar != null) {
                d.a aVar = dVar.c;
                if (!aVar.isDone()) {
                    aVar.k(new b("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
                }
            }
            if (this.d || (z9g0Var = this.c) == null) {
                return;
            }
            z9g0Var.j(null);
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    /* loaded from: classes11.dex */
    public static final class b extends Throwable {
        public b(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public final synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* compiled from: CallbackToFutureAdapter.java */
    public interface c<T> {
        @Nullable
        Object attachCompleter(@NonNull a<T> aVar) throws Exception;
    }

    /* compiled from: CallbackToFutureAdapter.java */
    public static final class d<T> implements ugz<T> {
        public final WeakReference<a<T>> b;
        public final a c = new a();

        /* compiled from: CallbackToFutureAdapter.java */
        public class a extends kh<T> {
            public a() {
            }

            @Override // xsna.kh
            public final String h() {
                a<T> aVar = d.this.b.get();
                return aVar == null ? "Completer object has been garbage collected, future will fail soon" : tk5.c(new StringBuilder("tag=["), aVar.a, X3.j.e);
            }
        }

        public d(a<T> aVar) {
            this.b = new WeakReference<>(aVar);
        }

        @Override // xsna.ugz
        public final void addListener(@NonNull Runnable runnable, @NonNull Executor executor) {
            this.c.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            a<T> aVar = this.b.get();
            boolean cancel = this.c.cancel(z);
            if (cancel && aVar != null) {
                aVar.a = null;
                aVar.b = null;
                aVar.c.j(null);
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public final T get() throws InterruptedException, ExecutionException {
            return this.c.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.c.b instanceof kh.b;
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.c.isDone();
        }

        public final String toString() {
            return this.c.toString();
        }

        @Override // java.util.concurrent.Future
        public final T get(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return this.c.get(j, timeUnit);
        }
    }

    @NonNull
    public static d a(@NonNull c cVar) {
        a aVar = new a();
        d<T> dVar = new d<>(aVar);
        aVar.b = dVar;
        aVar.a = cVar.getClass();
        try {
            Object attachCompleter = cVar.attachCompleter(aVar);
            if (attachCompleter == null) {
                return dVar;
            }
            aVar.a = attachCompleter;
            return dVar;
        } catch (Exception e) {
            dVar.c.k(e);
            return dVar;
        }
    }
}
