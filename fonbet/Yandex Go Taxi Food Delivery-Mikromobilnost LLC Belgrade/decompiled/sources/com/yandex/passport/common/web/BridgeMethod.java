package com.yandex.passport.common.web;

import defpackage.k4o;
import kotlin.Metadata;
import ru.yandex.video.m3.player.ugc_live.UgcLiveVideoData;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b*\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u0006,"}, d2 = {"Lcom/yandex/passport/common/web/BridgeMethod;", "", "", "methodName", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "Stub", "Ready", "GetSms", "DebugOnlyGetVerificationHashForSms", "RequestLoginCredentials", "SaveLoginCredentials", "SocialAuth", "SamlSsoAuth", "RequestMagicLinkParams", "GetPhoneRegionCode", "RequestSavedExperiments", "SendMetrics", "ShowDebugInfo", "RequestPhoneNumberHint", "StorePhoneNumber", "GetCustomEulaStrings", "SetPopupSize", "Close", "ChooseAccount", "BeginChangePasswordFlow", "PrimaryActionTriggered", "GetXTokenClientId", "GetOtp", "FinishWithUrl", "FinishWithItem", "DeletedAccountAuth", "OpenExternalUrl", "WebAuthNAuth", "WebAuthNRegister", "WebAuthNAvailability", "DeviceUnbinded", "ItemClickCommand", "PerformVibration", "GetEbsAgeConfirmState", "SetEbsAgeConfirmState", "CreateNewProfile", "SocialAction", "passport-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class BridgeMethod {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ BridgeMethod[] $VALUES;
    public static final BridgeMethod BeginChangePasswordFlow;
    public static final BridgeMethod ChooseAccount;
    public static final BridgeMethod Close;
    public static final BridgeMethod CreateNewProfile;
    public static final BridgeMethod DebugOnlyGetVerificationHashForSms;
    public static final BridgeMethod DeletedAccountAuth;
    public static final BridgeMethod DeviceUnbinded;
    public static final BridgeMethod FinishWithItem;
    public static final BridgeMethod FinishWithUrl;
    public static final BridgeMethod GetCustomEulaStrings;
    public static final BridgeMethod GetEbsAgeConfirmState;
    public static final BridgeMethod GetOtp;
    public static final BridgeMethod GetPhoneRegionCode;
    public static final BridgeMethod GetSms;
    public static final BridgeMethod GetXTokenClientId;
    public static final BridgeMethod ItemClickCommand;
    public static final BridgeMethod OpenExternalUrl;
    public static final BridgeMethod PerformVibration;
    public static final BridgeMethod PrimaryActionTriggered;
    public static final BridgeMethod Ready;
    public static final BridgeMethod RequestLoginCredentials;
    public static final BridgeMethod RequestMagicLinkParams;
    public static final BridgeMethod RequestPhoneNumberHint;
    public static final BridgeMethod RequestSavedExperiments;
    public static final BridgeMethod SamlSsoAuth;
    public static final BridgeMethod SaveLoginCredentials;
    public static final BridgeMethod SendMetrics;
    public static final BridgeMethod SetEbsAgeConfirmState;
    public static final BridgeMethod SetPopupSize;
    public static final BridgeMethod ShowDebugInfo;
    public static final BridgeMethod SocialAction;
    public static final BridgeMethod SocialAuth;
    public static final BridgeMethod StorePhoneNumber;
    public static final BridgeMethod Stub;
    public static final BridgeMethod WebAuthNAuth;
    public static final BridgeMethod WebAuthNAvailability;
    public static final BridgeMethod WebAuthNRegister;
    private final String methodName;

    static {
        BridgeMethod bridgeMethod = new BridgeMethod("Stub", 0, "");
        Stub = bridgeMethod;
        BridgeMethod bridgeMethod2 = new BridgeMethod("Ready", 1, UgcLiveVideoData.UgcLiveStatus.READY);
        Ready = bridgeMethod2;
        BridgeMethod bridgeMethod3 = new BridgeMethod("GetSms", 2, "getSms");
        GetSms = bridgeMethod3;
        BridgeMethod bridgeMethod4 = new BridgeMethod("DebugOnlyGetVerificationHashForSms", 3, "debugOnly_getAppVerificationHashForSms");
        DebugOnlyGetVerificationHashForSms = bridgeMethod4;
        BridgeMethod bridgeMethod5 = new BridgeMethod("RequestLoginCredentials", 4, "requestLoginCredentials");
        RequestLoginCredentials = bridgeMethod5;
        BridgeMethod bridgeMethod6 = new BridgeMethod("SaveLoginCredentials", 5, "saveLoginCredentials");
        SaveLoginCredentials = bridgeMethod6;
        BridgeMethod bridgeMethod7 = new BridgeMethod("SocialAuth", 6, "socialAuth");
        SocialAuth = bridgeMethod7;
        BridgeMethod bridgeMethod8 = new BridgeMethod("SamlSsoAuth", 7, "samlSsoAuth");
        SamlSsoAuth = bridgeMethod8;
        BridgeMethod bridgeMethod9 = new BridgeMethod("RequestMagicLinkParams", 8, "requestMagicLinkParams");
        RequestMagicLinkParams = bridgeMethod9;
        BridgeMethod bridgeMethod10 = new BridgeMethod("GetPhoneRegionCode", 9, "getPhoneRegionCode");
        GetPhoneRegionCode = bridgeMethod10;
        BridgeMethod bridgeMethod11 = new BridgeMethod("RequestSavedExperiments", 10, "requestSavedExperiments");
        RequestSavedExperiments = bridgeMethod11;
        BridgeMethod bridgeMethod12 = new BridgeMethod("SendMetrics", 11, "sendMetrics");
        SendMetrics = bridgeMethod12;
        BridgeMethod bridgeMethod13 = new BridgeMethod("ShowDebugInfo", 12, "showDebugInfo");
        ShowDebugInfo = bridgeMethod13;
        BridgeMethod bridgeMethod14 = new BridgeMethod("RequestPhoneNumberHint", 13, "requestPhoneNumberHint");
        RequestPhoneNumberHint = bridgeMethod14;
        BridgeMethod bridgeMethod15 = new BridgeMethod("StorePhoneNumber", 14, "storePhoneNumber");
        StorePhoneNumber = bridgeMethod15;
        BridgeMethod bridgeMethod16 = new BridgeMethod("GetCustomEulaStrings", 15, "getCustomEulaStrings");
        GetCustomEulaStrings = bridgeMethod16;
        BridgeMethod bridgeMethod17 = new BridgeMethod("SetPopupSize", 16, "setPopupSize");
        SetPopupSize = bridgeMethod17;
        BridgeMethod bridgeMethod18 = new BridgeMethod("Close", 17, "close");
        Close = bridgeMethod18;
        BridgeMethod bridgeMethod19 = new BridgeMethod("ChooseAccount", 18, "chooseAccount");
        ChooseAccount = bridgeMethod19;
        BridgeMethod bridgeMethod20 = new BridgeMethod("BeginChangePasswordFlow", 19, "beginChangePasswordFlow");
        BeginChangePasswordFlow = bridgeMethod20;
        BridgeMethod bridgeMethod21 = new BridgeMethod("PrimaryActionTriggered", 20, "primaryActionTriggered");
        PrimaryActionTriggered = bridgeMethod21;
        BridgeMethod bridgeMethod22 = new BridgeMethod("GetXTokenClientId", 21, "getXTokenClientId");
        GetXTokenClientId = bridgeMethod22;
        BridgeMethod bridgeMethod23 = new BridgeMethod("GetOtp", 22, "getOtp");
        GetOtp = bridgeMethod23;
        BridgeMethod bridgeMethod24 = new BridgeMethod("FinishWithUrl", 23, "finishWithUrlOpeningByHost");
        FinishWithUrl = bridgeMethod24;
        BridgeMethod bridgeMethod25 = new BridgeMethod("FinishWithItem", 24, "finishWithItemClickHandler");
        FinishWithItem = bridgeMethod25;
        BridgeMethod bridgeMethod26 = new BridgeMethod("DeletedAccountAuth", 25, "deletedAccountAuth");
        DeletedAccountAuth = bridgeMethod26;
        BridgeMethod bridgeMethod27 = new BridgeMethod("OpenExternalUrl", 26, "openExternalUrl");
        OpenExternalUrl = bridgeMethod27;
        BridgeMethod bridgeMethod28 = new BridgeMethod("WebAuthNAuth", 27, "webauthnAuth");
        WebAuthNAuth = bridgeMethod28;
        BridgeMethod bridgeMethod29 = new BridgeMethod("WebAuthNRegister", 28, "webauthnReg");
        WebAuthNRegister = bridgeMethod29;
        BridgeMethod bridgeMethod30 = new BridgeMethod("WebAuthNAvailability", 29, "getWebAuthNAvailability");
        WebAuthNAvailability = bridgeMethod30;
        BridgeMethod bridgeMethod31 = new BridgeMethod("DeviceUnbinded", 30, "deviceUnbinded");
        DeviceUnbinded = bridgeMethod31;
        BridgeMethod bridgeMethod32 = new BridgeMethod("ItemClickCommand", 31, "itemClickHandler");
        ItemClickCommand = bridgeMethod32;
        BridgeMethod bridgeMethod33 = new BridgeMethod("PerformVibration", 32, "performVibration");
        PerformVibration = bridgeMethod33;
        BridgeMethod bridgeMethod34 = new BridgeMethod("GetEbsAgeConfirmState", 33, "getEbsAgeConfirmState");
        GetEbsAgeConfirmState = bridgeMethod34;
        BridgeMethod bridgeMethod35 = new BridgeMethod("SetEbsAgeConfirmState", 34, "setEbsAgeConfirmState");
        SetEbsAgeConfirmState = bridgeMethod35;
        BridgeMethod bridgeMethod36 = new BridgeMethod("CreateNewProfile", 35, "createNewProfile");
        CreateNewProfile = bridgeMethod36;
        BridgeMethod bridgeMethod37 = new BridgeMethod("SocialAction", 36, "socialAction");
        SocialAction = bridgeMethod37;
        BridgeMethod[] bridgeMethodArr = {bridgeMethod, bridgeMethod2, bridgeMethod3, bridgeMethod4, bridgeMethod5, bridgeMethod6, bridgeMethod7, bridgeMethod8, bridgeMethod9, bridgeMethod10, bridgeMethod11, bridgeMethod12, bridgeMethod13, bridgeMethod14, bridgeMethod15, bridgeMethod16, bridgeMethod17, bridgeMethod18, bridgeMethod19, bridgeMethod20, bridgeMethod21, bridgeMethod22, bridgeMethod23, bridgeMethod24, bridgeMethod25, bridgeMethod26, bridgeMethod27, bridgeMethod28, bridgeMethod29, bridgeMethod30, bridgeMethod31, bridgeMethod32, bridgeMethod33, bridgeMethod34, bridgeMethod35, bridgeMethod36, bridgeMethod37};
        $VALUES = bridgeMethodArr;
        $ENTRIES = kotlin.enums.a.a(bridgeMethodArr);
    }

    public BridgeMethod(String str, int i, String str2) {
        this.methodName = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static BridgeMethod valueOf(String str) {
        return (BridgeMethod) Enum.valueOf(BridgeMethod.class, str);
    }

    public static BridgeMethod[] values() {
        return (BridgeMethod[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getMethodName() {
        return this.methodName;
    }
}
