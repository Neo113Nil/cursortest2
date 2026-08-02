package defpackage;

import com.ybsdk.feature.transfer.version2.api.TransferDirection;
import com.ybsdk.feature.transfer.version2.internal.entities.ControlState;
import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.TransferMainAnalyticsInteractor$Companion$LogType;
import com.ybsdk.feature.transfer.version2.internal.screens.main.domain.entities.SuggestEntity$BehaviourEntity;
import com.ybsdk.widgets.common.SuggestView$State$Behaviour;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class mj01 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[ControlState.values().length];
        try {
            iArr[ControlState.ON.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ControlState.OFF.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[TransferDirection.values().length];
        try {
            iArr2[TransferDirection.TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[TransferDirection.TOPUP.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        b = iArr2;
        int[] iArr3 = new int[TransferMainAnalyticsInteractor$Companion$LogType.values().length];
        try {
            iArr3[TransferMainAnalyticsInteractor$Companion$LogType.TRANSFER.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr3[TransferMainAnalyticsInteractor$Companion$LogType.MOBILE_PAYMENT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[TransferMainAnalyticsInteractor$Companion$LogType.INTERNET_PAYMENT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[TransferMainAnalyticsInteractor$Companion$LogType.C2G.ordinal()] = 4;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[TransferMainAnalyticsInteractor$Companion$LogType.TEMPLATE.ordinal()] = 5;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
        int[] iArr4 = new int[SuggestEntity$BehaviourEntity.values().length];
        try {
            iArr4[SuggestEntity$BehaviourEntity.PLUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[SuggestEntity$BehaviourEntity.REPLACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        d = iArr4;
        int[] iArr5 = new int[SuggestView$State$Behaviour.values().length];
        try {
            iArr5[SuggestView$State$Behaviour.PLUS.ordinal()] = 1;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr5[SuggestView$State$Behaviour.REPLACE.ordinal()] = 2;
        } catch (NoSuchFieldError unused13) {
        }
        e = iArr5;
    }
}
