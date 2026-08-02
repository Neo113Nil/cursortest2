package defpackage;

import com.ybsdk.feature.passport.api.adapter.PassportStashCell;
import com.ybsdk.feature.passport.api.adapter.PassportTheme;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class fn90 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[PassportTheme.values().length];
        try {
            iArr[PassportTheme.DARK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[PassportTheme.LIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[PassportTheme.LIGHT_CUSTOM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[PassportTheme.FOLLOW_SYSTEM.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        int[] iArr2 = new int[PassportStashCell.values().length];
        try {
            iArr2[PassportStashCell.PIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PassportStashCell.PIN_2.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr2;
    }
}
