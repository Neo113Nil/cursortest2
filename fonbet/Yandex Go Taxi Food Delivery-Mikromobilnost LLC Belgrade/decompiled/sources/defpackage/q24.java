package defpackage;

import com.ybsdk.feature.autotopup.api.domain.model.SettingStatus;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class q24 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SettingStatus.values().length];
        try {
            iArr[SettingStatus.ENABLED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SettingStatus.DISABLED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
