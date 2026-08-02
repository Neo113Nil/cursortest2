package ru.mail.verify.core.api;

import android.os.Message;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.Thread;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import ru.mail.libverify.api.q;
import ru.mail.libverify.n0.b;
import ru.mail.libverify.p0.e;
import ru.mail.verify.core.api.ApplicationModule;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.SmartException;
import ru.mail.verify.core.utils.components.MessageBus;
import xsna.bqy;

/* loaded from: classes9.dex */
final class c implements ru.mail.libverify.p0.f, ru.mail.libverify.g0.d {
    private final HashSet a = new HashSet();

    @NonNull
    private final ApplicationModule.c b;

    @NonNull
    private final bqy<ru.mail.libverify.l0.e> c;

    @NonNull
    private final MessageBus d;

    @NonNull
    private final f e;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ru.mail.libverify.p0.a.values().length];
            a = iArr;
            try {
                iArr[ru.mail.libverify.p0.a.EMPTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ru.mail.libverify.p0.a.API_INTERNAL_INITIALIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ru.mail.libverify.p0.a.API_INITIALIZE_API_GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public class b implements b.a {
        public /* synthetic */ b(c cVar, int i) {
            this();
        }

        @Override // ru.mail.libverify.n0.b.a
        public final void a(@Nullable String str, @NonNull SmartException smartException) {
            Pair pair = new Pair(Thread.currentThread(), smartException);
            FileLog.e("ApiManager", smartException, "Fatal error %s in thread: %s", str, pair.first);
            c.this.e.b().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.API_INTERNAL_SILENT_EXCEPTION, pair));
        }

        private b() {
        }
    }

    public c(@NonNull MessageBus messageBus, @NonNull Thread.UncaughtExceptionHandler uncaughtExceptionHandler, @NonNull ApplicationModule.c cVar, @NonNull RejectedExecutionHandler rejectedExecutionHandler, @NonNull bqy<ru.mail.libverify.l0.e> bqyVar) {
        this.b = cVar;
        this.c = bqyVar;
        this.d = messageBus;
        f fVar = new f(uncaughtExceptionHandler, rejectedExecutionHandler, this);
        this.e = fVar;
        ru.mail.libverify.n0.b.a(new b(this, 0));
        FileLog.d("ApiManager", "prepare internal members %d", Integer.valueOf(hashCode()));
        fVar.b().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.API_INTERNAL_INITIALIZE, (Object) null));
    }

    @Override // ru.mail.libverify.g0.d
    @NonNull
    public final ru.mail.libverify.p0.b b() {
        return this.e.b();
    }

    @Override // ru.mail.libverify.g0.d
    @NonNull
    public final ThreadPoolExecutor d() {
        return this.e.a();
    }

    @Override // ru.mail.libverify.p0.f
    public final boolean handleMessage(@NonNull Message message) {
        int i = a.a[ru.mail.libverify.p0.e.a(message, "ApiManager", this.b.a() ? e.b.EXTENDED : e.b.NONE).ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2) {
            this.d.register(Collections.EMPTY_LIST, this);
        } else if (i != 3) {
            this.d.a(message);
        } else {
            ru.mail.libverify.g0.c cVar = (ru.mail.libverify.g0.c) ru.mail.libverify.p0.e.a(message);
            cVar.a();
            Iterator it = cVar.c().iterator();
            while (it.hasNext()) {
                ru.mail.libverify.g0.f fVar = (ru.mail.libverify.g0.f) ((bqy) it.next()).get();
                if (this.a.add(fVar)) {
                    fVar.a();
                }
            }
        }
        return true;
    }

    @Override // ru.mail.libverify.g0.d
    public final void post(@NonNull Message message) {
        this.e.b().sendMessage(message);
    }

    @Override // ru.mail.libverify.g0.d
    public final void reset() {
        FileLog.d("ApiManager", "reset started");
        this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.API_RESET, (Object) null));
        this.c.get().a();
        FileLog.d("ApiManager", "reset completed");
    }

    @Override // ru.mail.libverify.g0.d
    public final void a(@NonNull q qVar) {
        this.e.b().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.API_INITIALIZE_API_GROUP, qVar));
    }

    @Override // ru.mail.libverify.g0.d
    public final void a(@NonNull Message message) {
        this.e.b().b(message);
    }

    @Override // ru.mail.libverify.g0.d
    public final void a() {
        FileLog.d("ApiManager", "stop started");
        this.e.c();
        this.c.get().a();
        FileLog.d("ApiManager", "stop completed");
    }
}
