package defpackage;

import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuActionDialogOpenReason;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class fzn0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScootersMosRuActionDialogOpenReason.values().length];
        try {
            iArr[ScootersMosRuActionDialogOpenReason.DISCOVERY_SCREEN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersMosRuActionDialogOpenReason.OFFER_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersMosRuActionDialogOpenReason.FINISH_SCREEN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersMosRuActionDialogOpenReason.DISCOVERY_SHORTCUT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ScootersMosRuActionDialogOpenReason.MOS_RU_STATE_BAR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
