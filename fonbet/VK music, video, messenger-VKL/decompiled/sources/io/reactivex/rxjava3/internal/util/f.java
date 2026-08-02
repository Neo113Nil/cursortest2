package io.reactivex.rxjava3.internal.util;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import xsna.fp;

/* compiled from: ExceptionHelper.java */
/* loaded from: classes11.dex */
public final class f {
    public static final a a = new a("No further exceptions");

    public static boolean a(AtomicReference<Throwable> atomicReference, Throwable th) {
        while (true) {
            Throwable th2 = atomicReference.get();
            if (th2 == a) {
                return false;
            }
            Throwable compositeException = th2 == null ? th : new CompositeException(th2, th);
            while (!atomicReference.compareAndSet(th2, compositeException)) {
                if (atomicReference.get() != th2) {
                    break;
                }
            }
            return true;
        }
    }

    public static NullPointerException b(String str) {
        return new NullPointerException(str.concat(" Null values are generally not allowed in 3.x operators and sources."));
    }

    public static void c(Object obj, String str) {
        if (obj == null) {
            throw b(str);
        }
    }

    public static Throwable d(AtomicReference<Throwable> atomicReference) {
        Throwable th = atomicReference.get();
        a aVar = a;
        return th != aVar ? atomicReference.getAndSet(aVar) : th;
    }

    public static String e(long j, TimeUnit timeUnit) {
        StringBuilder b = fp.b(j, "The source did not signal an event for ", " ");
        b.append(timeUnit.toString().toLowerCase());
        b.append(" and has been terminated.");
        return b.toString();
    }

    public static RuntimeException f(Throwable th) {
        if (th instanceof Error) {
            throw ((Error) th);
        }
        return th instanceof RuntimeException ? (RuntimeException) th : new RuntimeException(th);
    }

    /* compiled from: ExceptionHelper.java */
    public static final class a extends Throwable {
        private static final long serialVersionUID = -4649703670690200604L;

        @Override // java.lang.Throwable
        public final Throwable fillInStackTrace() {
            return this;
        }
    }
}
