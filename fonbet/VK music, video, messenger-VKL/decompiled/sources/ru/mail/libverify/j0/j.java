package ru.mail.libverify.j0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import xsna.i7;
import xsna.n44;

/* loaded from: classes9.dex */
public final class j<TW> {

    @NonNull
    private final ExecutorService a;

    @Nullable
    private final ru.mail.libverify.p0.b b;

    @NonNull
    private final Callable<TW> c;

    @Nullable
    private final b d;

    @Nullable
    private final c<TW> e;
    private volatile Future<TW> f;

    public class a implements Future<TW> {
        final /* synthetic */ Future a;

        public a(Future future) {
            this.a = future;
        }

        @Override // java.util.concurrent.Future
        public final boolean cancel(boolean z) {
            boolean cancel = this.a.cancel(true);
            b bVar = j.this.d;
            if (bVar != null) {
                bVar.a();
            }
            return cancel;
        }

        @Override // java.util.concurrent.Future
        public final TW get() throws InterruptedException, ExecutionException {
            return (TW) this.a.get();
        }

        @Override // java.util.concurrent.Future
        public final boolean isCancelled() {
            return this.a.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public final boolean isDone() {
            return this.a.isDone();
        }

        @Override // java.util.concurrent.Future
        public final TW get(long j, @NonNull TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
            return (TW) this.a.get(j, timeUnit);
        }
    }

    public interface b {
        void a();
    }

    public interface c<T> {
        void a(@NonNull Future<T> future);
    }

    public j(@NonNull ExecutorService executorService, @Nullable ru.mail.libverify.p0.b bVar, @NonNull Callable callable, @Nullable b bVar2, @Nullable c cVar) {
        this.b = bVar;
        this.a = executorService;
        this.c = callable;
        this.d = bVar2;
        this.e = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b() {
        this.e.a(this.f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object c() throws Exception {
        ru.mail.libverify.p0.b bVar;
        try {
            try {
                return this.c.call();
            } catch (Exception e) {
                throw e;
            }
        } finally {
            if (this.e != null && (bVar = this.b) != null) {
                bVar.post(new n44(this, 10));
            }
        }
    }

    @NonNull
    public final Future<TW> a() {
        this.f = new a(this.a.submit(new i7(this, 5)));
        return this.f;
    }
}
