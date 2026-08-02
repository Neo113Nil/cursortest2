package defpackage;

import com.yandex.go.clarify_address.before_order.ClarifyAddressBeforeOrderOrigin;

/* loaded from: classes.dex */
public abstract /* synthetic */ class lxb {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ClarifyAddressBeforeOrderOrigin.values().length];
        try {
            iArr[ClarifyAddressBeforeOrderOrigin.EXPECTED_DESTINATION_SHORTCUT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClarifyAddressBeforeOrderOrigin.SUPERAPP_SHORTCUT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClarifyAddressBeforeOrderOrigin.TAXI_NEXT_CHEVRON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ClarifyAddressBeforeOrderOrigin.DESTINATION_ON_MAP.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ClarifyAddressBeforeOrderOrigin.DESTINATION_ADDRESS_WHERE_TO.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ClarifyAddressBeforeOrderOrigin.DESTINATION_ADDRESS_SUGGEST.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
