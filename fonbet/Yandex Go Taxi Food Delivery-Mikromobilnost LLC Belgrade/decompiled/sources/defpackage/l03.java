package defpackage;

import com.ybsdk.core.utils.dto.common.ApplicationType;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class l03 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ApplicationType.values().length];
        try {
            iArr[ApplicationType.UNKNOWN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ApplicationType.PRODUCT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ApplicationType.REGISTRATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ApplicationType.SIMPLIFIED_IDENTIFICATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ApplicationType.DIGITAL_CARD_ISSUE.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ApplicationType.CHANGE_PHONE.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
