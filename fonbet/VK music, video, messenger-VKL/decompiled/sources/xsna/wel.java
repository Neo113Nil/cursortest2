package xsna;

import android.net.Uri;
import android.os.Handler;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* compiled from: DefaultFileLoader.kt */
/* loaded from: classes.dex */
public final class wel implements h9r {
    public final a8r b;
    public final ExecutorService c;
    public final fpz e;
    public final e460 d = new e460();
    public final LinkedHashMap f = new LinkedHashMap();

    /* compiled from: DefaultFileLoader.kt */
    public static final class a {
        public final Future<File> a;
        public final LinkedHashSet b;

        public a(Future future, LinkedHashSet linkedHashSet) {
            this.a = future;
            this.b = linkedHashSet;
        }
    }

    public wel(a8r a8rVar, ExecutorService executorService, cpz cpzVar) {
        this.b = a8rVar;
        this.c = executorService;
        this.e = new fpz(cpzVar);
    }

    @Override // xsna.h9r
    public final File a(final Uri uri, final String str) {
        a aVar;
        Object obj = new Object();
        synchronized (this) {
            try {
                if (!this.f.containsKey(uri)) {
                    this.f.put(uri, new a(this.c.submit(new Callable() { // from class: xsna.vel
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            kbr kbrVar;
                            final Uri uri2 = uri;
                            wel welVar = wel.this;
                            final fpz fpzVar = welVar.e;
                            a8r a8rVar = welVar.b;
                            String str2 = str;
                            File file = a8rVar.get(str2);
                            if (file != null) {
                                return file;
                            }
                            try {
                                kbrVar = a8rVar.a(str2);
                                try {
                                    welVar.d.getClass();
                                    final f460 b = e460.b(uri2, kbrVar);
                                    final File commit = kbrVar.commit();
                                    fpzVar.getClass();
                                    final long length = commit.length();
                                    ((Handler) ((bpn0) fpzVar.b).getValue()).post(new Runnable() { // from class: xsna.epz
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            cpz cpzVar = (cpz) fpz.this.a;
                                            if (cpzVar != null) {
                                                f460 f460Var = b;
                                                cpzVar.b(uri2, commit, length, f460Var.a, f460Var.b, f460Var.c);
                                            }
                                        }
                                    });
                                    kbrVar.close();
                                    return commit;
                                } catch (Throwable th) {
                                    th = th;
                                    if (kbrVar != null) {
                                        try {
                                            kbrVar.X3();
                                        } catch (Throwable th2) {
                                            if (kbrVar != null) {
                                                kbrVar.close();
                                            }
                                            throw th2;
                                        }
                                    }
                                    ((Handler) ((bpn0) fpzVar.b).getValue()).post(new Runnable() { // from class: xsna.dpz
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            cpz cpzVar = (cpz) fpz.this.a;
                                            if (cpzVar != null) {
                                                cpzVar.a(uri2, th);
                                            }
                                        }
                                    });
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                kbrVar = null;
                            }
                        }
                    }), new LinkedHashSet()));
                }
                Object obj2 = this.f.get(uri);
                ((a) obj2).b.add(obj);
                aVar = (a) obj2;
            } catch (Throwable th) {
                throw th;
            }
        }
        try {
            return aVar.a.get();
        } finally {
            c(uri, obj);
        }
    }

    public final synchronized void c(Uri uri, Object obj) {
        a aVar = (a) this.f.get(uri);
        if (aVar == null) {
            return;
        }
        aVar.b.remove(obj);
        if (aVar.b.isEmpty()) {
            aVar.a.cancel(true);
            this.f.remove(uri);
        }
    }
}
