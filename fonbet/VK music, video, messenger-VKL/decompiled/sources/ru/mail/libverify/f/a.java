package ru.mail.libverify.f;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import ru.mail.libverify.api.common.Status;
import ru.mail.libverify.f.c;
import ru.mail.libverify.m.e;
import ru.mail.libverify.requests.f;
import ru.mail.libverify.u.w;
import ru.mail.verify.core.utils.ClientException;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.ServerException;
import ru.mail.verify.core.utils.components.MessageBus;

/* loaded from: classes9.dex */
final class a {

    @NonNull
    private final w a;

    @NonNull
    private final b b;
    private final Object c = new Object();
    private final Runnable d = new Runnable() { // from class: ru.mail.libverify.f.e
        @Override // java.lang.Runnable
        public final void run() {
            a.this.a();
        }
    };

    @NonNull
    private final MessageBus e;

    @Nullable
    private Future<?> f;

    public a(@NonNull w wVar, @NonNull b bVar, @NonNull ru.mail.libverify.c.b bVar2) {
        this.a = wVar;
        this.b = bVar;
        this.e = bVar2.a();
    }

    public final void b() {
        Future<?> future = this.f;
        if (future != null) {
            future.cancel(true);
            try {
                this.f.get();
            } catch (Exception unused) {
                FileLog.d("FetcherExecutor", "fetcher thread stopped");
            }
            this.f = null;
        }
        c();
    }

    public final void c() {
        FileLog.d("FetcherExecutor", "fetcher thread start requested, future %s", this.f);
        if (this.f == null) {
            this.f = ((c.b) this.b).a().b().submit(this.d);
        }
    }

    public final void d() {
        FileLog.d("FetcherExecutor", "fetcher thread stop requested, future %s", this.f);
        Future<?> future = this.f;
        if (future != null) {
            future.cancel(true);
            try {
                this.f.get();
            } catch (Exception unused) {
                FileLog.d("FetcherExecutor", "fetcher thread stopped");
            }
            this.f = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0267, code lost:
    
        if (r11 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01da, code lost:
    
        if (r11 == null) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x028a, code lost:
    
        if (r6 == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0276, code lost:
    
        if (r6 == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x028c, code lost:
    
        r18.e.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_EXECUTOR_FETCHER_STOPPED, (java.lang.Object) null));
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f5 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a() {
        Future future;
        f fVar;
        ru.mail.libverify.m.e eVar;
        try {
            try {
            } catch (Throwable th) {
                th = th;
                if (!Thread.interrupted() && !r6) {
                    this.e.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_EXECUTOR_FETCHER_STOPPED, (Object) null));
                }
                throw th;
            }
        } catch (InterruptedException e) {
            e = e;
        } catch (Exception e2) {
            e = e2;
            r6 = false;
        } catch (Throwable th2) {
            th = th2;
            r6 = false;
            if (!Thread.interrupted()) {
                this.e.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_EXECUTOR_FETCHER_STOPPED, (Object) null));
            }
            throw th;
        }
        if (!a(0)) {
            if (Thread.interrupted()) {
                return;
            }
            this.e.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_EXECUTOR_FETCHER_STOPPED, (Object) null));
            return;
        }
        this.e.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_EXECUTOR_FETCHER_STARTED, (Object) null));
        FileLog.d("FetcherExecutor", "fetch loop started");
        int i = 0;
        while (true) {
            if (!a(i)) {
                break;
            }
            long nanoTime = System.nanoTime();
            try {
            } catch (InterruptedException e3) {
                e = e3;
                FileLog.v("FetcherExecutor", "fetch loop exit by interrupt", e);
                Thread.interrupted();
                FileLog.v("FetcherExecutor", "fetch loop stopped");
            } catch (Exception e4) {
                e = e4;
                ru.mail.libverify.n0.b.a("FetcherExecutor", "fetch loop fatal error", e);
                if (!Thread.interrupted()) {
                }
                FileLog.v("FetcherExecutor", "fetch loop stopped");
            }
            try {
                try {
                    FileLog.d("FetcherExecutor", "fetch loop start iteration (%d): url %s last %d", Integer.valueOf(i), ((c.b) this.b).c(), Long.valueOf(((c.b) this.b).e()));
                    w wVar = this.a;
                    String c = ((c.b) this.b).c();
                    Objects.requireNonNull(c, "Illegal fetcherUrl provided");
                    fVar = new f(wVar, c, ((c.b) this.b).e(), ((c.b) this.b).d());
                    try {
                    } catch (ExecutionException e5) {
                        e = e5;
                        future = null;
                    }
                } catch (ExecutionException e6) {
                    e = e6;
                    future = null;
                    fVar = null;
                }
            } catch (IOException e7) {
                e = e7;
                future = null;
            } catch (InterruptedException e8) {
                e = e8;
                future = null;
                FileLog.d("FetcherExecutor", "fetch loop was interrupted", e);
                r6 = true;
                if (future != null) {
                }
                if (!Thread.interrupted()) {
                }
                FileLog.v("FetcherExecutor", "fetch loop stopped");
            } catch (CancellationException e9) {
                e = e9;
                future = null;
                FileLog.d("FetcherExecutor", "fetch loop was interrupted", e);
                r6 = true;
                if (future != null) {
                }
                if (!Thread.interrupted()) {
                }
                FileLog.v("FetcherExecutor", "fetch loop stopped");
            } catch (ClientException e10) {
                e = e10;
                future = null;
            } catch (Exception e11) {
                e = e11;
                future = null;
            } catch (Throwable th3) {
                th = th3;
                future = null;
            }
            if (Thread.interrupted()) {
                throw new InterruptedException("Upper logic interrupted fetch loop");
            }
            future = fVar.a(((c.b) this.b).a().c());
            try {
                try {
                    eVar = (ru.mail.libverify.m.e) future.get();
                } catch (Throwable th4) {
                    th = th4;
                    if (future != null) {
                        future.cancel(true);
                    }
                    throw th;
                }
            } catch (IOException e12) {
                e = e12;
                FileLog.d("FetcherExecutor", "fetch connection problem occurred", e);
                i++;
                if (future != null) {
                    future.cancel(true);
                }
            } catch (InterruptedException e13) {
                e = e13;
                FileLog.d("FetcherExecutor", "fetch loop was interrupted", e);
                r6 = true;
                if (future != null) {
                    future.cancel(true);
                }
                if (!Thread.interrupted()) {
                }
                FileLog.v("FetcherExecutor", "fetch loop stopped");
            } catch (CancellationException e14) {
                e = e14;
                FileLog.d("FetcherExecutor", "fetch loop was interrupted", e);
                r6 = true;
                if (future != null) {
                }
                if (!Thread.interrupted()) {
                }
                FileLog.v("FetcherExecutor", "fetch loop stopped");
            } catch (ExecutionException e15) {
                e = e15;
                Throwable cause = e.getCause();
                if (cause == null) {
                    FileLog.e("FetcherExecutor", "fetch loop was interrupted (bad error)", e);
                    if (future != null) {
                        r6 = false;
                        future.cancel(true);
                        if (!Thread.interrupted()) {
                        }
                        FileLog.v("FetcherExecutor", "fetch loop stopped");
                    }
                    r6 = false;
                    if (!Thread.interrupted()) {
                    }
                    FileLog.v("FetcherExecutor", "fetch loop stopped");
                }
                if (cause instanceof ServerException) {
                    ServerException serverException = (ServerException) cause;
                    if (serverException.a() == 304) {
                        if (fVar != null) {
                            this.e.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_EXECUTOR_UPDATE_CACHE_HEADERS, fVar.m(), fVar.g()));
                        }
                        FileLog.d("FetcherExecutor", "fetch loop iteration ended, go to next", e);
                        i = 0;
                        r6 = future == null ? false : false;
                        future.cancel(true);
                    } else {
                        FileLog.e("FetcherExecutor", "server error received during fetch loop", e);
                        this.e.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_HANDLE_SERVER_FAILURE, fVar, serverException));
                    }
                } else if (cause instanceof IOException) {
                    FileLog.d("FetcherExecutor", "fetch connection problem occurred", e);
                } else {
                    ru.mail.libverify.n0.b.a("FetcherExecutor", "fetch loop was interrupted by error", e);
                }
                i++;
                if (future == null) {
                }
                future.cancel(true);
            } catch (ClientException e16) {
                e = e16;
                ru.mail.libverify.n0.b.a("FetcherExecutor", "fetch loop was interrupted", e);
                if (future != null) {
                    r6 = false;
                    future.cancel(true);
                    if (!Thread.interrupted()) {
                    }
                    FileLog.v("FetcherExecutor", "fetch loop stopped");
                }
                r6 = false;
                if (!Thread.interrupted()) {
                }
                FileLog.v("FetcherExecutor", "fetch loop stopped");
            } catch (Exception e17) {
                e = e17;
                ru.mail.libverify.n0.b.a("FetcherExecutor", "failed to create fetch request", e);
            }
            if (eVar.g() != Status.OK) {
                FileLog.e("FetcherExecutor", "fetcher illegal server response: %s", eVar.g());
                this.e.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_HANDLE_REQUEST_FAILURE, eVar));
                future.cancel(true);
                break;
            }
            for (e.a aVar : eVar.h()) {
                if (aVar.d() != null) {
                    this.e.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_EXECUTOR_SERVER_INFO_RECEIVED, aVar.d()));
                }
                if (!TextUtils.isEmpty(aVar.c()) && !TextUtils.isEmpty(aVar.b())) {
                    this.e.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_EXECUTOR_MESSAGE_RECEIVED, aVar.c(), aVar.b()));
                }
                if (aVar.a() != null) {
                    if (fVar.m() != null) {
                        aVar.a().a(fVar.m().longValue());
                    }
                    aVar.a().a(fVar.g());
                }
                this.e.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_EXECUTOR_UPDATE_FETCHER_INFO, aVar.a()));
            }
            ((c.b) this.b).a(fVar.m());
            ((c.b) this.b).a(fVar.g());
            this.e.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_EXECUTOR_UPDATE_CACHE_HEADERS, fVar.m(), fVar.g()));
            i = (System.nanoTime() - nanoTime) / 1000000 < 1000 ? i + 1 : 0;
            future.cancel(true);
        }
        r6 = false;
        future.cancel(true);
        if (!Thread.interrupted()) {
        }
        FileLog.v("FetcherExecutor", "fetch loop stopped");
    }

    private boolean a(int i) throws InterruptedException {
        if (!((c.b) this.b).f()) {
            FileLog.d("FetcherExecutor", "fetcher start not allowed");
            return false;
        }
        if (i >= 20) {
            FileLog.d("FetcherExecutor", "fetcher request max attempts reached");
            return false;
        }
        boolean a = ((c.b) this.b).a().a();
        if (!a) {
            long j = i;
            long b = (500 * j * j) + ((c.b) this.b).b();
            FileLog.d("FetcherExecutor", "wait timeout %d on attempt (%d)", Long.valueOf(b), Integer.valueOf(i));
            if (b < 0) {
                FileLog.e("FetcherExecutor", "fetcher timeout check failed");
                return false;
            }
            if (b != 0) {
                synchronized (this.c) {
                    try {
                        try {
                            this.c.wait(b);
                        } catch (InterruptedException e) {
                            FileLog.e("FetcherExecutor", "fetcher thread was interrupted");
                            throw e;
                        }
                    } finally {
                    }
                }
            }
        }
        if (!((c.b) this.b).f()) {
            FileLog.d("FetcherExecutor", "fetcher start blocked");
            return false;
        }
        if (!this.a.D().b()) {
            FileLog.d("FetcherExecutor", "fetcher start blocked, no network");
            return false;
        }
        if (a || !this.a.n()) {
            return true;
        }
        FileLog.d("FetcherExecutor", "fetcher start blocked, low battery");
        return false;
    }
}
