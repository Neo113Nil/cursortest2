package defpackage;

import com.yandex.go.chargers.api.ChargersOpenReason;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class pw9 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ChargersOpenReason.values().length];
        try {
            iArr[ChargersOpenReason.DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChargersOpenReason.SHORTCUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ChargersOpenReason.DETAILED_ORDER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ChargersOpenReason.MONOAPP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ChargersOpenReason.SUPER_MAP.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ChargersOpenReason.DISCOUNTS_FROM_FEEDBACK.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[ChargersOpenReason.SHOW_FEEDBACK.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
