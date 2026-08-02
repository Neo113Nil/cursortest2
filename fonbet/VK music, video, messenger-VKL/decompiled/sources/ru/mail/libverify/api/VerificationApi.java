package ru.mail.libverify.api;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import defpackage.q0;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import ru.mail.libverify.R;
import ru.mail.libverify.api.common.DetailStatus;
import ru.mail.libverify.api.model.CodeDeliveryInfo;
import ru.mail.libverify.e.d;
import ru.mail.libverify.m.o;
import ru.mail.libverify.requests.VerifyApiRequest;
import ru.mail.verify.core.utils.Gsonable;

/* loaded from: classes9.dex */
public interface VerificationApi {

    public interface AccountCheckListener {
        void onComplete(@NonNull AccountCheckResult accountCheckResult);
    }

    public enum AccountCheckResult {
        OK,
        NO_SMS_PERMISSION,
        NO_SMS_FOUND,
        NO_SMS_FOUND_HAS_SOURCE_MATCH,
        NO_SMS_FOUND_HAS_CODE,
        NO_SMS_INFO,
        EMPTY_ACCOUNT_DATA,
        GENERAL_ERROR
    }

    public static class CallInDescriptor {

        @NonNull
        private final String a;
        private final int b;
        private final int c;
        private final boolean d;
        private final boolean e;

        public CallInDescriptor(@NonNull String str, int i, int i2, boolean z, boolean z2) {
            this.a = str;
            this.b = i;
            this.c = i2;
            this.d = z;
            this.e = z2;
        }

        public int getNumberTimeout() {
            return this.b;
        }

        @NonNull
        public String getPhoneNumber() {
            return this.a;
        }

        public int getTotalTimeout() {
            return this.c;
        }

        public boolean isDisableDirectCall() {
            return this.d;
        }

        public boolean isIvr() {
            return this.e;
        }
    }

    public static class CallUIDescriptor {

        @Nullable
        private final String a;

        @Nullable
        private final String b;

        @Nullable
        private final String c;
        private final int d;
        private final int e;

        public CallUIDescriptor(@Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2) {
            this.a = str3;
            this.b = str;
            this.c = str2;
            this.d = i;
            this.e = i2;
        }

        @Nullable
        public String getCallUiPhoneFragmentStart() {
            return this.a;
        }

        public int getCodeLength() {
            return this.d;
        }

        @Nullable
        public String getPreferredDescription() {
            return this.b;
        }

        @Nullable
        public String getPreferredOptionalDescription() {
            return this.c;
        }

        public int getTimeout() {
            return this.e;
        }
    }

    public enum CancelReason {
        TOKEN_SWAP_GENERAL_ERROR,
        TOKEN_SWAP_NETWORK_ERROR,
        CANCELLED_BY_USER,
        PHONE_EDIT_BY_USER,
        GENERAL_ERROR,
        OK
    }

    public enum FailReason {
        OK,
        GENERAL_ERROR,
        UNSUPPORTED_NUMBER,
        INCORRECT_PHONE_NUMBER,
        INCORRECT_SMS_CODE,
        RATELIMIT,
        NETWORK_ERROR,
        NO_NETWORK,
        NO_MORE_ROUTES;

        private String description;

        @NonNull
        public final FailReason a(String str) {
            this.description = str;
            return this;
        }

        @Nullable
        public String getDescription() {
            return this.description;
        }
    }

    public interface GcmTokenListener {
        void onReceived(@Nullable String str);
    }

    public interface IvrStateListener {
        void onRequestExecuted(@NonNull FailReason failReason);
    }

    public static class MessengerDescriptor {

        @NonNull
        private final String a;

        @NonNull
        private final String b;

        @NonNull
        private final String c;
        private final int d;

        public MessengerDescriptor(@NonNull String str, @NonNull String str2, @NonNull String str3, int i) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = i;
        }

        @NonNull
        public String getDescription() {
            return this.b;
        }

        @NonNull
        public Integer getIconResource() {
            String str = this.c;
            str.getClass();
            switch (str) {
                case "telegram":
                    return Integer.valueOf(R.drawable.logo_telegram);
                case "vk":
                    return Integer.valueOf(R.drawable.logo_vk);
                case "max":
                    return Integer.valueOf(R.drawable.logo_max);
                case "viber":
                    return Integer.valueOf(R.drawable.logo_viber);
                case "whatsapp":
                    return Integer.valueOf(R.drawable.logo_whatsapp);
                default:
                    return Integer.valueOf(R.drawable.logo_default_messenger);
            }
        }

        @NonNull
        public String getId() {
            return this.c;
        }

        @NonNull
        public String getName() {
            return this.a;
        }

        public int getTimeout() {
            return this.d;
        }
    }

    public static class MobileIdDescriptor {
        private final int a;

        public MobileIdDescriptor(int i) {
            this.a = i;
        }

        public int getTimeout() {
            return this.a;
        }
    }

    public static class PhoneAccountSearchItem {
        public final String phone;
        public final String source;

        public PhoneAccountSearchItem(String str, String str2) {
            this.phone = str;
            this.source = str2;
        }
    }

    public interface PhoneAccountSearchListener {
        void onComplete(@NonNull List<PhoneAccountSearchItem> list);
    }

    public interface PhoneCheckListener {
        void onCompleted(@NonNull String str, @NonNull PhoneCheckResult phoneCheckResult);
    }

    public interface PhoneCheckResult {

        public interface ExtendedInfo {
            @Nullable
            String getIsoCountryCode();

            @Nullable
            String getModifiedPhoneNumber();

            @Nullable
            String getModifiedPrefix();

            @Nullable
            Integer getRemainingLength();

            boolean isFixedLine();

            boolean isMobile();
        }

        public enum State {
            VALID,
            INVALID,
            UNKNOWN
        }

        @Nullable
        ExtendedInfo getExtendedInfo();

        @Nullable
        String[] getPrintableText();

        @NonNull
        FailReason getReason();

        @NonNull
        State getState();

        boolean isApproximate();

        boolean isInvalid();

        boolean isUnknown();

        boolean isValid();

        boolean isWarning();
    }

    public enum RateLimitType {
        UNKNOWN,
        VERIFY,
        ATTEMPT
    }

    public interface SmsCodeNotificationListener {
        void onNotification(@NonNull String str);
    }

    public interface SmsDialogChangedListener {
        void onChanged(@Nullable SmsDialogItem smsDialogItem);
    }

    public interface SmsDialogItem extends Comparable<SmsDialogItem> {
        @NonNull
        String getFrom();

        long getId();

        @Nullable
        String getLastText();

        long getLastTimestamp();

        boolean hasUnread();
    }

    public interface SmsDialogsListener {
        void onCompleted(@NonNull List<SmsDialogItem> list);

        void onError();
    }

    public interface SmsItem {
        @NonNull
        String getFrom();

        long getId();

        @NonNull
        String getText();

        long getTimestamp();
    }

    public interface SmsListener {
        void onCompleted(@NonNull List<SmsItem> list);

        void onError();
    }

    public enum VerificationSource implements Gsonable {
        UNKNOWN,
        SMS,
        CALL,
        SMS_RETRIEVER,
        USER_INPUT,
        ALREADY_VERIFIED,
        APPLICATION_LOCAL,
        APPLICATION_EXTERNAL,
        MOBILEID_OK,
        CALLIN
    }

    public enum VerificationState {
        INITIAL,
        VERIFYING_PHONE_NUMBER,
        WAITING_FOR_SMS_CODE,
        VERIFYING_SMS_CODE,
        SUCCEEDED,
        FAILED,
        SUSPENDED,
        FINAL
    }

    public interface VerificationStateChangedListener {
        void onStateChanged(@NonNull String str, @Nullable VerificationStateDescriptor verificationStateDescriptor);
    }

    public interface VerificationStatesHandler {
        void onExistingVerificationsFound(@NonNull List<String> list);
    }

    void addSmsCodeNotificationListener(@NonNull SmsCodeNotificationListener smsCodeNotificationListener);

    void addSmsDialogChangedListener(@NonNull SmsDialogChangedListener smsDialogChangedListener);

    void addVerificationStateChangedListener(@NonNull VerificationStateChangedListener verificationStateChangedListener);

    void cancelVerification(@NonNull String str);

    void cancelVerification(@NonNull String str, @NonNull CancelReason cancelReason);

    void checkAccountVerification(@NonNull String str);

    void checkAccountVerificationBySms(@NonNull String str, @Nullable AccountCheckListener accountCheckListener);

    void checkPhoneNumber(@NonNull String str, @NonNull String str2, @NonNull String str3, boolean z, @NonNull PhoneCheckListener phoneCheckListener);

    void clearSmsDialogs();

    void completeVerification(@NonNull String str);

    @NonNull
    String loggedInWithVKConnect(@NonNull String str, @Nullable String str2) throws IllegalStateException;

    void prepare2StepAuthCheck();

    void querySms(@Nullable String str, @Nullable Long l, @Nullable Long l2, @Nullable Integer num, @NonNull SmsListener smsListener);

    void querySmsDialogs(@NonNull SmsDialogsListener smsDialogsListener);

    void removeApiEndpoint();

    void removeSms(@NonNull String str, @Nullable Long l, long j);

    void removeSmsCodeNotificationListener(@NonNull SmsCodeNotificationListener smsCodeNotificationListener);

    void removeSmsDialog(@Nullable String str, @Nullable Long l);

    void removeSmsDialogChangedListener(@NonNull SmsDialogChangedListener smsDialogChangedListener);

    void removeVerificationStateChangedListener(@NonNull VerificationStateChangedListener verificationStateChangedListener);

    void reportNetworkStateChange(boolean z);

    void requestGcmToken(@NonNull GcmTokenListener gcmTokenListener);

    void requestIvrPhoneCall(@NonNull String str, @NonNull IvrStateListener ivrStateListener);

    void requestNewSmsCode(@NonNull String str);

    void requestVerificationState(@NonNull String str, @NonNull VerificationStateChangedListener verificationStateChangedListener);

    void requestVerificationStates(@NonNull VerificationStatesHandler verificationStatesHandler);

    void reset();

    void resetVerificationCodeError(@NonNull String str);

    void searchPhoneAccounts(@NonNull PhoneAccountSearchListener phoneAccountSearchListener);

    @SuppressLint({"InlinedApi", "LambdaLast"})
    @Deprecated
    void searchPhoneAccounts(@NonNull PhoneAccountSearchListener phoneAccountSearchListener, boolean z);

    void sendCallInClickStats(@NonNull String str);

    void setAllowedPermissions(@NonNull String[] strArr);

    void setApiEndpoint(@Nullable String str);

    void setApiEndpoints(@NonNull Map<String, String> map);

    void setCustomLocale(@NonNull Locale locale);

    void setSimDataSendDisabled(boolean z);

    void signOut(boolean z);

    void signOut(boolean z, @Nullable SignOutCallback signOutCallback);

    void softSignOut();

    void softSignOut(@NonNull SignOutCallback signOutCallback);

    @NonNull
    String startVerification(@NonNull String str, @NonNull String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable VerificationParameters verificationParameters) throws IllegalStateException;

    @NonNull
    String startVerification(@NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable VerifyRoute verifyRoute, @Nullable VerificationParameters verificationParameters) throws IllegalStateException;

    @NonNull
    String startVerificationWithVKConnect(@NonNull String str, @Nullable String str2, @Nullable String str3, @Nullable Map<String, String> map, @Nullable String str4, @Nullable VerificationParameters verificationParameters) throws IllegalStateException;

    void verifySmsCode(@NonNull String str, @NonNull String str2);

    public static class PhoneNumberCheckSession {
        private static final Random c = new Random();

        @NonNull
        private final String a;

        @NonNull
        private final VerificationApi b;

        public PhoneNumberCheckSession(@NonNull VerificationApi verificationApi) {
            this.b = verificationApi;
            this.a = Integer.toString(c.nextInt());
        }

        public void checkPhoneNumber(@NonNull String str, @NonNull String str2, boolean z, @NonNull PhoneCheckListener phoneCheckListener) {
            this.b.checkPhoneNumber(this.a, str, str2, z, phoneCheckListener);
        }

        @NonNull
        public String getId() {
            return this.a;
        }

        public PhoneNumberCheckSession(@NonNull VerificationApi verificationApi, @NonNull String str) {
            this.b = verificationApi;
            this.a = str;
        }
    }

    public static class VerificationStateDescriptor {

        @NonNull
        private final VerificationState a;
        private boolean b;

        @NonNull
        private final VerificationSource c;

        @NonNull
        private final FailReason d;
        private boolean e;

        @Nullable
        private String f;

        @Nullable
        private String g;

        @Nullable
        private String h;

        @NonNull
        private DetailStatus i;
        private int j;

        @Nullable
        private SmsCodeInfo k;

        @Nullable
        private IvrInfo l;

        @Nullable
        private Map<String, String> m;

        @Nullable
        private RateLimitType n;

        @Nullable
        private final CallUIDescriptor o;

        @Nullable
        private final CallInDescriptor p;

        @Nullable
        private final MessengerDescriptor q;

        @Nullable
        private final MobileIdDescriptor r;

        @Nullable
        private VerifyApiRequest.VerifyChecks[] s;

        @Nullable
        private CodeDeliveryInfo t;
        private boolean u;
        private final boolean v;

        public class IvrInfo {
            public final boolean defaultIvrTimeoutApplied;
            public final int ivrTimeoutSec;
            public final Set<String> supportedIvrLanguages;

            public IvrInfo(Set set, int i, boolean z) {
                this.supportedIvrLanguages = set;
                this.ivrTimeoutSec = i;
                this.defaultIvrTimeoutApplied = z;
            }

            @NonNull
            public String toString() {
                StringBuilder sb = new StringBuilder("IvrInfo{supportedIvrLanguages=");
                sb.append(this.supportedIvrLanguages);
                sb.append(", ivrTimeoutSec=");
                sb.append(this.ivrTimeoutSec);
                sb.append(", defaultIvrTimeoutApplied=");
                return q0.a(sb, this.defaultIvrTimeoutApplied, '}');
            }
        }

        public class SmsCodeInfo {
            public final boolean isNumericSmsCode;
            public final String receivedSmsCode;
            public final int smsCodeLength;

            public SmsCodeInfo(int i, boolean z, String str) {
                this.smsCodeLength = i;
                this.isNumericSmsCode = z;
                this.receivedSmsCode = str;
            }

            @NonNull
            public String toString() {
                StringBuilder sb = new StringBuilder("SmsCodeInfo{smsCodeLength=");
                sb.append(this.smsCodeLength);
                sb.append(", isNumericSmsCode=");
                return q0.a(sb, this.isNumericSmsCode, '}');
            }
        }

        public VerificationStateDescriptor(@NonNull VerificationState verificationState, @NonNull VerificationSource verificationSource, @NonNull FailReason failReason, boolean z, @Nullable String str, @Nullable String str2, @Nullable String str3, int i, int i2, boolean z2, @Nullable String str4, @Nullable Set<String> set, int i3, @Nullable Map<String, String> map, boolean z3, @NonNull DetailStatus detailStatus, @Nullable VerifyApiRequest.VerifyChecks[] verifyChecksArr, boolean z4, @Nullable ru.mail.libverify.e.d dVar, @Nullable CodeDeliveryInfo codeDeliveryInfo, boolean z5) {
            CallUIDescriptor callUIDescriptor;
            CallInDescriptor callInDescriptor;
            MessengerDescriptor messengerDescriptor;
            boolean z6 = false;
            this.u = false;
            this.f = str;
            this.c = verificationSource;
            this.d = failReason;
            this.h = str3;
            this.e = z;
            this.j = i;
            this.a = verificationState;
            this.b = z4;
            this.k = new SmsCodeInfo(i2, z2, str4);
            this.l = new IvrInfo(set, i3, z3);
            this.m = map;
            this.g = str2;
            this.i = detailStatus;
            if (dVar instanceof d.b) {
                d.b bVar = (d.b) dVar;
                callUIDescriptor = new CallUIDescriptor(bVar.b(), bVar.c(), bVar.e(), i2, bVar.d());
            } else {
                callUIDescriptor = null;
            }
            this.o = callUIDescriptor;
            if (dVar instanceof d.a) {
                d.a aVar = (d.a) dVar;
                callInDescriptor = new CallInDescriptor(aVar.c(), aVar.b(), aVar.d(), aVar.e(), aVar.f());
            } else {
                callInDescriptor = null;
            }
            this.p = callInDescriptor;
            if (dVar instanceof d.C2194d) {
                d.C2194d c2194d = (d.C2194d) dVar;
                messengerDescriptor = new MessengerDescriptor(c2194d.e(), c2194d.b(), c2194d.d(), c2194d.c());
            } else {
                messengerDescriptor = null;
            }
            this.q = messengerDescriptor;
            this.r = dVar instanceof d.e ? new MobileIdDescriptor(((d.e) dVar).b()) : null;
            this.s = verifyChecksArr;
            this.t = codeDeliveryInfo;
            this.u = z5;
            if (dVar != null && verifyChecksArr != null && verifyChecksArr.length > 0 && dVar.a() == verifyChecksArr[verifyChecksArr.length - 1]) {
                z6 = true;
            }
            this.v = z6;
        }

        public boolean completedSuccessfully() {
            VerificationState verificationState = this.a;
            return (verificationState == VerificationState.FINAL || verificationState == VerificationState.SUCCEEDED) && this.d == FailReason.OK && !TextUtils.isEmpty(this.h);
        }

        @Nullable
        public Map<String, String> getAppEndpoints() {
            return this.m;
        }

        @Nullable
        public CallInDescriptor getCallInDescriptor() {
            return this.p;
        }

        @Nullable
        public CallUIDescriptor getCallUIDescriptor() {
            return this.o;
        }

        @Nullable
        public CodeDeliveryInfo getCodeDeliveryInfo() {
            return this.t;
        }

        @NonNull
        public DetailStatus getErrorDetailStatus() {
            return this.i;
        }

        public boolean getIsLastRoute() {
            return this.v;
        }

        @Nullable
        public IvrInfo getIvrInfo() {
            return this.l;
        }

        @Nullable
        public MessengerDescriptor getMessengerDescriptor() {
            return this.q;
        }

        @Nullable
        public MobileIdDescriptor getMobileIdDescriptor() {
            return this.r;
        }

        @Nullable
        public String getModifiedPhoneNumber() {
            return this.f;
        }

        @Nullable
        public RateLimitType getRateLimitType() {
            return this.n;
        }

        @NonNull
        public FailReason getReason() {
            return this.d;
        }

        @Nullable
        public VerifyApiRequest.VerifyChecks[] getRoute() {
            return this.s;
        }

        @Nullable
        public SmsCodeInfo getSmsCodeInfo() {
            return this.k;
        }

        @NonNull
        public VerificationSource getSource() {
            return this.c;
        }

        @NonNull
        public VerificationState getState() {
            return this.a;
        }

        @Nullable
        public String getToken() {
            return this.h;
        }

        public int getTokenExpirationTimeoutSec() {
            return this.j;
        }

        @Nullable
        public String getUserId() {
            return this.g;
        }

        public boolean isUpdatedCodeDeliveryInfo() {
            return this.u;
        }

        public boolean isVKCLogin() {
            return this.b;
        }

        public boolean isVerifiedOnce() {
            return this.e;
        }

        @NonNull
        public String toString() {
            return "VerificationStateDescriptor{state='" + this.a + "', source='" + this.c + "', reason='" + this.d + "', modifiedPhoneNumber='" + this.f + "', token='" + this.h + "', smsCodeInfo='" + this.k + "', ivrInfo='" + this.l + "', appEndpoints='" + this.m + "'}";
        }

        public VerificationStateDescriptor(@NonNull VerificationState verificationState, @Nullable FailReason failReason, boolean z, @Nullable ru.mail.libverify.m.o oVar, @Nullable ru.mail.libverify.e.d dVar) {
            int i;
            CallUIDescriptor callUIDescriptor;
            CallInDescriptor callInDescriptor;
            this.i = DetailStatus.UNKNOWN;
            boolean z2 = false;
            this.u = false;
            this.e = z;
            this.a = verificationState;
            this.c = VerificationSource.UNKNOWN;
            if (failReason != null) {
                this.d = failReason;
            } else {
                this.d = FailReason.OK;
            }
            MessengerDescriptor messengerDescriptor = null;
            if (oVar != null) {
                int l = oVar.l();
                this.k = new SmsCodeInfo(oVar.l(), oVar.m() == o.a.NUMERIC, null);
                i = l;
            } else {
                i = 0;
            }
            if (dVar instanceof d.b) {
                d.b bVar = (d.b) dVar;
                callUIDescriptor = new CallUIDescriptor(bVar.b(), bVar.c(), bVar.e(), i, bVar.d());
            } else {
                callUIDescriptor = null;
            }
            this.o = callUIDescriptor;
            if (dVar instanceof d.a) {
                d.a aVar = (d.a) dVar;
                callInDescriptor = new CallInDescriptor(aVar.c(), aVar.b(), aVar.d(), aVar.e(), aVar.f());
            } else {
                callInDescriptor = null;
            }
            this.p = callInDescriptor;
            this.r = dVar instanceof d.e ? new MobileIdDescriptor(((d.e) dVar).b()) : null;
            if (dVar instanceof d.C2194d) {
                d.C2194d c2194d = (d.C2194d) dVar;
                messengerDescriptor = new MessengerDescriptor(c2194d.e(), c2194d.b(), c2194d.d(), c2194d.c());
            }
            this.q = messengerDescriptor;
            VerifyApiRequest.VerifyChecks[] verifyChecksArr = this.s;
            if (dVar != null && verifyChecksArr != null && verifyChecksArr.length > 0 && dVar.a() == verifyChecksArr[verifyChecksArr.length - 1]) {
                z2 = true;
            }
            this.v = z2;
        }

        public VerificationStateDescriptor(@NonNull VerificationState verificationState, @Nullable FailReason failReason, boolean z, @Nullable RateLimitType rateLimitType) {
            this.e = false;
            this.i = DetailStatus.UNKNOWN;
            this.u = false;
            this.e = z;
            this.a = verificationState;
            this.c = VerificationSource.UNKNOWN;
            if (failReason != null) {
                this.d = failReason;
            } else {
                this.d = FailReason.OK;
            }
            this.n = rateLimitType;
            this.o = null;
            this.p = null;
            this.r = null;
            this.q = null;
            this.v = true;
        }

        public VerificationStateDescriptor(@NonNull VerificationState verificationState, boolean z) {
            this(verificationState, null, z, null);
        }

        public VerificationStateDescriptor(@NonNull VerificationState verificationState, @Nullable FailReason failReason, boolean z) {
            this(verificationState, failReason, z, null);
        }
    }
}
