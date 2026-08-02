package defpackage;

import com.yandex.go.design.compose.badge.BadgeSize;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class n6d0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[BadgeSize.values().length];
        try {
            iArr[BadgeSize.L.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[BadgeSize.M.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[BadgeSize.S.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
