package defpackage;

import com.yandex.payment.sdk.flex.api.models.FlexAction;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class l00 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[FlexAction.values().length];
        try {
            iArr[FlexAction.OPEN_WEB.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[FlexAction.SHOW_NATIVE_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[FlexAction.SEND_EXTERNAL_EVENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[FlexAction.DELAY.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[FlexAction.SEND_ANALYTICS_EVENT.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[FlexAction.TRANSPORT_READ_CARD.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[FlexAction.TRANSPORT_FINISH_NFC.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[FlexAction.TRANSPORT_READ_BLOCKS.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[FlexAction.TRANSPORT_WRITE_BLOCKS.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[FlexAction.FINISH_FLOW.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[FlexAction.FT_REQUEST_ACTION.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        a = iArr;
    }
}
