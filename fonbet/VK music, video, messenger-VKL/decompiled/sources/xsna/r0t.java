package xsna;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import xsna.snw;
import xsna.ub9;

/* compiled from: Futures.java */
/* loaded from: classes11.dex */
public final class r0t {

    /* compiled from: Futures.java */
    public static final class b<V> implements Runnable {
        public final Future<V> b;
        public final o0t<? super V> c;

        public b(ugz ugzVar, o0t o0tVar) {
            this.b = ugzVar;
            this.c = o0tVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            o0t<? super V> o0tVar = this.c;
            try {
                o0tVar.onSuccess((Object) r0t.b(this.b));
            } catch (Error e) {
                e = e;
                o0tVar.onFailure(e);
            } catch (RuntimeException e2) {
                e = e2;
                o0tVar.onFailure(e);
            } catch (ExecutionException e3) {
                o0tVar.onFailure(e3.getCause());
            }
        }

        public final String toString() {
            return b.class.getSimpleName() + StringUtils.COMMA + this.c;
        }
    }

    public static <V> void a(@NonNull ugz<V> ugzVar, @NonNull o0t<? super V> o0tVar, @NonNull Executor executor) {
        o0tVar.getClass();
        ugzVar.addListener(new b(ugzVar, o0tVar), executor);
    }

    @Nullable
    public static <V> V b(@NonNull Future<V> future) throws ExecutionException {
        obr.f("Future was expected to be done, " + future, future.isDone());
        return (V) c(future);
    }

    @Nullable
    public static <V> V c(@NonNull Future<V> future) throws ExecutionException {
        V v;
        boolean z = false;
        while (true) {
            try {
                v = future.get();
                break;
            } catch (InterruptedException unused) {
                z = true;
            } catch (Throwable th) {
                if (z) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
        return v;
    }

    @NonNull
    public static snw.c d(@Nullable Object obj) {
        return obj == null ? snw.c.c : new snw.c(obj);
    }

    @NonNull
    public static <V> ugz<V> e(@NonNull ugz<V> ugzVar) {
        ugzVar.getClass();
        return ugzVar.isDone() ? ugzVar : ub9.a(new ft0(ugzVar, 27));
    }

    public static void f(boolean z, @NonNull ugz ugzVar, @NonNull ub9.a aVar, @NonNull mzm mzmVar) {
        ugzVar.getClass();
        mzmVar.getClass();
        a(ugzVar, new s0t(aVar), mzmVar);
        if (z) {
            aVar.a(new t0t(ugzVar), xo9.g());
        }
    }

    @NonNull
    public static ora g(@NonNull ugz ugzVar, @NonNull iy3 iy3Var, @NonNull Executor executor) {
        ora oraVar = new ora(iy3Var, ugzVar);
        ugzVar.addListener(oraVar, executor);
        return oraVar;
    }

    /* compiled from: Futures.java */
    public class a implements f0t<Object, Object> {
        @Override // xsna.f0t
        public final Object apply(Object obj) {
            return obj;
        }
    }
}
