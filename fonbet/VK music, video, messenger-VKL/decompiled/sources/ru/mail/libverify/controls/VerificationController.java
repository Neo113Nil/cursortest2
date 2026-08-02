package ru.mail.libverify.controls;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ru.mail.libverify.api.SignOutCallback;
import ru.mail.libverify.api.VerificationApi;
import ru.mail.libverify.api.VerificationFactory;
import ru.mail.libverify.api.VerificationParameters;
import ru.mail.libverify.api.VerifyRoute;
import ru.mail.libverify.api.model.CodeDeliveryStatus;
import ru.mail.libverify.controls.OnReceiveCodeDeliveryInfo;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.platform.core.PlatformCoreService;
import ru.mail.libverify.utils.Optional;
import ru.mail.verify.core.api.UncaughtExceptionListener;
import ru.mail.verify.core.utils.FileLog;
import ru.mail.verify.core.utils.LogReceiver;
import xsna.aaq;
import xsna.ag1;
import xsna.an6;
import xsna.b6f0;
import xsna.bi5;
import xsna.bzc0;
import xsna.caf0;
import xsna.cod0;
import xsna.d3j0;
import xsna.fl60;
import xsna.ga40;
import xsna.gcd;
import xsna.gh1;
import xsna.gl60;
import xsna.gzs;
import xsna.hkc0;
import xsna.hv1;
import xsna.i0;
import xsna.i6k;
import xsna.iml0;
import xsna.ipq0;
import xsna.iun0;
import xsna.iv1;
import xsna.j630;
import xsna.jgj0;
import xsna.kgb;
import xsna.kld0;
import xsna.m5o0;
import xsna.mlf0;
import xsna.mlh0;
import xsna.nek;
import xsna.nid0;
import xsna.nq9;
import xsna.o4;
import xsna.oq80;
import xsna.p69;
import xsna.qn9;
import xsna.ss3;
import xsna.tbe0;
import xsna.u12;
import xsna.u2t;
import xsna.u8c0;
import xsna.ume0;
import xsna.vb;
import xsna.vcl0;
import xsna.xmr0;
import xsna.y5r0;
import xsna.yul0;
import xsna.zah0;

@SuppressLint({"UnknownNullness"})
/* loaded from: classes9.dex */
public abstract class VerificationController implements VerificationSupportProvider {
    private static final String DUPLICATE_SESSION_ERROR = "Previous session must be stopped properly. Please, ensure that your code calls cancel() or complete() methods.";
    private static final String LOG_TAG = "VerificationController";
    private static final String VERIFICATION_INITIAL_PROFILE_CHECK = "verification_initial_profile_check";
    private static final String VERIFICATION_SESSION_ID = "verification_session_id";
    private final VerificationApi.PhoneAccountSearchListener accountListener;
    private final VerificationStateChangedListener apiListener;
    protected final Context context;
    VerificationApi.CallInDescriptor currentCallInDescriptor;
    VerificationApi.CallUIDescriptor currentCallUIDescriptor;
    VerificationApi.MessengerDescriptor currentMessengerDescriptor;
    VerificationApi.MobileIdDescriptor currentMobileIdDescriptor;
    private VerificationApi.VerificationStateDescriptor descriptor;
    boolean isLastRoute;
    private VerificationApi.VerificationStateDescriptor lastSuccessfulDescriptor;
    private VerificationApi.PhoneNumberCheckSession phoneNumberCheckSession;
    private List<VerificationApi.PhoneAccountSearchItem> suggestedAccounts;
    private long validationRequestStarted;
    private VerificationApi verificationApi;

    @Nullable
    private String verificationId;
    private VerificationVKCListener vkcListener;
    private Optional<VerificationListener> listener = Optional.ofNullable(null);
    private Optional<OnReceiveCodeDeliveryInfo> onReceiveCodeDeliveryInfo = Optional.ofNullable(null);
    private boolean suggestedAccountsRequested = false;
    private String lastReportedToken = null;

    /* renamed from: ru.mail.libverify.controls.VerificationController$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$ru$mail$libverify$api$VerificationApi$VerificationState;

        static {
            int[] iArr = new int[VerificationApi.VerificationState.values().length];
            $SwitchMap$ru$mail$libverify$api$VerificationApi$VerificationState = iArr;
            try {
                iArr[VerificationApi.VerificationState.INITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$ru$mail$libverify$api$VerificationApi$VerificationState[VerificationApi.VerificationState.VERIFYING_PHONE_NUMBER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$ru$mail$libverify$api$VerificationApi$VerificationState[VerificationApi.VerificationState.SUSPENDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$ru$mail$libverify$api$VerificationApi$VerificationState[VerificationApi.VerificationState.VERIFYING_SMS_CODE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$ru$mail$libverify$api$VerificationApi$VerificationState[VerificationApi.VerificationState.WAITING_FOR_SMS_CODE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$ru$mail$libverify$api$VerificationApi$VerificationState[VerificationApi.VerificationState.FAILED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$ru$mail$libverify$api$VerificationApi$VerificationState[VerificationApi.VerificationState.FINAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$ru$mail$libverify$api$VerificationApi$VerificationState[VerificationApi.VerificationState.SUCCEEDED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public final class PhoneAccountSearchListener implements VerificationApi.PhoneAccountSearchListener {
        public /* synthetic */ PhoneAccountSearchListener(VerificationController verificationController, int i) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void lambda$onComplete$0(List list, VerificationListener verificationListener) {
            verificationListener.onPhoneNumberSearchResult(((VerificationApi.PhoneAccountSearchItem) list.get(0)).phone);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onComplete$1(final List list) {
            VerificationController.this.suggestedAccounts = list;
            if (list.size() == 1) {
                VerificationController.this.listener.ifPresent(new Optional.Action() { // from class: ru.mail.libverify.controls.a
                    @Override // ru.mail.libverify.utils.Optional.Action
                    public final void accept(Object obj) {
                        VerificationController.PhoneAccountSearchListener.lambda$onComplete$0(list, (VerificationListener) obj);
                    }
                });
            }
        }

        @Override // ru.mail.libverify.api.VerificationApi.PhoneAccountSearchListener
        public void onComplete(@NonNull final List<VerificationApi.PhoneAccountSearchItem> list) {
            Utils.uiHandler.post(new Runnable() { // from class: ru.mail.libverify.controls.b
                @Override // java.lang.Runnable
                public final void run() {
                    VerificationController.PhoneAccountSearchListener.this.lambda$onComplete$1(list);
                }
            });
        }

        private PhoneAccountSearchListener() {
        }
    }

    public enum State {
        ENTER_PHONE,
        ENTER_SMS_CODE
    }

    public final class VerificationStateChangedListener implements VerificationApi.VerificationStateChangedListener {
        public /* synthetic */ VerificationStateChangedListener(VerificationController verificationController, int i) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onStateChanged$0(String str, VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
            VerificationController.this.onStateChanged(str, verificationStateDescriptor);
        }

        @Override // ru.mail.libverify.api.VerificationApi.VerificationStateChangedListener
        public void onStateChanged(@NonNull final String str, @Nullable final VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
            Utils.uiHandler.post(new Runnable() { // from class: ru.mail.libverify.controls.c
                @Override // java.lang.Runnable
                public final void run() {
                    VerificationController.VerificationStateChangedListener.this.lambda$onStateChanged$0(str, verificationStateDescriptor);
                }
            });
        }

        private VerificationStateChangedListener() {
        }
    }

    @Deprecated
    public VerificationController(@NonNull Context context) {
        int i = 0;
        this.apiListener = new VerificationStateChangedListener(this, i);
        this.accountListener = new PhoneAccountSearchListener(this, i);
        this.context = context;
    }

    private void checkIvrTimeUpdated(@Nullable VerificationApi.VerificationStateDescriptor verificationStateDescriptor, @Nullable VerificationApi.VerificationStateDescriptor verificationStateDescriptor2) {
        if (verificationStateDescriptor2 == null || verificationStateDescriptor == null || verificationStateDescriptor.getIvrInfo() == null || verificationStateDescriptor2.getIvrInfo() == null || verificationStateDescriptor.getIvrInfo().ivrTimeoutSec == verificationStateDescriptor2.getIvrInfo().ivrTimeoutSec) {
            return;
        }
        this.listener.ifPresent(new iun0(5));
    }

    private VerificationApi.CallInDescriptor getCallInDescriptor(VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        if (verificationStateDescriptor == null) {
            return null;
        }
        return verificationStateDescriptor.getCallInDescriptor();
    }

    private VerificationApi.CallUIDescriptor getCallUIDescriptor(VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        if (verificationStateDescriptor == null) {
            return null;
        }
        return verificationStateDescriptor.getCallUIDescriptor();
    }

    private VerificationApi.MessengerDescriptor getMessengerDescriptor(VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        if (verificationStateDescriptor == null) {
            return null;
        }
        return verificationStateDescriptor.getMessengerDescriptor();
    }

    private VerificationApi.MobileIdDescriptor getMobileIdDescriptor(VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        if (verificationStateDescriptor == null) {
            return null;
        }
        return verificationStateDescriptor.getMobileIdDescriptor();
    }

    private boolean isMethodImplemented(@NonNull Class<?> cls, @NonNull String str, @NonNull Class<?>... clsArr) {
        if (!this.listener.isPresent()) {
            return false;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, clsArr);
            FileLog.d(LOG_TAG, "Method %s is declared.", declaredMethod.toString());
            if (!Modifier.isAbstract(declaredMethod.getModifiers())) {
                return true;
            }
            FileLog.d(LOG_TAG, "Method %s is declared in %s but it is abstract", str, cls);
            return false;
        } catch (Exception unused) {
            FileLog.d(LOG_TAG, "Method %s is not declared in %s", str, cls);
            return false;
        }
    }

    private static boolean isNumericCodeInternal(@NonNull CharSequence charSequence) {
        for (int i = 0; i < charSequence.length(); i++) {
            if (!Character.isDigit(charSequence.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private boolean isOnEnterSmsCodeStage() {
        VerificationApi.VerificationStateDescriptor verificationStateDescriptor = this.descriptor;
        if (verificationStateDescriptor == null) {
            return false;
        }
        return !((TextUtils.isEmpty(verificationStateDescriptor.getModifiedPhoneNumber()) && TextUtils.isEmpty(this.descriptor.getUserId())) || this.descriptor.getSmsCodeInfo() == null || this.descriptor.getIvrInfo() == null) || this.descriptor.isVerifiedOnce();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$getModifiedPhoneNumber$6() {
        VerificationApi.VerificationStateDescriptor verificationStateDescriptor = this.descriptor;
        if (verificationStateDescriptor == null) {
            return null;
        }
        return verificationStateDescriptor.getModifiedPhoneNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$getSmsCode$5() {
        VerificationApi.VerificationStateDescriptor verificationStateDescriptor = this.descriptor;
        if (verificationStateDescriptor == null || verificationStateDescriptor.getSmsCodeInfo() == null) {
            return null;
        }
        return this.descriptor.getSmsCodeInfo().receivedSmsCode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ State lambda$getState$4() {
        return isOnEnterSmsCodeStage() ? State.ENTER_SMS_CODE : State.ENTER_PHONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$hasIncompletedVerification$10() {
        loadVerificationId();
        return Boolean.valueOf(!TextUtils.isEmpty(this.verificationId));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$isNumericCode$8() {
        VerificationApi.VerificationStateDescriptor verificationStateDescriptor = this.descriptor;
        return Boolean.valueOf((verificationStateDescriptor == null || verificationStateDescriptor.getSmsCodeInfo() == null) ? isSmsCodeNumericDefault() : this.descriptor.getSmsCodeInfo().isNumericSmsCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$isValidSmsCode$7(CharSequence charSequence) {
        return Boolean.valueOf(internalIsValidSmsCode(charSequence));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCallInDescriptorChanged$36(VerificationApi.VerificationStateDescriptor verificationStateDescriptor, VerificationListener verificationListener) {
        VerificationApi.CallInDescriptor callInDescriptor = getCallInDescriptor(verificationStateDescriptor);
        if (this.currentCallInDescriptor != callInDescriptor) {
            this.currentCallInDescriptor = callInDescriptor;
            if (isMethodImplemented(verificationListener.getClass(), "OnCallInDescriptorChanged", VerificationApi.CallInDescriptor.class)) {
                verificationListener.OnCallInDescriptorChanged(this.currentCallInDescriptor);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCallUIDescriptorChanged$35(VerificationApi.VerificationStateDescriptor verificationStateDescriptor, VerificationListener verificationListener) {
        VerificationApi.CallUIDescriptor callUIDescriptor = getCallUIDescriptor(verificationStateDescriptor);
        if (this.currentCallUIDescriptor != callUIDescriptor) {
            this.currentCallUIDescriptor = callUIDescriptor;
            verificationListener.OnCallUIDescriptorChanged(callUIDescriptor);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Boolean lambda$onCancel$2(VerificationApi.CancelReason cancelReason) {
        return Boolean.valueOf(cancel(cancelReason));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCompleteInternal$24(VerificationListener verificationListener) {
        verificationListener.onCompletedWithUserId(this.descriptor.getUserId(), this.verificationId, this.descriptor.getToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCompleteInternal$25(VerificationListener verificationListener) {
        verificationListener.onCompleted(this.descriptor.getModifiedPhoneNumber(), this.verificationId, this.descriptor.getToken());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onIsLastRouteChanged$39(VerificationApi.VerificationStateDescriptor verificationStateDescriptor, VerificationListener verificationListener) {
        boolean isLastRoute = verificationStateDescriptor.getIsLastRoute();
        if (this.isLastRoute != isLastRoute) {
            this.isLastRoute = isLastRoute;
            if (isMethodImplemented(verificationListener.getClass(), "OnIsLastRouteChanged", Boolean.TYPE)) {
                verificationListener.OnIsLastRouteChanged(isLastRoute);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMessengerDescriptorChanged$38(VerificationApi.VerificationStateDescriptor verificationStateDescriptor, VerificationListener verificationListener) {
        VerificationApi.MessengerDescriptor messengerDescriptor = getMessengerDescriptor(verificationStateDescriptor);
        if (this.currentMessengerDescriptor != messengerDescriptor) {
            this.currentMessengerDescriptor = messengerDescriptor;
            if (isMethodImplemented(verificationListener.getClass(), "OnMessengerDescriptorChanged", VerificationApi.MessengerDescriptor.class)) {
                verificationListener.OnMessengerDescriptorChanged(this.currentMessengerDescriptor);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onMobileIdDescriptorChanged$37(VerificationApi.VerificationStateDescriptor verificationStateDescriptor, VerificationListener verificationListener) {
        VerificationApi.MobileIdDescriptor mobileIdDescriptor = getMobileIdDescriptor(verificationStateDescriptor);
        if (this.currentMobileIdDescriptor != mobileIdDescriptor) {
            this.currentMobileIdDescriptor = mobileIdDescriptor;
            if (isMethodImplemented(verificationListener.getClass(), "OnMobileIdDescriptorChanged", VerificationApi.MobileIdDescriptor.class)) {
                verificationListener.OnMobileIdDescriptorChanged(this.currentMobileIdDescriptor);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onStateChanged$34(String str, VerificationApi.VerificationStateDescriptor verificationStateDescriptor, OnReceiveCodeDeliveryInfo onReceiveCodeDeliveryInfo) {
        onReceiveCodeDeliveryInfo.onReceiveCodeDeliveryInfo(str, verificationStateDescriptor.getCodeDeliveryInfo());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$onUiThread$0(AtomicReference atomicReference, gzs gzsVar, CountDownLatch countDownLatch) {
        atomicReference.set(gzsVar.invoke());
        countDownLatch.countDown();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onVerificationFailed$26(VerificationApi.VerificationStateDescriptor verificationStateDescriptor, VerificationListener verificationListener) {
        verificationListener.onProgress(false);
        verificationListener.onError(verificationStateDescriptor.getReason());
        if (verificationStateDescriptor.getReason() == VerificationApi.FailReason.GENERAL_ERROR) {
            cancel(VerificationApi.CancelReason.GENERAL_ERROR);
        } else {
            cancel(VerificationApi.CancelReason.OK);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onVerificationFinalized$23(VerificationApi.VerificationStateDescriptor verificationStateDescriptor, VerificationListener verificationListener) {
        verificationListener.onProgress(false);
        if (TextUtils.isEmpty(verificationStateDescriptor.getToken())) {
            verificationListener.onError(verificationStateDescriptor.getReason());
        } else {
            onCompleteInternal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onVerificationInitialStarted$30(VerificationListener verificationListener) {
        verificationListener.onProgress(true);
        verificationListener.onStateChanged(getState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onVerificationSucceeded$22(VerificationApi.VerificationStateDescriptor verificationStateDescriptor, VerificationListener verificationListener) {
        if (verificationStateDescriptor.getToken() == null || !TextUtils.equals(verificationStateDescriptor.getToken(), this.lastReportedToken)) {
            this.lastReportedToken = verificationStateDescriptor.getToken();
            verificationListener.onProgress(false);
            this.lastSuccessfulDescriptor = verificationStateDescriptor;
            onCompleteInternal();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onVerificationSuspended$29(VerificationListener verificationListener) {
        verificationListener.onProgress(true);
        verificationListener.onStateChanged(getState());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onVerifyingSmsCode$28(VerificationApi.VerificationStateDescriptor verificationStateDescriptor, VerificationListener verificationListener) {
        verificationListener.onProgress(true);
        verificationListener.onStateChanged(getState());
        if (verificationStateDescriptor.getSmsCodeInfo() == null || TextUtils.isEmpty(verificationStateDescriptor.getSmsCodeInfo().receivedSmsCode)) {
            return;
        }
        verificationListener.onSmsCodeReceived(verificationStateDescriptor.getSmsCodeInfo().receivedSmsCode);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onWaitingVerificationCode$27(VerificationApi.VerificationStateDescriptor verificationStateDescriptor, VerificationListener verificationListener) {
        verificationListener.onProgress(false);
        verificationListener.onStateChanged(getState());
        if (verificationStateDescriptor.getSmsCodeInfo() != null && !TextUtils.isEmpty(verificationStateDescriptor.getSmsCodeInfo().receivedSmsCode)) {
            verificationListener.onSmsCodeReceived(verificationStateDescriptor.getSmsCodeInfo().receivedSmsCode);
        }
        if (verificationStateDescriptor.getReason() != VerificationApi.FailReason.OK) {
            verificationListener.onError(verificationStateDescriptor.getReason());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$prepare2StepAuthCheck$13() {
        getVerificationApi().prepare2StepAuthCheck();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestIvrCall$15(VerificationApi.FailReason failReason, VerificationListener verificationListener) {
        verificationListener.onProgress(false);
        if (failReason == VerificationApi.FailReason.OK) {
            verificationListener.onIvrCallCompleted();
            return;
        }
        this.validationRequestStarted = 0L;
        verificationListener.onIvrTimeoutUpdated();
        verificationListener.onIvrCallError(failReason);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestIvrCall$16(VerificationApi.FailReason failReason) {
        this.listener.ifPresent(new xmr0(0, this, failReason));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestIvrCall$17(VerificationApi.FailReason failReason) {
        Utils.uiHandler.post(new qn9(8, this, failReason));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestIvrCall$18(VerificationListener verificationListener) {
        if (TextUtils.isEmpty(this.verificationId)) {
            verificationListener.onError(VerificationApi.FailReason.GENERAL_ERROR);
            return;
        }
        verificationListener.onProgress(true);
        this.validationRequestStarted = System.nanoTime();
        verificationListener.onIvrTimeoutUpdated();
        getVerificationApi().requestIvrPhoneCall(this.verificationId, new VerificationApi.IvrStateListener() { // from class: xsna.umr0
            @Override // ru.mail.libverify.api.VerificationApi.IvrStateListener
            public final void onRequestExecuted(VerificationApi.FailReason failReason) {
                VerificationController.this.lambda$requestIvrCall$17(failReason);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$requestNewSmsCode$19(VerificationListener verificationListener) {
        verificationListener.onError(VerificationApi.FailReason.GENERAL_ERROR);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reset$42() {
        getVerificationApi().reset();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$resetVerificationId$31(VerificationListener verificationListener) {
        verificationListener.onStateChanged(State.ENTER_PHONE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendCallInClickStats$1() {
        if (TextUtils.isEmpty(this.verificationId)) {
            return;
        }
        getVerificationApi().sendCallInClickStats(this.verificationId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setVKCListener$40(VerificationVKCListener verificationVKCListener) {
        this.vkcListener = verificationVKCListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String lambda$startVerification$41(String str, String str2, String str3, Map map, VerifyRoute verifyRoute, VerificationParameters verificationParameters) {
        return getVerificationApi().startVerification(str, str2, str3, map, verifyRoute, verificationParameters);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$subscribeSmsNotificationListener$11(VerificationApi.SmsCodeNotificationListener smsCodeNotificationListener) {
        getVerificationApi().addSmsCodeNotificationListener(smsCodeNotificationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$unSubscribeSmsNotificationListener$12(VerificationApi.SmsCodeNotificationListener smsCodeNotificationListener) {
        getVerificationApi().removeSmsCodeNotificationListener(smsCodeNotificationListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$verifySmsCode$14(VerificationListener verificationListener) {
        verificationListener.onError(VerificationApi.FailReason.GENERAL_ERROR);
    }

    private void loadVerificationId() {
        if (TextUtils.isEmpty(this.verificationId)) {
            this.verificationId = getPreferences().getString(VERIFICATION_SESSION_ID, null);
        }
    }

    private void onCallInDescriptorChanged(final VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        this.listener.ifPresent(new Optional.Action() { // from class: xsna.wmr0
            @Override // ru.mail.libverify.utils.Optional.Action
            public final void accept(Object obj) {
                VerificationController.this.lambda$onCallInDescriptorChanged$36(verificationStateDescriptor, (VerificationListener) obj);
            }
        });
    }

    private void onCallUIDescriptorChanged(VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        this.listener.ifPresent(new bzc0(this, verificationStateDescriptor));
    }

    private void onCompleteInternal() {
        if (!TextUtils.isEmpty(this.verificationId)) {
            if (!TextUtils.isEmpty(this.descriptor.getUserId())) {
                this.listener.ifPresent(new hkc0(this, 9));
                return;
            } else if (!TextUtils.isEmpty(this.descriptor.getModifiedPhoneNumber())) {
                this.listener.ifPresent(new oq80(this, 11));
                return;
            }
        }
        if (!this.descriptor.isVKCLogin()) {
            FileLog.e(LOG_TAG, "Phone number and userId is empty!");
            return;
        }
        VerificationVKCListener verificationVKCListener = this.vkcListener;
        if (verificationVKCListener != null) {
            verificationVKCListener.onCompletedVKC(this.verificationId, this.descriptor.getToken());
        }
    }

    private void onIsLastRouteChanged(VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        this.listener.ifPresent(new u2t(this, verificationStateDescriptor));
    }

    private void onMessengerDescriptorChanged(VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        this.listener.ifPresent(new an6(this, verificationStateDescriptor));
    }

    private void onMobileIdDescriptorChanged(VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        this.listener.ifPresent(new cod0(this, verificationStateDescriptor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onStateChanged(@NonNull final String str, final VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        String str2;
        if (TextUtils.equals(str, this.verificationId)) {
            if (verificationStateDescriptor == null) {
                resetVerificationId();
                return;
            }
            onCallUIDescriptorChanged(verificationStateDescriptor);
            onCallInDescriptorChanged(verificationStateDescriptor);
            onMobileIdDescriptorChanged(verificationStateDescriptor);
            onMessengerDescriptorChanged(verificationStateDescriptor);
            onIsLastRouteChanged(verificationStateDescriptor);
            checkIvrTimeUpdated(this.descriptor, verificationStateDescriptor);
            this.descriptor = verificationStateDescriptor;
            if (verificationStateDescriptor.getCodeDeliveryInfo() == null) {
                str2 = "null";
            } else {
                str2 = "CodeDeliveryInfo(routeType=" + verificationStateDescriptor.getCodeDeliveryInfo().getRouteType() + ",status=" + verificationStateDescriptor.getCodeDeliveryInfo().getStatus() + ")";
            }
            FileLog.d(LOG_TAG, "state.isUpdatedCodeDeliveryInfo() = " + verificationStateDescriptor.isUpdatedCodeDeliveryInfo() + " | " + str2);
            if (verificationStateDescriptor.isUpdatedCodeDeliveryInfo() && verificationStateDescriptor.getCodeDeliveryInfo() != null && verificationStateDescriptor.getCodeDeliveryInfo().getStatus() != CodeDeliveryStatus.UNKNOWN) {
                this.onReceiveCodeDeliveryInfo.ifPresent(new Optional.Action() { // from class: xsna.vmr0
                    @Override // ru.mail.libverify.utils.Optional.Action
                    public final void accept(Object obj) {
                        VerificationController.lambda$onStateChanged$34(str, verificationStateDescriptor, (OnReceiveCodeDeliveryInfo) obj);
                    }
                });
            }
            switch (AnonymousClass1.$SwitchMap$ru$mail$libverify$api$VerificationApi$VerificationState[this.descriptor.getState().ordinal()]) {
                case 1:
                case 2:
                    onVerificationInitialStarted();
                    return;
                case 3:
                    onVerificationSuspended(this.descriptor);
                    return;
                case 4:
                    onVerifyingSmsCode(this.descriptor);
                    return;
                case 5:
                    onWaitingVerificationCode(this.descriptor);
                    return;
                case 6:
                    onVerificationFailed(this.descriptor);
                    return;
                case 7:
                    onVerificationFinalized(this.descriptor);
                    return;
                case 8:
                    onVerificationSucceeded(this.descriptor);
                    return;
                default:
                    Locale locale = Locale.US;
                    FileLog.e(LOG_TAG, "Handler for " + this.descriptor.getState() + " state is not defined");
                    throw new IllegalStateException("Handler for state is not defined");
            }
        }
    }

    private <T> T onUiThread(gzs<T> gzsVar) {
        if (Thread.currentThread().equals(Utils.uiHandler.getLooper().getThread())) {
            return gzsVar.invoke();
        }
        AtomicReference atomicReference = new AtomicReference();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        Utils.uiHandler.post(new nq9(atomicReference, gzsVar, countDownLatch, 1));
        try {
            countDownLatch.await();
            return (T) atomicReference.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private void resetVerificationId() {
        this.descriptor = null;
        this.verificationId = null;
        this.validationRequestStarted = 0L;
        this.lastReportedToken = null;
        this.lastSuccessfulDescriptor = null;
        getPreferences().edit().putString(VERIFICATION_SESSION_ID, null).apply();
        this.listener.ifPresent(new vcl0(7));
    }

    private void updateVerificationId(@NonNull String str) {
        this.verificationId = str;
        getPreferences().edit().putString(VERIFICATION_SESSION_ID, this.verificationId).apply();
    }

    public boolean cancel(VerificationApi.CancelReason cancelReason) {
        boolean z;
        if (TextUtils.isEmpty(this.verificationId)) {
            z = false;
        } else {
            getVerificationApi().cancelVerification(this.verificationId, cancelReason);
            z = true;
        }
        resetVerificationId();
        return z;
    }

    public final void checkProfileVerification() {
        onUiThread(new o4(this, 21));
    }

    public void complete() {
        if (!TextUtils.isEmpty(this.verificationId)) {
            getVerificationApi().completeVerification(this.verificationId);
        }
        resetVerificationId();
    }

    public void dismissError() {
        if (TextUtils.isEmpty(this.verificationId)) {
            return;
        }
        getVerificationApi().resetVerificationCodeError(this.verificationId);
    }

    @Override // ru.mail.libverify.controls.VerificationSupportProvider
    @Nullable
    public String[] getAllowedPermissions() {
        return null;
    }

    public long getIvrTimeout() {
        VerificationApi.VerificationStateDescriptor verificationStateDescriptor = this.descriptor;
        return (verificationStateDescriptor == null || verificationStateDescriptor.getIvrInfo() == null || this.descriptor.getIvrInfo().defaultIvrTimeoutApplied) ? getIvrTimeoutDefault() : this.descriptor.getIvrInfo().ivrTimeoutSec * 1000;
    }

    public final long getIvtUnblockTimeout() {
        return ((Long) onUiThread(new tbe0(this, 19))).longValue();
    }

    @Nullable
    public final String getModifiedPhoneNumber() {
        return (String) onUiThread(new nid0(this, 18));
    }

    public VerificationApi.PhoneNumberCheckSession getPhoneCheckSession() {
        return (VerificationApi.PhoneNumberCheckSession) onUiThread(new iml0(this, 11));
    }

    @Nullable
    public final String getSmsCode() {
        return (String) onUiThread(new ipq0(this, 1));
    }

    public final int getSmsCodeLength() {
        return ((Integer) onUiThread(new mlf0(this, 12))).intValue();
    }

    public final State getState() {
        return (State) onUiThread(new d3j0(this, 10));
    }

    @Nullable
    @SuppressLint({"MissingPermission"})
    public final String getSuggestedPhoneNumber() {
        return (String) onUiThread(new m5o0(this, 6));
    }

    public final VerificationApi getVerificationApi() {
        if (this.verificationApi == null) {
            VerificationApi verificationFactory = VerificationFactory.getInstance(this.context);
            this.verificationApi = verificationFactory;
            verificationFactory.addVerificationStateChangedListener(this.apiListener);
        }
        return this.verificationApi;
    }

    public final boolean hasIncompletedVerification() {
        return ((Boolean) onUiThread(new kld0(this, 21))).booleanValue();
    }

    public void initLibverify() {
        VerificationFactory.initialize(this.context);
    }

    public void initLibverifyLogs() {
        LogReceiver logReceiver = getLogReceiver();
        UncaughtExceptionListener exceptionListener = getExceptionListener();
        if (logReceiver == null || exceptionListener == null) {
            throw new IllegalArgumentException("getLogReceiver() and getExceptionListener() must return non null values for this method call");
        }
        VerificationFactory.setLogReceiver(logReceiver);
        VerificationFactory.setUncaughtExceptionListener(exceptionListener);
    }

    public final void internalCheckProfileVerification() {
        boolean z = getPreferences().getBoolean(VERIFICATION_INITIAL_PROFILE_CHECK, false);
        String alreadyExistingProfileDataJson = getAlreadyExistingProfileDataJson();
        if (z || TextUtils.isEmpty(alreadyExistingProfileDataJson)) {
            return;
        }
        getVerificationApi().checkAccountVerification(alreadyExistingProfileDataJson);
        getPreferences().edit().putBoolean(VERIFICATION_INITIAL_PROFILE_CHECK, true).apply();
    }

    public final long internalGetIvtUnblockTimeout() {
        long ivrTimeout = getIvrTimeout() - TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - this.validationRequestStarted);
        if (ivrTimeout < 0) {
            return 0L;
        }
        return ivrTimeout;
    }

    public VerificationApi.PhoneNumberCheckSession internalGetPhoneCheckSession() {
        if (this.phoneNumberCheckSession == null) {
            this.phoneNumberCheckSession = new VerificationApi.PhoneNumberCheckSession(getVerificationApi(), getVerificationService());
        }
        return this.phoneNumberCheckSession;
    }

    public final int internalGetSmsCodeLength() {
        VerificationApi.VerificationStateDescriptor verificationStateDescriptor = this.descriptor;
        return (verificationStateDescriptor == null || verificationStateDescriptor.getSmsCodeInfo() == null || this.descriptor.getSmsCodeInfo().smsCodeLength <= 0) ? getSmsCodeLengthDefault() : this.descriptor.getSmsCodeInfo().smsCodeLength;
    }

    public final String internalGetSuggestedPhoneNumber() {
        List<VerificationApi.PhoneAccountSearchItem> list = this.suggestedAccounts;
        if (list != null) {
            if (list.size() == 1) {
                return this.suggestedAccounts.get(0).phone;
            }
            return null;
        }
        if (!this.suggestedAccountsRequested) {
            boolean hasSelfPermission = Utils.hasSelfPermission(this.context, "android.permission.READ_PHONE_STATE");
            if (!Utils.hasSelfPermission(this.context, "android.permission.READ_PHONE_NUMBERS")) {
                hasSelfPermission = false;
            }
            if (!hasSelfPermission) {
                String[] allowedPermissions = getAllowedPermissions();
                FileLog.v(LOG_TAG, "getSuggestedPhoneNumber: allowed permission %s", Arrays.toString(allowedPermissions));
                if (allowedPermissions != null) {
                    if (Utils.checkAllowedPermission(allowedPermissions, "android.permission.READ_PHONE_NUMBERS") ? Utils.checkAllowedPermission(allowedPermissions, "android.permission.READ_PHONE_STATE") : false) {
                        hasSelfPermission = true;
                    }
                    getVerificationApi().setAllowedPermissions(allowedPermissions);
                }
            }
            if (hasSelfPermission) {
                getVerificationApi().searchPhoneAccounts(this.accountListener);
            }
            this.suggestedAccountsRequested = true;
        }
        return null;
    }

    public final boolean internalIsValidSmsCode(@NonNull CharSequence charSequence) {
        if (this.descriptor == null || TextUtils.isEmpty(charSequence)) {
            return false;
        }
        int smsCodeLengthDefault = (this.descriptor.getSmsCodeInfo() == null || this.descriptor.getSmsCodeInfo().smsCodeLength <= 0) ? getSmsCodeLengthDefault() : this.descriptor.getSmsCodeInfo().smsCodeLength;
        if (charSequence.length() != smsCodeLengthDefault) {
            return false;
        }
        return smsCodeLengthDefault == 0 || !isNumericCode() || isNumericCodeInternal(charSequence);
    }

    @NonNull
    /* renamed from: internalLoginVKConnect, reason: merged with bridge method [inline-methods] */
    public String lambda$loginVKConnect$20(@Nullable String str) {
        if (!TextUtils.isEmpty(this.verificationId)) {
            LogReceiver logReceiver = getLogReceiver();
            if (logReceiver != null) {
                logReceiver.e(LOG_TAG, DUPLICATE_SESSION_ERROR);
            }
            cancel(VerificationApi.CancelReason.GENERAL_ERROR);
        }
        this.validationRequestStarted = System.nanoTime();
        String[] allowedPermissions = getAllowedPermissions();
        if (allowedPermissions != null) {
            getVerificationApi().setAllowedPermissions(allowedPermissions);
        }
        String loggedInWithVKConnect = getVerificationApi().loggedInWithVKConnect(getVerificationService(), str);
        updateVerificationId(loggedInWithVKConnect);
        this.listener.ifPresent(new yul0(2));
        return loggedInWithVKConnect;
    }

    /* renamed from: internalSetListener, reason: merged with bridge method [inline-methods] */
    public final void lambda$setListener$9(@Nullable VerificationListener verificationListener) {
        this.listener = Optional.ofNullable(verificationListener);
        if (verificationListener != null) {
            loadVerificationId();
            VerificationApi verificationApi = getVerificationApi();
            if (TextUtils.isEmpty(this.verificationId)) {
                verificationListener.onStateChanged(State.ENTER_PHONE);
            } else {
                verificationApi.requestVerificationState(this.verificationId, this.apiListener);
            }
        }
    }

    public final boolean isNumericCode() {
        return ((Boolean) onUiThread(new b6f0(this, 14))).booleanValue();
    }

    public final boolean isValidSmsCode(@NonNull CharSequence charSequence) {
        return ((Boolean) onUiThread(new ss3(23, this, charSequence))).booleanValue();
    }

    @NonNull
    public String loginVKConnect(@Nullable String str) {
        return (String) onUiThread(new ag1(18, this, str));
    }

    public boolean onCancel(VerificationApi.CancelReason cancelReason) {
        return ((Boolean) onUiThread(new ume0(10, this, cancelReason))).booleanValue();
    }

    public void onConfirmed() {
        onUiThread(new gh1(this, 9));
    }

    public void onEnterSmsCode(@NonNull String str) {
        onUiThread(new aaq(6, this, str));
    }

    public void onErrorDismissed() {
        onUiThread(new bi5(this, 11));
    }

    @Deprecated(since = "2.11.3 [267]")
    public void onLoginWithVKConnect(@NonNull String str) {
        loginVKConnect(str);
    }

    @NonNull
    public String onLoginWithVKConnect2(@Nullable String str) {
        return loginVKConnect(str);
    }

    public void onRequestIvrCall() {
        onUiThread(new hv1(this, 19));
    }

    public void onResendSms() {
        onUiThread(new p69(this, 10));
    }

    public void onStart(@NonNull String str) {
        start(str, null, null, false, null, null);
    }

    public void onStartWithUserId(@NonNull String str) {
        start(null, str, null, false, null, null);
    }

    public void onStartWithVKConnect(@NonNull String str, @NonNull String str2) {
        start(str, null, str2, true, null, null);
    }

    public void onVerificationFailed(@NonNull VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        this.listener.ifPresent(new fl60(this, verificationStateDescriptor));
    }

    public void onVerificationFinalized(@NonNull VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        VerificationApi.VerificationStateDescriptor verificationStateDescriptor2 = this.lastSuccessfulDescriptor;
        if (verificationStateDescriptor2 == null || !verificationStateDescriptor2.completedSuccessfully()) {
            this.listener.ifPresent(new gl60(this, verificationStateDescriptor));
        } else {
            FileLog.d(LOG_TAG, "Early return from onVerificationFinalized(): listener.onCompleted() has already been called with successful descriptor.");
        }
    }

    public void onVerificationInitialStarted() {
        this.listener.ifPresent(new ga40(this, 15));
    }

    public void onVerificationSucceeded(@NonNull VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        this.listener.ifPresent(new u8c0(this, verificationStateDescriptor));
    }

    public void onVerificationSuspended(@NonNull VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        this.listener.ifPresent(new j630(this, 21));
    }

    public void onVerifyingSmsCode(@NonNull VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        this.listener.ifPresent(new gcd(this, verificationStateDescriptor));
    }

    public void onWaitingVerificationCode(@NonNull VerificationApi.VerificationStateDescriptor verificationStateDescriptor) {
        this.listener.ifPresent(new zah0(this, verificationStateDescriptor));
    }

    public void prepare2StepAuthCheck() {
        onUiThread(new u12(this, 13));
    }

    public void requestIvrCall() {
        this.listener.ifPresent(new mlh0(this, 5));
    }

    public void requestNewSmsCode() {
        if (TextUtils.isEmpty(this.verificationId)) {
            this.listener.ifPresent(new y5r0(1));
            return;
        }
        this.validationRequestStarted = System.nanoTime();
        this.listener.ifPresent(new iun0(5));
        getVerificationApi().requestNewSmsCode(this.verificationId);
    }

    public void reset() {
        onUiThread(new vb(this, 19));
    }

    public void sendCallInClickStats() {
        onUiThread(new iv1(this, 13));
    }

    public void setApiEndpoints(@NonNull Map<String, String> map) {
        VerificationFactory.setApiEndpoints(this.context, map);
    }

    public void setCustomLocale(@NonNull Locale locale) {
        VerificationFactory.setCustomLocale(this.context, locale);
    }

    public final void setListener(@Nullable VerificationListener verificationListener) {
        onUiThread(new nek(6, this, verificationListener));
    }

    public final void setOnReceiveCodeDeliveryInfo(@Nullable OnReceiveCodeDeliveryInfo onReceiveCodeDeliveryInfo) {
        this.onReceiveCodeDeliveryInfo = Optional.ofNullable(onReceiveCodeDeliveryInfo);
    }

    public void setVKCListener(@Nullable VerificationVKCListener verificationVKCListener) {
        onUiThread(new kgb(7, this, verificationVKCListener));
    }

    @Deprecated
    public void signOut() {
        getPreferences().edit().remove(VERIFICATION_INITIAL_PROFILE_CHECK).apply();
        VerificationFactory.signOut(this.context, false);
    }

    public void softSignOut() {
        getPreferences().edit().remove(VERIFICATION_INITIAL_PROFILE_CHECK).apply();
        VerificationFactory.softSignOut(this.context);
    }

    public void start(@Nullable final String str, @Nullable final String str2, @Nullable final String str3, final boolean z, @Nullable final VerifyRoute verifyRoute, @Nullable final VerificationParameters verificationParameters) {
        onUiThread(new Runnable() { // from class: xsna.zmr0
            @Override // java.lang.Runnable
            public final void run() {
                VerificationController.this.lambda$start$32(str, str2, str3, z, verifyRoute, verificationParameters);
            }
        });
    }

    /* renamed from: startInternal, reason: merged with bridge method [inline-methods] */
    public void lambda$start$32(@Nullable String str, @Nullable String str2, @Nullable String str3, boolean z, @Nullable VerifyRoute verifyRoute, @Nullable VerificationParameters verificationParameters) {
        if (!TextUtils.isEmpty(this.verificationId)) {
            LogReceiver logReceiver = getLogReceiver();
            if (logReceiver != null) {
                logReceiver.e(LOG_TAG, DUPLICATE_SESSION_ERROR);
            }
            cancel(VerificationApi.CancelReason.GENERAL_ERROR);
        }
        this.validationRequestStarted = System.nanoTime();
        String[] allowedPermissions = getAllowedPermissions();
        FileLog.v(LOG_TAG, "getSuggestedPhoneNumber: allowed permission %s", Arrays.toString(allowedPermissions));
        if (allowedPermissions != null) {
            getVerificationApi().setAllowedPermissions(allowedPermissions);
        }
        this.lastReportedToken = null;
        updateVerificationId(z ? getVerificationApi().startVerificationWithVKConnect(getVerificationService(), str, str2, getSmsCodeTemplatesDefault(), str3, verificationParameters) : getVerificationApi().startVerification(getVerificationService(), str, str2, getSmsCodeTemplatesDefault(), verifyRoute, verificationParameters));
        this.listener.ifPresent(new jgj0(7));
    }

    public String startVerification(@NonNull final String str, @NonNull final String str2, @Nullable final String str3, @Nullable final Map<String, String> map, @Nullable final VerifyRoute verifyRoute, @Nullable final VerificationParameters verificationParameters) {
        return (String) onUiThread(new gzs() { // from class: xsna.ymr0
            @Override // xsna.gzs
            public final Object invoke() {
                String lambda$startVerification$41;
                lambda$startVerification$41 = VerificationController.this.lambda$startVerification$41(str, str2, str3, map, verifyRoute, verificationParameters);
                return lambda$startVerification$41;
            }
        });
    }

    public void subscribeSmsNotificationListener(@NonNull VerificationApi.SmsCodeNotificationListener smsCodeNotificationListener) {
        onUiThread(new i6k(6, this, smsCodeNotificationListener));
    }

    public void unSubscribeSmsNotificationListener(@NonNull VerificationApi.SmsCodeNotificationListener smsCodeNotificationListener) {
        onUiThread(new i0(12, this, smsCodeNotificationListener));
    }

    /* renamed from: verifySmsCode, reason: merged with bridge method [inline-methods] */
    public void lambda$onEnterSmsCode$3(@NonNull String str) {
        if (TextUtils.isEmpty(this.verificationId) || !isValidSmsCode(str)) {
            this.listener.ifPresent(new caf0(3));
            return;
        }
        VerificationApi.VerificationStateDescriptor verificationStateDescriptor = this.descriptor;
        if (verificationStateDescriptor == null || TextUtils.isEmpty(verificationStateDescriptor.getToken())) {
            getVerificationApi().verifySmsCode(this.verificationId, str);
        } else {
            onVerificationSucceeded(this.descriptor);
        }
    }

    public void onStart(@NonNull String str, @Nullable VerificationParameters verificationParameters) {
        start(str, null, null, false, null, verificationParameters);
    }

    public void onStartWithUserId(@NonNull String str, VerificationParameters verificationParameters) {
        start(null, str, null, false, null, verificationParameters);
    }

    public void onStartWithVKConnect(@NonNull String str, @NonNull String str2, @Nullable VerificationParameters verificationParameters) {
        start(str, null, str2, true, null, verificationParameters);
    }

    public void signOut(boolean z, @Nullable SignOutCallback signOutCallback) {
        getPreferences().edit().remove(VERIFICATION_INITIAL_PROFILE_CHECK).apply();
        VerificationFactory.signOut(this.context, z, signOutCallback);
    }

    public void softSignOut(SignOutCallback signOutCallback) {
        getPreferences().edit().remove(VERIFICATION_INITIAL_PROFILE_CHECK).apply();
        VerificationFactory.softSignOut(this.context, signOutCallback);
    }

    public VerificationController(@NonNull Context context, @NonNull PlatformCoreService... platformCoreServiceArr) {
        int i = 0;
        this.apiListener = new VerificationStateChangedListener(this, i);
        this.accountListener = new PhoneAccountSearchListener(this, i);
        this.context = context;
        VerificationFactory.setPlatformService(context, platformCoreServiceArr);
    }

    private void onUiThread(Runnable runnable) {
        if (Thread.currentThread().equals(Utils.uiHandler.getLooper().getThread())) {
            runnable.run();
        } else {
            Utils.uiHandler.post(runnable);
        }
    }
}
