package defpackage;

import com.ybsdk.feature.settings.api.data.SettingPropertyDto;
import com.ybsdk.feature.settings.api.domain.SettingsItemEntity$Type;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class h9r0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SettingsItemEntity$Type.values().length];
        try {
            iArr[SettingsItemEntity$Type.SWITCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SettingsItemEntity$Type.GOTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SettingsItemEntity$Type.EDIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[SettingsItemEntity$Type.SOON.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[SettingsItemEntity$Type.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[SettingsItemEntity$Type.THEME.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[SettingsItemEntity$Type.APP_ICON.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
        int[] iArr2 = new int[SettingPropertyDto.Type.values().length];
        try {
            iArr2[SettingPropertyDto.Type.SWITCH.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[SettingPropertyDto.Type.GOTO.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[SettingPropertyDto.Type.EDIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[SettingPropertyDto.Type.SOON.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[SettingPropertyDto.Type.NONE.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[SettingPropertyDto.Type.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        b = iArr2;
    }
}
