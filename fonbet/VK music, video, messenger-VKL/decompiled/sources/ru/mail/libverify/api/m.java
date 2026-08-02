package ru.mail.libverify.api;

import android.text.TextUtils;
import android.util.LruCache;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.regex.Pattern;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.common.Status;
import ru.mail.libverify.api.q;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.ServerException;
import ru.mail.verify.core.utils.components.MessageBus;
import xsna.pzl;
import xsna.qoy;

/* loaded from: classes9.dex */
final class m {
    private static Pattern f;
    private final HashMap<String, c> a = new HashMap<>();
    private final LruCache<String, VerificationApi.PhoneCheckResult> b = new LruCache<>(50);

    @NonNull
    private final ru.mail.libverify.c.b c;

    @NonNull
    private final MessageBus d;

    @NonNull
    private final k e;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[Status.values().length];
            a = iArr;
            try {
                iArr[Status.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[Status.UNSUPPORTED_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[Status.INCORRECT_PHONE_NUMBER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[Status.PHONE_NUMBER_IN_BLACK_LIST.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[Status.PHONE_NUMBER_TYPE_NOT_ALLOWED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[Status.NOT_ENOUGH_DATA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[Status.RATELIMIT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static class b {
        static final HashSet<String> h = new HashSet<>();

        @NonNull
        final String a;

        @NonNull
        final String b;
        final HashMap<VerificationApi.PhoneCheckListener, String> c;

        @NonNull
        final String d;

        @NonNull
        final String e;
        final boolean f;

        @NonNull
        final String g;

        public b(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z, @NonNull VerificationApi.PhoneCheckListener phoneCheckListener) {
            HashMap<VerificationApi.PhoneCheckListener, String> hashMap = new HashMap<>();
            this.c = hashMap;
            this.a = str;
            this.b = str2;
            this.f = z;
            hashMap.put(phoneCheckListener, str3);
            this.d = str3;
            if (m.f == null) {
                m.f = Pattern.compile("[^\\+0-9]");
            }
            String replaceAll = m.f.matcher(str3).replaceAll("");
            this.e = replaceAll;
            this.g = pzl.b(replaceAll, BundleUtil.UNDERLINE_TAG, str2);
            h.add(str);
        }

        public final boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            return this.g.equals(((b) obj).g);
        }

        public final int hashCode() {
            return this.g.hashCode();
        }
    }

    public static class c {

        @NonNull
        final Future<?> a;

        @NonNull
        final b b;

        public c(@NonNull b bVar, @NonNull Future<?> future) {
            this.b = bVar;
            this.a = future;
        }
    }

    public m(@NonNull ru.mail.libverify.c.b bVar) {
        this.c = bVar;
        q.d dVar = (q.d) bVar;
        this.d = dVar.a();
        this.e = dVar.e().y();
    }

    public final void a(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z, @NonNull VerificationApi.PhoneCheckListener phoneCheckListener) {
        FileLog.v("PhoneNumberChecker", "Check %s %s %s", str, str2, str3);
        if (TextUtils.isEmpty(str3) || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            phoneCheckListener.onCompleted(str3, PhoneCheckResultImpl.a(this.e));
            return;
        }
        if (!b.h.contains(str)) {
            this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.PHONE_NUMBER_CHECKER_NEW_CHECK_STARTED, (Object) null));
        }
        b bVar = new b(str, str2, str3, z, phoneCheckListener);
        String str4 = bVar.e;
        boolean z2 = false;
        int length = (TextUtils.isEmpty(str4) || str4.charAt(0) != '+') ? str4.length() : str4.length() - 1;
        if (length < 4) {
            a(bVar, PhoneCheckResultImpl.getIncorrectPhoneResult());
            return;
        }
        if (length > 20) {
            a(bVar, PhoneCheckResultImpl.getIncorrectPhoneResult());
            return;
        }
        VerificationApi.PhoneCheckResult phoneCheckResult = this.b.get(bVar.g);
        if (phoneCheckResult != null && phoneCheckResult.getReason() == VerificationApi.FailReason.OK) {
            FileLog.v("PhoneNumberChecker", "Check %s found in the cache", str3);
            a(bVar, phoneCheckResult);
            if (phoneCheckResult.isApproximate()) {
                a(bVar, true);
                return;
            }
            return;
        }
        FileLog.v("PhoneNumberChecker", "Check %s not found in the cache", str3);
        String str5 = bVar.e;
        while (true) {
            if (str5.length() <= 5) {
                break;
            }
            str5 = qoy.c(1, 0, str5);
            VerificationApi.PhoneCheckResult phoneCheckResult2 = this.b.get(str5 + BundleUtil.UNDERLINE_TAG + str2);
            if (phoneCheckResult2 != null) {
                PhoneCheckResultImpl a2 = PhoneCheckResultImpl.a(phoneCheckResult2);
                if (a2 != null) {
                    FileLog.v("PhoneNumberChecker", "Check %s found reduced number in the cache", str5);
                    this.b.put(bVar.g, a2);
                    a(bVar, a2);
                    z2 = true;
                }
            }
        }
        a(bVar, z2);
    }

    private void a(@NonNull b bVar, boolean z) {
        if (!((q.d) this.c).e().D().b()) {
            if (z) {
                return;
            }
            a(bVar, PhoneCheckResultImpl.c(this.e));
            return;
        }
        String b2 = pzl.b(bVar.a, BundleUtil.UNDERLINE_TAG, bVar.b);
        c cVar = this.a.get(b2);
        if (cVar != null) {
            if (!cVar.a.isCancelled() && cVar.b.equals(bVar)) {
                FileLog.v("PhoneNumberChecker", "Check %s requests joined", bVar.d);
                cVar.b.c.putAll(bVar.c);
                return;
            } else {
                FileLog.v("PhoneNumberChecker", "Check %s cancel previous request", bVar.d);
                cVar.a.cancel(true);
                cVar.b.c.clear();
                this.a.remove(b2);
            }
        }
        ru.mail.libverify.requests.i iVar = new ru.mail.libverify.requests.i(((q.d) this.c).e(), bVar.e, bVar.b, bVar.a, bVar.f);
        FileLog.d("PhoneNumberChecker", "Check %s start request", bVar.d);
        this.a.put(b2, new c(bVar, iVar.a(((q.d) this.c).d(), ((q.d) this.c).b(), new l(this, iVar, bVar, b2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @NonNull
    public VerificationApi.PhoneCheckResult a(@NonNull ru.mail.libverify.requests.i iVar, @NonNull Future<ru.mail.libverify.m.j> future, @NonNull b bVar) {
        VerificationApi.PhoneCheckResult a2;
        VerificationApi.PhoneCheckResult phoneCheckResult;
        VerificationApi.PhoneCheckResult a3;
        try {
            ru.mail.libverify.m.j jVar = future.get();
            switch (a.a[jVar.g().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                    a3 = PhoneCheckResultImpl.a(jVar);
                    this.b.put(bVar.g, a3);
                    break;
                case 7:
                    a3 = PhoneCheckResultImpl.a(this.e);
                    break;
                default:
                    this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_HANDLE_REQUEST_FAILURE, jVar));
                    a3 = PhoneCheckResultImpl.a(this.e);
                    break;
            }
            FileLog.v("PhoneNumberChecker", "Check %s completed", bVar.d);
            return a3;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                phoneCheckResult = PhoneCheckResultImpl.a(this.e);
            } else {
                boolean z = cause instanceof IOException;
                if (cause instanceof ServerException) {
                    a2 = PhoneCheckResultImpl.b(this.e);
                } else if (z) {
                    a2 = PhoneCheckResultImpl.c(this.e);
                } else {
                    a2 = PhoneCheckResultImpl.a(this.e);
                }
                this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_HANDLE_SERVER_FAILURE, iVar, cause));
                phoneCheckResult = a2;
            }
            FileLog.e("PhoneNumberChecker", e, "Check %s failed", bVar.d);
            return phoneCheckResult;
        } catch (Throwable th) {
            VerificationApi.PhoneCheckResult a4 = PhoneCheckResultImpl.a(this.e);
            FileLog.e("PhoneNumberChecker", th, "Check %s failed", bVar.d);
            ru.mail.libverify.n0.b.a("PhoneNumberChecker", th, "Check failed", new Object[0]);
            return a4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void a(@NonNull b bVar, @NonNull VerificationApi.PhoneCheckResult phoneCheckResult) {
        if (bVar.c.isEmpty()) {
            return;
        }
        for (Map.Entry<VerificationApi.PhoneCheckListener, String> entry : bVar.c.entrySet()) {
            entry.getKey().onCompleted(entry.getValue(), phoneCheckResult);
        }
    }
}
