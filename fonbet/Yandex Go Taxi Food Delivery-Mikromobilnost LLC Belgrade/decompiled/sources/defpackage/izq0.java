package defpackage;

import com.ybsdk.common.entities.SessionEntity$ActionReason;
import com.ybsdk.rconfig.configs.PushSubscribeAction;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class izq0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[SessionEntity$ActionReason.values().length];
        try {
            iArr[SessionEntity$ActionReason.PIN_TOKEN_REISSUE_TOO_MANY_FAILED_ATTEMPTS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SessionEntity$ActionReason.PIN_TOKEN_REISSUE_REGISTRATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[PushSubscribeAction.values().length];
        try {
            iArr2[PushSubscribeAction.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[PushSubscribeAction.AUTHORIZATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[PushSubscribeAction.PASSPORT_REGISTRATION.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[PushSubscribeAction.BANK_REGISTRATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[PushSubscribeAction.APPLICATION_STATUS_CHECK.ordinal()] = 5;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[PushSubscribeAction.SUPPORT.ordinal()] = 6;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[PushSubscribeAction.AM_TOKEN_UPDATE.ordinal()] = 7;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[PushSubscribeAction.APP_UPDATE.ordinal()] = 8;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[PushSubscribeAction.PIN_TOKEN_CLEAR.ordinal()] = 9;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[PushSubscribeAction.PIN_TOKEN_REISSUE.ordinal()] = 10;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[PushSubscribeAction.PIN_TOKEN_RETRY.ordinal()] = 11;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[PushSubscribeAction.OPEN_PRODUCT.ordinal()] = 12;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[PushSubscribeAction.OPEN_DEEPLINK.ordinal()] = 13;
        } catch (NoSuchFieldError unused15) {
        }
        b = iArr2;
    }
}
