package xsna;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: TopicsSubscriber.java */
/* loaded from: classes.dex */
public final class t9p0 {
    public static final long i = TimeUnit.HOURS.toSeconds(8);
    public static final /* synthetic */ int j = 0;
    public final Context a;
    public final gi20 b;
    public final h3u c;
    public final FirebaseMessaging d;
    public final ScheduledThreadPoolExecutor f;
    public final r9p0 h;
    public final zk3 e = new zk3();
    public boolean g = false;

    public t9p0(FirebaseMessaging firebaseMessaging, gi20 gi20Var, r9p0 r9p0Var, h3u h3uVar, Context context, @NonNull ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.d = firebaseMessaging;
        this.b = gi20Var;
        this.h = r9p0Var;
        this.c = h3uVar;
        this.a = context;
        this.f = scheduledThreadPoolExecutor;
    }

    public static <T> void a(Task<T> task) throws IOException {
        try {
            Tasks.await(task, 30L, TimeUnit.SECONDS);
        } catch (InterruptedException | TimeoutException e) {
            throw new IOException("SERVICE_NOT_AVAILABLE", e);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                throw ((IOException) cause);
            }
            if (!(cause instanceof RuntimeException)) {
                throw new IOException(e2);
            }
            throw ((RuntimeException) cause);
        }
    }

    public final void b(String str) throws IOException {
        String a = this.d.a();
        h3u h3uVar = this.c;
        h3uVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        a(h3uVar.a(h3uVar.c(a, "/topics/" + str, bundle)));
    }

    public final void c(String str) throws IOException {
        String a = this.d.a();
        h3u h3uVar = this.c;
        h3uVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("gcm.topic", "/topics/" + str);
        bundle.putString("delete", "1");
        a(h3uVar.a(h3uVar.c(a, "/topics/" + str, bundle)));
    }

    public final synchronized void d(boolean z) {
        this.g = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0045 A[Catch: IOException -> 0x002e, TRY_LEAVE, TryCatch #4 {IOException -> 0x002e, blocks: (B:8:0x0013, B:62:0x0041, B:63:0x0045, B:64:0x0024, B:67:0x0031), top: B:7:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e() throws IOException {
        m9p0 a;
        char c;
        r9p0 r9p0Var;
        while (true) {
            synchronized (this) {
                try {
                    a = this.h.a();
                    if (a == null) {
                        return true;
                    }
                } finally {
                }
            }
            try {
                String str = a.b;
                String str2 = a.a;
                int hashCode = str.hashCode();
                if (hashCode != 83) {
                    if (hashCode == 85 && str.equals("U")) {
                        c = 1;
                        if (c != 0) {
                            b(str2);
                        } else if (c == 1) {
                            c(str2);
                        }
                        r9p0Var = this.h;
                        synchronized (r9p0Var) {
                            raj0 raj0Var = r9p0Var.a;
                            String str3 = a.c;
                            synchronized (raj0Var.d) {
                                if (raj0Var.d.remove(str3)) {
                                    raj0Var.e.execute(new w29(raj0Var, 8));
                                }
                            }
                        }
                        synchronized (this.e) {
                            try {
                                String str4 = a.c;
                                if (this.e.containsKey(str4)) {
                                    ArrayDeque arrayDeque = (ArrayDeque) this.e.get(str4);
                                    TaskCompletionSource taskCompletionSource = (TaskCompletionSource) arrayDeque.poll();
                                    if (taskCompletionSource != null) {
                                        taskCompletionSource.setResult(null);
                                    }
                                    if (arrayDeque.isEmpty()) {
                                        this.e.remove(str4);
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    r9p0Var = this.h;
                    synchronized (r9p0Var) {
                    }
                } else {
                    if (str.equals("S")) {
                        c = 0;
                        if (c != 0) {
                        }
                        r9p0Var = this.h;
                        synchronized (r9p0Var) {
                        }
                    }
                    c = 65535;
                    if (c != 0) {
                    }
                    r9p0Var = this.h;
                    synchronized (r9p0Var) {
                    }
                }
            } catch (IOException e) {
                if ("SERVICE_NOT_AVAILABLE".equals(e.getMessage()) || "INTERNAL_SERVER_ERROR".equals(e.getMessage())) {
                    Log.e("FirebaseMessaging", "Topic operation failed: " + e.getMessage() + ". Will retry Topic operation.");
                } else {
                    if (e.getMessage() != null) {
                        throw e;
                    }
                    Log.e("FirebaseMessaging", "Topic operation failed without exception message. Will retry Topic operation.");
                }
                return false;
            }
        }
    }

    public final void f(long j2) {
        this.f.schedule(new u9p0(this, this.a, this.b, Math.min(Math.max(30L, 2 * j2), i)), j2, TimeUnit.SECONDS);
        d(true);
    }
}
