package defpackage;

import com.ybsdk.feature.card.api.entities.YbCardStatusEntity;
import com.ybsdk.feature.card.internal.samsungpay.SamsungPayState;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class je8 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;

    static {
        int[] iArr = new int[SamsungPayState.AddCardResult.values().length];
        try {
            iArr[SamsungPayState.AddCardResult.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SamsungPayState.AddCardResult.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SamsungPayState.AddCardResult.CANCEL.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
        int[] iArr2 = new int[SamsungPayState.InitializationResult.values().length];
        try {
            iArr2[SamsungPayState.InitializationResult.READY.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SamsungPayState.InitializationResult.NEED_ACTIVATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SamsungPayState.InitializationResult.NEED_UPDATE.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[SamsungPayState.InitializationResult.NOT_SUPPORTED.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[YbCardStatusEntity.values().length];
        try {
            iArr3[YbCardStatusEntity.FROZEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        c = iArr3;
    }
}
