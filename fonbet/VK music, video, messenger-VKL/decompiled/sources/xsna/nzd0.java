package xsna;

import com.vk.dto.ProfileEditPage;
import com.vk.profile.user.impl.domain.edit.models.ProfileSettingType;

/* compiled from: ProfileSettingsRouter.kt */
/* loaded from: classes5.dex */
public final /* synthetic */ class nzd0 {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

    static {
        int[] iArr = new int[ProfileEditPage.PersonalAccount.Tab.values().length];
        try {
            iArr[ProfileEditPage.PersonalAccount.Tab.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ProfileEditPage.PersonalAccount.Tab.SECURITY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        $EnumSwitchMapping$0 = iArr;
        int[] iArr2 = new int[ProfileSettingType.values().length];
        try {
            iArr2[ProfileSettingType.PersonalAccount.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ProfileSettingType.Security.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ProfileSettingType.Profile.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ProfileSettingType.Contacts.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ProfileSettingType.Interests.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[ProfileSettingType.Education.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[ProfileSettingType.Career.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[ProfileSettingType.Military.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[ProfileSettingType.Personal.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        $EnumSwitchMapping$1 = iArr2;
    }
}
