package defpackage;

import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuActionDialogOpenReason;
import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuWebViewOpenReason;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class azn0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ScootersMosRuActionDialogOpenReason.values().length];
        try {
            iArr[ScootersMosRuActionDialogOpenReason.MOS_RU_STATE_BAR.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersMosRuActionDialogOpenReason.DISCOVERY_SCREEN.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersMosRuActionDialogOpenReason.DISCOVERY_SHORTCUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersMosRuActionDialogOpenReason.OFFER_SCREEN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ScootersMosRuActionDialogOpenReason.FINISH_SCREEN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
        int[] iArr2 = new int[ScootersMosRuWebViewOpenReason.values().length];
        try {
            iArr2[ScootersMosRuWebViewOpenReason.DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
    }
}
