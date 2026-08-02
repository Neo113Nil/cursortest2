package defpackage;

import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName;
import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason;
import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus;
import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason;
import com.yandex.go.scooters.mosru.api.analytics.ScootersMosRuAnalyticsFromScreen;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class bzn0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;
    public static final /* synthetic */ int[] e;

    static {
        int[] iArr = new int[ScootersMosRuAnalyticsFromScreen.values().length];
        try {
            iArr[ScootersMosRuAnalyticsFromScreen.FINISH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScootersMosRuAnalyticsFromScreen.DISCOVERY.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ScootersMosRuAnalyticsFromScreen.OFFER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ScootersMosRuAnalyticsFromScreen.ACTIVE_RIDE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        a = iArr;
        int[] iArr2 = new int[ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason.values().length];
        try {
            iArr2[ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason.DEFAULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason.STATE_BAR.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[ScootersMosRuAnalyticsEvent$ModalOpened$OpenReason.SHORTCUT.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        b = iArr2;
        int[] iArr3 = new int[ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName.values().length];
        try {
            iArr3[ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName.AUTHORIZE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[ScootersMosRuAnalyticsEvent$ModalContentClicked$ButtonName.CLOSE.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
        int[] iArr4 = new int[ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus.values().length];
        try {
            iArr4[ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus.SUCCESS.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus.FAILURE.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[ScootersMosRuAnalyticsEvent$WebViewClosed$AuthStatus.CANCELED.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        d = iArr4;
        int[] iArr5 = new int[ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason.values().length];
        try {
            iArr5[ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason.DEEPLINK.ordinal()] = 1;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr5[ScootersMosRuAnalyticsEvent$WebViewOpened$OpenReason.MODAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused14) {
        }
        e = iArr5;
    }
}
