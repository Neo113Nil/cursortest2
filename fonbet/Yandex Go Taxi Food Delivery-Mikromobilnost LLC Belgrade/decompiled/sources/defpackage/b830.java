package defpackage;

import com.yandex.go.morphlex.data.dto.MorphlexScreenInstructionType;
import com.yandex.go.morphlex.data.dto.MorphlexScreenPresentType;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class b830 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[MorphlexScreenPresentType.values().length];
        try {
            iArr[MorphlexScreenPresentType.FULLSCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[MorphlexScreenPresentType.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[MorphlexScreenPresentType.POPUP.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[MorphlexScreenPresentType.UNSUPPORTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[MorphlexScreenInstructionType.values().length];
        try {
            iArr2[MorphlexScreenInstructionType.AUTH.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[MorphlexScreenInstructionType.GEO.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[MorphlexScreenInstructionType.POINT_A.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[MorphlexScreenInstructionType.ORDERS.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[MorphlexScreenInstructionType.SYSTEM_SOUND_IS_MUTED.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[MorphlexScreenInstructionType.PAYMENT_METHOD.ordinal()] = 6;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[MorphlexScreenInstructionType.TARIFF_CLASS.ordinal()] = 7;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[MorphlexScreenInstructionType.PREORDER_DUE.ordinal()] = 8;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[MorphlexScreenInstructionType.ADDITIONAL_PREORDER_INFO.ordinal()] = 9;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[MorphlexScreenInstructionType.TARIFF_REQUIREMENTS.ordinal()] = 10;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[MorphlexScreenInstructionType.ORDER_COMMENT.ordinal()] = 11;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[MorphlexScreenInstructionType.ROUTE.ordinal()] = 12;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[MorphlexScreenInstructionType.UNSUPPORTED.ordinal()] = 13;
        } catch (NoSuchFieldError unused17) {
        }
        b = iArr2;
    }
}
