package defpackage;

import com.ybsdk.core.common.domain.entities.BottomBarItemId;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class mb6 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BottomBarItemId.values().length];
        try {
            iArr[BottomBarItemId.PAY.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BottomBarItemId.HOME.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BottomBarItemId.HISTORY.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[BottomBarItemId.MERCHANTS.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[BottomBarItemId.SHOWCASE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[BottomBarItemId.SUPPORT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
