package defpackage;

import com.yandex.delivery.mapper.model.Font;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class jry0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Font.values().length];
        try {
            iArr[Font.BOLD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Font.BOLD_ITALIC.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Font.MEDIUM.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Font.MEDIUM_ITALIC.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Font.REGULAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[Font.REGULAR_ITALIC.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[Font.LIGHT.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[Font.LIGHT_ITALIC.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[Font.LOGOTYPE_REGULAR.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[Font.HEADER.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[Font.HEADER_ITALIC.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        a = iArr;
    }
}
