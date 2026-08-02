package defpackage;

import com.yandex.go.safety.center.SafetyCenterParams$Source;
import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.experiment.SafetyCenterExperiment;

/* loaded from: classes13.dex */
public abstract /* synthetic */ class irl0 {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;
    public static final /* synthetic */ int[] c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[ShareRequestParam.NotificationType.values().length];
        try {
            iArr[ShareRequestParam.NotificationType.CONTACT_REQUEST.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ShareRequestParam.NotificationType.SHARE_LOCATION.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[SafetyCenterExperiment.Action.values().length];
        try {
            iArr2[SafetyCenterExperiment.Action.CALL_EMERGENCY.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[SafetyCenterExperiment.Action.CALL_DRIVER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[SafetyCenterExperiment.Action.CONTACT_SUPPORT.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[SafetyCenterExperiment.Action.CALL_ANY_NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused6) {
        }
        b = iArr2;
        int[] iArr3 = new int[SafetyCenterExperiment.ButtonStyle.values().length];
        try {
            iArr3[SafetyCenterExperiment.ButtonStyle.RED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[SafetyCenterExperiment.ButtonStyle.YELLOW.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[SafetyCenterExperiment.ButtonStyle.GRAY.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        c = iArr3;
        int[] iArr4 = new int[SafetyCenterParams$Source.values().length];
        try {
            iArr4[SafetyCenterParams$Source.MENU.ordinal()] = 1;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[SafetyCenterParams$Source.ORDER_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[SafetyCenterParams$Source.SAFETY_CENTER_DEEPLINK.ordinal()] = 3;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[SafetyCenterParams$Source.ACCIDENT_DEEPLINK.ordinal()] = 4;
        } catch (NoSuchFieldError unused13) {
        }
        d = iArr4;
    }
}
