package defpackage;

import com.ybsdk.api.entities.YBSdkSettingsTheme;
import com.ybsdk.api.entities.YBSdkTheme;
import com.ybsdk.core.design.theme.ThemeType;
import com.ybsdk.feature.settings.api.SettingsTheme;

/* loaded from: classes8.dex */
public abstract /* synthetic */ class ci51 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[YBSdkTheme.values().length];
        try {
            iArr[YBSdkTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YBSdkTheme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ThemeType.values().length];
        try {
            iArr2[ThemeType.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ThemeType.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[SettingsTheme.values().length];
        try {
            iArr3[SettingsTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[SettingsTheme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[SettingsTheme.SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        c = iArr3;
        int[] iArr4 = new int[YBSdkSettingsTheme.values().length];
        try {
            iArr4[YBSdkSettingsTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[YBSdkSettingsTheme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[YBSdkSettingsTheme.SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        d = iArr4;
    }
}
