package ru.mail.libverify.f;

import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import ru.mail.libverify.m.f;
import ru.mail.libverify.p0.e;
import ru.mail.libverify.p0.f;
import ru.mail.libverify.storage.DecryptionError;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.components.MessageBus;
import ru.mail.verify.core.utils.json.JsonParseException;

/* loaded from: classes9.dex */
public final class c implements f, ru.mail.libverify.g0.f {

    @NonNull
    private final ru.mail.libverify.c.b a;

    @NonNull
    private final d b;

    @NonNull
    private final ru.mail.libverify.f.a c;

    @NonNull
    private final MessageBus d;

    @NonNull
    private final ru.mail.libverify.i0.a e;

    @Nullable
    private ru.mail.libverify.m.f g;

    @NonNull
    private EnumC2196c f = EnumC2196c.NOT_ACTIVE;
    private final AtomicInteger h = new AtomicInteger(0);

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[ru.mail.libverify.p0.a.values().length];
            b = iArr;
            try {
                iArr[ru.mail.libverify.p0.a.FETCHER_EXECUTOR_MESSAGE_RECEIVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[ru.mail.libverify.p0.a.FETCHER_EXECUTOR_SERVER_INFO_RECEIVED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                b[ru.mail.libverify.p0.a.FETCHER_EXECUTOR_FETCHER_STOPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[ru.mail.libverify.p0.a.FETCHER_EXECUTOR_FETCHER_STARTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[ru.mail.libverify.p0.a.FETCHER_EXECUTOR_UPDATE_CACHE_HEADERS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[ru.mail.libverify.p0.a.FETCHER_MANAGER_UPDATE_FETCHER_INFO_INTERNAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[ru.mail.libverify.p0.a.FETCHER_EXECUTOR_UPDATE_FETCHER_INFO.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                b[ru.mail.libverify.p0.a.API_RESET.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                b[ru.mail.libverify.p0.a.VERIFY_API_RESET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr2 = new int[EnumC2196c.values().length];
            a = iArr2;
            try {
                iArr2[EnumC2196c.NOT_ACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[EnumC2196c.SUSPENDED_TEMPORARY.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[EnumC2196c.SUSPENDED_OTHER_SERVICE.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[EnumC2196c.ACTIVE.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    public class b implements ru.mail.libverify.f.b {
        public /* synthetic */ b(c cVar, int i) {
            this();
        }

        @NonNull
        public final d a() {
            return c.this.b;
        }

        public final long b() {
            synchronized (c.this) {
                try {
                    c.this.m();
                    if (!c.this.l()) {
                        return 0L;
                    }
                    long b = c.this.e.b();
                    ru.mail.libverify.m.f fVar = c.this.g;
                    Objects.requireNonNull(fVar);
                    long e = b - fVar.e();
                    if (e > c.this.g.d()) {
                        return 0L;
                    }
                    return c.this.g.d() - e;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Nullable
        public final String c() {
            String str;
            synchronized (c.this) {
                try {
                    c.this.m();
                    if (c.this.l()) {
                        ru.mail.libverify.m.f fVar = c.this.g;
                        Objects.requireNonNull(fVar);
                        str = fVar.f();
                    } else {
                        str = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return str;
        }

        @Nullable
        public final String d() {
            synchronized (c.this) {
                try {
                    c.this.m();
                    if (c.this.l()) {
                        ru.mail.libverify.m.f fVar = c.this.g;
                        return fVar != null ? fVar.a() : null;
                    }
                    FileLog.d("FetcherManager", "no valid fetcher info to get ETag");
                    return null;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final long e() {
            synchronized (c.this) {
                try {
                    c.this.m();
                    if (!c.this.l()) {
                        FileLog.d("FetcherManager", "no valid fetcher info to get timestamp");
                        return 0L;
                    }
                    ru.mail.libverify.m.f fVar = c.this.g;
                    if (fVar != null && fVar.b() != 0) {
                        return c.this.g.b();
                    }
                    FileLog.d("FetcherManager", "no last modified timestamp, use current time");
                    return c.this.g.e();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final boolean f() {
            boolean z;
            synchronized (c.this) {
                try {
                    z = c.this.l() && c.this.f != EnumC2196c.SUSPENDED_OTHER_SERVICE;
                } finally {
                }
            }
            return z;
        }

        private b() {
        }

        public final void a(@Nullable Long l) {
            synchronized (c.this) {
                try {
                    ru.mail.libverify.m.f fVar = c.this.g;
                    if (fVar != null && l != null) {
                        fVar.a(l.longValue());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void a(@Nullable String str) {
            synchronized (c.this) {
                try {
                    ru.mail.libverify.m.f fVar = c.this.g;
                    if (fVar != null) {
                        fVar.a(str);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* renamed from: ru.mail.libverify.f.c$c, reason: collision with other inner class name */
    public enum EnumC2196c {
        NOT_ACTIVE,
        SUSPENDED_TEMPORARY,
        SUSPENDED_OTHER_SERVICE,
        ACTIVE
    }

    public c(@NonNull ru.mail.libverify.c.b bVar, @NonNull d dVar) {
        this.a = bVar;
        this.b = dVar;
        this.d = bVar.a();
        this.c = new ru.mail.libverify.f.a(bVar.e(), new b(this, 0), bVar);
        this.e = bVar.e().u();
    }

    private void i() {
        boolean a2;
        EnumC2196c enumC2196c = EnumC2196c.NOT_ACTIVE;
        synchronized (this) {
            a2 = a(enumC2196c, null, false);
        }
        FileLog.v("FetcherManager", "deactivate fetcher, publish = %s", Boolean.valueOf(a2));
        this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_MANAGER_FETCHER_STOPPED, Boolean.valueOf(a2)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized boolean l() {
        m();
        ru.mail.libverify.m.f fVar = this.g;
        if (fVar != null && fVar.c() == f.b.ENABLED && !TextUtils.isEmpty(this.g.f())) {
            if (this.g.d() >= 0) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        if (this.g != null) {
            return;
        }
        String value = this.a.c().getValue("fetcher_manager_info");
        if (TextUtils.isEmpty(value)) {
            return;
        }
        String value2 = this.a.c().getValue("fetcher_state");
        if (!TextUtils.isEmpty(value2)) {
            this.f = EnumC2196c.valueOf(value2);
        }
        try {
            ru.mail.libverify.m.f fVar = (ru.mail.libverify.m.f) ru.mail.libverify.q0.a.a(value, ru.mail.libverify.m.f.class);
            this.g = fVar;
            FileLog.v("FetcherManager", "fetcher info loaded %s state %s", fVar, this.f);
        } catch (JsonParseException e) {
            this.f = EnumC2196c.NOT_ACTIVE;
            this.a.c().removeValue("fetcher_manager_info").removeValue("fetcher_state").commit();
            ru.mail.libverify.n0.b.a("FetcherManager", "failed to load fetcher state", e);
        }
    }

    public final synchronized void h() {
        FileLog.v("FetcherManager", "check and activate fetcher");
        a(null, true);
    }

    @Override // ru.mail.libverify.p0.f
    public final boolean handleMessage(@NonNull Message message) {
        switch (a.b[ru.mail.libverify.p0.e.a(message, "FetcherManager", e.b.NORMAL).ordinal()]) {
            case 1:
                String str = (String) ru.mail.libverify.p0.e.c(message, 0);
                String str2 = (String) ru.mail.libverify.p0.e.c(message, 1);
                if (str != null && str2 != null) {
                    try {
                        FileLog.v("FetcherManager", "message received from fetcher");
                        this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_MANAGER_MESSAGE_RECEIVED, this.a.e().a(str, str2)));
                    } catch (DecryptionError e) {
                        ru.mail.libverify.n0.b.a("FetcherManager", "fetcher message decryption error", e);
                        o();
                    } catch (Exception e2) {
                        ru.mail.libverify.n0.b.a("FetcherManager", "unexpected error during fetcher message decryption", e2);
                        o();
                    }
                }
                return true;
            case 2:
                FileLog.v("FetcherManager", "server info received from fetcher");
                this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_MANAGER_SERVER_INFO_RECEIVED, ru.mail.libverify.p0.e.a(message)));
                return true;
            case 3:
                this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_MANAGER_FETCHER_STOPPED, Boolean.valueOf(a(EnumC2196c.SUSPENDED_TEMPORARY))));
                return true;
            case 4:
                this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_MANAGER_FETCHER_STARTED, Boolean.valueOf(a(EnumC2196c.ACTIVE))));
                return true;
            case 5:
                Long l = (Long) ru.mail.libverify.p0.e.c(message, 0);
                synchronized (this) {
                    if (l != null) {
                        try {
                            m();
                            if (this.g == null) {
                                FileLog.e("FetcherManager", "failed to update last modified time (there is no saved info)");
                            } else {
                                FileLog.d("FetcherManager", "update fetcher info last modified %d", l);
                                this.g.a(l.longValue());
                                a(this.g);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                d((String) ru.mail.libverify.p0.e.c(message, 1));
                return true;
            case 6:
                Object obj = message.obj;
                d((ru.mail.libverify.m.f) (obj != null ? obj : null));
                return true;
            case 7:
                Object obj2 = message.obj;
                ru.mail.libverify.m.f fVar = (ru.mail.libverify.m.f) (obj2 != null ? obj2 : null);
                if (fVar == null) {
                    FileLog.d("FetcherManager", "empty fetcher info has been skipped");
                } else {
                    d(fVar);
                }
                return true;
            case 8:
            case 9:
                o();
                return true;
            default:
                return false;
        }
    }

    @Nullable
    public final String j() {
        ru.mail.libverify.m.f fVar = this.g;
        if (fVar == null) {
            return null;
        }
        return fVar.a();
    }

    @Nullable
    public final Long k() {
        ru.mail.libverify.m.f fVar = this.g;
        if (fVar == null) {
            return null;
        }
        return Long.valueOf(fVar.b());
    }

    public final void n() {
        boolean a2;
        FileLog.v("FetcherManager", "pause fetcher");
        MessageBus messageBus = this.d;
        ru.mail.libverify.p0.a aVar = ru.mail.libverify.p0.a.FETCHER_MANAGER_FETCHER_STOPPED;
        EnumC2196c enumC2196c = EnumC2196c.SUSPENDED_TEMPORARY;
        synchronized (this) {
            a2 = a(enumC2196c, null, false);
        }
        messageBus.a(ru.mail.libverify.p0.e.a(aVar, Boolean.valueOf(a2)));
    }

    public final void o() {
        FileLog.v("FetcherManager", "reset and stop fetcher");
        c((ru.mail.libverify.m.f) null);
        a(null, false);
    }

    public final synchronized void p() {
        FileLog.v("FetcherManager", "run fetcher with check");
        m();
        c(this.g);
        a(null, false);
    }

    private synchronized void d(@Nullable ru.mail.libverify.m.f fVar) {
        try {
            FileLog.v("FetcherManager", "update fetcher info started");
            if (c(fVar)) {
                i();
            }
            a(null, true);
            FileLog.v("FetcherManager", "update fetcher info completed");
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // ru.mail.libverify.g0.f
    public final void a() {
        this.d.register(Arrays.asList(ru.mail.libverify.p0.a.FETCHER_EXECUTOR_MESSAGE_RECEIVED, ru.mail.libverify.p0.a.FETCHER_EXECUTOR_SERVER_INFO_RECEIVED, ru.mail.libverify.p0.a.FETCHER_EXECUTOR_FETCHER_STOPPED, ru.mail.libverify.p0.a.FETCHER_EXECUTOR_FETCHER_STARTED, ru.mail.libverify.p0.a.FETCHER_EXECUTOR_UPDATE_CACHE_HEADERS, ru.mail.libverify.p0.a.FETCHER_MANAGER_UPDATE_FETCHER_INFO_INTERNAL, ru.mail.libverify.p0.a.FETCHER_EXECUTOR_UPDATE_FETCHER_INFO, ru.mail.libverify.p0.a.API_RESET, ru.mail.libverify.p0.a.VERIFY_API_RESET), this);
        p();
    }

    public final void b(@NonNull String str) {
        if (TextUtils.equals(str, this.a.e().getContext().getPackageName())) {
            FileLog.e("FetcherManager", "package name %s matches with local", str);
        } else {
            FileLog.v("FetcherManager", "remote fetcher from %s stopped", str);
            a(str, false);
        }
    }

    public final void c(@Nullable String str) {
        ru.mail.libverify.m.f fVar = this.g;
        if (fVar != null) {
            fVar.a(str);
        }
    }

    private synchronized boolean c(@Nullable ru.mail.libverify.m.f fVar) {
        try {
            m();
            ru.mail.libverify.m.f fVar2 = this.g;
            if (fVar2 != null && fVar != null) {
                if (fVar.b() == 0) {
                    fVar.a(fVar2.b());
                }
                if (fVar.a() == null) {
                    fVar.a(fVar2.a());
                }
            }
            this.g = fVar;
            a(fVar);
            FileLog.v("FetcherManager", "fetcher info updated %s -> %s", fVar2, this.g);
            if (fVar2 != null) {
                if (!fVar2.equals(this.g)) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void a(@Nullable Long l) {
        ru.mail.libverify.m.f fVar = this.g;
        if (fVar != null) {
            fVar.a(l.longValue());
        }
    }

    public final void b(@Nullable ru.mail.libverify.m.f fVar) {
        if (fVar == null) {
            FileLog.d("FetcherManager", "empty fetcher info has been skipped");
        } else {
            this.a.b().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_MANAGER_UPDATE_FETCHER_INFO_INTERNAL, fVar));
        }
    }

    private synchronized void d(@Nullable String str) {
        if (str == null) {
            return;
        }
        m();
        if (this.g == null) {
            FileLog.e("FetcherManager", "failed to update last eTag (there is no saved info)");
            return;
        }
        FileLog.d("FetcherManager", "update fetcher info eTag %s", str);
        this.g.a(str);
        a(this.g);
    }

    public final void a(@NonNull String str) {
        if (TextUtils.equals(str, this.a.e().getContext().getPackageName())) {
            FileLog.e("FetcherManager", "package name %s matches with local", str);
            return;
        }
        FileLog.v("FetcherManager", "remote fetcher from %s started", str);
        boolean a2 = a(EnumC2196c.SUSPENDED_OTHER_SERVICE, str, false);
        FileLog.v("FetcherManager", "activate fetcher, publish = %s, package = %s", Boolean.valueOf(a2), str);
        this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_MANAGER_FETCHER_STOPPED, Boolean.valueOf(a2)));
    }

    private void a(@Nullable String str, boolean z) {
        EnumC2196c enumC2196c = EnumC2196c.ACTIVE;
        boolean a2 = a(enumC2196c, str, z);
        FileLog.v("FetcherManager", "activate fetcher, publish = %s, package = %s", Boolean.valueOf(a2), str);
        if (this.f == enumC2196c) {
            this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_MANAGER_FETCHER_STARTED, Boolean.valueOf(a2)));
        } else {
            this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.FETCHER_MANAGER_FETCHER_STOPPED, Boolean.valueOf(a2)));
        }
    }

    private void a(@Nullable ru.mail.libverify.m.f fVar) {
        if (fVar == null) {
            this.a.c().removeValue("fetcher_manager_info").removeValue("fetcher_state").commit();
            return;
        }
        try {
            this.a.c().putValue("fetcher_manager_info", ru.mail.libverify.q0.a.f(fVar)).putValue("fetcher_state", this.f.toString()).commit();
        } catch (JsonParseException e) {
            ru.mail.libverify.n0.b.a("FetcherManager", "failed to save fetcher info", e);
        }
    }

    private synchronized boolean a(@NonNull EnumC2196c enumC2196c) {
        return a(enumC2196c, null, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0164, code lost:
    
        if (r0 != ru.mail.libverify.f.c.EnumC2196c.NOT_ACTIVE) goto L83;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x017d A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:3:0x0001, B:11:0x001b, B:13:0x0021, B:15:0x0029, B:18:0x003e, B:23:0x0168, B:25:0x017d, B:31:0x0035, B:32:0x0044, B:34:0x0048, B:35:0x0058, B:38:0x005e, B:40:0x0064, B:42:0x0073, B:43:0x007a, B:44:0x008b, B:48:0x009f, B:49:0x00a4, B:50:0x00a5, B:52:0x00ab, B:54:0x00c6, B:55:0x00d1, B:57:0x00e2, B:58:0x00e9, B:60:0x00f1, B:62:0x0102, B:65:0x00f9, B:66:0x0107, B:68:0x010d, B:70:0x0111, B:71:0x0118, B:73:0x0125, B:74:0x0114, B:75:0x012b, B:77:0x0133, B:79:0x0144, B:82:0x013b, B:83:0x0149, B:85:0x0151, B:87:0x0162, B:89:0x0159), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0184 A[DONT_GENERATE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean a(@NonNull EnumC2196c enumC2196c, @Nullable String str, boolean z) {
        try {
            m();
            EnumC2196c enumC2196c2 = this.f;
            int i = a.a[enumC2196c.ordinal()];
            boolean z2 = false;
            if (i != 1) {
                if (i == 2) {
                    if (l()) {
                        EnumC2196c enumC2196c3 = EnumC2196c.SUSPENDED_OTHER_SERVICE;
                        if (enumC2196c2 == enumC2196c3) {
                            this.f = enumC2196c3;
                        } else {
                            this.f = EnumC2196c.SUSPENDED_TEMPORARY;
                        }
                        this.c.d();
                        if (this.h.get() > 0) {
                            this.h.getAndDecrement();
                        }
                    } else {
                        if (this.h.get() <= 0 || this.h.decrementAndGet() == 0) {
                            this.f = EnumC2196c.NOT_ACTIVE;
                            this.c.d();
                        }
                        if (enumC2196c2 != EnumC2196c.NOT_ACTIVE) {
                        }
                    }
                    FileLog.v("FetcherManager", "fetcher state %s -> %s, publish %s", enumC2196c2, this.f, Boolean.valueOf(z2));
                    if (enumC2196c2 != this.f) {
                    }
                } else if (i == 3) {
                    if (l()) {
                        boolean b2 = this.a.e().b(str);
                        FileLog.d("FetcherManager", "this is the last installed libverify instance %s", Boolean.valueOf(b2));
                        if (b2) {
                            this.f = EnumC2196c.NOT_ACTIVE;
                            this.c.b();
                        } else {
                            this.f = EnumC2196c.SUSPENDED_OTHER_SERVICE;
                            this.c.d();
                            if (this.h.get() > 0) {
                                this.h.getAndDecrement();
                            }
                        }
                    } else {
                        if (this.h.get() <= 0 || this.h.decrementAndGet() == 0) {
                            this.f = EnumC2196c.NOT_ACTIVE;
                            this.c.d();
                        }
                        if (enumC2196c2 != EnumC2196c.NOT_ACTIVE) {
                        }
                    }
                    FileLog.v("FetcherManager", "fetcher state %s -> %s, publish %s", enumC2196c2, this.f, Boolean.valueOf(z2));
                    if (enumC2196c2 != this.f) {
                    }
                } else if (i == 4) {
                    if (!l()) {
                        if (this.h.get() > 0) {
                            if (this.h.decrementAndGet() == 0) {
                            }
                            if (enumC2196c2 != EnumC2196c.NOT_ACTIVE) {
                            }
                            FileLog.v("FetcherManager", "fetcher state %s -> %s, publish %s", enumC2196c2, this.f, Boolean.valueOf(z2));
                            if (enumC2196c2 != this.f) {
                                return z2;
                            }
                            a(this.g);
                            return z2;
                        }
                        this.f = EnumC2196c.NOT_ACTIVE;
                        this.c.d();
                        if (enumC2196c2 != EnumC2196c.NOT_ACTIVE) {
                        }
                        FileLog.v("FetcherManager", "fetcher state %s -> %s, publish %s", enumC2196c2, this.f, Boolean.valueOf(z2));
                        if (enumC2196c2 != this.f) {
                        }
                    } else {
                        if (enumC2196c2 == EnumC2196c.SUSPENDED_TEMPORARY) {
                            this.f = EnumC2196c.ACTIVE;
                            this.h.incrementAndGet();
                            this.c.c();
                        } else {
                            EnumC2196c enumC2196c4 = EnumC2196c.SUSPENDED_OTHER_SERVICE;
                            if (enumC2196c2 == enumC2196c4 && !z) {
                                if (TextUtils.isEmpty(str)) {
                                    this.f = enumC2196c4;
                                    this.c.d();
                                    if (this.h.get() > 0) {
                                        this.h.getAndDecrement();
                                    }
                                } else {
                                    this.f = EnumC2196c.ACTIVE;
                                    this.h.incrementAndGet();
                                    this.c.c();
                                }
                            } else {
                                EnumC2196c enumC2196c5 = EnumC2196c.ACTIVE;
                                this.f = enumC2196c5;
                                this.h.incrementAndGet();
                                this.c.c();
                                if (enumC2196c2 == enumC2196c5) {
                                    if (z) {
                                    }
                                }
                            }
                        }
                        FileLog.v("FetcherManager", "fetcher state %s -> %s, publish %s", enumC2196c2, this.f, Boolean.valueOf(z2));
                        if (enumC2196c2 != this.f) {
                        }
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else if (this.h.get() <= 0 || this.h.decrementAndGet() == 0) {
                this.f = EnumC2196c.NOT_ACTIVE;
                this.c.d();
            }
            z2 = true;
            FileLog.v("FetcherManager", "fetcher state %s -> %s, publish %s", enumC2196c2, this.f, Boolean.valueOf(z2));
            if (enumC2196c2 != this.f) {
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
