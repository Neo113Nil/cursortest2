package defpackage;

import com.yandex.go.zone.dto.objects.VerticalType;

/* loaded from: classes6.dex */
public abstract /* synthetic */ class ik20 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[VerticalType.values().length];
        try {
            iArr[VerticalType.SINGLE_TARIFF.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[VerticalType.GROUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[VerticalType.TRANSPORT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[VerticalType.NAVIGATOR.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[VerticalType.DRIVE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[VerticalType.MIXED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[VerticalType.NONE.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        a = iArr;
    }
}
