package com.yandex.payment.sdk.model.data;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/payment/sdk/model/data/PersonalInfoMode;", "", "SHOW", "SHOW_IF_NOT_AUTHORIZED", "SHOW_IF_HAS_NO_EMAIL", "HIDE", "paymentsdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PersonalInfoMode {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PersonalInfoMode[] $VALUES;
    public static final PersonalInfoMode HIDE;
    public static final PersonalInfoMode SHOW;
    public static final PersonalInfoMode SHOW_IF_HAS_NO_EMAIL;
    public static final PersonalInfoMode SHOW_IF_NOT_AUTHORIZED;

    static {
        PersonalInfoMode personalInfoMode = new PersonalInfoMode("SHOW", 0);
        SHOW = personalInfoMode;
        PersonalInfoMode personalInfoMode2 = new PersonalInfoMode("SHOW_IF_NOT_AUTHORIZED", 1);
        SHOW_IF_NOT_AUTHORIZED = personalInfoMode2;
        PersonalInfoMode personalInfoMode3 = new PersonalInfoMode("SHOW_IF_HAS_NO_EMAIL", 2);
        SHOW_IF_HAS_NO_EMAIL = personalInfoMode3;
        PersonalInfoMode personalInfoMode4 = new PersonalInfoMode("HIDE", 3);
        HIDE = personalInfoMode4;
        PersonalInfoMode[] personalInfoModeArr = {personalInfoMode, personalInfoMode2, personalInfoMode3, personalInfoMode4};
        $VALUES = personalInfoModeArr;
        $ENTRIES = a.a(personalInfoModeArr);
    }

    public static PersonalInfoMode valueOf(String str) {
        return (PersonalInfoMode) Enum.valueOf(PersonalInfoMode.class, str);
    }

    public static PersonalInfoMode[] values() {
        return (PersonalInfoMode[]) $VALUES.clone();
    }
}
