package ru.mail.libverify.api;

import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.concurrent.Future;
import ru.mail.libverify.api.q;
import ru.mail.libverify.p0.e;
import ru.mail.libverify.platform.api.AttestationFailedException;
import ru.mail.libverify.platform.api.GAPIClientFailedException;
import ru.mail.libverify.platform.core.JwsServiceCallback;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.components.MessageBus;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class g implements ru.mail.libverify.p0.f, ru.mail.libverify.g0.f {

    @NonNull
    private final ru.mail.libverify.c.b a;

    @NonNull
    private final MessageBus b;

    @Nullable
    private Future<?> c;

    @Nullable
    private String d;

    @NonNull
    private final ru.mail.libverify.u.y e;

    @NonNull
    private final ru.mail.libverify.i0.a f;

    public class a implements JwsServiceCallback {
        public a() {
        }

        @Override // ru.mail.libverify.platform.core.JwsServiceCallback
        public final void onFailure(@NonNull Exception exc) {
            if (exc instanceof AttestationFailedException) {
                FileLog.e("ApplicationChecker", "application check failed", exc);
                ((q.d) g.this.a).b().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.APPLICATION_CHECKER_COMPLETED_INTERNAL, null, f.ATTESTATION_FAILED));
            } else if (exc instanceof GAPIClientFailedException) {
                FileLog.e("ApplicationChecker", "application check failed", exc);
                ((q.d) g.this.a).b().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.APPLICATION_CHECKER_COMPLETED_INTERNAL, null, f.GP_SERVICE_NOT_AVAILABLE));
            } else if (exc instanceof InterruptedException) {
                FileLog.e("ApplicationChecker", "application check interrupted", exc);
            } else {
                FileLog.e("ApplicationChecker", "application check failed", exc);
                ((q.d) g.this.a).b().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.APPLICATION_CHECKER_COMPLETED_INTERNAL, null, f.GENERAL_ERROR));
            }
        }

        @Override // ru.mail.libverify.platform.core.JwsServiceCallback
        public final void onSuccess(@NonNull String str) {
            g.this.e.a(str);
            ((q.d) g.this.a).b().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.APPLICATION_CHECKER_COMPLETED_INTERNAL, str, f.SUCCESS));
        }
    }

    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ru.mail.libverify.p0.a.values().length];
            a = iArr;
            try {
                iArr[ru.mail.libverify.p0.a.APPLICATION_CHECKER_COMPLETED_INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ru.mail.libverify.p0.a.VERIFY_API_RESET.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ru.mail.libverify.p0.a.API_RESET.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public g(@NonNull ru.mail.libverify.c.b bVar) {
        this.a = bVar;
        q.d dVar = (q.d) bVar;
        this.b = dVar.a();
        this.e = new ru.mail.libverify.u.y(dVar);
        this.f = dVar.e().u();
    }

    private void i() {
        if (TextUtils.isEmpty(((q.d) this.a).c().getValue("app_check_started"))) {
            FileLog.v("ApplicationChecker", "no pending job");
            return;
        }
        String str = this.d;
        if (str == null) {
            FileLog.d("ApplicationChecker", "no safetyNetItem");
            return;
        }
        ru.mail.libverify.e.e eVar = (ru.mail.libverify.e.e) ru.mail.libverify.q0.a.a(str, ru.mail.libverify.e.e.class);
        final String b2 = eVar.b();
        final String a2 = eVar.a();
        if (TextUtils.isEmpty(b2)) {
            FileLog.d("ApplicationChecker", "no nonce");
        } else if (TextUtils.isEmpty(a2)) {
            FileLog.d("ApplicationChecker", "apiKey");
        } else if (this.c == null) {
            this.c = ((q.d) this.a).d().submit(new Runnable() { // from class: ru.mail.libverify.api.x
                @Override // java.lang.Runnable
                public final void run() {
                    g.this.a(b2, a2);
                }
            });
        }
    }

    public final void h() {
        FileLog.d("ApplicationChecker", "application check requested");
        ((q.d) this.a).c().putValue("app_check_started", Long.toString(this.f.b())).commit();
        Future<?> future = this.c;
        if (future != null) {
            future.cancel(true);
            this.c = null;
        }
        this.d = null;
        i();
    }

    @Override // ru.mail.libverify.p0.f
    public final boolean handleMessage(@NonNull Message message) {
        int i = b.a[ru.mail.libverify.p0.e.a(message, "ApplicationChecker", e.b.NORMAL).ordinal()];
        if (i == 1) {
            String str = (String) ru.mail.libverify.p0.e.c(message, 0);
            f fVar = (f) ru.mail.libverify.p0.e.c(message, 1);
            FileLog.v("ApplicationChecker", "application check completed jws %s, result %s", str, fVar);
            this.c = null;
            this.d = null;
            ((q.d) this.a).c().removeValue("app_check_started").commit();
            this.b.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.APPLICATION_CHECKER_COMPLETED, str, fVar));
        } else {
            if (i != 2 && i != 3) {
                return false;
            }
            Future<?> future = this.c;
            if (future != null) {
                future.cancel(true);
                this.c = null;
            }
            this.d = null;
            ((q.d) this.a).c().removeValue("app_check_started").commit();
        }
        return true;
    }

    @Override // ru.mail.libverify.g0.f
    public final void a() {
        this.b.register(Arrays.asList(ru.mail.libverify.p0.a.APPLICATION_CHECKER_COMPLETED_INTERNAL, ru.mail.libverify.p0.a.API_RESET, ru.mail.libverify.p0.a.VERIFY_API_RESET), this);
        i();
    }

    public final void a(@NonNull String str) {
        FileLog.d("ApplicationChecker", "application check server id %s received", str);
        this.d = str;
        ((q.d) this.a).c().putValue("app_check_started", Long.toString(this.f.b())).commit();
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, String str2) {
        if (Thread.interrupted()) {
            FileLog.d("ApplicationChecker", "application check interrupted");
            return;
        }
        try {
            VerificationFactory.getPlatformService(((q.d) this.a).e().getContext()).getJwsService().getJws(((q.d) this.a).e().getContext(), ru.mail.libverify.n0.e.b(str), str2, new a());
        } catch (Throwable th) {
            FileLog.e("ApplicationChecker", "application check failed", th);
            ((q.d) this.a).b().sendMessage(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.APPLICATION_CHECKER_COMPLETED_INTERNAL, null, f.GENERAL_ERROR));
        }
    }
}
