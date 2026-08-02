package ru.mail.libverify.j0;

import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import ru.mail.libverify.j0.j;
import ru.mail.libverify.p0.e;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.verify.core.utils.ClientException;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.ServerException;
import ru.mail.verify.core.utils.components.MessageBus;
import ru.mail.verify.core.utils.json.JsonParseException;
import xsna.bqy;
import xsna.tn9;
import xsna.yhy0;

/* loaded from: classes9.dex */
public final class c implements ru.mail.libverify.j0.b, ru.mail.libverify.p0.f {
    private HashMap a;
    private long b = 0;

    @NonNull
    private final ru.mail.libverify.g0.d c;

    @NonNull
    private final ru.mail.libverify.g0.q d;

    @NonNull
    private final KeyValueStorage e;

    @NonNull
    private final MessageBus f;

    @NonNull
    private final ru.mail.libverify.l0.e g;

    @NonNull
    private final bqy<e> h;

    @NonNull
    private final ru.mail.libverify.i0.a i;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ru.mail.libverify.p0.a.values().length];
            a = iArr;
            try {
                iArr[ru.mail.libverify.p0.a.NETWORK_STATE_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ru.mail.libverify.p0.a.API_RESET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(@NonNull ru.mail.libverify.g0.d dVar, @NonNull ru.mail.libverify.g0.q qVar, @NonNull KeyValueStorage keyValueStorage, @NonNull MessageBus messageBus, @NonNull ru.mail.libverify.l0.e eVar, @NonNull bqy<e> bqyVar, @NonNull ru.mail.libverify.i0.a aVar) {
        this.c = dVar;
        this.d = qVar;
        this.e = keyValueStorage;
        this.f = messageBus;
        this.g = eVar;
        this.h = bqyVar;
        this.i = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h() {
        a(false);
    }

    private void i() {
        if (this.a != null) {
            return;
        }
        this.a = new HashMap();
        String value = this.e.getValue("serializable_actions_data");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        try {
            List c = ru.mail.libverify.q0.a.c(value, ru.mail.libverify.j0.a.class);
            Collections.sort(c, new yhy0());
            Iterator it = c.iterator();
            while (it.hasNext()) {
                b bVar = new b(this.h.get(), (ru.mail.libverify.j0.a) it.next());
                this.a.put(bVar.c, bVar);
                this.g.a(bVar, false, 1);
            }
        } catch (Throwable th) {
            ru.mail.libverify.n0.b.a("ActionExecutor", "Failed to read saved items", th);
            HashMap hashMap = this.a;
            if (hashMap == null) {
                return;
            }
            for (b bVar2 : hashMap.values()) {
                Future<?> future = bVar2.d;
                if (future != null) {
                    future.cancel(true);
                    bVar2.d = null;
                    this.g.a(bVar2);
                }
            }
            this.a.clear();
            j();
        }
    }

    private void j() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.values().iterator();
        while (it.hasNext()) {
            ru.mail.libverify.j0.a aVar = ((b) it.next()).a;
            if (aVar.attemptCount <= 10) {
                arrayList.add(aVar);
            }
        }
        try {
            if (arrayList.isEmpty()) {
                this.e.removeValue("serializable_actions_data").commit();
            } else {
                this.e.putValue("serializable_actions_data", ru.mail.libverify.q0.a.f(arrayList)).commit();
            }
        } catch (JsonParseException e) {
            ru.mail.libverify.n0.b.a("ActionExecutor", "failed to save actions", e);
        }
    }

    @Override // ru.mail.libverify.p0.f
    public final boolean handleMessage(@NonNull Message message) {
        int i = a.a[ru.mail.libverify.p0.e.a(message, "ActionExecutor", e.b.NORMAL).ordinal()];
        if (i == 1) {
            if (((Boolean) ru.mail.libverify.p0.e.a(message)).booleanValue()) {
                long nanoTime = System.nanoTime();
                long j = this.b;
                long j2 = (nanoTime - j) / 1000000;
                if (j == 0 || j2 > 10000 || j2 < 0) {
                    a(true);
                } else {
                    FileLog.v("ActionExecutor", "Skip connection change by timeout (diff: %d)", Long.valueOf(j2));
                }
                this.b = nanoTime;
            }
            return true;
        }
        if (i != 2) {
            return false;
        }
        HashMap hashMap = this.a;
        if (hashMap != null) {
            for (b bVar : hashMap.values()) {
                Future<?> future = bVar.d;
                if (future != null) {
                    future.cancel(true);
                    bVar.d = null;
                    this.g.a(bVar);
                }
            }
            this.a.clear();
            j();
        }
        return true;
    }

    @Override // ru.mail.libverify.j0.b
    @NonNull
    public final String a(@NonNull ru.mail.libverify.requests.c cVar) throws UnsupportedEncodingException, NoSuchAlgorithmException, IllegalArgumentException, MalformedURLException, JsonParseException {
        return b(cVar);
    }

    @NonNull
    public final String b(@NonNull ru.mail.libverify.requests.c cVar) throws UnsupportedEncodingException, NoSuchAlgorithmException, IllegalArgumentException, MalformedURLException, JsonParseException {
        i();
        b bVar = new b(this.h.get(), cVar);
        bVar.a.actionTimeout = 0;
        b bVar2 = (b) this.a.get(bVar.c);
        if (bVar2 != null) {
            if (a(bVar2, false)) {
                j();
            }
            if (this.a.containsKey(bVar.c)) {
                FileLog.v("ActionExecutor", "request %s dropped as a duplicate", Integer.valueOf(bVar.c.hashCode()));
                return bVar.c;
            }
        }
        this.a.put(bVar.c, bVar);
        ru.mail.libverify.l0.e eVar = this.g;
        k<?, ?> kVar = bVar.b;
        kVar.getClass();
        eVar.a(bVar, kVar instanceof ru.mail.libverify.requests.j, 1);
        j();
        if (!b(bVar)) {
            this.c.b().postDelayed(new tn9(this, 27), 5000L);
        }
        return bVar.c;
    }

    @Override // ru.mail.libverify.g0.f
    public final void a() {
        this.f.register(Arrays.asList(ru.mail.libverify.p0.a.NETWORK_STATE_CHANGED, ru.mail.libverify.p0.a.API_RESET), this);
        a(false);
    }

    public static class b {

        @NonNull
        final ru.mail.libverify.j0.a a;

        @NonNull
        final k<?, ?> b;

        @NonNull
        final String c;

        @Nullable
        Future<?> d;
        Throwable e;

        public b(@NonNull e eVar, @NonNull ru.mail.libverify.j0.a aVar) throws MalformedURLException, JsonParseException {
            this.a = aVar;
            ru.mail.libverify.requests.c a = eVar.a(aVar);
            this.b = a;
            this.c = a.j();
        }

        public b(@NonNull e eVar, @NonNull ru.mail.libverify.requests.c cVar) throws JsonParseException {
            this.a = eVar.a(cVar);
            this.b = cVar;
            this.c = cVar.j();
        }
    }

    private boolean a(@NonNull final b bVar, boolean z) {
        if (bVar.a.attemptCount > 10) {
            FileLog.d("ActionExecutor", "Action %s dropped by max attempt count", Integer.valueOf(bVar.c.hashCode()));
            this.a.remove(bVar.c);
            this.g.a(bVar);
            j();
            return false;
        }
        long b2 = this.i.b() - bVar.a.lastAttemptTimestamp;
        if (b2 < 0) {
            FileLog.d("ActionExecutor", "Action %s dropped by wrong timestamp", Integer.valueOf(bVar.c.hashCode()));
            this.a.remove(bVar.c);
            this.g.a(bVar);
            j();
            return false;
        }
        long b3 = this.i.b();
        ru.mail.libverify.j0.a aVar = bVar.a;
        long j = b3 - aVar.createdTimestamp;
        int i = aVar.actionTimeout;
        if (i > 0 && i < j) {
            FileLog.d("ActionExecutor", "Action %s dropped by total action timeout", Integer.valueOf(bVar.c.hashCode()));
            this.a.remove(bVar.c);
            this.g.a(bVar);
            j();
            return false;
        }
        if (bVar.d != null) {
            if (!z) {
                return false;
            }
            FileLog.v("ActionExecutor", "Action %s cancelled", Integer.valueOf(bVar.c.hashCode()));
            bVar.d.cancel(true);
            bVar.d = null;
            bVar.a.attemptCount = 0;
        }
        long j2 = bVar.e instanceof ServerException ? 10000L : 5000L;
        long j3 = bVar.a.attemptCount;
        long j4 = j2 * j3 * j3;
        if (b2 <= j4) {
            long j5 = j4 - b2;
            if (i > 0) {
                j5 = Math.min(i - j, j5);
            }
            long j6 = j5 >= 0 ? j5 : 0L;
            FileLog.v("ActionExecutor", "Action %s will be started after %d ms", Integer.valueOf(bVar.c.hashCode()), Long.valueOf(j6));
            this.c.b().postDelayed(new Runnable() { // from class: ru.mail.libverify.j0.o
                @Override // java.lang.Runnable
                public final void run() {
                    c.this.a(bVar);
                }
            }, j6);
            return false;
        }
        FileLog.v("ActionExecutor", "Action %s will be started now as timeout %d ms passed", Integer.valueOf(bVar.c.hashCode()), Long.valueOf(j4));
        return b(bVar);
    }

    private boolean b(@NonNull final b bVar) {
        k<?, ?> kVar = bVar.b;
        kVar.getClass();
        boolean z = (kVar instanceof ru.mail.libverify.requests.d) && bVar.a.attemptCount == 0;
        if (!this.d.b() && !z) {
            FileLog.v("ActionExecutor", "Action %s initialize delayed", Integer.valueOf(bVar.c.hashCode()));
            return false;
        }
        FileLog.v("ActionExecutor", "Start action %s (last start diff: %d, attempt: %d, last error: %s)", Integer.valueOf(bVar.c.hashCode()), Long.valueOf(bVar.a.lastAttemptTimestamp != 0 ? this.i.b() - bVar.a.lastAttemptTimestamp : 0L), Integer.valueOf(bVar.a.attemptCount), bVar.e);
        ru.mail.libverify.j0.a aVar = bVar.a;
        aVar.attemptCount++;
        aVar.lastAttemptTimestamp = this.i.b();
        bVar.d = bVar.b.a(this.c.d(), this.c.b(), new j.c() { // from class: ru.mail.libverify.j0.p
            @Override // ru.mail.libverify.j0.j.c
            public final void a(Future future) {
                c.this.a(bVar, future);
            }
        });
        FileLog.v("ActionExecutor", "Action id %s url %s started (attemptCount %d)", Integer.valueOf(bVar.c.hashCode()), bVar.c, Integer.valueOf(bVar.a.attemptCount));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(b bVar) {
        if (a(bVar, false)) {
            j();
        }
    }

    private void a(boolean z) {
        i();
        Iterator it = new ArrayList(this.a.values()).iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            z2 |= a((b) it.next(), z);
        }
        if (z2) {
            j();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(b bVar, Future future) {
        if (future.isCancelled()) {
            FileLog.v("ActionExecutor", "Future from action %s has been cancelled before", Integer.valueOf(bVar.c.hashCode()));
            return;
        }
        try {
            ru.mail.libverify.k0.a aVar = (ru.mail.libverify.k0.a) future.get();
            FileLog.v("ActionExecutor", "Action %s completed", Integer.valueOf(bVar.c.hashCode()));
            this.f.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SERVER_ACTION_RESULT, aVar));
            this.a.remove(bVar.c);
            this.g.a(bVar);
            j();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                a(bVar, e);
                this.a.remove(bVar.c);
                this.g.a(bVar);
                j();
                return;
            }
            boolean z = cause instanceof ServerException;
            boolean z2 = cause instanceof IOException;
            if (!z && !z2) {
                if (cause instanceof ClientException) {
                    ClientException clientException = (ClientException) cause;
                    if (clientException.a() == ClientException.a.REJECTED_BY_POLICY || clientException.a() == ClientException.a.REJECTED_BY_INTERCEPTOR_ERROR) {
                        FileLog.d("ActionExecutor", e, "Action %s rejected by an application", Integer.valueOf(bVar.c.hashCode()));
                        this.a.remove(bVar.c);
                        this.g.a(bVar);
                        j();
                        return;
                    }
                }
                a(bVar, e);
                this.a.remove(bVar.c);
                this.g.a(bVar);
                j();
                return;
            }
            bVar.d = null;
            bVar.e = cause;
            a(false);
            if (z) {
                FileLog.e("ActionExecutor", e, "Action %s failed by server", Integer.valueOf(bVar.c.hashCode()));
            } else {
                FileLog.d("ActionExecutor", e, "Action %s failed by network", Integer.valueOf(bVar.c.hashCode()));
            }
            this.f.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SERVER_ACTION_FAILURE, bVar.b, cause, Boolean.TRUE));
            if (z2) {
                return;
            }
            FileLog.e("ActionExecutor", cause, "Action %s recoverable error", Integer.valueOf(bVar.c.hashCode()));
            ru.mail.libverify.n0.b.a("ActionExecutor", cause, "Action recoverable error", new Object[0]);
        } catch (Throwable th) {
            a(bVar, th);
            this.a.remove(bVar.c);
            this.g.a(bVar);
            j();
        }
    }

    private void a(@NonNull b bVar, @NonNull Throwable th) {
        this.f.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SERVER_ACTION_FAILURE, bVar.b, th, Boolean.FALSE));
        FileLog.e("ActionExecutor", "Action %s failed", Integer.valueOf(bVar.c.hashCode()));
        ru.mail.libverify.n0.b.a("ActionExecutor", th, "Action failed", new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(ru.mail.libverify.j0.a aVar, ru.mail.libverify.j0.a aVar2) {
        return ru.mail.libverify.n0.e.a(aVar.createdTimestamp, aVar2.createdTimestamp);
    }
}
