package defpackage;

import com.ybsdk.api.entities.YBSdkSettingsTheme;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class bi51 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[YBSdkSettingsTheme.values().length];
        try {
            iArr[YBSdkSettingsTheme.LIGHT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[YBSdkSettingsTheme.DARK.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[YBSdkSettingsTheme.SYSTEM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
