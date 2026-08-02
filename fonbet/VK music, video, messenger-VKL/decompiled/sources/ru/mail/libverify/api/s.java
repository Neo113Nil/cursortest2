package ru.mail.libverify.api;

import android.net.Network;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.huawei.hms.framework.common.BundleUtil;
import io.michaelrocks.libphonenumber.android.NumberParseException;
import io.michaelrocks.libphonenumber.android.PhoneNumberUtil;
import io.michaelrocks.libphonenumber.android.Phonenumber$PhoneNumber;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import ru.mail.libverify.InternalApi;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.common.DetailStatus;
import ru.mail.libverify.api.common.Status;
import ru.mail.libverify.api.h;
import ru.mail.libverify.api.model.CodeDeliveryInfo;
import ru.mail.libverify.api.model.CodeDeliveryStatus;
import ru.mail.libverify.api.q;
import ru.mail.libverify.e.d;
import ru.mail.libverify.g.a;
import ru.mail.libverify.j0.j;
import ru.mail.libverify.m.o;
import ru.mail.libverify.n.g;
import ru.mail.libverify.n.l;
import ru.mail.libverify.platform.sms.SmsRetrieverManager;
import ru.mail.libverify.platform.storage.KeyValueStorage;
import ru.mail.libverify.requests.VerifyApiRequest;
import ru.mail.libverify.storage.DecryptionError;
import ru.mail.libverify.utils.Optional;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.ServerException;
import ru.mail.verify.core.utils.components.MessageBus;
import ru.mail.verify.core.utils.json.JsonParseException;
import xsna.awi0;
import xsna.b3n;
import xsna.d8t0;
import xsna.egu0;
import xsna.fnw0;
import xsna.g0;
import xsna.gzs;
import xsna.ho8;
import xsna.j0;
import xsna.j3u0;
import xsna.j630;
import xsna.js6;
import xsna.mf3;
import xsna.o4;
import xsna.pft0;
import xsna.pis0;
import xsna.q0y0;
import xsna.qd0;
import xsna.rl3;
import xsna.sc4;
import xsna.tdj;
import xsna.tje;
import xsna.u7v0;
import xsna.vb;
import xsna.z250;

@InternalApi
/* loaded from: classes9.dex */
public final class s {

    @NonNull
    private final ru.mail.libverify.n.l a;

    @NonNull
    private final ru.mail.libverify.n.g b;

    @NonNull
    private final SmsRetrieverManager c;

    @NonNull
    private final MessageBus d;

    @NonNull
    private final ru.mail.libverify.i0.a e;

    @NonNull
    private final ru.mail.libverify.c.b f;

    @NonNull
    private final p g;

    @NonNull
    private final ru.mail.libverify.u.y h;

    @Nullable
    private ru.mail.libverify.n.e i;

    @Nullable
    private g.a j;

    @Nullable
    private g.a k;

    @Nullable
    private SmsRetrieverManager.SmsRetrieverSmsCallback l;

    @Nullable
    private Future<?> m;

    @Nullable
    private Future<?> n;

    @NonNull
    private final ru.mail.libverify.m0.a r;

    @Nullable
    private final ru.mail.libverify.o.b s;

    @NonNull
    private final k t;
    private final Runnable o = new sc4(this, 18);
    private final Runnable p = new a();

    @NonNull
    private Optional<Runnable> q = Optional.empty();
    private boolean u = false;
    private boolean v = false;

    @Nullable
    private String w = null;

    @Nullable
    private String x = null;

    @Nullable
    private String y = null;

    @Nullable
    private String z = null;

    @Nullable
    private String A = null;

    @Nullable
    private String B = null;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (s.this.g.e() == null) {
                FileLog.e("VerificationSession", "wait for verify answer timeout expired");
                s sVar = s.this;
                sVar.getClass();
                sVar.a(sVar.a(VerificationApi.VerificationState.FAILED, VerificationApi.VerificationSource.UNKNOWN, sVar.t.c(), sVar.g.e()));
            }
        }
    }

    public static /* synthetic */ class b {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;
        static final /* synthetic */ int[] d;
        static final /* synthetic */ int[] e;

        static {
            int[] iArr = new int[VerificationApi.VerificationSource.values().length];
            e = iArr;
            try {
                iArr[VerificationApi.VerificationSource.APPLICATION_LOCAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                e[VerificationApi.VerificationSource.SMS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                e[VerificationApi.VerificationSource.CALL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                e[VerificationApi.VerificationSource.APPLICATION_EXTERNAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                e[VerificationApi.VerificationSource.USER_INPUT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                e[VerificationApi.VerificationSource.ALREADY_VERIFIED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                e[VerificationApi.VerificationSource.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[VerificationApi.VerificationState.values().length];
            d = iArr2;
            try {
                iArr2[VerificationApi.VerificationState.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                d[VerificationApi.VerificationState.VERIFYING_PHONE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                d[VerificationApi.VerificationState.SUSPENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                d[VerificationApi.VerificationState.WAITING_FOR_SMS_CODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                d[VerificationApi.VerificationState.VERIFYING_SMS_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                d[VerificationApi.VerificationState.SUCCEEDED.ordinal()] = 6;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                d[VerificationApi.VerificationState.FAILED.ordinal()] = 7;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                d[VerificationApi.VerificationState.FINAL.ordinal()] = 8;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr3 = new int[DetailStatus.values().length];
            c = iArr3;
            try {
                iArr3[DetailStatus.NO_CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                c[DetailStatus.INCORRECT_CODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            int[] iArr4 = new int[Status.values().length];
            b = iArr4;
            try {
                iArr4[Status.OK.ordinal()] = 1;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                b[Status.VERIFIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                b[Status.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                b[Status.NOT_ENOUGH_DATA.ordinal()] = 4;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                b[Status.ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                b[Status.PHONE_NUMBER_IN_BLACK_LIST.ordinal()] = 6;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                b[Status.INCORRECT_PHONE_NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                b[Status.PHONE_NUMBER_TYPE_NOT_ALLOWED.ordinal()] = 8;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                b[Status.UNSUPPORTED_NUMBER.ordinal()] = 9;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                b[Status.RATELIMIT.ordinal()] = 10;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                b[Status.ATTEMPTLIMIT.ordinal()] = 11;
            } catch (NoSuchFieldError unused28) {
            }
            int[] iArr5 = new int[VerifyApiRequest.VerifyChecks.values().length];
            a = iArr5;
            try {
                iArr5[VerifyApiRequest.VerifyChecks.MESSENGER.ordinal()] = 1;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                a[VerifyApiRequest.VerifyChecks.CALLIN.ordinal()] = 2;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                a[VerifyApiRequest.VerifyChecks.CALLUI.ordinal()] = 3;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                a[VerifyApiRequest.VerifyChecks.SMS.ordinal()] = 4;
            } catch (NoSuchFieldError unused32) {
            }
        }
    }

    public interface c {
        VerificationApi.VerificationStateDescriptor a() throws ExecutionException, InterruptedException;
    }

    public s(@NonNull ru.mail.libverify.n.l lVar, @NonNull ru.mail.libverify.n.g gVar, @NonNull SmsRetrieverManager smsRetrieverManager, @NonNull ru.mail.libverify.c.b bVar, @NonNull String str, @NonNull ru.mail.libverify.e.g gVar2, @Nullable String str2, @Nullable String str3, @NonNull ru.mail.libverify.i0.a aVar, @Nullable Map<String, String> map, @Nullable String str4, @Nullable ru.mail.libverify.l.d dVar, @NonNull ru.mail.libverify.m0.a aVar2, @Nullable ru.mail.libverify.o.b bVar2) {
        this.a = lVar;
        this.b = gVar;
        this.c = smsRetrieverManager;
        this.f = bVar;
        q.d dVar2 = (q.d) bVar;
        this.d = dVar2.a();
        this.e = aVar;
        byte[] bArr = new byte[16];
        new SecureRandom().nextBytes(bArr);
        this.g = new p(str, gVar2, str2, str3, ru.mail.libverify.n0.e.a(bArr), map, str4, dVar);
        this.h = new ru.mail.libverify.u.y(dVar2);
        this.r = aVar2;
        this.s = bVar2;
        this.t = dVar2.e().y();
    }

    private void F() {
        if (this.j == null) {
            z250 z250Var = new z250(this, 14);
            this.j = z250Var;
            ((ru.mail.libverify.n.h) this.b).a(z250Var);
        }
        if (this.k == null) {
            awi0 awi0Var = new awi0(this, 21);
            this.k = awi0Var;
            ((ru.mail.libverify.n.h) this.b).a(new j630(this, 27), awi0Var);
        }
    }

    private void G() {
        if (this.i != null) {
            return;
        }
        this.i = ((ru.mail.libverify.n.m) this.a).a().a(new l.a() { // from class: xsna.ecz0
            @Override // ru.mail.libverify.n.l.a
            public final void a(ru.mail.libverify.n.b bVar) {
                ru.mail.libverify.api.s.this.a(bVar);
            }
        }).a();
    }

    private void H() {
        if (this.l != null) {
            return;
        }
        SmsRetrieverManager.SmsRetrieverSmsCallback smsRetrieverSmsCallback = new SmsRetrieverManager.SmsRetrieverSmsCallback() { // from class: xsna.fcz0
            @Override // ru.mail.libverify.platform.sms.SmsRetrieverManager.SmsRetrieverSmsCallback
            public final void onIncomingSms(String str) {
                ru.mail.libverify.api.s.this.e(str);
            }
        };
        this.l = smsRetrieverSmsCallback;
        this.c.register(smsRetrieverSmsCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void K() {
        VerificationApi.VerificationStateDescriptor verificationStateDescriptor = null;
        switch (b.d[this.g.state.ordinal()]) {
            case 1:
                verificationStateDescriptor = new VerificationApi.VerificationStateDescriptor(VerificationApi.VerificationState.VERIFYING_PHONE_NUMBER, this.g.h());
                ((q.d) this.f).b().postDelayed(this.p, this.g.c());
                break;
            case 2:
                G();
                F();
                H();
                verificationStateDescriptor = p();
                break;
            case 3:
            case 4:
                G();
                F();
                H();
                if (this.g.e() == null) {
                    verificationStateDescriptor = new VerificationApi.VerificationStateDescriptor(VerificationApi.VerificationState.VERIFYING_PHONE_NUMBER, null, this.g.h(), this.g.d(), this.g.e);
                } else if (!TextUtils.isEmpty(this.g.e().w())) {
                    VerificationApi.VerificationState verificationState = VerificationApi.VerificationState.SUCCEEDED;
                    p pVar = this.g;
                    verificationStateDescriptor = a(verificationState, pVar.smsCodeSource, VerificationApi.FailReason.OK, pVar.e());
                } else if (!TextUtils.isEmpty(this.g.smsCode)) {
                    VerificationApi.VerificationState verificationState2 = VerificationApi.VerificationState.VERIFYING_SMS_CODE;
                    p pVar2 = this.g;
                    verificationStateDescriptor = a(verificationState2, pVar2.smsCodeSource, VerificationApi.FailReason.OK, pVar2.e());
                } else if (this.g.rawSmsTexts.isEmpty()) {
                    p pVar3 = this.g;
                    if (pVar3.callFragmentTemplate != null) {
                        if (((ru.mail.libverify.n.h) this.b).a(pVar3.userProvidedPhoneNumber)) {
                            FileLog.d("VerificationSession", "start checking last calls");
                            ((ru.mail.libverify.n.h) this.b).a(new t(this));
                        } else {
                            FileLog.d("VerificationSession", "skip checking last calls (call is not possible)");
                        }
                    }
                } else if (!this.g.rawSmsTexts.isEmpty()) {
                    FileLog.d("VerificationSession", "verifyRawText %s", Arrays.toString(this.g.rawSmsTexts.toArray()));
                    Iterator<String> it = this.g.rawSmsTexts.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            String next = it.next();
                            int i = b.e[this.g.smsCodeSource.ordinal()];
                            if (i == 1 || i == 2) {
                                ru.mail.libverify.d0.a.a().e().getClass();
                                next = h.c(next, l());
                            } else if (i != 3) {
                                FileLog.e("VerificationSession", "Illegal state %s for a sms code restoring from a raw text", this.g.smsCodeSource);
                                next = null;
                            } else if (!h.b(next, d())) {
                                ru.mail.libverify.d0.a.a().e().getClass();
                                next = h.c(next, e());
                            }
                            if (!TextUtils.isEmpty(next)) {
                                a(next, (String) null, this.g.smsCodeSource);
                            }
                        }
                    }
                }
                if (this.g.state == VerificationApi.VerificationState.WAITING_FOR_SMS_CODE) {
                    ((q.d) this.f).b().removeCallbacks(this.p);
                    break;
                }
                break;
            case 5:
                try {
                    verificationStateDescriptor = o();
                    break;
                } catch (MalformedURLException e) {
                    FileLog.e("VerificationSession", "On verifying sms code handle exception", e);
                    verificationStateDescriptor = g();
                    break;
                }
            case 6:
            case 7:
                VerificationApi.VerificationState verificationState3 = VerificationApi.VerificationState.FINAL;
                p pVar4 = this.g;
                verificationStateDescriptor = a(verificationState3, pVar4.smsCodeSource, pVar4.reason, pVar4.e());
                break;
            case 8:
                if (this.m != null) {
                    FileLog.v("VerificationSession", "cancel main request");
                    this.m.cancel(true);
                    this.m = null;
                }
                ((q.d) this.f).b().removeCallbacks(this.p);
                ru.mail.libverify.n.e eVar = this.i;
                if (eVar != null) {
                    eVar.a();
                    this.i = null;
                }
                g.a aVar = this.j;
                if (aVar != null) {
                    ((ru.mail.libverify.n.h) this.b).b(aVar);
                    this.j = null;
                }
                g.a aVar2 = this.k;
                if (aVar2 != null) {
                    ((ru.mail.libverify.n.h) this.b).c(aVar2);
                    this.k = null;
                }
                SmsRetrieverManager.SmsRetrieverSmsCallback smsRetrieverSmsCallback = this.l;
                if (smsRetrieverSmsCallback != null) {
                    this.c.unregister(smsRetrieverSmsCallback);
                    this.l = null;
                    break;
                }
                break;
            default:
                throw new IllegalArgumentException("Undefined state for current session");
        }
        a(verificationStateDescriptor);
    }

    private void L() {
        p pVar = this.g;
        this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFICATION_SESSION_STATE_CHANGED, this.g.id, a(pVar.state, pVar.smsCodeSource, pVar.reason, pVar.e())));
    }

    public final void E() {
        FileLog.v("VerificationSession", "session %s verified from other instance", this.g.id);
        if (this.g.b()) {
            FileLog.e("VerificationSession", "failed to modify session state after completion");
            return;
        }
        this.g.a((ru.mail.libverify.m.o) null);
        p pVar = this.g;
        pVar.callFragmentTemplate = null;
        pVar.smsCodeSource = VerificationApi.VerificationSource.APPLICATION_EXTERNAL;
        L();
        K();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (((r0 == null || (r0 = r0.k()) == null) ? null : (ru.mail.libverify.requests.VerifyApiRequest.VerifyChecks) xsna.rl3.b0(r0)) != ru.mail.libverify.requests.VerifyApiRequest.VerifyChecks.MESSENGER) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void I() {
        FileLog.v("VerificationSession", "session %s new sms code requested", this.g.id);
        if (this.g.b()) {
            FileLog.e("VerificationSession", "failed to modify session state after completion");
            return;
        }
        ru.mail.libverify.e.d dVar = this.g.e;
        boolean z = dVar instanceof d.b;
        boolean z2 = dVar instanceof d.a;
        boolean z3 = dVar instanceof d.e;
        boolean z4 = dVar instanceof d.C2194d;
        if (!z && !z2 && !z3) {
            if (z4) {
                ru.mail.libverify.m.o e = f().e();
            }
            this.g.a((ru.mail.libverify.m.o) null);
            p pVar = this.g;
            pVar.callFragmentTemplate = null;
            pVar.smsCodeSource = VerificationApi.VerificationSource.UNKNOWN;
            pVar.smsCode = null;
            pVar.incorrectSmsCode = null;
            pVar.a(ru.mail.libverify.e.g.c());
            this.g.d = null;
            this.q = Optional.of(new mf3(this, 16));
            this.g.rawSmsTexts.clear();
            FileLog.v("VerificationSession", "session %s reset verification error", this.g.id);
            p pVar2 = this.g;
            if (pVar2.state == VerificationApi.VerificationState.WAITING_FOR_SMS_CODE && pVar2.reason == VerificationApi.FailReason.INCORRECT_SMS_CODE) {
                pVar2.reason = VerificationApi.FailReason.OK;
            }
            L();
            K();
            return;
        }
        FileLog.e("VerificationSession", "Route %s not permit resend!", this.g.e.getClass().getName());
    }

    public final void J() {
        if (this.g.b()) {
            FileLog.e("VerificationSession", "failed to modify session state after completion");
            return;
        }
        FileLog.v("VerificationSession", "session %s reset verification error", this.g.id);
        p pVar = this.g;
        if (pVar.state == VerificationApi.VerificationState.WAITING_FOR_SMS_CODE && pVar.reason == VerificationApi.FailReason.INCORRECT_SMS_CODE) {
            pVar.reason = VerificationApi.FailReason.OK;
            L();
        }
    }

    public final void M() {
        K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void A() {
        p pVar = this.g;
        if (pVar.state != VerificationApi.VerificationState.VERIFYING_PHONE_NUMBER || pVar.e() == null) {
            return null;
        }
        this.q.ifPresent(new pft0(4));
        a(a(VerificationApi.VerificationState.WAITING_FOR_SMS_CODE, VerificationApi.VerificationSource.UNKNOWN, VerificationApi.FailReason.OK, this.g.e()));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void B() {
        FileLog.d("VerificationSession", "End waiting route time because timeout is expired");
        p pVar = this.g;
        pVar.waitForRoutesTimestamp = null;
        egu0 egu0Var = new egu0(this, 7);
        ru.mail.libverify.e.d dVar = pVar.d;
        if (dVar != null) {
            a(dVar.a(), egu0Var);
        } else {
            egu0Var.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void C() {
        p pVar = this.g;
        if (pVar.state == VerificationApi.VerificationState.WAITING_FOR_SMS_CODE && (pVar.e instanceof d.f)) {
            FileLog.d("VerificationSession", "Fallback timeout expired! In session %s", this);
            L();
            K();
        }
    }

    private void a(VerifyApiRequest.VerifyChecks verifyChecks, @NonNull gzs<Void> gzsVar) {
        VerifyApiRequest.VerifyChecks[] k;
        ru.mail.libverify.m.o e = f().e();
        if (((e == null || (k = e.k()) == null) ? null : (VerifyApiRequest.VerifyChecks) rl3.b0(k)) == verifyChecks) {
            a(new VerificationApi.VerificationStateDescriptor(VerificationApi.VerificationState.FAILED, VerificationApi.FailReason.NO_MORE_ROUTES, this.g.h()));
        } else {
            gzsVar.invoke();
        }
    }

    private void c(@Nullable Integer num) {
        if (num != null) {
            if (this.y != null) {
                FileLog.d("VerificationSession", "End waiting sms time");
                this.r.a(this.y);
            }
            this.y = this.r.a(((q.d) this.f).b(), num.intValue(), new j0(this, 23));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean d(String str) {
        if (str == null) {
            return false;
        }
        return this.g.callInNumbers.contains(b(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ru.mail.libverify.d0.a.a().e().getClass();
        a(h.c(str, l()), str, VerificationApi.VerificationSource.SMS_RETRIEVER);
    }

    @Nullable
    private h.a l() {
        h.a aVar = new h.a();
        HashSet hashSet = new HashSet();
        if (this.g.e() != null) {
            if (!TextUtils.isEmpty(this.g.e().u())) {
                hashSet.add(this.g.e().u());
            }
            if (!TextUtils.isEmpty(this.g.e().r())) {
                hashSet.add(this.g.e().r());
            }
        }
        int size = hashSet.size();
        String[] strArr = new String[size];
        hashSet.toArray(strArr);
        if (this.g.e() != null && size > 0) {
            aVar.b = strArr;
            aVar.c = this.g.e().l();
            aVar.d = this.g.e().m();
            return aVar;
        }
        String language = ((q.d) this.f).e().d().getLanguage();
        String a2 = a("verification_session_last_saved_sms_template", language);
        if (TextUtils.isEmpty(a2)) {
            FileLog.d("VerificationSession", "getSmsCodeParseData - there is no saved pattern. try to get default one.");
            a2 = this.g.a(language);
            if (TextUtils.isEmpty(a2)) {
                FileLog.e("VerificationSession", "getSmsCodeParseData - can't parse incoming sms without pattern");
                return null;
            }
        }
        aVar.b = new String[]{a2};
        String a3 = a("verification_session_last_saved_code_type", language);
        if (!TextUtils.isEmpty(a3)) {
            aVar.d = o.a.valueOf(a3);
        }
        String a4 = a("verification_session_last_saved_code_length", language);
        if (!TextUtils.isEmpty(a4)) {
            try {
                aVar.c = Integer.parseInt(a4);
            } catch (NumberFormatException unused) {
            }
        }
        return aVar;
    }

    @Nullable
    private VerificationApi.VerificationStateDescriptor o() throws MalformedURLException {
        if (!((q.d) this.f).e().D().b()) {
            FileLog.d("VerificationSession", "handleAttemptState start disallowed");
            return a(VerificationApi.VerificationState.SUSPENDED, VerificationApi.VerificationSource.UNKNOWN, this.t.c(), this.g.e());
        }
        Future<?> future = this.m;
        if (future != null) {
            if (!future.isDone() && !this.m.isCancelled()) {
                FileLog.d("VerificationSession", "hasRunningRequest request has been already started");
                return null;
            }
            FileLog.d("VerificationSession", "hasRunningRequest cancel previous request");
            this.m.cancel(true);
        }
        if (this.g.e() != null) {
            p pVar = this.g;
            if (pVar.smsCode != null) {
                String y = pVar.e().y();
                if (TextUtils.isEmpty(y)) {
                    FileLog.e("VerificationSession", "handleAttemptState not enough data to call attempt api method (verificationUrl is null)");
                    if (!TextUtils.isEmpty(this.g.userId)) {
                        return null;
                    }
                    FileLog.e("VerificationSession", "Verification url can be empty only on userid auth");
                    return g();
                }
                FileLog.d("VerificationSession", "handleAttemptState start request");
                p pVar2 = this.g;
                ru.mail.libverify.requests.a aVar = new ru.mail.libverify.requests.a(((q.d) this.f).e(), y, pVar2.smsCode, pVar2.smsCodeSource);
                this.m = aVar.a(((q.d) this.f).d(), ((q.d) this.f).b(), new j3u0(this, aVar));
                return null;
            }
        }
        FileLog.e("VerificationSession", "handleAttemptState not enough data to call attempt api method (response: %s, code: %s)", this.g.e(), this.g.smsCode);
        return null;
    }

    @Nullable
    private VerificationApi.VerificationStateDescriptor p() {
        if (this.g.waitForRoutesTimestamp != null) {
            return null;
        }
        if (!((q.d) this.f).e().D().b()) {
            FileLog.d("VerificationSession", "handleVerifyState start disallowed (verified before: %s)", Boolean.valueOf(this.g.h()));
            return this.g.h() ? a(VerificationApi.VerificationState.SUSPENDED, VerificationApi.VerificationSource.UNKNOWN, this.t.c(), this.g.e()) : a(VerificationApi.VerificationState.FAILED, VerificationApi.VerificationSource.UNKNOWN, this.t.c(), this.g.e());
        }
        Future<?> future = this.m;
        if (future != null) {
            if (!future.isDone() && !this.m.isCancelled()) {
                FileLog.d("VerificationSession", "hasRunningRequest request has been already started");
                return null;
            }
            FileLog.d("VerificationSession", "hasRunningRequest cancel previous request");
            this.m.cancel(true);
        }
        FileLog.d("VerificationSession", "handleVerifyState start request");
        VerifyApiRequest.VerifyChecks[] d = new ru.mail.libverify.c.f(this.g.g(), this.g.verifySessionSettings).a(this.b, this.g.userProvidedPhoneNumber).c().a(((q.d) this.f).e()).a().b().d();
        if (d.length == 0) {
            return a(VerificationApi.VerificationState.FAILED, VerificationApi.VerificationSource.UNKNOWN, VerificationApi.FailReason.UNSUPPORTED_NUMBER.a("Checks param should contain any items"), null);
        }
        boolean z = this.g.g().e() == ru.mail.libverify.e.b.MANUAL;
        boolean z2 = this.g.g().e() == ru.mail.libverify.e.b.RESEND;
        ru.mail.libverify.u.w e = ((q.d) this.f).e();
        p pVar = this.g;
        String str = pVar.id;
        String str2 = pVar.verificationService;
        String str3 = pVar.userProvidedPhoneNumber;
        String str4 = pVar.userId;
        VerifyApiRequest.a f = pVar.g().f();
        String str5 = this.g.srcApplication;
        String b2 = this.h.b();
        ru.mail.libverify.l.d dVar = this.g.verifySessionSettings;
        VerifyApiRequest verifyApiRequest = new VerifyApiRequest(e, str, str2, str3, str4, d, f, str5, z, b2, dVar == null ? null : dVar.d(), z2);
        this.m = verifyApiRequest.a(((q.d) this.f).d(), ((q.d) this.f).b(), new b3n(this, verifyApiRequest));
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void q() {
        this.g.d = null;
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void r() {
        this.g.e = null;
        this.q = Optional.empty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void s() {
        L();
        K();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t() {
        p pVar = this.g;
        if (pVar.state == VerificationApi.VerificationState.WAITING_FOR_SMS_CODE && (pVar.e instanceof d.a)) {
            FileLog.d("VerificationSession", "Fallback timeout expired! In session %s", this);
            a(VerifyApiRequest.VerifyChecks.CALLIN, new u7v0(this, 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void u() {
        L();
        K();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        p pVar = this.g;
        if (pVar.state == VerificationApi.VerificationState.WAITING_FOR_SMS_CODE && (pVar.e instanceof d.b)) {
            FileLog.d("VerificationSession", "Fallback timeout expired! In session %s", this);
            a(VerifyApiRequest.VerifyChecks.CALLUI, new pis0(this, 22));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void w() {
        L();
        K();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x() {
        p pVar = this.g;
        if (pVar.state == VerificationApi.VerificationState.WAITING_FOR_SMS_CODE && (pVar.e instanceof d.C2194d)) {
            FileLog.d("VerificationSession", "Fallback timeout expired! In session %s", this);
            a(VerifyApiRequest.VerifyChecks.MESSENGER, new fnw0(this, 3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void y() {
        L();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z() {
        p pVar = this.g;
        if (pVar.state == VerificationApi.VerificationState.WAITING_FOR_SMS_CODE && (pVar.e instanceof d.e)) {
            FileLog.d("VerificationSession", "MobileID fallback timeout expired! In session %s", this);
            a(VerifyApiRequest.VerifyChecks.MOBILEID, new d8t0(this, 15));
        }
    }

    public final void D() {
        if (this.m != null) {
            FileLog.v("VerificationSession", "cancel main request");
            this.m.cancel(true);
            this.m = null;
        }
        FileLog.v("VerificationSession", "onNetworkBecameAvailable");
        K();
    }

    public final void b(@NonNull String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            FileLog.e("VerificationSession", "verifySmsText smsText can't be empty");
        } else {
            ru.mail.libverify.d0.a.a().e().getClass();
            a(h.c(str, l()), str, z ? VerificationApi.VerificationSource.APPLICATION_LOCAL : VerificationApi.VerificationSource.SMS);
        }
    }

    @NonNull
    public final p f() {
        return this.g;
    }

    public final void g(@NonNull String str) {
        a(str, true);
    }

    @NonNull
    public final String h() {
        return this.g.id;
    }

    @NonNull
    public final ArrayList<ru.mail.libverify.d.b> i() {
        return this.g.mobileIdRoutes;
    }

    @NonNull
    public final String j() throws JsonParseException {
        return ru.mail.libverify.q0.a.f(this.g);
    }

    @NonNull
    public final String k() {
        return this.g.verificationService;
    }

    @NonNull
    public final VerificationApi.VerificationStateDescriptor m() {
        p pVar = this.g;
        return a(pVar.state, pVar.smsCodeSource, pVar.reason, pVar.e());
    }

    public final long n() {
        return this.g.startTimeStamp;
    }

    @NonNull
    private h.a d() {
        h.a aVar = new h.a();
        ru.mail.libverify.e.d dVar = this.g.e;
        if ((dVar instanceof d.b) && !TextUtils.isEmpty(((d.b) dVar).e())) {
            aVar.a = new String[]{((d.b) this.g.e).e()};
            return aVar;
        }
        String[] strArr = this.g.callFragmentTemplate;
        if (strArr != null && strArr.length != 0) {
            aVar.a = strArr;
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f(@Nullable String str) {
        if (str == null) {
            return false;
        }
        this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFICATION_SESSION_CALL_IN_EXECUTED, this.g.id, str));
        return true;
    }

    @NonNull
    private VerificationApi.VerificationStateDescriptor g() {
        return new VerificationApi.VerificationStateDescriptor(VerificationApi.VerificationState.FAILED, this.t.a(), this.g.h());
    }

    public final void h(@NonNull String str) {
        a(str, (String) null, VerificationApi.VerificationSource.USER_INPUT);
    }

    private void c(int i) {
        a((String) null);
        long j = i;
        this.g.waitForRoutesTimestamp = Long.valueOf(this.e.b() + j);
        FileLog.d("VerificationSession", "Start waiting route %s ms", Integer.valueOf(i));
        this.w = this.r.a(((q.d) this.f).b(), j, new js6(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(ru.mail.libverify.n.b bVar) {
        ru.mail.libverify.d0.a.a().e().getClass();
        a(h.c(bVar.c(), l()), bVar.c(), VerificationApi.VerificationSource.SMS);
    }

    @Nullable
    private h.a e() {
        h.a aVar = new h.a();
        aVar.d = o.a.NUMERIC;
        if (this.g.e() != null && this.g.e().j() != null && this.g.e().j().length != 0) {
            aVar.b = this.g.e().j();
            aVar.c = this.g.e().l();
            return aVar;
        }
        String value = ((q.d) this.f).c().getValue("verification_session_last_saved_call_template");
        if (TextUtils.isEmpty(value)) {
            FileLog.e("VerificationSession", "getCallParseData - can't parse incoming call without pattern");
            return null;
        }
        try {
            aVar.b = (String[]) ru.mail.libverify.q0.a.a(value, String[].class);
        } catch (JsonParseException e) {
            ru.mail.libverify.n0.b.a("VerificationSession", "filed to read saved templates", e);
        }
        String[] strArr = aVar.b;
        if (strArr != null && strArr.length != 0) {
            String a2 = a("verification_session_last_saved_code_length", ((q.d) this.f).e().d().getLanguage());
            if (!TextUtils.isEmpty(a2)) {
                try {
                    aVar.c = Integer.parseInt(a2);
                } catch (NumberFormatException unused) {
                }
            }
            return aVar;
        }
        FileLog.e("VerificationSession", "getCallParseData - wrong saved pattern detected");
        return null;
    }

    public final void b(@NonNull VerificationApi.IvrStateListener ivrStateListener) {
        FileLog.v("VerificationSession", "session %s ivr call requested", this.g.id);
        p pVar = this.g;
        if (pVar.state == VerificationApi.VerificationState.WAITING_FOR_SMS_CODE) {
            a(ivrStateListener);
        } else {
            FileLog.e("VerificationSession", "session %s wrong state for ivr call detected", pVar.id);
            ivrStateListener.onRequestExecuted(this.t.a());
        }
    }

    private void c() {
        if (this.x != null) {
            FileLog.d("VerificationSession", "End waiting mobile_id time");
            this.r.a(this.x);
        }
    }

    public final void a() {
        FileLog.v("VerificationSession", "cancel session");
        if (this.A != null) {
            FileLog.d("VerificationSession", "End waiting callin time");
            this.r.a(this.A);
        }
        if (this.z != null) {
            FileLog.d("VerificationSession", "End waiting callui time");
            this.r.a(this.z);
        }
        if (this.y != null) {
            FileLog.d("VerificationSession", "End waiting sms time");
            this.r.a(this.y);
        }
        c();
        b();
        a((String) null);
        if (this.m != null) {
            FileLog.v("VerificationSession", "cancel main request");
            this.m.cancel(true);
            this.m = null;
        }
        if (this.n != null) {
            FileLog.v("VerificationSession", "cancel ivr request");
            this.n.cancel(true);
            this.n = null;
        }
        ((q.d) this.f).b().removeCallbacks(this.p);
        this.g.a(VerificationApi.VerificationState.FINAL, VerificationApi.FailReason.OK, this.e.b());
        K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean c(String str) {
        return a(str, true);
    }

    private void b(@Nullable ru.mail.libverify.e.d dVar) {
        p pVar = this.g;
        pVar.e = dVar;
        pVar.d = null;
        if (dVar != null) {
            VerifyApiRequest.VerifyChecks a2 = dVar.a();
            p pVar2 = this.g;
            CodeDeliveryInfo codeDeliveryInfo = pVar2.f;
            pVar2.g = codeDeliveryInfo;
            if (codeDeliveryInfo == null) {
                pVar2.f = new CodeDeliveryInfo(a2, CodeDeliveryStatus.UNKNOWN);
            } else {
                CodeDeliveryStatus status = codeDeliveryInfo.getStatus();
                CodeDeliveryStatus codeDeliveryStatus = CodeDeliveryStatus.UNKNOWN;
                if (status == codeDeliveryStatus) {
                    p pVar3 = this.g;
                    pVar3.f = new CodeDeliveryInfo(pVar3.f.getRouteType(), CodeDeliveryStatus.NOT_DELIVERED);
                } else {
                    this.g.f = new CodeDeliveryInfo(a2, codeDeliveryStatus);
                }
            }
            p pVar4 = this.g;
            pVar4.waitForRoutesTimestamp = null;
            if (pVar4.state != VerificationApi.VerificationState.VERIFYING_PHONE_NUMBER || pVar4.e() == null) {
                return;
            }
            a(a(VerificationApi.VerificationState.WAITING_FOR_SMS_CODE, VerificationApi.VerificationSource.UNKNOWN, VerificationApi.FailReason.OK, this.g.e()));
        }
    }

    private void b() {
        if (this.B != null) {
            FileLog.d("VerificationSession", "End waiting messenger time");
            this.r.a(this.B);
        }
    }

    public s(@NonNull ru.mail.libverify.n.l lVar, @NonNull ru.mail.libverify.n.g gVar, @NonNull SmsRetrieverManager smsRetrieverManager, @NonNull ru.mail.libverify.i0.a aVar, @NonNull ru.mail.libverify.c.b bVar, @NonNull String str, @NonNull ru.mail.libverify.m0.a aVar2, @Nullable ru.mail.libverify.o.b bVar2) throws JsonParseException, IllegalStateException {
        this.a = lVar;
        this.b = gVar;
        this.c = smsRetrieverManager;
        this.f = bVar;
        this.e = aVar;
        q.d dVar = (q.d) bVar;
        this.d = dVar.a();
        this.g = (p) ru.mail.libverify.q0.a.a(str, p.class);
        this.h = new ru.mail.libverify.u.y(dVar);
        this.r = aVar2;
        this.s = bVar2;
        this.t = dVar.e().y();
    }

    private void b(int i) {
        c();
        this.x = this.r.a(((q.d) this.f).b(), i, new o4(this, 26));
    }

    private void b(@NonNull Integer num) {
        b();
        this.B = this.r.a(((q.d) this.f).b(), num.intValue(), new qd0(this, 23));
    }

    @NonNull
    private VerificationApi.VerificationStateDescriptor b(@NonNull ru.mail.libverify.m.o oVar) {
        boolean z;
        FileLog.v("VerificationSession", "session with id = %s received VerifyApiResponse response = %s", this.g.id, oVar.toString());
        this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFICATION_SESSION_FETCHER_INFO_RECEIVED, oVar.n()));
        this.g.a(oVar);
        if (oVar.g() == Status.VERIFIED) {
            p pVar = this.g;
            if (pVar.smsCodeSource == VerificationApi.VerificationSource.UNKNOWN) {
                pVar.smsCodeSource = VerificationApi.VerificationSource.ALREADY_VERIFIED;
            }
        }
        if (this.g.e() != null && this.g.e().i() != null) {
            p pVar2 = this.g;
            pVar2.callFragmentTemplate = pVar2.e().i();
        }
        String a2 = ru.mail.libverify.n0.e.a(((q.d) this.f).e().d());
        boolean z2 = false;
        if (oVar.j() == null || oVar.j().length == 0) {
            z = false;
        } else {
            try {
                a("verification_session_last_saved_call_template", ru.mail.libverify.q0.a.f(oVar.j()), a2);
            } catch (JsonParseException e) {
                ru.mail.libverify.n0.b.a("VerificationSession", "failed to save call templates", e);
            }
            z = true;
        }
        if (!TextUtils.isEmpty(oVar.u())) {
            a("verification_session_last_saved_sms_template", oVar.u(), a2);
            z = true;
        }
        if (oVar.m() != null) {
            a("verification_session_last_saved_code_type", oVar.m().toString(), a2);
            z = true;
        }
        if (oVar.l() != 0) {
            a("verification_session_last_saved_code_length", Integer.toString(oVar.l()), a2);
            z = true;
        }
        if (z) {
            ((q.d) this.f).c().commit();
        }
        L();
        ru.mail.libverify.m.l s = oVar.s();
        if (s != null) {
            try {
                String b2 = s.b();
                String a3 = s.a();
                if (!TextUtils.isEmpty(b2) && !TextUtils.isEmpty(a3)) {
                    this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.SAFETY_NET_RESPONE_RECEIVED, ((q.d) this.f).e().a(b2, a3)));
                }
            } catch (DecryptionError e2) {
                FileLog.e("VerificationSession", "decrypt SafetyNet error", e2);
            }
        }
        int i = b.b[oVar.g().ordinal()];
        if (i != 1) {
            if (i != 2) {
                this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_HANDLE_REQUEST_FAILURE, oVar));
                return a((ru.mail.libverify.m.c<?, ?>) oVar);
            }
            if (TextUtils.isEmpty(oVar.w())) {
                return g();
            }
            return a(VerificationApi.VerificationState.WAITING_FOR_SMS_CODE, this.g.smsCodeSource, VerificationApi.FailReason.OK, oVar);
        }
        Integer z3 = oVar.z();
        if (z3 != null && z3.intValue() > 0) {
            z2 = true;
        }
        if (z2) {
            c(z3.intValue());
            return a(VerificationApi.VerificationState.VERIFYING_PHONE_NUMBER, VerificationApi.VerificationSource.UNKNOWN, VerificationApi.FailReason.OK, oVar);
        }
        this.q.ifPresent(new pft0(4));
        return a(VerificationApi.VerificationState.WAITING_FOR_SMS_CODE, VerificationApi.VerificationSource.UNKNOWN, VerificationApi.FailReason.OK, oVar);
    }

    private void a(@Nullable String str, @Nullable String str2, VerificationApi.VerificationSource verificationSource) {
        if (TextUtils.isEmpty(str)) {
            FileLog.d("VerificationSession", "empty sms code received");
            if (TextUtils.isEmpty(str2) || this.g.rawSmsTexts.contains(str2)) {
                return;
            }
            p pVar = this.g;
            pVar.smsCodeSource = verificationSource;
            pVar.rawSmsTexts.add(str2);
            FileLog.d("VerificationSession", "save raw sms text %s for further processing", Arrays.toString(this.g.rawSmsTexts.toArray()));
            L();
            return;
        }
        if (TextUtils.equals(this.g.smsCode, str)) {
            FileLog.d("VerificationSession", "provided sms code: %s is equal to the last stored one", str);
            return;
        }
        if (TextUtils.equals(this.g.incorrectSmsCode, str)) {
            p pVar2 = this.g;
            VerificationApi.VerificationSource verificationSource2 = pVar2.smsCodeSource;
            if (verificationSource2 == VerificationApi.VerificationSource.USER_INPUT) {
                a(a(VerificationApi.VerificationState.WAITING_FOR_SMS_CODE, verificationSource2, VerificationApi.FailReason.INCORRECT_SMS_CODE, pVar2.e()));
                return;
            }
            return;
        }
        if (this.g.b()) {
            FileLog.e("VerificationSession", "failed to modify session state after completion");
            return;
        }
        FileLog.v("VerificationSession", "received code: %s", str);
        p pVar3 = this.g;
        pVar3.reason = VerificationApi.FailReason.OK;
        pVar3.smsCode = str;
        pVar3.smsCodeSource = verificationSource;
        pVar3.rawSmsTexts.clear();
        L();
        if (this.m != null) {
            FileLog.v("VerificationSession", "cancel main request");
            this.m.cancel(true);
            this.m = null;
        }
        K();
    }

    public final void a(@NonNull ru.mail.libverify.m.o oVar) {
        FileLog.v("VerificationSession", "session %s verify delayed response: %s", this.g.id, oVar);
        if (this.g.b()) {
            FileLog.e("VerificationSession", "failed to modify session state after completion");
        } else if (!TextUtils.equals(oVar.t(), this.g.id) && !TextUtils.equals(oVar.o(), ru.mail.libverify.n0.e.f(this.g.id))) {
            FileLog.e("VerificationSession", "session %s didn't matched delayed verify response", this.g.id);
        } else {
            a(b(oVar));
        }
    }

    public final void a(@NonNull a.e eVar, Boolean bool) {
        if (this.u) {
            return;
        }
        this.u = true;
        if (!bool.booleanValue()) {
            VerifyApiRequest.VerifyChecks verifyChecks = VerifyApiRequest.VerifyChecks.MOBILEID;
            p pVar = this.g;
            CodeDeliveryInfo codeDeliveryInfo = pVar.f;
            pVar.g = codeDeliveryInfo;
            if (codeDeliveryInfo == null) {
                pVar.f = new CodeDeliveryInfo(verifyChecks, CodeDeliveryStatus.UNKNOWN);
            } else {
                CodeDeliveryStatus status = codeDeliveryInfo.getStatus();
                CodeDeliveryStatus codeDeliveryStatus = CodeDeliveryStatus.UNKNOWN;
                if (status == codeDeliveryStatus) {
                    p pVar2 = this.g;
                    pVar2.f = new CodeDeliveryInfo(pVar2.f.getRouteType(), CodeDeliveryStatus.NOT_DELIVERED);
                } else {
                    this.g.f = new CodeDeliveryInfo(verifyChecks, codeDeliveryStatus);
                }
            }
            this.g.e = new d.e(eVar.c(), eVar.b(), eVar.a());
            L();
            b(eVar.a());
        }
        ru.mail.libverify.o.b bVar = this.s;
        if (bVar != null) {
            bVar.a(eVar.c(), this);
        }
        ru.mail.libverify.u.w e = ((q.d) this.f).e();
        Network network = ru.mail.libverify.j0.g.a().get();
        FileLog.d("ConnectivityHelper", "Result of cellular request: %s", network != null ? network.toString() : null);
        ru.mail.libverify.requests.g gVar = new ru.mail.libverify.requests.g(e.getContext(), e.D(), eVar.c(), network);
        if (network == null) {
            this.g.mobileIdRoutes.add(new ru.mail.libverify.d.b(eVar.c(), -3));
            this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFICATION_SESSION_MOBILEID_RESULTS_RECEIVED, this.g.id, -3));
        } else {
            a(gVar, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(ru.mail.libverify.requests.a aVar, Future future) {
        if (future.isCancelled()) {
            return;
        }
        this.m = null;
        a(a(aVar, future));
    }

    @NonNull
    private String b(@NonNull String str) {
        PhoneNumberUtil q = ((q.d) this.f).e().q();
        try {
            String country = Locale.getDefault().getCountry();
            q.getClass();
            Phonenumber$PhoneNumber phonenumber$PhoneNumber = new Phonenumber$PhoneNumber();
            q.s(str, country, false, phonenumber$PhoneNumber);
            return phonenumber$PhoneNumber.g() + PhoneNumberUtil.h(phonenumber$PhoneNumber);
        } catch (NumberParseException e) {
            FileLog.d("VerificationSession", "Failed to parse number", e);
            return str;
        }
    }

    public final void a(@NonNull ru.mail.libverify.requests.g gVar, @NonNull a.e eVar) {
        gVar.a(((q.d) this.f).d(), ((q.d) this.f).b(), new tje(this, eVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a.e eVar, Future future) {
        int i;
        String str;
        try {
            ru.mail.libverify.m.h hVar = (ru.mail.libverify.m.h) future.get();
            i = hVar.d();
            str = hVar.e();
        } catch (Exception e) {
            e.printStackTrace();
            FileLog.e("VerificationSession", e, "ModileId response error", new Object[0]);
            i = -1;
            str = null;
        }
        if (i >= 300 && i < 400) {
            if (str == null) {
                FileLog.e("VerificationSession", "Failed to parse MobileID headers");
                ru.mail.libverify.o.b bVar = this.s;
                if (bVar != null) {
                    bVar.c(this);
                }
                i = (-1000) - i;
            } else {
                if (eVar.b() > 0) {
                    String uri = URI.create(eVar.c()).resolve(str).toString();
                    FileLog.d("VerificationSession", "MobileID request redirected to %s", uri);
                    ru.mail.libverify.o.b bVar2 = this.s;
                    if (bVar2 != null) {
                        bVar2.a(this, uri, eVar.b());
                    }
                    this.g.mobileIdRoutes.add(new ru.mail.libverify.d.b(eVar.c(), i));
                    eVar.a(uri);
                    eVar.a(eVar.b() - 1);
                    this.u = false;
                    a(eVar, Boolean.TRUE);
                    return;
                }
                FileLog.e("VerificationSession", "MobileID redirects limit is reached");
                ru.mail.libverify.o.b bVar3 = this.s;
                if (bVar3 != null) {
                    bVar3.d(this);
                }
                i = (-2000) - i;
            }
        }
        this.g.mobileIdRoutes.add(new ru.mail.libverify.d.b(eVar.c(), i));
        this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFICATION_SESSION_MOBILEID_RESULTS_RECEIVED, this.g.id, Integer.valueOf(i)));
    }

    public final void a(@NonNull a.c cVar) {
        if (this.v) {
            return;
        }
        this.v = true;
        a(cVar.a(), (String) null, cVar.b() == null ? VerificationApi.VerificationSource.MOBILEID_OK : cVar.b());
    }

    public final void a(@NonNull ru.mail.libverify.m.b bVar) {
        if (Arrays.equals(this.g.callFragmentTemplate, bVar.a())) {
            FileLog.d("VerificationSession", "call info update %s discarded (%s)", bVar, "equal to current");
            return;
        }
        this.g.callFragmentTemplate = bVar.a();
        FileLog.d("VerificationSession", "call info updated %s", bVar);
        L();
        K();
    }

    public final void a(@NonNull CodeDeliveryInfo codeDeliveryInfo) {
        FileLog.d("VerificationSession", "CodeDeliveryInfo info update %s:%s", codeDeliveryInfo.getRouteType().value, codeDeliveryInfo.getStatus());
        p pVar = this.g;
        pVar.g = pVar.f;
        pVar.f = codeDeliveryInfo;
        L();
    }

    public final void a(@NonNull ru.mail.libverify.e.d dVar) {
        this.g.d = dVar;
        FileLog.d("VerificationSession", "unconfirmedRouteInfo info updated %s", dVar);
        if (dVar instanceof d.a) {
            this.g.callInNumbers.add(b(((d.a) dVar).c()));
        }
        if ((dVar instanceof d.b) && (this.g.e instanceof d.b)) {
            b(dVar);
        }
    }

    public final void a(@NonNull ru.mail.libverify.m.k kVar) {
        VerifyApiRequest.VerifyChecks[] k;
        ru.mail.libverify.e.d dVar;
        ru.mail.libverify.e.d dVar2;
        VerifyApiRequest.VerifyChecks fromString = VerifyApiRequest.VerifyChecks.fromString(kVar.i());
        FileLog.d("VerificationSession", "Received next_route: %s", fromString);
        if (fromString == null && (dVar2 = this.g.d) != null && (dVar2 instanceof d.C2194d) && Objects.equals(kVar.i(), ((d.C2194d) this.g.d).d())) {
            fromString = this.g.d.a();
        }
        if (fromString != null) {
            int i = b.a[fromString.ordinal()];
            VerifyApiRequest.VerifyChecks verifyChecks = null;
            if (i == 1) {
                ru.mail.libverify.e.d dVar3 = this.g.d;
                if (dVar3 != null && (dVar3 instanceof d.C2194d)) {
                    d.C2194d c2194d = (d.C2194d) dVar3;
                    a(fromString.value);
                    if (this.z != null) {
                        FileLog.d("VerificationSession", "End waiting callui time");
                        this.r.a(this.z);
                    }
                    if (this.A != null) {
                        FileLog.d("VerificationSession", "End waiting callin time");
                        this.r.a(this.A);
                    }
                    if (this.y != null) {
                        FileLog.d("VerificationSession", "End waiting sms time");
                        this.r.a(this.y);
                    }
                    c();
                    b(c2194d);
                    ru.mail.libverify.m.o e = f().e();
                    if (e != null && (k = e.k()) != null) {
                        verifyChecks = (VerifyApiRequest.VerifyChecks) rl3.b0(k);
                    }
                    if (c2194d.c() != 0 && verifyChecks != VerifyApiRequest.VerifyChecks.MESSENGER) {
                        b(Integer.valueOf(c2194d.c()));
                    } else {
                        b();
                    }
                }
            } else if (i == 2) {
                String str = this.A;
                if (str != null && !this.r.b(str)) {
                    FileLog.d("VerificationSession", "Fallback timeout for last push expired! Push ignored!");
                    b((ru.mail.libverify.e.d) null);
                    ru.mail.libverify.u.w e2 = ((q.d) this.f).e();
                    new ru.mail.libverify.requests.l(e2, ru.mail.libverify.l.c.a(ru.mail.libverify.l.b.CALLIN_EXPIRED, e2.C().c())).a(((q.d) this.f).d(), ((q.d) this.f).b(), null);
                    return;
                }
                ru.mail.libverify.e.d dVar4 = this.g.d;
                if (dVar4 != null && (dVar4 instanceof d.a)) {
                    d.a aVar = (d.a) dVar4;
                    a(fromString.value);
                    if (this.z != null) {
                        FileLog.d("VerificationSession", "End waiting callui time");
                        this.r.a(this.z);
                    }
                    if (this.y != null) {
                        FileLog.d("VerificationSession", "End waiting sms time");
                        this.r.a(this.y);
                    }
                    c();
                    b();
                    if (a(Integer.valueOf(aVar.b()))) {
                        b(aVar);
                    }
                }
            } else if (i == 3) {
                ru.mail.libverify.e.d dVar5 = this.g.d;
                if (dVar5 != null && (dVar5 instanceof d.b)) {
                    d.b bVar = (d.b) dVar5;
                    a(fromString.value);
                    if (this.A != null) {
                        FileLog.d("VerificationSession", "End waiting callin time");
                        this.r.a(this.A);
                    }
                    if (this.y != null) {
                        FileLog.d("VerificationSession", "End waiting sms time");
                        this.r.a(this.y);
                    }
                    c();
                    b();
                    b(bVar);
                    a(bVar.d());
                }
            } else if (i == 4 && (dVar = this.g.d) != null && (dVar instanceof d.f)) {
                d.f fVar = (d.f) dVar;
                a(fromString.value);
                if (this.z != null) {
                    FileLog.d("VerificationSession", "End waiting callui time");
                    this.r.a(this.z);
                }
                if (this.A != null) {
                    FileLog.d("VerificationSession", "End waiting callin time");
                    this.r.a(this.A);
                }
                c();
                b();
                b(fVar);
                c(fVar.b());
            }
        } else {
            ru.mail.libverify.e.d dVar6 = this.g.d;
            if (dVar6 != null) {
                a(dVar6.a(), new q0y0(this, 1));
            }
        }
        L();
        K();
    }

    private void a(@Nullable String str) {
        if (this.w != null) {
            if (str != null) {
                FileLog.d("VerificationSession", "End waiting route time because route %s income", str);
            } else {
                FileLog.d("VerificationSession", "End waiting route time");
            }
            this.r.a(this.w);
        }
        this.g.waitForRoutesTimestamp = null;
    }

    private void a(int i) {
        if (this.z != null) {
            FileLog.d("VerificationSession", "End waiting callui time");
            this.r.a(this.z);
        }
        this.z = this.r.a(((q.d) this.f).b(), i, new g0(this, 24));
    }

    private boolean a(@NonNull Integer num) {
        String str = this.A;
        if (str != null && !this.r.b(str)) {
            return false;
        }
        if (this.A != null) {
            FileLog.d("VerificationSession", "End waiting callin time");
            this.r.a(this.A);
        }
        this.A = this.r.a(((q.d) this.f).b(), num.intValue(), new vb(this, 23));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(@NonNull String str, boolean z) {
        FileLog.v("VerificationSession", "try to verify phone %s", str);
        if (h.b(str, d())) {
            a(str, str, VerificationApi.VerificationSource.CALL);
            return true;
        }
        ru.mail.libverify.d0.a.a().e().getClass();
        String c2 = h.c(str, e());
        boolean isEmpty = TextUtils.isEmpty(c2);
        boolean z2 = !isEmpty;
        if (isEmpty && !z) {
            return z2;
        }
        a(c2, str, VerificationApi.VerificationSource.CALL);
        return z2;
    }

    @Nullable
    private String a(String str, String str2) {
        KeyValueStorage c2 = ((q.d) this.f).c();
        StringBuilder b2 = ho8.b(str, BundleUtil.UNDERLINE_TAG);
        b2.append(this.g.verificationService);
        b2.append(BundleUtil.UNDERLINE_TAG);
        b2.append(str2);
        return c2.getValue(b2.toString());
    }

    private void a(@NonNull String str, @NonNull String str2, @NonNull String str3) {
        ((q.d) this.f).c().putValue(tdj.a(ho8.b(str, BundleUtil.UNDERLINE_TAG), this.g.verificationService, BundleUtil.UNDERLINE_TAG, str3), str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0046  */
    @NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VerificationApi.VerificationStateDescriptor a(@NonNull VerificationApi.VerificationState verificationState, @NonNull VerificationApi.VerificationSource verificationSource, @NonNull VerificationApi.FailReason failReason, @Nullable ru.mail.libverify.m.o oVar) {
        int parseInt;
        Integer valueOf;
        boolean z;
        p pVar;
        String str;
        String substring;
        if (oVar == null) {
            return new VerificationApi.VerificationStateDescriptor(verificationState, failReason, this.g.h(), this.g.d(), this.g.e);
        }
        if (!TextUtils.isEmpty(oVar.p())) {
            try {
                parseInt = Integer.parseInt(oVar.p());
            } catch (Exception unused) {
            }
            if (parseInt > 0) {
                valueOf = Integer.valueOf(parseInt);
                if (valueOf != null) {
                    valueOf = 60;
                    z = true;
                } else {
                    z = false;
                }
                pVar = this.g;
                if (pVar.smsCodeSource == VerificationApi.VerificationSource.CALL) {
                    substring = pVar.smsCode;
                } else {
                    String str2 = pVar.smsCode;
                    if (str2 != null && !TextUtils.isEmpty(str2) && this.g.smsCode.length() > oVar.l()) {
                        String str3 = this.g.smsCode;
                        substring = str3.substring(str3.length() - oVar.l());
                    } else {
                        str = null;
                        boolean z2 = this.g.g().e() == ru.mail.libverify.e.b.VKLOGIN;
                        p pVar2 = this.g;
                        CodeDeliveryInfo codeDeliveryInfo = pVar2.g;
                        CodeDeliveryInfo codeDeliveryInfo2 = pVar2.f;
                        boolean z3 = codeDeliveryInfo != codeDeliveryInfo2;
                        pVar2.g = codeDeliveryInfo2;
                        boolean h = pVar2.h();
                        String q = oVar.q();
                        String str4 = this.g.userId;
                        String w = oVar.w();
                        int x = oVar.x();
                        int l = oVar.l();
                        boolean z4 = oVar.m() == o.a.NUMERIC;
                        Set<String> v = oVar.v();
                        int intValue = valueOf.intValue();
                        Map<String, String> h2 = oVar.h();
                        DetailStatus e = oVar.e();
                        VerifyApiRequest.VerifyChecks[] k = this.g.e() != null ? this.g.e().k() : null;
                        p pVar3 = this.g;
                        return new VerificationApi.VerificationStateDescriptor(verificationState, verificationSource, failReason, h, q, str4, w, x, l, z4, str, v, intValue, h2, z, e, k, z2, pVar3.e, pVar3.f, z3);
                    }
                }
                str = substring;
                if (this.g.g().e() == ru.mail.libverify.e.b.VKLOGIN) {
                }
                p pVar22 = this.g;
                CodeDeliveryInfo codeDeliveryInfo3 = pVar22.g;
                CodeDeliveryInfo codeDeliveryInfo22 = pVar22.f;
                if (codeDeliveryInfo3 != codeDeliveryInfo22) {
                }
                pVar22.g = codeDeliveryInfo22;
                boolean h3 = pVar22.h();
                String q2 = oVar.q();
                String str42 = this.g.userId;
                String w2 = oVar.w();
                int x2 = oVar.x();
                int l2 = oVar.l();
                if (oVar.m() == o.a.NUMERIC) {
                }
                Set<String> v2 = oVar.v();
                int intValue2 = valueOf.intValue();
                Map<String, String> h22 = oVar.h();
                DetailStatus e2 = oVar.e();
                if (this.g.e() != null) {
                }
                p pVar32 = this.g;
                return new VerificationApi.VerificationStateDescriptor(verificationState, verificationSource, failReason, h3, q2, str42, w2, x2, l2, z4, str, v2, intValue2, h22, z, e2, k, z2, pVar32.e, pVar32.f, z3);
            }
        }
        valueOf = null;
        if (valueOf != null) {
        }
        pVar = this.g;
        if (pVar.smsCodeSource == VerificationApi.VerificationSource.CALL) {
        }
        str = substring;
        if (this.g.g().e() == ru.mail.libverify.e.b.VKLOGIN) {
        }
        p pVar222 = this.g;
        CodeDeliveryInfo codeDeliveryInfo32 = pVar222.g;
        CodeDeliveryInfo codeDeliveryInfo222 = pVar222.f;
        if (codeDeliveryInfo32 != codeDeliveryInfo222) {
        }
        pVar222.g = codeDeliveryInfo222;
        boolean h32 = pVar222.h();
        String q22 = oVar.q();
        String str422 = this.g.userId;
        String w22 = oVar.w();
        int x22 = oVar.x();
        int l22 = oVar.l();
        if (oVar.m() == o.a.NUMERIC) {
        }
        Set<String> v22 = oVar.v();
        int intValue22 = valueOf.intValue();
        Map<String, String> h222 = oVar.h();
        DetailStatus e22 = oVar.e();
        if (this.g.e() != null) {
        }
        p pVar322 = this.g;
        return new VerificationApi.VerificationStateDescriptor(verificationState, verificationSource, failReason, h32, q22, str422, w22, x22, l22, z4, str, v22, intValue22, h222, z, e22, k, z2, pVar322.e, pVar322.f, z3);
    }

    @NonNull
    private VerificationApi.VerificationStateDescriptor a(@NonNull ru.mail.libverify.m.c<?, ?> cVar) {
        VerificationApi.FailReason a2;
        switch (b.b[cVar.g().ordinal()]) {
            case 3:
            case 4:
            case 5:
                VerificationApi.VerificationState verificationState = VerificationApi.VerificationState.FAILED;
                if (TextUtils.isEmpty(cVar.d())) {
                    a2 = this.t.a();
                } else {
                    a2 = VerificationApi.FailReason.GENERAL_ERROR.a(cVar.d());
                }
                return new VerificationApi.VerificationStateDescriptor(verificationState, a2, this.g.h());
            case 6:
            case 7:
                return new VerificationApi.VerificationStateDescriptor(VerificationApi.VerificationState.FAILED, VerificationApi.FailReason.INCORRECT_PHONE_NUMBER.a(cVar.d()), this.g.h());
            case 8:
            case 9:
                return new VerificationApi.VerificationStateDescriptor(VerificationApi.VerificationState.FAILED, VerificationApi.FailReason.UNSUPPORTED_NUMBER.a(cVar.d()), this.g.h());
            case 10:
            case 11:
                VerificationApi.RateLimitType rateLimitType = VerificationApi.RateLimitType.UNKNOWN;
                if (cVar instanceof ru.mail.libverify.m.o) {
                    rateLimitType = VerificationApi.RateLimitType.VERIFY;
                } else if (cVar instanceof ru.mail.libverify.m.a) {
                    rateLimitType = VerificationApi.RateLimitType.ATTEMPT;
                }
                return new VerificationApi.VerificationStateDescriptor(VerificationApi.VerificationState.FAILED, VerificationApi.FailReason.RATELIMIT.a(cVar.d()), this.g.h(), rateLimitType);
            default:
                throw new IllegalArgumentException("Undefined response status");
        }
    }

    @NonNull
    private VerificationApi.VerificationStateDescriptor a(@NonNull ru.mail.libverify.requests.c<?, ?> cVar, @NonNull c cVar2) {
        try {
            return cVar2.a();
        } catch (InterruptedException e) {
            e = e;
            FileLog.e("VerificationSession", "apiMethodToNextState", e);
            return g();
        } catch (CancellationException e2) {
            e = e2;
            FileLog.e("VerificationSession", "apiMethodToNextState", e);
            return g();
        } catch (ExecutionException e3) {
            Throwable cause = e3.getCause();
            if (cause == null) {
                ru.mail.libverify.n0.b.a("VerificationSession", "apiMethodToNextState", e3);
                return g();
            }
            FileLog.d("VerificationSession", "apiMethodToNextState", cause);
            this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_HANDLE_SERVER_FAILURE, cVar, cause));
            boolean z = cause instanceof IOException;
            if (!(cause instanceof ServerException) && !z) {
                return g();
            }
            return a(VerificationApi.VerificationState.SUSPENDED, VerificationApi.VerificationSource.UNKNOWN, this.t.b(), this.g.e());
        } catch (Throwable th) {
            ru.mail.libverify.n0.b.a("VerificationSession", "apiMethodToNextState", th);
            return g();
        }
    }

    @NonNull
    private VerificationApi.VerificationStateDescriptor a(@NonNull ru.mail.libverify.requests.a aVar, @NonNull final Future future) {
        return a(aVar, new c() { // from class: ru.mail.libverify.api.a0
            @Override // ru.mail.libverify.api.s.c
            public final VerificationApi.VerificationStateDescriptor a() {
                VerificationApi.VerificationStateDescriptor a2;
                a2 = s.this.a(future);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public VerificationApi.VerificationStateDescriptor a(Future future) throws ExecutionException, InterruptedException {
        ru.mail.libverify.m.a aVar = (ru.mail.libverify.m.a) future.get();
        FileLog.v("VerificationSession", "session with id = %s received AttemptApiResponse response = %s", this.g.id, aVar.toString());
        this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFICATION_SESSION_FETCHER_INFO_RECEIVED, aVar.i()));
        if (aVar.g() != Status.OK) {
            if (aVar.e() == DetailStatus.INCORRECT_CODE) {
                p pVar = this.g;
                pVar.incorrectSmsCode = pVar.smsCode;
            }
            p pVar2 = this.g;
            pVar2.smsCode = null;
            pVar2.rawSmsTexts.clear();
        } else {
            if (this.g.e() == null) {
                this.g.a(new ru.mail.libverify.m.o());
            }
            this.g.e().a(aVar.j());
            this.g.e().a(aVar.h());
            this.g.e().a(aVar.k());
        }
        int i = b.b[aVar.g().ordinal()];
        if (i == 1 || i == 2) {
            if (TextUtils.isEmpty(aVar.j())) {
                return g();
            }
            VerificationApi.VerificationState verificationState = VerificationApi.VerificationState.SUCCEEDED;
            p pVar3 = this.g;
            return a(verificationState, pVar3.smsCodeSource, VerificationApi.FailReason.OK, pVar3.e());
        }
        if (i != 5) {
            this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFY_API_HANDLE_REQUEST_FAILURE, aVar));
            return a(aVar);
        }
        int i2 = b.c[aVar.e().ordinal()];
        if (i2 != 1 && i2 != 2) {
            return g();
        }
        p pVar4 = this.g;
        VerificationApi.VerificationSource verificationSource = pVar4.smsCodeSource;
        if (verificationSource == VerificationApi.VerificationSource.USER_INPUT) {
            return a(VerificationApi.VerificationState.WAITING_FOR_SMS_CODE, verificationSource, VerificationApi.FailReason.INCORRECT_SMS_CODE.a(aVar.d()), this.g.e());
        }
        return a(VerificationApi.VerificationState.WAITING_FOR_SMS_CODE, verificationSource, VerificationApi.FailReason.OK, pVar4.e());
    }

    private void a(@NonNull final VerificationApi.IvrStateListener ivrStateListener) {
        if (!((q.d) this.f).e().D().b()) {
            FileLog.d("VerificationSession", "ivr request start disallowed");
            ivrStateListener.onRequestExecuted(this.t.c());
            return;
        }
        if (this.n != null) {
            FileLog.v("VerificationSession", "cancel ivr request");
            this.n.cancel(true);
            this.n = null;
        }
        FileLog.d("VerificationSession", "start ivr request");
        VerifyApiRequest.VerifyChecks[] verifyChecksArr = {VerifyApiRequest.VerifyChecks.IVR};
        ru.mail.libverify.u.w e = ((q.d) this.f).e();
        p pVar = this.g;
        String str = pVar.id;
        String str2 = pVar.verificationService;
        String str3 = pVar.userProvidedPhoneNumber;
        String str4 = pVar.userId;
        VerifyApiRequest.a f = pVar.g().f();
        String str5 = this.g.srcApplication;
        String b2 = this.h.b();
        ru.mail.libverify.l.d dVar = this.g.verifySessionSettings;
        final VerifyApiRequest verifyApiRequest = new VerifyApiRequest(e, str, str2, str3, str4, verifyChecksArr, f, str5, false, b2, dVar != null ? dVar.d() : null, false);
        this.n = verifyApiRequest.a(((q.d) this.f).d(), ((q.d) this.f).b(), new j.c() { // from class: xsna.dcz0
            @Override // ru.mail.libverify.j0.j.c
            public final void a(Future future) {
                ru.mail.libverify.api.s.this.a(verifyApiRequest, ivrStateListener, future);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(VerifyApiRequest verifyApiRequest, VerificationApi.IvrStateListener ivrStateListener, Future future) {
        if (future.isCancelled()) {
            return;
        }
        this.n = null;
        VerificationApi.VerificationStateDescriptor a2 = a(verifyApiRequest, this.h, future);
        ivrStateListener.onRequestExecuted(a2.getReason());
        if (a2.getState() == VerificationApi.VerificationState.SUCCEEDED) {
            a(a2);
        }
    }

    @NonNull
    private VerificationApi.VerificationStateDescriptor a(@NonNull VerifyApiRequest verifyApiRequest, @NonNull final ru.mail.libverify.u.y yVar, @NonNull final Future future) {
        return a(verifyApiRequest, new c() { // from class: ru.mail.libverify.api.b0
            @Override // ru.mail.libverify.api.s.c
            public final VerificationApi.VerificationStateDescriptor a() {
                VerificationApi.VerificationStateDescriptor a2;
                a2 = s.this.a(future, yVar);
                return a2;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ VerificationApi.VerificationStateDescriptor a(Future future, ru.mail.libverify.u.y yVar) throws ExecutionException, InterruptedException {
        ru.mail.libverify.m.o oVar = (ru.mail.libverify.m.o) future.get();
        yVar.a();
        return b(oVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(VerifyApiRequest verifyApiRequest, Future future) {
        if (future.isCancelled()) {
            return;
        }
        this.m = null;
        a(a(verifyApiRequest, this.h, future));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@Nullable VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        if (verificationStateDescriptor == null) {
            return;
        }
        this.d.a(ru.mail.libverify.p0.e.a(ru.mail.libverify.p0.a.VERIFICATION_SESSION_STATE_CHANGED, this.g.id, verificationStateDescriptor));
        if (this.g.state != verificationStateDescriptor.getState()) {
            this.g.a(verificationStateDescriptor.getState(), verificationStateDescriptor.getReason(), this.e.b());
            if (!this.g.a()) {
                FileLog.v("VerificationSession", "Mark session = %s data as failed and run control loop", this.g.id);
                p pVar = this.g;
                k kVar = this.t;
                pVar.state = VerificationApi.VerificationState.FAILED;
                pVar.reason = kVar.b();
            }
            if (!this.g.a(this.e.b())) {
                FileLog.v("VerificationSession", "Stop control loop for session = %s", this.g.id);
                p pVar2 = this.g;
                k kVar2 = this.t;
                pVar2.state = VerificationApi.VerificationState.FAILED;
                pVar2.reason = kVar2.b();
            }
            long f = this.g.f();
            FileLog.v("VerificationSession", "Schedule control loop for session = %s delay %d", this.g.id, Long.valueOf(f));
            ((q.d) this.f).b().postDelayed(this.o, f);
        }
    }
}
