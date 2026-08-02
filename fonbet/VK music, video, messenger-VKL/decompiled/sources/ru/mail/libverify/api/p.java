package ru.mail.libverify.api;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.common.Status;
import ru.mail.libverify.api.model.CodeDeliveryInfo;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
final class p implements Gsonable {
    private transient VerificationApi.VerificationState a;
    private transient int b;
    private transient long c;

    @Nullable
    String[] callFragmentTemplate;

    @NonNull
    final Set<String> callInNumbers;

    @Nullable
    transient ru.mail.libverify.e.d d;

    @Nullable
    private final Map<String, String> defaultSmsCodeTemplates;

    @Nullable
    transient ru.mail.libverify.e.d e;

    @Nullable
    transient CodeDeliveryInfo f;
    transient CodeDeliveryInfo g;

    @NonNull
    final String id;

    @Nullable
    String incorrectSmsCode;

    @NonNull
    final ArrayList<ru.mail.libverify.d.b> mobileIdRoutes;

    @Nullable
    private ru.mail.libverify.m.o prevVerifyApiResponse;

    @NonNull
    final Set<String> rawSmsTexts;
    VerificationApi.FailReason reason;

    @Nullable
    String smsCode;
    VerificationApi.VerificationSource smsCodeSource;

    @Nullable
    final String srcApplication;
    final long startTimeStamp;
    VerificationApi.VerificationState state;

    @Nullable
    final String userId;

    @Nullable
    final String userProvidedPhoneNumber;

    @NonNull
    final String verificationService;
    private boolean verifiedOnce;

    @Nullable
    private ru.mail.libverify.m.o verifyApiResponse;

    @NonNull
    private ru.mail.libverify.e.g verifyRouteCommand;

    @Nullable
    final ru.mail.libverify.l.d verifySessionSettings;

    @Nullable
    Long waitForRoutesTimestamp;

    private p() {
        this.b = 1;
        this.c = 0L;
        this.prevVerifyApiResponse = null;
        this.rawSmsTexts = new HashSet();
        this.f = null;
        this.g = null;
        this.smsCodeSource = VerificationApi.VerificationSource.UNKNOWN;
        this.state = VerificationApi.VerificationState.INITIAL;
        this.reason = VerificationApi.FailReason.OK;
        this.srcApplication = null;
        this.verificationService = "";
        this.defaultSmsCodeTemplates = null;
        this.userProvidedPhoneNumber = null;
        this.userId = null;
        this.id = "";
        this.startTimeStamp = 0L;
        this.c = 0L;
        this.verifySessionSettings = null;
        this.verifyRouteCommand = ru.mail.libverify.e.g.a();
        this.d = null;
        this.e = null;
        this.mobileIdRoutes = new ArrayList<>();
        this.callInNumbers = new HashSet();
    }

    public final boolean a(long j) {
        if (this.state == VerificationApi.VerificationState.SUSPENDED) {
            long j2 = this.c;
            if (j2 != 0 && j - j2 > 3600000) {
                FileLog.v("SessionData", "Attempt request time expired");
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        VerificationApi.VerificationState verificationState = this.state;
        if (verificationState == VerificationApi.VerificationState.FAILED) {
            return true;
        }
        if (verificationState != VerificationApi.VerificationState.FINAL && verificationState != VerificationApi.VerificationState.SUCCEEDED) {
            return false;
        }
        if (this.reason != VerificationApi.FailReason.OK) {
            return true;
        }
        ru.mail.libverify.m.o oVar = this.verifyApiResponse;
        return (oVar == null || TextUtils.isEmpty(oVar.w())) ? false : true;
    }

    public final int c() {
        return this.verifiedOnce ? 1800000 : 45000;
    }

    @Nullable
    public final ru.mail.libverify.m.o d() {
        return this.prevVerifyApiResponse;
    }

    @Nullable
    public final ru.mail.libverify.m.o e() {
        return this.verifyApiResponse;
    }

    public final long f() {
        if (this.state == VerificationApi.VerificationState.SUSPENDED) {
            return Math.min(this.b * 1000, IronSourceError.ERROR_CAPPING_VALIDATION_FAILED);
        }
        return 0L;
    }

    @NonNull
    public final ru.mail.libverify.e.g g() {
        return this.verifyRouteCommand;
    }

    public final boolean h() {
        return this.verifiedOnce;
    }

    public final boolean a() {
        long currentTimeMillis = System.currentTimeMillis() - this.startTimeStamp;
        FileLog.v("SessionData", "Trace time from start = %d, state = %s, hasResponse = %s", Long.valueOf(currentTimeMillis), this.state, Boolean.valueOf(this.verifyApiResponse != null));
        if (currentTimeMillis < 0) {
            return false;
        }
        if (this.state == VerificationApi.VerificationState.SUSPENDED) {
            if (this.verifyApiResponse == null && currentTimeMillis > c()) {
                return false;
            }
            if (this.verifyApiResponse != null && currentTimeMillis > 3600000) {
                return false;
            }
        }
        return true;
    }

    public final void a(VerificationApi.VerificationState verificationState, VerificationApi.FailReason failReason, long j) {
        if (this.a == verificationState) {
            if (this.state == VerificationApi.VerificationState.SUSPENDED) {
                int i = this.b;
                if (i == 0) {
                    this.c = j;
                }
                this.b = i + 1;
            }
        } else {
            this.b = 0;
            this.c = 0L;
        }
        VerificationApi.VerificationState verificationState2 = this.state;
        this.a = verificationState2;
        this.state = verificationState;
        this.reason = failReason;
        FileLog.v("SessionData", "Change session = %s state %s->%s (count %d) reason %s", this.id, verificationState2, verificationState, Integer.valueOf(this.b), failReason);
    }

    @Nullable
    public final String a(String str) {
        Map<String, String> map = this.defaultSmsCodeTemplates;
        if (map == null) {
            return null;
        }
        return map.get(str);
    }

    public p(@NonNull String str, @NonNull ru.mail.libverify.e.g gVar, @Nullable String str2, @Nullable String str3, @NonNull String str4, @Nullable Map<String, String> map, @Nullable String str5, @Nullable ru.mail.libverify.l.d dVar) {
        this.b = 1;
        this.c = 0L;
        this.prevVerifyApiResponse = null;
        this.rawSmsTexts = new HashSet();
        this.f = null;
        this.g = null;
        this.smsCodeSource = VerificationApi.VerificationSource.UNKNOWN;
        this.state = VerificationApi.VerificationState.INITIAL;
        this.reason = VerificationApi.FailReason.OK;
        this.verificationService = str;
        this.userProvidedPhoneNumber = str2;
        this.srcApplication = str5;
        this.userId = str3;
        this.id = str4;
        this.startTimeStamp = System.currentTimeMillis();
        this.defaultSmsCodeTemplates = map;
        this.verifyRouteCommand = gVar;
        this.verifySessionSettings = dVar;
        this.mobileIdRoutes = new ArrayList<>();
        this.callInNumbers = new HashSet();
    }

    public final void a(@Nullable ru.mail.libverify.m.o oVar) {
        if (oVar == null) {
            ru.mail.libverify.m.o oVar2 = this.verifyApiResponse;
            if (oVar2 != null) {
                this.prevVerifyApiResponse = oVar2;
            }
        } else {
            this.prevVerifyApiResponse = null;
        }
        if (!this.verifiedOnce && oVar != null) {
            ru.mail.libverify.l.d dVar = this.verifySessionSettings;
            boolean z = true;
            if (dVar != null && !dVar.i()) {
                if (oVar.g() != Status.OK && oVar.g() != Status.VERIFIED) {
                    z = false;
                }
                this.verifiedOnce = z;
            } else {
                this.verifiedOnce = true;
            }
        }
        this.verifyApiResponse = oVar;
    }

    public final void a(@NonNull ru.mail.libverify.e.g gVar) {
        this.verifyRouteCommand = gVar;
    }
}
