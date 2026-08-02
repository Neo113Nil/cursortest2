package ru.mail.libverify.api;

import android.os.Message;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.h;
import ru.mail.libverify.api.q;
import ru.mail.libverify.p0.e;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.components.MessageBus;
import ru.mail.verify.core.utils.json.JsonParseException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes9.dex */
public final class e implements ru.mail.libverify.p0.f, ru.mail.libverify.g0.f {
    private static final Pattern j = Pattern.compile("^.*(\\d{4,}).*$");

    @NonNull
    private final ru.mail.libverify.c.b a;

    @NonNull
    private final MessageBus b;

    @Nullable
    private volatile ru.mail.libverify.m.m c;

    @Nullable
    private volatile List<ru.mail.libverify.n.k> d;

    @Nullable
    private VerificationApi.AccountCheckListener e;

    @Nullable
    private String f;

    @Nullable
    private HashMap g;

    @Nullable
    private Future<?> h;

    @NonNull
    private final ru.mail.libverify.i0.a i;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ru.mail.libverify.p0.a.values().length];
            a = iArr;
            try {
                iArr[ru.mail.libverify.p0.a.ACCOUNT_CHECKER_NO_SMS_INFO_INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ru.mail.libverify.p0.a.ACCOUNT_CHECKER_SMS_SEARCH_COMPLETED_INTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ru.mail.libverify.p0.a.ACCOUNT_CHECKER_GENERAL_ERROR_INTERNAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ru.mail.libverify.p0.a.ACCOUNT_CHECKER_MAX_SMS_INFO_WAIT_TIMEOUT_INTERNAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ru.mail.libverify.p0.a.VERIFY_API_RESET.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[ru.mail.libverify.p0.a.API_RESET.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class b {
        boolean a;
        boolean b;

        @Nullable
        List<ru.mail.libverify.n.k> c;

        public /* synthetic */ b(int i) {
            this();
        }

        private b() {
            this.a = false;
            this.b = false;
            this.c = null;
        }
    }

    public e(@NonNull ru.mail.libverify.c.b bVar) {
        this.a = bVar;
        q.d dVar = (q.d) bVar;
        this.b = dVar.a();
        this.i = dVar.e().u();
    }

    private void h() {
        ((q.d) this.a).b().removeMessages(ru.mail.libverify.p0.a.ACCOUNT_CHECKER_MAX_SMS_INFO_WAIT_TIMEOUT_INTERNAL.ordinal());
        ((q.d) this.a).c().removeValue("account_check_app_json").removeValue("account_check_intercepted_sms").commit();
        this.f = null;
        this.g = null;
    }

    private void i() {
        if (TextUtils.isEmpty(this.f)) {
            FileLog.d("AccountChecker", "no application json");
            return;
        }
        if (this.d != null) {
            FileLog.d("AccountChecker", "application check has been already completed");
            List<ru.mail.libverify.n.k> list = this.d;
            Objects.requireNonNull(list);
            a(list);
            return;
        }
        if (this.h != null) {
            FileLog.d("AccountChecker", "sms finding process for the account data %s has been already started", this.f);
        } else {
            FileLog.d("AccountChecker", "start sms finding process for the account data %s", this.f);
            this.h = ((q.d) this.a).d().submit(new Runnable() { // from class: ru.mail.libverify.api.w
                @Override // java.lang.Runnable
                public final void run() {
                    e.this.j();
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        ru.mail.libverify.m.m mVar = this.c;
        if (mVar == null || mVar.c() == null || mVar.c().length == 0 || mVar.d() == null || mVar.d().isEmpty()) {
            this.b.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.ACCOUNT_CHECKER_NO_SMS_INFO_INTERNAL, (Object) null));
            return;
        }
        this.b.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.ACCOUNT_CHECKER_SMS_PARSING_STARTED, (Object) null));
        ru.mail.libverify.n.c K = ((q.d) this.a).e().K();
        b bVar = new b(0);
        h.a aVar = new h.a();
        aVar.b = mVar.c();
        try {
            bVar.c = ((ru.mail.libverify.n.d) K).a(new c(aVar, bVar, mVar));
            this.b.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.ACCOUNT_CHECKER_SMS_SEARCH_COMPLETED_INTERNAL, bVar));
        } catch (InterruptedException e) {
            FileLog.d("AccountChecker", "query user sms messages interrupted", e);
        } catch (Throwable th) {
            FileLog.e("AccountChecker", "failed to query user sms messages", th);
            this.b.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.ACCOUNT_CHECKER_GENERAL_ERROR_INTERNAL, (Object) null));
        }
    }

    private void k() {
        if (this.f == null) {
            this.f = ((q.d) this.a).c().getValue("account_check_app_json");
        }
        if (this.g == null) {
            try {
                String value = ((q.d) this.a).c().getValue("account_check_intercepted_sms");
                if (TextUtils.isEmpty(value)) {
                    return;
                }
                this.g = ru.mail.libverify.q0.a.d(value, ru.mail.libverify.n.k.class);
            } catch (Throwable unused) {
                FileLog.e("AccountChecker", "failed to restore intercepted sms");
                ((q.d) this.a).c().removeValue("account_check_intercepted_sms").commit();
            }
        }
    }

    private void m() {
        if (this.f != null) {
            ((q.d) this.a).c().putValue("account_check_app_json", this.f);
        } else {
            ((q.d) this.a).c().removeValue("account_check_time");
        }
        if (this.g != null) {
            try {
                ((q.d) this.a).c().putValue("account_check_intercepted_sms", ru.mail.libverify.q0.a.f(this.g));
            } catch (Throwable unused) {
                FileLog.e("AccountChecker", "failed to save intercepted sms");
                this.g = null;
            }
        } else {
            ((q.d) this.a).c().removeValue("account_check_intercepted_sms");
        }
        ((q.d) this.a).c().commit();
    }

    @Override // ru.mail.libverify.p0.f
    public final boolean handleMessage(@NonNull Message message) {
        switch (a.a[ru.mail.libverify.p0.e.a(message, "AccountChecker", e.b.NORMAL).ordinal()]) {
            case 1:
                this.h = null;
                a(VerificationApi.AccountCheckResult.NO_SMS_INFO);
                return true;
            case 2:
                b bVar = (b) ru.mail.libverify.p0.e.a(message);
                try {
                    List<ru.mail.libverify.n.k> list = bVar.c;
                    if (list != null && !list.isEmpty()) {
                        this.d = bVar.c;
                        List<ru.mail.libverify.n.k> list2 = this.d;
                        Objects.requireNonNull(list2);
                        a(list2);
                        return true;
                    }
                    if (bVar.b) {
                        a(VerificationApi.AccountCheckResult.NO_SMS_FOUND_HAS_CODE);
                    } else if (bVar.a) {
                        a(VerificationApi.AccountCheckResult.NO_SMS_FOUND_HAS_SOURCE_MATCH);
                    } else {
                        a(VerificationApi.AccountCheckResult.NO_SMS_FOUND);
                    }
                    return true;
                } catch (Throwable th) {
                    throw th;
                }
            case 3:
                try {
                    this.d = new ArrayList();
                    a(VerificationApi.AccountCheckResult.GENERAL_ERROR);
                    return true;
                } finally {
                    this.h = null;
                    this.b.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.ACCOUNT_CHECKER_SMS_PARSING_COMPLETED, (Object) null));
                }
            case 4:
                FileLog.e("AccountChecker", "sms info request timeout expired");
                a(VerificationApi.AccountCheckResult.NO_SMS_INFO);
                return true;
            case 5:
            case 6:
                l();
                return true;
            default:
                return false;
        }
    }

    public final void l() {
        FileLog.d("AccountChecker", "reset started");
        h();
        ((q.d) this.a).c().removeValue("account_check_time").commit();
        this.c = null;
        this.d = null;
        Future<?> future = this.h;
        if (future != null) {
            future.cancel(true);
            this.h = null;
        }
        FileLog.d("AccountChecker", "reset completed");
    }

    public final void a(@NonNull String str, @Nullable VerificationApi.AccountCheckListener accountCheckListener) {
        if (TextUtils.isEmpty(str)) {
            a(VerificationApi.AccountCheckResult.EMPTY_ACCOUNT_DATA);
            return;
        }
        String value = ((q.d) this.a).c().getValue("account_check_time");
        if (!TextUtils.isEmpty(value)) {
            long b2 = this.i.b() - Long.parseLong(value);
            if (b2 >= 0 && b2 < 43200000) {
                FileLog.d("AccountChecker", "account data %s check dismissed by timeout", str);
                return;
            }
        }
        FileLog.d("AccountChecker", "account data %s check started", str);
        this.e = accountCheckListener;
        this.f = str;
        m();
        if (!ru.mail.libverify.n0.e.b(((q.d) this.a).e().getContext(), "android.permission.READ_SMS")) {
            a(VerificationApi.AccountCheckResult.NO_SMS_PERMISSION);
        } else if (this.c != null) {
            i();
        } else {
            this.b.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.ACCOUNT_CHECKER_REQUEST_SMS_INFO, (Object) null));
            ((q.d) this.a).b().sendMessageDelayed(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.ACCOUNT_CHECKER_MAX_SMS_INFO_WAIT_TIMEOUT_INTERNAL, (Object) null), 1800000L);
        }
    }

    @Override // ru.mail.libverify.g0.f
    public final void a() {
        this.b.register(Arrays.asList(ru.mail.libverify.p0.a.ACCOUNT_CHECKER_NO_SMS_INFO_INTERNAL, ru.mail.libverify.p0.a.ACCOUNT_CHECKER_SMS_SEARCH_COMPLETED_INTERNAL, ru.mail.libverify.p0.a.ACCOUNT_CHECKER_GENERAL_ERROR_INTERNAL, ru.mail.libverify.p0.a.ACCOUNT_CHECKER_MAX_SMS_INFO_WAIT_TIMEOUT_INTERNAL, ru.mail.libverify.p0.a.API_RESET, ru.mail.libverify.p0.a.VERIFY_API_RESET), this);
        k();
        if (TextUtils.isEmpty(this.f)) {
            return;
        }
        a(this.f, this.e);
    }

    public final void a(@Nullable ru.mail.libverify.m.m mVar) {
        this.c = mVar;
        i();
        HashMap hashMap = this.g;
        if (hashMap != null && !hashMap.isEmpty()) {
            ru.mail.libverify.m.m mVar2 = this.c;
            if (mVar2 == null || mVar2.c() == null || mVar2.c().length == 0 || mVar2.d() == null || mVar2.d().isEmpty()) {
                return;
            }
            h();
            return;
        }
        FileLog.d("AccountChecker", "no intercepted sms");
    }

    public final void a(@NonNull ru.mail.libverify.n.k kVar) {
        FileLog.v("AccountChecker", "process alien sms from %s with text %s", kVar.b(), kVar.a());
        k();
        if (this.g == null) {
            this.g = new HashMap();
        }
        this.g.put(kVar.b(), kVar);
        m();
        if (this.c == null) {
            this.b.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.ACCOUNT_CHECKER_REQUEST_SMS_INFO, (Object) null));
            ((q.d) this.a).b().sendMessageDelayed(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.ACCOUNT_CHECKER_MAX_SMS_INFO_WAIT_TIMEOUT_INTERNAL, (Object) null), 1800000L);
            return;
        }
        HashMap hashMap = this.g;
        if (hashMap != null && !hashMap.isEmpty()) {
            ru.mail.libverify.m.m mVar = this.c;
            if (mVar == null || mVar.c() == null || mVar.c().length == 0 || mVar.d() == null || mVar.d().isEmpty()) {
                return;
            }
            h();
            return;
        }
        FileLog.d("AccountChecker", "no intercepted sms");
    }

    private void a(@NonNull List<ru.mail.libverify.n.k> list) {
        FileLog.d("AccountChecker", "account data %s check completed, sms found %d", this.f, Integer.valueOf(list.size()));
        String str = null;
        if (!list.isEmpty()) {
            try {
                str = ru.mail.libverify.q0.a.f(new ru.mail.libverify.api.a(list));
            } catch (JsonParseException e) {
                ru.mail.libverify.n0.b.a("AccountChecker", "failed to format json", e);
            }
        }
        if (!TextUtils.isEmpty(this.f) && !TextUtils.isEmpty(str)) {
            this.b.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.ACCOUNT_CHECKER_COMPLETED, this.f, str, VerificationApi.AccountCheckResult.OK));
        }
        VerificationApi.AccountCheckListener accountCheckListener = this.e;
        if (accountCheckListener != null) {
            accountCheckListener.onComplete(VerificationApi.AccountCheckResult.OK);
        }
        ((q.d) this.a).c().putValue("account_check_time", Long.toString(this.i.b())).commit();
        h();
    }

    private void a(@NonNull VerificationApi.AccountCheckResult accountCheckResult) {
        String str;
        FileLog.e("AccountChecker", "failed to check account data %s, error %s", this.f, accountCheckResult);
        try {
            str = ru.mail.libverify.q0.a.f(new ru.mail.libverify.api.a(accountCheckResult));
        } catch (JsonParseException e) {
            ru.mail.libverify.n0.b.a("AccountChecker", "failed to format json", e);
            str = null;
        }
        if (!TextUtils.isEmpty(this.f) && !TextUtils.isEmpty(str)) {
            this.b.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.ACCOUNT_CHECKER_COMPLETED, this.f, str, accountCheckResult));
        }
        VerificationApi.AccountCheckListener accountCheckListener = this.e;
        if (accountCheckListener != null) {
            accountCheckListener.onComplete(accountCheckResult);
        }
        if (accountCheckResult != VerificationApi.AccountCheckResult.GENERAL_ERROR) {
            ((q.d) this.a).c().putValue("account_check_time", Long.toString(this.i.b())).commit();
            h();
        } else {
            l();
        }
    }
}
