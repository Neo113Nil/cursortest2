package defpackage;

import com.yandex.plus.core.graphql.type.COMPOSITE_OFFER_STRUCTURE_TYPE;
import com.yandex.plus.core.graphql.type.OFFER_VENDOR_TYPE;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class oqd {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[COMPOSITE_OFFER_STRUCTURE_TYPE.values().length];
        try {
            iArr[COMPOSITE_OFFER_STRUCTURE_TYPE.COMPOSITE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[COMPOSITE_OFFER_STRUCTURE_TYPE.OPTION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[COMPOSITE_OFFER_STRUCTURE_TYPE.TARIFF.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[COMPOSITE_OFFER_STRUCTURE_TYPE.UNKNOWN__.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[OFFER_VENDOR_TYPE.values().length];
        try {
            iArr2[OFFER_VENDOR_TYPE.APP_STORE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[OFFER_VENDOR_TYPE.GOOGLE_PLAY.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[OFFER_VENDOR_TYPE.MICROSOFT_STORE.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[OFFER_VENDOR_TYPE.NATIVE_YANDEX.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[OFFER_VENDOR_TYPE.PARTNER.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[OFFER_VENDOR_TYPE.UNKNOWN.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[OFFER_VENDOR_TYPE.UNKNOWN__.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        b = iArr2;
    }
}
