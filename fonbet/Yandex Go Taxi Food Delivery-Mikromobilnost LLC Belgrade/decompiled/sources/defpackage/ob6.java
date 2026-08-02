package defpackage;

import com.ybsdk.core.common.domain.entities.BottomBarIcon;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ob6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BottomBarIcon.values().length];
        try {
            iArr[BottomBarIcon.HOME.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BottomBarIcon.PAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BottomBarIcon.MERCHANTS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BottomBarIcon.HISTORY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BottomBarIcon.SHOWCASE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BottomBarIcon.SUPPORT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
