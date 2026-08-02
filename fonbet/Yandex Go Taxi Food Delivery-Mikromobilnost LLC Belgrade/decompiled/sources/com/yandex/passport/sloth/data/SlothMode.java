package com.yandex.passport.sloth.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/yandex/passport/sloth/data/SlothMode;", "", "", "value", "Ljava/lang/String;", "Login", "Registration", "PhoneConfirm", "Turbo", "Phonish", "Relogin", "Upgrade", "Bear", "AuthQr", "WebUrlPush", "AuthSdk", "AuthQrWithoutQr", "AuthQrWithoutQrSlider", "UserMenu", "AccountDeleteForever", "PayUrl", "ManagingPlusDevices", "SwitchMasterMember", "BiometricVerification", "RegisterWebAuthN", "passport-sloth_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SlothMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ SlothMode[] $VALUES;
    public static final SlothMode AccountDeleteForever;
    public static final SlothMode AuthQr;
    public static final SlothMode AuthQrWithoutQr;
    public static final SlothMode AuthQrWithoutQrSlider;
    public static final SlothMode AuthSdk;
    public static final SlothMode Bear;
    public static final SlothMode BiometricVerification;
    public static final SlothMode Login;
    public static final SlothMode ManagingPlusDevices;
    public static final SlothMode PayUrl;
    public static final SlothMode PhoneConfirm;
    public static final SlothMode Phonish;
    public static final SlothMode RegisterWebAuthN;
    public static final SlothMode Registration;
    public static final SlothMode Relogin;
    public static final SlothMode SwitchMasterMember;
    public static final SlothMode Turbo;
    public static final SlothMode Upgrade;
    public static final SlothMode UserMenu;
    public static final SlothMode WebUrlPush;
    private final String value;

    static {
        SlothMode slothMode = new SlothMode("Login", 0, "welcome");
        Login = slothMode;
        SlothMode slothMode2 = new SlothMode("Registration", 1, "registration");
        Registration = slothMode2;
        SlothMode slothMode3 = new SlothMode("PhoneConfirm", 2, "phoneconfirm");
        PhoneConfirm = slothMode3;
        SlothMode slothMode4 = new SlothMode("Turbo", 3, "turbo");
        Turbo = slothMode4;
        SlothMode slothMode5 = new SlothMode("Phonish", 4, "phonish");
        Phonish = slothMode5;
        SlothMode slothMode6 = new SlothMode("Relogin", 5, "relogin");
        Relogin = slothMode6;
        SlothMode slothMode7 = new SlothMode("Upgrade", 6, "upgrade");
        Upgrade = slothMode7;
        SlothMode slothMode8 = new SlothMode("Bear", 7, "childishRestrict");
        Bear = slothMode8;
        SlothMode slothMode9 = new SlothMode("AuthQr", 8, "authQr");
        AuthQr = slothMode9;
        SlothMode slothMode10 = new SlothMode("WebUrlPush", 9, "webUrlPush");
        WebUrlPush = slothMode10;
        SlothMode slothMode11 = new SlothMode("AuthSdk", 10, "auth_sdk");
        AuthSdk = slothMode11;
        SlothMode slothMode12 = new SlothMode("AuthQrWithoutQr", 11, "authQrWithoutQr");
        AuthQrWithoutQr = slothMode12;
        SlothMode slothMode13 = new SlothMode("AuthQrWithoutQrSlider", 12, "authQrWithoutQrSlider");
        AuthQrWithoutQrSlider = slothMode13;
        SlothMode slothMode14 = new SlothMode("UserMenu", 13, "userMenu");
        UserMenu = slothMode14;
        SlothMode slothMode15 = new SlothMode("AccountDeleteForever", 14, "accountDeleteForever");
        AccountDeleteForever = slothMode15;
        SlothMode slothMode16 = new SlothMode("PayUrl", 15, "payUrl");
        PayUrl = slothMode16;
        SlothMode slothMode17 = new SlothMode("ManagingPlusDevices", 16, "managingPlusDevices");
        ManagingPlusDevices = slothMode17;
        SlothMode slothMode18 = new SlothMode("SwitchMasterMember", 17, "switchMasterMember");
        SwitchMasterMember = slothMode18;
        SlothMode slothMode19 = new SlothMode("BiometricVerification", 18, "biometricVerification");
        BiometricVerification = slothMode19;
        SlothMode slothMode20 = new SlothMode("RegisterWebAuthN", 19, "registerWebAuthN");
        RegisterWebAuthN = slothMode20;
        SlothMode[] slothModeArr = {slothMode, slothMode2, slothMode3, slothMode4, slothMode5, slothMode6, slothMode7, slothMode8, slothMode9, slothMode10, slothMode11, slothMode12, slothMode13, slothMode14, slothMode15, slothMode16, slothMode17, slothMode18, slothMode19, slothMode20};
        $VALUES = slothModeArr;
        $ENTRIES = kotlin.enums.a.a(slothModeArr);
    }

    public SlothMode(String str, int i, String str2) {
        this.value = str2;
    }

    public static SlothMode valueOf(String str) {
        return (SlothMode) Enum.valueOf(SlothMode.class, str);
    }

    public static SlothMode[] values() {
        return (SlothMode[]) $VALUES.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.value;
    }
}
