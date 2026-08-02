package com.yandex.payment.sdk.feature.flags;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b'\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\r\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-¨\u0006."}, d2 = {"Lcom/yandex/payment/sdk/feature/flags/FeatureFlag;", "", "", "flagName", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "", "defaultValue", "Z", "a", "()Z", "isSavable", "f", "FULLSCREEN_FLAG", "DIV_KIT_MASTER_FLAG", "TELEMETRY_FLAG", "BINDING_PSP_FLAG", "ALLOW_SCREEN_SHOT_FLAG", "DEBRANDING_FLAG", "IS_PAYMENT_START_AFTER_TOP_UP_FLAG", "DIV_KIT_EXIT_FLAG", "DIV_KIT_LICENSE_FLAG", "DIV_KIT_BIND_FLAG", "DIV_KIT_RESULT_FLAG", "DIV_KIT_CHALLENGER_FLAG", "DIV_KIT_SELECT_FLAG", "DIV_KIT_PRESELECT_FLAG", "DIV_KIT_SBP_FLAG", "YB_PROMOTION_FLAG", "YB_TOP_UP_FLAG", "ENABLE_NFC_FLAG", "ENABLE_CHECK_PAYMENT", "IS_STAFF", "NO_CVV_MIR_PAY", "NO_CVV_MIR_BINDING", "RETRY_BACKGROUND_POLLING", "DK_SELECT_VIEW_MODEL_REFACTORING", "RESTORE_PAYMENT_API_FORBIDDEN", "WEBVIEW_CACHE", "BIND_CARD_MEDIATOR_REFACTORING", "CARD_NUMBER_ZERO_VALIDATION", "ENABLE_CARD_SCANNER_FLAG", "CUSTOM_TELEMETRY_FLAG", "ENABLE_BIOMETRY", "ENABLE_BIOMETRY_WITH_PASSWORD", "feature-flags_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class FeatureFlag {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ FeatureFlag[] $VALUES;
    public static final FeatureFlag ALLOW_SCREEN_SHOT_FLAG;
    public static final FeatureFlag BINDING_PSP_FLAG;
    public static final FeatureFlag BIND_CARD_MEDIATOR_REFACTORING;
    public static final FeatureFlag CARD_NUMBER_ZERO_VALIDATION;
    public static final FeatureFlag CUSTOM_TELEMETRY_FLAG;
    public static final FeatureFlag DEBRANDING_FLAG;
    public static final FeatureFlag DIV_KIT_BIND_FLAG;
    public static final FeatureFlag DIV_KIT_CHALLENGER_FLAG;
    public static final FeatureFlag DIV_KIT_EXIT_FLAG;
    public static final FeatureFlag DIV_KIT_LICENSE_FLAG;
    public static final FeatureFlag DIV_KIT_MASTER_FLAG;
    public static final FeatureFlag DIV_KIT_PRESELECT_FLAG;
    public static final FeatureFlag DIV_KIT_RESULT_FLAG;
    public static final FeatureFlag DIV_KIT_SBP_FLAG;
    public static final FeatureFlag DIV_KIT_SELECT_FLAG;
    public static final FeatureFlag DK_SELECT_VIEW_MODEL_REFACTORING;
    public static final FeatureFlag ENABLE_BIOMETRY;
    public static final FeatureFlag ENABLE_BIOMETRY_WITH_PASSWORD;
    public static final FeatureFlag ENABLE_CARD_SCANNER_FLAG;
    public static final FeatureFlag ENABLE_CHECK_PAYMENT;
    public static final FeatureFlag ENABLE_NFC_FLAG;
    public static final FeatureFlag FULLSCREEN_FLAG;
    public static final FeatureFlag IS_PAYMENT_START_AFTER_TOP_UP_FLAG;
    public static final FeatureFlag IS_STAFF;
    public static final FeatureFlag NO_CVV_MIR_BINDING;
    public static final FeatureFlag NO_CVV_MIR_PAY;
    public static final FeatureFlag RESTORE_PAYMENT_API_FORBIDDEN;
    public static final FeatureFlag RETRY_BACKGROUND_POLLING;
    public static final FeatureFlag TELEMETRY_FLAG;
    public static final FeatureFlag WEBVIEW_CACHE;
    public static final FeatureFlag YB_PROMOTION_FLAG;
    public static final FeatureFlag YB_TOP_UP_FLAG;
    private final boolean defaultValue;
    private final String flagName;
    private final boolean isSavable;

    static {
        FeatureFlag featureFlag = new FeatureFlag(true, 0, "FULLSCREEN_FLAG", "enableFullScreen", false);
        FULLSCREEN_FLAG = featureFlag;
        FeatureFlag featureFlag2 = new FeatureFlag(true, 1, "DIV_KIT_MASTER_FLAG", "enableDivKit", false);
        DIV_KIT_MASTER_FLAG = featureFlag2;
        FeatureFlag featureFlag3 = new FeatureFlag(false, 2, "TELEMETRY_FLAG", "enableTelemetry", true);
        TELEMETRY_FLAG = featureFlag3;
        FeatureFlag featureFlag4 = new FeatureFlag(false, 3, "BINDING_PSP_FLAG", "enablePspBindCard", false);
        BINDING_PSP_FLAG = featureFlag4;
        FeatureFlag featureFlag5 = new FeatureFlag(false, 4, "ALLOW_SCREEN_SHOT_FLAG", "onlyCardScreenScreenShot", false);
        ALLOW_SCREEN_SHOT_FLAG = featureFlag5;
        FeatureFlag featureFlag6 = new FeatureFlag(true, 5, "DEBRANDING_FLAG", "enableDebranding", false);
        DEBRANDING_FLAG = featureFlag6;
        FeatureFlag featureFlag7 = new FeatureFlag(false, 6, "IS_PAYMENT_START_AFTER_TOP_UP_FLAG", "isPaymentStartAfterTopUp", false);
        IS_PAYMENT_START_AFTER_TOP_UP_FLAG = featureFlag7;
        FeatureFlag featureFlag8 = new FeatureFlag(true, 7, "DIV_KIT_EXIT_FLAG", "divKitExitEnabled", false);
        DIV_KIT_EXIT_FLAG = featureFlag8;
        FeatureFlag featureFlag9 = new FeatureFlag(true, 8, "DIV_KIT_LICENSE_FLAG", "divKitLicenseEnabled", false);
        DIV_KIT_LICENSE_FLAG = featureFlag9;
        FeatureFlag featureFlag10 = new FeatureFlag(true, 9, "DIV_KIT_BIND_FLAG", "divKitBindEnabled", false);
        DIV_KIT_BIND_FLAG = featureFlag10;
        FeatureFlag featureFlag11 = new FeatureFlag(true, 10, "DIV_KIT_RESULT_FLAG", "divKitResultEnabled", false);
        DIV_KIT_RESULT_FLAG = featureFlag11;
        FeatureFlag featureFlag12 = new FeatureFlag(true, 11, "DIV_KIT_CHALLENGER_FLAG", "divKitChallengerEnabled", false);
        DIV_KIT_CHALLENGER_FLAG = featureFlag12;
        FeatureFlag featureFlag13 = new FeatureFlag(true, 12, "DIV_KIT_SELECT_FLAG", "divKitSelectEnabled", false);
        DIV_KIT_SELECT_FLAG = featureFlag13;
        FeatureFlag featureFlag14 = new FeatureFlag(true, 13, "DIV_KIT_PRESELECT_FLAG", "divKitPreselectEnabled", false);
        DIV_KIT_PRESELECT_FLAG = featureFlag14;
        FeatureFlag featureFlag15 = new FeatureFlag(true, 14, "DIV_KIT_SBP_FLAG", "divKitSbpEnabled", false);
        DIV_KIT_SBP_FLAG = featureFlag15;
        FeatureFlag featureFlag16 = new FeatureFlag(false, 15, "YB_PROMOTION_FLAG", "yBPromotionFlag", false);
        YB_PROMOTION_FLAG = featureFlag16;
        FeatureFlag featureFlag17 = new FeatureFlag(false, 16, "YB_TOP_UP_FLAG", "yBTopUpFlag", false);
        YB_TOP_UP_FLAG = featureFlag17;
        FeatureFlag featureFlag18 = new FeatureFlag(false, 17, "ENABLE_NFC_FLAG", "enableNfcScanning", false);
        ENABLE_NFC_FLAG = featureFlag18;
        FeatureFlag featureFlag19 = new FeatureFlag(false, 18, "ENABLE_CHECK_PAYMENT", "bankCheckPaymentEnabled", false);
        ENABLE_CHECK_PAYMENT = featureFlag19;
        FeatureFlag featureFlag20 = new FeatureFlag(false, 19, "IS_STAFF", "isStaff", false);
        IS_STAFF = featureFlag20;
        FeatureFlag featureFlag21 = new FeatureFlag(false, 20, "NO_CVV_MIR_PAY", "noCvvMirPayEnabled", false);
        NO_CVV_MIR_PAY = featureFlag21;
        FeatureFlag featureFlag22 = new FeatureFlag(false, 21, "NO_CVV_MIR_BINDING", "noCvvMirBindingEnabled", false);
        NO_CVV_MIR_BINDING = featureFlag22;
        FeatureFlag featureFlag23 = new FeatureFlag(false, 22, "RETRY_BACKGROUND_POLLING", "retryBackgroundPolling", false);
        RETRY_BACKGROUND_POLLING = featureFlag23;
        FeatureFlag featureFlag24 = new FeatureFlag(false, 23, "DK_SELECT_VIEW_MODEL_REFACTORING", "dkSelectViewModelRefactoringEnabled", false);
        DK_SELECT_VIEW_MODEL_REFACTORING = featureFlag24;
        FeatureFlag featureFlag25 = new FeatureFlag(false, 24, "RESTORE_PAYMENT_API_FORBIDDEN", "restorePaymentApiForbidden", false);
        RESTORE_PAYMENT_API_FORBIDDEN = featureFlag25;
        FeatureFlag featureFlag26 = new FeatureFlag(false, 25, "WEBVIEW_CACHE", "webViewCacheEnabled", false);
        WEBVIEW_CACHE = featureFlag26;
        FeatureFlag featureFlag27 = new FeatureFlag(false, 26, "BIND_CARD_MEDIATOR_REFACTORING", "bindCardMediatorRefactoring", false);
        BIND_CARD_MEDIATOR_REFACTORING = featureFlag27;
        FeatureFlag featureFlag28 = new FeatureFlag(true, 27, "CARD_NUMBER_ZERO_VALIDATION", "cardNumberZeroValidationEnabled", false);
        CARD_NUMBER_ZERO_VALIDATION = featureFlag28;
        FeatureFlag featureFlag29 = new FeatureFlag(false, 28, "ENABLE_CARD_SCANNER_FLAG", "cardScannerEnabled", false);
        ENABLE_CARD_SCANNER_FLAG = featureFlag29;
        FeatureFlag featureFlag30 = new FeatureFlag(false, 29, "CUSTOM_TELEMETRY_FLAG", "enableCustomTelemetry", false);
        CUSTOM_TELEMETRY_FLAG = featureFlag30;
        FeatureFlag featureFlag31 = new FeatureFlag(false, 30, "ENABLE_BIOMETRY", "enableBiometry", false);
        ENABLE_BIOMETRY = featureFlag31;
        FeatureFlag featureFlag32 = new FeatureFlag(false, 31, "ENABLE_BIOMETRY_WITH_PASSWORD", "enableBiometryWithPassword", false);
        ENABLE_BIOMETRY_WITH_PASSWORD = featureFlag32;
        FeatureFlag[] featureFlagArr = {featureFlag, featureFlag2, featureFlag3, featureFlag4, featureFlag5, featureFlag6, featureFlag7, featureFlag8, featureFlag9, featureFlag10, featureFlag11, featureFlag12, featureFlag13, featureFlag14, featureFlag15, featureFlag16, featureFlag17, featureFlag18, featureFlag19, featureFlag20, featureFlag21, featureFlag22, featureFlag23, featureFlag24, featureFlag25, featureFlag26, featureFlag27, featureFlag28, featureFlag29, featureFlag30, featureFlag31, featureFlag32};
        $VALUES = featureFlagArr;
        $ENTRIES = a.a(featureFlagArr);
    }

    public FeatureFlag(boolean z, int i, String str, String str2, boolean z2) {
        this.flagName = str2;
        this.defaultValue = z;
        this.isSavable = z2;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static FeatureFlag valueOf(String str) {
        return (FeatureFlag) Enum.valueOf(FeatureFlag.class, str);
    }

    public static FeatureFlag[] values() {
        return (FeatureFlag[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final boolean getDefaultValue() {
        return this.defaultValue;
    }

    /* renamed from: c, reason: from getter */
    public final String getFlagName() {
        return this.flagName;
    }

    /* renamed from: f, reason: from getter */
    public final boolean getIsSavable() {
        return this.isSavable;
    }
}
