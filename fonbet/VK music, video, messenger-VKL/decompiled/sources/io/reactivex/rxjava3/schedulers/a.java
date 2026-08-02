package io.reactivex.rxjava3.schedulers;

import io.reactivex.rxjava3.core.w;
import io.reactivex.rxjava3.internal.schedulers.f;
import io.reactivex.rxjava3.internal.schedulers.g;
import io.reactivex.rxjava3.internal.schedulers.j;
import io.reactivex.rxjava3.internal.schedulers.k;
import java.util.Objects;
import xsna.lug0;
import xsna.mug0;
import xsna.nug0;

/* compiled from: Schedulers.java */
/* loaded from: classes11.dex */
public final class a {
    public static final w a;
    public static final w b;
    public static final w c;
    public static final w d;

    /* compiled from: Schedulers.java */
    /* renamed from: io.reactivex.rxjava3.schedulers.a$a, reason: collision with other inner class name */
    public static final class C2161a {
        public static final io.reactivex.rxjava3.internal.schedulers.b a = new io.reactivex.rxjava3.internal.schedulers.b();
    }

    /* compiled from: Schedulers.java */
    public static final class b {
        public static final f a = new f();
    }

    /* compiled from: Schedulers.java */
    public static final class c {
        public static final g a = new g();
    }

    /* compiled from: Schedulers.java */
    public static final class d {
        public static final j a = new j();
    }

    static {
        RuntimeException f;
        try {
            j jVar = d.a;
            Objects.requireNonNull(jVar, "Scheduler Supplier result can't be null");
            a = jVar;
            try {
                io.reactivex.rxjava3.internal.schedulers.b bVar = C2161a.a;
                Objects.requireNonNull(bVar, "Scheduler Supplier result can't be null");
                b = bVar;
                try {
                    f fVar = b.a;
                    Objects.requireNonNull(fVar, "Scheduler Supplier result can't be null");
                    c = fVar;
                    int i = k.b;
                    try {
                        g gVar = c.a;
                        Objects.requireNonNull(gVar, "Scheduler Supplier result can't be null");
                        d = gVar;
                    } finally {
                    }
                } finally {
                }
            } finally {
            }
        } finally {
        }
    }

    public static w a() {
        w wVar = b;
        mug0 mug0Var = io.reactivex.rxjava3.plugins.a.b;
        if (mug0Var == null) {
            return wVar;
        }
        try {
            return (w) mug0Var.apply(wVar);
        } catch (Throwable th) {
            throw io.reactivex.rxjava3.internal.util.f.f(th);
        }
    }

    public static w b() {
        w wVar = c;
        lug0 lug0Var = io.reactivex.rxjava3.plugins.a.d;
        if (lug0Var == null) {
            return wVar;
        }
        try {
            return (w) lug0Var.apply(wVar);
        } catch (Throwable th) {
            throw io.reactivex.rxjava3.internal.util.f.f(th);
        }
    }

    public static w c() {
        w wVar = a;
        nug0 nug0Var = io.reactivex.rxjava3.plugins.a.c;
        if (nug0Var == null) {
            return wVar;
        }
        try {
            return (w) nug0Var.apply(wVar);
        } catch (Throwable th) {
            throw io.reactivex.rxjava3.internal.util.f.f(th);
        }
    }
}
